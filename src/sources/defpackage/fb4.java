package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fb4 extends f2 implements RandomAccess, Serializable {
    public Object[] X;
    public final int Y;
    public int Z;
    public final fb4 f0;
    public final gb4 g0;

    public fb4(Object[] objArr, int i, int i2, fb4 fb4Var, gb4 gb4Var) {
        objArr.getClass();
        this.X = objArr;
        this.Y = i;
        this.Z = i2;
        this.f0 = fb4Var;
        this.g0 = gb4Var;
        ((AbstractList) this).modCount = ((AbstractList) gb4Var).modCount;
    }

    @Override // defpackage.f2
    public final int a() {
        h();
        return this.Z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        int i2 = this.Z;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
        } else {
            f(this.Y + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        int i2 = this.Z;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.Y + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.f2
    public final Object b(int i) {
        i();
        h();
        int i2 = this.Z;
        if (i >= 0 && i < i2) {
            return j(this.Y + i);
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        n(this.Y, this.Z);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        gb4 gb4Var = this.g0;
        fb4 fb4Var = this.f0;
        if (fb4Var != null) {
            fb4Var.e(i, collection, i2);
        } else {
            gb4 gb4Var2 = gb4.f0;
            gb4Var.e(i, collection, i2);
        }
        this.X = gb4Var.X;
        this.Z += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.X;
            int i = this.Z;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (dh3.f(objArr[this.Y + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        gb4 gb4Var = this.g0;
        fb4 fb4Var = this.f0;
        if (fb4Var != null) {
            fb4Var.f(i, obj);
        } else {
            gb4 gb4Var2 = gb4.f0;
            gb4Var.f(i, obj);
        }
        this.X = gb4Var.X;
        this.Z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        int i2 = this.Z;
        if (i >= 0 && i < i2) {
            return this.X[this.Y + i];
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h() {
        if (((AbstractList) this.g0).modCount == ((AbstractList) this).modCount) {
            return;
        }
        bt.c();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.X;
        int i = this.Z;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.Y + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.g0.Z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.Z; i++) {
            if (dh3.f(this.X[this.Y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.Z == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object objJ;
        ((AbstractList) this).modCount++;
        fb4 fb4Var = this.f0;
        if (fb4Var != null) {
            objJ = fb4Var.j(i);
        } else {
            gb4 gb4Var = gb4.f0;
            objJ = this.g0.j(i);
        }
        this.Z--;
        return objJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.Z - 1; i >= 0; i--) {
            if (dh3.f(this.X[this.Y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        int i2 = this.Z;
        if (i >= 0 && i <= i2) {
            return new o03(this, i);
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        fb4 fb4Var = this.f0;
        if (fb4Var != null) {
            fb4Var.n(i, i2);
        } else {
            gb4 gb4Var = gb4.f0;
            this.g0.n(i, i2);
        }
        this.Z -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int iO;
        fb4 fb4Var = this.f0;
        if (fb4Var != null) {
            iO = fb4Var.o(i, i2, collection, z);
        } else {
            gb4 gb4Var = gb4.f0;
            iO = this.g0.o(i, i2, collection, z);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.Z -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return o(this.Y, this.Z, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return o(this.Y, this.Z, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        int i2 = this.Z;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.X;
        int i3 = this.Y;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        wl7.t(i, i2, this.Z);
        return new fb4(this.X, this.Y + i, i2 - i, this, this.g0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.Z;
        Object[] objArr2 = this.X;
        int i2 = this.Y;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        eu.g0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.Z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return z91.Q(this.X, this.Y, this.Z, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        f(this.Y + this.Z, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.X;
        int i = this.Z;
        int i2 = this.Y;
        return eu.k0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        e(this.Y + this.Z, collection, size);
        return size > 0;
    }
}
