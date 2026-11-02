package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx0 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ r68 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zy0 f0;
    public final /* synthetic */ int g0;

    public /* synthetic */ mx0(r68 r68Var, boolean z, zy0 zy0Var, int i, byte b) {
        this.X = b;
        this.Y = r68Var;
        this.Z = z;
        this.f0 = zy0Var;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        zy0 zy0Var = this.f0;
        boolean z = this.Z;
        r68 r68Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ch3.b(r68Var, z, zy0Var, lp2Var, w79.P(i | 1));
                break;
            default:
                yn0.c(r68Var, z, zy0Var, lp2Var, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }
}
