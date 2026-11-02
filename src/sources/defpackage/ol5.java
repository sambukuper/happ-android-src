package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ol5 extends g2 {
    public ll5 X;
    public k42 Y = new k42();
    public if8 Z;
    public Object f0;
    public int g0;
    public int h0;
    public int i0;

    public ol5(ll5 ll5Var) {
        this.X = ll5Var;
        this.Z = ll5Var.X;
        this.i0 = ll5Var.Y;
    }

    @Override // defpackage.g2
    public final int c() {
        return this.i0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if8 if8Var = if8.e;
        if8Var.getClass();
        g(if8Var);
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.Z.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.g2
    public final Collection e() {
        return new kp4(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.i0 != map.size()) {
            return false;
        }
        if (map instanceof ll5) {
            return this.Z.g(((ll5) obj).X, new nw2((byte) 12));
        }
        if (map instanceof ol5) {
            return this.Z.g(((ol5) obj).Z, new nw2((byte) 13));
        }
        if (map instanceof dm5) {
            return this.Z.g(((dm5) obj).Z.X, new nw2((byte) 14));
        }
        return map instanceof em5 ? this.Z.g(((em5) obj).f0.Z, new nw2((byte) 15)) : super.equals(obj);
    }

    public final ll5 f() {
        ll5 ll5Var = this.X;
        if (ll5Var != null) {
            return ll5Var;
        }
        ll5 ll5Var2 = new ll5(this.Z, c());
        this.X = ll5Var2;
        this.Y = new k42();
        return ll5Var2;
    }

    public final void g(if8 if8Var) {
        if (if8Var != this.Z) {
            this.Z = if8Var;
            this.X = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.Z.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i) {
        this.i0 = i;
        this.g0++;
        this.h0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f0 = null;
        g(this.Z.n(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.f0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        ll5 ll5VarF = null;
        ll5 ll5Var = map instanceof ll5 ? (ll5) map : null;
        if (ll5Var == null) {
            ol5 ol5Var = map instanceof ol5 ? (ol5) map : null;
            if (ol5Var != null) {
                ll5VarF = ol5Var.f();
            }
        } else {
            ll5VarF = ll5Var;
        }
        if (ll5VarF == null) {
            super.putAll(map);
            return;
        }
        di1 di1Var = new di1();
        di1Var.a = 0;
        int iC = c();
        if8 if8Var = this.Z;
        if8 if8Var2 = ll5VarF.X;
        if8Var2.getClass();
        g(if8Var.o(if8Var2, 0, di1Var, this));
        int iC2 = (ll5VarF.c() + iC) - di1Var.a;
        if (iC != iC2) {
            h(iC2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        if8 if8VarQ = this.Z.q(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (if8VarQ == null) {
            if8VarQ = if8.e;
            if8VarQ.getClass();
        }
        g(if8VarQ);
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.f0 = null;
        if8 if8VarP = this.Z.p(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (if8VarP == null) {
            if8VarP = if8.e;
            if8VarP.getClass();
        }
        g(if8VarP);
        return this.f0;
    }
}
