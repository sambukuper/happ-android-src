package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f39 implements a94 {
    public final /* synthetic */ g94 X;
    public final /* synthetic */ mm0 Y;
    public final /* synthetic */ dn2 Z;

    public f39(g94 g94Var, mm0 mm0Var, dn2 dn2Var) {
        this.X = g94Var;
        this.Y = mm0Var;
        this.Z = dn2Var;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        Object rj6Var;
        n84.Companion.getClass();
        n84 n84Var2 = n84.ON_RESUME;
        mm0 mm0Var = this.Y;
        g94 g94Var = this.X;
        if (n84Var != n84Var2) {
            if (n84Var == n84.ON_DESTROY) {
                g94Var.f(this);
                mm0Var.f(new rj6(new v84(null)));
                return;
            }
            return;
        }
        g94Var.f(this);
        try {
            rj6Var = this.Z.invoke();
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        mm0Var.f(rj6Var);
    }
}
