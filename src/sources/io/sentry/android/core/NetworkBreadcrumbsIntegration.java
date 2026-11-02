package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.y1, Closeable {
    public final Context X;
    public final n0 Y;
    public final io.sentry.util.a Z = new io.sentry.util.a();
    public volatile f1 f0;

    public NetworkBreadcrumbsIntegration(Context context, n0 n0Var) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.Y = n0Var;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            io.sentry.util.a aVar = this.Z;
            aVar.g();
            try {
                this.f0 = new f1(this.Y, sentryAndroidOptions.getDateProvider());
                Context context = this.X;
                ILogger logger2 = sentryAndroidOptions.getLogger();
                f1 f1Var = this.f0;
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.c.n0;
                if (io.sentry.config.a.n(context)) {
                    io.sentry.util.a aVar3 = io.sentry.android.core.internal.util.c.p0;
                    aVar3.g();
                    try {
                        io.sentry.android.core.internal.util.c.q0.add(f1Var);
                        aVar3.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            aVar3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    logger2.h(s5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    z = false;
                }
                if (z) {
                    sentryAndroidOptions.getLogger().h(s5Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.b.a("NetworkBreadcrumbs");
                } else {
                    sentryAndroidOptions.getLogger().h(s5Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                aVar.close();
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.Z;
        aVar.g();
        try {
            f1 f1Var = this.f0;
            this.f0 = null;
            aVar.close();
            if (f1Var != null) {
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.c.p0;
                aVar2.g();
                try {
                    io.sentry.android.core.internal.util.c.q0.remove(f1Var);
                    aVar2.close();
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
