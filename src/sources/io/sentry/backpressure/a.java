package io.sentry.backpressure;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.m1;
import io.sentry.s5;
import io.sentry.v4;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, Runnable {
    public final SentryAndroidOptions X;
    public int Y = 0;
    public volatile Future Z = null;
    public final io.sentry.util.a f0 = new io.sentry.util.a();

    public a(SentryAndroidOptions sentryAndroidOptions) {
        this.X = sentryAndroidOptions;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.Y;
    }

    public final void b(int i) {
        m1 executorService = this.X.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            try {
                this.Z = executorService.b(this, i);
            } catch (RejectedExecutionException e) {
                this.X.getLogger().e(s5.WARNING, "Backpressure monitor reschedule task rejected", e);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.Z;
        if (future != null) {
            io.sentry.util.a aVar = this.f0;
            aVar.g();
            try {
                future.cancel(true);
                aVar.close();
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE = v4.b().e();
        int i = this.Y;
        SentryAndroidOptions sentryAndroidOptions = this.X;
        if (zE) {
            if (i > 0) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.Y = 0;
        } else if (i < 10) {
            this.Y = i + 1;
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.Y));
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
