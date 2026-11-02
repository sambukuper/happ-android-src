package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mm5 extends h2 implements Collection, rv3 {
    public km5 X;
    public Object Y;
    public Object Z;
    public final ol5 f0;

    public mm5(km5 km5Var) {
        km5Var.getClass();
        this.X = km5Var;
        this.Y = km5Var.X;
        this.Z = km5Var.Y;
        this.f0 = new ol5(km5Var.Z);
    }

    @Override // defpackage.h2
    public final int a() {
        return this.f0.i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ol5 ol5Var = this.f0;
        if (ol5Var.containsKey(obj)) {
            return false;
        }
        this.X = null;
        if (isEmpty()) {
            this.Y = obj;
            this.Z = obj;
            ol5Var.put(obj, new ab4());
            return true;
        }
        Object obj2 = ol5Var.get(this.Z);
        obj2.getClass();
        ol5Var.put(this.Z, new ab4(((ab4) obj2).a, obj));
        ol5Var.put(obj, new ab4(this.Z));
        this.Z = obj;
        return true;
    }

    public final km5 b() {
        km5 km5Var = this.X;
        if (km5Var != null) {
            return km5Var;
        }
        km5 km5Var2 = new km5(this.Y, this.Z, this.f0.f());
        this.X = km5Var2;
        return km5Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ol5 ol5Var = this.f0;
        if (!ol5Var.isEmpty()) {
            this.X = null;
        }
        ol5Var.clear();
        pz2 pz2Var = pz2.N0;
        this.Y = pz2Var;
        this.Z = pz2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f0.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        ol5 ol5Var = this.f0;
        Set set = (Set) obj;
        if (ol5Var.i0 != set.size()) {
            return false;
        }
        if (set instanceof km5) {
            return ol5Var.Z.g(((km5) obj).Z.X, new nw2((byte) 26));
        }
        return set instanceof mm5 ? ol5Var.Z.g(((mm5) obj).f0.Z, new nw2((byte) 27)) : super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new nm5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ol5 ol5Var = this.f0;
        ab4 ab4Var = (ab4) ol5Var.remove(obj);
        if (ab4Var == null) {
            return false;
        }
        Object obj2 = ab4Var.b;
        Object obj3 = ab4Var.a;
        this.X = null;
        pz2 pz2Var = pz2.N0;
        if (obj3 != pz2Var) {
            Object obj4 = ol5Var.get(obj3);
            obj4.getClass();
            ol5Var.put(obj3, new ab4(((ab4) obj4).a, obj2));
        } else {
            this.Y = obj2;
        }
        if (obj2 == pz2Var) {
            this.Z = obj3;
            return true;
        }
        Object obj5 = ol5Var.get(obj2);
        obj5.getClass();
        ol5Var.put(obj2, new ab4(obj3, ((ab4) obj5).b));
        return true;
    }
}
