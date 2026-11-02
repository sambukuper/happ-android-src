package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fw1 b;

    public /* synthetic */ ew1(fw1 fw1Var, byte b) {
        this.a = b;
        this.b = fw1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                fw1 fw1Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = fw1Var.i0;
                if (arrayList != null && !fw1Var.j0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ni) it.next()).a(fw1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                fw1 fw1Var = this.b;
                ArrayList arrayList = fw1Var.i0;
                if (arrayList != null && !fw1Var.j0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ni) it.next()).b(fw1Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
