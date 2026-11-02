package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ak extends g24 implements rn2 {
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ g22 f0;
    public final /* synthetic */ h62 g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ zy0 i0;
    public final /* synthetic */ int j0;
    public final /* synthetic */ byte k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ak(boolean z, kx4 kx4Var, g22 g22Var, h62 h62Var, String str, zy0 zy0Var, int i, int i2) {
        super(2);
        this.Y = z;
        this.Z = kx4Var;
        this.f0 = g22Var;
        this.g0 = h62Var;
        this.h0 = str;
        this.i0 = zy0Var;
        this.j0 = i;
        this.k0 = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        zc1.c(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, w79.P(this.j0 | 1), this.k0);
        return dn8.a;
    }
}
