package defpackage;

import android.os.Parcelable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ll5 extends b2 implements cm5 {
    public static final ll5 Z = new ll5(if8.e, 0);
    public final if8 X;
    public final int Y;

    public ll5(if8 if8Var, int i) {
        if8Var.getClass();
        this.X = if8Var;
        this.Y = i;
    }

    @Override // defpackage.b2
    public final Set a() {
        return new xl5(this, (byte) 0);
    }

    @Override // defpackage.b2
    public final Set b() {
        return new xl5(this, (byte) 1);
    }

    @Override // defpackage.b2
    public final int c() {
        return this.Y;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.X.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.cm5
    public final cm5 d(Parcelable parcelable, Object obj) {
        return f(parcelable, obj);
    }

    @Override // defpackage.b2, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.Y != map.size()) {
            return false;
        }
        boolean z = map instanceof dm5;
        if8 if8Var = this.X;
        if (z) {
            return if8Var.g(((dm5) obj).Z.X, new nw2((byte) 8));
        }
        if (map instanceof em5) {
            return if8Var.g(((em5) obj).f0.Z, new nw2((byte) 9));
        }
        if (map instanceof ll5) {
            return if8Var.g(((ll5) obj).X, new nw2((byte) 10));
        }
        return map instanceof ol5 ? if8Var.g(((ol5) obj).Z, new nw2((byte) 11)) : super.equals(obj);
    }

    public final ll5 f(Object obj, Object obj2) {
        h70 h70VarV = this.X.v(obj != null ? obj.hashCode() : 0, 0, obj, obj2);
        return h70VarV == null ? this : new ll5((if8) h70VarV.Z, this.Y + (h70VarV.Y ? 1 : 0));
    }

    public final ll5 g(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        if8 if8Var = this.X;
        if8 if8VarW = if8Var.w(iHashCode, 0, obj);
        if (if8Var == if8VarW) {
            return this;
        }
        if (if8VarW != null) {
            return new ll5(if8VarW, c() - 1);
        }
        ll5 ll5Var = Z;
        ll5Var.getClass();
        return ll5Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.X.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.cm5
    public final cm5 l(Parcelable parcelable) {
        return g(parcelable);
    }
}
