package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt implements Iterator, Iterable {
    public final Object[] X;
    public int Y = 0;

    public lt(Object[] objArr) {
        this.X = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y < this.X.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.Y;
        Object[] objArr = this.X;
        if (i < objArr.length) {
            this.Y = i + 1;
            return objArr[i];
        }
        bt.n();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }
}
