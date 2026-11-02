package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ce6 implements a94 {
    public final /* synthetic */ n84 X;
    public final /* synthetic */ ea6 Y;
    public final /* synthetic */ b71 Z;
    public final /* synthetic */ n84 f0;
    public final /* synthetic */ mm0 g0;
    public final /* synthetic */ q15 h0;
    public final /* synthetic */ rn2 i0;

    public ce6(n84 n84Var, ea6 ea6Var, b71 b71Var, n84 n84Var2, mm0 mm0Var, q15 q15Var, rn2 rn2Var) {
        this.X = n84Var;
        this.Y = ea6Var;
        this.Z = b71Var;
        this.f0 = n84Var2;
        this.g0 = mm0Var;
        this.h0 = q15Var;
        this.i0 = rn2Var;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        n84 n84Var2 = this.X;
        ea6 ea6Var = this.Y;
        if (n84Var == n84Var2) {
            ea6Var.X = w51.G(this.Z, null, null, new wu1(this.h0, this.i0, (q51) null), 3);
            return;
        }
        if (n84Var == this.f0) {
            bm3 bm3Var = (bm3) ea6Var.X;
            if (bm3Var != null) {
                bm3Var.m(null);
            }
            ea6Var.X = null;
        }
        if (n84Var == n84.ON_DESTROY) {
            this.g0.f(dn8.a);
        }
    }
}
