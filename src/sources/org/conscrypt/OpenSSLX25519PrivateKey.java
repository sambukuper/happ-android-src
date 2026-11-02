package org.conscrypt;

import defpackage.bt;
import defpackage.u52;
import defpackage.xw3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSSLX25519PrivateKey implements OpenSSLX25519Key, PrivateKey {
    private static final byte[] PKCS8_PREAMBLE = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final long serialVersionUID = -3136201500221850916L;
    private byte[] uCoordinate;

    public OpenSSLX25519PrivateKey(EncodedKeySpec encodedKeySpec) throws InvalidKeySpecException {
        byte[] encoded = encodedKeySpec.getEncoded();
        if ("PKCS#8".equals(encodedKeySpec.getFormat())) {
            try {
                encoded = NativeCrypto.EVP_raw_X25519_private_key(encoded);
                this.uCoordinate = encoded;
            } catch (InvalidKeyException | OpenSSLX509CertificateFactory.ParsingException e) {
                throw new InvalidKeySpecException(e);
            }
        } else {
            if (!AddressUtils.asciiEqualsIgnoreCase(encodedKeySpec.getFormat(), "raw")) {
                xw3.t("Encoding must be in PKCS#8 or raw format");
                throw null;
            }
            this.uCoordinate = encoded;
        }
        if (encoded.length == 32) {
            return;
        }
        xw3.t("Invalid key size");
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.uCoordinate.length == 32) {
            return;
        }
        u52.s("Invalid key size");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.uCoordinate = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSSLX25519PrivateKey) {
            return MessageDigest.isEqual(this.uCoordinate, ((OpenSSLX25519PrivateKey) obj).uCoordinate);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XDH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return ArrayUtils.concat(PKCS8_PREAMBLE, bArr);
        }
        bt.i("key is destroyed");
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.conscrypt.OpenSSLX25519Key
    public byte[] getU() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        bt.i("key is destroyed");
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.uCoordinate);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.uCoordinate == null;
    }

    public OpenSSLX25519PrivateKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.uCoordinate = (byte[]) bArr.clone();
        } else {
            bt.q("Invalid key size");
            throw null;
        }
    }
}
