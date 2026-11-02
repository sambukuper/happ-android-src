package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v43 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ v43(Object obj, String str, kx4 kx4Var, long j, int i, byte b) {
        this.X = b;
        this.h0 = obj;
        this.Y = str;
        this.Z = kx4Var;
        this.f0 = j;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        Object obj3 = this.h0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                w43.a((g73) obj3, this.Y, this.Z, this.f0, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                w43.b((og5) obj3, this.Y, this.Z, this.f0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }
}
