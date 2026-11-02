package defpackage;

import android.animation.ValueAnimator;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class sj4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainActivity b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ sj4(MainActivity mainActivity, byte b) {
        this.a = b;
        this.b = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        MainActivity mainActivity = this.b;
        switch (b) {
            case 0:
                int i = MainActivity.y1;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                b6 b6Var = mainActivity.Q0;
                if (b6Var != null) {
                    b6Var.j0.setRotation(fFloatValue);
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            default:
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                b6 b6Var2 = mainActivity.Q0;
                if (b6Var2 != null) {
                    b6Var2.j0.setRotation(fFloatValue2);
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
        }
    }
}
