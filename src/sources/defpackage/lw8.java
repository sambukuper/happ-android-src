package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lw8 implements Interpolator {
    public final /* synthetic */ mw8 a;

    public lw8(mw8 mw8Var) {
        this.a = mw8Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.w.getInterpolation(f);
    }
}
