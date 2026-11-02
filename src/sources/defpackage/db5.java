package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db5 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View X;
    public ViewTreeObserver Y;
    public final Runnable Z;

    public db5(View view, Runnable runnable) {
        this.X = view;
        this.Y = view.getViewTreeObserver();
        this.Z = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            b61.i("view == null");
            return;
        }
        db5 db5Var = new db5(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(db5Var);
        view.addOnAttachStateChangeListener(db5Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.Y.isAlive();
        View view = this.X;
        if (zIsAlive) {
            this.Y.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.Z.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Y = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.Y.isAlive();
        View view2 = this.X;
        if (zIsAlive) {
            this.Y.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
