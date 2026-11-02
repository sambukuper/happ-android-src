package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class au0 implements sn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ tb3 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ dn2 f0;
    public final /* synthetic */ Object g0;

    public au0(tb3 tb3Var, boolean z, dn2 dn2Var, dn2 dn2Var2) {
        this.Y = tb3Var;
        this.Z = z;
        this.f0 = dn2Var;
        this.g0 = dn2Var2;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        Object obj4 = this.g0;
        tb3 tb3Var = this.Y;
        hx4 hx4Var = hx4.X;
        be beVar = zz0.a;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj2;
                ((Number) obj3).intValue();
                lp2Var.W(-1525724089);
                Object objK = lp2Var.K();
                if (objK == beVar) {
                    objK = new xz4();
                    lp2Var.g0(objK);
                }
                xz4 xz4Var = (xz4) objK;
                kx4 kx4VarA = qb3.a(hx4Var, xz4Var, tb3Var);
                dn2 dn2Var = this.f0;
                kx4 kx4VarY = kx4VarA.y(new yt0(xz4Var, null, false, this.Z, null, (kl6) obj4, dn2Var));
                lp2Var.p(false);
                return kx4VarY;
            default:
                lp2 lp2Var2 = (lp2) obj2;
                ((Number) obj3).intValue();
                lp2Var2.W(-1525724089);
                Object objK2 = lp2Var2.K();
                if (objK2 == beVar) {
                    objK2 = new xz4();
                    lp2Var2.g0(objK2);
                }
                xz4 xz4Var2 = (xz4) objK2;
                kx4 kx4VarY2 = qb3.a(hx4Var, xz4Var2, tb3Var).y(new zw0(this.f0, (dn2) obj4, null, xz4Var2, this.Z));
                lp2Var2.p(false);
                return kx4VarY2;
        }
    }

    public au0(tb3 tb3Var, boolean z, kl6 kl6Var, dn2 dn2Var) {
        this.Y = tb3Var;
        this.Z = z;
        this.g0 = kl6Var;
        this.f0 = dn2Var;
    }
}
