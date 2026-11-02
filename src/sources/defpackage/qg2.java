package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qg2 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xe2 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ on2 f0;

    public /* synthetic */ qg2(xe2 xe2Var, Object obj, on2 on2Var, byte b) {
        this.X = b;
        this.Y = xe2Var;
        this.Z = obj;
        this.f0 = on2Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        on2 on2Var = this.f0;
        Object obj = this.Z;
        xe2 xe2Var = this.Y;
        switch (b) {
            case 0:
                Object objK = g33.k(q51Var, ze2Var, tz.n0, new dg2((sn2) on2Var, null, (byte) 2), new xe2[]{xe2Var, (xe2) obj});
                return objK == c71Var ? objK : dn8Var;
            default:
                Object objA = xe2Var.a(new zj(ze2Var, (ql6) obj, (ut8) on2Var, (byte) 5), q51Var);
                return objA == c71Var ? objA : dn8Var;
        }
    }
}
