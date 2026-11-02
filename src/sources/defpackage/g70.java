package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr4 gr4Var = ((BottomSheetBehavior) obj).j;
                if (gr4Var != null) {
                    gr4Var.u(fFloatValue);
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                g82 g82Var = (g82) obj;
                g82Var.c.setAlpha(iFloatValue);
                g82Var.d.setAlpha(iFloatValue);
                g82Var.s.invalidate();
                break;
            case 2:
                ((vi3) obj).m = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) obj).y1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
