package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class e19 extends k19 {
    public final WindowInsets.Builder e;

    public e19(w19 w19Var) {
        super(w19Var);
        WindowInsets windowInsetsF = w19Var.f();
        this.e = windowInsetsF != null ? h60.g(windowInsetsF) : h60.f();
    }

    @Override // defpackage.k19
    public w19 b() {
        a();
        w19 w19VarG = w19.g(null, this.e.build());
        fe3[] fe3VarArr = this.b;
        t19 t19Var = w19VarG.a;
        t19Var.v(fe3VarArr);
        t19Var.u(null);
        t19Var.z(this.c);
        t19Var.A(this.d);
        return w19VarG;
    }

    @Override // defpackage.k19
    public void e(fe3 fe3Var) {
        this.e.setMandatorySystemGestureInsets(fe3Var.e());
    }

    @Override // defpackage.k19
    public void f(fe3 fe3Var) {
        this.e.setStableInsets(fe3Var.e());
    }

    @Override // defpackage.k19
    public void g(fe3 fe3Var) {
        this.e.setSystemGestureInsets(fe3Var.e());
    }

    @Override // defpackage.k19
    public void h(fe3 fe3Var) {
        this.e.setSystemWindowInsets(fe3Var.e());
    }

    @Override // defpackage.k19
    public void i(fe3 fe3Var) {
        this.e.setTappableElementInsets(fe3Var.e());
    }

    public e19() {
        this.e = h60.f();
    }
}
