package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t52 extends s52 implements kh1 {
    public final Executor Z;

    public t52(Executor executor) {
        Method method;
        this.Z = executor;
        Method method2 = g11.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = g11.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.kh1
    public final gq1 X(long j, Runnable runnable, s61 s61Var) {
        Executor executor = this.Z;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                u70.x(s61Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new fq1(scheduledFutureSchedule) : me1.m0.X(j, runnable, s61Var);
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        try {
            this.Z.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            u70.x(s61Var, cancellationException);
            nf1 nf1Var = tp1.a;
            ye1.Z.Z0(s61Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.Z;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.s52
    public final Executor d1() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t52) && ((t52) obj).Z == this.Z;
    }

    public final int hashCode() {
        return System.identityHashCode(this.Z);
    }

    @Override // defpackage.u61
    public final String toString() {
        return this.Z.toString();
    }

    @Override // defpackage.kh1
    public final void u0(long j, mm0 mm0Var) {
        Executor executor = this.Z;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            zo2 zo2Var = new zo2(this, mm0Var, (byte) 12);
            s61 s61Var = mm0Var.g0;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(zo2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                u70.x(s61Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            mm0Var.v(new dm0(scheduledFutureSchedule, (byte) 0));
        } else {
            me1.m0.u0(j, mm0Var);
        }
    }
}
