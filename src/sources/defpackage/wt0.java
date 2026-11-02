package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wt0 extends h12 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final st0 j;
    public final tt0 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public wt0(g12 g12Var) {
        super(g12Var);
        this.j = new st0(this, (byte) 0);
        this.k = new tt0(this, (byte) 0);
        this.e = u70.g0(g12Var.getContext(), u26.motionDurationShort3, 100);
        this.f = u70.g0(g12Var.getContext(), u26.motionDurationShort3, 150);
        this.g = z39.D(g12Var.getContext(), u26.motionEasingLinearInterpolator, rk.a);
        this.h = z39.D(g12Var.getContext(), u26.motionEasingEmphasizedInterpolator, rk.d);
    }

    @Override // defpackage.h12
    public final void a() {
        if (this.b.u0 != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.h12
    public final int c() {
        return h56.clear_text_end_icon_content_description;
    }

    @Override // defpackage.h12
    public final int d() {
        return p36.mtrl_ic_cancel;
    }

    @Override // defpackage.h12
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.h12
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.h12
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.h12
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.h12
    public final void o(boolean z) {
        if (this.b.u0 == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.h12
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final byte b = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ut0
            public final /* synthetic */ wt0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                wt0 wt0Var = this.b;
                switch (b2) {
                    case 0:
                        wt0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = wt0Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        final byte b2 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ut0
            public final /* synthetic */ wt0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                wt0 wt0Var = this.b;
                switch (b3) {
                    case 0:
                        wt0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = wt0Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new vt0(this, b2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ut0
            public final /* synthetic */ wt0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                wt0 wt0Var = this.b;
                switch (b3) {
                    case 0:
                        wt0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = wt0Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new vt0(this, b));
    }

    @Override // defpackage.h12
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new c1(this, (byte) 11));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            boolean z = editText.hasFocus() || this.d.hasFocus();
            boolean z2 = this.i.getText().length() > 0;
            boolean z3 = this.b.u0 != null;
            if (z && (z2 || z3)) {
                return true;
            }
        }
        return false;
    }
}
