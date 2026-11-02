package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.eb9;
import defpackage.fl6;
import defpackage.j78;
import defpackage.jn0;
import defpackage.ks2;
import defpackage.sc4;
import defpackage.wh;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.a6;
import io.sentry.b4;
import io.sentry.h7;
import io.sentry.i7;
import io.sentry.j7;
import io.sentry.k4;
import io.sentry.n3;
import io.sentry.n7;
import io.sentry.o7;
import io.sentry.p4;
import io.sentry.s2;
import io.sentry.s5;
import io.sentry.x5;
import io.sentry.y6;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements io.sentry.y1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application X;
    public final n0 Y;
    public io.sentry.i1 Z;
    public SentryAndroidOptions f0;
    public final boolean i0;
    public io.sentry.q1 l0;
    public io.sentry.s1 m0;
    public final d t0;
    public boolean g0 = false;
    public boolean h0 = false;
    public boolean j0 = false;
    public io.sentry.m0 k0 = null;
    public final WeakHashMap n0 = new WeakHashMap();
    public final WeakHashMap o0 = new WeakHashMap();
    public final WeakHashMap p0 = new WeakHashMap();
    public a5 q0 = new a6(0, 0);
    public Future r0 = null;
    public final WeakHashMap s0 = new WeakHashMap();
    public final io.sentry.util.a u0 = new io.sentry.util.a();
    public final io.sentry.util.a v0 = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, n0 n0Var, d dVar) {
        this.X = application;
        this.Y = n0Var;
        this.t0 = dVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.i0 = true;
        }
    }

    public static void k(io.sentry.q1 q1Var, io.sentry.q1 q1Var2) {
        if (q1Var == null || q1Var.e()) {
            return;
        }
        String strA = q1Var.a();
        if (strA == null || !strA.endsWith(" - Deadline Exceeded")) {
            strA = q1Var.a() + " - Deadline Exceeded";
        }
        q1Var.o(strA);
        a5 a5VarU = q1Var2 != null ? q1Var2.u() : null;
        if (a5VarU == null) {
            a5VarU = q1Var.w();
        }
        m(q1Var, a5VarU, j7.DEADLINE_EXCEEDED);
    }

    public static void m(io.sentry.q1 q1Var, a5 a5Var, j7 j7Var) {
        if (q1Var == null || q1Var.e()) {
            return;
        }
        if (j7Var == null) {
            j7Var = q1Var.t() != null ? q1Var.t() : j7.OK;
        }
        q1Var.v(j7Var, a5Var);
    }

    public final void C(Activity activity) {
        Boolean boolValueOf;
        x5 x5Var;
        a5 a5Var;
        b4 b4Var;
        Boolean bool;
        boolean z;
        String strA;
        a5 a5Var2;
        String str;
        SentryAndroidOptions sentryAndroidOptions;
        x5 x5Var2;
        b4 b4Var2;
        b4 b4Var3;
        n7 n7Var;
        io.sentry.c cVarA;
        WeakReference weakReference = new WeakReference(activity);
        if (this.Z == null || this.s0.containsKey(activity)) {
            return;
        }
        boolean z2 = this.g0;
        WeakHashMap weakHashMap = this.s0;
        if (!z2) {
            weakHashMap.put(activity, n3.a);
            if (this.f0.isEnableAutoTraceIdGeneration()) {
                this.Z.o(new io.sentry.util.c());
                return;
            }
            return;
        }
        for (Map.Entry entry : weakHashMap.entrySet()) {
            p((io.sentry.s1) entry.getValue(), (io.sentry.q1) this.n0.get(entry.getKey()), (io.sentry.q1) this.o0.get(entry.getKey()));
        }
        String simpleName = activity.getClass().getSimpleName();
        io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.f0);
        if (m0.f() && hVarB.c()) {
            x5 x5VarB = hVarB.b();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.g.c().X == io.sentry.android.core.performance.f.COLD);
            x5Var = x5VarB;
        } else {
            boolValueOf = null;
            x5Var = null;
        }
        o7 o7Var = new o7();
        long deadlineTimeout = this.f0.getDeadlineTimeout();
        o7Var.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        if (this.f0.isEnableActivityLifecycleTracingAutoFinish()) {
            o7Var.g = this.f0.getIdleTimeout();
            o7Var.c = true;
        }
        o7Var.f = true;
        o7Var.i = new e(this, weakReference, simpleName);
        if (this.j0 || x5Var == null || boolValueOf == null) {
            a5Var = this.q0;
            b4Var = null;
        } else {
            b4 b4Var4 = io.sentry.android.core.performance.g.c().m0;
            io.sentry.android.core.performance.g.c().m0 = null;
            b4Var = b4Var4;
            a5Var = x5Var;
        }
        o7Var.a = a5Var;
        o7Var.e = b4Var != null;
        o7Var.d = "auto.ui.activity";
        io.sentry.util.a aVar = (io.sentry.util.a) io.sentry.android.core.performance.g.c().z0.Y;
        aVar.g();
        aVar.close();
        boolean z3 = io.sentry.android.core.performance.g.c().u0 != null;
        boolean z4 = (this.j0 || x5Var == null || boolValueOf == null) ? false : true;
        boolean z5 = z4 && this.f0.isEnableStandaloneAppStartTracing() && !z3;
        if (z5) {
            o7 o7Var2 = new o7();
            o7Var2.b = k4.OFF;
            o7Var2.a = x5Var;
            o7Var2.e = b4Var != null;
            o7Var2.d = "auto.app.start";
            bool = boolValueOf;
            z = z3;
            io.sentry.s1 s1VarM = this.Z.m(new n7("App Start", io.sentry.protocol.h0.COMPONENT, "app.start", b4Var), o7Var2);
            this.m0 = s1VarM;
            s1VarM.j(simpleName, "app.vitals.start.screen");
            String strA2 = io.sentry.android.core.performance.g.c().a();
            if (strA2 != null) {
                this.m0.j(strA2, "app.vitals.start.reason");
            }
        } else {
            bool = boolValueOf;
            z = z3;
        }
        if (z5) {
            strA = this.m0.c().a();
            io.sentry.d dVarK = this.m0.k();
            str = dVarK == null ? null : (String) dVarK.Y;
        } else if (!z || ((a5Var2 = io.sentry.android.core.performance.g.c().x0) != null && a5Var.b(a5Var2) > 60000000000L)) {
            strA = null;
        } else {
            strA = io.sentry.android.core.performance.g.c().v0;
            str = io.sentry.android.core.performance.g.c().w0;
        }
        if (strA == null || (sentryAndroidOptions = this.f0) == null || !sentryAndroidOptions.isTracingEnabled()) {
            x5Var2 = x5Var;
            n7Var = null;
        } else {
            ILogger logger = this.f0.getLogger();
            List listSingletonList = str == null ? null : Collections.singletonList(str);
            SentryAndroidOptions sentryAndroidOptions2 = this.f0;
            try {
                y6 y6Var = new y6(strA);
                if (listSingletonList != null) {
                    wh whVar = io.sentry.c.i;
                    cVarA = io.sentry.c.a(logger, io.sentry.util.q.b(listSingletonList), false);
                    x5Var2 = x5Var;
                } else {
                    x5Var2 = x5Var;
                    try {
                        cVarA = io.sentry.c.a(logger, null, false);
                    } catch (io.sentry.exception.b e) {
                        e = e;
                        logger.d(s5.DEBUG, e, "Failed to parse Sentry trace header: %s", e.getMessage());
                        b4Var2 = new b4();
                    }
                }
                b4Var2 = b4.a(y6Var, cVarA, sentryAndroidOptions2);
            } catch (io.sentry.exception.b e2) {
                e = e2;
                x5Var2 = x5Var;
            }
            Boolean bool2 = (Boolean) b4Var2.a;
            io.sentry.c cVar = (io.sentry.c) b4Var2.e;
            if (bool2 == null) {
                b4Var3 = null;
            } else {
                Double d = cVar.c;
                Double d2 = cVar.d;
                b4Var3 = new b4(bool2, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
            }
            n7Var = new n7((io.sentry.protocol.w) b4Var2.b, (h7) b4Var2.c, null, b4Var3, cVar);
            n7Var.r0 = simpleName;
            n7Var.s0 = io.sentry.protocol.h0.COMPONENT;
            n7Var.g0 = "ui.load";
        }
        io.sentry.i1 i1Var = this.Z;
        io.sentry.s1 s1VarM2 = n7Var != null ? i1Var.m(n7Var, o7Var) : i1Var.m(new n7(simpleName, io.sentry.protocol.h0.COMPONENT, "ui.load", b4Var), o7Var);
        if (z) {
            io.sentry.android.core.performance.g.c().u0 = null;
            io.sentry.android.core.performance.g.c().v0 = null;
            io.sentry.android.core.performance.g.c().w0 = null;
        }
        boolean z6 = z5;
        i7 i7Var = new i7();
        i7Var.d = "auto.ui.activity";
        if (z4 && !z6 && !this.f0.isEnableStandaloneAppStartTracing()) {
            this.l0 = s1VarM2.n(bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start", x5Var2, io.sentry.x1.SENTRY, i7Var);
            g(null);
        }
        String strConcat = simpleName.concat(" initial display");
        io.sentry.x1 x1Var = io.sentry.x1.SENTRY;
        a5 a5Var3 = a5Var;
        io.sentry.q1 q1VarN = s1VarM2.n("ui.load.initial_display", strConcat, a5Var3, x1Var, i7Var);
        this.n0.put(activity, q1VarN);
        if (this.h0 && this.k0 != null && this.f0 != null) {
            io.sentry.q1 q1VarN2 = s1VarM2.n("ui.load.full_display", simpleName.concat(" full display"), a5Var3, x1Var, i7Var);
            try {
                this.o0.put(activity, q1VarN2);
                this.r0 = this.f0.getExecutorService().b(new sc4(this, q1VarN2, q1VarN), 25000L);
            } catch (RejectedExecutionException e3) {
                this.f0.getLogger().e(s5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e3);
            }
        }
        this.Z.o(new jn0(this, s1VarM2, (byte) 21));
        this.s0.put(activity, s1VarM2);
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        p4 p4Var = p4.a;
        this.f0 = sentryAndroidOptions;
        this.Z = p4Var;
        this.g0 = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.k0 = this.f0.getFullyDisplayedReporter();
        this.h0 = this.f0.isEnableTimeToFullDisplayTracing();
        this.X.registerActivityLifecycleCallbacks(this);
        if (this.g0 && this.f0.isEnableStandaloneAppStartTracing()) {
            io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
            gVarC.t0 = new j78(this, (byte) 11);
            if (gVarC.n0 && gVarC.p0.get() == 0 && !gVarC.q0.get() && gVarC.r0.compareAndSet(false, true)) {
                Looper.getMainLooper().getQueue().addIdleHandler(new io.sentry.android.core.performance.d(gVarC));
            }
            io.sentry.util.a aVar = (io.sentry.util.a) gVarC.z0.Y;
            aVar.g();
            aVar.close();
            io.sentry.util.b.a("StandaloneAppStart");
        }
        this.f0.getLogger().h(s5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.b.a("ActivityLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.unregisterActivityLifecycleCallbacks(this);
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        gVarC.t0 = null;
        io.sentry.util.a aVar = (io.sentry.util.a) gVarC.z0.Y;
        aVar.g();
        aVar.close();
        SentryAndroidOptions sentryAndroidOptions = this.f0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        d dVar = this.t0;
        io.sentry.util.a aVar2 = (io.sentry.util.a) dVar.g;
        aVar2.g();
        try {
            if (dVar.e()) {
                dVar.g(new fl6(dVar, (byte) 20), "FrameMetricsAggregator.stop");
                eb9 eb9Var = ((FrameMetricsAggregator) ((io.sentry.util.g) dVar.a).a()).a;
                Object obj = eb9Var.Z;
                eb9Var.Z = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) dVar.d).clear();
            aVar2.close();
        } catch (Throwable th) {
            try {
                aVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(a5 a5Var) {
        long jA;
        if (a5Var == null) {
            io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.f0);
            if (hVarB.d()) {
                if (hVarB.c()) {
                    jA = hVarB.a() + hVarB.Y;
                } else {
                    jA = 0;
                }
                a5Var = new x5(jA * 1000000);
            } else {
                a5Var = null;
            }
        }
        if (!this.g0 || a5Var == null) {
            return;
        }
        m(this.l0, a5Var, null);
        io.sentry.s1 s1Var = this.m0;
        if (s1Var != null && !s1Var.e()) {
            this.m0.v(j7.OK, a5Var);
        }
        io.sentry.internal.debugmeta.c cVar = io.sentry.android.core.performance.g.c().z0;
        io.sentry.util.a aVar = (io.sentry.util.a) cVar.Z;
        aVar.g();
        try {
            io.sentry.util.a aVar2 = (io.sentry.util.a) cVar.Y;
            aVar2.g();
            aVar2.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.m0 m0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.i0) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.util.a aVar = this.u0;
        aVar.g();
        try {
            if (this.Z != null && (sentryAndroidOptions = this.f0) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.Z.o(new ks2(io.sentry.config.a.g(activity), (byte) 2));
            }
            C(activity);
            io.sentry.q1 q1Var = (io.sentry.q1) this.n0.get(activity);
            io.sentry.q1 q1Var2 = (io.sentry.q1) this.o0.get(activity);
            this.j0 = true;
            if (this.g0 && q1Var != null && q1Var2 != null && (m0Var = this.k0) != null) {
                m0Var.a.add(new io.sentry.c2((byte) 12));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.o0;
        WeakHashMap weakHashMap2 = this.n0;
        WeakHashMap weakHashMap3 = this.p0;
        io.sentry.util.a aVar = this.u0;
        aVar.g();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity);
            if (bVar != null) {
                io.sentry.q1 q1Var = bVar.d;
                if (q1Var != null && !q1Var.e()) {
                    bVar.d.h(j7.CANCELLED);
                }
                bVar.d = null;
                io.sentry.q1 q1Var2 = bVar.e;
                if (q1Var2 != null && !q1Var2.e()) {
                    bVar.e.h(j7.CANCELLED);
                }
                bVar.e = null;
            }
            boolean z = this.g0;
            WeakHashMap weakHashMap4 = this.s0;
            if (z) {
                io.sentry.q1 q1Var3 = this.l0;
                j7 j7Var = j7.CANCELLED;
                if (q1Var3 != null && !q1Var3.e()) {
                    q1Var3.h(j7Var);
                }
                io.sentry.s1 s1Var = this.m0;
                if (s1Var != null && !s1Var.e()) {
                    this.m0.h(j7Var);
                }
                io.sentry.q1 q1Var4 = (io.sentry.q1) weakHashMap2.get(activity);
                io.sentry.q1 q1Var5 = (io.sentry.q1) weakHashMap.get(activity);
                j7 j7Var2 = j7.DEADLINE_EXCEEDED;
                if (q1Var4 != null && !q1Var4.e()) {
                    q1Var4.h(j7Var2);
                }
                k(q1Var5, q1Var4);
                Future future = this.r0;
                if (future != null) {
                    future.cancel(false);
                    this.r0 = null;
                }
                if (this.g0) {
                    p((io.sentry.s1) weakHashMap4.get(activity), null, null);
                }
                this.l0 = null;
                this.m0 = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.j0 = false;
                this.q0 = new a6(0L, 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.util.a aVar = this.u0;
        aVar.g();
        try {
            if (!this.i0) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.p0.get(activity);
        if (bVar != null) {
            io.sentry.q1 q1Var = this.m0;
            if (q1Var == null && (q1Var = this.l0) == null) {
                q1Var = (io.sentry.q1) this.s0.get(activity);
            }
            if (bVar.b == null || q1Var == null) {
                return;
            }
            io.sentry.q1 q1VarA = io.sentry.android.core.performance.b.a(q1Var, bVar.a.concat(".onCreate"), bVar.b);
            bVar.d = q1VarA;
            q1VarA.i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.p0.get(activity);
        if (bVar != null) {
            io.sentry.q1 q1Var = this.m0;
            if (q1Var == null && (q1Var = this.l0) == null) {
                q1Var = (io.sentry.q1) this.s0.get(activity);
            }
            if (bVar.c != null && q1Var != null) {
                io.sentry.q1 q1VarA = io.sentry.android.core.performance.b.a(q1Var, bVar.a.concat(".onStart"), bVar.c);
                bVar.e = q1VarA;
                q1VarA.i();
            }
            io.sentry.q1 q1Var2 = bVar.d;
            if (q1Var2 != null && bVar.e != null) {
                a5 a5VarU = q1Var2.u();
                a5 a5VarU2 = bVar.e.u();
                if (a5VarU != null && a5VarU2 != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    j.a.getClass();
                    a6 a6Var = new a6();
                    long jB = a6Var.b(bVar.d.w()) / 1000000;
                    long jB2 = a6Var.b(a5VarU) / 1000000;
                    long jB3 = a6Var.b(bVar.e.w()) / 1000000;
                    long jB4 = a6Var.b(a5VarU2) / 1000000;
                    io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
                    String strA = bVar.d.a();
                    long jD = bVar.d.w().d() / 1000000;
                    io.sentry.android.core.performance.h hVar = cVar.X;
                    hVar.X = strA;
                    hVar.Y = jD;
                    hVar.Z = jUptimeMillis - jB;
                    hVar.f0 = jUptimeMillis - jB2;
                    String strA2 = bVar.e.a();
                    long jD2 = bVar.e.w().d() / 1000000;
                    io.sentry.android.core.performance.h hVar2 = cVar.Y;
                    hVar2.X = strA2;
                    hVar2.Y = jD2;
                    hVar2.Z = jUptimeMillis - jB3;
                    hVar2.f0 = jUptimeMillis - jB4;
                    io.sentry.android.core.performance.g.c().j0.add(cVar);
                }
            }
        }
        g(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        a5 a6Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.p0.put(activity, bVar);
        if (this.j0) {
            return;
        }
        io.sentry.i1 i1Var = this.Z;
        if (i1Var != null) {
            a6Var = i1Var.i().getDateProvider().a();
        } else {
            j.a.getClass();
            a6Var = new a6();
        }
        this.q0 = a6Var;
        bVar.b = a6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        a5 a6Var;
        this.j0 = true;
        io.sentry.i1 i1Var = this.Z;
        if (i1Var != null) {
            a6Var = i1Var.i().getDateProvider().a();
        } else {
            j.a.getClass();
            a6Var = new a6();
        }
        this.q0 = a6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        a5 a6Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.p0.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f0;
            if (sentryAndroidOptions != null) {
                a6Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                j.a.getClass();
                a6Var = new a6();
            }
            bVar.c = a6Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.u0;
        aVar.g();
        try {
            if (!this.i0) {
                onActivityPostStarted(activity);
            }
            if (this.g0) {
                final io.sentry.q1 q1Var = (io.sentry.q1) this.n0.get(activity);
                final io.sentry.q1 q1Var2 = (io.sentry.q1) this.o0.get(activity);
                if (activity.getWindow() != null) {
                    final byte b = 0;
                    io.sentry.android.core.internal.util.k.a(activity, new Runnable(this) { // from class: io.sentry.android.core.f
                        public final /* synthetic */ ActivityLifecycleIntegration Y;

                        {
                            this.Y = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            io.sentry.q1 q1Var3 = q1Var;
                            io.sentry.q1 q1Var4 = q1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.Y;
                            switch (b2) {
                                case 0:
                                    activityLifecycleIntegration.u(q1Var4, q1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.u(q1Var4, q1Var3);
                                    break;
                            }
                        }
                    }, this.Y);
                } else {
                    final byte b2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.f
                        public final /* synthetic */ ActivityLifecycleIntegration Y;

                        {
                            this.Y = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            io.sentry.q1 q1Var3 = q1Var;
                            io.sentry.q1 q1Var4 = q1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.Y;
                            switch (b3) {
                                case 0:
                                    activityLifecycleIntegration.u(q1Var4, q1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.u(q1Var4, q1Var3);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.u0;
        aVar.g();
        try {
            if (!this.i0) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.g0) {
                this.t0.a(activity);
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

    public final void p(io.sentry.s1 s1Var, io.sentry.q1 q1Var, io.sentry.q1 q1Var2) {
        if (s1Var == null || s1Var.e()) {
            return;
        }
        j7 j7Var = j7.DEADLINE_EXCEEDED;
        if (q1Var != null && !q1Var.e()) {
            q1Var.h(j7Var);
        }
        k(q1Var2, q1Var);
        Future future = this.r0;
        if (future != null) {
            future.cancel(false);
            this.r0 = null;
        }
        j7 j7VarT = s1Var.t();
        if (j7VarT == null) {
            j7VarT = j7.OK;
        }
        s1Var.h(j7VarT);
        io.sentry.i1 i1Var = this.Z;
        if (i1Var != null) {
            i1Var.o(new j78(this, s1Var, (byte) 12));
        }
    }

    public final void u(io.sentry.q1 q1Var, io.sentry.q1 q1Var2) {
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        io.sentry.android.core.performance.h hVar = gVarC.f0;
        io.sentry.android.core.performance.h hVar2 = gVarC.g0;
        SentryAndroidOptions sentryAndroidOptions = this.f0;
        a5 a5VarA = sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : null;
        if (hVar.c() && hVar.f0 == 0) {
            x5 x5VarB = hVar.b();
            if (a5VarA == null || x5VarB == null) {
                hVar.f0 = SystemClock.uptimeMillis();
            } else {
                hVar.f0 = hVar.Z + (a5VarA.b(x5VarB) / 1000000);
            }
        }
        if (hVar2.c() && hVar2.f0 == 0) {
            x5 x5VarB2 = hVar2.b();
            if (a5VarA == null || x5VarB2 == null) {
                hVar2.f0 = SystemClock.uptimeMillis();
            } else {
                hVar2.f0 = hVar2.Z + (a5VarA.b(x5VarB2) / 1000000);
            }
        }
        g(a5VarA);
        io.sentry.util.a aVar = this.v0;
        aVar.g();
        try {
            if (this.f0 != null && q1Var2 != null && a5VarA != null) {
                q1Var2.r("time_to_initial_display", Long.valueOf(a5VarA.b(q1Var2.w()) / 1000000), s2.MILLISECOND);
                m(q1Var2, a5VarA, null);
            } else if (q1Var2 != null && !q1Var2.e()) {
                q1Var2.i();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
