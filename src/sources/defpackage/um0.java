package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 implements sv1 {
    public final tm0 X;
    public final lr Y;
    public df Z;
    public df f0;

    public um0() {
        ii1 ii1Var = z39.Z;
        tm0 tm0Var = new tm0();
        tm0Var.a = ii1Var;
        tm0Var.b = z24.X;
        tm0Var.c = yz1.a;
        tm0Var.d = 0L;
        this.X = tm0Var;
        this.Y = new lr(this);
    }

    public static df a(um0 um0Var, long j, tv1 tv1Var, float f, int i) {
        df dfVarC = um0Var.c(tv1Var);
        if (f != 1.0f) {
            j = dw0.b(dw0.c(j) * f, j);
        }
        long jA = dfVarC.a();
        int i2 = dw0.h;
        if (!tk8.a(jA, j)) {
            dfVarC.f(j);
        }
        if (dfVarC.c != null) {
            dfVarC.i(null);
        }
        if (!dh3.f(dfVarC.d, null)) {
            dfVarC.g(null);
        }
        if (dfVarC.b != i) {
            dfVarC.e(i);
        }
        if (dfVarC.a.isFilterBitmap()) {
            return dfVarC;
        }
        dfVarC.h(1);
        return dfVarC;
    }

    @Override // defpackage.sv1
    public final void C0(lf lfVar, long j) {
        this.X.c.e(lfVar, a(this, j, ea2.a, 1.0f, 3));
    }

    @Override // defpackage.sv1
    public final void G(long j, long j2, long j3, float f, int i) {
        sm0 sm0Var = this.X.c;
        df dfVarC = this.f0;
        if (dfVarC == null) {
            dfVarC = u15.c();
            dfVarC.m(1);
            this.f0 = dfVarC;
        }
        Paint paint = dfVarC.a;
        long jA = dfVarC.a();
        int i2 = dw0.h;
        if (!tk8.a(jA, j)) {
            dfVarC.f(j);
        }
        if (dfVarC.c != null) {
            dfVarC.i(null);
        }
        if (!dh3.f(dfVarC.d, null)) {
            dfVarC.g(null);
        }
        if (dfVarC.b != 3) {
            dfVarC.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            dfVarC.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (dfVarC.b() != i) {
            dfVarC.j(i);
        }
        if (dfVarC.c() != 0) {
            dfVarC.k(0);
        }
        if (!paint.isFilterBitmap()) {
            dfVarC.h(1);
        }
        sm0Var.h(j2, j3, dfVarC);
    }

    @Override // defpackage.sv1
    public final void H0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.X.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, ea2.a, f, i));
    }

    @Override // defpackage.sv1
    public final void L(long j, float f, long j2, tv1 tv1Var) {
        this.X.c.c(f, j2, a(this, j, tv1Var, 1.0f, 3));
    }

    @Override // defpackage.sv1
    public final void L0(long j, float f, float f2, long j2, long j3, tv1 tv1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.X.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, tv1Var, 1.0f, 3));
    }

    @Override // defpackage.sv1
    public final void Y(d90 d90Var, long j, long j2, float f, tv1 tv1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.X.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(d90Var, tv1Var, f, null, i, 1));
    }

    public final df b(d90 d90Var, tv1 tv1Var, float f, g60 g60Var, int i, int i2) {
        df dfVarC = c(tv1Var);
        Paint paint = dfVarC.a;
        if (d90Var != null) {
            d90Var.a(f, e(), dfVarC);
        } else {
            if (dfVarC.c != null) {
                dfVarC.i(null);
            }
            long jA = dfVarC.a();
            long j = dw0.b;
            if (!tk8.a(jA, j)) {
                dfVarC.f(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                dfVarC.d(f);
            }
        }
        if (!dh3.f(dfVarC.d, g60Var)) {
            dfVarC.g(g60Var);
        }
        if (dfVarC.b != i) {
            dfVarC.e(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return dfVarC;
        }
        dfVarC.h(i2);
        return dfVarC;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.a.b0();
    }

    public final df c(tv1 tv1Var) {
        if (dh3.f(tv1Var, ea2.a)) {
            df dfVar = this.Z;
            if (dfVar != null) {
                return dfVar;
            }
            df dfVarC = u15.c();
            dfVarC.m(0);
            this.Z = dfVarC;
            return dfVarC;
        }
        if (!(tv1Var instanceof om7)) {
            b61.c();
            return null;
        }
        df dfVarC2 = this.f0;
        if (dfVarC2 == null) {
            dfVarC2 = u15.c();
            dfVarC2.m(1);
            this.f0 = dfVarC2;
        }
        Paint paint = dfVarC2.a;
        float strokeWidth = paint.getStrokeWidth();
        om7 om7Var = (om7) tv1Var;
        float f = om7Var.a;
        if (strokeWidth != f) {
            dfVarC2.l(f);
        }
        int iB = dfVarC2.b();
        int i = om7Var.c;
        if (iB != i) {
            dfVarC2.j(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = om7Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = dfVarC2.c();
        int i2 = om7Var.d;
        if (iC == i2) {
            return dfVarC2;
        }
        dfVarC2.k(i2);
        return dfVarC2;
    }

    @Override // defpackage.sv1
    public final void f0(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.X.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, ea2.a, 1.0f, 3));
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.a.getDensity();
    }

    @Override // defpackage.sv1
    public final z24 getLayoutDirection() {
        return this.X.b;
    }

    @Override // defpackage.sv1
    public final void i(lf lfVar, d90 d90Var, float f, tv1 tv1Var, int i) {
        this.X.c.e(lfVar, b(d90Var, tv1Var, f, null, i, 1));
    }

    @Override // defpackage.sv1
    public final lr n0() {
        return this.Y;
    }

    @Override // defpackage.sv1
    public final void v(je jeVar, long j, float f, g60 g60Var, int i) {
        this.X.c.o(jeVar, j, b(null, ea2.a, f, g60Var, i, 1));
    }

    @Override // defpackage.sv1
    public final void w0(je jeVar, long j, long j2, long j3, float f, g60 g60Var, int i) {
        this.X.c.d(jeVar, j, j2, j3, b(null, ea2.a, f, g60Var, 3, i));
    }
}
