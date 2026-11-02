package io.sentry;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http.HttpStatusCodesKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class s6 {
    static final s5 DEFAULT_DIAGNOSTIC_LEVEL = s5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private t0 appStartExtender;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private d6 beforeBreadcrumb;
    private e6 beforeEnvelopeCallback;
    private f6 beforeSend;
    private f6 beforeSendFeedback;
    private g6 beforeSendReplay;
    private h6 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.f clientReportRecorder;
    private o compositePerformanceCollector;
    private w0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private x0 continuousProfiler;
    private i6 cron;
    private q dataCollection;
    private final r dataCollectionResolver;
    private final io.sentry.util.g dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private n4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private s5 diagnosticLevel;
    private String dist;
    private String distinctId;
    private j6 distribution;
    private y0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enableLegacyProfiling;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.g envelopeReader;
    private String environment;
    private m1 executorService;
    private final j0 experimental;
    private ILogger fatalLogger;
    private n5 feedbackOptions;
    private boolean forceInit;
    private m0 fullyDisplayedReporter;
    private final List<io.sentry.android.core.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<l0> ignoredCheckIns;
    private List<l0> ignoredSpanOrigins;
    private List<l0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private w1 initPriority;
    private x1 instrumenter;
    private volatile m7 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private ILogger logger;
    private k6 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private q6 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private l6 metrics;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<h1> observers;
    private m6 onDiscard;
    private n6 onOversizedEvent;
    private b6 openTelemetryMode;
    private final List<c1> optionsObservers;
    private String orgId;
    private final List<d1> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private y3 profileLifecycle;
    private Double profileSessionSampleRate;
    private f1 profilerConverter;
    private Double profilesSampleRate;
    private o6 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private p6 proxy;
    private int readTimeoutMillis;
    private String release;
    private d4 replayController;
    private Double sampleRate;
    private k1 scopesStorageFactory;
    private io.sentry.protocol.u sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.g serializer;
    private String serverName;
    private w6 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private p1 socketTagger;
    private r1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private m1 timerExecutorService;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private r6 tracesSampler;
    private t1 transactionProfiler;
    private u1 transportFactory;
    private io.sentry.transport.h transportGate;
    private v1 versionDetector;
    private final List<Object> viewHierarchyExporters;
    private final List<i0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<l0> ignoredErrors = null;
    private final List<y1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private final io.sentry.util.g parsedDsn = new io.sentry.util.g(new c6(this, (byte) 0));
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Code duplicated, block: B:17:0x02c2  */
    public s6(boolean z) {
        r1 m3Var;
        Class clsD;
        a3 a3Var = a3.X;
        this.logger = a3Var;
        this.fatalLogger = a3Var;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        byte b = 1;
        this.serializer = new io.sentry.util.g(new c6(this, b));
        this.envelopeReader = new io.sentry.util.g(new c6(this, (byte) 2));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = o3.X;
        this.transportGate = io.sentry.transport.k.a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        i3 i3Var = i3.a;
        this.executorService = i3Var;
        this.timerExecutorService = i3Var;
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.i.X;
        this.sendDefaultPii = false;
        this.dataCollection = new q();
        this.dataCollectionResolver = new r(this);
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = q6.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = u2.g0;
        this.continuousProfiler = x2.X;
        this.profilerConverter = b3.a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.X;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = x1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.a;
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new io.sentry.util.g(new c2((byte) 9));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = v2.a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = m0.b;
        this.appStartExtender = u2.X;
        this.connectionStatusProvider = new w2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.X;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = m3.b;
        this.profilingTracesHz = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        this.cron = null;
        this.replayController = u2.f0;
        this.distributionController = u2.Y;
        this.enableScreenTracking = true;
        this.defaultScopeType = n4.ISOLATION;
        this.initPriority = w1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = b6.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = p3.X;
        this.profileLifecycle = y3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.enableLegacyProfiling = true;
        this.deadlineTimeout = 30000L;
        k6 k6Var = new k6();
        k6Var.a = false;
        k6Var.b = new io.sentry.util.h();
        this.logs = k6Var;
        l6 l6Var = new l6();
        l6Var.a = true;
        l6Var.b = new io.sentry.hints.j();
        this.metrics = l6Var;
        this.socketTagger = k3.X;
        this.distribution = new j6();
        io.sentry.protocol.u uVar = new io.sentry.protocol.u("sentry.java", "8.59.0");
        uVar.Y = "8.59.0";
        this.experimental = new j0();
        w6 w6Var = new w6((byte) 5);
        w6Var.c = false;
        w6Var.f = v6.MEDIUM;
        w6Var.g = true;
        w6Var.h = (short) 30000;
        w6Var.i = (short) 5000;
        w6Var.j = 3600000;
        w6Var.k = true;
        w6Var.m = false;
        w6Var.n = q4.PIXEL_COPY;
        w6Var.o = false;
        List list = Collections.EMPTY_LIST;
        w6Var.p = list;
        w6Var.q = list;
        w6Var.r = true;
        List list2 = w6.u;
        w6Var.s = list2;
        w6Var.t = list2;
        if (!z) {
            ((CopyOnWriteArraySet) w6Var.a).add("android.widget.TextView");
            ((CopyOnWriteArraySet) w6Var.a).add("android.widget.ImageView");
            ((CopyOnWriteArraySet) w6Var.a).add("android.webkit.WebView");
            ((CopyOnWriteArraySet) w6Var.a).add("android.widget.VideoView");
            ((CopyOnWriteArraySet) w6Var.a).add("androidx.camera.view.PreviewView");
            ((CopyOnWriteArraySet) w6Var.a).add("androidx.media3.ui.PlayerView");
            ((CopyOnWriteArraySet) w6Var.a).add("com.google.android.exoplayer2.ui.PlayerView");
            ((CopyOnWriteArraySet) w6Var.a).add("com.google.android.exoplayer2.ui.StyledPlayerView");
            w6Var.l = uVar;
        }
        this.sessionReplay = w6Var;
        u2 u2Var = new u2();
        io.sentry.util.h hVar = new io.sentry.util.h();
        n5 n5Var = new n5();
        n5Var.a = false;
        n5Var.b = true;
        n5Var.c = false;
        n5Var.d = true;
        n5Var.e = true;
        n5Var.f = true;
        n5Var.g = false;
        n5Var.h = true;
        n5Var.i = u2Var;
        n5Var.j = hVar;
        this.feedbackOptions = n5Var;
        if (z) {
            return;
        }
        if (io.sentry.util.k.a || !io.sentry.util.h.c("io.sentry.opentelemetry.OtelSpanFactory", a3Var) || (clsD = io.sentry.util.h.d(a3Var, "io.sentry.opentelemetry.OtelSpanFactory", true)) == null) {
            m3Var = new m3(b);
        } else {
            try {
                Object objNewInstance = clsD.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof r1) {
                    m3Var = (r1) objNewInstance;
                } else {
                    m3Var = new m3(b);
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(m3Var);
        List<y1> list3 = this.integrations;
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = new UncaughtExceptionHandlerIntegration();
        uncaughtExceptionHandlerIntegration.f0 = false;
        list3.add(uncaughtExceptionHandlerIntegration);
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new r2(this));
        this.eventProcessors.add(new s(this, (byte) 1));
        if (!io.sentry.util.k.a) {
            this.eventProcessors.add(new x6());
        }
        setSentryClientName("sentry.java/8.59.0");
        setSdkVersion(uVar);
        q5.d().b("maven:io.sentry:sentry", "8.59.0");
    }

    public static s6 empty() {
        return new s6(true);
    }

    public final /* synthetic */ f0 a() {
        return new f0(this.dsn);
    }

    public void activate() {
        if (this.executorService instanceof i3) {
            this.executorService = new l5(this);
        }
        if (this.timerExecutorService instanceof i3) {
            this.timerExecutorService = new l5(this, 0);
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((y1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(i0 i0Var) {
        this.eventProcessors.add(i0Var);
    }

    public void addIgnoredCheckIn(String str) {
        List arrayList = this.ignoredCheckIns;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredCheckIns = arrayList;
        }
        arrayList.add(new l0(str));
    }

    public void addIgnoredError(String str) {
        List arrayList = this.ignoredErrors;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredErrors = arrayList;
        }
        arrayList.add(new l0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        List arrayList = this.ignoredSpanOrigins;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredSpanOrigins = arrayList;
        }
        arrayList.add(new l0(str));
    }

    public void addIgnoredTransaction(String str) {
        List arrayList = this.ignoredTransactions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredTransactions = arrayList;
        }
        arrayList.add(new l0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(y1 y1Var) {
        this.integrations.add(y1Var);
    }

    public void addOptionsObserver(c1 c1Var) {
        this.optionsObservers.add(c1Var);
    }

    public void addPerformanceCollector(d1 d1Var) {
        this.performanceCollectors.add(d1Var);
    }

    public void addScopeObserver(h1 h1Var) {
        this.observers.add(h1Var);
    }

    public final /* synthetic */ g0 b() {
        return new g0((o1) this.serializer.a());
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.cache.g findPersistingScopeObserver() {
        for (h1 h1Var : this.observers) {
            if (h1Var instanceof io.sentry.cache.g) {
                return (io.sentry.cache.g) h1Var;
            }
        }
        return null;
    }

    public t0 getAppStartExtender() {
        return this.appStartExtender;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public d6 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public e6 getBeforeEnvelopeCallback() {
        return null;
    }

    public f6 getBeforeSend() {
        return this.beforeSend;
    }

    public f6 getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public g6 getBeforeSendReplay() {
        return null;
    }

    public h6 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public o getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public w0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public x0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public i6 getCron() {
        return this.cron;
    }

    public q getDataCollection() {
        return this.dataCollection;
    }

    public r getDataCollectionResolver() {
        return this.dataCollectionResolver;
    }

    public b5 getDateProvider() {
        return (b5) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public n4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public s5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public j6 getDistribution() {
        return this.distribution;
    }

    public y0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public z0 getEnvelopeReader() {
        return (z0) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public io.sentry.time.b getEpochClock() {
        return io.sentry.time.d.a;
    }

    public List<i0> getEventProcessors() {
        return this.eventProcessors;
    }

    public m1 getExecutorService() {
        return this.executorService;
    }

    public j0 getExperimental() {
        return this.experimental;
    }

    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    public n5 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public m0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.android.core.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<l0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<l0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<l0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<l0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public w1 getInitPriority() {
        return this.initPriority;
    }

    public x1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<y1> getIntegrations() {
        return this.integrations;
    }

    public m7 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            io.sentry.util.a aVar = this.lock;
            aVar.g();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new m7(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public k6 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public q6 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public l6 getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public m6 getOnDiscard() {
        return null;
    }

    public n6 getOnOversizedEvent() {
        return null;
    }

    public b6 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<c1> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<d1> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public y3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public f1 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public o6 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public p6 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public d4 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<h1> getScopeObservers() {
        return this.observers;
    }

    public k1 getScopesStorageFactory() {
        return null;
    }

    public io.sentry.protocol.u getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public o1 getSerializer() {
        return (o1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public w6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public p1 getSocketTagger() {
        return this.socketTagger;
    }

    public r1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public m1 getTimerExecutorService() {
        return this.timerExecutorService;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public r6 getTracesSampler() {
        return null;
    }

    public t1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public u1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public v1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableLegacyProfiling() {
        return this.enableLegacyProfiling;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    @Deprecated
    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(k0 k0Var) {
        String str = k0Var.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = k0Var.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = k0Var.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = k0Var.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = k0Var.e;
        if (str5 != null) {
            setServerName(str5);
        }
        p6 p6Var = k0Var.n;
        if (p6Var != null) {
            setProxy(p6Var);
        }
        Boolean bool = k0Var.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = k0Var.y;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d = k0Var.i;
        if (d != null) {
            setSampleRate(d);
        }
        Double d2 = k0Var.j;
        if (d2 != null) {
            setTracesSampleRate(d2);
        }
        Double d3 = k0Var.k;
        if (d3 != null) {
            setProfilesSampleRate(d3);
        }
        Boolean bool3 = k0Var.g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = k0Var.h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = k0Var.z;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = k0Var.R;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(k0Var.m).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(k0Var.p).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(k0Var.o).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(k0Var.w).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (k0Var.q != null) {
            setTracePropagationTargets(new ArrayList(k0Var.q));
        }
        Iterator it4 = new ArrayList(k0Var.r).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = k0Var.s;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = k0Var.t;
        if (l != null) {
            setIdleTimeout(l);
        }
        Long l2 = k0Var.u;
        if (l2 != null) {
            setShutdownTimeoutMillis(l2.longValue());
        }
        Long l3 = k0Var.v;
        if (l3 != null) {
            setSessionFlushTimeoutMillis(l3.longValue());
        }
        Iterator it5 = k0Var.A.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = k0Var.B;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = k0Var.C;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = k0Var.J;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (k0Var.H != null) {
            setIgnoredCheckIns(new ArrayList(k0Var.H));
        }
        if (k0Var.I != null) {
            setIgnoredTransactions(new ArrayList(k0Var.I));
        }
        if (k0Var.x != null) {
            setIgnoredErrors(new ArrayList(k0Var.x));
        }
        Boolean bool10 = k0Var.M;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        Boolean bool11 = k0Var.N;
        if (bool11 != null) {
            setEnableDatabaseTransactionTracing(bool11.booleanValue());
        }
        Boolean bool12 = k0Var.O;
        if (bool12 != null) {
            setEnableCacheTracing(bool12.booleanValue());
        }
        Boolean bool13 = k0Var.P;
        if (bool13 != null) {
            setEnableQueueTracing(bool13.booleanValue());
        }
        q6 q6Var = k0Var.l;
        if (q6Var != null) {
            setMaxRequestBodySize(q6Var);
        }
        Boolean bool14 = k0Var.K;
        if (bool14 != null) {
            setSendDefaultPii(bool14.booleanValue());
        }
        q qVar = k0Var.L;
        if (qVar != null) {
            Boolean bool15 = qVar.a;
            if (bool15 != null) {
                this.dataCollection.a = bool15;
            }
            Set set = qVar.d;
            if (set != null) {
                this.dataCollection.b(set);
            }
            q2 q2Var = qVar.b;
            if (q2Var != null) {
                this.dataCollection.b = q2Var;
            }
            io.sentry.internal.debugmeta.c cVar = qVar.g;
            q2 q2Var2 = (q2) cVar.Y;
            if (q2Var2 != null) {
                this.dataCollection.g.Y = q2Var2;
            }
            q2 q2Var3 = (q2) cVar.Z;
            if (q2Var3 != null) {
                this.dataCollection.g.Z = q2Var3;
            }
            q2 q2Var4 = qVar.c;
            if (q2Var4 != null) {
                this.dataCollection.c = q2Var4;
            }
            io.sentry.internal.debugmeta.c cVar2 = qVar.h;
            Boolean bool16 = (Boolean) cVar2.Y;
            if (bool16 != null) {
                this.dataCollection.h.Y = bool16;
            }
            Boolean bool17 = (Boolean) cVar2.Z;
            if (bool17 != null) {
                this.dataCollection.h.Z = bool17;
            }
            Boolean bool18 = qVar.e;
            if (bool18 != null) {
                this.dataCollection.e = bool18;
            }
            Boolean bool19 = qVar.f;
            if (bool19 != null) {
                this.dataCollection.f = bool19;
            }
        }
        Boolean bool20 = k0Var.S;
        if (bool20 != null) {
            setCaptureOpenTelemetryEvents(bool20.booleanValue());
        }
        Boolean bool21 = k0Var.D;
        if (bool21 != null) {
            setEnableSpotlight(bool21.booleanValue());
        }
        String str7 = k0Var.G;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool22 = k0Var.Q;
        if (bool22 != null) {
            setGlobalHubMode(bool22);
        }
        if (k0Var.Y != null) {
            i6 cron = getCron();
            i6 i6Var = k0Var.Y;
            if (cron == null) {
                setCron(i6Var);
            } else {
                if (i6Var.a != null) {
                    i6 cron2 = getCron();
                    i6Var = k0Var.Y;
                    cron2.a = i6Var.a;
                }
                if (i6Var.b != null) {
                    i6 cron3 = getCron();
                    i6Var = k0Var.Y;
                    cron3.b = i6Var.b;
                }
                if (i6Var.c != null) {
                    i6 cron4 = getCron();
                    i6Var = k0Var.Y;
                    cron4.c = i6Var.c;
                }
                if (i6Var.d != null) {
                    i6 cron5 = getCron();
                    i6Var = k0Var.Y;
                    cron5.d = i6Var.d;
                }
                if (i6Var.e != null) {
                    getCron().e = k0Var.Y.e;
                }
            }
        }
        if (k0Var.E != null) {
            getLogs().a = k0Var.E.booleanValue();
        }
        if (k0Var.F != null) {
            getMetrics().a = k0Var.F.booleanValue();
        }
        Double d4 = k0Var.T;
        if (d4 != null) {
            setProfileSessionSampleRate(d4);
        }
        String str8 = k0Var.U;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        y3 y3Var = k0Var.V;
        if (y3Var != null) {
            setProfileLifecycle(y3Var);
        }
        Boolean bool23 = k0Var.W;
        if (bool23 != null) {
            setStrictTraceContinuation(bool23.booleanValue());
        }
        String str9 = k0Var.X;
        if (str9 != null) {
            setOrgId(str9);
        }
    }

    public f0 retrieveParsedDsn() throws IllegalArgumentException {
        return (f0) this.parsedDsn.a();
    }

    public void setAppStartExtender(t0 t0Var) {
        if (t0Var == null) {
            t0Var = u2.X;
        }
        this.appStartExtender = t0Var;
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(d6 d6Var) {
        this.beforeBreadcrumb = d6Var;
    }

    public void setBeforeSend(f6 f6Var) {
        this.beforeSend = f6Var;
    }

    public void setBeforeSendFeedback(f6 f6Var) {
        this.beforeSendFeedback = f6Var;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(o oVar) {
        this.compositePerformanceCollector = oVar;
    }

    public void setConnectionStatusProvider(w0 w0Var) {
        this.connectionStatusProvider = w0Var;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(x0 x0Var) {
        if (this.continuousProfiler != x2.X || x0Var == null) {
            return;
        }
        this.continuousProfiler = x0Var;
    }

    public void setCron(i6 i6Var) {
        this.cron = i6Var;
    }

    public void setDataCollection(q qVar) {
        if (qVar != null) {
            this.dataCollection = qVar;
        }
    }

    public void setDateProvider(b5 b5Var) {
        this.dateProvider.b(b5Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.X;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(n4 n4Var) {
        this.defaultScopeType = n4Var;
    }

    public void setDiagnosticLevel(s5 s5Var) {
        if (s5Var == null) {
            s5Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = s5Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(j6 j6Var) {
        if (j6Var == null) {
            j6Var = new j6();
        }
        this.distribution = j6Var;
    }

    public void setDistributionController(y0 y0Var) {
        if (y0Var == null) {
            y0Var = u2.Y;
        }
        this.distributionController = y0Var;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        io.sentry.util.g gVar = this.parsedDsn;
        io.sentry.util.a aVar = gVar.c;
        aVar.g();
        try {
            gVar.a = null;
            aVar.close();
            String str2 = this.dsn;
            ILogger iLogger = this.logger;
            Charset charset = io.sentry.util.q.a;
            if (str2 != null && !str2.isEmpty()) {
                try {
                    string = new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.q.a))).toString(16);
                } catch (NoSuchAlgorithmException e) {
                    iLogger.e(s5.INFO, "SHA-1 isn't available to calculate the hash.", e);
                } catch (Throwable th) {
                    iLogger.h(s5.INFO, "string: %s could not calculate its hash", th, str2);
                }
            }
            this.dsnHash = string;
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableCacheTracing(boolean z) {
        this.enableCacheTracing = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableLegacyProfiling(boolean z) {
        this.enableLegacyProfiling = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableQueueTracing(boolean z) {
        this.enableQueueTracing = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.X;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(z0 z0Var) {
        io.sentry.util.g gVar = this.envelopeReader;
        if (z0Var == null) {
            z0Var = y2.a;
        }
        gVar.b(z0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(m1 m1Var) {
        if (m1Var != null) {
            this.executorService = m1Var;
        }
    }

    public void setFatalLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = a3.X;
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(n5 n5Var) {
        this.feedbackOptions = n5Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(m0 m0Var) {
        this.fullyDisplayedReporter = m0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.android.core.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(w1 w1Var) {
        this.initPriority = w1Var;
    }

    @Deprecated
    public void setInstrumenter(x1 x1Var) {
        this.instrumenter = x1Var;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? a3.X : new io.sentry.internal.debugmeta.c((Object) this, (Object) iLogger, (byte) 3);
    }

    public void setLogs(k6 k6Var) {
        this.logs = k6Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(q6 q6Var) {
        this.maxRequestBodySize = q6Var;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(l6 l6Var) {
        this.metrics = l6Var;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setOpenTelemetryMode(b6 b6Var) {
        this.openTelemetryMode = b6Var;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(y3 y3Var) {
        this.profileLifecycle = y3Var;
        if (y3Var != y3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.h(s5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.profileSessionSampleRate = d;
        } else {
            c2.j("The value ", d, " is not valid. Use values between 0.0 and 1.0.");
        }
    }

    public void setProfilerConverter(f1 f1Var) {
        this.profilerConverter = f1Var;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.profilesSampleRate = d;
        } else {
            c2.j("The value ", d, " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(p6 p6Var) {
        this.proxy = p6Var;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(d4 d4Var) {
        if (d4Var == null) {
            d4Var = u2.f0;
        }
        this.replayController = d4Var;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.sampleRate = d;
        } else {
            c2.j("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    public void setSdkVersion(io.sentry.protocol.u uVar) {
        io.sentry.protocol.u uVar2 = getSessionReplay().l;
        io.sentry.protocol.u uVar3 = this.sdkVersion;
        if (uVar3 != null && uVar2 != null && uVar3.equals(uVar2)) {
            getSessionReplay().l = uVar;
        }
        this.sdkVersion = uVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.j();
        }
    }

    @Deprecated
    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(o1 o1Var) {
        io.sentry.util.g gVar = this.serializer;
        if (o1Var == null) {
            o1Var = j3.a;
        }
        gVar.b(o1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(w6 w6Var) {
        this.sessionReplay = w6Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(p1 p1Var) {
        if (p1Var == null) {
            p1Var = k3.X;
        }
        this.socketTagger = p1Var;
    }

    public void setSpanFactory(r1 r1Var) {
        this.spanFactory = r1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setStrictTraceContinuation(boolean z) {
        this.strictTraceContinuation = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = this.tags;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTimerExecutorService(m1 m1Var) {
        if (m1Var != null) {
            this.timerExecutorService = m1Var;
        }
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.tracesSampleRate = d;
        } else {
            c2.j("The value ", d, " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
    }

    public void setTransactionProfiler(t1 t1Var) {
        if (this.transactionProfiler != u2.g0 || t1Var == null) {
            return;
        }
        this.transactionProfiler = t1Var;
    }

    public void setTransportFactory(u1 u1Var) {
        if (u1Var == null) {
            u1Var = o3.X;
        }
        this.transportFactory = u1Var;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(v1 v1Var) {
        this.versionDetector = v1Var;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    public void setBeforeEnvelopeCallback(e6 e6Var) {
    }

    public void setBeforeSendReplay(g6 g6Var) {
    }

    public void setBeforeSendTransaction(h6 h6Var) {
    }

    public void setOnDiscard(m6 m6Var) {
    }

    public void setOnOversizedEvent(n6 n6Var) {
    }

    public void setProfilesSampler(o6 o6Var) {
    }

    public void setScopesStorageFactory(k1 k1Var) {
    }

    public void setTracesSampler(r6 r6Var) {
    }
}
