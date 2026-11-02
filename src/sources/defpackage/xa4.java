package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa4 implements Map.Entry {
    public xa4 X;
    public xa4 Y;
    public xa4 Z;
    public xa4 f0;
    public xa4 g0;
    public final Object h0;
    public final boolean i0;
    public Object j0;
    public int k0;

    public xa4(boolean z, xa4 xa4Var, Object obj, xa4 xa4Var2, xa4 xa4Var3) {
        this.X = xa4Var;
        this.h0 = obj;
        this.i0 = z;
        this.k0 = 1;
        this.f0 = xa4Var2;
        this.g0 = xa4Var3;
        xa4Var3.f0 = this;
        xa4Var2.g0 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.h0;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.j0;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h0;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.j0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.h0;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.j0;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.i0) {
            b61.i("value == null");
            return null;
        }
        Object obj2 = this.j0;
        this.j0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.h0 + "=" + this.j0;
    }

    public xa4(boolean z) {
        this.h0 = null;
        this.i0 = z;
        this.g0 = this;
        this.f0 = this;
    }
}
