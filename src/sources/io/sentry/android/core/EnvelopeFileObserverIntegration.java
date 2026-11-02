package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.p4;
import io.sentry.s3;
import io.sentry.s5;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.y1, Closeable {
    public u0 X;
    public ILogger Y;
    public boolean Z = false;
    public final io.sentry.util.a f0 = new io.sentry.util.a();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = sentryAndroidOptions.getLogger();
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        ILogger iLogger = this.Y;
        if (outboxPath == null) {
            iLogger.h(s5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        iLogger.h(s5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            sentryAndroidOptions.getExecutorService().submit(new r1(this, sentryAndroidOptions, outboxPath, (byte) 3));
        } catch (Throwable th) {
            this.Y.e(s5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            this.Z = true;
            aVar.close();
            u0 u0Var = this.X;
            if (u0Var != null) {
                u0Var.stopWatching();
                ILogger iLogger = this.Y;
                if (iLogger != null) {
                    iLogger.h(s5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(SentryAndroidOptions sentryAndroidOptions, String str) {
        if (!io.sentry.util.b.e(new File(str))) {
            sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to create outbox dir %s", str);
        }
        u0 u0Var = new u0(str, new s3(p4.a, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis());
        this.X = u0Var;
        try {
            u0Var.startWatching();
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.b.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }
}
