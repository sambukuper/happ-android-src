package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 extends xu1 {
    public lv1 L0;
    public boolean M0;
    public sn2 N0;
    public sn2 O0;
    public boolean P0;

    @Override // defpackage.xu1
    public final Object c1(pi piVar, wu1 wu1Var) {
        Object objI;
        sd5 sd5Var = this.s0;
        return (sd5Var != null && (objI = this.L0.i(new pi((Object) piVar, (Object) this, (Object) sd5Var, (q51) null, (byte) 6), wu1Var)) == c71.X) ? objI : dn8.a;
    }

    @Override // defpackage.xu1
    public final void h1(long j) {
        if (!this.p0 || dh3.f(this.N0, jv1.a)) {
            return;
        }
        w51.G(M0(), null, e71.f0, new qn0(this, j, (q51) null), 1);
    }

    @Override // defpackage.xu1
    public final void i1(hu1 hu1Var) {
        sd5 sd5Var;
        if (!this.p0 || dh3.f(this.O0, jv1.b) || (sd5Var = this.s0) == null) {
            return;
        }
        w51.G(M0(), null, e71.f0, new pi((Object) this, (Object) hu1Var, (Object) sd5Var, (q51) null, (byte) 7), 1);
    }

    @Override // defpackage.xu1
    public final boolean q1() {
        return this.M0;
    }
}
