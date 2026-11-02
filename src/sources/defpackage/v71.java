package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 implements ae8 {
    public final ke8 a;
    public final c73 b;
    public final int c;

    public v71(ke8 ke8Var, c73 c73Var, int i) {
        this.a = ke8Var;
        this.b = c73Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        bt.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.ae8
    public final void a() {
        ke8 ke8Var = this.a;
        Drawable drawable = ke8Var.getDrawable();
        c73 c73Var = this.b;
        d53 d53VarA = c73Var.a();
        boolean z = c73Var instanceof jw7;
        r71 r71Var = new r71(drawable, d53VarA != null ? z39.g(d53VarA, ke8Var.getView().getResources()) : null, c73Var.getRequest().p, this.c, (z && ((jw7) c73Var).g) ? false : true);
        if (z) {
            ke8Var.onSuccess(z39.h(r71Var));
        } else if (c73Var instanceof m32) {
            ke8Var.onError(z39.h(r71Var));
        } else {
            b61.c();
        }
    }
}
