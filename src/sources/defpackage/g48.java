package defpackage;

import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g48 implements Appendable {
    public final h48 X;
    public final qf3 Y;
    public final mi5 Z;
    public p88 f0;
    public boolean g0;
    public mj0 h0;
    public long i0;
    public f88 j0;
    public c15 k0;
    public qg5 l0;

    public g48(h48 h48Var, mj0 mj0Var, h48 h48Var2, qf3 qf3Var, int i) {
        c15 c15Var = null;
        mj0Var = (i & 2) != 0 ? null : mj0Var;
        h48Var2 = (i & 4) != 0 ? h48Var : h48Var2;
        qf3Var = (i & 8) != 0 ? null : qf3Var;
        this.X = h48Var2;
        this.Y = qf3Var;
        mi5 mi5Var = new mi5();
        mi5Var.X = h48Var;
        mi5Var.Z = -1;
        mi5Var.f0 = -1;
        this.Z = mi5Var;
        c78 c78Var = h48Var.Y;
        List list = h48Var.X;
        this.f0 = c78Var != null ? new p88(c78Var.a, 2) : null;
        this.h0 = mj0Var != null ? new mj0(mj0Var) : null;
        this.i0 = h48Var.f0;
        this.j0 = h48Var.g0;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            pl[] plVarArr = new pl[size];
            for (int i2 = 0; i2 < size; i2++) {
                plVarArr[i2] = (pl) list.get(i2);
            }
            c15Var = new c15(size, plVarArr);
        }
        this.k0 = c15Var;
    }

    public static void d(g48 g48Var, int i, int i2, CharSequence charSequence, int i3, boolean z, int i4) {
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        mi5 mi5Var = g48Var.Z;
        if (i > i2) {
            zc3.a("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 < 0) {
            zc3.a("Expected textStart=0 <= textEnd=" + i3);
        }
        int iN = x97.n(i, 0, mi5Var.length());
        int iN2 = x97.n(i2, 0, mi5Var.length());
        int iN3 = x97.n(0, 0, charSequence.length());
        int iN4 = x97.n(i3, 0, charSequence.length());
        g48Var.b(iN, iN2, iN4 - iN3, z);
        g48Var.Z.a(iN, iN2, charSequence, iN3, iN4);
        g48Var.f(null);
        g48Var.l0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public static h48 h(g48 g48Var, long j, f88 f88Var, int i) {
        List list;
        if ((i & 1) != 0) {
            j = g48Var.i0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f88Var = g48Var.j0;
        }
        f88 f88Var2 = f88Var;
        c15 c15Var = g48Var.k0;
        if (c15Var != null) {
            List listF = c15Var.f();
            if (((h05) listF).isEmpty()) {
                list = null;
            } else {
                list = listF;
            }
        } else {
            list = null;
        }
        return new h48(g48Var.Z.toString(), j2, f88Var2, null, list, null, z68.K(g48Var), 8);
    }

    public final mj0 a() {
        mj0 mj0Var = this.h0;
        if (mj0Var != null) {
            return mj0Var;
        }
        mj0 mj0Var2 = new mj0((mj0) null);
        this.h0 = mj0Var2;
        return mj0Var2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            mi5 mi5Var = this.Z;
            b(mi5Var.length(), mi5Var.length(), charSequence.length(), false);
            mi5Var.a(mi5Var.length(), mi5Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:302:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:309:0x04d5  */
    public final void b(int i, int i2, int i3, boolean z) {
        int i4;
        long j;
        int i5;
        int iW;
        int iC;
        long jC;
        int iW2;
        int i6;
        int iW3;
        char c;
        mj0 mj0VarA = a();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i7 = i3 - (iMax - iMin);
            gp0 gp0Var = null;
            int i8 = 0;
            boolean z2 = false;
            while (true) {
                c15 c15Var = (c15) mj0VarA.Y;
                if (i8 >= c15Var.Z) {
                    break;
                }
                gp0 gp0Var2 = (gp0) c15Var.X[i8];
                int i9 = gp0Var2.a;
                if ((iMin > i9 || i9 > iMax) && ((iMin > (i4 = gp0Var2.b) || i4 > iMax) && ((iMin > i4 || i9 > iMin) && (iMax > i4 || i9 > iMax)))) {
                    if (i9 > iMax && !z2) {
                        mj0VarA.v(gp0Var, iMin, iMax, i7, z);
                        z2 = true;
                    }
                    if (z2) {
                        gp0Var2.a += i7;
                        gp0Var2.b += i7;
                    }
                    ((c15) mj0VarA.Z).b(gp0Var2);
                } else if (gp0Var == null) {
                    gp0Var = gp0Var2;
                } else {
                    gp0Var.b = gp0Var2.b;
                    gp0Var.d = gp0Var2.d;
                    gp0Var.e = gp0Var.e || gp0Var2.e;
                }
                i8++;
            }
            if (!z2) {
                mj0VarA.v(gp0Var, iMin, iMax, i7, z);
            }
            c15 c15Var2 = (c15) mj0VarA.Y;
            mj0VarA.Y = (c15) mj0VarA.Z;
            mj0VarA.Z = c15Var2;
            c15Var2.g();
        }
        qf3 qf3Var = this.Y;
        if (qf3Var != null) {
            qf3Var.i(i, i2, i3);
        }
        this.i0 = mn7.c(this.i0, i, i2, i3);
        p88 p88Var = this.f0;
        if (p88Var != null) {
            df3 df3Var = p88Var.b;
            if (!p88Var.a) {
                zc3.c("This buffer is immutable");
            }
            int i10 = df3Var.d;
            zz4 zz4Var = df3Var.b;
            int i11 = df3Var.e;
            if (i10 == i11) {
                return;
            }
            int i12 = i2 - i;
            int i13 = i3 - i12;
            char c2 = 2;
            if (i10 != i11 && p88Var.c() < i13) {
                int iC2 = (p88Var.c() - i13) + XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                int i14 = p88Var.c;
                uz4 uz4VarO = df3Var.o();
                j = 2147483647L;
                int i15 = df3Var.d;
                if (i15 != i11 && df3Var.i(i15) >= i14 && df3Var.j(df3Var.d) <= Integer.MAX_VALUE) {
                    int iH = df3Var.d;
                    char c3 = 0;
                    while (iH != i11) {
                        if (c3 != 0) {
                            if (c3 == 1) {
                                if (df3Var.m(iH) <= Integer.MAX_VALUE && df3Var.g(iH) >= i14) {
                                    uz4VarO.a(iH);
                                }
                                if (df3Var.l(iH) != i11 && df3Var.i(df3Var.l(iH)) >= i14 && df3Var.j(df3Var.l(iH)) <= Integer.MAX_VALUE) {
                                    iH = df3Var.l(iH);
                                    c3 = 0;
                                } else {
                                    c3 = 2;
                                }
                            } else if (c3 == c2) {
                                if (df3Var.k(iH) != i11) {
                                    c3 = iH == df3Var.h(df3Var.k(iH)) ? (char) 1 : (char) 2;
                                }
                                iH = df3Var.k(iH);
                            }
                        } else if (df3Var.h(iH) != i11 && df3Var.i(df3Var.h(iH)) >= i14) {
                            iH = df3Var.h(iH);
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        c2 = 2;
                    }
                }
                int i16 = uz4VarO.b;
                int i17 = i14;
                int i18 = 0;
                int i19 = 0;
                while (i18 < i16) {
                    int iC3 = uz4VarO.c(i18);
                    long jN = df3Var.n(iC3);
                    int i20 = iC2;
                    int iW4 = jb5.W(jN) > p88Var.c ? jb5.W(jN) + i20 : jb5.W(jN);
                    int i21 = (int) (jN & 2147483647L);
                    if (i21 > p88Var.c) {
                        i21 += i20;
                    }
                    long jC2 = jb5.C(iW4, i21, jb5.U(jN), jb5.V(jN));
                    int iM = df3Var.m(iC3);
                    zz4Var.f(iC3 + 2, jC2);
                    df3Var.y(iC3);
                    int iW5 = jb5.W(jC2);
                    if (iW5 >= ((int) (jC2 & 2147483647L))) {
                        df3Var.d(iC3);
                        df3Var.e(iC3);
                        c = 65535;
                    } else {
                        c = 65535;
                        if (iW5 < i17 || iW5 > Integer.MAX_VALUE || (iW5 != iM && iM < i14)) {
                            df3Var.d(iC3);
                            uz4VarO.e(i19, uz4VarO.c(i18));
                            i19++;
                        } else {
                            i17 = iW5;
                        }
                    }
                    i18++;
                    iC2 = i20;
                }
                int i22 = iC2;
                for (int i23 = 0; i23 < i19; i23++) {
                    int iC4 = uz4VarO.c(i23);
                    df3Var.s(iC4, 0);
                    df3Var.u(iC4, df3Var.n(iC4));
                    df3Var.t(iC4, i11);
                    df3Var.w(iC4, i11);
                    df3Var.a(iC4);
                }
                uz4VarO.b = 0;
                df3Var.c();
                p88Var.d += i22;
            } else {
                j = 2147483647L;
            }
            int i24 = p88Var.c;
            if (i < i24 && i2 <= i24) {
                int i25 = i24 - i2;
                if (i25 != 0) {
                    int i26 = i24 - i25;
                    uz4 uz4VarO2 = df3Var.o();
                    int i27 = df3Var.d;
                    if (i27 != i11 && df3Var.i(i27) >= i26 && df3Var.j(df3Var.d) <= i24) {
                        int iK = df3Var.d;
                        loop3: while (true) {
                            char c4 = 0;
                            while (true) {
                                if (iK == i11) {
                                    break loop3;
                                }
                                if (c4 == 0) {
                                    if (df3Var.h(iK) != i11 && df3Var.i(df3Var.h(iK)) >= i26) {
                                        iK = df3Var.h(iK);
                                        break;
                                    }
                                    c4 = 1;
                                } else if (c4 == 1) {
                                    if (df3Var.m(iK) <= i24 && df3Var.g(iK) >= i26) {
                                        uz4VarO2.a(iK);
                                    }
                                    if (df3Var.l(iK) != i11 && df3Var.i(df3Var.l(iK)) >= i26 && df3Var.j(df3Var.l(iK)) <= i24) {
                                        iK = df3Var.l(iK);
                                        break;
                                    }
                                    c4 = 2;
                                } else if (c4 == 2) {
                                    if (df3Var.k(iK) != i11) {
                                        c4 = iK == df3Var.h(df3Var.k(iK)) ? (char) 1 : (char) 2;
                                    }
                                    iK = df3Var.k(iK);
                                }
                            }
                        }
                    }
                    int i28 = i26;
                    int i29 = 0;
                    int i30 = 0;
                    for (int i31 = uz4VarO2.b; i29 < i31; i31 = i6) {
                        int iC5 = uz4VarO2.c(i29);
                        long jN2 = df3Var.n(iC5);
                        int i32 = i25;
                        if (jb5.W(jN2) == i26 && jb5.U(jN2)) {
                            iW3 = jb5.W(jN2);
                            i6 = i31;
                        } else {
                            int i33 = p88Var.c;
                            i6 = i31;
                            int iW6 = jb5.W(jN2);
                            iW3 = (i26 > iW6 || iW6 > i33) ? jb5.W(jN2) : jb5.W(jN2) + p88Var.c();
                        }
                        int iC6 = (int) (jN2 & j);
                        if (iC6 != i26 || jb5.V(jN2)) {
                            int i34 = p88Var.c;
                            if (i26 <= iC6 && iC6 <= i34) {
                                iC6 += p88Var.c();
                            }
                        }
                        long jC3 = jb5.C(iW3, iC6, jb5.U(jN2), jb5.V(jN2));
                        int iM2 = df3Var.m(iC5);
                        zz4Var.f(iC5 + 2, jC3);
                        df3Var.y(iC5);
                        int iW7 = jb5.W(jC3);
                        if (iW7 >= ((int) (jC3 & j))) {
                            df3Var.d(iC5);
                            df3Var.e(iC5);
                        } else if (iW7 < i28 || iW7 > i24 || (iW7 != iM2 && iM2 < i26)) {
                            df3Var.d(iC5);
                            uz4VarO2.e(i30, uz4VarO2.c(i29));
                            i30++;
                        } else {
                            i28 = iW7;
                        }
                        i29++;
                        i25 = i32;
                    }
                    int i35 = i25;
                    for (int i36 = 0; i36 < i30; i36++) {
                        int iC7 = uz4VarO2.c(i36);
                        df3Var.s(iC7, 0);
                        df3Var.u(iC7, df3Var.n(iC7));
                        df3Var.t(iC7, i11);
                        df3Var.w(iC7, i11);
                        df3Var.a(iC7);
                    }
                    uz4VarO2.b = 0;
                    df3Var.c();
                    p88Var.c -= i35;
                    p88Var.d -= i35;
                }
                p88Var.b(i12);
            } else if (i >= i24 || i2 < i24) {
                int i37 = i - i24;
                if (i37 != 0) {
                    int i38 = p88Var.d;
                    int i39 = i38 + i37;
                    uz4 uz4VarO3 = df3Var.o();
                    int i40 = df3Var.d;
                    if (i40 != i11 && df3Var.i(i40) >= i38 && df3Var.j(df3Var.d) <= i39) {
                        int iK2 = df3Var.d;
                        loop7: while (true) {
                            char c5 = 0;
                            while (true) {
                                if (iK2 == i11) {
                                    break loop7;
                                }
                                if (c5 == 0) {
                                    if (df3Var.h(iK2) != i11 && df3Var.i(df3Var.h(iK2)) >= i38) {
                                        iK2 = df3Var.h(iK2);
                                        break;
                                    }
                                    c5 = 1;
                                } else if (c5 == 1) {
                                    if (df3Var.m(iK2) <= i39 && df3Var.g(iK2) >= i38) {
                                        uz4VarO3.a(iK2);
                                    }
                                    if (df3Var.l(iK2) != i11 && df3Var.i(df3Var.l(iK2)) >= i38 && df3Var.j(df3Var.l(iK2)) <= i39) {
                                        iK2 = df3Var.l(iK2);
                                        break;
                                    }
                                    c5 = 2;
                                } else if (c5 == 2) {
                                    if (df3Var.k(iK2) != i11) {
                                        c5 = iK2 == df3Var.h(df3Var.k(iK2)) ? (char) 1 : (char) 2;
                                    }
                                    iK2 = df3Var.k(iK2);
                                }
                            }
                        }
                    }
                    int i41 = i38;
                    int i42 = 0;
                    int i43 = 0;
                    for (int i44 = uz4VarO3.b; i42 < i44; i44 = i5) {
                        int iC8 = uz4VarO3.c(i42);
                        long jN3 = df3Var.n(iC8);
                        int i45 = i37;
                        if (jb5.W(jN3) == i39 && jb5.U(jN3)) {
                            iW = jb5.W(jN3) - p88Var.c();
                            i5 = i44;
                        } else {
                            int i46 = p88Var.d;
                            i5 = i44;
                            int iW8 = jb5.W(jN3);
                            iW = (i46 > iW8 || iW8 >= i39) ? jb5.W(jN3) : jb5.W(jN3) - p88Var.c();
                        }
                        int i47 = (int) (jN3 & j);
                        if (i47 != i39 || jb5.V(jN3)) {
                            if (p88Var.d <= i47 && i47 < i39) {
                                iC = p88Var.c();
                            }
                            jC = jb5.C(iW, i47, jb5.U(jN3), jb5.V(jN3));
                            int iM3 = df3Var.m(iC8);
                            zz4Var.f(iC8 + 2, jC);
                            df3Var.y(iC8);
                            iW2 = jb5.W(jC);
                            if (iW2 >= ((int) (jC & j))) {
                                df3Var.d(iC8);
                                df3Var.e(iC8);
                            } else if (iW2 >= i41 || iW2 > i39 || (iW2 != iM3 && iM3 < i38)) {
                                df3Var.d(iC8);
                                uz4VarO3.e(i43, uz4VarO3.c(i42));
                                i43++;
                            } else {
                                i41 = iW2;
                            }
                            i42++;
                            i37 = i45;
                        } else {
                            iC = p88Var.c();
                        }
                        i47 -= iC;
                        jC = jb5.C(iW, i47, jb5.U(jN3), jb5.V(jN3));
                        int iM4 = df3Var.m(iC8);
                        zz4Var.f(iC8 + 2, jC);
                        df3Var.y(iC8);
                        iW2 = jb5.W(jC);
                        if (iW2 >= ((int) (jC & j))) {
                            df3Var.d(iC8);
                            df3Var.e(iC8);
                        } else if (iW2 >= i41) {
                            df3Var.d(iC8);
                            uz4VarO3.e(i43, uz4VarO3.c(i42));
                            i43++;
                        } else {
                            df3Var.d(iC8);
                            uz4VarO3.e(i43, uz4VarO3.c(i42));
                            i43++;
                        }
                        i42++;
                        i37 = i45;
                    }
                    int i48 = i37;
                    for (int i49 = 0; i49 < i43; i49++) {
                        int iC9 = uz4VarO3.c(i49);
                        df3Var.s(iC9, 0);
                        df3Var.u(iC9, df3Var.n(iC9));
                        df3Var.t(iC9, i11);
                        df3Var.w(iC9, i11);
                        df3Var.a(iC9);
                    }
                    uz4VarO3.b = 0;
                    df3Var.c();
                    p88Var.c += i48;
                    p88Var.d += i48;
                }
                p88Var.a(i12);
            } else {
                p88Var.b(i24 - i);
                p88Var.a(i2 - i24);
            }
            p88Var.c += i3;
        }
    }

    public final void c(int i, int i2, String str) {
        d(this, i, i2, str, str.length(), false, 32);
    }

    public final void e(int i, int i2, List list) {
        mi5 mi5Var = this.Z;
        if (i < 0 || i > mi5Var.length()) {
            kp5.k(pc6.m("start (", i, mi5Var.length(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > mi5Var.length()) {
            kp5.k(pc6.m("end (", i2, mi5Var.length(), ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            bt.q(pc6.m("Do not set reversed or empty range: ", i, i2, " > "));
            return;
        }
        f(new f88(ct7.c(i, i2)));
        c15 c15Var = this.k0;
        if (c15Var != null) {
            c15Var.g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.k0 == null) {
            this.k0 = new c15(0, new pl[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            pl plVar = (pl) list.get(i3);
            c15 c15Var2 = this.k0;
            if (c15Var2 != null) {
                c15Var2.b(pl.a(plVar, null, plVar.b + i, plVar.c + i, 9));
            }
        }
    }

    public final void f(f88 f88Var) {
        if (f88Var != null && !f88.b(f88Var.a)) {
            this.j0 = f88Var;
            return;
        }
        this.j0 = null;
        c15 c15Var = this.k0;
        if (c15Var != null) {
            c15Var.g();
        }
    }

    public final void g(long j) {
        long jC = ct7.c(0, this.Z.length());
        if (!((f88.d(jC) <= f88.d(j)) & (f88.c(j) <= f88.c(jC)))) {
            zc3.a("Expected " + f88.f(j) + " to be in " + f88.f(jC));
        }
        this.i0 = j;
        this.l0 = null;
    }

    public final String toString() {
        return this.Z.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        mi5 mi5Var = this.Z;
        b(mi5Var.length(), mi5Var.length(), 1, false);
        int length = mi5Var.length();
        int length2 = mi5Var.length();
        String strValueOf = String.valueOf(c);
        mi5Var.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            mi5 mi5Var = this.Z;
            b(mi5Var.length(), mi5Var.length(), i2 - i, false);
            int length = mi5Var.length();
            int length2 = mi5Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            mi5Var.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
