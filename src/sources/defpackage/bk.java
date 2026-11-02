package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bk extends g24 implements rn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ kx4 f0;
    public final /* synthetic */ g22 g0;
    public final /* synthetic */ h62 h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ zy0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk(boolean z, kx4 kx4Var, g22 g22Var, h62 h62Var, String str, zy0 zy0Var, int i, byte b) {
        super(2);
        this.Y = b;
        this.Z = z;
        this.f0 = kx4Var;
        this.g0 = g22Var;
        this.h0 = h62Var;
        this.i0 = str;
        this.j0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = w79.P(1572871);
                zc1.b(this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, (lp2) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = w79.P(1573255);
                zc1.d(this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, (lp2) obj, iP2);
                break;
        }
        return dn8Var;
    }
}
