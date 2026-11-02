package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import defpackage.bs7;
import defpackage.bt;
import defpackage.ci8;
import defpackage.f66;
import defpackage.v72;
import defpackage.w72;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {
    public static final DecelerateInterpolator f0 = new DecelerateInterpolator();
    public static final v72 g0 = new v72(0);
    public static final v72 h0 = new v72(1);
    public static final v72 i0 = new v72(2);
    public static final v72 j0 = new v72(3);
    public static final v72 k0 = new v72(4);
    public final ci8 X;
    public Visibility Y;
    public final float Z;

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = new Fade();
        this.Z = -1.0f;
        w72 w72Var = new w72(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbSlide);
        int i = typedArrayObtainStyledAttributes.getInt(f66.lbSlide_lb_slideEdge, 8388611);
        if (i == 48) {
            this.X = k0;
        } else if (i == 80) {
            this.X = j0;
        } else if (i == 112) {
            this.X = w72Var;
        } else if (i == 8388611) {
            this.X = g0;
        } else if (i == 8388613) {
            this.X = h0;
        } else {
            if (i != 8388615) {
                bt.q("Invalid slide direction");
                throw null;
            }
            this.X = i0;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float a(ViewGroup viewGroup) {
        float f = this.Z;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.Y.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f = this.Z;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.Y.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.Y.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.Y = (Visibility) this.Y.clone();
        return fadeAndShortSlide;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        ci8 ci8Var = this.X;
        ObjectAnimator objectAnimatorC = bs7.c(view, transitionValues2, i, i2, ci8Var.s(this, viewGroup, view, iArr), ci8Var.t(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f0, this);
        Animator animatorOnAppear = this.Y.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimatorC == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return objectAnimatorC;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorC).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        ci8 ci8Var = this.X;
        ObjectAnimator objectAnimatorC = bs7.c(view, transitionValues, i, i2, translationX, view.getTranslationY(), ci8Var.s(this, viewGroup, view, iArr), ci8Var.t(this, viewGroup, view, iArr), f0, this);
        Animator animatorOnDisappear = this.Y.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimatorC == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return objectAnimatorC;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorC).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.Y.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.Y.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
