package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km5 extends z2 implements c83, x73 {
    public static final km5 f0;
    public final Object X;
    public final Object Y;
    public final ll5 Z;

    static {
        pz2 pz2Var = pz2.N0;
        ll5 ll5Var = ll5.Z;
        ll5Var.getClass();
        f0 = new km5(pz2Var, pz2Var, ll5Var);
    }

    public km5(Object obj, Object obj2, ll5 ll5Var) {
        this.X = obj;
        this.Y = obj2;
        this.Z = ll5Var;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z.Y;
    }

    public final km5 b(String str) {
        ll5 ll5Var = this.Z;
        if (ll5Var.containsKey(str)) {
            return this;
        }
        if (isEmpty()) {
            return new km5(str, str, ll5Var.f(str, new ab4()));
        }
        Object obj = this.Y;
        Object obj2 = ll5Var.get(obj);
        obj2.getClass();
        return new km5(this.X, str, ll5Var.f(obj, new ab4(((ab4) obj2).a, str)).f(str, new ab4(obj)));
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.Z.containsKey(obj);
    }

    @Override // defpackage.z2, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        ll5 ll5Var = this.Z;
        if8 if8Var = ll5Var.X;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (ll5Var.Y != set.size()) {
            return false;
        }
        if (set instanceof km5) {
            return if8Var.g(((km5) obj).Z.X, new nw2((byte) 24));
        }
        return set instanceof mm5 ? if8Var.g(((mm5) obj).f0.Z, new nw2((byte) 25)) : super.equals(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jm5(this.X, this.Z, (byte) 1);
    }
}
