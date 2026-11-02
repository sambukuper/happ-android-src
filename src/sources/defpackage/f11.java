package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f11 extends AbstractQueue {
    public static final int Z;
    public static final long f0;
    public static final int g0;
    public final long X;
    public final Object[] Y;

    static {
        int i;
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        Z = iIntValue;
        Unsafe unsafe = sn8.a;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            i = iIntValue + 2;
            g0 = i;
        } else if (8 != iArrayIndexScale) {
            bt.i("Unknown pointer size");
            return;
        } else {
            i = iIntValue + 3;
            g0 = i;
        }
        f0 = unsafe.arrayBaseOffset(Object[].class) + (32 << (i - iIntValue));
    }

    public f11(int i) {
        int iO = u15.O(i);
        this.X = iO - 1;
        this.Y = new Object[(iO << Z) + 64];
    }

    public final long a(long j) {
        return f0 + ((j & this.X) << g0);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public abstract Object poll();
}
