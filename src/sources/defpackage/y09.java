package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y09 extends b19 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final c82 f = new c82((byte) 0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, c19 c19Var) {
        jv0 jv0VarK = k(view);
        if (jv0VarK != null) {
            jv0VarK.d(c19Var);
            if (jv0VarK.X == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), c19Var);
            }
        }
    }

    public static void g(View view, c19 c19Var, w19 w19Var, boolean z) {
        jv0 jv0VarK = k(view);
        if (jv0VarK != null) {
            jv0VarK.Y = w19Var;
            if (!z) {
                jv0VarK.e(c19Var);
                z = jv0VarK.X == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), c19Var, w19Var, z);
            }
        }
    }

    public static void h(View view, w19 w19Var, List list) {
        jv0 jv0VarK = k(view);
        if (jv0VarK != null) {
            w19Var = jv0VarK.f(w19Var, list);
            if (jv0VarK.X == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), w19Var, list);
            }
        }
    }

    public static void i(View view, c19 c19Var, xd6 xd6Var) {
        jv0 jv0VarK = k(view);
        if (jv0VarK != null) {
            jv0VarK.g(c19Var, xd6Var);
            if (jv0VarK.X == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), c19Var, xd6Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(j46.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static jv0 k(View view) {
        Object tag = view.getTag(j46.tag_window_insets_animation_callback);
        if (tag instanceof x09) {
            return ((x09) tag).a;
        }
        return null;
    }
}
