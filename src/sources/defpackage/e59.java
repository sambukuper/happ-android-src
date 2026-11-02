package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e59 extends jx4 implements g34 {
    public fp1 q0;
    public rn2 r0;

    @Override // defpackage.g34
    public final yr4 K(final zr4 zr4Var, tr4 tr4Var, long j) {
        final eo5 eo5VarO = tr4Var.o(s31.a(this.q0 != fp1.X ? 0 : q31.j(j), q31.h(j), this.q0 == fp1.Y ? q31.i(j) : 0, q31.g(j)));
        final int iN = x97.n(eo5VarO.X, q31.j(j), q31.h(j));
        final int iN2 = x97.n(eo5VarO.Y, q31.i(j), q31.g(j));
        return zr4Var.g0(iN, iN2, e02.X, new gn2() { // from class: d59
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                rn2 rn2Var = this.X.r0;
                eo5 eo5Var = eo5VarO;
                do5.g((do5) obj, eo5Var, ((hf3) rn2Var.K(new pf3((((long) (iN - eo5Var.X)) << 32) | (((long) (iN2 - eo5Var.Y)) & 4294967295L)), zr4Var.getLayoutDirection())).a);
                return dn8.a;
            }
        });
    }
}
