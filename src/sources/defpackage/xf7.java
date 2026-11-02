package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xf7 extends zf7 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Unsafe unsafe = sn8.a;
        return unsafe.getLongVolatile(this, ag7.i0) == unsafe.getLongVolatile(this, zf7.j0);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        if (obj == null) {
            b61.i("null elements not allowed");
            return false;
        }
        long j = this.producerIndex;
        long jA = a(j);
        Unsafe unsafe = sn8.a;
        Object[] objArr = this.Y;
        if (unsafe.getObjectVolatile(objArr, jA) != null) {
            return false;
        }
        unsafe.putOrderedObject(objArr, jA, obj);
        unsafe.putOrderedLong(this, ag7.i0, j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        long jA = a(this.consumerIndex);
        return sn8.a.getObjectVolatile(this.Y, jA);
    }

    @Override // defpackage.f11, java.util.Queue
    public final Object poll() {
        long j = this.consumerIndex;
        long jA = a(j);
        Unsafe unsafe = sn8.a;
        Object[] objArr = this.Y;
        Object objectVolatile = unsafe.getObjectVolatile(objArr, jA);
        if (objectVolatile == null) {
            return null;
        }
        unsafe.putOrderedObject(objArr, jA, (Object) null);
        unsafe.putOrderedLong(this, zf7.j0, j + 1);
        return objectVolatile;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Unsafe unsafe = sn8.a;
        long j = zf7.j0;
        long longVolatile = unsafe.getLongVolatile(this, j);
        while (true) {
            Unsafe unsafe2 = sn8.a;
            long longVolatile2 = unsafe2.getLongVolatile(this, ag7.i0);
            long longVolatile3 = unsafe2.getLongVolatile(this, j);
            if (longVolatile == longVolatile3) {
                return (int) (longVolatile2 - longVolatile3);
            }
            longVolatile = longVolatile3;
        }
    }
}
