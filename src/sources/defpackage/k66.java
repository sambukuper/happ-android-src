package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k66 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ on2 h0;
    public final /* synthetic */ Object i0;

    public /* synthetic */ k66(boolean z, on2 on2Var, kx4 kx4Var, boolean z2, Object obj, int i, byte b) {
        this.X = b;
        this.Y = z;
        this.h0 = on2Var;
        this.Z = kx4Var;
        this.f0 = z2;
        this.i0 = obj;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        Object obj3 = this.i0;
        on2 on2Var = this.h0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                hi5.M(this.Y, (dn2) on2Var, this.Z, this.f0, (j66) obj3, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                oz7.a(this.Y, (gn2) on2Var, this.Z, this.f0, (lz7) obj3, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }
}
