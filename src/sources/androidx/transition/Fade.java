package androidx.transition;

import android.animation.ObjectAnimator;
import android.view.View;
import defpackage.a46;
import defpackage.by8;
import defpackage.ne8;
import defpackage.t72;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {
    /* JADX WARN: Multi-variable type inference failed */
    public Fade(int i) {
        this.E0 = i;
    }

    public static float N(ne8 ne8Var, float f) {
        Float f2;
        return (ne8Var == null || (f2 = (Float) ne8Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        by8.a.f(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, by8.b, f2);
        t72 t72Var = new t72(view);
        objectAnimatorOfFloat.addListener(t72Var);
        n().a(t72Var);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public final void f(ne8 ne8Var) {
        Visibility.K(ne8Var);
        View view = ne8Var.b;
        Float fValueOf = (Float) view.getTag(a46.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(by8.a.e(view)) : Float.valueOf(0.0f);
        }
        ne8Var.a.put("android:fade:transitionAlpha", fValueOf);
    }
}
