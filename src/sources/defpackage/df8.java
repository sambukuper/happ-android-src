package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class df8 implements Iterable {
    public cf8 X;
    public char[] Y;
    public int Z;
    public int[] f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;

    public static int c(int i, int i2) {
        return (i * 16777619) ^ i2;
    }

    public static int d(int i, int i2) {
        return c(c(c(c(i, i2 & 255), (i2 >> 8) & 255), (i2 >> 16) & 255), (i2 >> 24) & 255);
    }

    public int a(int i) {
        if (i >= 0) {
            if (i < 55296 || (i > 56319 && i <= 65535)) {
                char[] cArr = this.Y;
                return cArr[(cArr[i >> 5] << 2) + (i & 31)];
            }
            if (i <= 65535) {
                char[] cArr2 = this.Y;
                return cArr2[(cArr2[((i - 55296) >> 5) + 2048] << 2) + (i & 31)];
            }
            if (i < this.l0) {
                char[] cArr3 = this.Y;
                return cArr3[(cArr3[cArr3[(i >> 11) + 2080] + ((i >> 5) & 63)] << 2) + (i & 31)];
            }
            if (i <= 1114111) {
                return this.Y[this.m0];
            }
        }
        return this.k0;
    }

    public int b(char c) {
        char[] cArr = this.Y;
        return cArr[(cArr[c >> 5] << 2) + (c & 31)];
    }

    public int e(int i, int i2) {
        int i3;
        char c;
        char c2;
        loop0: while (true) {
            if (i >= 1114112) {
                break;
            }
            if (i < 55296 || (i > 56319 && i <= 65535)) {
                i3 = this.Y[i >> 5] << 2;
                c = 0;
            } else {
                if (i >= 65535) {
                    int i4 = this.l0;
                    char[] cArr = this.Y;
                    if (i >= i4) {
                        if (i2 != cArr[this.m0]) {
                            break;
                        }
                        i = 1114112;
                        break;
                    }
                    c = cArr[(i >> 11) + 2080];
                    c2 = cArr[((i >> 5) & 63) + c];
                } else {
                    c = 2048;
                    c2 = this.Y[((i - 55296) >> 5) + 2048];
                }
                i3 = c2 << 2;
            }
            if (c == this.i0) {
                if (i2 != this.j0) {
                    break;
                }
                i += 2048;
            } else if (i3 != this.n0) {
                int i5 = (i & 31) + i3;
                int i6 = i3 + 32;
                for (int i7 = i5; i7 < i6; i7++) {
                    if (this.Y[i7] != i2) {
                        i += i7 - i5;
                        break loop0;
                    }
                }
                i += i6 - i5;
            } else {
                if (i2 != this.j0) {
                    break;
                }
                i += 32;
            }
        }
        return (i <= 1114112 ? i : 1114112) - 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof df8)) {
            return false;
        }
        df8 df8Var = (df8) obj;
        lc7 lc7Var = new lc7(df8Var);
        lc7 lc7Var2 = new lc7(this);
        while (lc7Var2.hasNext()) {
            bf8 bf8Var = (bf8) lc7Var2.next();
            if (!lc7Var.hasNext() || !bf8Var.equals((bf8) lc7Var.next())) {
                return false;
            }
        }
        return !lc7Var.hasNext() && this.k0 == df8Var.k0 && this.j0 == df8Var.j0;
    }

    public final int hashCode() {
        int i = this.o0;
        if (i != 0) {
            return i;
        }
        lc7 lc7Var = new lc7(this);
        int iD = -2128831035;
        while (lc7Var.hasNext()) {
            iD = d(iD, ((bf8) lc7Var.next()).hashCode());
        }
        if (iD == 0) {
            iD = 1;
        }
        this.o0 = iD;
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lc7(this);
    }
}
