package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m59 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public static final h59 a(AbstractComposeView abstractComposeView, xz0 xz0Var, zy0 zy0Var) {
        AndroidComposeView androidComposeView;
        h59 h59Var;
        byte b = 1;
        if (fs2.a.compareAndSet(false, true)) {
            x90 x90VarB = gv3.b(1, null, null, 6);
            w51.G(gv3.c((s61) yh.o0.getValue()), null, null, new r0(x90VarB, null), 3);
            vj2 vj2Var = new vj2(x90VarB, b);
            synchronized (kd7.c) {
                kd7.i = wv0.I0(kd7.i, vj2Var);
            }
            kd7.c();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(xz0Var);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), xz0Var);
                abstractComposeView.addView(androidComposeView.getView(), a);
            }
            androidComposeView.setComposeViewContext(xz0Var);
            if (abstractComposeView.getComposeViewContext() != null) {
                xz0Var.e();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = androidComposeView.getTag(g46.wrapped_composition_tag);
            h59Var = tag instanceof h59 ? (h59) tag : null;
            if (h59Var == null) {
                h59Var = new h59(androidComposeView, new r01(xz0Var.c(), new ml8(androidComposeView.getRoot())));
                androidComposeView.setTag(g46.wrapped_composition_tag, h59Var);
            }
            h59Var.b(zy0Var);
            androidComposeView.setFrameEndScheduler$ui(new l59(xz0Var.c()));
            return h59Var;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), xz0Var);
            abstractComposeView.addView(androidComposeView.getView(), a);
        }
        androidComposeView.setComposeViewContext(xz0Var);
        if (abstractComposeView.getComposeViewContext() != null) {
            xz0Var.e();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = androidComposeView.getTag(g46.wrapped_composition_tag);
        if (tag2 instanceof h59) {
        }
        if (h59Var == null) {
            h59Var = new h59(androidComposeView, new r01(xz0Var.c(), new ml8(androidComposeView.getRoot())));
            androidComposeView.setTag(g46.wrapped_composition_tag, h59Var);
        }
        h59Var.b(zy0Var);
        androidComposeView.setFrameEndScheduler$ui(new l59(xz0Var.c()));
        return h59Var;
    }
}
