package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.c3;
import io.sentry.c6;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.k3;
import io.sentry.p3;
import io.sentry.s4;
import io.sentry.s5;
import io.sentry.u2;
import io.sentry.v2;
import io.sentry.w2;
import io.sentry.x2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static void a(SentryAndroidOptions sentryAndroidOptions, Context context, n0 n0Var, io.sentry.util.h hVar, d dVar, boolean z) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof w2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, sentryAndroidOptions, n0Var, sentryAndroidOptions.getMonotonicTicker()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
            PackageInfo packageInfoD = m0.d(context, n0Var);
            if (packageInfoD != null) {
                long j = packageInfoD.lastUpdateTime;
                if (j > 0) {
                    sentryAndroidOptions.addOptionsObserver(new o1(sentryAndroidOptions, j));
                }
            }
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.s(sentryAndroidOptions, (byte) 0));
        sentryAndroidOptions.addEventProcessor(new p0(context, n0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n1(sentryAndroidOptions, dVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, n0Var, z));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new j0(context, n0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            sentryAndroidOptions.setTransportGate(new n0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        sentryAndroidOptions.setAppStartExtender(gVarC.z0);
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof p3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.z(sentryAndroidOptions));
        }
        io.sentry.util.g gVar = new io.sentry.util.g(new c6(hVar, sentryAndroidOptions));
        boolean zB = io.sentry.util.h.b(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(gVar));
            if (zB && io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB && io.sentry.util.h.b(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.f.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof k3) {
            sentryAndroidOptions.setSocketTagger(v.Y);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new m());
            ILogger logger = sentryAndroidOptions.getLogger();
            i iVar = new i();
            iVar.a = 0L;
            iVar.b = 0L;
            iVar.c = 1L;
            iVar.d = false;
            io.sentry.util.b.s(logger, "Logger is required.");
            sentryAndroidOptions.addPerformanceCollector(iVar);
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.t frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.b.s(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new f2(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof v2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.w(sentryAndroidOptions));
        }
        if (z && (sentryAndroidOptions.getReplayController().getO0() instanceof c3)) {
            sentryAndroidOptions.getReplayController().J(new io.sentry.android.replay.d(sentryAndroidOptions));
        }
        io.sentry.util.a aVar = io.sentry.android.core.performance.g.C0;
        aVar.g();
        try {
            io.sentry.t1 t1Var = gVarC.k0;
            h hVar2 = gVarC.l0;
            gVarC.k0 = null;
            gVarC.l0 = null;
            aVar.close();
            io.sentry.o compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            io.sentry.t1 t1Var2 = u2.g0;
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(x2.X);
                if (!sentryAndroidOptions.isEnableLegacyProfiling()) {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "Transaction-based profiling (profilesSampleRate/profilesSampler) is disabled because enableLegacyProfiling is false. Transaction-based profiling always uses the legacy profiler and is not supported by Perfetto. No profiling data will be collected. Use profileSessionSampleRate for continuous profiling instead.", new Object[0]);
                    sentryAndroidOptions.setTransactionProfiler(t1Var2);
                    if (t1Var != null) {
                        t1Var.close();
                    }
                    if (hVar2 != null) {
                        hVar2.close(true);
                        return;
                    }
                    return;
                }
                if (hVar2 != null) {
                    hVar2.close(true);
                }
                if (t1Var != null) {
                    sentryAndroidOptions.setTransactionProfiler(t1Var);
                    return;
                }
                io.sentry.android.core.internal.util.t frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.b.s(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new w(context, n0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new o(sentryAndroidOptions, (byte) 4)));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(t1Var2);
            if (t1Var != null) {
                t1Var.close();
            }
            if (hVar2 != null) {
                sentryAndroidOptions.setContinuousProfiler(hVar2);
                io.sentry.protocol.w wVar = hVar2.q0;
                if (!hVar2.k0 || wVar.equals(io.sentry.protocol.w.Y)) {
                    return;
                }
                compositePerformanceCollector.a(wVar.a());
                return;
            }
            io.sentry.android.core.internal.util.t frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
            io.sentry.util.b.s(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
            if (Build.VERSION.SDK_INT < 35) {
                if (sentryAndroidOptions.isEnableLegacyProfiling()) {
                    sentryAndroidOptions.setContinuousProfiler(new h(n0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new o(sentryAndroidOptions, (byte) 1)));
                    return;
                } else {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "enableLegacyProfiling is disabled and device is below API 35. No profiling data will be collected.", new Object[0]);
                    return;
                }
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            sentryAndroidOptions.setContinuousProfiler(new j1(sentryAndroidOptions.getLogger(), frameMetricsCollector3, new o(sentryAndroidOptions, (byte) 0), new p(context, sentryAndroidOptions)));
            io.sentry.util.b.a("PerfettoContinuousProfiling");
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

    public static void b(Context context, SentryAndroidOptions sentryAndroidOptions, n0 n0Var, io.sentry.util.h hVar, d dVar, boolean z, boolean z2, boolean z3, boolean z4) {
        io.sentry.util.g gVar = new io.sentry.util.g(new o(sentryAndroidOptions, (byte) 2));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new s4(new o(sentryAndroidOptions, (byte) 3), (byte) 0), gVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.util.h.d(sentryAndroidOptions.getLogger(), "io.sentry.android.ndk.SentryNdk", true)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        if (i >= 37) {
            sentryAndroidOptions.addIntegration(new MemoryLimiterIntegration(context, n0Var));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new s4(new o(sentryAndroidOptions, (byte) 3), (byte) 1), gVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, n0Var, dVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            sentryAndroidOptions.addIntegration(new FeedbackShakeIntegration(application));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, n0Var));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z4) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
