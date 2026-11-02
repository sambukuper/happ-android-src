package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dh implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kx4 Y;
    public final /* synthetic */ zy0 Z;
    public final /* synthetic */ int f0;

    public /* synthetic */ dh(kx4 kx4Var, zy0 zy0Var, int i, byte b) {
        this.X = b;
        this.Y = kx4Var;
        this.Z = zy0Var;
        this.f0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.f0;
        zy0 zy0Var = this.Z;
        kx4 kx4Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jb5.d(kx4Var, zy0Var, lp2Var, w79.P(i | 1));
                break;
            case 1:
                jb5.e(kx4Var, zy0Var, lp2Var, w79.P(i | 1));
                break;
            case 2:
                ng1.d(kx4Var, zy0Var, lp2Var, w79.P(i | 1));
                break;
            case 3:
                z91.h(kx4Var, zy0Var, lp2Var, w79.P(i | 1));
                break;
            default:
                z91.g(kx4Var, zy0Var, lp2Var, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }
}
