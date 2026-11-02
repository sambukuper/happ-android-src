package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vi3 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final l e;
    public final byte f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ l o;
    public final /* synthetic */ yi3 p;

    /* JADX WARN: Multi-variable type inference failed */
    public vi3(yi3 yi3Var, l lVar, int i, float f, float f2, float f3, float f4, int i2, l lVar2) {
        this.p = yi3Var;
        this.n = i2;
        this.o = lVar2;
        this.f = i;
        this.e = lVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g70(this, (byte) 2));
        valueAnimatorOfFloat.setTarget(lVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.o(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        l lVar = this.o;
        yi3 yi3Var = this.p;
        if (i <= 0) {
            y42.a(lVar);
        } else {
            yi3Var.a.add(lVar.a);
            this.h = true;
            if (i > 0) {
                yi3Var.r.post(new pq((byte) 2, i, yi3Var, this));
            }
        }
        View view = yi3Var.w;
        View view2 = lVar.a;
        if (view == view2 && view2 == view) {
            yi3Var.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
