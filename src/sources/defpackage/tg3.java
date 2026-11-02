package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tg3 extends xg3 {
    public wg3 r0;
    public boolean s0;

    @Override // defpackage.xg3, defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        return this.r0 == wg3.X ? tr4Var.K(i) : tr4Var.a(i);
    }

    @Override // defpackage.xg3
    public final long Y0(tr4 tr4Var, long j) {
        int iK = this.r0 == wg3.X ? tr4Var.K(q31.h(j)) : tr4Var.a(q31.h(j));
        if (iK < 0) {
            iK = 0;
        }
        if (iK < 0) {
            yc3.a("height must be >= 0");
        }
        return s31.h(0, Integer.MAX_VALUE, iK, iK);
    }

    @Override // defpackage.xg3
    public final boolean Z0() {
        return this.s0;
    }

    @Override // defpackage.xg3, defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        return this.r0 == wg3.X ? tr4Var.K(i) : tr4Var.a(i);
    }
}
