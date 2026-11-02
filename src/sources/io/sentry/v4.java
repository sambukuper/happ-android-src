package io.sentry;

import defpackage.bt;
import defpackage.fl6;
import defpackage.o8;
import defpackage.wg;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import org.conscrypt.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v4 {
    public static volatile j1 a = g3.a;
    public static volatile i1 b = e3.b;
    public static final j4 c = new j4(s6.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName("UTF-8");
    public static final long f = System.currentTimeMillis();
    public static final io.sentry.util.a g = new io.sentry.util.a();

    public static void a() {
        io.sentry.util.a aVar = g;
        aVar.g();
        try {
            i1 i1VarB = b();
            b = e3.b;
            a.close();
            i1VarB.close(false);
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

    public static i1 b() {
        i1 i1Var = b;
        i1 i1Var2 = a.get();
        if (d) {
            return (i1Var2 == null || i1Var2.q() || !i1Var.y(i1Var2)) ? i1Var : i1Var2;
        }
        if (i1Var2 != null && !i1Var2.q()) {
            return i1Var2;
        }
        i1 i1VarX = i1Var.x("getCurrentScopes");
        a.a(i1VarX);
        return i1VarX;
    }

    public static void c(io.sentry.android.core.v vVar, io.sentry.android.core.e eVar) {
        SentryAndroidOptions sentryAndroidOptions = new SentryAndroidOptions();
        try {
            eVar.c(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.util.a aVar = g;
        aVar.g();
        try {
            if (!SentryAndroidOptions.class.getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.k.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(SentryAndroidOptions.class.getName()));
            }
            if (f(sentryAndroidOptions)) {
                Boolean boolIsGlobalHubMode = sentryAndroidOptions.isGlobalHubMode();
                byte b2 = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                sentryAndroidOptions.getLogger().h(s5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (sentryAndroidOptions.getFatalLogger() instanceof a3) {
                    sentryAndroidOptions.setFatalLogger(new u2());
                }
                j4 j4Var = c;
                byte b3 = 0;
                if (io.sentry.util.b.v(j4Var.l, sentryAndroidOptions, b().isEnabled())) {
                    if (b().isEnabled()) {
                        sentryAndroidOptions.getLogger().h(s5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    sentryAndroidOptions.activate();
                    b().close(true);
                    j4Var.l = sentryAndroidOptions;
                    Queue queue = j4Var.g;
                    j4Var.g = j4.c(sentryAndroidOptions.getMaxBreadcrumbs());
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        j4Var.a((g) it.next(), null);
                    }
                    b = new o4(new j4(sentryAndroidOptions), new j4(sentryAndroidOptions), j4Var, null);
                    if (sentryAndroidOptions.isDebug() && (sentryAndroidOptions.getLogger() instanceof a3)) {
                        sentryAndroidOptions.setLogger(new u2());
                    }
                    e(sentryAndroidOptions);
                    a.a(b);
                    d(sentryAndroidOptions);
                    j4Var.u = new wg(sentryAndroidOptions);
                    if (sentryAndroidOptions.getExecutorService().isClosed()) {
                        sentryAndroidOptions.setExecutorService(new l5(sentryAndroidOptions));
                    }
                    if (sentryAndroidOptions.getTimerExecutorService().isClosed()) {
                        sentryAndroidOptions.setTimerExecutorService(new l5(sentryAndroidOptions, 0));
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new t4(sentryAndroidOptions, b3));
                    } catch (RejectedExecutionException e2) {
                        sentryAndroidOptions.getLogger().e(s5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new t2(sentryAndroidOptions, b3));
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().e(s5.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (y1 y1Var : sentryAndroidOptions.getIntegrations()) {
                        try {
                            y1Var.R(sentryAndroidOptions);
                        } catch (Throwable th3) {
                            sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to register the integration " + y1Var.getClass().getName(), th3);
                        }
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new t4(sentryAndroidOptions, (byte) 2));
                    } catch (Throwable th4) {
                        sentryAndroidOptions.getLogger().e(s5.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new u3(sentryAndroidOptions));
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().e(s5.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new t4(sentryAndroidOptions, b2));
                    } catch (Throwable th6) {
                        sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    ILogger logger = sentryAndroidOptions.getLogger();
                    s5 s5Var = s5.DEBUG;
                    logger.h(s5Var, "Using openTelemetryMode %s", sentryAndroidOptions.getOpenTelemetryMode());
                    sentryAndroidOptions.getLogger().h(s5Var, "Using span factory %s", sentryAndroidOptions.getSpanFactory().getClass().getName());
                    sentryAndroidOptions.getLogger().h(s5Var, "Using scopes storage %s", a.getClass().getName());
                } else {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            aVar.close();
        } catch (Throwable th7) {
            try {
                aVar.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void d(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.cache.d cVar;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.INFO;
        logger.h(s5Var, "Initializing SDK with DSN: '%s'", sentryAndroidOptions.getDsn());
        if (sentryAndroidOptions.getOutboxPath() == null) {
            logger.h(s5Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            Charset charset = io.sentry.cache.c.k0;
            String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
            int maxCacheItems = sentryAndroidOptions.getMaxCacheItems();
            if (cacheDirPath == null) {
                sentryAndroidOptions.getLogger().h(s5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                cVar = io.sentry.transport.i.X;
            } else {
                cVar = new io.sentry.cache.c(sentryAndroidOptions, cacheDirPath, maxCacheItems);
            }
            sentryAndroidOptions.setEnvelopeDiskCache(cVar);
        }
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        if ((sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryAndroidOptions.getExecutorService().submit(new fl6((Object) file, (byte) 18));
            } catch (RejectedExecutionException e2) {
                sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        io.sentry.internal.modules.a modulesLoader = sentryAndroidOptions.getModulesLoader();
        if (!sentryAndroidOptions.isSendModules()) {
            sentryAndroidOptions.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(sentryAndroidOptions.getLogger()), new io.sentry.internal.modules.f(sentryAndroidOptions.getLogger())), sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(sentryAndroidOptions.getLogger()));
        }
        List<Properties> listC = sentryAndroidOptions.getDebugMetaLoader().c();
        if (listC != null) {
            if (sentryAndroidOptions.getBundleIds().isEmpty()) {
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            sentryAndroidOptions.addBundleId(str);
                        }
                    }
                }
            }
            if (sentryAndroidOptions.getProguardUuid() == null) {
                Iterator it2 = listC.iterator();
                while (it2.hasNext()) {
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Proguard UUID found: %s", property2);
                        sentryAndroidOptions.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listC) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    q5.d().b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listC) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    j6 distribution = sentryAndroidOptions.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                            break;
                        }
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.util.thread.c.b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new z1());
        }
        if (sentryAndroidOptions.isEnableBackpressureHandling() && !io.sentry.util.k.a) {
            if (sentryAndroidOptions.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                sentryAndroidOptions.setBackpressureMonitor(new io.sentry.backpressure.a(sentryAndroidOptions));
            }
            sentryAndroidOptions.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.k.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getContinuousProfiler() instanceof x2)) {
            try {
                if (sentryAndroidOptions.getProfilingTracesDirPath() == null) {
                    File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (file2.mkdirs() || file2.exists()) {
                        sentryAndroidOptions.setProfilingTracesDirPath(file2.getAbsolutePath());
                    } else {
                        io.sentry.util.c.a(file2.getAbsolutePath(), "Creating a fallback directory for profiling failed in ");
                    }
                }
                ILogger logger2 = sentryAndroidOptions.getLogger();
                sentryAndroidOptions.getProfilingTracesHz();
                sentryAndroidOptions.getExecutorService();
                try {
                    Iterator it3 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                    if ((it3.hasNext() ? it3.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger2.h(s5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
                    sentryAndroidOptions.getContinuousProfiler();
                } catch (Throwable th) {
                    logger2.e(s5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
                }
            } catch (Exception e3) {
                sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to create default profiling traces directory", e3);
            }
        } else {
            sentryAndroidOptions.getContinuousProfiler();
        }
        if (!io.sentry.util.k.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getProfilerConverter() instanceof b3)) {
            ILogger logger3 = c.l.getLogger();
            try {
                Iterator it4 = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                if ((it4.hasNext() ? it4.next() : null) != null) {
                    throw new ClassCastException();
                }
                logger3.h(s5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
                sentryAndroidOptions.getLogger().h(s5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
                sentryAndroidOptions.getProfilerConverter();
            } catch (Throwable th2) {
                logger3.e(s5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            }
        } else {
            sentryAndroidOptions.getProfilerConverter();
        }
        sentryAndroidOptions.getLogger().h(s5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryAndroidOptions.isContinuousProfilingEnabled()), sentryAndroidOptions.getProfileLifecycle());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    public static void e(SentryAndroidOptions sentryAndroidOptions) {
        j1 yVar;
        Class clsD;
        List list;
        a3 a3Var = a3.X;
        boolean z = io.sentry.util.k.a;
        if (!z) {
            if (b6.AUTO.equals(sentryAndroidOptions.getOpenTelemetryMode())) {
                if (io.sentry.util.h.c("io.sentry.opentelemetry.agent.AgentMarker", a3Var)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(b6.AGENT);
                } else if (io.sentry.util.h.c("io.sentry.opentelemetry.agent.AgentlessMarker", a3Var)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(b6.AGENTLESS);
                } else if (io.sentry.util.h.c("io.sentry.opentelemetry.agent.AgentlessSpringMarker", a3Var)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(b6.AGENTLESS_SPRING);
                }
            }
        }
        b6 b6Var = b6.OFF;
        byte b2 = 1;
        if (b6Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            sentryAndroidOptions.setSpanFactory(new m3(b2));
        }
        a.close();
        sentryAndroidOptions.getScopesStorageFactory();
        if (b6Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            a = new y();
        } else {
            if (z || !io.sentry.util.h.c("io.sentry.opentelemetry.OtelContextScopesStorage", a3Var) || (clsD = io.sentry.util.h.d(a3Var, "io.sentry.opentelemetry.OtelContextScopesStorage", true)) == null) {
                yVar = new y();
            } else {
                try {
                    Object objNewInstance = clsD.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance instanceof j1) {
                        yVar = (j1) objNewInstance;
                    } else {
                        yVar = new y();
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            a = yVar;
        }
        if (io.sentry.util.k.a) {
            return;
        }
        b6 openTelemetryMode = sentryAndroidOptions.getOpenTelemetryMode();
        if (b6.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.p.a;
            ArrayList arrayList = new ArrayList();
            b6 b6Var2 = b6.AGENT;
            if (b6Var2 == openTelemetryMode || b6.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
                arrayList.add("auto.queue.spring_jakarta.kafka.producer");
                arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
                arrayList.add("auto.queue.kafka.producer");
                arrayList.add("auto.queue.kafka.consumer");
            }
            if (b6Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
                arrayList.add("auto.http.okhttp");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sentryAndroidOptions.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static boolean f(SentryAndroidOptions sentryAndroidOptions) {
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Set set;
        Properties propertiesL;
        Properties propertiesL2;
        if (sentryAndroidOptions.isEnableExternalConfiguration()) {
            u2 u2Var = new u2();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesL2 = new o8(property, u2Var, true).l()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesL2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesL = new o8(str, u2Var, true).l()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesL));
            }
            Double dValueOf4 = null;
            try {
                InputStream resourceAsStream = io.sentry.util.b.d(io.sentry.config.a.class.getClassLoader()).getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e2) {
                u2Var.d(s5.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.e(properties));
            }
            Properties propertiesL3 = new o8("sentry.properties", u2Var, false).l();
            if (propertiesL3 != null) {
                arrayList.add(new io.sentry.config.e(propertiesL3));
            }
            io.sentry.config.b bVar = new io.sentry.config.b(arrayList);
            ILogger logger = sentryAndroidOptions.getLogger();
            k0 k0Var = new k0();
            k0Var.a = bVar.getProperty("dsn");
            k0Var.b = bVar.getProperty("environment");
            k0Var.c = bVar.getProperty(BuildConfig.BUILD_TYPE);
            k0Var.d = bVar.getProperty("dist");
            k0Var.e = bVar.getProperty("servername");
            k0Var.f = bVar.a("uncaught.handler.enabled");
            k0Var.y = bVar.a("uncaught.handler.print-stacktrace");
            String property2 = bVar.getProperty("sample-rate");
            if (property2 != null) {
                try {
                    dValueOf = Double.valueOf(property2);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            k0Var.i = dValueOf;
            String property3 = bVar.getProperty("traces-sample-rate");
            if (property3 != null) {
                try {
                    dValueOf2 = Double.valueOf(property3);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            k0Var.j = dValueOf2;
            String property4 = bVar.getProperty("profiles-sample-rate");
            if (property4 != null) {
                try {
                    dValueOf3 = Double.valueOf(property4);
                } catch (NumberFormatException unused3) {
                    dValueOf3 = null;
                }
            } else {
                dValueOf3 = null;
            }
            k0Var.k = dValueOf3;
            k0Var.g = bVar.a("debug");
            k0Var.h = bVar.a("enable-deduplication");
            k0Var.z = bVar.a("send-client-reports");
            k0Var.R = bVar.a("force-init");
            String property5 = bVar.getProperty("max-request-body-size");
            if (property5 != null) {
                k0Var.l = q6.valueOf(property5.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) bVar.d()).entrySet()) {
                k0Var.m.put((String) entry.getKey(), (String) entry.getValue());
            }
            String property6 = bVar.getProperty("proxy.host");
            String property7 = bVar.getProperty("proxy.user");
            String property8 = bVar.getProperty("proxy.pass");
            String property9 = bVar.getProperty("proxy.port");
            if (property9 == null) {
                property9 = "80";
            }
            if (property6 != null) {
                p6 p6Var = new p6();
                p6Var.a = property6;
                p6Var.b = property9;
                p6Var.c = property7;
                p6Var.d = property8;
                k0Var.n = p6Var;
            }
            Iterator it = bVar.e("in-app-includes").iterator();
            while (it.hasNext()) {
                k0Var.p.add((String) it.next());
            }
            Iterator it2 = bVar.e("in-app-excludes").iterator();
            while (it2.hasNext()) {
                k0Var.o.add((String) it2.next());
            }
            List<String> listE = bVar.getProperty("trace-propagation-targets") != null ? bVar.e("trace-propagation-targets") : null;
            if (listE == null && bVar.getProperty("tracing-origins") != null) {
                listE = bVar.e("tracing-origins");
            }
            if (listE != null) {
                for (String str2 : listE) {
                    if (k0Var.q == null) {
                        k0Var.q = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        k0Var.q.add(str2);
                    }
                }
            }
            Iterator it3 = bVar.e("context-tags").iterator();
            while (it3.hasNext()) {
                k0Var.r.add((String) it3.next());
            }
            k0Var.s = bVar.getProperty("proguard-uuid");
            Iterator it4 = bVar.e("bundle-ids").iterator();
            while (it4.hasNext()) {
                k0Var.A.add((String) it4.next());
            }
            k0Var.t = bVar.c("idle-timeout");
            k0Var.u = bVar.c("shutdown-timeout-millis");
            k0Var.v = bVar.c("session-flush-timeout-millis");
            k0Var.x = bVar.b("ignored-errors");
            k0Var.B = bVar.a("enabled");
            k0Var.C = bVar.a("enable-pretty-serialization-output");
            k0Var.J = bVar.a("send-modules");
            k0Var.K = bVar.a("send-default-pii");
            q qVar = new q();
            Boolean boolA = bVar.a("data-collection.user-info");
            if (boolA != null) {
                qVar.a = boolA;
            }
            List listB = bVar.b("data-collection.http-bodies");
            if (listB == null) {
                set = null;
            } else if (listB.size() == 1 && ((String) listB.get(0)).isEmpty()) {
                set = Collections.EMPTY_SET;
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(r0.class);
                Iterator it5 = listB.iterator();
                while (it5.hasNext()) {
                    enumSetNoneOf.add(r0.valueOf(((String) it5.next()).toUpperCase(Locale.ROOT)));
                }
                set = enumSetNoneOf;
            }
            if (set != null) {
                qVar.b(set);
            }
            q2 q2VarA = k0.a(bVar, "data-collection.cookies");
            if (q2VarA != null) {
                qVar.b = q2VarA;
            }
            q2 q2VarA2 = k0.a(bVar, "data-collection.http-headers.request");
            io.sentry.internal.debugmeta.c cVar = qVar.g;
            if (q2VarA2 != null) {
                cVar.Y = q2VarA2;
            }
            q2 q2VarA3 = k0.a(bVar, "data-collection.http-headers.response");
            if (q2VarA3 != null) {
                cVar.Z = q2VarA3;
            }
            q2 q2VarA4 = k0.a(bVar, "data-collection.url-query-params");
            if (q2VarA4 != null) {
                qVar.c = q2VarA4;
            }
            Boolean boolA2 = bVar.a("data-collection.graphql.document");
            io.sentry.internal.debugmeta.c cVar2 = qVar.h;
            if (boolA2 != null) {
                cVar2.Y = boolA2;
            }
            Boolean boolA3 = bVar.a("data-collection.graphql.variables");
            if (boolA3 != null) {
                cVar2.Z = boolA3;
            }
            Boolean boolA4 = bVar.a("data-collection.database-query-data");
            if (boolA4 != null) {
                qVar.e = boolA4;
            }
            Boolean boolA5 = bVar.a("data-collection.file-paths");
            if (boolA5 != null) {
                qVar.f = boolA5;
            }
            if (!qVar.a()) {
                qVar = null;
            }
            k0Var.L = qVar;
            k0Var.H = bVar.b("ignored-checkins");
            k0Var.I = bVar.b("ignored-transactions");
            k0Var.M = bVar.a("enable-backpressure-handling");
            k0Var.N = bVar.a("enable-database-transaction-tracing");
            k0Var.O = bVar.a("enable-cache-tracing");
            k0Var.P = bVar.a("enable-queue-tracing");
            k0Var.Q = bVar.a("global-hub-mode");
            k0Var.S = bVar.a("capture-open-telemetry-events");
            k0Var.E = bVar.a("logs.enabled");
            k0Var.F = bVar.a("metrics.enabled");
            for (String str3 : bVar.e("ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        k0Var.w.add(cls);
                    } else {
                        logger.h(s5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.h(s5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            Long lC = bVar.c("cron.default-checkin-margin");
            Long lC2 = bVar.c("cron.default-max-runtime");
            String property10 = bVar.getProperty("cron.default-timezone");
            Long lC3 = bVar.c("cron.default-failure-issue-threshold");
            Long lC4 = bVar.c("cron.default-recovery-threshold");
            if (lC != null || lC2 != null || property10 != null || lC3 != null || lC4 != null) {
                i6 i6Var = new i6();
                i6Var.a = lC;
                i6Var.b = lC2;
                i6Var.c = property10;
                i6Var.d = lC3;
                i6Var.e = lC4;
                k0Var.Y = i6Var;
            }
            k0Var.W = bVar.a("enable-strict-trace-continuation");
            k0Var.X = bVar.getProperty("org-id");
            k0Var.D = bVar.a("enable-spotlight");
            k0Var.G = bVar.getProperty("spotlight-connection-url");
            String property11 = bVar.getProperty("profile-session-sample-rate");
            if (property11 != null) {
                try {
                    dValueOf4 = Double.valueOf(property11);
                } catch (NumberFormatException unused5) {
                }
            }
            k0Var.T = dValueOf4;
            k0Var.U = bVar.getProperty("profiling-traces-dir-path");
            String property12 = bVar.getProperty("profile-lifecycle");
            if (property12 != null && !property12.isEmpty()) {
                k0Var.V = y3.valueOf(property12.toUpperCase());
            }
            sentryAndroidOptions.merge(k0Var);
        }
        String dsn = sentryAndroidOptions.getDsn();
        if (!sentryAndroidOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            a();
            return false;
        }
        if (dsn != null) {
            sentryAndroidOptions.retrieveParsedDsn();
            return true;
        }
        bt.q("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        return false;
    }
}
