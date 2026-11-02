package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f49 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = iu.a;
        f = unsafe.objectFieldOffset(f49.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(f49.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(f49.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(f49.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(f49.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(f49.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final x18 a(x18 x18Var) {
        if (b() == 127) {
            return x18Var;
        }
        if (x18Var.Y) {
            c.incrementAndGet(this);
        }
        int intVolatile = iu.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, x18Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return iu.a.getIntVolatile(this, g) - iu.a.getIntVolatile(this, e);
    }

    public final x18 c() {
        x18 x18Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            f49 f49Var = this;
            if (unsafe.compareAndSwapInt(f49Var, j, intVolatile, intVolatile + 1) && (x18Var = (x18) f49Var.a.getAndSet(i, null)) != null) {
                if (x18Var.Y) {
                    c.decrementAndGet(f49Var);
                }
                return x18Var;
            }
            this = f49Var;
        }
    }

    public final x18 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        x18 x18Var = (x18) atomicReferenceArray.get(i2);
        if (x18Var != null && x18Var.Y == z) {
            while (!atomicReferenceArray.compareAndSet(i2, x18Var, null)) {
                if (atomicReferenceArray.get(i2) != x18Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return x18Var;
        }
        return null;
    }
}
