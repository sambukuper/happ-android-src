package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class j17 {
    public static final /* synthetic */ AtomicLongFieldUpdater Z;
    public static final /* synthetic */ AtomicLongFieldUpdater f0;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g0;
    public static final /* synthetic */ long h0;
    public static final /* synthetic */ long i0;
    public static final /* synthetic */ long j0;
    public final int X;
    public final m30 Y;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = iu.a;
        i0 = unsafe.objectFieldOffset(j17.class.getDeclaredField("head$volatile"));
        Z = AtomicLongFieldUpdater.newUpdater(j17.class, "deqIdx$volatile");
        j0 = unsafe.objectFieldOffset(j17.class.getDeclaredField("tail$volatile"));
        f0 = AtomicLongFieldUpdater.newUpdater(j17.class, "enqIdx$volatile");
        g0 = AtomicIntegerFieldUpdater.newUpdater(j17.class, "_availablePermits$volatile");
        h0 = unsafe.objectFieldOffset(j17.class.getDeclaredField("_availablePermits$volatile"));
    }

    public j17(int i, int i2) {
        this.X = i;
        if (i <= 0) {
            em7.c(pc6.j(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            em7.c(pc6.j(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        m17 m17Var = new m17(0L, null, 2);
        this.head$volatile = m17Var;
        this.tail$volatile = m17Var;
        this._availablePermits$volatile = i - i2;
        this.Y = new m30((Object) this, (byte) 7);
    }

    public final Object a(s51 s51Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g0;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.X;
        } while (andDecrement > i);
        dn8 dn8Var = dn8.a;
        if (andDecrement <= 0) {
            mm0 mm0VarT = u70.T(mb6.H(s51Var));
            try {
                if (!b(mm0VarT)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                mm0VarT.y(dn8Var, this.Y);
                                break;
                            }
                            if (b(mm0VarT)) {
                                break;
                            }
                        }
                    }
                }
                Object objQ = mm0VarT.q();
                c71 c71Var = c71.X;
                if (objQ != c71Var) {
                    objQ = dn8Var;
                }
                if (objQ == c71Var) {
                    return objQ;
                }
            } catch (Throwable th) {
                mm0VarT.C();
                throw th;
            }
        }
        return dn8Var;
    }

    public final boolean b(vz8 vz8Var) {
        Object objA;
        Unsafe unsafe;
        j17 j17Var = this;
        Unsafe unsafe2 = iu.a;
        long j = j0;
        m17 m17Var = (m17) unsafe2.getObjectVolatile(j17Var, j);
        long andIncrement = f0.getAndIncrement(j17Var);
        h17 h17Var = h17.X;
        long j2 = andIncrement / ((long) l17.f);
        loop0: while (true) {
            objA = h11.a(m17Var, j2, h17Var);
            if (ys0.G(objA)) {
                break;
            }
            nz6 nz6VarC = ys0.C(objA);
            while (true) {
                nz6 nz6Var = (nz6) iu.a.getObjectVolatile(j17Var, j);
                if (nz6Var.f0 >= nz6VarC.f0) {
                    j17Var = this;
                    break loop0;
                }
                if (!nz6VarC.j()) {
                    break;
                }
                do {
                    unsafe = iu.a;
                    j17Var = this;
                    if (unsafe.compareAndSwapObject(j17Var, j0, nz6Var, nz6VarC)) {
                        if (!nz6Var.f()) {
                            break loop0;
                        }
                        nz6Var.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(j17Var, j) == nz6Var);
                if (nz6VarC.f()) {
                    nz6VarC.e();
                }
            }
            j17Var = this;
        }
        m17 m17Var2 = (m17) ys0.C(objA);
        AtomicReferenceArray atomicReferenceArray = m17Var2.i0;
        int i = (int) (andIncrement % ((long) l17.f));
        while (!atomicReferenceArray.compareAndSet(i, null, vz8Var)) {
            if (atomicReferenceArray.get(i) != null) {
                z31 z31Var = l17.b;
                z31 z31Var2 = l17.c;
                while (!atomicReferenceArray.compareAndSet(i, z31Var, z31Var2)) {
                    if (atomicReferenceArray.get(i) != z31Var) {
                        return false;
                    }
                }
                ((lm0) vz8Var).y(dn8.a, j17Var.Y);
                return true;
            }
        }
        vz8Var.a(m17Var2, i);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objA;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = g0.getAndIncrement(this);
            int i2 = this.X;
            if (andIncrement >= i2) {
                do {
                    unsafe = iu.a;
                    j = h0;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.X;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                kp5.g(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = iu.a;
            long j2 = i0;
            m17 m17Var = (m17) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = Z.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) l17.f);
            i17 i17Var = i17.X;
            while (true) {
                objA = h11.a(m17Var, j3, i17Var);
                if (!ys0.G(objA)) {
                    nz6 nz6VarC = ys0.C(objA);
                    while (true) {
                        nz6 nz6Var = (nz6) iu.a.getObjectVolatile(this, j2);
                        if (nz6Var.f0 >= nz6VarC.f0) {
                            break;
                        }
                        if (!nz6VarC.j()) {
                            break;
                        }
                        do {
                            unsafe2 = iu.a;
                            if (unsafe2.compareAndSwapObject(this, i0, nz6Var, nz6VarC)) {
                                if (!nz6Var.f()) {
                                    break;
                                }
                                nz6Var.e();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == nz6Var);
                        if (nz6VarC.f()) {
                            nz6VarC.e();
                        }
                    }
                } else {
                    break;
                }
            }
            m17 m17Var2 = (m17) ys0.C(objA);
            AtomicReferenceArray atomicReferenceArray = m17Var2.i0;
            m17Var2.a();
            z = false;
            if (m17Var2.f0 <= j3) {
                int i3 = (int) (andIncrement2 % ((long) l17.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, l17.b);
                if (andSet == null) {
                    int i4 = l17.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            z31 z31Var = l17.b;
                            z31 z31Var2 = l17.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, z31Var, z31Var2)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == z31Var);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == l17.c) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != l17.e) {
                    boolean z2 = andSet instanceof lm0;
                    dn8 dn8Var = dn8.a;
                    if (z2) {
                        lm0 lm0Var = (lm0) andSet;
                        z31 z31VarJ = lm0Var.j(dn8Var, this.Y);
                        if (z31VarJ != null) {
                            lm0Var.E(z31VarJ);
                            z = true;
                            break;
                            break;
                        }
                    } else if (!(andSet instanceof tz6)) {
                        b61.o(andSet, "unexpected: ");
                        return;
                    } else if (((tz6) andSet).i(this, dn8Var) == 0) {
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
