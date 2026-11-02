package org.conscrypt;

import defpackage.u52;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class ActiveSession implements ConscryptSession {
    private String applicationProtocol;
    private long creationTime;
    private byte[] id;
    private X509Certificate[] localCertificates;
    private volatile javax.security.cert.X509Certificate[] peerCertificateChain;
    private byte[] peerCertificateOcspData;
    private X509Certificate[] peerCertificates;
    private String peerHost;
    private byte[] peerTlsSctData;
    private String protocol;
    private final AbstractSessionContext sessionContext;
    private final NativeSsl ssl;
    private int peerPort = -1;
    private long lastAccessedTime = 0;
    private String[] peerSupportedSignatureAlgorithms = new String[0];

    public ActiveSession(NativeSsl nativeSsl, AbstractSessionContext abstractSessionContext) {
        this.ssl = (NativeSsl) Preconditions.checkNotNull(nativeSsl, "ssl");
        this.sessionContext = (AbstractSessionContext) Preconditions.checkNotNull(abstractSessionContext, "sessionContext");
    }

    private void checkPeerCertificatesPresent() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.peerCertificates;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates");
        }
    }

    private void configurePeer(String str, int i, X509Certificate[] x509CertificateArr) {
        this.peerHost = str;
        this.peerPort = i;
        this.peerCertificates = x509CertificateArr;
        synchronized (this.ssl) {
            this.peerCertificateOcspData = this.ssl.getPeerCertificateOcspData();
            this.peerTlsSctData = this.ssl.getPeerTlsSctData();
        }
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return Http2.INITIAL_MAX_FRAME_SIZE;
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
        String protocolString;
        String str = this.applicationProtocol;
        if (str != null) {
            return str;
        }
        synchronized (this.ssl) {
            protocolString = SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
        }
        this.applicationProtocol = protocolString;
        return protocolString;
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        String cipherSuite;
        synchronized (this.ssl) {
            cipherSuite = this.ssl.getCipherSuite();
        }
        return cipherSuite == null ? "SSL_NULL_WITH_NULL_NULL" : cipherSuite;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        long time;
        long j = this.creationTime;
        if (j != 0) {
            return j;
        }
        synchronized (this.ssl) {
            time = this.ssl.getTime();
            this.creationTime = time;
        }
        return time;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        byte[] sessionId = this.id;
        if (sessionId == null) {
            synchronized (this.ssl) {
                sessionId = this.ssl.getSessionId();
                this.id = sessionId;
            }
        }
        return sessionId != null ? (byte[]) sessionId.clone() : EmptyArray.BYTE;
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        long j = this.lastAccessedTime;
        return j == 0 ? getCreationTime() : j;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        X509Certificate[] localCertificates = this.localCertificates;
        if (localCertificates == null) {
            synchronized (this.ssl) {
                localCertificates = this.ssl.getLocalCertificates();
                this.localCertificates = localCertificates;
            }
        }
        if (localCertificates == null) {
            return null;
        }
        return (Certificate[]) localCertificates.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) getLocalCertificates();
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            return null;
        }
        return x509CertificateArr[0].getSubjectX500Principal();
    }

    @Override // org.conscrypt.ConscryptSession
    public String[] getLocalSupportedSignatureAlgorithms() {
        return new String[]{"RSASSA-PSS", "Ed25519", "SHA512withRSA", "SHA512withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA256withRSA", "SHA256withECDSA", "SHA224withRSA", "SHA224withECDSA", "SHA1withRSA", "SHA1withECDSA"};
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return 16709;
    }

    @Override // javax.net.ssl.SSLSession
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        if (!Platform.isJavaxCertificateSupported()) {
            u52.k("Use getPeerCertificates() instead");
            return null;
        }
        checkPeerCertificatesPresent();
        javax.security.cert.X509Certificate[] x509CertificateArr = this.peerCertificateChain;
        if (x509CertificateArr != null) {
            return x509CertificateArr;
        }
        javax.security.cert.X509Certificate[] certificateChain = SSLUtils.toCertificateChain(this.peerCertificates);
        this.peerCertificateChain = certificateChain;
        return certificateChain;
    }

    @Override // org.conscrypt.ConscryptSession, javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        checkPeerCertificatesPresent();
        return (X509Certificate[]) this.peerCertificates.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.peerHost;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        checkPeerCertificatesPresent();
        return this.peerCertificates[0].getSubjectX500Principal();
    }

    @Override // org.conscrypt.ConscryptSession
    public byte[] getPeerSignedCertificateTimestamp() {
        byte[] bArr = this.peerTlsSctData;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // org.conscrypt.ConscryptSession
    public String[] getPeerSupportedSignatureAlgorithms() {
        return (String[]) this.peerSupportedSignatureAlgorithms.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        String version;
        String str = this.protocol;
        if (str != null) {
            return str;
        }
        synchronized (this.ssl) {
            version = this.ssl.getVersion();
        }
        this.protocol = version;
        return version;
    }

    @Override // org.conscrypt.ConscryptSession
    public String getRequestedServerName() {
        String requestedServerName;
        synchronized (this.ssl) {
            requestedServerName = this.ssl.getRequestedServerName();
        }
        return requestedServerName;
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        if (isValid()) {
            return this.sessionContext;
        }
        return null;
    }

    @Override // org.conscrypt.ConscryptSession
    public List<byte[]> getStatusResponses() {
        byte[] bArr = this.peerCertificateOcspData;
        return bArr == null ? Collections.EMPTY_LIST : Collections.singletonList((byte[]) bArr.clone());
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
        synchronized (this.ssl) {
            this.ssl.setTimeout(0L);
        }
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        boolean z;
        synchronized (this.ssl) {
            z = System.currentTimeMillis() - this.ssl.getTimeout() < this.ssl.getTime();
        }
        return z;
    }

    public void onPeerCertificateAvailable(String str, int i) throws CertificateException {
        synchronized (this.ssl) {
            try {
                this.id = null;
                if (this.localCertificates == null) {
                    this.localCertificates = this.ssl.getLocalCertificates();
                }
                if (this.peerCertificates == null) {
                    configurePeer(str, i, this.ssl.getPeerCertificates());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onPeerCertificatesReceived(String str, int i, X509Certificate[] x509CertificateArr) {
        configurePeer(str, i, x509CertificateArr);
    }

    public void onPeerSignatureAlgorithmsReceived(String[] strArr) {
        this.peerSupportedSignatureAlgorithms = strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    public void setLastAccessedTime(long j) {
        this.lastAccessedTime = j;
    }
}
