package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import su.happ.proxyutility.feature.stories.StoryProgressView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nm1(q09 q09Var, View view) {
        this.a = (byte) 4;
        this.b = q09Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object value;
        pk7 pk7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pm1 pm1Var = (pm1) obj;
                pm1Var.r0.e = pm1Var.w0.getInterpolation(pm1Var.v0.getAnimatedFraction());
                return;
            case 1:
                ((yw1) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                zq4 zq4Var = (zq4) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zq4Var.k.setAlpha((int) (255.0f * fFloatValue));
                zq4Var.y = fFloatValue;
                return;
            case 3:
                StoryProgressView storyProgressView = (StoryProgressView) obj;
                int i = StoryProgressView.p0;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue2 = ((Float) animatedValue).floatValue();
                storyProgressView.i0 = fFloatValue2;
                lr5 lr5Var = storyProgressView.k0;
                if (lr5Var != null) {
                    ok7 ok7Var = (ok7) lr5Var.Y;
                    wk2 wk2Var = ok7Var.t1;
                    if (wk2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    wk2Var.p0.c((int) (1000.0f * fFloatValue2), true);
                    wk2 wk2Var2 = ok7Var.t1;
                    if (wk2Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    double d = fFloatValue2 * 10.0f;
                    wk2Var2.o0.setText(String.valueOf(10 - ((int) Math.ceil(d))));
                    oh7 oh7Var = ok7Var.Y().c;
                    oh7Var.getClass();
                    do {
                        value = oh7Var.getValue();
                        pk7Var = (pk7) value;
                        pk7Var.getClass();
                    } while (!oh7Var.k(value, pk7.a(pk7Var, null, false, 10 - ((int) Math.floor(d)), null, 11)));
                }
                storyProgressView.invalidate();
                return;
            default:
                ((View) ((s09) ((q09) obj).X).j.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ nm1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
