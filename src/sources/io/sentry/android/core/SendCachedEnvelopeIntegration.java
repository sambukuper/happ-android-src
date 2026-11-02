package io.sentry.android.core;

import io.sentry.p4;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.s5;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.y1, io.sentry.v0, Closeable {
    public final s4 X;
    public final io.sentry.util.g Y;
    public io.sentry.w0 f0;
    public io.sentry.i1 g0;
    public SentryAndroidOptions h0;
    public r4 i0;
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final AtomicBoolean j0 = new AtomicBoolean(false);
    public final AtomicBoolean k0 = new AtomicBoolean(false);
    public final io.sentry.util.a l0 = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(s4 s4Var, io.sentry.util.g gVar) {
        this.X = s4Var;
        this.Y = gVar;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        p4 p4Var = p4.a;
        this.g0 = p4Var;
        this.h0 = sentryAndroidOptions;
        if (!s4.b(sentryAndroidOptions.getCacheDirPath(), sentryAndroidOptions.getLogger())) {
            sentryAndroidOptions.getLogger().h(s5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.b.a("SendCachedEnvelope");
            g(p4Var, this.h0);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.k0.set(true);
        io.sentry.w0 w0Var = this.f0;
        if (w0Var != null) {
            w0Var.I0(this);
        }
    }

    public final void g(io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.util.a aVar = this.l0;
            aVar.g();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new r1(this, sentryAndroidOptions, i1Var, (byte) 0));
                if (((Boolean) this.Y.a()).booleanValue() && this.Z.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // io.sentry.v0
    public final void u(io.sentry.u0 u0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.i1 i1Var = this.g0;
        if (i1Var == null || (sentryAndroidOptions = this.h0) == null || u0Var == io.sentry.u0.DISCONNECTED) {
            return;
        }
        g(i1Var, sentryAndroidOptions);
    }
}
