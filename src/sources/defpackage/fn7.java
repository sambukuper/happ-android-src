package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fn7 implements List, sv3 {
    public final vd7 X;
    public final int Y;
    public int Z;
    public int f0;

    public fn7(vd7 vd7Var, int i, int i2) {
        this.X = vd7Var;
        this.Y = i;
        this.Z = hi5.d0(vd7Var);
        this.f0 = i2 - i;
    }

    public final void a() {
        if (hi5.d0(this.X) == this.Z) {
            return;
        }
        bt.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.Y + this.f0;
        vd7 vd7Var = this.X;
        vd7Var.add(i, obj);
        this.f0++;
        this.Z = hi5.d0(vd7Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.Y;
        vd7 vd7Var = this.X;
        boolean zAddAll = vd7Var.addAll(i2, collection);
        if (zAddAll) {
            this.f0 = collection.size() + this.f0;
            this.Z = hi5.d0(vd7Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f0 > 0) {
            a();
            int i = this.f0;
            int i2 = this.Y;
            vd7 vd7Var = this.X;
            vd7Var.B(i2, i + i2);
            this.f0 = 0;
            this.Z = hi5.d0(vd7Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        hi5.B0(i, this.f0);
        return this.X.get(this.Y + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.f0;
        int i2 = this.Y;
        Iterator it = x97.a0(i2, i + i2).iterator();
        do {
            jf3 jf3Var = (jf3) it;
            if (!jf3Var.Z) {
                return -1;
            }
            iNextInt = jf3Var.nextInt();
        } while (!dh3.f(obj, this.X.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f0 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.f0;
        int i2 = this.Y;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (dh3.f(obj, this.X.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ca6 ca6Var = new ca6();
        ca6Var.X = i - 1;
        return new qk6(ca6Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.Y + i;
        vd7 vd7Var = this.X;
        Object objRemove = vd7Var.remove(i2);
        this.f0--;
        this.Z = hi5.d0(vd7Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        a();
        vd7 vd7Var = this.X;
        int i2 = this.Y;
        int i3 = this.f0 + i2;
        int size = vd7Var.size();
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = vd7Var.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            rm5 rm5VarF = k2Var.f();
            rm5VarF.subList(i2, i3).retainAll(collection);
            k2 k2VarC = rm5VarF.c();
            if (dh3.f(k2VarC, k2Var)) {
                break;
            }
            wh7 wh7Var3 = vd7Var.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, vd7Var, dd7VarH), i, k2VarC, true);
            }
            kd7.l(dd7VarH, vd7Var);
        } while (!zN);
        int size2 = size - vd7Var.size();
        if (size2 > 0) {
            this.Z = hi5.d0(this.X);
            this.f0 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        hi5.B0(i, this.f0);
        a();
        int i2 = i + this.Y;
        vd7 vd7Var = this.X;
        Object obj2 = vd7Var.set(i2, obj);
        this.Z = hi5.d0(vd7Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f0;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f0) {
            wr5.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.Y;
        return new fn7(this.X, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wl7.Z(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wl7.a0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.Y + i;
        vd7 vd7Var = this.X;
        vd7Var.add(i2, obj);
        this.f0++;
        this.Z = hi5.d0(vd7Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f0, collection);
    }
}
