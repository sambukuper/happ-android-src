package defpackage;

import android.graphics.Paint;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n48 extends oh1 implements g34, rv1, s01, as2, w07 {
    public sd5 A0;
    public ub8 B0;
    public ip5 C0;
    public o8 D0;
    public og7 E0;
    public f88 F0;
    public s86 G0 = new s86(-1.0f, -1.0f, -1.0f, -1.0f);
    public int H0;
    public int I0;
    public final y58 J0;
    public final w38 K0;
    public boolean s0;
    public boolean t0;
    public y78 u0;
    public kd8 v0;
    public r68 w0;
    public d90 x0;
    public boolean y0;
    public ay6 z0;

    public n48(boolean z, boolean z2, boolean z3, y78 y78Var, kd8 kd8Var, r68 r68Var, d90 d90Var, boolean z4, ay6 ay6Var, sd5 sd5Var, ub8 ub8Var, ip5 ip5Var) {
        this.s0 = z;
        this.t0 = z2;
        this.u0 = y78Var;
        this.v0 = kd8Var;
        this.w0 = r68Var;
        this.x0 = d90Var;
        this.y0 = z4;
        this.z0 = ay6Var;
        this.A0 = sd5Var;
        this.B0 = ub8Var;
        this.C0 = ip5Var;
        boolean z5 = z || z2 || z3;
        e17 e17Var = lj4.a;
        y58 a68Var = Build.VERSION.SDK_INT >= 28 ? new a68(kd8Var, r68Var, y78Var, z5) : new hh();
        Y0(a68Var);
        this.J0 = a68Var;
        w38 w38Var = new w38(this.B0, new l48(this, null), new li(this, null, (byte) 3), new py7(this, (byte) 5));
        Y0(w38Var);
        this.K0 = w38Var;
    }

    public static void b1(sv1 sv1Var, x78 x78Var) {
        sm0 sm0VarK = sv1Var.n0().k();
        long j = x78Var.c;
        float f = (int) (j >> 32);
        bz4 bz4Var = x78Var.b;
        boolean z = f < bz4Var.d || x78Var.d();
        w78 w78Var = x78Var.a;
        boolean z2 = z && w78Var.f != 3;
        if (z2) {
            s86 s86VarN = u70.n(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
            sm0VarK.g();
            sm0.q(sm0VarK, s86VarN);
        }
        qe7 qe7Var = w78Var.b.a;
        x38 x38Var = qe7Var.m;
        f78 f78Var = qe7Var.a;
        if (x38Var == null) {
            x38Var = x38.b;
        }
        x38 x38Var2 = x38Var;
        t67 t67Var = qe7Var.n;
        if (t67Var == null) {
            t67Var = t67.d;
        }
        t67 t67Var2 = t67Var;
        tv1 tv1Var = qe7Var.p;
        if (tv1Var == null) {
            tv1Var = ea2.a;
        }
        tv1 tv1Var2 = tv1Var;
        try {
            d90 d90VarC = f78Var.c();
            e78 e78Var = e78.a;
            if (d90VarC != null) {
                bz4.i(bz4Var, sm0VarK, d90VarC, f78Var != e78Var ? f78Var.a() : 1.0f, t67Var2, x38Var2, tv1Var2);
            } else {
                bz4.h(bz4Var, sm0VarK, f78Var != e78Var ? f78Var.b() : dw0.b, t67Var2, x38Var2, tv1Var2);
            }
        } finally {
            if (z2) {
                sm0VarK.p();
            }
        }
    }

    @Override // defpackage.g34
    public final yr4 K(final zr4 zr4Var, tr4 tr4Var, long j) {
        sd5 sd5Var = this.A0;
        sd5 sd5Var2 = sd5.X;
        e02 e02Var = e02.X;
        if (sd5Var == sd5Var2) {
            final eo5 eo5VarO = tr4Var.o(q31.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int iMin = Math.min(eo5VarO.Y, q31.g(j));
            final byte b = 1;
            return zr4Var.g0(eo5VarO.X, iMin, e02Var, new gn2(this) { // from class: k48
                public final /* synthetic */ n48 Y;

                {
                    this.Y = this;
                }

                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    byte b2 = b;
                    dn8 dn8Var = dn8.a;
                    zr4 zr4Var2 = zr4Var;
                    eo5 eo5Var = eo5VarO;
                    switch (b2) {
                        case 0:
                            do5 do5Var = (do5) obj;
                            int i = eo5Var.X;
                            n48 n48Var = this.Y;
                            n48Var.e1(do5Var, iMin, i, n48Var.v0.d().f0, zr4Var2.getLayoutDirection());
                            do5.h(do5Var, eo5Var, -n48Var.z0.X.l(), 0);
                            break;
                        default:
                            do5 do5Var2 = (do5) obj;
                            int i2 = eo5Var.Y;
                            n48 n48Var2 = this.Y;
                            n48Var2.e1(do5Var2, iMin, i2, n48Var2.v0.d().f0, zr4Var2.getLayoutDirection());
                            do5.h(do5Var2, eo5Var, 0, -n48Var2.z0.X.l());
                            break;
                    }
                    return dn8Var;
                }
            });
        }
        final eo5 eo5VarO2 = tr4Var.o(q31.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int iMin2 = Math.min(eo5VarO2.X, q31.h(j));
        final byte b2 = 0;
        return zr4Var.g0(iMin2, eo5VarO2.Y, e02Var, new gn2(this) { // from class: k48
            public final /* synthetic */ n48 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.gn2
            public final Object B(Object obj) {
                byte b3 = b2;
                dn8 dn8Var = dn8.a;
                zr4 zr4Var2 = zr4Var;
                eo5 eo5Var = eo5VarO2;
                switch (b3) {
                    case 0:
                        do5 do5Var = (do5) obj;
                        int i = eo5Var.X;
                        n48 n48Var = this.Y;
                        n48Var.e1(do5Var, iMin2, i, n48Var.v0.d().f0, zr4Var2.getLayoutDirection());
                        do5.h(do5Var, eo5Var, -n48Var.z0.X.l(), 0);
                        break;
                    default:
                        do5 do5Var2 = (do5) obj;
                        int i2 = eo5Var.Y;
                        n48 n48Var2 = this.Y;
                        n48Var2.e1(do5Var2, iMin2, i2, n48Var2.v0.d().f0, zr4Var2.getLayoutDirection());
                        do5.h(do5Var2, eo5Var, 0, -n48Var2.z0.X.l());
                        break;
                }
                return dn8Var;
            }
        });
    }

    @Override // defpackage.jx4
    public final void Q0() {
        r68 r68Var = this.w0;
        boolean z = this.s0;
        r68Var.h = z;
        if (z && c1()) {
            d1();
        }
    }

    public final boolean c1() {
        if (!this.y0) {
            return false;
        }
        if (!this.s0 && !this.t0) {
            return false;
        }
        d90 d90Var = this.x0;
        return ((d90Var instanceof fe7) && ((fe7) d90Var).a == 16) ? false : true;
    }

    public final void d1() {
        if (this.D0 == null) {
            this.D0 = new o8(((Boolean) hi5.W(this, y01.y)).booleanValue());
            z68.W(this);
        }
        this.E0 = w51.G(M0(), null, null, new ym7(this, null, (byte) 3), 3);
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        this.u0.d.setValue(i55Var);
        this.J0.e0(i55Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    public final void e1(do5 do5Var, int i, int i2, long j, z24 z24Var) {
        int i3;
        x78 x78VarC;
        float f;
        this.z0.Y.m(i);
        this.z0.a(i2 - i);
        f88 f88Var = this.F0;
        if (f88Var != null) {
            int i4 = f88.c;
            int i5 = (int) (j & 4294967295L);
            long j2 = f88Var.a;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.H0 && i == this.I0) {
                    i3 = -1;
                }
            } else {
                int i6 = f88.c;
                i3 = (int) (4294967295L & j);
            }
        } else {
            int i7 = f88.c;
            i3 = (int) (4294967295L & j);
        }
        if (i3 < 0 || !c1() || (x78VarC = this.u0.c()) == null) {
            return;
        }
        s86 s86VarC = x78VarC.c(x97.o(i3, new kf3(0, x78VarC.a.a.Y.length(), 1)));
        float f2 = s86VarC.a;
        float f3 = s86VarC.c;
        boolean z = z24Var == z24.Y;
        int iX0 = do5Var.x0(2.0f);
        float f4 = z ? i2 - f3 : f2;
        if (z) {
            f2 = i2 - f3;
        }
        float f5 = f2 + iX0;
        float f6 = i2;
        if (f5 > f6) {
            f5 = f6;
        }
        s86 s86VarB = s86.b(s86VarC, f4, f5, 10);
        float f7 = s86VarB.b;
        float f8 = s86VarB.a;
        s86 s86Var = this.G0;
        boolean z2 = (f8 == s86Var.a && f7 == s86Var.b && i2 == this.H0) ? false : true;
        if (z2 || i != this.I0) {
            boolean z3 = this.A0 == sd5.X;
            if (!z3) {
                f7 = f8;
            }
            float f9 = z3 ? s86VarB.d : s86VarB.c;
            int iL = this.z0.X.l();
            float f10 = iL + i;
            if (f9 > f10) {
                f = f9 - f10;
            } else {
                float f11 = iL;
                if (f7 >= f11 || f9 - f7 <= i) {
                    f = (f7 >= f11 || f9 - f7 > ((float) i)) ? 0.0f : f7 - f11;
                } else {
                    f = f9 - f10;
                }
            }
            this.F0 = new f88(j);
            this.G0 = s86VarB;
            this.I0 = i;
            this.H0 = i2;
            w51.G(M0(), null, e71.f0, new m48(f, this, z2, j, s86VarC, null), 1);
        }
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        this.J0.h(f17Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        p34 p34Var2;
        int iD;
        int iC;
        p34Var.a();
        h48 h48VarD = this.v0.d();
        x78 x78VarC = this.u0.c();
        if (x78VarC == null) {
            return;
        }
        qg5 qg5Var = h48VarD.h0;
        qg5 qg5Var2 = h48VarD.h0;
        long j = h48VarD.f0;
        if (qg5Var != null) {
            boolean z = ((h78) qg5Var.X).a;
            long j2 = ((f88) qg5Var.Y).a;
            if (f88.b(j2)) {
                p34Var2 = p34Var;
            } else {
                lf lfVarJ = x78VarC.j(f88.d(j2), f88.c(j2));
                o88 o88Var = x78VarC.a.b;
                if (z) {
                    d90 d90VarC = o88Var.a.a.c();
                    if (d90VarC != null) {
                        p34Var2 = p34Var;
                        sv1.d0(p34Var2, lfVarJ, d90VarC, 0.2f, null, 56);
                    } else {
                        p34Var2 = p34Var;
                        long jB = o88Var.b();
                        if (jB == 16) {
                            jB = dw0.b;
                        }
                        p34Var2.C0(lfVarJ, dw0.b(dw0.c(jB) * 0.2f, jB));
                    }
                } else {
                    p34Var2 = p34Var;
                    p34Var2.C0(lfVarJ, ((h88) hi5.W(this, i88.a)).b);
                }
            }
        } else {
            p34Var2 = p34Var;
        }
        if (f88.b(j)) {
            b1(p34Var2, x78VarC);
            if (qg5Var2 == null) {
                d90 d90Var = this.x0;
                boolean zC1 = c1();
                o8 o8Var = this.D0;
                r68 r68Var = this.w0;
                float fL = o8Var != null ? ((nh5) o8Var.f0).l() : 0.0f;
                if (fL != 0.0f && zC1) {
                    s86 s86VarK = r68Var.k();
                    float f = s86VarK.c;
                    float f2 = s86VarK.a;
                    float f3 = f - f2;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f3 / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(s86VarK.b)) & 4294967295L);
                    long jC = s86VarK.c();
                    um0 um0Var = p34Var2.X;
                    sm0 sm0Var = um0Var.X.c;
                    df dfVarC = um0Var.f0;
                    if (dfVarC == null) {
                        dfVarC = u15.c();
                        dfVarC.m(1);
                        um0Var.f0 = dfVarC;
                    }
                    Paint paint = dfVarC.a;
                    if (d90Var != null) {
                        d90Var.a(fL, um0Var.e(), dfVarC);
                    } else if (paint.getAlpha() / 255.0f != fL) {
                        dfVarC.d(fL);
                    }
                    if (!dh3.f(dfVarC.d, null)) {
                        dfVarC.g(null);
                    }
                    if (dfVarC.b != 3) {
                        dfVarC.e(3);
                    }
                    if (paint.getStrokeWidth() != f3) {
                        dfVarC.l(f3);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (dfVarC.b() != 0) {
                        dfVarC.j(0);
                    }
                    if (dfVarC.c() != 0) {
                        dfVarC.k(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        dfVarC.h(1);
                    }
                    sm0Var.h(jFloatToRawIntBits, jC, dfVarC);
                }
            }
        } else {
            if (qg5Var2 == null && (iD = f88.d(j)) != (iC = f88.c(j))) {
                p34Var2.C0(x78VarC.j(iD, iC), ((h88) hi5.W(this, i88.a)).b);
            }
            b1(p34Var2, x78VarC);
        }
        this.J0.u0(p34Var2);
    }
}
