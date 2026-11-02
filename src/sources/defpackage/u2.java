package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2 implements xb4 {
    public static final boolean f0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g0 = Logger.getLogger(u2.class.getName());
    public static final vj8 h0;
    public static final Object i0;
    public volatile Object X;
    public volatile q2 Y;
    public volatile t2 Z;

    static {
        vj8 s2Var;
        try {
            s2Var = new r2(AtomicReferenceFieldUpdater.newUpdater(t2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t2.class, t2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, t2.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(u2.class, q2.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, "X"));
            th = null;
        } catch (Throwable th) {
            th = th;
            s2Var = new s2();
        }
        h0 = s2Var;
        if (th != null) {
            g0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i0 = new Object();
    }

    public static void d(u2 u2Var) {
        t2 t2Var;
        q2 q2Var;
        q2 q2Var2;
        q2 q2Var3;
        do {
            t2Var = u2Var.Z;
        } while (!h0.t(u2Var, t2Var, t2.c));
        while (true) {
            q2Var = null;
            if (t2Var == null) {
                break;
            }
            Thread thread = t2Var.a;
            if (thread != null) {
                t2Var.a = null;
                LockSupport.unpark(thread);
            }
            t2Var = t2Var.b;
        }
        u2Var.c();
        do {
            q2Var2 = u2Var.Y;
        } while (!h0.r(u2Var, q2Var2, q2.d));
        while (true) {
            q2Var3 = q2Var;
            q2Var = q2Var2;
            if (q2Var == null) {
                break;
            }
            q2Var2 = q2Var.c;
            q2Var.c = q2Var3;
        }
        while (q2Var3 != null) {
            q2 q2Var4 = q2Var3.c;
            e(q2Var3.a, q2Var3.b);
            q2Var3 = q2Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof n2) {
            Throwable th = ((n2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p2) {
            throw new ExecutionException(((p2) obj).a);
        }
        if (obj == i0) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        q2 q2Var = this.Y;
        q2 q2Var2 = q2.d;
        if (q2Var != q2Var2) {
            q2 q2Var3 = new q2(runnable, executor);
            do {
                q2Var3.c = q2Var;
                if (h0.r(this, q2Var, q2Var3)) {
                    return;
                } else {
                    q2Var = this.Y;
                }
            } while (q2Var != q2Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
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
        n2 n2Var;
        Object obj = this.X;
        if (obj == null) {
            if (f0) {
                n2Var = new n2(new CancellationException("Future.cancel() was called."), z);
            } else {
                n2Var = z ? n2.c : n2.d;
            }
            if (h0.s(this, obj, n2Var)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        t2 t2Var = t2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.X;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t2 t2Var2 = this.Z;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                while (true) {
                    vj8 vj8Var = h0;
                    vj8Var.Z(t2Var3, t2Var2);
                    if (vj8Var.t(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(t2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.X;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(t2Var3);
                        break;
                    }
                    t2Var2 = this.Z;
                    if (t2Var2 == t2Var) {
                    }
                }
            }
            return f(this.X);
        }
        while (nanos > 0) {
            Object obj3 = this.X;
            if (obj3 != null) {
                return f(obj3);
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

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(t2 t2Var) {
        t2Var.a = null;
        while (true) {
            t2 t2Var2 = this.Z;
            if (t2Var2 == t2.c) {
                return;
            }
            t2 t2Var3 = null;
            while (t2Var2 != null) {
                t2 t2Var4 = t2Var2.b;
                if (t2Var2.a != null) {
                    t2Var3 = t2Var2;
                } else if (t2Var3 != null) {
                    t2Var3.b = t2Var4;
                    if (t2Var3.a == null) {
                    }
                } else if (!h0.t(this, t2Var2, t2Var4)) {
                }
                t2Var2 = t2Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X instanceof n2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = i0;
        }
        if (!h0.s(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!h0.s(this, null, new p2(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.X instanceof n2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e) {
                strH = "Exception thrown from implementation: " + e.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        t2 t2Var = t2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if (obj2 != null) {
                return f(obj2);
            }
            t2 t2Var2 = this.Z;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                do {
                    vj8 vj8Var = h0;
                    vj8Var.Z(t2Var3, t2Var2);
                    if (vj8Var.t(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                            } else {
                                i(t2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    t2Var2 = this.Z;
                } while (t2Var2 != t2Var);
            }
            return f(this.X);
        }
        throw new InterruptedException();
    }
}
