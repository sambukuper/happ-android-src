package org.conscrypt;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ConscryptX509TrustManager {
    List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException;

    List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, String str2) throws CertificateException;

    default ConscryptNetworkSecurityPolicy getNetworkSecurityPolicy() {
        return null;
    }

    default void setNetworkSecurityPolicy(ConscryptNetworkSecurityPolicy conscryptNetworkSecurityPolicy) {
    }
}
