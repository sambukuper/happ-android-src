package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class TombstoneIntegration implements io.sentry.y1, Closeable {
    public final Context X;
    public SentryAndroidOptions Y;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.Y.isTombstoneEnabled()));
        if (this.Y.isTombstoneEnabled()) {
            if (this.Y.getCacheDirPath() == null) {
                this.Y.getLogger().h(s5.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.m1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.X;
                SentryAndroidOptions sentryAndroidOptions2 = this.Y;
                executorService.submit(new l0(context, sentryAndroidOptions2, new j2(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                ILogger logger2 = sentryAndroidOptions.getLogger();
                s5Var = s5.DEBUG;
                logger2.e(s5Var, "Failed to start tombstone processor.", th);
            }
            sentryAndroidOptions.getLogger().h(s5Var, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }
}
