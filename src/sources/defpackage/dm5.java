package defpackage;

import android.os.Parcelable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dm5 extends b2 implements cm5 {
    public static final dm5 f0;
    public final Object X;
    public final Object Y;
    public final ll5 Z;

    static {
        pz2 pz2Var = pz2.N0;
        ll5 ll5Var = ll5.Z;
        ll5Var.getClass();
        f0 = new dm5(pz2Var, pz2Var, ll5Var);
    }

    public dm5(Object obj, Object obj2, ll5 ll5Var) {
        this.X = obj;
        this.Y = obj2;
        this.Z = ll5Var;
    }

    @Override // defpackage.b2
    public final Set a() {
        return new hm5(this, (byte) 0);
    }

    @Override // defpackage.b2
    public final Set b() {
        return new hm5(this, (byte) 1);
    }

    @Override // defpackage.b2
    public final int c() {
        return this.Z.c();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.Z.containsKey(obj);
    }

    @Override // defpackage.cm5
    public final cm5 d(Parcelable parcelable, Object obj) {
        boolean zIsEmpty = isEmpty();
        ll5 ll5Var = this.Z;
        if (zIsEmpty) {
            return new dm5(parcelable, parcelable, ll5Var.f(parcelable, new za4(obj)));
        }
        za4 za4Var = (za4) ll5Var.get(parcelable);
        Object obj2 = this.Y;
        Object obj3 = this.X;
        if (za4Var != null) {
            return za4Var.a == obj ? this : new dm5(obj3, obj2, ll5Var.f(parcelable, new za4(obj, za4Var.b, za4Var.c)));
        }
        Object obj4 = ll5Var.get(obj2);
        obj4.getClass();
        za4 za4Var2 = (za4) obj4;
        return new dm5(obj3, parcelable, ll5Var.f(obj2, new za4(za4Var2.a, za4Var2.b, parcelable)).f(parcelable, new za4(obj, obj2)));
    }

    @Override // defpackage.b2
    public final Collection e() {
        return new bm5(this, (byte) 1);
    }

    @Override // defpackage.b2, java.util.Map
    public final boolean equals(Object obj) {
        ll5 ll5Var = this.Z;
        if8 if8Var = ll5Var.X;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (ll5Var.c() != map.size()) {
            return false;
        }
        if (map instanceof dm5) {
            return if8Var.g(((dm5) obj).Z.X, new nw2((byte) 16));
        }
        if (map instanceof em5) {
            return if8Var.g(((em5) obj).f0.Z, new nw2((byte) 17));
        }
        if (map instanceof ll5) {
            return if8Var.g(((ll5) obj).X, new nw2((byte) 18));
        }
        return map instanceof ol5 ? if8Var.g(((ol5) obj).Z, new nw2((byte) 19)) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        za4 za4Var = (za4) this.Z.get(obj);
        if (za4Var != null) {
            return za4Var.a;
        }
        return null;
    }

    @Override // defpackage.cm5
    public final cm5 l(Parcelable parcelable) {
        ll5 ll5Var = this.Z;
        za4 za4Var = (za4) ll5Var.get(parcelable);
        if (za4Var == null) {
            return this;
        }
        Object obj = za4Var.b;
        Object obj2 = za4Var.c;
        ll5 ll5VarG = ll5Var.g(parcelable);
        pz2 pz2Var = pz2.N0;
        if (obj != pz2Var) {
            Object obj3 = ll5VarG.get(obj);
            obj3.getClass();
            za4 za4Var2 = (za4) obj3;
            ll5VarG = ll5VarG.f(obj, new za4(za4Var2.a, za4Var2.b, obj2));
        }
        if (obj2 != pz2Var) {
            Object obj4 = ll5VarG.get(obj2);
            obj4.getClass();
            za4 za4Var3 = (za4) obj4;
            ll5VarG = ll5VarG.f(obj2, new za4(za4Var3.a, obj, za4Var3.c));
        }
        Object obj5 = obj != pz2Var ? this.X : obj2;
        if (obj2 != pz2Var) {
            obj = this.Y;
        }
        return new dm5(obj5, obj, ll5VarG);
    }
}
