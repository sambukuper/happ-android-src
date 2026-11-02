package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 implements n2 {
    public boolean X;
    public Double Y;
    public boolean Z;
    public Double f0;
    public String g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public y3 o0;
    public ConcurrentHashMap p0;

    public w4(SentryAndroidOptions sentryAndroidOptions, b4 b4Var) {
        this.Z = ((Boolean) b4Var.a).booleanValue();
        this.f0 = (Double) b4Var.b;
        this.X = ((Boolean) b4Var.d).booleanValue();
        this.Y = (Double) b4Var.e;
        this.k0 = sentryAndroidOptions.getInternalTracesSampler().b(io.sentry.util.o.a().c());
        this.g0 = sentryAndroidOptions.getProfilingTracesDirPath();
        this.h0 = sentryAndroidOptions.isProfilingEnabled();
        this.i0 = sentryAndroidOptions.isContinuousProfilingEnabled();
        this.o0 = sentryAndroidOptions.getProfileLifecycle();
        this.j0 = sentryAndroidOptions.getProfilingTracesHz();
        this.l0 = sentryAndroidOptions.isEnableAppStartProfiling();
        this.m0 = sentryAndroidOptions.isStartProfilerOnAppStart();
        this.n0 = sentryAndroidOptions.isEnableLegacyProfiling();
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("profile_sampled");
        cVar.v(iLogger, Boolean.valueOf(this.X));
        cVar.p("profile_sample_rate");
        cVar.v(iLogger, this.Y);
        cVar.p("continuous_profile_sampled");
        cVar.v(iLogger, Boolean.valueOf(this.k0));
        cVar.p("trace_sampled");
        cVar.v(iLogger, Boolean.valueOf(this.Z));
        cVar.p("trace_sample_rate");
        cVar.v(iLogger, this.f0);
        cVar.p("profiling_traces_dir_path");
        cVar.v(iLogger, this.g0);
        cVar.p("is_profiling_enabled");
        cVar.v(iLogger, Boolean.valueOf(this.h0));
        cVar.p("is_continuous_profiling_enabled");
        cVar.v(iLogger, Boolean.valueOf(this.i0));
        cVar.p("profile_lifecycle");
        cVar.v(iLogger, this.o0.name());
        cVar.p("profiling_traces_hz");
        cVar.v(iLogger, Integer.valueOf(this.j0));
        cVar.p("is_enable_app_start_profiling");
        cVar.v(iLogger, Boolean.valueOf(this.l0));
        cVar.p("is_start_profiler_on_app_start");
        cVar.v(iLogger, Boolean.valueOf(this.m0));
        cVar.p("enable_legacy_profiling");
        cVar.v(iLogger, Boolean.valueOf(this.n0));
        ConcurrentHashMap concurrentHashMap = this.p0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.p0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
