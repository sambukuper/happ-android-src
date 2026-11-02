package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 extends ys0 {
    public final /* synthetic */ byte w0;

    public /* synthetic */ om1(byte b) {
        this.w0 = b;
    }

    @Override // defpackage.ys0
    public final float E(Object obj) {
        switch (this.w0) {
            case 0:
                return ((pm1) obj).r0.b * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    @Override // defpackage.ys0
    public final void U(Object obj, float f) {
        switch (this.w0) {
            case 0:
                pm1 pm1Var = (pm1) obj;
                pm1Var.r0.b = f / 10000.0f;
                pm1Var.invalidateSelf();
                int i = (int) f;
                j20 j20Var = pm1Var.Y;
                if (j20Var.b(true)) {
                    Context context = pm1Var.X;
                    if (pm1Var.v0 == null) {
                        int i2 = u26.motionEasingStandardInterpolator;
                        LinearInterpolator linearInterpolator = rk.a;
                        pm1Var.x0 = z39.D(context, i2, linearInterpolator);
                        pm1Var.y0 = z39.D(context, u26.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        pm1Var.v0 = valueAnimator;
                        valueAnimator.setDuration(500L);
                        pm1Var.v0.setFloatValues(0.0f, 1.0f);
                        pm1Var.v0.setInterpolator(null);
                        pm1Var.v0.addUpdateListener(new nm1((Object) pm1Var, (byte) 0));
                    }
                    float f2 = i;
                    float f3 = (f2 < j20Var.o * 10000.0f || f2 > j20Var.p * 10000.0f) ? 0.0f : 1.0f;
                    float f4 = pm1Var.s0;
                    ValueAnimator valueAnimator2 = pm1Var.v0;
                    if (f3 != f4) {
                        if (valueAnimator2.isRunning()) {
                            pm1Var.v0.cancel();
                        }
                        pm1Var.s0 = f3;
                        if (f3 != 1.0f) {
                            pm1Var.w0 = pm1Var.y0;
                            pm1Var.v0.reverse();
                        } else {
                            pm1Var.w0 = pm1Var.x0;
                            pm1Var.v0.start();
                        }
                    } else if (!valueAnimator2.isRunning()) {
                        pm1Var.r0.e = f3;
                        pm1Var.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
