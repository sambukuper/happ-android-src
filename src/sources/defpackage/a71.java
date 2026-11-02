package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater j0;
    public static final z31 k0;
    public static final /* synthetic */ long l0;
    public static final /* synthetic */ long m0;
    public static final /* synthetic */ long n0;
    public final int X;
    public final int Y;
    public final long Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final String f0;
    public final bs2 g0;
    public final bs2 h0;
    public final cf6 i0;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Unsafe unsafe = iu.a;
        n0 = unsafe.objectFieldOffset(a71.class.getDeclaredField("parkedWorkersStack$volatile"));
        j0 = AtomicLongFieldUpdater.newUpdater(a71.class, "controlState$volatile");
        m0 = unsafe.objectFieldOffset(a71.class.getDeclaredField("controlState$volatile"));
        l0 = unsafe.objectFieldOffset(a71.class.getDeclaredField("_isTerminated$volatile"));
        k0 = new z31("NOT_IN_STACK", (byte) 3);
    }

    public a71(long j, String str, int i, int i2) {
        this.X = i;
        this.Y = i2;
        this.Z = j;
        this.f0 = str;
        if (i < 1) {
            em7.c(ie2.h("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            em7.c(pc6.m("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            em7.c(ie2.h("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            b61.j("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.g0 = new bs2();
        this.h0 = new bs2();
        this.i0 = new cf6((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void m(a71 a71Var, Runnable runnable, int i) {
        a71Var.k(runnable, false, (i & 4) == 0);
    }

    public final boolean C() {
        a71 a71Var;
        z31 z31Var;
        int iB;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = n0;
            long longVolatile = unsafe.getLongVolatile(this, j);
            y61 y61Var = (y61) this.i0.b((int) (2097151 & longVolatile));
            if (y61Var == null) {
                y61Var = null;
                a71Var = this;
            } else {
                long j2 = (2097152 + longVolatile) & (-2097152);
                Object objC = y61Var.c();
                while (true) {
                    z31Var = k0;
                    if (objC == z31Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    y61 y61Var2 = (y61) objC;
                    iB = y61Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = y61Var2.c();
                    unsafe = unsafe;
                    this = this;
                }
                if (iB >= 0) {
                    a71 a71Var2 = this;
                    boolean zCompareAndSwapLong = unsafe.compareAndSwapLong(a71Var2, j, longVolatile, j2 | ((long) iB));
                    a71Var = a71Var2;
                    if (zCompareAndSwapLong) {
                        y61Var.g(z31Var);
                    }
                    this = a71Var;
                } else {
                    continue;
                }
            }
            if (y61Var == null) {
                return false;
            }
            if (y61.k0.compareAndSet(y61Var, -1, 0)) {
                LockSupport.unpark(y61Var);
                return true;
            }
            this = a71Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int longVolatile;
        x18 x18VarA;
        Unsafe unsafe = iu.a;
        if (unsafe.compareAndSwapInt(this, l0, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            y61 y61Var = threadCurrentThread instanceof y61 ? (y61) threadCurrentThread : null;
            if (y61Var == null || y61Var.j0 != this) {
                y61Var = null;
            }
            synchronized (this.i0) {
                longVolatile = (int) (unsafe.getLongVolatile(this, m0) & 2097151);
            }
            if (1 <= longVolatile) {
                int i = 1;
                while (true) {
                    Object objB = this.i0.b(i);
                    objB.getClass();
                    y61 y61Var2 = (y61) objB;
                    if (y61Var2 != y61Var) {
                        while (y61Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(y61Var2);
                            y61Var2.join(10000L);
                        }
                        f49 f49Var = y61Var2.X;
                        bs2 bs2Var = this.h0;
                        f49Var.getClass();
                        x18 x18Var = (x18) iu.a.getAndSetObject(f49Var, f49.f, (Object) null);
                        if (x18Var != null) {
                            bs2Var.a(x18Var);
                        }
                        while (true) {
                            x18 x18VarC = f49Var.c();
                            if (x18VarC == null) {
                                break;
                            } else {
                                bs2Var.a(x18VarC);
                            }
                        }
                    }
                    if (i == longVolatile) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.h0.b();
            this.g0.b();
            while (true) {
                if (y61Var != null) {
                    x18VarA = y61Var.a(true);
                    if (x18VarA == null) {
                        x18VarA = (x18) this.g0.d();
                        if (x18VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    x18VarA = (x18) this.g0.d();
                    if (x18VarA == null && (x18VarA = (x18) this.h0.d()) == null) {
                        break;
                    }
                }
                try {
                    x18VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (y61Var != null) {
                y61Var.h(z61.g0);
            }
            Unsafe unsafe2 = iu.a;
            unsafe2.putLongVolatile(this, n0, 0L);
            unsafe2.putLongVolatile(this, m0, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m(this, runnable, 6);
    }

    public final int g() {
        synchronized (this.i0) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
                Unsafe unsafe = iu.a;
                long j = m0;
                long longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile & 2097151);
                int i2 = i - ((int) ((longVolatile & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.X) {
                    return 0;
                }
                if (i >= this.Y) {
                    return 0;
                }
                int longVolatile2 = ((int) (unsafe.getLongVolatile(this, j) & 2097151)) + 1;
                if (longVolatile2 <= 0 || this.i0.b(longVolatile2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                y61 y61Var = new y61(this, longVolatile2);
                this.i0.c(longVolatile2, y61Var);
                if (longVolatile2 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = i2 + 1;
                y61Var.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isTerminated() {
        return iu.a.getIntVolatile(this, l0) == 1;
    }

    public final void k(Runnable runnable, boolean z, boolean z2) {
        x18 c28Var;
        z61 z61Var;
        h28.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof x18) {
            c28Var = (x18) runnable;
            c28Var.X = jNanoTime;
            c28Var.Y = z;
        } else {
            c28Var = new c28(runnable, jNanoTime, z);
        }
        boolean z3 = c28Var.Y;
        long jAddAndGet = z3 ? j0.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        y61 y61Var = threadCurrentThread instanceof y61 ? (y61) threadCurrentThread : null;
        if (y61Var == null || y61Var.j0 != this) {
            y61Var = null;
        }
        if (y61Var != null && (z61Var = y61Var.Z) != z61.g0 && (c28Var.Y || z61Var != z61.Y)) {
            y61Var.i0 = true;
            f49 f49Var = y61Var.X;
            if (z2) {
                c28Var = f49Var.a(c28Var);
            } else {
                f49Var.getClass();
                x18 x18Var = (x18) iu.a.getAndSetObject(f49Var, f49.f, c28Var);
                c28Var = x18Var == null ? null : f49Var.a(x18Var);
            }
        }
        if (c28Var != null) {
            if (!(c28Var.Y ? this.h0.a(c28Var) : this.g0.a(c28Var))) {
                throw new RejectedExecutionException(oi0.p(new StringBuilder(), this.f0, " was terminated"));
            }
        }
        if (z3) {
            if (C() || u(jAddAndGet)) {
                return;
            }
            C();
            return;
        }
        if (C() || u(iu.a.getLongVolatile(this, m0))) {
            return;
        }
        C();
    }

    public final void p(y61 y61Var, int i, int i2) {
        while (true) {
            long longVolatile = iu.a.getLongVolatile(this, n0);
            int i3 = (int) (2097151 & longVolatile);
            long j = (2097152 + longVolatile) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = y61Var.c();
                    while (true) {
                        if (objC == k0) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        y61 y61Var2 = (y61) objC;
                        int iB = y61Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = y61Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                a71 a71Var = this;
                if (iu.a.compareAndSwapLong(a71Var, n0, longVolatile, j | ((long) i3))) {
                    return;
                } else {
                    this = a71Var;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        cf6 cf6Var = this.i0;
        int iA = cf6Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            y61 y61Var = (y61) cf6Var.b(i6);
            if (y61Var != null) {
                f49 f49Var = y61Var.X;
                f49Var.getClass();
                Object objectVolatile = iu.a.getObjectVolatile(f49Var, f49.f);
                int iB = f49Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = y61Var.Z.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        b61.c();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long longVolatile = iu.a.getLongVolatile(this, m0);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f0);
        sb4.append('@');
        sb4.append(zc1.L(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.X;
        sb4.append(i7);
        sb4.append(", max = ");
        oi0.x(sb4, this.Y, "}, Worker States {CPU = ", i, ", blocking = ");
        oi0.x(sb4, i2, ", parked = ", i3, ", dormant = ");
        oi0.x(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.g0.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.h0.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & longVolatile));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & longVolatile) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((longVolatile & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.X;
        if (i < i2) {
            int iG = g();
            if (iG == 1 && i2 > 1) {
                g();
            }
            if (iG > 0) {
                return true;
            }
        }
        return false;
    }
}
