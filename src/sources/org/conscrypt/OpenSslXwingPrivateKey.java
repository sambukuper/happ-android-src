package org.conscrypt;

import defpackage.bt;
import defpackage.xw3;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslXwingPrivateKey implements PrivateKey {
    static final int PRIVATE_KEY_SIZE_BYTES = 32;
    private static final byte[] pkcs8Preamble = {48, 52, 2, 1, 0, 48, 13, 6, 11, 43, 6, 1, 4, 1, -125, -26, 45, -127, -56, 122, 4, 32};
    private static final long serialVersionUID = 1;
    private byte[] raw;

    public OpenSslXwingPrivateKey(EncodedKeySpec encodedKeySpec) throws InvalidKeySpecException {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!encodedKeySpec.getFormat().equals("PKCS#8")) {
            if (!AddressUtils.asciiEqualsIgnoreCase(encodedKeySpec.getFormat(), "raw")) {
                xw3.t("Encoding must be in raw format");
                throw null;
            }
            if (encoded.length == 32) {
                this.raw = encoded;
                return;
            } else {
                xw3.t("Invalid key size");
                throw null;
            }
        }
        byte[] bArr = pkcs8Preamble;
        if (!ArrayUtils.startsWith(encoded, bArr)) {
            xw3.t("Invalid X-Wing PKCS8 key preamble");
            throw null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, bArr.length, encoded.length);
        this.raw = bArrCopyOfRange;
        if (bArrCopyOfRange.length == 32) {
            return;
        }
        xw3.t("Invalid key size");
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.raw = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslXwingPrivateKey) {
            return MessageDigest.isEqual(this.raw, ((OpenSslXwingPrivateKey) obj).raw);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XWING";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            return ArrayUtils.concat(pkcs8Preamble, bArr);
        }
        bt.i("key is destroyed");
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public byte[] getRaw() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        bt.i("key is destroyed");
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.raw);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.raw == null;
    }

    public OpenSslXwingPrivateKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.raw = (byte[]) bArr.clone();
        } else {
            bt.q("Invalid key size");
            throw null;
        }
    }
}
