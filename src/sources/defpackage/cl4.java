package defpackage;

import android.view.animation.Animation;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cl4 implements Animation.AnimationListener {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Animation c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cl4(MainActivity mainActivity, boolean z, Animation animation) {
        this.a = mainActivity;
        this.b = z;
        this.c = animation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        boolean z = this.b;
        MainActivity mainActivity = this.a;
        mainActivity.b0(z);
        b6 b6Var = mainActivity.Q0;
        if (b6Var != null) {
            b6Var.i0.startAnimation(this.c);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
