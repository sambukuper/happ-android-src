package io.sentry;

import defpackage.b61;
import defpackage.bt;
import defpackage.em7;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractCollection implements Queue, Serializable {
    public final transient Object[] X;
    public transient int Y = 0;
    public transient int Z = 0;
    public transient boolean f0 = false;
    public final int g0;

    public j(int i) {
        if (i <= 0) {
            bt.q("The size must be greater than 0");
            throw null;
        }
        Object[] objArr = new Object[i];
        this.X = objArr;
        this.g0 = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        int i = 0;
        if (obj == null) {
            b61.i("Attempted to add null object to queue");
            return false;
        }
        int size = size();
        int i2 = this.g0;
        if (size == i2) {
            remove();
        }
        int i3 = this.Z;
        int i4 = i3 + 1;
        this.Z = i4;
        this.X[i3] = obj;
        if (i4 >= i2) {
            this.Z = 0;
        } else {
            i = i4;
        }
        if (i == this.Y) {
            this.f0 = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f0 = false;
        this.Y = 0;
        this.Z = 0;
        Arrays.fill(this.X, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        em7.g("queue is empty");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.X[this.Y];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            em7.g("queue is empty");
            return null;
        }
        int i = this.Y;
        Object[] objArr = this.X;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.Y = i2;
            objArr[i] = null;
            if (i2 >= this.g0) {
                this.Y = 0;
            }
            this.f0 = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.Z;
        int i2 = this.Y;
        int i3 = this.g0;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.f0) {
            return i3;
        }
        return 0;
    }
}
