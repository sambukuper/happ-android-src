package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce5 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ xz4 f0;
    public final /* synthetic */ kx4 g0;
    public final /* synthetic */ i48 h0;
    public final /* synthetic */ x67 i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ float k0;
    public final /* synthetic */ int l0;
    public final /* synthetic */ short m0;
    public final /* synthetic */ Object n0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ce5(Object obj, boolean z, boolean z2, xz4 xz4Var, kx4 kx4Var, i48 i48Var, x67 x67Var, float f, float f2, int i, int i2, byte b) {
        this.X = b;
        this.n0 = obj;
        this.Y = z;
        this.Z = z2;
        this.f0 = xz4Var;
        this.g0 = kx4Var;
        this.h0 = i48Var;
        this.i0 = x67Var;
        this.j0 = f;
        this.k0 = f2;
        this.l0 = i;
        this.m0 = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.l0;
        Object obj3 = this.n0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                ((qe4) obj3).O(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, (lp2) obj, iP, this.m0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                ((lh4) obj3).K0(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, (lp2) obj, iP2, this.m0);
                break;
        }
        return dn8Var;
    }
}
