package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe implements rn2 {
    public final /* synthetic */ kx4 X;
    public final /* synthetic */ b15 Y;
    public final /* synthetic */ y05 Z;
    public final /* synthetic */ ay6 f0;
    public final /* synthetic */ x67 g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ zy0 j0;

    public xe(kx4 kx4Var, b15 b15Var, y05 y05Var, ay6 ay6Var, x67 x67Var, long j, float f, zy0 zy0Var) {
        this.X = kx4Var;
        this.Y = b15Var;
        this.Z = y05Var;
        this.f0 = ay6Var;
        this.g0 = x67Var;
        this.h0 = j;
        this.i0 = f;
        this.j0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            jm4.f(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, lp2Var, 384);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
