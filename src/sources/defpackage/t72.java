package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends AnimatorListenerAdapter implements zd8 {
    public final View a;
    public boolean b = false;

    public t72(View view) {
        this.a = view;
    }

    @Override // defpackage.zd8
    public final void a() {
        View view = this.a;
        view.setTag(a46.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? by8.a.e(view) : 0.0f));
    }

    @Override // defpackage.zd8
    public final void f() {
        this.a.setTag(a46.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        by8.a.f(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        hy8 hy8Var = by8.a;
        hy8Var.f(view, 1.0f);
        hy8Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.zd8
    public final void b(Transition transition) {
    }

    @Override // defpackage.zd8
    public final void c(Transition transition) {
    }

    @Override // defpackage.zd8
    public final void d(Transition transition) {
    }

    @Override // defpackage.zd8
    public final void e(Transition transition) {
    }
}
