package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import defpackage.nd;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.File;
import java.util.function.Consumer;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public final ILogger a;
    public final io.sentry.m1 b;
    public final ProfilingManager c;
    public final CancellationSignal d;
    public final Object e;
    public volatile ProfilingResult f;
    public Consumer g;
    public volatile boolean h;
    public volatile io.sentry.android.core.internal.profiling.a i;

    public m1(Context context, ILogger iLogger, io.sentry.m1 m1Var) {
        ProfilingManager profilingManager = (ProfilingManager) context.getSystemService("profiling");
        this.d = new CancellationSignal();
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.a = iLogger;
        this.b = m1Var;
        this.c = profilingManager;
    }

    public static String a(int i) {
        if (i == 1) {
            return "ERROR_FAILED_RATE_LIMIT_SYSTEM";
        }
        if (i == 2) {
            return "ERROR_FAILED_RATE_LIMIT_PROCESS";
        }
        if (i == 3) {
            return "ERROR_FAILED_PROFILING_IN_PROGRESS";
        }
        if (i == 5) {
            return "ERROR_FAILED_POST_PROCESSING";
        }
        if (i != 7) {
            return i != 8 ? "UNKNOWN_ERROR_CODE" : "ERROR_UNKNOWN";
        }
        return "ERROR_FAILED_INVALID_REQUEST";
    }

    public final File b(ProfilingResult profilingResult) {
        int errorCode = profilingResult.getErrorCode();
        io.sentry.android.core.internal.profiling.a aVar = this.i;
        if (errorCode != 0) {
            if (errorCode == 1 || errorCode == 2) {
                this.a.h(s5.INFO, "Perfetto profiling failed: %s. To disable during development run: adb shell device_config put profiling_testing rate_limiter.disabled true", a(errorCode));
            } else {
                this.a.h(s5.WARNING, "Perfetto profiling failed with %s (error code %d): %s. See https://developer.android.com/reference/android/os/ProfilingResult", a(errorCode), Integer.valueOf(errorCode), profilingResult.getErrorMessage());
            }
            return null;
        }
        String resultFilePath = profilingResult.getResultFilePath();
        if (resultFilePath == null) {
            if (aVar != null) {
                aVar.a(io.sentry.profiling.c.NOT_RECORDED);
            }
            this.a.h(s5.WARNING, "Perfetto profiling result file path is null.", new Object[0]);
            return null;
        }
        File file = new File(resultFilePath);
        if (file.exists() && file.length() != 0) {
            return file;
        }
        if (aVar != null) {
            aVar.a(io.sentry.profiling.c.NOT_RECORDED);
        }
        this.a.h(s5.WARNING, "Perfetto trace file does not exist or is empty.", new Object[0]);
        return null;
    }

    public final boolean c(io.sentry.android.core.internal.profiling.a aVar) {
        if (this.h) {
            this.a.h(s5.WARNING, "PerfettoProfiler was already started.", new Object[0]);
            return false;
        }
        this.h = true;
        if (this.c == null) {
            this.a.h(s5.WARNING, "ProfilingManager is not available.", new Object[0]);
            return false;
        }
        this.i = aVar;
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_DURATION_MS", 60000);
        bundle.putInt("KEY_FREQUENCY_HZ", HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
        try {
            this.c.requestProfiling(3, bundle, "sentry-profiling", this.d, new nd((byte) 2), new Consumer() { // from class: io.sentry.android.core.k1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    m1 m1Var = this.a;
                    ProfilingResult profilingResult = (ProfilingResult) obj;
                    m1Var.a.h(s5.DEBUG, "Perfetto ProfilingResult received: errorCode=%d, filePath=%s", Integer.valueOf(profilingResult.getErrorCode()), profilingResult.getResultFilePath());
                    io.sentry.android.core.internal.profiling.a aVar2 = m1Var.i;
                    if (aVar2 != null && profilingResult.getErrorCode() != 0) {
                        aVar2.a(io.sentry.profiling.c.NOT_RECORDED);
                    }
                    synchronized (m1Var.e) {
                        try {
                            m1Var.f = profilingResult;
                            Consumer consumer = m1Var.g;
                            if (consumer != null) {
                                consumer.accept(m1Var.b(profilingResult));
                                m1Var.g = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            this.a.e(s5.ERROR, "Failed to request Profiling.", th);
            this.i = null;
            return false;
        }
    }
}
