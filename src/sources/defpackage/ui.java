package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ui extends g24 implements rn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ zy0 f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(ce8 ce8Var, kx4 kx4Var, ta2 ta2Var, gn2 gn2Var, zy0 zy0Var, int i) {
        super(2);
        this.Y = (byte) 2;
        this.h0 = ce8Var;
        this.Z = kx4Var;
        this.j0 = ta2Var;
        this.i0 = gn2Var;
        this.f0 = zy0Var;
        this.g0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Y;
        Object obj3 = this.h0;
        dn8 dn8Var = dn8.a;
        int i = this.g0;
        Object obj4 = this.i0;
        Object obj5 = this.j0;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = w79.P(i | 1);
                kx4 kx4Var = this.Z;
                z91.b((ce8) obj3, kx4Var, (gn2) obj4, (gn2) obj5, this.f0, (lp2) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = w79.P(i | 1);
                Object obj6 = this.h0;
                kx4 kx4Var2 = this.Z;
                km4.c(obj6, kx4Var2, (ta2) obj4, (String) obj5, this.f0, (lp2) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = w79.P(i | 1);
                kx4 kx4Var3 = this.Z;
                km4.b((ce8) obj3, kx4Var3, (ta2) obj5, (gn2) obj4, this.f0, (lp2) obj, iP3);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(Object obj, kx4 kx4Var, Object obj2, Object obj3, zy0 zy0Var, int i, byte b) {
        super(2);
        this.Y = b;
        this.h0 = obj;
        this.Z = kx4Var;
        this.i0 = obj2;
        this.j0 = obj3;
        this.f0 = zy0Var;
        this.g0 = i;
    }
}
