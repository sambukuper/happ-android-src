package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u43 implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ zy0 Y;
    public final /* synthetic */ dn2 Z;
    public final /* synthetic */ kx4 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ int h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    public /* synthetic */ u43(zy0 zy0Var, dn2 dn2Var, kx4 kx4Var, rn2 rn2Var, boolean z, qt4 qt4Var, gg5 gg5Var, int i) {
        this.Y = zy0Var;
        this.Z = dn2Var;
        this.f0 = kx4Var;
        this.i0 = rn2Var;
        this.g0 = z;
        this.j0 = qt4Var;
        this.k0 = gg5Var;
        this.h0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.h0;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        Object obj5 = this.i0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                w45.d(this.f0, this.Z, this.g0, (x67) obj5, (s43) obj4, (xz4) obj3, this.Y, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                jm4.h(this.Y, this.Z, this.f0, (rn2) obj5, this.g0, (qt4) obj4, (gg5) obj3, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ u43(kx4 kx4Var, dn2 dn2Var, boolean z, x67 x67Var, s43 s43Var, xz4 xz4Var, zy0 zy0Var, int i) {
        this.f0 = kx4Var;
        this.Z = dn2Var;
        this.g0 = z;
        this.i0 = x67Var;
        this.j0 = s43Var;
        this.k0 = xz4Var;
        this.Y = zy0Var;
        this.h0 = i;
    }
}
