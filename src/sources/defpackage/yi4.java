package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yi4 implements y24 {
    public final xi4 X;

    public yi4(xi4 xi4Var) {
        this.X = xi4Var;
    }

    @Override // defpackage.y24
    public final long C(y24 y24Var, long j) {
        return F(y24Var, j);
    }

    @Override // defpackage.y24
    public final long E(long j) {
        return z85.f(this.X.w0.E(j), a());
    }

    @Override // defpackage.y24
    public final long F(y24 y24Var, long j) {
        boolean z = y24Var instanceof yi4;
        xi4 xi4Var = this.X;
        if (!z) {
            xi4 xi4VarY = ci8.y(xi4Var);
            i55 i55Var = xi4VarY.w0;
            long jF = F(xi4VarY.z0, j);
            long j2 = xi4VarY.x0;
            long jE = z85.e(jF, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!i55Var.V0().p0) {
                wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            i55Var.f1();
            i55 i55Var2 = i55Var.y0;
            if (i55Var2 != null) {
                i55Var = i55Var2;
            }
            return z85.f(jE, i55Var.F(y24Var, 0L));
        }
        xi4 xi4Var2 = ((yi4) y24Var).X;
        i55 i55Var3 = xi4Var2.w0;
        i55Var3.f1();
        xi4 xi4VarT0 = xi4Var.w0.R0(i55Var3).T0();
        if (xi4VarT0 != null) {
            long jB = hf3.b(hf3.c(xi4Var2.M0(xi4VarT0, false), nr4.M(j)), xi4Var.M0(xi4VarT0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        xi4 xi4VarY2 = ci8.y(xi4Var2);
        long jC = hf3.c(hf3.c(xi4Var2.M0(xi4VarY2, false), xi4VarY2.x0), nr4.M(j));
        xi4 xi4VarY3 = ci8.y(xi4Var);
        long jB2 = hf3.b(jC, hf3.c(xi4Var.M0(xi4VarY3, false), xi4VarY3.x0));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        i55 i55Var4 = xi4VarY3.w0.y0;
        i55Var4.getClass();
        i55 i55Var5 = xi4VarY2.w0.y0;
        i55Var5.getClass();
        return i55Var4.F(i55Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.y24
    public final s86 H(y24 y24Var, boolean z) {
        return this.X.w0.H(y24Var, z);
    }

    @Override // defpackage.y24
    public final long I(long j) {
        return this.X.w0.I(z85.f(j, a()));
    }

    public final long a() {
        xi4 xi4Var = this.X;
        xi4 xi4VarY = ci8.y(xi4Var);
        return z85.e(F(xi4VarY.z0, 0L), xi4Var.w0.F(xi4VarY.w0, 0L));
    }

    @Override // defpackage.y24
    public final long b(long j) {
        return this.X.w0.b(z85.f(j, a()));
    }

    @Override // defpackage.y24
    public final boolean g() {
        return this.X.w0.V0().p0;
    }

    @Override // defpackage.y24
    public final void h(float[] fArr) {
        this.X.w0.h(fArr);
    }

    @Override // defpackage.y24
    public final long j() {
        xi4 xi4Var = this.X;
        return (((long) xi4Var.X) << 32) | (((long) xi4Var.Y) & 4294967295L);
    }

    @Override // defpackage.y24
    public final long n(long j) {
        return this.X.w0.n(z85.f(j, a()));
    }

    @Override // defpackage.y24
    public final long p(long j) {
        return z85.f(this.X.w0.p(j), a());
    }

    @Override // defpackage.y24
    public final y24 y() {
        xi4 xi4VarT0;
        if (!g()) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i55 i55Var = this.X.w0.w0.getOuterCoordinator$ui().y0;
        if (i55Var == null || (xi4VarT0 = i55Var.T0()) == null) {
            return null;
        }
        return xi4VarT0.z0;
    }
}
