package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vz6 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ b83 Z;
    public final /* synthetic */ String f0;
    public final /* synthetic */ String g0;
    public final /* synthetic */ gn2 h0;
    public final /* synthetic */ kx4 i0;

    public /* synthetic */ vz6(boolean z, b83 b83Var, String str, String str2, gn2 gn2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = z;
        this.Z = b83Var;
        this.f0 = str;
        this.g0 = str2;
        this.h0 = gn2Var;
        this.i0 = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(196609);
                i21.e(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(196609);
                pn7.d(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }
}
