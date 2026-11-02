package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vv8 {
    public static w19 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        w19 w19VarG = w19.g(null, rootWindowInsets);
        t19 t19Var = w19VarG.a;
        t19Var.w(w19VarG);
        View rootView = view.getRootView();
        t19Var.d(rootView);
        t19Var.o(rootView);
        t19Var.p();
        return w19VarG;
    }
}
