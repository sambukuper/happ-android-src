package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ne3 extends ie3 implements g34 {
    public v09 s0;

    public ne3(v09 v09Var) {
        this.s0 = v09Var;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        int iD = this.r0.d(zr4Var, zr4Var.getLayoutDirection()) - this.q0.d(zr4Var, zr4Var.getLayoutDirection());
        int iA = this.r0.a(zr4Var) - this.q0.a(zr4Var);
        int iB = (this.r0.b(zr4Var, zr4Var.getLayoutDirection()) - this.q0.b(zr4Var, zr4Var.getLayoutDirection())) + iD;
        int iC = (this.r0.c(zr4Var) - this.q0.c(zr4Var)) + iA;
        eo5 eo5VarO = tr4Var.o(s31.i(-iB, j, -iC));
        return zr4Var.g0(s31.g(eo5VarO.X + iB, j), s31.f(eo5VarO.Y + iC, j), e02.X, new me3(eo5VarO, iD, iA, (byte) 0));
    }

    @Override // defpackage.ie3
    public final v09 Y0(v09 v09Var) {
        return new an8(v09Var, this.s0);
    }

    @Override // defpackage.ie3
    public final void Z0() {
        super.Z0();
        nr4.E(this);
    }
}
