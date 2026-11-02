package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class MemoryLimiterIntegration implements io.sentry.y1, Closeable {
    public final Context X;
    public SentryAndroidOptions Y;

    public MemoryLimiterIntegration(Context context, n0 n0Var) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "MemoryLimiterIntegration enabled: %s", Boolean.valueOf(this.Y.isMemoryLimiterEnabled()));
        if (this.Y.isMemoryLimiterEnabled()) {
            int i = Build.VERSION.SDK_INT;
            SentryAndroidOptions sentryAndroidOptions2 = this.Y;
            if (i < 37) {
                sentryAndroidOptions2.getLogger().h(s5.INFO, "MemoryLimiter is only supported on Android API 37 and above. Skipping registration.", new Object[0]);
                return;
            }
            if (sentryAndroidOptions2.getCacheDirPath() == null) {
                this.Y.getLogger().h(s5.INFO, "Cache dir is not set, unable to process MemoryLimiter exits. Skipping registration.", new Object[0]);
                return;
            }
            try {
                io.sentry.m1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.X;
                SentryAndroidOptions sentryAndroidOptions3 = this.Y;
                executorService.submit(new l0(context, sentryAndroidOptions3, new a0(sentryAndroidOptions3, (byte) 1)));
            } catch (Throwable th) {
                io.sentry.util.b.t(th);
                ILogger logger2 = sentryAndroidOptions.getLogger();
                s5Var = s5.DEBUG;
                logger2.e(s5Var, "Failed to start MemoryLimiter processor.", th);
            }
            sentryAndroidOptions.getLogger().h(s5Var, "MemoryLimiterIntegration installed.", new Object[0]);
            io.sentry.util.b.a("MemoryLimiter");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "MemoryLimiterIntegration removed.", new Object[0]);
        }
    }
}
