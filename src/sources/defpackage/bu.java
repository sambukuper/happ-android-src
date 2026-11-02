package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bu implements Collection, Set, rv3, aw3 {
    public int[] X;
    public Object[] Y;
    public int Z;

    public bu(int i) {
        this.X = w45.b;
        this.Y = w45.d;
        if (i > 0) {
            this.X = new int[i];
            this.Y = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.Z;
        Object[] objArr = this.Y;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.X;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                eu.e0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.Y;
                eu.g0(objArr2, objArr2, i, i4, i2);
            }
            this.Y[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.X = iArr2;
            this.Y = new Object[i5];
            if (i > 0) {
                eu.h0(0, i, 6, iArr, iArr2);
                eu.i0(objArr, this.Y, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                eu.e0(i, i6, i2, iArr, this.X);
                eu.g0(objArr, this.Y, i, i6, i2);
            }
        }
        if (i2 == this.Z) {
            this.Z = i3;
            return obj;
        }
        bt.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iC;
        int i2 = this.Z;
        if (obj == null) {
            iC = g33.C(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = g33.C(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i3 = ~iC;
        int[] iArr = this.X;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.Y;
            int[] iArr2 = new int[i4];
            this.X = iArr2;
            this.Y = new Object[i4];
            if (i2 != this.Z) {
                bt.c();
                return false;
            }
            if (iArr2.length != 0) {
                eu.h0(0, iArr.length, 6, iArr, iArr2);
                eu.i0(objArr, this.Y, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.X;
            int i5 = i3 + 1;
            eu.e0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.Y;
            eu.g0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.Z;
        if (i2 == i6) {
            int[] iArr4 = this.X;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.Y[i3] = obj;
                this.Z = i6 + 1;
                return true;
            }
        }
        bt.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.Z;
        int i = this.Z;
        int[] iArr = this.X;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.Y;
            int[] iArr2 = new int[size];
            this.X = iArr2;
            this.Y = new Object[size];
            if (i > 0) {
                eu.h0(0, i, 6, iArr, iArr2);
                eu.i0(objArr, this.Y, 0, this.Z, 6);
            }
        }
        if (this.Z != i) {
            bt.c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.Z;
        if (i != 0) {
            this.X = w45.b;
            this.Y = w45.d;
            i = 0;
            this.Z = 0;
        }
        if (i == 0) {
            return;
        }
        bt.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? g33.C(this, null, 0) : g33.C(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.Z != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.Z;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.Y[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.X;
        int i = this.Z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.Z <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qt(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? g33.C(this, null, 0) : g33.C(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.Z - 1; -1 < i; i--) {
            if (!wv0.m0(collection, this.Y[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.Z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.Z;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        eu.g0(this.Y, objArr, 0, 0, this.Z);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Z * 14);
        sb.append('{');
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.Y[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return eu.k0(this.Y, 0, this.Z);
    }
}
