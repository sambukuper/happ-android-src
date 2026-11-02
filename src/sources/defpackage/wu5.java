package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wu5 extends AbstractMap implements ConcurrentMap, Serializable {
    public static final int q0;
    public static final int r0;
    public final ConcurrentHashMap X;
    public final long[] Y;
    public final sa4 Z;
    public final AtomicLong f0;
    public final AtomicLong g0;
    public final ReentrantLock h0;
    public final ConcurrentLinkedQueue i0;
    public final AtomicLongArray j0;
    public final AtomicLongArray k0;
    public final AtomicReferenceArray l0;
    public final AtomicReference m0;
    public transient ru5 n0;
    public transient tu5 o0;
    public transient ru5 p0;

    static {
        int iMin = Math.min(4, 1 << (32 - Integer.numberOfLeadingZeros(Runtime.getRuntime().availableProcessors() - 1)));
        q0 = iMin;
        r0 = iMin - 1;
    }

    public wu5(lu5 lu5Var) {
        byte b = lu5Var.a;
        this.g0 = new AtomicLong(Math.min(lu5Var.c, 9223372034707292160L));
        this.X = new ConcurrentHashMap(lu5Var.b, 0.75f, b);
        this.h0 = new ReentrantLock();
        this.f0 = new AtomicLong();
        this.Z = new sa4();
        this.i0 = new ConcurrentLinkedQueue();
        this.m0 = new AtomicReference(pu5.X);
        int i = q0;
        this.Y = new long[i];
        this.j0 = new AtomicLongArray(i);
        this.k0 = new AtomicLongArray(i);
        this.l0 = new AtomicReferenceArray(i * 16);
    }

    public final void a(su5 su5Var) {
        int id = ((int) Thread.currentThread().getId()) & r0;
        AtomicLongArray atomicLongArray = this.j0;
        long j = atomicLongArray.get(id);
        atomicLongArray.lazySet(id, 1 + j);
        this.l0.lazySet((id * 16) + ((int) (15 & j)), su5Var);
        if (((pu5) this.m0.get()).a(j - this.k0.get(id) < 4)) {
            h();
        }
    }

    public final void b(Runnable runnable) {
        this.i0.add(runnable);
        this.m0.lazySet(pu5.Y);
        h();
    }

    public final void c() {
        int i;
        Runnable runnable;
        su5 su5Var;
        int id = (int) Thread.currentThread().getId();
        int i2 = q0 + id;
        while (true) {
            i = 0;
            if (id >= i2) {
                break;
            }
            int i3 = r0 & id;
            long j = this.j0.get(i3);
            while (i < 8) {
                long[] jArr = this.Y;
                int i4 = (i3 * 16) + ((int) (jArr[i3] & 15));
                AtomicReferenceArray atomicReferenceArray = this.l0;
                su5 su5Var2 = (su5) atomicReferenceArray.get(i4);
                if (su5Var2 == null) {
                    break;
                }
                atomicReferenceArray.lazySet(i4, null);
                sa4 sa4Var = this.Z;
                if (sa4Var.b(su5Var2) && su5Var2 != (su5Var = sa4Var.Y)) {
                    su5 su5Var3 = su5Var2.Y;
                    su5 su5Var4 = su5Var2.Z;
                    if (su5Var3 == null) {
                        sa4Var.X = su5Var4;
                    } else {
                        su5Var3.Z = su5Var4;
                        su5Var2.Y = null;
                    }
                    if (su5Var4 == null) {
                        sa4Var.Y = su5Var3;
                        su5Var = su5Var3;
                    } else {
                        su5Var4.Y = su5Var3;
                        su5Var2.Z = null;
                    }
                    sa4Var.Y = su5Var2;
                    if (su5Var == null) {
                        sa4Var.X = su5Var2;
                    } else {
                        su5Var.Z = su5Var2;
                        su5Var2.Y = su5Var;
                    }
                }
                jArr[i3] = jArr[i3] + 1;
                i++;
            }
            this.k0.lazySet(i3, j);
            id++;
        }
        while (i < 16 && (runnable = (Runnable) this.i0.poll()) != null) {
            runnable.run();
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AtomicReferenceArray atomicReferenceArray = this.l0;
        ReentrantLock reentrantLock = this.h0;
        reentrantLock.lock();
        while (true) {
            try {
                su5 su5VarD = this.Z.pollFirst();
                if (su5VarD == null) {
                    break;
                }
                this.X.remove(su5VarD.X, su5VarD);
                f(su5VarD);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        for (int i = 0; i < atomicReferenceArray.length(); i++) {
            atomicReferenceArray.lazySet(i, null);
        }
        while (true) {
            Runnable runnable = (Runnable) this.i0.poll();
            if (runnable == null) {
                reentrantLock.unlock();
                return;
            }
            runnable.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        Iterator it = this.X.values().iterator();
        while (it.hasNext()) {
            if (((su5) it.next()).a().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        su5 su5VarD;
        while (this.f0.get() > this.g0.get() && (su5VarD = this.Z.pollFirst()) != null) {
            this.X.remove(su5VarD.X, su5VarD);
            f(su5VarD);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ru5 ru5Var = this.p0;
        if (ru5Var != null) {
            return ru5Var;
        }
        ru5 ru5Var2 = new ru5(this, (byte) 0);
        this.p0 = ru5Var2;
        return ru5Var2;
    }

    public final void f(su5 su5Var) {
        uu5 uu5Var;
        do {
            uu5Var = (uu5) su5Var.get();
        } while (!su5Var.compareAndSet(uu5Var, new uu5(uu5Var.b, 0)));
        AtomicLong atomicLong = this.f0;
        atomicLong.lazySet(atomicLong.get() - ((long) Math.abs(uu5Var.a)));
    }

    public final Object g(Object obj, Object obj2, boolean z) {
        obj.getClass();
        obj2.getClass();
        uu5 uu5Var = new uu5(obj2, 1);
        su5 su5Var = new su5(obj, uu5Var);
        while (true) {
            su5 su5Var2 = (su5) this.X.putIfAbsent(su5Var.X, su5Var);
            if (su5Var2 == null) {
                b(new ku5(this, su5Var, (byte) 0));
                return null;
            }
            if (z) {
                a(su5Var2);
                return su5Var2.a();
            }
            while (true) {
                uu5 uu5Var2 = (uu5) su5Var2.get();
                if (!uu5Var2.a()) {
                    break;
                }
                if (su5Var2.compareAndSet(uu5Var2, uu5Var)) {
                    int i = 1 - uu5Var2.a;
                    if (i == 0) {
                        a(su5Var2);
                    } else {
                        b(new pq((byte) 4, i, this, su5Var2));
                    }
                    return uu5Var2.b;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        su5 su5Var = (su5) this.X.get(obj);
        if (su5Var == null) {
            return null;
        }
        a(su5Var);
        return su5Var.a();
    }

    public final void h() {
        mu5 mu5Var = pu5.X;
        ou5 ou5Var = pu5.Z;
        AtomicReference atomicReference = this.m0;
        ReentrantLock reentrantLock = this.h0;
        if (reentrantLock.tryLock()) {
            try {
                atomicReference.lazySet(ou5Var);
                c();
                while (!atomicReference.compareAndSet(ou5Var, mu5Var) && atomicReference.get() == ou5Var) {
                }
            } finally {
                while (!atomicReference.compareAndSet(ou5Var, mu5Var) && atomicReference.get() == ou5Var) {
                }
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ru5 ru5Var = this.n0;
        if (ru5Var != null) {
            return ru5Var;
        }
        ru5 ru5Var2 = new ru5(this, (byte) 1);
        this.n0 = ru5Var2;
        return ru5Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return g(obj, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return g(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.X;
        su5 su5Var = (su5) concurrentHashMap.get(obj);
        if (su5Var != null && obj2 != null) {
            uu5 uu5Var = (uu5) su5Var.get();
            do {
                Object obj3 = uu5Var.b;
                if (obj2 != obj3 && !obj3.equals(obj2)) {
                    return false;
                }
                if (uu5Var.a() ? su5Var.compareAndSet(uu5Var, new uu5(uu5Var.b, -uu5Var.a)) : false) {
                    if (!concurrentHashMap.remove(obj, su5Var)) {
                        break;
                    }
                    b(new ku5(this, su5Var, (byte) 1));
                    return true;
                }
                uu5Var = (uu5) su5Var.get();
            } while (uu5Var.a());
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        uu5 uu5Var;
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        uu5 uu5Var2 = new uu5(obj3, 1);
        su5 su5Var = (su5) this.X.get(obj);
        if (su5Var != null) {
            do {
                uu5Var = (uu5) su5Var.get();
                if (uu5Var.a()) {
                    Object obj4 = uu5Var.b;
                    if (obj2 != obj4 && !obj4.equals(obj2)) {
                        return false;
                    }
                }
            } while (!su5Var.compareAndSet(uu5Var, uu5Var2));
            int i = 1 - uu5Var.a;
            if (i == 0) {
                a(su5Var);
                return true;
            }
            b(new pq((byte) 4, i, this, su5Var));
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.X.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        tu5 tu5Var = this.o0;
        if (tu5Var != null) {
            return tu5Var;
        }
        tu5 tu5Var2 = new tu5(this);
        this.o0 = tu5Var2;
        return tu5Var2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        uu5 uu5Var;
        obj.getClass();
        obj2.getClass();
        uu5 uu5Var2 = new uu5(obj2, 1);
        su5 su5Var = (su5) this.X.get(obj);
        if (su5Var == null) {
            return null;
        }
        do {
            uu5Var = (uu5) su5Var.get();
            if (!uu5Var.a()) {
                return null;
            }
        } while (!su5Var.compareAndSet(uu5Var, uu5Var2));
        int i = 1 - uu5Var.a;
        if (i == 0) {
            a(su5Var);
        } else {
            b(new pq((byte) 4, i, this, su5Var));
        }
        return uu5Var.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        uu5 uu5Var;
        su5 su5Var = (su5) this.X.remove(obj);
        if (su5Var == null) {
            return null;
        }
        do {
            uu5Var = (uu5) su5Var.get();
            if (!uu5Var.a()) {
                break;
            }
        } while (!su5Var.compareAndSet(uu5Var, new uu5(uu5Var.b, -uu5Var.a)));
        b(new ku5(this, su5Var, (byte) 1));
        return su5Var.a();
    }
}
