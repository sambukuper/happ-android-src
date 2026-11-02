package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class nv extends ta8 {
    private static final jv Companion = new jv();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static nv idleSentinel;
    private static final ReentrantLock lock;
    private static final iu5 queue;
    public int index = -1;
    private int state;
    private long timeoutAt;

    static {
        iu5 iu5Var = new iu5();
        iu5Var.b = new nv[8];
        queue = iu5Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        condition = conditionNewCondition;
        IDLE_TIMEOUT_MILLIS = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(nv nvVar, long j, int i, Object obj) {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: setTimeoutAt");
            return;
        }
        if ((i & 1) != 0) {
            j = System.nanoTime();
        }
        nvVar.setTimeoutAt$okio(j);
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // defpackage.ta8
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.b(this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.getClass();
                jv.b(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            queue.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long getTimeoutAt$okio() {
        return this.timeoutAt;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long j) {
        return this.timeoutAt - j;
    }

    public final void setTimeoutAt$okio(long j) {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (timeoutNanos() != 0 && hasDeadline()) {
            this.timeoutAt = Math.min(jTimeoutNanos, deadlineNanoTime() - j) + j;
        } else if (jTimeoutNanos != 0) {
            this.timeoutAt = j + jTimeoutNanos;
        } else {
            if (!zHasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = deadlineNanoTime();
        }
    }

    public final sa7 sink(sa7 sa7Var) {
        sa7Var.getClass();
        return new lv(this, sa7Var, (byte) 0);
    }

    public final je7 source(je7 je7Var) {
        je7Var.getClass();
        return new mv(this, je7Var);
    }

    public final <T> T withTimeout(dn2 dn2Var) throws IOException {
        dn2Var.getClass();
        enter();
        try {
            try {
                T t = (T) dn2Var.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return t;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }

    public void timedOut() {
    }
}
