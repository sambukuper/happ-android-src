package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx2 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ int Y;
    public final /* synthetic */ byte Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ on2 h0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tx2(kx4 kx4Var, String str, zy0 zy0Var, int i, int i2) {
        this.f0 = kx4Var;
        this.g0 = str;
        this.h0 = zy0Var;
        this.Y = i;
        this.Z = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        on2 on2Var = this.h0;
        Object obj3 = this.g0;
        Object obj4 = this.f0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ci8.a((kx4) obj4, (String) obj3, (zy0) on2Var, (lp2) obj, w79.P(i | 1), this.Z);
                break;
            default:
                ((Integer) obj2).getClass();
                yn0.l((gw5) obj4, (dn2) obj3, (dn2) on2Var, (lp2) obj, w79.P(i | 1), this.Z);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tx2(gw5 gw5Var, dn2 dn2Var, dn2 dn2Var2, int i, int i2) {
        this.f0 = gw5Var;
        this.g0 = dn2Var;
        this.h0 = dn2Var2;
        this.Y = i;
        this.Z = i2;
    }
}
