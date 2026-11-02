package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d82 implements Map.Entry, qv3 {
    public final c94 X;
    public final f94 Y;
    public d82 Z;
    public d82 f0;
    public boolean g0;

    public d82(c94 c94Var, f94 f94Var) {
        this.X = c94Var;
        this.Y = f94Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d82) {
            d82 d82Var = (d82) obj;
            return this.X.equals(d82Var.X) && this.Y == d82Var.Y;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.Y.hashCode() + (this.X.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.X + ", value=" + this.Y + ")";
    }
}
