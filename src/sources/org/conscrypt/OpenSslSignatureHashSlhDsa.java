package org.conscrypt;

import defpackage.u52;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslSignatureHashSlhDsa extends SignatureSpi {
    private final int hashNid;
    private OpenSSLMessageDigestJDK messageDigest;
    private OpenSslSlhDsaPrivateKey privateKey;
    private OpenSslSlhDsaPublicKey publicKey;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class Sha384 extends OpenSslSignatureHashSlhDsa {
        public Sha384() {
            super(673);
        }
    }

    public OpenSslSignatureHashSlhDsa(int i) {
        this.hashNid = i;
    }

    private void resetDigest() {
        try {
            if (this.hashNid == 673) {
                this.messageDigest = new OpenSSLMessageDigestJDK.SHA384();
            } else {
                throw new IllegalStateException("Unsupported hash NID: " + this.hashNid);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError("Failed to create message digest", e);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof OpenSslSlhDsaPrivateKey)) {
            u52.u("Must be OpenSslSlhDsaPrivateKey");
            return;
        }
        this.privateKey = (OpenSslSlhDsaPrivateKey) privateKey;
        this.publicKey = null;
        resetDigest();
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof OpenSslSlhDsaPublicKey)) {
            u52.u("Must be OpenSslSlhDsaPublicKey");
            return;
        }
        this.publicKey = (OpenSslSlhDsaPublicKey) publicKey;
        this.privateKey = null;
        resetDigest();
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK;
        if (this.privateKey == null || (openSSLMessageDigestJDK = this.messageDigest) == null) {
            throw new SignatureException("Not initialized for signing");
        }
        byte[] bArrEngineDigest = openSSLMessageDigestJDK.engineDigest();
        return NativeCrypto.SLHDSA_SHA2_128S_prehash_sign(bArrEngineDigest, bArrEngineDigest.length, this.hashNid, this.privateKey.getRaw());
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK = this.messageDigest;
        if (openSSLMessageDigestJDK == null) {
            throw new SignatureException("Not initialized");
        }
        openSSLMessageDigestJDK.engineUpdate(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK;
        if (this.publicKey == null || (openSSLMessageDigestJDK = this.messageDigest) == null) {
            throw new SignatureException("Not initialized for verification");
        }
        byte[] bArrEngineDigest = openSSLMessageDigestJDK.engineDigest();
        return NativeCrypto.SLHDSA_SHA2_128S_prehash_verify(bArrEngineDigest, bArrEngineDigest.length, bArr, this.hashNid, this.publicKey.getRaw()) == 1;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK = this.messageDigest;
        if (openSSLMessageDigestJDK != null) {
            openSSLMessageDigestJDK.engineUpdate(bArr, i, i2);
            return;
        }
        throw new SignatureException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }
}
