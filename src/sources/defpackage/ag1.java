package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ag1 extends we7 {
    public final bg1 c;

    public ag1(bg1 bg1Var) {
        this.c = bg1Var;
    }

    @Override // defpackage.we7
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        xe7 xe7Var = (xe7) this.c.X;
        View view = xe7Var.c.J0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        xe7Var.c(this);
        if (ml2.K(2)) {
            xe7Var.toString();
        }
    }

    @Override // defpackage.we7
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        bg1 bg1Var = this.c;
        xe7 xe7Var = (xe7) bg1Var.X;
        if (bg1Var.w0()) {
            xe7Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = xe7Var.c.J0;
        context.getClass();
        mj0 mj0VarF0 = bg1Var.F0(context);
        if (mj0VarF0 == null) {
            bt.i("Required value was null.");
            return;
        }
        Animation animation = (Animation) mj0VarF0.Y;
        if (animation == null) {
            bt.i("Required value was null.");
            return;
        }
        if (xe7Var.a != ze7.Y) {
            view.startAnimation(animation);
            xe7Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        vk2 vk2Var = new vk2(animation, viewGroup, view);
        vk2Var.setAnimationListener(new zf1(xe7Var, viewGroup, view, this));
        view.startAnimation(vk2Var);
        if (ml2.K(2)) {
            xe7Var.toString();
        }
    }
}
