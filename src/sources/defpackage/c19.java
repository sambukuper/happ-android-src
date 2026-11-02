package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c19 {
    public b19 a;

    public c19(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new a19(na.b(i, interpolator, j));
        } else {
            this.a = new y09(i, interpolator, j);
        }
    }

    public static void a(View view, jv0 jv0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            a19.h(view, jv0Var);
            return;
        }
        PathInterpolator pathInterpolator = y09.e;
        View.OnApplyWindowInsetsListener x09Var = jv0Var != null ? new x09(view, jv0Var) : null;
        view.setTag(j46.tag_window_insets_animation_callback, x09Var);
        if (view.getTag(j46.tag_compat_insets_dispatch) == null && view.getTag(j46.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(x09Var);
        }
    }
}
