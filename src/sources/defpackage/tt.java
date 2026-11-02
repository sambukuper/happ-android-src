package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt implements Collection {
    public final /* synthetic */ vt X;

    public tt(vt vtVar) {
        this.X = vtVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.X.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qt(this.X, (byte) 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        vt vtVar = this.X;
        int iA = vtVar.a(obj);
        if (iA < 0) {
            return false;
        }
        vtVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        vt vtVar = this.X;
        int i = vtVar.Z;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(vtVar.j(i2))) {
                vtVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        vt vtVar = this.X;
        int i = vtVar.Z;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(vtVar.j(i2))) {
                vtVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.X.Z;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        vt vtVar = this.X;
        int i = vtVar.Z;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = vtVar.j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        vt vtVar = this.X;
        int i = vtVar.Z;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = vtVar.j(i2);
        }
        return objArr;
    }
}
