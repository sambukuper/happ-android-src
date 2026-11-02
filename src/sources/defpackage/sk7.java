package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import su.happ.proxyutility.feature.stories.StoryProgressView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sk7 implements Animator.AnimatorListener {
    public final /* synthetic */ StoryProgressView a;
    public final /* synthetic */ ValueAnimator b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sk7(StoryProgressView storyProgressView, ValueAnimator valueAnimator) {
        this.a = storyProgressView;
        this.b = valueAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        StoryProgressView storyProgressView = this.a;
        if (storyProgressView.g0) {
            return;
        }
        Object animatedValue = this.b.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() >= 1.0f) {
            storyProgressView.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
