package io.sentry.android.core;

import android.content.Context;
import defpackage.jn0;
import defpackage.sc4;
import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AnrIntegration implements io.sentry.y1, Closeable {
    public static a g0;
    public static final io.sentry.util.a h0 = new io.sentry.util.a();
    public final Context X;
    public boolean Y = false;
    public final io.sentry.util.a Z = new io.sentry.util.a();
    public SentryAndroidOptions f0;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.f0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.b.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new sc4(this, sentryAndroidOptions, (byte) 25));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().e(s5.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.Z;
        aVar.g();
        try {
            this.Y = true;
            aVar.close();
            io.sentry.util.a aVar2 = h0;
            aVar2.g();
            try {
                a aVar3 = g0;
                if (aVar3 != null) {
                    aVar3.interrupt();
                    g0 = null;
                    SentryAndroidOptions sentryAndroidOptions = this.f0;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                aVar2.close();
            } catch (Throwable th) {
                try {
                    aVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
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

    public final void g(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = h0;
        aVar.g();
        try {
            if (g0 == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                s5 s5Var = s5.DEBUG;
                logger.h(s5Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar2 = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new jn0(this, sentryAndroidOptions, (byte) 22), sentryAndroidOptions.getLogger(), this.X);
                g0 = aVar2;
                aVar2.start();
                sentryAndroidOptions.getLogger().h(s5Var, "AnrIntegration installed.", new Object[0]);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
