package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lq2 implements ke8, DefaultLifecycleObserver, r18 {
    private boolean isStarted;

    @Override // defpackage.ke8
    public abstract Drawable getDrawable();

    @Override // defpackage.ke8
    public abstract View getView();

    @Override // defpackage.r18
    public void onError(d53 d53Var) {
        updateImage(d53Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(d94 d94Var) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(d94 d94Var) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // defpackage.r18
    public void onSuccess(d53 d53Var) {
        updateImage(d53Var);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(d53 d53Var) {
        Drawable drawableG = d53Var != null ? z39.g(d53Var, getView().getResources()) : null;
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawableG);
        updateAnimation();
    }

    @Override // defpackage.r18
    public void onStart(d53 d53Var) {
        updateImage(d53Var);
    }
}
