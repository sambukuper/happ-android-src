package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fg5 extends jx4 implements g34 {
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public boolean u0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        int iX0 = zr4Var.x0(this.s0) + zr4Var.x0(this.q0);
        int iX1 = zr4Var.x0(this.t0) + zr4Var.x0(this.r0);
        eo5 eo5VarO = tr4Var.o(s31.i(-iX0, j, -iX1));
        return zr4Var.g0(s31.g(eo5VarO.X + iX0, j), s31.f(eo5VarO.Y + iX1, j), e02.X, new zw2(this, eo5VarO, (byte) 21));
    }
}
