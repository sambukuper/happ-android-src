package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lw6 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zy0 Y;
    public final /* synthetic */ zy0 Z;
    public final /* synthetic */ rn2 f0;
    public final /* synthetic */ rn2 g0;
    public final /* synthetic */ e15 h0;
    public final /* synthetic */ rn2 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public lw6(int i, zy0 zy0Var, zy0 zy0Var2, rn2 rn2Var, rn2 rn2Var2, e15 e15Var, rn2 rn2Var3) {
        this.X = i;
        this.Y = zy0Var;
        this.Z = zy0Var2;
        this.f0 = rn2Var;
        this.g0 = rn2Var2;
        this.h0 = e15Var;
        this.i0 = rn2Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            wl7.j(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
