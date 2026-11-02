package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p88 {
    public final boolean a;
    public final df3 b;
    public int c;
    public int d;

    public p88(p88 p88Var, boolean z) {
        df3 df3Var;
        df3 df3Var2;
        this.a = z;
        if (p88Var == null || (df3Var2 = p88Var.b) == null) {
            df3Var = new df3(null);
        } else {
            df3Var2.b();
            df3Var = new df3(df3Var2);
        }
        this.b = df3Var;
        if (p88Var != null) {
            this.c = p88Var.c;
            this.d = p88Var.d;
        } else {
            this.c = 0;
            this.d = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    public final void a(int i) {
        int iW;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.d;
        int i4 = i3 + i;
        df3 df3Var = this.b;
        uz4 uz4VarO = df3Var.o();
        int i5 = df3Var.e;
        int i6 = df3Var.d;
        if (i6 != i5 && df3Var.i(i6) >= i3 && df3Var.j(df3Var.d) <= i4) {
            int iK = df3Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (df3Var.h(iK) != i5 && df3Var.i(df3Var.h(iK)) >= i3) {
                            iK = df3Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (df3Var.m(iK) <= i4 && df3Var.g(iK) >= i3) {
                            uz4VarO.a(iK);
                        }
                        if (df3Var.l(iK) != i5 && df3Var.i(df3Var.l(iK)) >= i3 && df3Var.j(df3Var.l(iK)) <= i4) {
                            iK = df3Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (df3Var.k(iK) != i5) {
                            c = iK == df3Var.h(df3Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = df3Var.k(iK);
                    }
                }
            }
        }
        int i7 = uz4VarO.b;
        int i8 = i3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iC = uz4VarO.c(i9);
            long jN = df3Var.n(iC);
            int iW2 = jb5.W(jN);
            int i11 = this.d;
            if (iW2 != i11) {
                int iW3 = jb5.W(jN);
                if (i11 > iW3 || iW3 > i4) {
                    iW = jb5.W(jN);
                } else if (jb5.U(jN)) {
                    iW = this.c;
                } else {
                    iW = i4;
                }
            } else {
                iW = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.d;
            if (i13 == i14) {
                i13 = i4;
            } else if (i14 <= i13 && i13 <= i4) {
                if (jb5.V(jN)) {
                    i13 = i4;
                } else {
                    i13 = this.c;
                }
            }
            long jC = (iW >= i13 || (iW == this.c && i13 == i4)) ? jb5.C(iW, iW, false, false) : jb5.C(iW, i13, jb5.U(jN), jb5.V(jN));
            int iM = df3Var.m(iC);
            df3Var.b.f(iC + 2, jC);
            df3Var.y(iC);
            int iW4 = jb5.W(jC);
            if (iW4 >= ((int) (jC & 2147483647L))) {
                df3Var.d(iC);
                df3Var.e(iC);
            } else {
                if (iW4 < i8 || iW4 > i4 || (iW4 != iM && iM < i3)) {
                    df3Var.d(iC);
                    i2 = i12;
                    uz4VarO.e(i10, uz4VarO.c(i2));
                    i10++;
                } else {
                    i8 = iW4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iC2 = uz4VarO.c(i15);
            df3Var.s(iC2, 0);
            df3Var.u(iC2, df3Var.n(iC2));
            df3Var.t(iC2, i5);
            df3Var.w(iC2, i5);
            df3Var.a(iC2);
        }
        uz4VarO.b = 0;
        df3Var.c();
        this.d += i;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    public final void b(int i) {
        int iW;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.c;
        int i4 = i3 - i;
        df3 df3Var = this.b;
        uz4 uz4VarO = df3Var.o();
        int i5 = df3Var.e;
        int i6 = df3Var.d;
        if (i6 != i5 && df3Var.i(i6) >= i4 && df3Var.j(df3Var.d) <= i3) {
            int iK = df3Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (df3Var.h(iK) != i5 && df3Var.i(df3Var.h(iK)) >= i4) {
                            iK = df3Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (df3Var.m(iK) <= i3 && df3Var.g(iK) >= i4) {
                            uz4VarO.a(iK);
                        }
                        if (df3Var.l(iK) != i5 && df3Var.i(df3Var.l(iK)) >= i4 && df3Var.j(df3Var.l(iK)) <= i3) {
                            iK = df3Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (df3Var.k(iK) != i5) {
                            c = iK == df3Var.h(df3Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = df3Var.k(iK);
                    }
                }
            }
        }
        int i7 = uz4VarO.b;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iC = uz4VarO.c(i9);
            long jN = df3Var.n(iC);
            int iW2 = jb5.W(jN);
            int i11 = this.c;
            if (iW2 != i11) {
                int iW3 = jb5.W(jN);
                if (i4 > iW3 || iW3 >= i11) {
                    iW = jb5.W(jN);
                } else if (jb5.U(jN)) {
                    iW = i4;
                } else {
                    iW = this.d;
                }
            } else {
                iW = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.c;
            if (i13 == i14) {
                i13 = i4;
            } else if (i4 <= i13 && i13 < i14) {
                if (jb5.V(jN)) {
                    i13 = this.d;
                } else {
                    i13 = i4;
                }
            }
            long jC = (iW >= i13 || (iW == i4 && i13 == this.d)) ? jb5.C(iW, iW, false, false) : jb5.C(iW, i13, jb5.U(jN), jb5.V(jN));
            int iM = df3Var.m(iC);
            df3Var.b.f(iC + 2, jC);
            df3Var.y(iC);
            int iW4 = jb5.W(jC);
            if (iW4 >= ((int) (jC & 2147483647L))) {
                df3Var.d(iC);
                df3Var.e(iC);
            } else {
                if (iW4 < i8 || iW4 > i3 || (iW4 != iM && iM < i4)) {
                    df3Var.d(iC);
                    i2 = i12;
                    uz4VarO.e(i10, uz4VarO.c(i2));
                    i10++;
                } else {
                    i8 = iW4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iC2 = uz4VarO.c(i15);
            df3Var.s(iC2, 0);
            df3Var.u(iC2, df3Var.n(iC2));
            df3Var.t(iC2, i5);
            df3Var.w(iC2, i5);
            df3Var.a(iC2);
        }
        uz4VarO.b = 0;
        df3Var.c();
        this.c -= i;
    }

    public final int c() {
        return this.d - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p88)) {
            return false;
        }
        p88 p88Var = (p88) obj;
        if (this.c == p88Var.c && this.d == p88Var.d) {
            return dh3.f(this.b, p88Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }

    public /* synthetic */ p88(p88 p88Var, int i) {
        this((i & 1) != 0 ? null : p88Var, true);
    }
}
