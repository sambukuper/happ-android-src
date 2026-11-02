package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SentryAndroidOptions Y;

    public /* synthetic */ t4(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.X = b;
        this.Y = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        switch (b) {
            case 0:
                sentryAndroidOptions.loadLazyFields();
                return;
            case 1:
                String cacheDirPathWithoutDsn = sentryAndroidOptions.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn);
                    File file2 = new File(file, "app_start_profiling_config");
                    try {
                        io.sentry.util.b.g(file2);
                        if (sentryAndroidOptions.isEnableAppStartProfiling() || sentryAndroidOptions.isStartProfilerOnAppStart()) {
                            if (!sentryAndroidOptions.isStartProfilerOnAppStart() && !sentryAndroidOptions.isTracingEnabled()) {
                                sentryAndroidOptions.getLogger().h(s5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (!io.sentry.util.b.e(file)) {
                                sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to create cache dir %s", cacheDirPathWithoutDsn);
                                return;
                            }
                            if (file2.createNewFile()) {
                                w4 w4Var = new w4(sentryAndroidOptions, sentryAndroidOptions.isEnableAppStartProfiling() ? sentryAndroidOptions.getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(new n7("app.launch", io.sentry.protocol.h0.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.o.a().c()))) : new b4(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, v4.e));
                                    try {
                                        sentryAndroidOptions.getSerializer().a(w4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().e(s5.ERROR, "Unable to create app start profiling config file. ", th5);
                        return;
                    }
                }
                return;
            case 2:
                for (c1 c1Var : sentryAndroidOptions.getOptionsObservers()) {
                    c1Var.g(sentryAndroidOptions.getRelease());
                    c1Var.f(sentryAndroidOptions.getProguardUuid());
                    c1Var.b(sentryAndroidOptions.getSdkVersion());
                    c1Var.c(sentryAndroidOptions.getDist());
                    c1Var.e(sentryAndroidOptions.getEnvironment());
                    c1Var.a(sentryAndroidOptions.getTags());
                    c1Var.d(sentryAndroidOptions.getSessionReplay().e);
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    try {
                        io.sentry.cache.tape.g gVar = (io.sentry.cache.tape.g) gVarFindPersistingScopeObserver.b.a();
                        gVar.clear();
                        gVar.Y();
                        break;
                    } catch (IOException e) {
                        gVarFindPersistingScopeObserver.a.getLogger().e(s5.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    gVarFindPersistingScopeObserver.g("user.json");
                    gVarFindPersistingScopeObserver.g("level.json");
                    gVarFindPersistingScopeObserver.g("request.json");
                    gVarFindPersistingScopeObserver.g("fingerprint.json");
                    gVarFindPersistingScopeObserver.g("contexts.json");
                    gVarFindPersistingScopeObserver.g("extras.json");
                    gVarFindPersistingScopeObserver.g("tags.json");
                    gVarFindPersistingScopeObserver.g("trace.json");
                    gVarFindPersistingScopeObserver.g("transaction.json");
                    gVarFindPersistingScopeObserver.g("replay.json");
                    return;
                }
                return;
            default:
                v4.b().f(sentryAndroidOptions.getFlushTimeoutMillis());
                return;
        }
    }
}
