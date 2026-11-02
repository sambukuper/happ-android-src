package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ff8 extends df8 {
    @Override // defpackage.df8
    public final int a(int i) {
        if (i >= 0) {
            if (i < 55296 || (i > 56319 && i <= 65535)) {
                return this.f0[(this.Y[i >> 5] << 2) + (i & 31)];
            }
            if (i <= 65535) {
                return this.f0[(this.Y[((i - 55296) >> 5) + 2048] << 2) + (i & 31)];
            }
            if (i < this.l0) {
                char[] cArr = this.Y;
                return this.f0[(cArr[cArr[(i >> 11) + 2080] + ((i >> 5) & 63)] << 2) + (i & 31)];
            }
            if (i <= 1114111) {
                return this.f0[this.m0];
            }
        }
        return this.k0;
    }

    @Override // defpackage.df8
    public final int b(char c) {
        return this.f0[(this.Y[c >> 5] << 2) + (c & 31)];
    }

    @Override // defpackage.df8
    public final int e(int i, int i2) {
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
                    if (i >= this.l0) {
                        if (i2 != this.f0[this.m0]) {
                            break;
                        }
                        i = 1114112;
                        break;
                    }
                    char[] cArr = this.Y;
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
                int i4 = (i & 31) + i3;
                int i5 = i3 + 32;
                for (int i6 = i4; i6 < i5; i6++) {
                    if (this.f0[i6] != i2) {
                        i += i6 - i4;
                        break loop0;
                    }
                }
                i += i5 - i4;
            } else {
                if (i2 != this.j0) {
                    break;
                }
                i += 32;
            }
        }
        return (i <= 1114112 ? i : 1114112) - 1;
    }
}
