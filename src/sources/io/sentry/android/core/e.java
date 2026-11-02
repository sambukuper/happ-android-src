package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import io.sentry.ILogger;
import io.sentry.b6;
import io.sentry.i4;
import io.sentry.n4;
import io.sentry.s5;
import io.sentry.u4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements i4, u4 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.X = obj;
        this.Y = obj2;
        this.Z = obj3;
    }

    @Override // io.sentry.u4
    public void c(SentryAndroidOptions sentryAndroidOptions) {
        v vVar = (v) this.X;
        Context context = (Context) this.Y;
        u4 u4Var = (u4) this.Z;
        boolean zB = io.sentry.util.h.b(sentryAndroidOptions, "timber.log.Timber");
        boolean z = io.sentry.util.h.b(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z2 = zB && io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zB2 = io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zB3 = io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        n0 n0Var = new n0((ILogger) vVar);
        io.sentry.util.h hVar = new io.sentry.util.h();
        d dVar = new d(hVar, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(vVar);
        sentryAndroidOptions.setFatalLogger(new v((byte) 2));
        sentryAndroidOptions.setDefaultScopeType(n4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(b6.OFF);
        sentryAndroidOptions.setDateProvider(new t1());
        sentryAndroidOptions.getLogs().b = new v((byte) 4);
        sentryAndroidOptions.getMetrics().b = new v((byte) 5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.t(applicationContext, vVar, n0Var));
        z0.a(applicationContext, n0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.e.a.set(true);
        PackageInfo packageInfoD = m0.d(applicationContext, n0Var);
        if (packageInfoD != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoD.packageName + "@" + packageInfoD.versionName + "+" + m0.e(packageInfoD, n0Var));
            }
            String str = packageInfoD.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(x0.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().e(s5.ERROR, "Could not generate distinct Id.", e);
            }
        }
        g0 g0Var = g0.g0;
        if (g0Var.Y == null) {
            io.sentry.util.a aVar = g0Var.X;
            aVar.g();
            try {
                g0Var.m(sentryAndroidOptions.getLogger());
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        sentryAndroidOptions.activate();
        q.b(context, sentryAndroidOptions, n0Var, hVar, dVar, z, z2, zB2, zB3);
        boolean z3 = z;
        try {
            u4Var.c(sentryAndroidOptions);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.h hVar2 = gVarC.f0;
            if (hVar2.Z == 0) {
                hVar2.e(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            gVarC.f((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.h hVar3 = gVarC.g0;
        if (hVar3.Z == 0) {
            hVar3.e(s1.a);
        }
        q.a(sentryAndroidOptions, context, n0Var, hVar, dVar, zB2);
        s1.a(sentryAndroidOptions, z3, z2);
    }

    @Override // io.sentry.i4
    public void f(io.sentry.s1 s1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.X;
        io.sentry.g1 g1Var = (io.sentry.g1) this.Y;
        io.sentry.s1 s1Var2 = (io.sentry.s1) this.Z;
        if (s1Var == null) {
            g1Var.F(s1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", s1Var2.getName());
        }
    }
}
