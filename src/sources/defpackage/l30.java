package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l30 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ r68 Y;

    public /* synthetic */ l30(r68 r68Var, int i, byte b) {
        this.X = b;
        this.Y = r68Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        r68 r68Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x30.d(r68Var, lp2Var, w79.P(1));
                break;
            default:
                x30.c(r68Var, lp2Var, w79.P(1));
                break;
        }
        return dn8Var;
    }
}
