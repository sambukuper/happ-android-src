package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.vg0;
import io.sentry.ILogger;
import io.sentry.p4;
import io.sentry.s5;
import java.io.Closeable;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.y1, Closeable, ComponentCallbacks2 {
    public static final io.sentry.n0 g0 = new io.sentry.n0();
    public final Context X;
    public io.sentry.i1 Y;
    public SentryAndroidOptions Z;
    public final io.sentry.android.core.internal.util.h f0 = new io.sentry.android.core.internal.util.h(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = p4.a;
        this.Z = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.Z.isEnableAppComponentBreadcrumbs()));
        if (this.Z.isEnableAppComponentBreadcrumbs()) {
            try {
                this.X.registerComponentCallbacks(this);
                sentryAndroidOptions.getLogger().h(s5Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.Z.setEnableAppComponentBreadcrumbs(false);
                sentryAndroidOptions.getLogger().d(s5.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.X.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().d(s5.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.Z;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().h(s5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    public final void g(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.Z.getLogger().d(s5.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        g(new vg0(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.f0.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            g(new Runnable() { // from class: io.sentry.android.core.c0
                @Override // java.lang.Runnable
                public final void run() {
                    io.sentry.n0 n0Var = AppComponentsBreadcrumbsIntegration.g0;
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.X;
                    if (appComponentsBreadcrumbsIntegration.Y != null) {
                        io.sentry.g gVar = new io.sentry.g(jCurrentTimeMillis);
                        gVar.g0 = "system";
                        gVar.i0 = "device.event";
                        gVar.f0 = "Low memory";
                        gVar.d("LOW_MEMORY", "action");
                        gVar.d(Integer.valueOf(i), "level");
                        gVar.k0 = s5.WARNING;
                        appComponentsBreadcrumbsIntegration.Y.a(gVar, AppComponentsBreadcrumbsIntegration.g0);
                    }
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
