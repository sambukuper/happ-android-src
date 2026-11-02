package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 extends jx4 implements s01, g34, w85 {
    public o88 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public o88 w0;
    public rj8 x0;

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        Z0((vi4) ug3Var);
        int i2 = this.u0;
        int i3 = this.v0;
        if (i2 == i3) {
            return i3;
        }
        int iA = tr4Var.a(i);
        int i4 = this.u0;
        int i5 = this.v0;
        if (iA < i4) {
            iA = i4;
        }
        return iA > i5 ? i5 : iA;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        if (this.t0) {
            Y0(zr4Var, a1(), (fi2) hi5.W(this, y01.k));
            this.t0 = false;
        }
        int i = this.u0;
        int iN = i != -1 ? x97.n(i, q31.i(j), q31.g(j)) : q31.i(j);
        int i2 = this.v0;
        eo5 eo5VarO = tr4Var.o(q31.a(j, 0, 0, iN, i2 != -1 ? x97.n(i2, q31.i(j), q31.g(j)) : q31.g(j), 3));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 6));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        fi2 fi2Var = (fi2) hi5.W(this, y01.k);
        this.w0 = xt7.d(this.q0, yn0.Z(this).B0);
        gi2 gi2Var = a1().a.f;
        dj2 dj2Var = a1().a.c;
        if (dj2Var == null) {
            dj2Var = dj2.g0;
        }
        bj2 bj2Var = a1().a.d;
        int i = bj2Var != null ? bj2Var.a : 0;
        cj2 cj2Var = a1().a.e;
        this.x0 = ((hi2) fi2Var).b(gi2Var, dj2Var, i, cj2Var != null ? cj2Var.a : 65535);
        ch3.N(this, new uz2(this, (byte) 0));
        this.t0 = true;
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.w0 = null;
        this.x0 = null;
        this.t0 = false;
    }

    @Override // defpackage.nh1
    public final void V() {
        this.w0 = xt7.d(this.q0, yn0.Z(this).B0);
        this.t0 = true;
        nr4.E(this);
    }

    public final void Y0(zr4 zr4Var, o88 o88Var, fi2 fi2Var) {
        v78 v78Var = c58.a(o88Var, zr4Var, fi2Var, 3, true).d;
        float fG = v78Var.g(0);
        float fG2 = v78Var.g(1);
        float fG3 = v78Var.g(2);
        this.u0 = vr3.o(fG, fG2, fG3, this.r0, 1);
        this.v0 = vr3.o(fG, fG2, fG3, this.s0, Integer.MAX_VALUE);
    }

    public final void Z0(vi4 vi4Var) {
        if (this.t0) {
            Y0(vi4Var, a1(), (fi2) hi5.W(this, y01.k));
            this.t0 = false;
        }
        int i = this.u0;
        this.u0 = i >= 0 ? i : 0;
        int i2 = this.v0;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.v0 = i2;
    }

    public final o88 a1() {
        o88 o88Var = this.w0;
        if (o88Var != null) {
            return o88Var;
        }
        throw ie2.d("Resolved style is not set.");
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        this.t0 = true;
        nr4.E(this);
    }

    @Override // defpackage.w85
    public final void q0() {
        if (this.x0 != null) {
            ch3.N(this, new uz2(this, (byte) 1));
        }
        this.t0 = true;
        nr4.E(this);
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        Z0((vi4) ug3Var);
        int i2 = this.u0;
        if (i2 == this.v0) {
            return i2;
        }
        int iK = tr4Var.K(i);
        int i3 = this.u0;
        int i4 = this.v0;
        if (iK < i3) {
            iK = i3;
        }
        return iK > i4 ? i4 : iK;
    }
}
