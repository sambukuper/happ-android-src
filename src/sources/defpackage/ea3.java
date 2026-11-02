package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea3 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ kx4 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ on2 g0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ea3(kx4 kx4Var, rn2 rn2Var, int i, int i2) {
        this.Y = kx4Var;
        this.g0 = rn2Var;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.f0;
        int i = this.Z;
        on2 on2Var = this.g0;
        kx4 kx4Var = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ys0.j(z, (gn2) on2Var, kx4Var, (lp2) obj, w79.P(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                sp7.a(kx4Var, (rn2) on2Var, (lp2) obj, w79.P(i | 1), z ? 1 : 0);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ ea3(boolean z, gn2 gn2Var, kx4 kx4Var, int i) {
        this.f0 = z;
        this.g0 = gn2Var;
        this.Y = kx4Var;
        this.Z = i;
    }
}
