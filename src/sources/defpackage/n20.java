package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n20 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v20 b;

    public /* synthetic */ n20(v20 v20Var, byte b) {
        this.a = b;
        this.b = v20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v20 v20Var = this.b;
        switch (b) {
            case 0:
                v20Var.c();
                break;
            case 1:
                v20Var.d();
                break;
            case 2:
                v20Var.c();
                break;
            default:
                v20Var.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        v20 v20Var = this.b;
        switch (b) {
            case 1:
                v20Var.j.getClass();
                break;
            case 2:
                v20Var.j.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ n20(v20 v20Var, int i, byte b) {
        this.a = b;
        this.b = v20Var;
    }
}
