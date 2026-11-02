package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import defpackage.pc6;
import io.sentry.ILogger;
import io.sentry.n5;
import io.sentry.p2;
import io.sentry.q2;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.w6;
import io.sentry.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static void a(Context context, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listH;
        List listH2;
        List listH3;
        List listH4;
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) m0.d.a(context) : (ApplicationInfo) m0.e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(d(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strJ = j(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strJ != null) {
                        sentryAndroidOptions.setDiagnosticLevel(s5.valueOf(strJ.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(d(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setAttachRawTombstone(d(bundle, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
                sentryAndroidOptions.setReportHistoricalTombstones(d(bundle, logger, "io.sentry.tombstone.report-historical", sentryAndroidOptions.isReportHistoricalTombstones()));
                sentryAndroidOptions.setTombstoneMergeTimeThresholdMillis(i(bundle, logger, "io.sentry.tombstone.merge-time-threshold-millis", sentryAndroidOptions.getTombstoneMergeTimeThresholdMillis()));
                sentryAndroidOptions.setMemoryLimiterEnabled(d(bundle, logger, "io.sentry.memory-limiter.enable", sentryAndroidOptions.isMemoryLimiterEnabled()));
                sentryAndroidOptions.setReportHistoricalMemoryLimiterExits(d(bundle, logger, "io.sentry.memory-limiter.report-historical", sentryAndroidOptions.isReportHistoricalMemoryLimiterExits()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dF = f(bundle, logger, "io.sentry.sample-rate");
                    if (dF != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dF));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(i(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(d(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                sentryAndroidOptions.setReportHistoricalAnrs(d(bundle, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
                sentryAndroidOptions.setEnableNdkAppHangTracking(d(bundle, logger, "io.sentry.ndk.app-hang.enable", sentryAndroidOptions.isEnableNdkAppHangTracking()));
                sentryAndroidOptions.setNdkAppHangTimeoutIntervalMillis(i(bundle, logger, "io.sentry.ndk.app-hang.timeout-interval-millis", sentryAndroidOptions.getNdkAppHangTimeoutIntervalMillis()));
                String strJ2 = j(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zD = d(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zD || (strJ2 != null && strJ2.isEmpty())) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strJ2 == null) {
                    sentryAndroidOptions.getLogger().h(s5.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zD);
                sentryAndroidOptions.setDsn(strJ2);
                sentryAndroidOptions.setEnableNdk(d(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strJ3 = j(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strJ3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strJ3);
                }
                sentryAndroidOptions.setRelease(j(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(j(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(j(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(i(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) i(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (d(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.w1.LOW);
                }
                sentryAndroidOptions.setForceInit(d(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(d(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(d(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dF2 = f(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dF2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dF2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dF3 = f(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dF3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dF3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dF4 = f(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dF4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dF4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strJ4 = j(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strJ4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(y3.valueOf(strJ4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(d(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(d(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jI = i(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jI != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jI));
                }
                List<String> listH5 = h(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (b("io.sentry.traces.trace-propagation-targets", bundle) && listH5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listH5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listH5);
                }
                sentryAndroidOptions.setEnableFramesTracking(d(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(j(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.u(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
                }
                String strK = k(bundle, logger, "io.sentry.sdk.name", sdkVersion.X);
                io.sentry.util.b.s(strK, "name is required.");
                sdkVersion.X = strK;
                String strK2 = k(bundle, logger, "io.sentry.sdk.version", sdkVersion.Y);
                io.sentry.util.b.s(strK2, "version is required.");
                sdkVersion.Y = strK2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listH6 = h(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listH6 != null) {
                    Iterator it = listH6.iterator();
                    while (it.hasNext()) {
                        q5.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(d(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(d(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableStandaloneAppStartTracing(d(bundle, logger, "io.sentry.standalone-app-start-tracing.enable", sentryAndroidOptions.isEnableStandaloneAppStartTracing()));
                sentryAndroidOptions.setEnableAppStartProfiling(d(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableLegacyProfiling(d(bundle, logger, "io.sentry.profiling.enable-legacy-profiling", sentryAndroidOptions.isEnableLegacyProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(d(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(d(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(i(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().d == null) {
                    double dF5 = f(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dF5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().D(Double.valueOf(dF5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().e == null) {
                    double dF6 = f(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dF6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().C(Double.valueOf(dF6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().t(d(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().s(d(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().m = d(bundle, logger, "io.sentry.session-replay.debug", false);
                String strJ5 = j(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strJ5 != null) {
                    if ("canvas".equals(strJ5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = q4.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = q4.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().o = d(bundle, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().o);
                if (sentryAndroidOptions.getSessionReplay().p.isEmpty() && (listH4 = h(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listH4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listH4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().y(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().q.isEmpty() && (listH3 = h(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listH3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listH3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().z(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().r = d(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().r);
                if (sentryAndroidOptions.getSessionReplay().s.size() == w6.u.size() && (listH2 = h(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listH2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().A(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().t.size() == w6.u.size() && (listH = h(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listH.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listH.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().B(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(h(bundle, logger, "io.sentry.ignored-errors"));
                List listH7 = h(bundle, logger, "io.sentry.in-app-includes");
                if (listH7 != null && !listH7.isEmpty()) {
                    Iterator it6 = listH7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listH8 = h(bundle, logger, "io.sentry.in-app-excludes");
                if (listH8 != null && !listH8.isEmpty()) {
                    Iterator it7 = listH8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().a = d(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a);
                sentryAndroidOptions.getMetrics().a = d(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a);
                n5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.a = d(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.a);
                feedbackOptions.b = d(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.b);
                feedbackOptions.c = d(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.c);
                feedbackOptions.d = d(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d);
                feedbackOptions.e = d(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.e);
                feedbackOptions.f = d(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.f);
                feedbackOptions.g = d(bundle, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.g);
                feedbackOptions.h = d(bundle, logger, "io.sentry.feedback.enable-attach-screenshot", feedbackOptions.h);
                sentryAndroidOptions.setStrictTraceContinuation(d(bundle, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strJ6 = j(bundle, logger, "io.sentry.org-id", null);
                if (strJ6 != null) {
                    sentryAndroidOptions.setOrgId(strJ6);
                }
                sentryAndroidOptions.setEnableSpotlight(d(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strJ7 = j(bundle, logger, "io.sentry.spotlight.url", null);
                if (strJ7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strJ7);
                }
                sentryAndroidOptions.getScreenshot().t(d(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().s(d(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dF7 = f(bundle, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dF7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dF7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(d(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
                io.sentry.q qVarE = e(bundle, logger, sentryAndroidOptions.getDataCollection());
                if (qVarE != null) {
                    c(sentryAndroidOptions.getDataCollection(), qVarE);
                }
            }
            sentryAndroidOptions.getLogger().h(s5.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static boolean b(String str, Bundle bundle) {
        return bundle.containsKey(str);
    }

    public static void c(io.sentry.q qVar, io.sentry.q qVar2) {
        Boolean bool = qVar2.a;
        if (bool != null) {
            qVar.a = bool;
        }
        Set set = qVar2.d;
        if (set != null) {
            qVar.b(set);
        }
        q2 q2Var = qVar2.b;
        if (q2Var != null) {
            qVar.b = q2Var;
        }
        io.sentry.internal.debugmeta.c cVar = qVar2.g;
        q2 q2Var2 = (q2) cVar.Y;
        if (q2Var2 != null) {
            qVar.g.Y = q2Var2;
        }
        q2 q2Var3 = (q2) cVar.Z;
        if (q2Var3 != null) {
            qVar.g.Z = q2Var3;
        }
        q2 q2Var4 = qVar2.c;
        if (q2Var4 != null) {
            qVar.c = q2Var4;
        }
        io.sentry.internal.debugmeta.c cVar2 = qVar2.h;
        Boolean bool2 = (Boolean) cVar2.Y;
        if (bool2 != null) {
            qVar.h.Y = bool2;
        }
        Boolean bool3 = (Boolean) cVar2.Z;
        if (bool3 != null) {
            qVar.h.Z = bool3;
        }
        Boolean bool4 = qVar2.e;
        if (bool4 != null) {
            qVar.e = bool4;
        }
        Boolean bool5 = qVar2.f;
        if (bool5 != null) {
            qVar.f = bool5;
        }
    }

    public static boolean d(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, str + " read: " + z2, new Object[0]);
        }
        return z2;
    }

    public static io.sentry.q e(Bundle bundle, ILogger iLogger, io.sentry.q qVar) {
        Set setNoneOf;
        io.sentry.q qVar2 = new io.sentry.q();
        if (bundle.containsKey("io.sentry.data-collection.user-info")) {
            qVar2.a = Boolean.valueOf(d(bundle, iLogger, "io.sentry.data-collection.user-info", false));
        }
        if (bundle.containsKey("io.sentry.data-collection.http-bodies")) {
            List listH = h(bundle, iLogger, "io.sentry.data-collection.http-bodies");
            if (listH == null || (listH.size() == 1 && ((String) listH.get(0)).isEmpty())) {
                setNoneOf = Collections.EMPTY_SET;
            } else {
                setNoneOf = EnumSet.noneOf(io.sentry.r0.class);
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    setNoneOf.add(io.sentry.r0.valueOf(((String) it.next()).toUpperCase(Locale.ROOT)));
                }
            }
            qVar2.b(setNoneOf);
        }
        q2 q2Var = qVar.b;
        io.sentry.internal.debugmeta.c cVar = qVar.g;
        q2 q2VarG = g(bundle, iLogger, "io.sentry.data-collection.cookies", q2Var);
        if (q2VarG != null) {
            qVar2.b = q2VarG;
        }
        q2 q2VarG2 = g(bundle, iLogger, "io.sentry.data-collection.http-headers.request", (q2) cVar.Y);
        io.sentry.internal.debugmeta.c cVar2 = qVar2.g;
        if (q2VarG2 != null) {
            cVar2.Y = q2VarG2;
        }
        q2 q2VarG3 = g(bundle, iLogger, "io.sentry.data-collection.http-headers.response", (q2) cVar.Z);
        if (q2VarG3 != null) {
            cVar2.Z = q2VarG3;
        }
        q2 q2VarG4 = g(bundle, iLogger, "io.sentry.data-collection.url-query-params", qVar.c);
        if (q2VarG4 != null) {
            qVar2.c = q2VarG4;
        }
        boolean zContainsKey = bundle.containsKey("io.sentry.data-collection.graphql.document");
        io.sentry.internal.debugmeta.c cVar3 = qVar2.h;
        if (zContainsKey) {
            cVar3.Y = Boolean.valueOf(d(bundle, iLogger, "io.sentry.data-collection.graphql.document", false));
        }
        if (bundle.containsKey("io.sentry.data-collection.graphql.variables")) {
            cVar3.Z = Boolean.valueOf(d(bundle, iLogger, "io.sentry.data-collection.graphql.variables", false));
        }
        if (bundle.containsKey("io.sentry.data-collection.database-query-data")) {
            qVar2.e = Boolean.valueOf(d(bundle, iLogger, "io.sentry.data-collection.database-query-data", false));
        }
        if (bundle.containsKey("io.sentry.data-collection.file-paths")) {
            qVar2.f = Boolean.valueOf(d(bundle, iLogger, "io.sentry.data-collection.file-paths", false));
        }
        if (qVar2.a()) {
            return qVar2;
        }
        return null;
    }

    public static double f(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, str + " read: " + dDoubleValue, new Object[0]);
        }
        return dDoubleValue;
    }

    public static q2 g(Bundle bundle, ILogger iLogger, String str, q2 q2Var) {
        String strJ;
        String strConcat = str.concat(".mode");
        String strConcat2 = str.concat(".terms");
        if (!bundle.containsKey(strConcat) && !bundle.containsKey(strConcat2)) {
            return null;
        }
        q2 q2Var2 = new q2();
        if (q2Var != null) {
            q2Var2.a = q2Var.a;
            q2Var2.b = Collections.unmodifiableList(new ArrayList(q2Var.b));
        }
        if (bundle.containsKey(strConcat) && (strJ = j(bundle, iLogger, strConcat, null)) != null) {
            q2Var2.a = p2.valueOf(strJ.toUpperCase(Locale.ROOT));
        }
        if (bundle.containsKey(strConcat2)) {
            List listH = h(bundle, iLogger, strConcat2);
            if (listH == null) {
                listH = Collections.EMPTY_LIST;
            }
            q2Var2.b = Collections.unmodifiableList(new ArrayList(listH));
        }
        return q2Var2;
    }

    public static List h(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, pc6.p(str, " read: ", string), new Object[0]);
        }
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long i(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, str + " read: " + j2, new Object[0]);
        }
        return j2;
    }

    public static String j(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, pc6.p(str, " read: ", string), new Object[0]);
        }
        return string;
    }

    public static String k(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        s5 s5Var = s5.DEBUG;
        if (iLogger.i(s5Var)) {
            iLogger.h(s5Var, pc6.p(str, " read: ", string), new Object[0]);
        }
        return string;
    }
}
