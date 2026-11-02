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
public class OpenSSLSignatureRawECDSA extends SignatureSpi {
    private ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) throws InvalidKeyException {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 408) {
            return openSSLKey;
        }
        u52.u("Non-EC key used to initialize EC signature.");
        return null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPrivateKey(privateKey));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPublicKey(publicKey));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("No key provided");
        }
        int iECDSA_size = NativeCrypto.ECDSA_size(openSSLKey.getNativeRef());
        byte[] bArr = new byte[iECDSA_size];
        try {
            try {
                int iECDSA_sign = NativeCrypto.ECDSA_sign(this.buffer.array(), this.buffer.size(), bArr, this.key.getNativeRef());
                if (iECDSA_sign < 0) {
                    throw new SignatureException("Could not compute signature.");
                }
                if (iECDSA_sign != iECDSA_size) {
                    byte[] bArr2 = new byte[iECDSA_sign];
                    System.arraycopy(bArr, 0, bArr2, 0, iECDSA_sign);
                    bArr = bArr2;
                }
                this.buffer.reset();
                return bArr;
            } catch (Exception e) {
                throw new SignatureException(e);
            }
        } catch (Throwable th) {
            this.buffer.reset();
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws IOException {
        this.buffer.write(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            if (this.key == null) {
                throw new SignatureException("No key provided");
            }
            try {
                int iECDSA_verify = NativeCrypto.ECDSA_verify(this.buffer.array(), this.buffer.size(), bArr, this.key.getNativeRef());
                if (iECDSA_verify == -1) {
                    throw new SignatureException("Could not verify signature.");
                }
                boolean z = iECDSA_verify == 1;
                this.buffer.reset();
                return z;
            } catch (Exception e) {
                throw new SignatureException(e);
            }
        } catch (Throwable th) {
            this.buffer.reset();
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        this.buffer.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
    }
}
