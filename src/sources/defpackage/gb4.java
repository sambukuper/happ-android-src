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
public final class gb4 extends f2 implements RandomAccess, Serializable {
    public static final gb4 f0;
    public Object[] X;
    public int Y;
    public boolean Z;

    static {
        gb4 gb4Var = new gb4(0);
        gb4Var.Z = true;
        f0 = gb4Var;
    }

    public gb4(int i) {
        if (i >= 0) {
            this.X = new Object[i];
        } else {
            bt.q("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.f2
    public final int a() {
        return this.Y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        int i2 = this.Y;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.X[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        int i2 = this.Y;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.f2
    public final Object b(int i) {
        h();
        int i2 = this.Y;
        if (i >= 0 && i < i2) {
            return j(i);
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        n(0, this.Y);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.X[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.X;
            int i = this.Y;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (dh3.f(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.X[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.Y;
        if (i >= 0 && i < i2) {
            return this.X[i];
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h() {
        if (this.Z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.X;
        int i = this.Y;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        int i3 = this.Y + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.X;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.X = objArrCopyOf;
        }
        eu.g0(objArrCopyOf, objArrCopyOf, i + i2, i, this.Y);
        this.Y += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.Y; i++) {
            if (dh3.f(this.X[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.Y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.X;
        Object obj = objArr[i];
        eu.g0(objArr, objArr, i, i + 1, this.Y);
        Object[] objArr2 = this.X;
        int i2 = this.Y - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.Y--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.Y - 1; i >= 0; i--) {
            if (dh3.f(this.X[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.Y;
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
        Object[] objArr = this.X;
        eu.g0(objArr, objArr, i, i + i2, this.Y);
        Object[] objArr2 = this.X;
        int i3 = this.Y;
        z91.O(objArr2, i3 - i2, i3);
        this.Y -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.X;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.X;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        eu.g0(objArr, objArr, i + i4, i2 + i, this.Y);
        Object[] objArr3 = this.X;
        int i7 = this.Y;
        z91.O(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.Y -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        h();
        return o(0, this.Y, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return o(0, this.Y, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        int i2 = this.Y;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.X;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        wl7.t(i, i2, this.Y);
        return new fb4(this.X, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.Y;
        Object[] objArr2 = this.X;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        eu.g0(objArr2, objArr, 0, 0, i);
        int i2 = this.Y;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return z91.Q(this.X, 0, this.Y, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.Y;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.X[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return eu.k0(this.X, 0, this.Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        e(this.Y, collection, size);
        return size > 0;
    }
}
