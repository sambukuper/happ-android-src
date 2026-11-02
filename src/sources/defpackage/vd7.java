package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vd7 implements Parcelable, yh7, List, RandomAccess, sv3 {
    public static final Parcelable.Creator<vd7> CREATOR = new ud7((byte) 0);
    public wh7 X;

    public vd7(k2 k2Var) {
        dd7 dd7VarH = kd7.h();
        wh7 wh7Var = new wh7(dd7VarH.g(), k2Var);
        if (!(dd7VarH instanceof es2)) {
            wh7Var.b = new wh7(1L, k2Var);
        }
        this.X = wh7Var;
    }

    public final void B(int i, int i2) {
        int i3;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i3 = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            rm5 rm5VarF = k2Var.f();
            rm5VarF.subList(i, i2).clear();
            k2 k2VarC = rm5VarF.c();
            if (dh3.f(k2VarC, k2Var)) {
                return;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i3, k2VarC, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarC = k2Var.c(obj);
            if (k2VarC.equals(k2Var)) {
                return false;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i, k2VarC, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarE = k2Var.e(collection);
            if (dh3.f(k2VarE, k2Var)) {
                return false;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i, k2VarE, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return true;
    }

    @Override // defpackage.yh7
    public final bi7 c() {
        return this.X;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        dd7 dd7VarH;
        wh7 wh7Var = this.X;
        wh7Var.getClass();
        synchronized (kd7.c) {
            dd7VarH = kd7.h();
            wh7 wh7Var2 = (wh7) kd7.w(wh7Var, this, dd7VarH);
            synchronized (hi5.Z) {
                wh7Var2.c = fc7.Y;
                wh7Var2.d++;
                wh7Var2.e++;
            }
        }
        kd7.l(dd7VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return hi5.c0(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return hi5.c0(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return hi5.c0(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return hi5.c0(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return hi5.c0(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return hi5.c0(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new o03(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            int iIndexOf = k2Var.indexOf(obj);
            k2 k2VarI = iIndexOf != -1 ? k2Var.i(iIndexOf) : k2Var;
            if (k2VarI.equals(k2Var)) {
                return false;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i, k2VarI, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarH = k2Var.h(new i2(collection, (byte) 0));
            if (dh3.f(k2VarH, k2Var)) {
                return false;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i, k2VarH, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return hi5.p0(this, new i2(collection, (byte) 3));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        Object obj2 = get(i);
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i2 = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarJ = k2Var.j(i, obj);
            if (k2VarJ.equals(k2Var)) {
                break;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i2, k2VarJ, false);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return hi5.c0(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            wr5.a("fromIndex or toIndex are out of bounds");
        }
        return new fn7(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wl7.Z(this);
    }

    public final String toString() {
        wh7 wh7Var = this.X;
        wh7Var.getClass();
        return "SnapshotStateList(value=" + ((wh7) kd7.f(wh7Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k2 k2Var = hi5.c0(this).c;
        int iA = k2Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(k2Var.get(i2));
        }
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        bi7Var.b = this.X;
        this.X = (wh7) bi7Var;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wl7.a0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new o03(this, i);
    }

    public vd7() {
        this(fc7.Y);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i2 = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarB = k2Var.b(i, obj);
            if (k2VarB.equals(k2Var)) {
                return;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i2, k2VarB, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return hi5.p0(this, new wq0(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        k2 k2Var;
        dd7 dd7VarH;
        boolean zN;
        Object obj = get(i);
        do {
            synchronized (hi5.Z) {
                wh7 wh7Var = this.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i2 = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            k2 k2VarI = k2Var.i(i);
            if (k2VarI.equals(k2Var)) {
                break;
            }
            wh7 wh7Var3 = this.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = hi5.N((wh7) kd7.w(wh7Var3, this, dd7VarH), i2, k2VarI, true);
            }
            kd7.l(dd7VarH, this);
        } while (!zN);
        return obj;
    }
}
