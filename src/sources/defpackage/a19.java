package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a19 extends b19 {
    public final WindowInsetsAnimation e;

    public a19(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static fe3 f(WindowInsetsAnimation.Bounds bounds) {
        return fe3.d(bounds.getUpperBound());
    }

    public static fe3 g(WindowInsetsAnimation.Bounds bounds) {
        return fe3.d(bounds.getLowerBound());
    }

    public static void h(View view, jv0 jv0Var) {
        view.setWindowInsetsAnimationCallback(jv0Var != null ? new z09(jv0Var) : null);
    }

    @Override // defpackage.b19
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.b19
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.b19
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.b19
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.b19
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
