package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah3 extends xg3 {
    public wg3 r0;
    public boolean s0;

    @Override // defpackage.xg3
    public final long Y0(tr4 tr4Var, long j) {
        int iK = this.r0 == wg3.X ? tr4Var.k(q31.g(j)) : tr4Var.m(q31.g(j));
        if (iK < 0) {
            iK = 0;
        }
        if (iK < 0) {
            yc3.a("width must be >= 0");
        }
        return s31.h(iK, iK, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.xg3
    public final boolean Z0() {
        return this.s0;
    }

    @Override // defpackage.xg3, defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        return this.r0 == wg3.X ? tr4Var.k(i) : tr4Var.m(i);
    }

    @Override // defpackage.xg3, defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        return this.r0 == wg3.X ? tr4Var.k(i) : tr4Var.m(i);
    }
}
