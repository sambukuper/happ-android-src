package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    public /* synthetic */ kr4(kx4 kx4Var, wb7 wb7Var, xz4 xz4Var, zy0 zy0Var, sn2 sn2Var, int i) {
        this.X = (byte) 2;
        this.Z = kx4Var;
        this.f0 = wb7Var;
        this.g0 = xz4Var;
        this.i0 = zy0Var;
        this.h0 = sn2Var;
        this.Y = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        Object obj5 = this.i0;
        Object obj6 = this.f0;
        Object obj7 = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lr4.a((iw0) obj7, (ky4) obj6, (p77) obj4, (wj8) obj3, (zy0) obj5, (lp2) obj, w79.P(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z91.i((cm5) obj7, (String) obj6, (String) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vb7.c((kx4) obj7, (wb7) obj6, (xz4) obj4, (zy0) obj5, (sn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rq7.a((kr7) obj7, (dn2) obj6, (tn2) obj4, (rn2) obj3, (o87) obj5, (lp2) obj, w79.P(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP = w79.P(i | 1);
                rq7.e((ce8) obj7, (yd8) obj6, this.g0, this.h0, (ta2) obj5, (lp2) obj, iP);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ kr4(kr7 kr7Var, dn2 dn2Var, tn2 tn2Var, rn2 rn2Var, o87 o87Var, int i) {
        this.X = (byte) 3;
        this.Z = kr7Var;
        this.f0 = dn2Var;
        this.g0 = tn2Var;
        this.h0 = rn2Var;
        this.i0 = o87Var;
        this.Y = i;
    }

    public /* synthetic */ kr4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = obj3;
        this.h0 = obj4;
        this.i0 = obj5;
        this.Y = i;
    }
}
