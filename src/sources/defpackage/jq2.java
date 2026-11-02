package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 {
    public static final jq2 h;
    public final int[] a;
    public final int[] b;
    public final kq2 c;
    public final kq2 d;
    public final short e;
    public final short f;
    public final boolean g;

    static {
        new jq2(4201, 4096, 1);
        new jq2(1033, 1024, 1);
        new jq2(67, 64, 1);
        new jq2(19, 16, 1);
        h = new jq2(285, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
        new jq2(301, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jq2(int i, int i2, int i3) {
        this.f = i;
        this.e = i2;
        this.g = i3;
        this.a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i ? 1 : 0) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.a[i6]] = i6;
        }
        this.c = new kq2(this, new int[]{0});
        this.d = new kq2(this, new int[]{1});
    }

    public final kq2 a(int i, int i2) {
        if (i < 0) {
            kp5.e();
            return null;
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new kq2(this, iArr);
    }

    public final int b(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i]) - 1];
    }

    public final int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i] + iArr[i2]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        return pc6.r(sb, this.e, ')');
    }
}
