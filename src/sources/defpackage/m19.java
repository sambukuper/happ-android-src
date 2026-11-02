package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class m19 extends l19 {
    public fe3 r;

    public m19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.t19
    public w19 b() {
        return w19.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.t19
    public w19 c() {
        return w19.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.t19
    public final fe3 k() {
        fe3 fe3Var = this.r;
        if (fe3Var != null) {
            return fe3Var;
        }
        WindowInsets windowInsets = this.c;
        fe3 fe3VarC = fe3.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.r = fe3VarC;
        return fe3VarC;
    }

    @Override // defpackage.t19
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.t19
    public void x(fe3 fe3Var) {
        this.r = fe3Var;
    }
}
