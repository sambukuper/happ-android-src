package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h05 implements List, sv3 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ h05(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                j05 j05Var = (j05) obj2;
                if (i < 0 || i > (i2 = j05Var.b)) {
                    j05Var.q(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = j05Var.a;
                if (objArr.length < i3) {
                    j05Var.n(i3, objArr);
                }
                Object[] objArr2 = j05Var.a;
                int i4 = j05Var.b;
                if (i != i4) {
                    eu.g0(objArr2, objArr2, i + 1, i, i4);
                }
                objArr2[i] = obj;
                j05Var.b++;
                return;
            default:
                ((c15) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                j05 j05Var = (j05) obj;
                if (i < 0 || i > j05Var.b) {
                    j05Var.q(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + j05Var.b;
                Object[] objArr = j05Var.a;
                if (objArr.length < size) {
                    j05Var.n(size, objArr);
                }
                Object[] objArr2 = j05Var.a;
                if (i != j05Var.b) {
                    eu.g0(objArr2, objArr2, collection.size() + i, i, j05Var.b);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        i21.X();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                j05Var.b = collection.size() + j05Var.b;
                return true;
            default:
                return ((c15) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((j05) obj).d();
                break;
            default:
                ((c15) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return ((j05) obj2).e(obj);
            default:
                return ((c15) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                j05 j05Var = (j05) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!j05Var.e(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                c15 c15Var = (c15) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c15Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                return ((j05) obj).g(i);
            default:
                d15.a(i, this);
                return ((c15) obj).X[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return ((j05) obj2).h(obj);
            default:
                return ((c15) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((j05) obj).i();
            default:
                return ((c15) obj).Z == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.X) {
            case 0:
                return new g05(this, 0, (byte) 0);
            default:
                return new g05(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                j05 j05Var = (j05) obj2;
                Object[] objArr = j05Var.a;
                int i2 = j05Var.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                c15 c15Var = (c15) obj2;
                Object[] objArr2 = c15Var.X;
                for (int i3 = c15Var.Z - 1; i3 >= 0; i3--) {
                    if (dh3.f(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.X) {
            case 0:
                return new g05(this, 0, (byte) 0);
            default:
                return new g05(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                return ((j05) obj).l(i);
            default:
                d15.a(i, this);
                return ((c15) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                j05 j05Var = (j05) obj;
                int i = j05Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    j05Var.k(it.next());
                }
                return i != j05Var.b;
            default:
                c15 c15Var = (c15) obj;
                if (!collection.isEmpty()) {
                    int i2 = c15Var.Z;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c15Var.j(it2.next());
                    }
                    if (i2 != c15Var.Z) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                j05 j05Var = (j05) obj;
                int i = j05Var.b;
                Object[] objArr = j05Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        j05Var.l(i2);
                    }
                }
                return i != j05Var.b;
            default:
                c15 c15Var = (c15) obj;
                int i3 = c15Var.Z;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(c15Var.X[i4])) {
                        c15Var.k(i4);
                    }
                }
                return i3 != c15Var.Z;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                return ((j05) obj2).o(i, obj);
            default:
                d15.a(i, this);
                Object[] objArr = ((c15) obj2).X;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((j05) obj).b;
            default:
                return ((c15) obj).Z;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.X) {
            case 0:
                h85.b(i, i2, this);
                return new i05(this, i, i2, (byte) 0);
            default:
                d15.b(i, i2, this);
                return new i05(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.X) {
            case 0:
                objArr.getClass();
                break;
        }
        return wl7.a0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.X) {
            case 0:
                break;
        }
        return wl7.Z(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.X) {
            case 0:
                return new g05(this, i, (byte) 0);
            default:
                return new g05(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return ((j05) obj2).k(obj);
            default:
                return ((c15) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ((j05) obj2).a(obj);
                break;
            default:
                ((c15) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                j05 j05Var = (j05) obj;
                int i = j05Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    j05Var.a(it.next());
                }
                return i != j05Var.b;
            default:
                c15 c15Var = (c15) obj;
                return c15Var.e(c15Var.Z, collection);
        }
    }
}
