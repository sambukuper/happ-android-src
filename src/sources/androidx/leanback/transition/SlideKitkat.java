package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import defpackage.bt;
import defpackage.f66;
import defpackage.fb7;
import defpackage.gb7;
import defpackage.hb7;
import defpackage.ib7;
import defpackage.u36;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class SlideKitkat extends Visibility {
    public static final DecelerateInterpolator Y = new DecelerateInterpolator();
    public static final AccelerateInterpolator Z = new AccelerateInterpolator();
    public static final fb7 f0 = new fb7((byte) 0);
    public static final gb7 g0 = new gb7((byte) 0);
    public static final fb7 h0 = new fb7((byte) 1);
    public static final gb7 i0 = new gb7((byte) 1);
    public static final fb7 j0 = new fb7((byte) 2);
    public static final fb7 k0 = new fb7((byte) 3);
    public final hb7 X;

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbSlide);
        int i = typedArrayObtainStyledAttributes.getInt(f66.lbSlide_lb_slideEdge, 80);
        if (i == 3) {
            this.X = f0;
        } else if (i == 5) {
            this.X = h0;
        } else if (i == 48) {
            this.X = g0;
        } else if (i == 80) {
            this.X = i0;
        } else if (i == 8388611) {
            this.X = j0;
        } else {
            if (i != 8388613) {
                bt.q("Invalid slide direction");
                throw null;
            }
            this.X = k0;
        }
        long j = typedArrayObtainStyledAttributes.getInt(f66.lbSlide_android_duration, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = typedArrayObtainStyledAttributes.getInt(f66.lbSlide_android_startDelay, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(f66.lbSlide_android_interpolator, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ObjectAnimator a(View view, Property property, float f, float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(u36.lb_slide_transition_value);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(u36.lb_slide_transition_value, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        ib7 ib7Var = new ib7(view, property, f3, f2, i);
        objectAnimatorOfFloat.addListener(ib7Var);
        objectAnimatorOfFloat.addPauseListener(ib7Var);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        hb7 hb7Var = this.X;
        float fB = hb7Var.b(view);
        return a(view, hb7Var.f(), hb7Var.a(view), fB, fB, Y, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        hb7 hb7Var = this.X;
        float fB = hb7Var.b(view);
        return a(view, hb7Var.f(), fB, hb7Var.a(view), fB, Z, 4);
    }
}
