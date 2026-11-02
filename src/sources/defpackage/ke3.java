package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ke3 extends jv0 implements Runnable, p95, View.OnAttachStateChangeListener {
    public final c29 Z;
    public boolean f0;
    public boolean g0;
    public w19 h0;

    public ke3(c29 c29Var) {
        super(!c29Var.t ? 1 : 0);
        this.Z = c29Var;
    }

    @Override // defpackage.p95
    public final w19 C(View view, w19 w19Var) {
        this.h0 = w19Var;
        c29 c29Var = this.Z;
        kt8 kt8Var = c29Var.r;
        t19 t19Var = w19Var.a;
        kt8Var.f(ry7.i(t19Var.h(8)));
        if (this.f0) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.g0) {
            c29Var.s.f(ry7.i(t19Var.h(8)));
            c29.b(c29Var, w19Var);
        }
        return c29Var.t ? w19.b : w19Var;
    }

    @Override // defpackage.jv0
    public final void d(c19 c19Var) {
        this.f0 = false;
        this.g0 = false;
        w19 w19Var = this.h0;
        if (c19Var.a.b() > 0 && w19Var != null) {
            t19 t19Var = w19Var.a;
            c29 c29Var = this.Z;
            c29Var.s.f(ry7.i(t19Var.h(8)));
            c29Var.r.f(ry7.i(t19Var.h(8)));
            c29.b(c29Var, w19Var);
        }
        this.h0 = null;
    }

    @Override // defpackage.jv0
    public final void e(c19 c19Var) {
        this.f0 = true;
        this.g0 = true;
    }

    @Override // defpackage.jv0
    public final w19 f(w19 w19Var, List list) {
        c29 c29Var = this.Z;
        c29.b(c29Var, w19Var);
        return c29Var.t ? w19.b : w19Var;
    }

    @Override // defpackage.jv0
    public final xd6 g(c19 c19Var, xd6 xd6Var) {
        this.f0 = false;
        return xd6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f0) {
            this.f0 = false;
            this.g0 = false;
            w19 w19Var = this.h0;
            if (w19Var != null) {
                c29 c29Var = this.Z;
                c29Var.s.f(ry7.i(w19Var.a.h(8)));
                c29.b(c29Var, w19Var);
                this.h0 = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
