package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class xy2 implements rn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ xz4 Z;
    public final /* synthetic */ i48 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xy2(boolean z, boolean z2, xz4 xz4Var, i48 i48Var) {
        this.X = z;
        this.Y = z2;
        this.Z = xz4Var;
        this.f0 = i48Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            lh4.H0.K0(this.X, this.Y, this.Z, (kx4) null, this.f0, (x67) null, 0.0f, 0.0f, lp2Var, 100663680, 232);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
