package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.j78;
import io.sentry.ILogger;
import io.sentry.a3;
import io.sentry.a5;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.k;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.b4;
import io.sentry.j7;
import io.sentry.k4;
import io.sentry.n7;
import io.sentry.o7;
import io.sentry.protocol.h0;
import io.sentry.protocol.w;
import io.sentry.s1;
import io.sentry.x5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    public static volatile g B0;
    public volatile Boolean Y;
    public volatile j78 t0;
    public w u0;
    public String v0;
    public String w0;
    public a5 x0;
    public ApplicationStartInfo y0;
    public static long A0 = SystemClock.uptimeMillis();
    public static final io.sentry.util.a C0 = new io.sentry.util.a();
    public volatile f X = f.UNKNOWN;
    public volatile long Z = -1;
    public io.sentry.android.core.w k0 = null;
    public io.sentry.android.core.h l0 = null;
    public b4 m0 = null;
    public boolean n0 = false;
    public volatile boolean o0 = true;
    public final AtomicInteger p0 = new AtomicInteger();
    public final AtomicBoolean q0 = new AtomicBoolean(false);
    public final AtomicBoolean r0 = new AtomicBoolean(false);
    public final AtomicBoolean s0 = new AtomicBoolean(false);
    public final io.sentry.internal.debugmeta.c z0 = new io.sentry.internal.debugmeta.c();
    public final h f0 = new h();
    public final h g0 = new h();
    public final h h0 = new h();
    public final HashMap i0 = new HashMap();
    public final ArrayList j0 = new ArrayList();

    public static g c() {
        if (B0 == null) {
            io.sentry.util.a aVar = C0;
            aVar.g();
            try {
                if (B0 == null) {
                    B0 = new g();
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
        return B0;
    }

    public final String a() {
        ApplicationStartInfo applicationStartInfo = this.y0;
        if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
            return null;
        }
        switch (applicationStartInfo.getReason()) {
            case 0:
                return "alarm";
            case 1:
                return "backup";
            case 2:
                return "boot_complete";
            case 3:
                return "broadcast";
            case 4:
                return "content_provider";
            case 5:
                return "job";
            case 6:
                return "launcher";
            case 7:
                return "launcher_recents";
            case 8:
                return "other";
            case 9:
                return "push";
            case 10:
                return "service";
            case 11:
                return "start_activity";
            default:
                return null;
        }
    }

    public final h b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.X != f.UNKNOWN && Boolean.TRUE.equals(this.Y)) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                h hVar = this.f0;
                if (hVar.c() && hVar.a() <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                    return hVar;
                }
            }
            h hVar2 = this.g0;
            if (hVar2.c() && hVar2.a() <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                return hVar2;
            }
        }
        return new h();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    public final void d() {
        x5 x5Var;
        long jA;
        this.Z = SystemClock.uptimeMillis();
        this.r0.set(false);
        if (this.p0.get() == 0) {
            if (this.t0 == null || !m0.f()) {
                this.Y = Boolean.FALSE;
                if (this.X == f.UNKNOWN) {
                    this.X = f.COLD;
                }
                io.sentry.android.core.w wVar = this.k0;
                if (wVar != null && wVar.k0.get()) {
                    this.k0.close();
                    this.k0 = null;
                }
                io.sentry.android.core.h hVar = this.l0;
                if (hVar != null && hVar.k0) {
                    hVar.close(true);
                    this.l0 = null;
                }
                j78 j78Var = this.t0;
                if (j78Var == null || !this.s0.compareAndSet(false, true)) {
                    return;
                }
                h hVar2 = this.h0;
                if (hVar2.d()) {
                    g(hVar2.a() + hVar2.Z);
                } else {
                    ApplicationStartInfo applicationStartInfo = this.y0;
                    if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
                        g(A0);
                    } else {
                        try {
                            Long l = (Long) applicationStartInfo.getStartupTimestamps().get(2);
                            if (l != null) {
                                g(l.longValue() / 1000000);
                            } else {
                                g(A0);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) j78Var.Y;
                if (activityLifecycleIntegration.Z == null || activityLifecycleIntegration.f0 == null || !activityLifecycleIntegration.g0) {
                    return;
                }
                g gVarC = c();
                gVarC.m0 = null;
                h hVar3 = gVarC.f0;
                if (!hVar3.c() || !hVar3.d()) {
                    hVar3 = gVarC.g0;
                }
                if (hVar3.c() && hVar3.d()) {
                    x5 x5VarB = hVar3.b();
                    if (hVar3.d()) {
                        if (hVar3.c()) {
                            jA = hVar3.a() + hVar3.Y;
                        } else {
                            jA = 0;
                        }
                        x5Var = new x5(jA * 1000000);
                    } else {
                        x5Var = null;
                    }
                    if (x5VarB == null || x5Var == null) {
                        return;
                    }
                    gVarC.x0 = x5Var;
                    io.sentry.util.a aVar = (io.sentry.util.a) gVarC.z0.Y;
                    aVar.g();
                    aVar.close();
                    if (gVarC.o0) {
                        g gVarC2 = c();
                        o7 o7Var = new o7();
                        o7Var.b = k4.OFF;
                        o7Var.a = x5VarB;
                        o7Var.d = "auto.app.start";
                        o7Var.e = false;
                        s1 s1VarM = activityLifecycleIntegration.Z.m(new n7("App Start", h0.COMPONENT, "app.start", null), o7Var);
                        String strA = gVarC2.a();
                        if (strA != null) {
                            s1VarM.j(strA, "app.vitals.start.reason");
                        }
                        gVarC2.u0 = s1VarM.s().X;
                        gVarC2.v0 = s1VarM.c().a();
                        io.sentry.d dVarK = s1VarM.k();
                        gVarC2.w0 = dVarK != null ? (String) dVarK.Y : null;
                        s1VarM.v(j7.OK, x5Var);
                    }
                }
            }
        }
    }

    public final synchronized void e() {
        if (!this.q0.getAndSet(true)) {
            g gVarC = c();
            h hVar = gVarC.g0;
            hVar.getClass();
            hVar.f0 = SystemClock.uptimeMillis();
            h hVar2 = gVarC.f0;
            hVar2.getClass();
            hVar2.f0 = SystemClock.uptimeMillis();
        }
    }

    public final void f(Application application) {
        ActivityManager activityManager;
        if (this.n0) {
            return;
        }
        this.n0 = true;
        Boolean bool = null;
        this.Y = null;
        application.registerActivityLifecycleCallbacks(B0);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            try {
                List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
                if (!historicalProcessStartReasons.isEmpty()) {
                    ApplicationStartInfo applicationStartInfo = (ApplicationStartInfo) historicalProcessStartReasons.get(0);
                    this.y0 = applicationStartInfo;
                    if (applicationStartInfo.getStartupState() == 0) {
                        if (applicationStartInfo.getStartType() == 1) {
                            this.X = f.COLD;
                        } else {
                            this.X = f.WARM;
                        }
                        switch (applicationStartInfo.getReason()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 9:
                            case 10:
                                bool = Boolean.FALSE;
                                break;
                            case 6:
                            case 7:
                            case 11:
                                bool = Boolean.TRUE;
                                break;
                        }
                        this.Y = bool;
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        if (this.Y == null) {
            this.Y = Boolean.valueOf(m0.f());
        }
        if ((this.X == f.UNKNOWN || this.t0 != null) && this.r0.compareAndSet(false, true)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new d(this));
        }
    }

    public final void g(long j) {
        h hVar = this.f0;
        if (hVar.c()) {
            if (hVar.f0 == 0) {
                hVar.f0 = j;
            }
        } else {
            h hVar2 = this.g0;
            if (hVar2.c() && hVar2.f0 == 0) {
                hVar2.f0 = j;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        n0.b.e(activity);
        if (this.p0.incrementAndGet() == 1 && !this.q0.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f0.Z;
            if (!Boolean.TRUE.equals(this.Y) || jUptimeMillis2 > RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                io.sentry.util.a aVar = (io.sentry.util.a) this.z0.Y;
                aVar.g();
                aVar.close();
                this.X = f.WARM;
                this.o0 = true;
                h hVar = this.f0;
                hVar.X = null;
                hVar.Z = 0L;
                hVar.f0 = 0L;
                hVar.Y = 0L;
                hVar.e(jUptimeMillis);
                A0 = jUptimeMillis;
                this.i0.clear();
                h hVar2 = this.h0;
                hVar2.X = null;
                hVar2.Z = 0L;
                hVar2.f0 = 0L;
                hVar2.Y = 0L;
            } else if (this.X == f.UNKNOWN) {
                if (bundle != null) {
                    this.X = f.WARM;
                } else if (this.Z == -1 || jUptimeMillis <= this.Z) {
                    this.X = f.COLD;
                } else {
                    this.X = f.WARM;
                }
            }
        }
        this.Y = Boolean.TRUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.a = null;
        }
        int iDecrementAndGet = this.p0.decrementAndGet();
        if (iDecrementAndGet < 0) {
            this.p0.set(0);
            iDecrementAndGet = 0;
        }
        if (iDecrementAndGet != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.X = f.WARM;
        this.Y = Boolean.TRUE;
        this.o0 = true;
        this.q0.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        n0.b.e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        n0.b.e(activity);
        if (this.q0.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final byte b = 0;
            k.a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.e
                public final /* synthetic */ g Y;

                {
                    this.Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    g gVar = this.Y;
                    switch (b2) {
                        case 0:
                            gVar.e();
                            break;
                        default:
                            gVar.e();
                            break;
                    }
                }
            }, new n0((ILogger) a3.X));
        } else {
            final byte b2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.e
                public final /* synthetic */ g Y;

                {
                    this.Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    g gVar = this.Y;
                    switch (b3) {
                        case 0:
                            gVar.e();
                            break;
                        default:
                            gVar.e();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.a = null;
        }
    }
}
