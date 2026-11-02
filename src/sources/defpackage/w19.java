package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w19 {
    public static final w19 b;
    public final t19 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = r19.w;
        } else if (i >= 30) {
            b = p19.v;
        } else {
            b = t19.b;
        }
    }

    public w19(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new s19(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new r19(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new q19(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new p19(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new o19(this, windowInsets);
        } else if (i >= 28) {
            this.a = new n19(this, windowInsets);
        } else {
            this.a = new m19(this, windowInsets);
        }
    }

    public static fe3 e(fe3 fe3Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, fe3Var.a - i);
        int iMax2 = Math.max(0, fe3Var.b - i2);
        int iMax3 = Math.max(0, fe3Var.c - i3);
        int iMax4 = Math.max(0, fe3Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? fe3Var : fe3.c(iMax, iMax2, iMax3, iMax4);
    }

    public static w19 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w19 w19Var = new w19(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = cw8.a;
            w19 w19VarA = vv8.a(view);
            t19 t19Var = w19Var.a;
            t19Var.w(w19VarA);
            View rootView = view.getRootView();
            t19Var.d(rootView);
            t19Var.o(rootView);
            t19Var.p();
            t19Var.y(view.getWindowSystemUiVisibility());
        }
        return w19Var;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w19) {
            return Objects.equals(this.a, ((w19) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        t19 t19Var = this.a;
        if (t19Var instanceof l19) {
            return ((l19) t19Var).c;
        }
        return null;
    }

    public final int hashCode() {
        t19 t19Var = this.a;
        if (t19Var == null) {
            return 0;
        }
        return t19Var.hashCode();
    }

    public w19() {
        this.a = new t19(this);
    }
}
