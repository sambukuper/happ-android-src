package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aa8 extends jx4 implements g34 {
    public xz4 q0;
    public boolean r0;
    public wf7 s0;
    public boolean t0;
    public oi u0;
    public oi v0;
    public float w0;
    public float x0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        float f;
        float f2 = vj8.s0;
        byte b = 0;
        byte b2 = 1;
        boolean z = (tr4Var.a(q31.h(j)) == 0 || tr4Var.m(q31.g(j)) == 0) ? false : true;
        if (this.t0) {
            f = vj8.n0;
        } else {
            f = (z || this.r0) ? oz7.a : oz7.b;
        }
        float fH0 = zr4Var.h0(f);
        oi oiVar = this.v0;
        int iFloatValue = (int) (oiVar != null ? ((Number) oiVar.d()).floatValue() : fH0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            yc3.a("width and height must be >= 0");
        }
        eo5 eo5VarO = tr4Var.o(s31.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fH1 = zr4Var.h0((oz7.d - zr4Var.W(fH0)) / 2.0f);
        float fH2 = zr4Var.h0((oz7.c - oz7.a) - oz7.e);
        boolean z2 = this.t0;
        if (z2 && this.r0) {
            fH1 = fH2 - zr4Var.h0(f2);
        } else if (z2 && !this.r0) {
            fH1 = zr4Var.h0(f2);
        } else if (this.r0) {
            fH1 = fH2;
        }
        oi oiVar2 = this.v0;
        q51 q51Var = null;
        Float f3 = oiVar2 != null ? (Float) oiVar2.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fH0) {
            w51.G(M0(), null, null, new z98(this, fH0, q51Var, b), 3);
        }
        oi oiVar3 = this.u0;
        Float f4 = oiVar3 != null ? (Float) oiVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fH1) {
            w51.G(M0(), null, null, new z98(this, fH1, q51Var, b2), 3);
        }
        if (Float.isNaN(this.x0) && Float.isNaN(this.w0)) {
            this.x0 = fH0;
            this.w0 = fH1;
        }
        return zr4Var.g0(iFloatValue, iFloatValue, e02.X, new cd(eo5VarO, this, fH1));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        w51.G(M0(), null, null, new ym7(this, null, (byte) 7), 3);
    }
}
