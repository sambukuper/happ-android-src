package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jg5 extends jx4 implements g34 {
    public gg5 q0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        float fB = this.q0.b(zr4Var.getLayoutDirection());
        float fD = this.q0.d();
        float fC = this.q0.c(zr4Var.getLayoutDirection());
        float fA = this.q0.a();
        if (!((kt1.a(fB, 0.0f) >= 0) & (kt1.a(fD, 0.0f) >= 0) & (kt1.a(fC, 0.0f) >= 0) & (kt1.a(fA, 0.0f) >= 0))) {
            uc3.a("Padding must be non-negative");
        }
        int iX0 = zr4Var.x0(fB);
        int iX1 = zr4Var.x0(fC) + iX0;
        int iX2 = zr4Var.x0(fD);
        int iX3 = zr4Var.x0(fA) + iX2;
        eo5 eo5VarO = tr4Var.o(s31.i(-iX1, j, -iX3));
        return zr4Var.g0(s31.g(eo5VarO.X + iX1, j), s31.f(eo5VarO.Y + iX3, j), e02.X, new me3(eo5VarO, iX0, iX2, (byte) 2));
    }
}
