package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k0 = AtomicIntegerFieldUpdater.newUpdater(y61.class, "workerCtl$volatile");
    public static final /* synthetic */ long l0 = iu.a.objectFieldOffset(y61.class.getDeclaredField("workerCtl$volatile"));
    public final f49 X;
    public final ea6 Y;
    public z61 Z;
    public long f0;
    public long g0;
    public int h0;
    public boolean i0;
    private volatile int indexInArray;
    public final /* synthetic */ a71 j0;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public y61(a71 a71Var, int i) {
        this.j0 = a71Var;
        setDaemon(true);
        setContextClassLoader(a71.class.getClassLoader());
        this.X = new f49();
        this.Y = new ea6();
        this.Z = z61.f0;
        this.nextParkedWorker = a71.k0;
        int iNanoTime = (int) System.nanoTime();
        this.h0 = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final x18 a(boolean z) {
        x18 x18VarE;
        x18 x18VarE2;
        long j;
        Unsafe unsafe;
        z61 z61Var = this.Z;
        a71 a71Var = this.j0;
        x18 x18Var = null;
        f49 f49Var = this.X;
        z61 z61Var2 = z61.X;
        if (z61Var != z61Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a71.j0;
            do {
                j = atomicLongFieldUpdater.get(a71Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    f49Var.getClass();
                    long j2 = f49.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = iu.a;
                        x18 x18Var2 = (x18) unsafe2.getObjectVolatile(f49Var, j2);
                        if (x18Var2 == null || !x18Var2.Y) {
                            int intVolatile = unsafe2.getIntVolatile(f49Var, f49.e);
                            int intVolatile2 = unsafe2.getIntVolatile(f49Var, f49.g);
                            while (intVolatile != intVolatile2 && iu.a.getIntVolatile(f49Var, f49.d) != 0) {
                                intVolatile2--;
                                x18 x18VarD = f49Var.d(intVolatile2, true);
                                if (x18VarD != null) {
                                    x18Var = x18VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = iu.a;
                            if (unsafe.compareAndSwapObject(f49Var, f49.f, x18Var2, (Object) null)) {
                                x18Var = x18Var2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(f49Var, j2) == x18Var2);
                    }
                    if (x18Var != null) {
                        return x18Var;
                    }
                    x18 x18Var3 = (x18) a71Var.h0.d();
                    return x18Var3 == null ? i(1) : x18Var3;
                }
            } while (!a71.j0.compareAndSet(a71Var, j, j - 4398046511104L));
            this.Z = z61Var2;
        }
        if (z) {
            boolean z2 = d(a71Var.X * 2) == 0;
            if (z2 && (x18VarE2 = e()) != null) {
                return x18VarE2;
            }
            f49Var.getClass();
            x18 x18VarC = (x18) iu.a.getAndSetObject(f49Var, f49.f, (Object) null);
            if (x18VarC == null) {
                x18VarC = f49Var.c();
            }
            if (x18VarC != null) {
                return x18VarC;
            }
            if (!z2 && (x18VarE = e()) != null) {
                return x18VarE;
            }
        } else {
            x18 x18VarE3 = e();
            if (x18VarE3 != null) {
                return x18VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.h0;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h0 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final x18 e() {
        int iD = d(2);
        a71 a71Var = this.j0;
        bs2 bs2Var = a71Var.h0;
        bs2 bs2Var2 = a71Var.g0;
        if (iD == 0) {
            x18 x18Var = (x18) bs2Var2.d();
            return x18Var != null ? x18Var : (x18) bs2Var.d();
        }
        x18 x18Var2 = (x18) bs2Var.d();
        return x18Var2 != null ? x18Var2 : (x18) bs2Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j0.f0);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(z61 z61Var) {
        z61 z61Var2 = this.Z;
        boolean z = z61Var2 == z61.X;
        if (z) {
            a71.j0.addAndGet(this.j0, 4398046511104L);
        }
        if (z61Var2 != z61Var) {
            this.Z = z61Var;
        }
        return z;
    }

    public final x18 i(int i) {
        int i2;
        long j;
        x18 x18VarC;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a71.j0;
        a71 a71Var = this.j0;
        int i3 = (int) (atomicLongFieldUpdater.get(a71Var) & 2097151);
        x18 x18Var = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            y61 y61Var = (y61) a71Var.i0.b(iD);
            if (y61Var == null || y61Var == this) {
                i2 = i3;
            } else {
                f49 f49Var = y61Var.X;
                f49Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe2 = iu.a;
                    j = 0;
                    int intVolatile = unsafe2.getIntVolatile(f49Var, f49.e);
                    int intVolatile2 = unsafe2.getIntVolatile(f49Var, f49.g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (iu.a.getIntVolatile(f49Var, f49.d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            x18 x18VarD = f49Var.d(intVolatile, z);
                            if (x18VarD != null) {
                                x18VarC = x18VarD;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        x18VarC = x18Var;
                        break;
                    }
                } else {
                    x18VarC = f49Var.c();
                    i2 = i3;
                    j = 0;
                }
                ea6 ea6Var = this.Y;
                if (x18VarC == null) {
                    j2 = -1;
                    long j4 = f49.f;
                    while (true) {
                        x18 x18Var2 = (x18) iu.a.getObjectVolatile(f49Var, j4);
                        if (x18Var2 != null) {
                            if (((x18Var2.Y ? 1 : 2) & i) != 0) {
                                h28.f.getClass();
                                f49 f49Var2 = f49Var;
                                long jNanoTime = System.nanoTime() - x18Var2.X;
                                long j5 = h28.b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = iu.a;
                                    if (unsafe.compareAndSwapObject(f49Var2, f49.f, x18Var2, (Object) null)) {
                                        ea6Var.X = x18Var2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(f49Var2, j4) == x18Var2);
                                f49Var = f49Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    ea6Var.X = x18VarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    x18 x18Var3 = (x18) ea6Var.X;
                    ea6Var.X = null;
                    return x18Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            x18Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.g0 = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.j0.isTerminated()) {
                    z61 z61Var = this.Z;
                    z61 z61Var2 = z61.g0;
                    if (z61Var == z61Var2) {
                        break loop0;
                    }
                    x18 x18VarA = a(this.i0);
                    long j = 0;
                    if (x18VarA != null) {
                        this.g0 = 0L;
                        a71 a71Var = this.j0;
                        this.f0 = 0L;
                        if (this.Z == z61.Z) {
                            this.Z = z61.Y;
                        }
                        if (!x18VarA.Y) {
                            try {
                                x18VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(z61.Y) && !a71Var.C() && !a71Var.u(iu.a.getLongVolatile(a71Var, a71.m0))) {
                            a71Var.C();
                        }
                        try {
                            x18VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        a71.j0.addAndGet(a71Var, -2097152L);
                        if (this.Z == z61Var2) {
                            break;
                        }
                        this.Z = z61.f0;
                        break;
                    }
                    this.i0 = false;
                    if (this.g0 == 0) {
                        Object obj = this.nextParkedWorker;
                        z31 z31Var = a71.k0;
                        if (obj != z31Var) {
                            iu.a.putIntVolatile(this, l0, -1);
                            while (this.nextParkedWorker != a71.k0) {
                                Unsafe unsafe = iu.a;
                                long j2 = l0;
                                if (unsafe.getIntVolatile(this, j2) != -1 || this.j0.isTerminated()) {
                                    break;
                                }
                                z61 z61Var3 = this.Z;
                                z61 z61Var4 = z61.g0;
                                if (z61Var3 == z61Var4) {
                                    break;
                                }
                                h(z61.Z);
                                Thread.interrupted();
                                if (this.f0 == j) {
                                    this.f0 = System.nanoTime() + this.j0.Z;
                                }
                                LockSupport.parkNanos(this.j0.Z);
                                if (System.nanoTime() - this.f0 >= j) {
                                    this.f0 = j;
                                    a71 a71Var2 = this.j0;
                                    synchronized (a71Var2.i0) {
                                        try {
                                            if (!a71Var2.isTerminated()) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = a71.j0;
                                                if (((int) (atomicLongFieldUpdater.get(a71Var2) & 2097151)) > a71Var2.X && unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    f(0);
                                                    a71Var2.p(this, i, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(a71Var2) & 2097151);
                                                    if (andDecrement != i) {
                                                        Object objB = a71Var2.i0.b(andDecrement);
                                                        objB.getClass();
                                                        y61 y61Var = (y61) objB;
                                                        a71Var2.i0.c(i, y61Var);
                                                        y61Var.f(i);
                                                        a71Var2.p(y61Var, andDecrement, i);
                                                    }
                                                    a71Var2.i0.c(andDecrement, null);
                                                    this.Z = z61Var4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                j = 0;
                            }
                        } else {
                            a71 a71Var3 = this.j0;
                            if (this.nextParkedWorker == z31Var) {
                                while (true) {
                                    Unsafe unsafe2 = iu.a;
                                    long j3 = a71.n0;
                                    long longVolatile = unsafe2.getLongVolatile(a71Var3, j3);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = a71Var3.i0.b((int) (longVolatile & 2097151));
                                    a71 a71Var4 = a71Var3;
                                    if (unsafe2.compareAndSwapLong(a71Var4, j3, longVolatile, ((longVolatile + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        a71Var3 = a71Var4;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(z61.Z);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.g0);
                            this.g0 = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(z61.g0);
    }
}
