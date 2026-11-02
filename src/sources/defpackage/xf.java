package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ byte f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ on2 i0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xf(String str, kx4 kx4Var, dn2 dn2Var, sn2 sn2Var, int i, int i2) {
        this.X = (byte) 1;
        this.g0 = str;
        this.h0 = kx4Var;
        this.Y = dn2Var;
        this.i0 = sn2Var;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Z;
        on2 on2Var = this.i0;
        Object obj3 = this.h0;
        Object obj4 = this.Y;
        Object obj5 = this.g0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bg.a((nr5) obj5, (dn2) obj4, (or5) obj3, (zy0) on2Var, (lp2) obj, w79.P(i | 1), this.f0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dh3.b((String) obj5, (kx4) obj3, (dn2) obj4, (sn2) on2Var, (lp2) obj, w79.P(i | 1), this.f0);
                break;
            default:
                ((Integer) obj2).getClass();
                jm4.i((b83) obj5, (kx4) obj4, (ow2) obj3, (tn2) on2Var, (lp2) obj, w79.P(i | 1), this.f0);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xf(Object obj, Object obj2, Object obj3, tn2 tn2Var, int i, int i2, byte b) {
        this.X = b;
        this.g0 = obj;
        this.Y = obj2;
        this.h0 = obj3;
        this.i0 = tn2Var;
        this.Z = i;
        this.f0 = i2;
    }
}
