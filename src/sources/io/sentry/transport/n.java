package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.b5;
import io.sentry.p0;
import io.sentry.s5;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {
    public final int X;
    public a5 Y;
    public final ILogger Z;
    public final b5 f0;
    public final io.sentry.d g0;

    public n(int i, p0 p0Var, a aVar, ILogger iLogger, b5 b5Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), p0Var, aVar);
        this.Y = null;
        this.g0 = new io.sentry.d((byte) 11);
        this.X = i;
        this.Z = iLogger;
        this.f0 = b5Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        p pVar = (p) this.g0.Y;
        try {
            super.afterExecute(runnable, th);
        } finally {
            int i = p.X;
            pVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        p pVar = (p) this.g0.Y;
        int i = p.X;
        int iA = pVar.a();
        int i2 = this.X;
        ILogger iLogger = this.Z;
        b5 b5Var = this.f0;
        if (iA >= i2) {
            this.Y = b5Var.a();
            iLogger.h(s5.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        pVar.b();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            pVar.releaseShared(1);
            this.Y = b5Var.a();
            iLogger.e(s5.WARNING, "Submit rejected by thread pool executor", e);
            return new m();
        }
    }
}
