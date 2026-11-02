package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f82 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ g82 b;

    public f82(g82 g82Var) {
        this.b = g82Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        g82 g82Var = this.b;
        if (((Float) g82Var.z.getAnimatedValue()).floatValue() == 0.0f) {
            g82Var.A = (byte) 0;
            g82Var.l(0);
        } else {
            g82Var.A = (byte) 2;
            g82Var.s.invalidate();
        }
    }
}
