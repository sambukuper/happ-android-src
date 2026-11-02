package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wu implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    public /* synthetic */ wu(fv fvVar, String str, kx4 kx4Var, gn2 gn2Var, q8 q8Var, z41 z41Var, int i, int i2) {
        this.Z = fvVar;
        this.f0 = str;
        this.g0 = kx4Var;
        this.h0 = gn2Var;
        this.i0 = q8Var;
        this.j0 = z41Var;
        this.Y = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        Object obj3 = this.j0;
        Object obj4 = this.i0;
        Object obj5 = this.h0;
        Object obj6 = this.f0;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        Object obj7 = this.g0;
        Object obj8 = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                km4.a((fv) obj8, (String) obj6, (kx4) obj7, (gn2) obj5, (q8) obj4, (z41) obj3, (lp2) obj, w79.P(385), w79.P(i));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP = w79.P(i) | 1;
                ((zy0) obj8).g(this.f0, (Boolean) obj7, this.h0, this.i0, this.j0, (lp2) obj, iP);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wl7.e((lg4) obj8, (gn2) obj5, (j74) obj6, (gg5) obj4, (oh2) obj3, (kx4) obj7, (lp2) obj, w79.P(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vb7.b((wb7) obj8, (kx4) obj7, (jb7) obj6, (xz4) obj5, (zy0) obj4, (sn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ wu(zy0 zy0Var, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.Z = zy0Var;
        this.f0 = obj;
        this.g0 = bool;
        this.h0 = obj2;
        this.i0 = obj3;
        this.j0 = obj4;
        this.Y = i;
    }

    public /* synthetic */ wu(lg4 lg4Var, gn2 gn2Var, j74 j74Var, gg5 gg5Var, oh2 oh2Var, kx4 kx4Var, int i) {
        this.Z = lg4Var;
        this.h0 = gn2Var;
        this.f0 = j74Var;
        this.i0 = gg5Var;
        this.j0 = oh2Var;
        this.g0 = kx4Var;
        this.Y = i;
    }

    public /* synthetic */ wu(wb7 wb7Var, kx4 kx4Var, jb7 jb7Var, xz4 xz4Var, zy0 zy0Var, sn2 sn2Var, int i) {
        this.Z = wb7Var;
        this.g0 = kx4Var;
        this.f0 = jb7Var;
        this.h0 = xz4Var;
        this.i0 = zy0Var;
        this.j0 = sn2Var;
        this.Y = i;
    }
}
