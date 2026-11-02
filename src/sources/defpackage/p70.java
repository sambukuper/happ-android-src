package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p70 extends k70 {
    public final Boolean a;
    public final w19 b;
    public Window c;
    public boolean d;

    public p70(View view, w19 w19Var) {
        this.b = w19Var;
        gr4 gr4Var = BottomSheetBehavior.D(view).j;
        ColorStateList backgroundTintList = gr4Var != null ? gr4Var.Y.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(yn0.L(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListO = wa.o(view.getBackground());
        Integer numValueOf = colorStateListO != null ? Integer.valueOf(colorStateListO.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(yn0.L(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.k70
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.k70
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.k70
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        eu7 y19Var;
        eu7 y19Var2;
        int top = view.getTop();
        w19 w19Var = this.b;
        if (top < w19Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                lr5 lr5Var = new lr5(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    y19Var2 = new b29(window, lr5Var);
                } else if (i >= 30) {
                    y19Var2 = new z19(window, lr5Var);
                } else {
                    y19Var2 = i >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
                }
                y19Var2.k(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), w19Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                lr5 lr5Var2 = new lr5(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    y19Var = new b29(window2, lr5Var2);
                } else if (i2 >= 30) {
                    y19Var = new z19(window2, lr5Var2);
                } else {
                    y19Var = i2 >= 26 ? new y19(window2, lr5Var2) : new x19(window2, lr5Var2);
                }
                y19Var.k(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        eu7 y19Var;
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            lr5 lr5Var = new lr5(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                y19Var = new b29(window, lr5Var);
            } else if (i >= 30) {
                y19Var = new z19(window, lr5Var);
            } else {
                y19Var = i >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
            }
            this.d = y19Var.h();
        }
    }
}
