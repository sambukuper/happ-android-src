package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j40 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ on2 j0;

    public /* synthetic */ j40(nr5 nr5Var, zy0 zy0Var, jc8 jc8Var, kx4 kx4Var, boolean z, zy0 zy0Var2, int i) {
        this.f0 = nr5Var;
        this.j0 = zy0Var;
        this.g0 = jc8Var;
        this.h0 = kx4Var;
        this.Y = z;
        this.i0 = zy0Var2;
        this.Z = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Z;
        Object obj3 = this.i0;
        Object obj4 = this.h0;
        Object obj5 = this.g0;
        on2 on2Var = this.j0;
        Object obj6 = this.f0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                z68.g((nr5) obj6, (jc8) obj5, (b71) obj4, this.Y, (y05) obj3, (zy0) on2Var, (lp2) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                l51.c((String) obj6, this.Y, (h51) obj5, (kx4) obj4, (sn2) obj3, (dn2) on2Var, (lp2) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = w79.P(i | 1);
                ec8.c((nr5) obj6, (zy0) on2Var, (jc8) obj5, (kx4) obj4, this.Y, (zy0) obj3, (lp2) obj, iP3);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ j40(nr5 nr5Var, jc8 jc8Var, b71 b71Var, boolean z, y05 y05Var, zy0 zy0Var, int i) {
        this.f0 = nr5Var;
        this.g0 = jc8Var;
        this.h0 = b71Var;
        this.Y = z;
        this.i0 = y05Var;
        this.j0 = zy0Var;
        this.Z = i;
    }

    public /* synthetic */ j40(String str, boolean z, h51 h51Var, kx4 kx4Var, sn2 sn2Var, dn2 dn2Var, int i) {
        this.f0 = str;
        this.Y = z;
        this.g0 = h51Var;
        this.h0 = kx4Var;
        this.i0 = sn2Var;
        this.j0 = dn2Var;
        this.Z = i;
    }
}
