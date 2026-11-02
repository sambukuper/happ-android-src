package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kt extends f2 {
    public static final Object[] f0 = new Object[0];
    public int X;
    public Object[] Y = f0;
    public int Z;

    @Override // defpackage.f2
    public final int a() {
        return this.Z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.Z;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        e(this.Z + 1);
        int iN = n(this.X + i);
        int i3 = this.Z;
        if (i < ((i3 + 1) >> 1)) {
            int length = iN == 0 ? this.Y.length - 1 : iN - 1;
            int i4 = this.X;
            int length2 = i4 == 0 ? this.Y.length - 1 : i4 - 1;
            Object[] objArr = this.Y;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                eu.g0(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                eu.g0(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.Y;
                objArr2[objArr2.length - 1] = objArr2[0];
                eu.g0(objArr2, objArr2, 0, 1, length + 1);
            }
            this.Y[length] = obj;
            this.X = length2;
        } else {
            int iN2 = n(i3 + this.X);
            Object[] objArr3 = this.Y;
            if (iN < iN2) {
                eu.g0(objArr3, objArr3, iN + 1, iN, iN2);
            } else {
                eu.g0(objArr3, objArr3, 1, 0, iN2);
                Object[] objArr4 = this.Y;
                objArr4[0] = objArr4[objArr4.length - 1];
                eu.g0(objArr4, objArr4, iN + 1, iN, objArr4.length - 1);
            }
            this.Y[iN] = obj;
        }
        this.Z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.Z;
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.Z) {
            return addAll(collection);
        }
        o();
        e(collection.size() + this.Z);
        int iN = n(this.Z + this.X);
        int iN2 = n(this.X + i);
        int size = collection.size();
        if (i >= ((this.Z + 1) >> 1)) {
            int i3 = iN2 + size;
            Object[] objArr = this.Y;
            if (iN2 < iN) {
                int i4 = size + iN;
                if (i4 <= objArr.length) {
                    eu.g0(objArr, objArr, i3, iN2, iN);
                } else if (i3 >= objArr.length) {
                    eu.g0(objArr, objArr, i3 - objArr.length, iN2, iN);
                } else {
                    int length = iN - (i4 - objArr.length);
                    eu.g0(objArr, objArr, 0, length, iN);
                    Object[] objArr2 = this.Y;
                    eu.g0(objArr2, objArr2, i3, iN2, length);
                }
            } else {
                eu.g0(objArr, objArr, size, 0, iN);
                Object[] objArr3 = this.Y;
                if (i3 >= objArr3.length) {
                    eu.g0(objArr3, objArr3, i3 - objArr3.length, iN2, objArr3.length);
                } else {
                    eu.g0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.Y;
                    eu.g0(objArr4, objArr4, i3, iN2, objArr4.length - size);
                }
            }
            c(iN2, collection);
            return true;
        }
        int i5 = this.X;
        int length2 = i5 - size;
        Object[] objArr5 = this.Y;
        if (iN2 < i5) {
            eu.g0(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.Y;
            if (size >= iN2) {
                eu.g0(objArr6, objArr6, objArr6.length - size, 0, iN2);
            } else {
                eu.g0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.Y;
                eu.g0(objArr7, objArr7, 0, size, iN2);
            }
        } else if (length2 >= 0) {
            eu.g0(objArr5, objArr5, length2, i5, iN2);
        } else {
            length2 += objArr5.length;
            int i6 = iN2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                eu.g0(objArr5, objArr5, length2, i5, iN2);
            } else {
                eu.g0(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.Y;
                eu.g0(objArr8, objArr8, 0, this.X + length3, iN2);
            }
        }
        this.X = length2;
        c(i(iN2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        e(this.Z + 1);
        int length = this.X;
        if (length == 0) {
            length = this.Y.length;
        }
        int i = length - 1;
        this.X = i;
        this.Y[i] = obj;
        this.Z++;
    }

    public final void addLast(Object obj) {
        o();
        e(this.Z + 1);
        this.Y[n(this.Z + this.X)] = obj;
        this.Z++;
    }

    @Override // defpackage.f2
    public final Object b(int i) {
        int i2 = this.Z;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.X + i);
        Object[] objArr = this.Y;
        Object obj = objArr[iN];
        int i3 = this.Z >> 1;
        int i4 = this.X;
        if (i < i3) {
            if (iN >= i4) {
                eu.g0(objArr, objArr, i4 + 1, i4, iN);
            } else {
                eu.g0(objArr, objArr, 1, 0, iN);
                Object[] objArr2 = this.Y;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.X;
                eu.g0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.Y;
            int i6 = this.X;
            objArr3[i6] = null;
            this.X = f(i6);
        } else {
            int iN2 = n((a() - 1) + i4);
            Object[] objArr4 = this.Y;
            if (iN <= iN2) {
                eu.g0(objArr4, objArr4, iN, iN + 1, iN2 + 1);
            } else {
                eu.g0(objArr4, objArr4, iN, iN + 1, objArr4.length);
                Object[] objArr5 = this.Y;
                objArr5[objArr5.length - 1] = objArr5[0];
                eu.g0(objArr5, objArr5, 0, 1, iN2 + 1);
            }
            this.Y[iN2] = null;
        }
        this.Z--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.Y.length;
        while (i < length && it.hasNext()) {
            this.Y[i] = it.next();
            i++;
        }
        int i2 = this.X;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.Y[i3] = it.next();
        }
        this.Z = collection.size() + this.Z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            j(this.X, n(this.Z + this.X));
        }
        this.X = 0;
        this.Z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            bt.i("Deque is too big.");
            return;
        }
        Object[] objArr = this.Y;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f0) {
            if (i < 10) {
                i = 10;
            }
            this.Y = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        eu.g0(objArr, objArr2, 0, this.X, objArr.length);
        Object[] objArr3 = this.Y;
        int length2 = objArr3.length;
        int i3 = this.X;
        eu.g0(objArr3, objArr2, length2 - i3, 0, i3);
        this.X = 0;
        this.Y = objArr2;
    }

    public final int f(int i) {
        if (i == this.Y.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.Y[this.X];
        }
        em7.g("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.Z;
        if (i >= 0 && i < i2) {
            return this.Y[n(this.X + i)];
        }
        kp5.k(pc6.m("index: ", i, i2, ", size: "));
        return null;
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.Y[n((a() - 1) + this.X)];
    }

    public final int i(int i) {
        return i < 0 ? i + this.Y.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iN = n(this.Z + this.X);
        int length = this.X;
        if (length < iN) {
            while (length < iN) {
                if (dh3.f(obj, this.Y[length])) {
                    i = this.X;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.X) < iN) {
            return -1;
        }
        int length2 = this.Y.length;
        while (length < length2) {
            if (dh3.f(obj, this.Y[length])) {
                i = this.X;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iN; i2++) {
            if (dh3.f(obj, this.Y[i2])) {
                length = i2 + this.Y.length;
                i = this.X;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i, int i2) {
        Object[] objArr = this.Y;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.Y, 0, i2, (Object) null);
        }
    }

    public final Object last() {
        if (isEmpty()) {
            em7.g("ArrayDeque is empty.");
            return null;
        }
        return this.Y[n((a() - 1) + this.X)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iN = n(this.Z + this.X);
        int i2 = this.X;
        if (i2 < iN) {
            length = iN - 1;
            if (i2 <= length) {
                while (!dh3.f(obj, this.Y[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.X;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.X >= iN) {
            do {
                iN--;
                objArr = this.Y;
                if (-1 >= iN) {
                    length = objArr.length - 1;
                    int i3 = this.X;
                    if (i3 <= length) {
                        while (!dh3.f(obj, this.Y[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.X;
                    }
                }
                return length - i;
            } while (!dh3.f(obj, objArr[iN]));
            length = iN + this.Y.length;
            i = this.X;
            return length - i;
        }
        return -1;
    }

    public final int n(int i) {
        Object[] objArr = this.Y;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.Y.length != 0) {
            int iN2 = n(this.Z + this.X);
            int i = this.X;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.Y;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.Y[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iN, iN2, (Object) null);
            } else {
                int length = this.Y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.Y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.Y[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.Y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.Y[iN] = obj3;
                        iN = f(iN);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.Z = i(iN - this.X);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            em7.g("ArrayDeque is empty.");
            return null;
        }
        o();
        Object[] objArr = this.Y;
        int i = this.X;
        Object obj = objArr[i];
        objArr[i] = null;
        this.X = f(i);
        this.Z--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            em7.g("ArrayDeque is empty.");
            return null;
        }
        o();
        int iN = n((a() - 1) + this.X);
        Object[] objArr = this.Y;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.Z--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        wl7.t(i, i2, this.Z);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.Z) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        o();
        int i4 = this.Z - i2;
        int i5 = this.X;
        int i6 = this.X;
        if (i < i4) {
            int iN = n((i - 1) + i5);
            int iN2 = n((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iN + 1;
                int iMin = Math.min(i, Math.min(i7, iN2 + 1));
                Object[] objArr = this.Y;
                int i8 = iN2 - iMin;
                int i9 = iN - iMin;
                eu.g0(objArr, objArr, i8 + 1, i9 + 1, i7);
                iN = i(i9);
                iN2 = i(i8);
                i -= iMin;
            }
            int iN3 = n(this.X + i3);
            j(this.X, iN3);
            this.X = iN3;
        } else {
            int iN4 = n(i5 + i2);
            int iN5 = n(i6 + i);
            int i10 = this.Z;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.Y;
                i2 = Math.min(i10, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.Y;
                int i11 = iN4 + i2;
                eu.g0(objArr3, objArr3, iN5, iN4, i11);
                iN4 = n(i11);
                iN5 = n(iN5 + i2);
            }
            int iN6 = n(this.Z + this.X);
            j(i(iN6 - i3), iN6);
        }
        this.Z -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.Y.length != 0) {
            int iN2 = n(this.Z + this.X);
            int i = this.X;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.Y;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.Y[iN] = obj;
                        iN++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iN, iN2, (Object) null);
            } else {
                int length = this.Y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.Y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.Y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.Y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.Y[iN] = obj3;
                        iN = f(iN);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.Z = i(iN - this.X);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.Z;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        int iN = n(this.X + i);
        Object[] objArr = this.Y;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.Z;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iN = n(this.Z + this.X);
        int i2 = this.X;
        if (i2 < iN) {
            eu.i0(this.Y, objArr, i2, iN, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.Y;
            eu.g0(objArr2, objArr, 0, this.X, objArr2.length);
            Object[] objArr3 = this.Y;
            eu.g0(objArr3, objArr, objArr3.length - this.X, 0, iN);
        }
        int i3 = this.Z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        e(collection.size() + this.Z);
        c(n(this.Z + this.X), collection);
        return true;
    }
}
