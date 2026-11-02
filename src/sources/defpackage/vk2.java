package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk2 extends AnimationSet implements Runnable {
    public final ViewGroup X;
    public final View Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;

    public vk2(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.g0 = true;
        this.X = viewGroup;
        this.Y = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.g0 = true;
        if (this.Z) {
            return !this.f0;
        }
        if (!super.getTransformation(j, transformation)) {
            this.Z = true;
            db5.a(this.X, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.Z;
        ViewGroup viewGroup = this.X;
        if (z || !this.g0) {
            viewGroup.endViewTransition(this.Y);
            this.f0 = true;
        } else {
            this.g0 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.g0 = true;
        if (this.Z) {
            return !this.f0;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.Z = true;
            db5.a(this.X, this);
        }
        return true;
    }
}
