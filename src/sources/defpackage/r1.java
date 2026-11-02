package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 implements xb4 {
    public static final boolean f0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g0 = Logger.getLogger(r1.class.getName());
    public static final mb6 h0;
    public static final Object i0;
    public volatile Object X;
    public volatile n1 Y;
    public volatile q1 Z;

    static {
        mb6 p1Var;
        try {
            p1Var = new o1(AtomicReferenceFieldUpdater.newUpdater(q1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q1.class, q1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r1.class, q1.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(r1.class, n1.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "X"));
            th = null;
        } catch (Throwable th) {
            th = th;
            p1Var = new p1();
        }
        h0 = p1Var;
        if (th != null) {
            g0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i0 = new Object();
    }

    public static void c(r1 r1Var) {
        q1 q1Var;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        do {
            q1Var = r1Var.Z;
        } while (!h0.m(r1Var, q1Var, q1.c));
        while (true) {
            n1Var = null;
            if (q1Var == null) {
                break;
            }
            Thread thread = q1Var.a;
            if (thread != null) {
                q1Var.a = null;
                LockSupport.unpark(thread);
            }
            q1Var = q1Var.b;
        }
        do {
            n1Var2 = r1Var.Y;
        } while (!h0.k(r1Var, n1Var2, n1.d));
        while (true) {
            n1Var3 = n1Var;
            n1Var = n1Var2;
            if (n1Var == null) {
                break;
            }
            n1Var2 = n1Var.c;
            n1Var.c = n1Var3;
        }
        while (n1Var3 != null) {
            n1 n1Var4 = n1Var3.c;
            d(n1Var3.a, n1Var3.b);
            n1Var3 = n1Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof k1) {
            Throwable th = ((k1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof m1) {
            throw new ExecutionException(((m1) obj).a);
        }
        if (obj == i0) {
            return null;
        }
        return obj;
    }

    public static Object f(r1 r1Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = r1Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.xb4
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        n1 n1Var = this.Y;
        n1 n1Var2 = n1.d;
        if (n1Var != n1Var2) {
            n1 n1Var3 = new n1(runnable, executor);
            do {
                n1Var3.c = n1Var;
                if (h0.k(this, n1Var, n1Var3)) {
                    return;
                } else {
                    n1Var = this.Y;
                }
            } while (n1Var != n1Var2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        k1 k1Var;
        Object obj = this.X;
        if (obj != null) {
            return false;
        }
        if (f0) {
            k1Var = new k1(new CancellationException("Future.cancel() was called."), z);
        } else {
            k1Var = z ? k1.b : k1.c;
        }
        if (!h0.l(this, obj, k1Var)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void g(q1 q1Var) {
        q1Var.a = null;
        while (true) {
            q1 q1Var2 = this.Z;
            if (q1Var2 == q1.c) {
                return;
            }
            q1 q1Var3 = null;
            while (q1Var2 != null) {
                q1 q1Var4 = q1Var2.b;
                if (q1Var2.a != null) {
                    q1Var3 = q1Var2;
                } else if (q1Var3 != null) {
                    q1Var3.b = q1Var4;
                    if (q1Var3.a == null) {
                    }
                } else if (!h0.m(this, q1Var2, q1Var4)) {
                }
                q1Var2 = q1Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        q1 q1Var = q1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.X;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q1 q1Var2 = this.Z;
            if (q1Var2 != q1Var) {
                q1 q1Var3 = new q1();
                while (true) {
                    mb6 mb6Var = h0;
                    mb6Var.X(q1Var3, q1Var2);
                    if (mb6Var.m(this, q1Var2, q1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(q1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.X;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(q1Var3);
                        break;
                    }
                    q1Var2 = this.Z;
                    if (q1Var2 == q1Var) {
                    }
                }
            }
            return e(this.X);
        }
        while (nanos > 0) {
            Object obj3 = this.X;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbS = pc6.s(j, "Waited ", " ");
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(pc6.p(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X instanceof k1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.X instanceof k1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        q1 q1Var = q1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if (obj2 != null) {
                return e(obj2);
            }
            q1 q1Var2 = this.Z;
            if (q1Var2 != q1Var) {
                q1 q1Var3 = new q1();
                do {
                    mb6 mb6Var = h0;
                    mb6Var.X(q1Var3, q1Var2);
                    if (mb6Var.m(this, q1Var2, q1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                g(q1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    q1Var2 = this.Z;
                } while (q1Var2 != q1Var);
            }
            return e(this.X);
        }
        throw new InterruptedException();
    }
}
