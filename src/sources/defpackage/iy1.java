package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class iy1 extends ny1 {
    @Override // defpackage.ny1
    public void b(e08 e08Var, e08 e08Var2, Window window, View view, boolean z, boolean z2) {
        eu7 y19Var;
        e08Var.getClass();
        e08Var2.getClass();
        window.getClass();
        view.getClass();
        xt7.f(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        lr5 lr5Var = new lr5(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            y19Var = new b29(window, lr5Var);
        } else if (i >= 30) {
            y19Var = new z19(window, lr5Var);
        } else {
            y19Var = i >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
        }
        y19Var.k(!z);
        y19Var.j(!z2);
    }
}
