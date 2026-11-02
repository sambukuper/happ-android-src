package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xz6 implements sn2 {
    public final /* synthetic */ tb3 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ kl6 f0;
    public final /* synthetic */ dn2 g0;

    public xz6(tb3 tb3Var, boolean z, boolean z2, kl6 kl6Var, dn2 dn2Var) {
        this.X = tb3Var;
        this.Y = z;
        this.Z = z2;
        this.f0 = kl6Var;
        this.g0 = dn2Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        lp2 lp2Var = (lp2) obj2;
        ((Number) obj3).intValue();
        lp2Var.W(-1525724089);
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = new xz4();
            lp2Var.g0(objK);
        }
        xz4 xz4Var = (xz4) objK;
        kx4 kx4VarY = qb3.a(hx4.X, xz4Var, this.X).y(new wz6(this.Y, xz4Var, null, this.Z, this.f0, this.g0));
        lp2Var.p(false);
        return kx4VarY;
    }
}
