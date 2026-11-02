package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yx8 implements View.OnAttachStateChangeListener {
    public n97 X;
    public og7 Y;
    public xx8 Z;
    public boolean f0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        xx8 xx8Var = this.Z;
        if (xx8Var == null) {
            return;
        }
        this.f0 = true;
        v76 v76Var = xx8Var.X;
        v63 v63Var = xx8Var.Y;
        w39.J(v63Var, w51.j(v76Var.b, (s61) v76Var.a.c.getValue(), new t76(v76Var, v63Var, null, (byte) 0), 2));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        xx8 xx8Var = this.Z;
        if (xx8Var != null) {
            g94 g94Var = xx8Var.f0;
            xx8Var.g0.m(null);
            lq2 lq2Var = xx8Var.Z;
            if (lq2Var != null && g94Var != null) {
                g94Var.f(lq2Var);
            }
            if (g94Var != null) {
                g94Var.f(xx8Var);
            }
        }
    }
}
