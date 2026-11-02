package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g64 implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ z64 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ g64(int i, z64 z64Var, Object obj) {
        this.Y = z64Var;
        this.Z = i;
        this.f0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.f0;
        int i = this.Z;
        z64 z64Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    z64Var.a(i, obj3, lp2Var, 0);
                }
                break;
            default:
                num.getClass();
                z64Var.a(i, obj3, lp2Var, w79.P(1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ g64(z64 z64Var, int i, Object obj, int i2) {
        this.Y = z64Var;
        this.Z = i;
        this.f0 = obj;
    }
}
