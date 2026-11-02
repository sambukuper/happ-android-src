package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends g24 implements rn2 {
    public final /* synthetic */ byte Y = 1;
    public final /* synthetic */ ce8 Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ kx4 g0;
    public final /* synthetic */ zy0 h0;
    public final /* synthetic */ int i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(ce8 ce8Var, gn2 gn2Var, kx4 kx4Var, g22 g22Var, h62 h62Var, zy0 zy0Var, int i) {
        super(2);
        this.Z = ce8Var;
        this.f0 = gn2Var;
        this.g0 = kx4Var;
        this.j0 = g22Var;
        this.k0 = h62Var;
        this.h0 = zy0Var;
        this.i0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        int i = this.i0;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = w79.P(i | 1);
                ce8 ce8Var = this.Z;
                kx4 kx4Var = this.g0;
                gn2 gn2Var = this.f0;
                z91.d(ce8Var, kx4Var, gn2Var, (gn2) obj4, (gn2) obj3, this.h0, (lp2) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = w79.P(i | 1);
                ce8 ce8Var2 = this.Z;
                gn2 gn2Var2 = this.f0;
                kx4 kx4Var2 = this.g0;
                zc1.e(ce8Var2, gn2Var2, kx4Var2, (g22) obj4, (h62) obj3, this.h0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(ce8 ce8Var, kx4 kx4Var, gn2 gn2Var, gn2 gn2Var2, gn2 gn2Var3, zy0 zy0Var, int i) {
        super(2);
        this.Z = ce8Var;
        this.g0 = kx4Var;
        this.f0 = gn2Var;
        this.j0 = gn2Var2;
        this.k0 = gn2Var3;
        this.h0 = zy0Var;
        this.i0 = i;
    }
}
