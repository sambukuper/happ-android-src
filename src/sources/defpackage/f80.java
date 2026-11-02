package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f80 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kx4 Y;

    public /* synthetic */ f80(kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        kx4 kx4Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                g80.a(kx4Var, lp2Var, w79.P(1));
                break;
            case 1:
                u70.d(kx4Var, lp2Var, w79.P(7));
                break;
            case 2:
                sx2.a(kx4Var, lp2Var, w79.P(7));
                break;
            case 3:
                km4.f(kx4Var, lp2Var, w79.P(7));
                break;
            case 4:
                nr4.b(kx4Var, lp2Var, w79.P(1));
                break;
            case 5:
                du7.a(kx4Var, lp2Var, w79.P(1));
                break;
            default:
                g28.a(kx4Var, lp2Var, w79.P(7));
                break;
        }
        return dn8Var;
    }
}
