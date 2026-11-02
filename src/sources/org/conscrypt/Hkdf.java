package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class Hkdf {
    private final String hmacName;
    private final int macLength;

    public Hkdf(String str) throws NoSuchAlgorithmException {
        Objects.requireNonNull(str);
        this.hmacName = str;
        this.macLength = Mac.getInstance(str).getMacLength();
    }

    private Mac getMac(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(this.hmacName);
        mac.init(new SecretKeySpec(bArr, "RAW"));
        return mac;
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(i >= 0, "Negative length");
        Preconditions.checkArgument(i <= getMacLength() * 255, "Length too long");
        Mac mac = getMac(bArr);
        int macLength = getMacLength();
        byte[] bArrDoFinal = new byte[0];
        byte[] bArr3 = new byte[i];
        byte[] bArr4 = {0};
        int i2 = 0;
        while (i2 < i) {
            bArr4[0] = (byte) (bArr4[0] + 1);
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            bArrDoFinal = mac.doFinal(bArr4);
            int iMin = Math.min(macLength, i - i2);
            System.arraycopy(bArrDoFinal, 0, bArr3, i2, iMin);
            i2 += iMin;
        }
        return bArr3;
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(bArr2.length > 0, "Empty keying material");
        if (bArr.length == 0) {
            bArr = new byte[getMacLength()];
        }
        return getMac(bArr).doFinal(bArr2);
    }

    public int getMacLength() {
        return this.macLength;
    }
}
