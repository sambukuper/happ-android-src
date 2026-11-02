package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.android.core.n0;
import io.sentry.android.core.v;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Application.ActivityLifecycleCallbacks {
    public final n0 X;
    public final CopyOnWriteArraySet Y;
    public final ILogger Z;
    public volatile Handler f0;
    public final io.sentry.util.a g0;
    public WeakReference h0;
    public final ConcurrentHashMap i0;
    public final boolean j0;
    public final d k0;
    public final p l0;
    public volatile Choreographer m0;
    public volatile Field n0;
    public long o0;
    public long p0;
    public final ConcurrentSkipListSet q0;

    /* JADX WARN: Type inference failed for: r4v4, types: [io.sentry.android.core.internal.util.p] */
    public t(Context context, v vVar, final n0 n0Var) {
        d dVar = new d();
        this.Y = new CopyOnWriteArraySet();
        this.g0 = new io.sentry.util.a();
        this.i0 = new ConcurrentHashMap();
        this.j0 = false;
        this.o0 = 0L;
        this.p0 = 0L;
        this.q0 = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.s(vVar, "Logger is required");
        this.Z = vVar;
        io.sentry.util.b.s(n0Var, "BuildInfoProvider is required");
        this.X = n0Var;
        this.k0 = dVar;
        if (context instanceof Application) {
            this.j0 = true;
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new io.sentry.android.core.anr.f(this, vVar, (byte) 1));
            this.l0 = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.p
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    this.a.b(n0Var, window, frameMetrics);
                }
            };
        }
    }

    public final long a() {
        if (this.m0 == null || this.n0 == null) {
            return -1L;
        }
        try {
            Long l = (Long) this.n0.get(this.m0);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public final void b(n0 n0Var, Window window, FrameMetrics frameMetrics) {
        long jNanoTime = System.nanoTime();
        n0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        float refreshRate = i >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long jMax = Math.max(0L, metric - ((long) (1.0E9f / refreshRate)));
        this.X.getClass();
        long metric2 = i >= 26 ? frameMetrics.getMetric(10) : a();
        if (metric2 < 0) {
            metric2 = jNanoTime - metric;
        }
        long jMax2 = Math.max(metric2, this.p0);
        if (jMax2 == this.o0) {
            return;
        }
        this.o0 = jMax2;
        long j = jMax2 + metric;
        this.p0 = j;
        boolean z = metric > ((long) (1.0E9f / (refreshRate - 1.0f)));
        boolean z2 = z && metric > 700000000;
        if (jMax > 0) {
            long j2 = j - 300000000000L;
            r rVar = new r(j2, j2);
            ConcurrentSkipListSet concurrentSkipListSet = this.q0;
            concurrentSkipListSet.headSet(rVar).clear();
            if (concurrentSkipListSet.size() < 3600) {
                concurrentSkipListSet.add(new r(jMax2, this.p0));
            }
        }
        Iterator it = this.i0.values().iterator();
        while (it.hasNext()) {
            long j3 = metric;
            long j4 = jMax;
            ((s) it.next()).b(jMax2, this.p0, j3, j4, z, z2, refreshRate);
            jMax = j4;
            metric = j3;
        }
    }

    public final String c(s sVar) {
        if (!this.j0) {
            return null;
        }
        if (this.f0 == null) {
            io.sentry.util.a aVar = this.g0;
            aVar.g();
            try {
                if (this.f0 == null) {
                    HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
                    handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.q
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            this.X.Z.e(s5.ERROR, "Error during frames measurements.", th);
                        }
                    });
                    handlerThread.start();
                    this.f0 = new Handler(handlerThread.getLooper());
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        String strF = io.sentry.config.a.f();
        this.i0.put(strF, sVar);
        e();
        return strF;
    }

    public final void d(String str) {
        if (this.j0) {
            ConcurrentHashMap concurrentHashMap = this.i0;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.h0;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new o(this, window, (byte) 1));
        }
    }

    public final void e() {
        WeakReference weakReference = this.h0;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.j0 || this.i0.isEmpty() || this.f0 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new o(this, window, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.h0;
        if (weakReference == null || weakReference.get() != window) {
            this.h0 = new WeakReference(window);
            e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new o(this, activity.getWindow(), (byte) 1));
        WeakReference weakReference = this.h0;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.h0 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
