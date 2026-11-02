package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class og5 {
    public df X;
    public boolean Y;
    public g60 Z;
    public float f0 = 1.0f;
    public z24 g0 = z24.X;

    public boolean d(float f) {
        return false;
    }

    public boolean e(g60 g60Var) {
        return false;
    }

    public final void g(sv1 sv1Var, long j, float f, g60 g60Var) {
        if (this.f0 != f) {
            if (!d(f)) {
                df dfVarC = this.X;
                if (f == 1.0f) {
                    if (dfVarC != null) {
                        dfVarC.d(f);
                    }
                    this.Y = false;
                } else {
                    if (dfVarC == null) {
                        dfVarC = u15.c();
                        this.X = dfVarC;
                    }
                    dfVarC.d(f);
                    this.Y = true;
                }
            }
            this.f0 = f;
        }
        if (!dh3.f(this.Z, g60Var)) {
            if (!e(g60Var)) {
                df dfVarC2 = this.X;
                if (g60Var == null) {
                    if (dfVarC2 != null) {
                        dfVarC2.g(null);
                    }
                    this.Y = false;
                } else {
                    if (dfVarC2 == null) {
                        dfVarC2 = u15.c();
                        this.X = dfVarC2;
                    }
                    dfVarC2.g(g60Var);
                    this.Y = true;
                }
            }
            this.Z = g60Var;
        }
        z24 layoutDirection = sv1Var.getLayoutDirection();
        if (this.g0 != layoutDirection) {
            f(layoutDirection);
            this.g0 = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((wl6) sv1Var.n0().Y).Q(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.Y) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        s86 s86VarN = u70.n(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        sm0 sm0VarK = sv1Var.n0().k();
                        df dfVarC3 = this.X;
                        if (dfVarC3 == null) {
                            dfVarC3 = u15.c();
                            this.X = dfVarC3;
                        }
                        try {
                            sm0VarK.r(s86VarN, dfVarC3);
                            i(sv1Var);
                            sm0VarK.p();
                        } catch (Throwable th) {
                            sm0VarK.p();
                            throw th;
                        }
                    } else {
                        i(sv1Var);
                    }
                }
            } catch (Throwable th2) {
                ((wl6) sv1Var.n0().Y).Q(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((wl6) sv1Var.n0().Y).Q(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public long h() {
        return 9205357640488583168L;
    }

    public abstract void i(sv1 sv1Var);

    public void f(z24 z24Var) {
    }
}
