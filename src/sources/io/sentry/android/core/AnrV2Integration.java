package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AnrV2Integration implements io.sentry.y1, Closeable {
    public final Context X;
    public SentryAndroidOptions Y;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "AnrIntegration enabled: %s", Boolean.valueOf(this.Y.isAnrEnabled()));
        String cacheDirPath = this.Y.getCacheDirPath();
        SentryAndroidOptions sentryAndroidOptions2 = this.Y;
        if (cacheDirPath == null) {
            sentryAndroidOptions2.getLogger().h(s5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (sentryAndroidOptions2.isAnrEnabled()) {
            try {
                io.sentry.m1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.X;
                SentryAndroidOptions sentryAndroidOptions3 = this.Y;
                executorService.submit(new l0(context, sentryAndroidOptions3, new a0(sentryAndroidOptions3, (byte) 0)));
            } catch (Throwable th) {
                ILogger logger2 = sentryAndroidOptions.getLogger();
                s5Var = s5.DEBUG;
                logger2.e(s5Var, "Failed to start ANR processor.", th);
            }
            sentryAndroidOptions.getLogger().h(s5Var, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.b.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }
}
