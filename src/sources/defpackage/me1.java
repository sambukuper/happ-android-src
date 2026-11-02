package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 extends i42 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final me1 m0;
    public static final long n0;

    static {
        Long l;
        me1 me1Var = new me1();
        m0 = me1Var;
        me1Var.f1(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n0 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.kh1
    public final gq1 X(long j, Runnable runnable, s61 s61Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return t55.X;
        }
        long jNanoTime = System.nanoTime();
        f42 f42Var = new f42(runnable, j2 + jNanoTime);
        o1(jNanoTime, f42Var);
        return f42Var;
    }

    @Override // defpackage.i42
    public final void i1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.i1(runnable);
    }

    @Override // defpackage.i42
    public final Thread l1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(m0.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.i42
    public final void n1(long j, g42 g42Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void p1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = iu.a;
            unsafe.putObjectVolatile(this, i42.k0, (Object) null);
            unsafe.putObjectVolatile(this, i42.i0, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j98.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    p1();
                    if (m1()) {
                        return;
                    }
                    l1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jG1 = g1();
                    if (jG1 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n0 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            p1();
                            if (m1()) {
                                return;
                            }
                            l1();
                            return;
                        }
                        if (jG1 > j2) {
                            jG1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jG1 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            p1();
                            if (m1()) {
                                return;
                            }
                            l1();
                            return;
                        }
                        LockSupport.parkNanos(this, jG1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            p1();
            if (!m1()) {
                l1();
            }
            throw th;
        }
    }

    @Override // defpackage.i42, defpackage.d42
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.u61
    public final String toString() {
        return "DefaultExecutor";
    }
}
