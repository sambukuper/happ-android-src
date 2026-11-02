package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ by2 Y;
    public final /* synthetic */ ky2 Z;
    public final /* synthetic */ kx4 f0;
    public final /* synthetic */ int g0;

    public /* synthetic */ dy2(by2 by2Var, ky2 ky2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = by2Var;
        this.Z = ky2Var;
        this.f0 = kx4Var;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        kx4 kx4Var = this.f0;
        ky2 ky2Var = this.Z;
        by2 by2Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yn0.f(by2Var, ky2Var, kx4Var, lp2Var, w79.P(i | 1));
                break;
            default:
                yn0.e(by2Var, ky2Var, kx4Var, lp2Var, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }
}
