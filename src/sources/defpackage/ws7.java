package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ws7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ qs7 f0;
    public final /* synthetic */ gn2 g0;
    public final /* synthetic */ kx4 h0;
    public final /* synthetic */ int i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ws7(boolean z, boolean z2, qs7 qs7Var, gn2 gn2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = z;
        this.Z = z2;
        this.f0 = qs7Var;
        this.g0 = gn2Var;
        this.h0 = kx4Var;
        this.i0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.i0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                ys7.a(this.Y, this.Z, this.f0, this.g0, this.h0, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                bt7.a(this.Y, this.Z, this.f0, this.g0, this.h0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }
}
