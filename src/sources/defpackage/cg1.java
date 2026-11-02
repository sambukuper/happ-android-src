package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xe7 d;
    public final /* synthetic */ dg1 e;

    public cg1(ViewGroup viewGroup, View view, boolean z, xe7 xe7Var, dg1 dg1Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = xe7Var;
        this.e = dg1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        xe7 xe7Var = this.d;
        if (z || xe7Var.a == ze7.f0) {
            ze7 ze7Var = xe7Var.a;
            view.getClass();
            ze7Var.a(view, viewGroup);
        }
        dg1 dg1Var = this.e;
        ((xe7) dg1Var.c.X).c(dg1Var);
        if (ml2.K(2)) {
            Objects.toString(xe7Var);
        }
    }
}
