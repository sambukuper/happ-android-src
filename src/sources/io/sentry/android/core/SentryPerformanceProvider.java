package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.bt;
import defpackage.j78;
import io.sentry.ILogger;
import io.sentry.b4;
import io.sentry.l5;
import io.sentry.m2;
import io.sentry.m7;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.w4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends s0 {
    public static final long g0 = SystemClock.uptimeMillis();
    public static final /* synthetic */ int h0 = 0;
    public Application Y;
    public final v Z;
    public final n0 f0;

    public SentryPerformanceProvider() {
        v vVar = new v((byte) 3);
        this.Z = vVar;
        this.f0 = new n0((ILogger) vVar);
    }

    public final void a(Context context, w4 w4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = w4Var.k0;
        v vVar = this.Z;
        if (!z) {
            vVar.h(s5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        h hVar = new h(this.f0, new io.sentry.android.core.internal.util.t(context.getApplicationContext(), vVar, this.f0), vVar, w4Var.g0, w4Var.j0, new j78(new l5(), (byte) 17));
        gVar.k0 = null;
        gVar.l0 = hVar;
        vVar.h(s5.DEBUG, "App start continuous profiling started.", new Object[0]);
        s6 s6VarEmpty = s6.empty();
        s6VarEmpty.setProfileSessionSampleRate(Double.valueOf(w4Var.k0 ? 1.0d : 0.0d));
        hVar.c(w4Var.o0, new m7(s6VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            bt.i("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final void b(Context context, w4 w4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = w4Var.Z;
        b4 b4Var = new b4(Boolean.valueOf(z), w4Var.f0, (Double) null, Boolean.valueOf(w4Var.X), w4Var.Y);
        gVar.m0 = b4Var;
        boolean zBooleanValue = ((Boolean) b4Var.d).booleanValue();
        v vVar = this.Z;
        if (!zBooleanValue || !z) {
            vVar.h(s5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        l5 l5Var = new l5();
        n0 n0Var = this.f0;
        w wVar = new w(context, n0Var, new io.sentry.android.core.internal.util.t(context, vVar, n0Var), vVar, w4Var.g0, w4Var.h0, w4Var.j0, new j78(l5Var, (byte) 17));
        gVar.l0 = null;
        gVar.k0 = wVar;
        vVar.h(s5.DEBUG, "App start profiling started.", new Object[0]);
        wVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader, java.io.Reader] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ?? CanRead;
        w4 w4VarB;
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        Context context = getContext();
        gVarC.g0.e(g0);
        this.f0.getClass();
        gVarC.f0.e(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.Y = (Application) context;
        }
        Application application = this.Y;
        if (application != null) {
            gVarC.f(application);
        }
        Context context2 = getContext();
        v vVar = this.Z;
        if (context2 == null) {
            vVar.h(s5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || (CanRead = file.canRead()) == 0) {
            return true;
        }
        try {
            try {
                CanRead = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    m2 m2Var = new m2(CanRead);
                    try {
                        w4VarB = io.sentry.f.b(m2Var, vVar);
                        m2Var.close();
                        if (w4VarB == null) {
                            vVar.h(s5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            vVar.h(s5.DEBUG, "Device is API 35+. Skipping legacy app-start profiling — Perfetto ProfilingManager will be initialized after Sentry.init().", new Object[0]);
                        } else if (!w4VarB.n0) {
                            vVar.h(s5.WARNING, "enableLegacyProfiling is disabled and device is below API 35. App start profiling will not start.", new Object[0]);
                        } else if (w4VarB.i0 && w4VarB.m0) {
                            a(context2, w4VarB, gVarC);
                        } else if (!w4VarB.h0) {
                            vVar.h(s5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                        } else if (w4VarB.l0) {
                            b(context2, w4VarB, gVarC);
                        }
                        CanRead.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            m2Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    vVar.e(s5.ERROR, "Error when deserializing", e);
                    w4VarB = null;
                }
            } catch (Throwable th3) {
                try {
                    CanRead.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException e2) {
            vVar.e(s5.ERROR, "App start profiling config file not found. ", e2);
            return true;
        } catch (Throwable th5) {
            vVar.e(s5.ERROR, "Error reading app start profiling config file. ", th5);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.util.a aVar = io.sentry.android.core.performance.g.C0;
        aVar.g();
        try {
            w wVar = io.sentry.android.core.performance.g.c().k0;
            if (wVar != null) {
                wVar.close();
            }
            h hVar = io.sentry.android.core.performance.g.c().l0;
            if (hVar != null) {
                hVar.close(true);
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
}
