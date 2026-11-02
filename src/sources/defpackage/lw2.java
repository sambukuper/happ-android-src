package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lw2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kx4 Y;
    public final /* synthetic */ dn2 Z;

    public /* synthetic */ lw2(kx4 kx4Var, dn2 dn2Var, int i, byte b) {
        this.X = b;
        this.Y = kx4Var;
        this.Z = dn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        dn2 dn2Var = this.Z;
        kx4 kx4Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gv3.e(kx4Var, dn2Var, lp2Var, w79.P(1));
                break;
            default:
                pu.b(kx4Var, dn2Var, lp2Var, w79.P(1));
                break;
        }
        return dn8Var;
    }
}
