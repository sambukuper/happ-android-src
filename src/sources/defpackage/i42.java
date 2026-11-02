package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i42 extends d42 implements kh1 {
    public static final /* synthetic */ long i0;
    public static final /* synthetic */ long j0;
    public static final /* synthetic */ long k0;
    public static final /* synthetic */ int l0 = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = iu.a;
        k0 = unsafe.objectFieldOffset(i42.class.getDeclaredField("_queue$volatile"));
        i0 = unsafe.objectFieldOffset(i42.class.getDeclaredField("_delayed$volatile"));
        j0 = unsafe.objectFieldOffset(i42.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        i1(runnable);
    }

    @Override // defpackage.d42
    public final long g1() {
        Unsafe unsafe;
        i42 i42Var;
        Unsafe unsafe2;
        Runnable runnable;
        g42 g42Var;
        z31 z31Var = j42.b;
        long j = k0;
        if (!h1()) {
            j1();
            loop0: while (true) {
                unsafe = iu.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    i42Var = this;
                } else if (objectVolatile instanceof ze4) {
                    ze4 ze4Var = (ze4) objectVolatile;
                    Object objD = ze4Var.d();
                    if (objD != ze4.e) {
                        Runnable runnable2 = (Runnable) objD;
                        i42Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    ze4 ze4VarC = ze4Var.c();
                    while (true) {
                        Unsafe unsafe3 = iu.a;
                        i42Var = this;
                        if (unsafe3.compareAndSwapObject(i42Var, k0, objectVolatile, ze4VarC) || unsafe3.getObjectVolatile(i42Var, j) != objectVolatile) {
                            break;
                        }
                        this = i42Var;
                    }
                    this = i42Var;
                } else {
                    i42Var = this;
                    if (objectVolatile != z31Var) {
                        do {
                            unsafe2 = iu.a;
                            if (unsafe2.compareAndSwapObject(i42Var, k0, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(i42Var, j) == objectVolatile);
                        this = i42Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            kt ktVar = i42Var.g0;
            if (((ktVar == null || ktVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(i42Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof ze4) {
                        long longVolatile = unsafe2.getLongVolatile((ze4) objectVolatile2, ze4.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == z31Var) {
                        return Long.MAX_VALUE;
                    }
                }
                h42 h42Var = (h42) unsafe.getObjectVolatile(i42Var, i0);
                if (h42Var != null) {
                    synchronized (h42Var) {
                        g42[] g42VarArr = h42Var.a;
                        g42Var = g42VarArr != null ? g42VarArr[0] : null;
                    }
                    if (g42Var != null) {
                        long jNanoTime = g42Var.X - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void i1(Runnable runnable) {
        j1();
        if (!k1(runnable)) {
            me1.m0.i1(runnable);
            return;
        }
        Thread threadL1 = l1();
        if (Thread.currentThread() != threadL1) {
            LockSupport.unpark(threadL1);
        }
    }

    public final void j1() {
        g42 g42VarC;
        h42 h42Var = (h42) iu.a.getObjectVolatile(this, i0);
        if (h42Var == null || h42Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (h42Var) {
                try {
                    g42[] g42VarArr = h42Var.a;
                    g42VarC = null;
                    g42 g42Var = g42VarArr != null ? g42VarArr[0] : null;
                    if (g42Var != null) {
                        if (jNanoTime - g42Var.X >= 0 ? k1(g42Var) : false) {
                            g42VarC = h42Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (g42VarC != null);
    }

    public final boolean k1(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = iu.a;
            long j = k0;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, j0) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = iu.a;
                    if (unsafe.compareAndSwapObject(this, k0, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof ze4) {
                ze4 ze4Var = (ze4) objectVolatile;
                int iA = ze4Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    ze4 ze4VarC = ze4Var.c();
                    do {
                        unsafe2 = iu.a;
                        if (unsafe2.compareAndSwapObject(this, k0, objectVolatile, ze4VarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == j42.b) {
                    return false;
                }
                ze4 ze4Var2 = new ze4(8, true);
                ze4Var2.a((Runnable) objectVolatile);
                ze4Var2.a(runnable);
                do {
                    unsafe3 = iu.a;
                    if (unsafe3.compareAndSwapObject(this, k0, objectVolatile, ze4Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public abstract Thread l1();

    public final boolean m1() {
        kt ktVar = this.g0;
        if (ktVar != null ? ktVar.isEmpty() : true) {
            Unsafe unsafe = iu.a;
            h42 h42Var = (h42) unsafe.getObjectVolatile(this, i0);
            if (h42Var != null && h42Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, k0);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ze4) {
                    long longVolatile = unsafe.getLongVolatile((ze4) objectVolatile, ze4.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == j42.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void n1(long j, g42 g42Var) {
        me1.m0.o1(j, g42Var);
    }

    public final void o1(long j, g42 g42Var) {
        i42 i42Var;
        int iC;
        Unsafe unsafe;
        Thread threadL1;
        long j2 = i0;
        Unsafe unsafe2 = iu.a;
        if (unsafe2.getIntVolatile(this, j0) == 1) {
            i42Var = this;
            iC = 1;
        } else {
            h42 h42Var = (h42) unsafe2.getObjectVolatile(this, j2);
            if (h42Var == null) {
                h42 h42Var2 = new h42();
                h42Var2.c = j;
                while (true) {
                    unsafe = iu.a;
                    i42Var = this;
                    if (unsafe.compareAndSwapObject(i42Var, i0, (Object) null, h42Var2) || unsafe.getObjectVolatile(i42Var, j2) != null) {
                        break;
                    } else {
                        this = i42Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(i42Var, j2);
                objectVolatile.getClass();
                h42Var = (h42) objectVolatile;
                unsafe2 = unsafe;
            } else {
                i42Var = this;
            }
            iC = g42Var.c(j, h42Var, i42Var);
        }
        if (iC != 0) {
            if (iC == 1) {
                i42Var.n1(j, g42Var);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                bt.i("unexpected result");
                return;
            }
        }
        h42 h42Var3 = (h42) unsafe2.getObjectVolatile(i42Var, j2);
        g42 g42Var2 = null;
        if (h42Var3 != null) {
            synchronized (h42Var3) {
                g42[] g42VarArr = h42Var3.a;
                g42Var2 = g42VarArr != null ? g42VarArr[0] : null;
            }
        }
        if (g42Var2 != g42Var || Thread.currentThread() == (threadL1 = i42Var.l1())) {
            return;
        }
        LockSupport.unpark(threadL1);
    }

    @Override // defpackage.d42
    public void shutdown() {
        z31 z31Var;
        Unsafe unsafe;
        g42 g42VarC;
        j98.a.set(null);
        iu.a.putIntVolatile(this, j0, 1);
        z31 z31Var2 = j42.b;
        long j = k0;
        loop0: while (true) {
            Object objectVolatile = iu.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    z31Var = z31Var2;
                    if (unsafe2.compareAndSwapObject(this, k0, (Object) null, z31Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        z31Var2 = z31Var;
                    }
                }
                z31Var2 = z31Var;
            } else {
                z31Var = z31Var2;
                if (objectVolatile instanceof ze4) {
                    ((ze4) objectVolatile).b();
                    break;
                }
                if (objectVolatile == z31Var) {
                    break;
                }
                ze4 ze4Var = new ze4(8, true);
                ze4Var.a((Runnable) objectVolatile);
                do {
                    unsafe = iu.a;
                    if (unsafe.compareAndSwapObject(this, k0, objectVolatile, ze4Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                z31Var2 = z31Var;
            }
        }
        while (g1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            h42 h42Var = (h42) iu.a.getObjectVolatile(this, i0);
            if (h42Var == null) {
                return;
            }
            synchronized (h42Var) {
                g42VarC = h42Var.b() > 0 ? h42Var.c(0) : null;
            }
            if (g42VarC == null) {
                return;
            } else {
                n1(jNanoTime, g42VarC);
            }
        }
    }

    @Override // defpackage.kh1
    public final void u0(long j, mm0 mm0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            e42 e42Var = new e42(this, j2 + jNanoTime, mm0Var);
            o1(jNanoTime, e42Var);
            mm0Var.v(new dm0(e42Var, (byte) 2));
        }
    }
}
