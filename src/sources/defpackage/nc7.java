package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nc7 implements Iterator {
    public boolean X;
    public final int Y;
    public final /* synthetic */ oc7 Z;

    public nc7(oc7 oc7Var) {
        this.Z = oc7Var;
        this.Y = ((AbstractList) oc7Var).modCount;
    }

    public final void a() {
        oc7 oc7Var = this.Z;
        int i = ((AbstractList) oc7Var).modCount;
        int i2 = this.Y;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) oc7Var).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.X;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.X) {
            bt.n();
            return null;
        }
        this.X = true;
        a();
        return this.Z.Y;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.Z.clear();
    }
}
