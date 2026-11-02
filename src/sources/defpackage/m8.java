package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m8 implements rn2 {
    public final /* synthetic */ rn2 X;
    public final /* synthetic */ rn2 Y;
    public final /* synthetic */ x67 Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ long i0;
    public final /* synthetic */ zy0 j0;

    public m8(rn2 rn2Var, rn2 rn2Var2, x67 x67Var, long j, long j2, long j3, long j4, zy0 zy0Var) {
        this.X = rn2Var;
        this.Y = rn2Var2;
        this.Z = x67Var;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = j3;
        this.i0 = j4;
        this.j0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            n8.a(jm4.U(1367541877, new l8(this.j0, (byte) 1), lp2Var), null, this.X, this.Y, this.Z, this.f0, kw0.c(z68.b, lp2Var), this.g0, this.h0, this.i0, lp2Var, 6);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
