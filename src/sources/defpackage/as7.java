package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class as7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ fu7 Y;
    public final /* synthetic */ gn2 Z;
    public final /* synthetic */ kx4 f0;
    public final /* synthetic */ int g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ as7(fu7 fu7Var, gn2 gn2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = fu7Var;
        this.Z = gn2Var;
        this.f0 = kx4Var;
        this.g0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        kx4 kx4Var = this.f0;
        gn2 gn2Var = this.Z;
        fu7 fu7Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                bs7.a(fu7Var, gn2Var, kx4Var, lp2Var, w79.P(i | 1));
                break;
            default:
                eu7.a(fu7Var, gn2Var, kx4Var, lp2Var, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }
}
