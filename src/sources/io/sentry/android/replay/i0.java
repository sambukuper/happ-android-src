package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.dh3;
import defpackage.wv0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ k0 X;
    public final /* synthetic */ View Y;

    public i0(k0 k0Var, View view) {
        this.X = k0Var;
        this.Y = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        k0 k0Var = this.X;
        Point point = k0Var.j0;
        WeakReference weakReference = (WeakReference) wv0.B0(k0Var.i0);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.Y;
        if (dh3.f(view2, view)) {
            view2.getClass();
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                    try {
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }
                if (view2.getWidth() != point.x || view2.getHeight() != point.y) {
                    point.set(view2.getWidth(), view2.getHeight());
                    k0Var.Z.B0(view2.getWidth(), view2.getHeight());
                }
            }
        } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
            try {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            } catch (IllegalStateException unused2) {
            }
        }
        return true;
    }
}
