package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.h1;
import io.sentry.android.core.n0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener {
    public final Handler X = new Handler(Looper.getMainLooper());
    public final AtomicReference Y;
    public final Runnable Z;

    public k(View view, Runnable runnable) {
        this.Y = new AtomicReference(view);
        this.Z = runnable;
    }

    public static void a(Activity activity, Runnable runnable, n0 n0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, n0Var);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.i(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new h1(window, callback, runnable, n0Var, (byte) 2)));
            }
        }
    }

    public static void b(View view, Runnable runnable, n0 n0Var) {
        k kVar = new k(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(kVar);
        } else {
            view.addOnAttachStateChangeListener(new i(kVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.Y.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new j(this, view));
        this.X.postAtFrontOfQueue(this.Z);
    }
}
