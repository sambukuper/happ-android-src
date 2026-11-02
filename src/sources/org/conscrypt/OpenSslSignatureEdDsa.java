package org.conscrypt;

import defpackage.u52;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslSignatureEdDsa extends SignatureSpi {
    private final ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private NativeRef.EVP_MD_CTX ctx;
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) throws InvalidKeyException {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 949) {
            return openSSLKey;
        }
        u52.u("Non-ED25519 key used to initialize ED25519 signature.");
        return null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPrivateKey(privateKey));
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestSignInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPublicKey(publicKey));
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestVerifyInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        byte[] bArrEVP_DigestSign = NativeCrypto.EVP_DigestSign(evp_md_ctx, this.buffer.array(), 0, this.buffer.size());
        this.buffer.reset();
        return bArrEVP_DigestSign;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws IOException {
        this.buffer.write(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        boolean zEVP_DigestVerify = NativeCrypto.EVP_DigestVerify(evp_md_ctx, bArr, 0, bArr.length, this.buffer.array(), 0, this.buffer.size());
        this.buffer.reset();
        return zEVP_DigestVerify;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        this.buffer.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }
}
