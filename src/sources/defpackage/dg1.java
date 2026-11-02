package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends we7 {
    public final bg1 c;
    public AnimatorSet d;

    public dg1(bg1 bg1Var) {
        this.c = bg1Var;
    }

    @Override // defpackage.we7
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        xe7 xe7Var = (xe7) this.c.X;
        if (animatorSet == null) {
            xe7Var.c(this);
            return;
        }
        if (!xe7Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            ue3.K(animatorSet);
        }
        if (ml2.K(2)) {
            xe7Var.toString();
        }
    }

    @Override // defpackage.we7
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        xe7 xe7Var = (xe7) this.c.X;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            xe7Var.c(this);
            return;
        }
        animatorSet.start();
        if (ml2.K(2)) {
            Objects.toString(xe7Var);
        }
    }

    @Override // defpackage.we7
    public final void c(j00 j00Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        xe7 xe7Var = (xe7) this.c.X;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            xe7Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !xe7Var.c.o0) {
            return;
        }
        if (ml2.K(2)) {
            xe7Var.toString();
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (j00Var.c * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (ml2.K(2)) {
            animatorSet.toString();
            xe7Var.toString();
        }
        ue3.T(animatorSet, j);
    }

    @Override // defpackage.we7
    public final void d(ViewGroup viewGroup) {
        dg1 dg1Var;
        viewGroup.getClass();
        bg1 bg1Var = this.c;
        if (bg1Var.w0()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        mj0 mj0VarF0 = bg1Var.F0(context);
        this.d = mj0VarF0 != null ? (AnimatorSet) mj0VarF0.Z : null;
        xe7 xe7Var = (xe7) bg1Var.X;
        qk2 qk2Var = xe7Var.c;
        boolean z = xe7Var.a == ze7.f0;
        View view = qk2Var.J0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            dg1Var = this;
            animatorSet.addListener(new cg1(viewGroup, view, z, xe7Var, dg1Var));
        } else {
            dg1Var = this;
        }
        AnimatorSet animatorSet2 = dg1Var.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
