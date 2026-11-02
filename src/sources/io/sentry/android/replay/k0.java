package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import defpackage.bw0;
import defpackage.ho0;
import defpackage.u15;
import defpackage.wv0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements g, Closeable {
    public final SentryAndroidOptions X;
    public final ReplayIntegration Y;
    public final ReplayIntegration Z;
    public final io.sentry.d f0;
    public final ScheduledExecutorService g0;
    public final AtomicBoolean h0;
    public final ArrayList i0;
    public final Point j0;
    public final WeakHashMap k0;
    public final io.sentry.util.a l0;
    public final io.sentry.util.a m0;
    public final io.sentry.util.a n0;
    public volatile h0 o0;
    public volatile HandlerThread p0;
    public volatile Handler q0;

    public k0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, io.sentry.d dVar, io.sentry.android.replay.util.g gVar) {
        dVar.getClass();
        gVar.getClass();
        this.X = sentryAndroidOptions;
        this.Y = replayIntegration;
        this.Z = replayIntegration2;
        this.f0 = dVar;
        this.g0 = gVar;
        this.h0 = new AtomicBoolean(false);
        this.i0 = new ArrayList();
        this.j0 = new Point();
        this.k0 = new WeakHashMap();
        this.l0 = new io.sentry.util.a();
        this.m0 = new io.sentry.util.a();
        this.n0 = new io.sentry.util.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        io.sentry.d dVar = this.f0;
        h0 h0Var = this.o0;
        Handler handler = (Handler) dVar.Y;
        if (h0Var != null) {
            handler.removeCallbacks(h0Var);
        }
        io.sentry.util.a aVar = this.n0;
        aVar.g();
        try {
            Handler handler2 = this.q0;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.p0;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            u15.h(aVar, null);
            u();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void g(View view, boolean z) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        view.getClass();
        io.sentry.util.a aVar = this.l0;
        aVar.g();
        byte b = 2;
        byte b2 = 0;
        try {
            if (!z) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.k0.remove(view);
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                h0 h0Var = this.o0;
                if (h0Var != null && (c0Var2 = h0Var.Z) != null) {
                    c0Var2.c(view);
                }
                bw0.h0(this.i0, new j0(view, b2));
                WeakReference weakReference = (WeakReference) wv0.B0(this.i0);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    h0 h0Var2 = this.o0;
                    if (h0Var2 != null && (c0Var = h0Var2.Z) != null) {
                        c0Var.a(view2);
                    }
                    k(view2);
                    WeakHashMap weakHashMap = this.k0;
                    if (!weakHashMap.containsKey(view2)) {
                        ho0 ho0Var = new ho0(this, b);
                        weakHashMap.put(view2, ho0Var);
                        view2.addOnLayoutChangeListener(ho0Var);
                    }
                }
            } else {
                if (io.sentry.config.a.k(view) == null) {
                    this.X.getLogger().h(s5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    u15.h(aVar, null);
                    return;
                }
                this.i0.add(new WeakReference(view));
                h0 h0Var3 = this.o0;
                if (h0Var3 != null && (c0Var3 = h0Var3.Z) != null) {
                    c0Var3.a(view);
                }
                k(view);
                WeakHashMap weakHashMap2 = this.k0;
                if (!weakHashMap2.containsKey(view)) {
                    ho0 ho0Var2 = new ho0(this, b);
                    weakHashMap2.put(view, ho0Var2);
                    view.addOnLayoutChangeListener(ho0Var2);
                }
            }
            u15.h(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }

    public final void k(View view) {
        view.getClass();
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            i0 i0Var = new i0(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(i0Var);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.j0;
        if (width == point.x && view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.Z.B0(view.getWidth(), view.getHeight());
    }

    public final Handler m() {
        if (this.q0 == null) {
            io.sentry.util.a aVar = this.n0;
            aVar.g();
            try {
                if (this.q0 == null) {
                    this.p0 = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.p0;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.p0;
                    handlerThread2.getClass();
                    this.q0 = new Handler(handlerThread2.getLooper());
                }
                u15.h(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(aVar, th);
                    throw th2;
                }
            }
        }
        Handler handler = this.q0;
        handler.getClass();
        return handler;
    }

    public final void p() {
        h0 h0Var = this.o0;
        if (h0Var != null) {
            c0 c0Var = h0Var.Z;
            if (c0Var != null) {
                c0Var.Z.set(false);
                WeakReference weakReference = c0Var.Y;
                c0Var.c(weakReference != null ? (View) weakReference.get() : null);
            }
            h0Var.g0.getAndSet(false);
        }
    }

    public final void reset() {
        c0 c0Var;
        this.j0.set(0, 0);
        io.sentry.util.a aVar = this.l0;
        aVar.g();
        try {
            Iterator it = this.i0.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.k0.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    h0 h0Var = this.o0;
                    if (h0Var != null && (c0Var = h0Var.Z) != null) {
                        c0Var.c(view);
                    }
                }
            }
            this.i0.clear();
            u15.h(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }

    public final void u() {
        h0 h0Var = this.o0;
        if (h0Var != null) {
            c0 c0Var = h0Var.Z;
            if (c0Var != null) {
                c0Var.Z.set(false);
                WeakReference weakReference = c0Var.Y;
                c0Var.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = c0Var.Y;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                c0Var.g0.close();
            }
            h0Var.Z = null;
            h0Var.g0.getAndSet(false);
        }
        io.sentry.util.a aVar = this.m0;
        aVar.g();
        try {
            this.o0 = null;
            u15.h(aVar, null);
            this.h0.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }
}
