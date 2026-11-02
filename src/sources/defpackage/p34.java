package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p34 implements sv1 {
    public final um0 X = new um0();
    public rv1 Y;

    @Override // defpackage.fi1
    public final float A(long j) {
        return this.X.A(j);
    }

    @Override // defpackage.sv1
    public final long A0() {
        return this.X.A0();
    }

    @Override // defpackage.sv1
    public final void C0(lf lfVar, long j) {
        this.X.C0(lfVar, j);
    }

    @Override // defpackage.fi1
    public final long D0(long j) {
        return this.X.D0(j);
    }

    @Override // defpackage.sv1
    public final void G(long j, long j2, long j3, float f, int i) {
        this.X.G(j, j2, j3, f, i);
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        return this.X.G0(j);
    }

    @Override // defpackage.sv1
    public final void H0(long j, long j2, long j3, float f, int i) {
        this.X.H0(j, j2, j3, f, i);
    }

    @Override // defpackage.sv1
    public final void L(long j, float f, long j2, tv1 tv1Var) {
        this.X.L(j, f, j2, tv1Var);
    }

    @Override // defpackage.sv1
    public final void L0(long j, float f, float f2, long j2, long j3, tv1 tv1Var) {
        this.X.L0(j, f, f2, j2, j3, tv1Var);
    }

    @Override // defpackage.fi1
    public final long M(float f) {
        return this.X.M(f);
    }

    @Override // defpackage.fi1
    public final float R(int i) {
        return this.X.R(i);
    }

    @Override // defpackage.fi1
    public final float W(float f) {
        return f / this.X.getDensity();
    }

    @Override // defpackage.sv1
    public final void Y(d90 d90Var, long j, long j2, float f, tv1 tv1Var, int i) {
        this.X.Y(d90Var, j, j2, f, tv1Var, i);
    }

    public final void a() {
        um0 um0Var = this.X;
        lr lrVar = um0Var.Y;
        sm0 sm0VarK = um0Var.Y.k();
        nh1 nh1Var = this.Y;
        if (nh1Var == null) {
            throw p61.j("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        jx4 jx4Var = (jx4) nh1Var;
        jx4 jx4VarT = jx4Var.X.h0;
        if (jx4VarT != null && (jx4VarT.f0 & 4) != 0) {
            while (true) {
                if (jx4VarT != null) {
                    int i = jx4VarT.Z;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            jx4VarT = jx4VarT.h0;
                        }
                    }
                }
                jx4VarT = null;
                break;
            }
        } else {
            jx4VarT = null;
            break;
        }
        if (jx4VarT == null) {
            i55 i55VarX = yn0.X(nh1Var, 4);
            if (i55VarX.V0() == jx4Var.X) {
                i55VarX = i55VarX.x0;
                i55VarX.getClass();
            }
            i55VarX.l1(sm0VarK, (xt2) lrVar.Z);
            return;
        }
        c15 c15Var = null;
        while (jx4VarT != null) {
            if (jx4VarT instanceof rv1) {
                rv1 rv1Var = (rv1) jx4VarT;
                xt2 xt2Var = (xt2) lrVar.Z;
                i55 i55VarX2 = yn0.X(rv1Var, 4);
                long jR = u15.R(i55VarX2.Z);
                LayoutNode layoutNode = i55VarX2.w0;
                layoutNode.getClass();
                q34.a(layoutNode).getSharedDrawScope().b(sm0VarK, jR, i55VarX2, rv1Var, xt2Var);
            } else if ((jx4VarT.Z & 4) != 0 && (jx4VarT instanceof oh1)) {
                int i2 = 0;
                for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                    if ((jx4Var2.Z & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            jx4VarT = jx4Var2;
                        } else {
                            if (c15Var == null) {
                                c15Var = new c15(0, new jx4[16]);
                            }
                            if (jx4VarT != null) {
                                c15Var.b(jx4VarT);
                                jx4VarT = null;
                            }
                            c15Var.b(jx4Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            jx4VarT = yn0.T(c15Var);
        }
    }

    public final void b(sm0 sm0Var, long j, i55 i55Var, rv1 rv1Var, xt2 xt2Var) {
        rv1 rv1Var2 = this.Y;
        this.Y = rv1Var;
        z24 z24Var = i55Var.w0.B0;
        lr lrVar = this.X.Y;
        fi1 fi1VarM = lrVar.m();
        z24 z24VarO = lrVar.o();
        sm0 sm0VarK = lrVar.k();
        long jP = lrVar.p();
        xt2 xt2Var2 = (xt2) lrVar.Z;
        lrVar.B(i55Var);
        lrVar.C(z24Var);
        lrVar.A(sm0Var);
        lrVar.D(j);
        lrVar.Z = xt2Var;
        sm0Var.g();
        try {
            rv1Var.u0(this);
            sm0Var.p();
            lrVar.B(fi1VarM);
            lrVar.C(z24VarO);
            lrVar.A(sm0VarK);
            lrVar.D(jP);
            lrVar.Z = xt2Var2;
            this.Y = rv1Var2;
        } catch (Throwable th) {
            sm0Var.p();
            lrVar.B(fi1VarM);
            lrVar.C(z24VarO);
            lrVar.A(sm0VarK);
            lrVar.D(jP);
            lrVar.Z = xt2Var2;
            throw th;
        }
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.b0();
    }

    public final void c(d90 d90Var, long j, long j2, long j3, float f, tv1 tv1Var) {
        um0 um0Var = this.X;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        um0Var.X.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), um0Var.b(d90Var, tv1Var, f, null, 3, 1));
    }

    @Override // defpackage.sv1
    public final long e() {
        return this.X.e();
    }

    @Override // defpackage.sv1
    public final void f0(long j, long j2, long j3, long j4) {
        this.X.f0(j, j2, j3, j4);
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override // defpackage.sv1
    public final z24 getLayoutDirection() {
        return this.X.X.b;
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.X.getDensity() * f;
    }

    @Override // defpackage.sv1
    public final void i(lf lfVar, d90 d90Var, float f, tv1 tv1Var, int i) {
        this.X.i(lfVar, d90Var, f, tv1Var, i);
    }

    @Override // defpackage.sv1
    public final lr n0() {
        return this.X.Y;
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.X.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.X.r(j);
    }

    @Override // defpackage.sv1
    public final void v(je jeVar, long j, float f, g60 g60Var, int i) {
        this.X.v(jeVar, j, f, g60Var, i);
    }

    @Override // defpackage.sv1
    public final void w0(je jeVar, long j, long j2, long j3, float f, g60 g60Var, int i) {
        this.X.w0(jeVar, j, j2, j3, f, g60Var, i);
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.X.x0(f);
    }
}
