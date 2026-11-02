package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uv8 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(j46.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static w19 b(View view, w19 w19Var, Rect rect) {
        WindowInsets windowInsetsF = w19Var.f();
        if (windowInsetsF != null) {
            return w19.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return w19Var;
    }

    public static void c(View view, p95 p95Var) {
        tv8 tv8Var = p95Var != null ? new tv8(view, p95Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(j46.tag_on_apply_window_listener, tv8Var);
        }
        if (view.getTag(j46.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (tv8Var != null) {
            view.setOnApplyWindowInsetsListener(tv8Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(j46.tag_window_insets_animation_callback));
        }
    }
}
