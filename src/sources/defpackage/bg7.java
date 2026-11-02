package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bg7 extends AbstractQueue {
    public static final Integer i0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final AtomicReferenceArray X;
    public final int Y;
    public final AtomicLong Z;
    public long f0;
    public final AtomicLong g0;
    public final int h0;

    public bg7(int i) {
        int iO = u15.O(i);
        this.Y = iO - 1;
        this.X = new AtomicReferenceArray(iO);
        this.Z = new AtomicLong();
        this.g0 = new AtomicLong();
        this.h0 = Math.min(i / 4, i0.intValue());
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.Z.get() == this.g0.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        if (obj == null) {
            b61.i("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.Z;
        long j = atomicLong.get();
        int i = this.Y;
        int i2 = ((int) j) & i;
        long j2 = this.f0;
        AtomicReferenceArray atomicReferenceArray = this.X;
        if (j >= j2) {
            long j3 = ((long) this.h0) + j;
            if (atomicReferenceArray.get(i & ((int) j3)) == null) {
                this.f0 = j3;
            } else if (atomicReferenceArray.get(i2) != null) {
                return false;
            }
        }
        atomicReferenceArray.lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.X.get(((int) this.g0.get()) & this.Y);
    }

    @Override // java.util.Queue
    public final Object poll() {
        AtomicLong atomicLong = this.g0;
        long j = atomicLong.get();
        int i = ((int) j) & this.Y;
        AtomicReferenceArray atomicReferenceArray = this.X;
        Object obj = atomicReferenceArray.get(i);
        if (obj == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i, null);
        atomicLong.lazySet(j + 1);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.g0;
        long j = atomicLong.get();
        while (true) {
            long j2 = this.Z.get();
            long j3 = atomicLong.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
