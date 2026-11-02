package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dg7 implements Queue {
    public static final int k0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object l0 = new Object();
    public final AtomicLong X;
    public final int Y;
    public long Z;
    public final int f0;
    public AtomicReferenceArray g0;
    public final int h0;
    public AtomicReferenceArray i0;
    public final AtomicLong j0;

    public dg7(int i) {
        int iO = u15.O(Math.max(8, i));
        int i2 = iO - 1;
        AtomicLong atomicLong = new AtomicLong();
        this.X = atomicLong;
        this.j0 = new AtomicLong();
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iO + 1);
        this.g0 = atomicReferenceArray;
        this.f0 = i2;
        this.Y = Math.min(iO / 4, k0);
        this.i0 = atomicReferenceArray;
        this.h0 = i2;
        this.Z = iO - 2;
        atomicLong.lazySet(0L);
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.X.get() == this.j0.get();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        AtomicReferenceArray atomicReferenceArray = this.g0;
        AtomicLong atomicLong = this.X;
        long j = atomicLong.get();
        int i = this.f0;
        int i2 = ((int) j) & i;
        if (j < this.Z) {
            atomicLong.lazySet(j + 1);
            atomicReferenceArray.lazySet(i2, obj);
            return true;
        }
        long j2 = ((long) this.Y) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.Z = j2 - 1;
            atomicLong.lazySet(j + 1);
            atomicReferenceArray.lazySet(i2, obj);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) != null) {
            atomicLong.lazySet(j3);
            atomicReferenceArray.lazySet(i2, obj);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.g0 = atomicReferenceArray2;
        this.Z = (j + ((long) i)) - 1;
        atomicLong.lazySet(j3);
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, l0);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        AtomicReferenceArray atomicReferenceArray = this.i0;
        int i = ((int) this.j0.get()) & this.h0;
        Object obj = atomicReferenceArray.get(i);
        if (obj != l0) {
            return obj;
        }
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.i0 = atomicReferenceArray2;
        return atomicReferenceArray2.get(i);
    }

    @Override // java.util.Queue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.i0;
        AtomicLong atomicLong = this.j0;
        long j = atomicLong.get();
        int i = this.h0 & ((int) j);
        Object obj = atomicReferenceArray.get(i);
        boolean z = obj == l0;
        if (obj != null && !z) {
            atomicLong.lazySet(j + 1);
            atomicReferenceArray.lazySet(i, null);
            return obj;
        }
        if (z) {
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
            this.i0 = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i);
            if (obj2 != null) {
                atomicLong.lazySet(j + 1);
                atomicReferenceArray2.lazySet(i, null);
                return obj2;
            }
        }
        return null;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.j0;
        long j = atomicLong.get();
        while (true) {
            long j2 = this.X.get();
            long j3 = atomicLong.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
