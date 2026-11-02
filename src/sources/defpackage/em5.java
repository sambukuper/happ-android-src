package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class em5 extends g2 {
    public dm5 X;
    public Object Y;
    public Object Z;
    public final ol5 f0;

    public em5(dm5 dm5Var) {
        this.X = dm5Var;
        this.Y = dm5Var.X;
        this.Z = dm5Var.Y;
        this.f0 = new ol5(dm5Var.Z);
    }

    @Override // defpackage.g2
    public final Set a() {
        return new rl5(this, (byte) 1);
    }

    @Override // defpackage.g2
    public final Set b() {
        return new ul5(this, (byte) 1);
    }

    @Override // defpackage.g2
    public final int c() {
        return this.f0.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f0.containsKey(obj);
    }

    @Override // defpackage.g2
    public final Collection e() {
        return new kp4(this, (byte) 3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        ol5 ol5Var = this.f0;
        Map map = (Map) obj;
        if (ol5Var.c() != map.size()) {
            return false;
        }
        if (map instanceof dm5) {
            return ol5Var.Z.g(((dm5) obj).Z.X, new nw2((byte) 20));
        }
        if (map instanceof em5) {
            return ol5Var.Z.g(((em5) obj).f0.Z, new nw2((byte) 21));
        }
        if (map instanceof ll5) {
            return ol5Var.Z.g(((ll5) obj).X, new nw2((byte) 22));
        }
        return map instanceof ol5 ? ol5Var.Z.g(((ol5) obj).Z, new nw2((byte) 23)) : super.equals(obj);
    }

    public final cm5 f() {
        dm5 dm5Var = this.X;
        if (dm5Var != null) {
            return dm5Var;
        }
        dm5 dm5Var2 = new dm5(this.Y, this.Z, this.f0.f());
        this.X = dm5Var2;
        return dm5Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        za4 za4Var = (za4) this.f0.get(obj);
        if (za4Var != null) {
            return za4Var.a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        ol5 ol5Var = this.f0;
        za4 za4Var = (za4) ol5Var.get(obj);
        if (za4Var != null) {
            Object obj3 = za4Var.a;
            if (obj3 == obj2) {
                return obj2;
            }
            this.X = null;
            ol5Var.put(obj, new za4(obj2, za4Var.b, za4Var.c));
            return obj3;
        }
        this.X = null;
        if (isEmpty()) {
            this.Y = obj;
            this.Z = obj;
            ol5Var.put(obj, new za4(obj2));
            return null;
        }
        Object obj4 = this.Z;
        Object obj5 = ol5Var.get(obj4);
        obj5.getClass();
        za4 za4Var2 = (za4) obj5;
        ol5Var.put(obj4, new za4(za4Var2.a, za4Var2.b, obj));
        ol5Var.put(obj, new za4(obj2, obj4));
        this.Z = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        ol5 ol5Var = this.f0;
        za4 za4Var = (za4) ol5Var.remove(obj);
        if (za4Var == null) {
            return null;
        }
        Object obj2 = za4Var.c;
        Object obj3 = za4Var.b;
        this.X = null;
        pz2 pz2Var = pz2.N0;
        if (obj3 != pz2Var) {
            Object obj4 = ol5Var.get(obj3);
            obj4.getClass();
            za4 za4Var2 = (za4) obj4;
            ol5Var.put(obj3, new za4(za4Var2.a, za4Var2.b, obj2));
        } else {
            this.Y = obj2;
        }
        if (obj2 != pz2Var) {
            Object obj5 = ol5Var.get(obj2);
            obj5.getClass();
            za4 za4Var3 = (za4) obj5;
            ol5Var.put(obj2, new za4(za4Var3.a, obj3, za4Var3.c));
        } else {
            this.Z = obj3;
        }
        return za4Var.a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        za4 za4Var = (za4) this.f0.get(obj);
        if (za4Var == null || !dh3.f(za4Var.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
