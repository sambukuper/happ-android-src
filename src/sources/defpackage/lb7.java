package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb7 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ kx4 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ sn2 l0;

    public /* synthetic */ lb7(pb7 pb7Var, wb7 wb7Var, kx4 kx4Var, jb7 jb7Var, rn2 rn2Var, sn2 sn2Var, float f, float f2, int i) {
        this.h0 = pb7Var;
        this.i0 = wb7Var;
        this.Y = kx4Var;
        this.j0 = jb7Var;
        this.k0 = rn2Var;
        this.l0 = sn2Var;
        this.Z = f;
        this.f0 = f2;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        Object obj5 = this.i0;
        Object obj6 = this.h0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                ((pb7) obj6).b((wb7) obj5, this.Y, (jb7) obj4, (rn2) obj3, this.l0, this.Z, this.f0, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                ec8.b((hc8) obj6, this.Y, (x67) obj5, this.Z, (x67) obj4, (xk6) obj3, this.f0, (zy0) this.l0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ lb7(hc8 hc8Var, kx4 kx4Var, x67 x67Var, float f, x67 x67Var2, xk6 xk6Var, float f2, zy0 zy0Var, int i) {
        this.h0 = hc8Var;
        this.Y = kx4Var;
        this.i0 = x67Var;
        this.Z = f;
        this.j0 = x67Var2;
        this.k0 = xk6Var;
        this.f0 = f2;
        this.l0 = zy0Var;
        this.g0 = i;
    }
}
