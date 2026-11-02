package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AppLifecycleIntegration implements io.sentry.y1, Closeable {
    public final io.sentry.util.a X = new io.sentry.util.a();
    public volatile y0 Y;
    public SentryAndroidOptions Z;

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Z = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.Z.isEnableAutoSessionTracking()));
        this.Z.getLogger().h(s5Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.Z.isEnableAppLifecycleBreadcrumbs()));
        if (this.Z.isEnableAutoSessionTracking() || this.Z.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.util.a aVar = this.X;
            aVar.g();
            try {
                if (this.Y != null) {
                    aVar.close();
                    return;
                }
                this.Y = new y0(this.Z.getSessionTrackingIntervalMillis(), this.Z.isEnableAutoSessionTracking(), this.Z.isEnableAppLifecycleBreadcrumbs());
                g0.g0.g(this.Y);
                aVar.close();
                sentryAndroidOptions.getLogger().h(s5Var, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppLifecycle");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.X;
        aVar.g();
        try {
            y0 y0Var = this.Y;
            this.Y = null;
            aVar.close();
            if (y0Var != null) {
                g0.g0.p(y0Var);
                SentryAndroidOptions sentryAndroidOptions = this.Z;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            g0.g0.u();
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
