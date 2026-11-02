package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l10 implements Serializable {
    public final transient int[] X;
    public final transient char[] Y;
    public final transient byte[] Z;
    public final String f0;
    public final char g0;
    public final int h0;
    public final boolean i0;
    public final int j0;

    public l10(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.X = iArr;
        char[] cArr = new char[64];
        this.Y = cArr;
        this.Z = new byte[64];
        this.f0 = str;
        this.i0 = z;
        this.g0 = c;
        this.h0 = i;
        int length = str2.length();
        if (length != 64) {
            bt.q(ie2.h("Base64Alphabet length must be exactly 64 (was ", length, ")"));
            throw null;
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.Y[i2];
            this.Z[i2] = (byte) c2;
            this.X[c2] = i2;
        }
        if (z) {
            this.X[c] = -2;
        }
        this.j0 = z ? 2 : 1;
    }

    public final int a(char[] cArr, int i, int i2) {
        char[] cArr2 = this.Y;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        int i3 = i2 + 3;
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        int i4 = i2 + 4;
        cArr[i3] = cArr2[i & 63];
        return i4;
    }

    public final int b(int i, int i2, char[] cArr, int i3) {
        char[] cArr2 = this.Y;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (!this.i0) {
            if (i2 != 2) {
                return i4;
            }
            int i5 = i3 + 3;
            cArr[i4] = cArr2[(i >> 6) & 63];
            return i5;
        }
        int i6 = i3 + 3;
        char c = this.g0;
        cArr[i4] = i2 == 2 ? cArr2[(i >> 6) & 63] : c;
        int i7 = i3 + 4;
        cArr[i6] = c;
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != l10.class) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return l10Var.g0 == this.g0 && l10Var.h0 == this.h0 && l10Var.i0 == this.i0 && l10Var.j0 == this.j0 && this.f0.equals(l10Var.f0);
    }

    public final int hashCode() {
        return this.f0.hashCode();
    }

    public final String toString() {
        return this.f0;
    }

    public l10(l10 l10Var) {
        int i = l10Var.j0;
        int[] iArr = new int[128];
        this.X = iArr;
        char[] cArr = new char[64];
        this.Y = cArr;
        byte[] bArr = new byte[64];
        this.Z = bArr;
        this.f0 = "MIME-NO-LINEFEEDS";
        byte[] bArr2 = l10Var.Z;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = l10Var.Y;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = l10Var.X;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.i0 = true;
        this.g0 = '=';
        this.h0 = Integer.MAX_VALUE;
        this.j0 = i;
    }
}
