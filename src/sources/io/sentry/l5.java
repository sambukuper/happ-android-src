package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 implements m1 {
    public final ScheduledThreadPoolExecutor a;
    public final io.sentry.util.a b;
    public final s6 c;

    public l5(s6 s6Var, int i) {
        this(s6Var);
        this.a.setRemoveOnCancelPolicy(true);
        this.a.setKeepAliveTime(30L, TimeUnit.SECONDS);
        this.a.allowCoreThreadTimeOut(true);
        this.a.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    @Override // io.sentry.m1
    public final void a(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
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

    @Override // io.sentry.m1
    public final Future b(Runnable runnable, long j) {
        return this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.m1
    public final boolean isClosed() {
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            boolean zIsShutdown = this.a.isShutdown();
            aVar.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.m1
    public final Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        s6 s6Var = this.c;
        if (s6Var != null) {
            s6Var.getLogger().h(s5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new h();
    }

    public l5(s6 s6Var) {
        this(new ScheduledThreadPoolExecutor(1, new p0((byte) 1)), s6Var);
    }

    public l5(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, s6 s6Var) {
        this.b = new io.sentry.util.a();
        this.a = scheduledThreadPoolExecutor;
        this.c = s6Var;
    }

    public l5() {
        this(new ScheduledThreadPoolExecutor(1, new p0((byte) 1)), (s6) null);
    }
}
