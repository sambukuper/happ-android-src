package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vu6 implements Map.Entry {
    public final Object X;
    public final Object Y;
    public vu6 Z;
    public vu6 f0;

    public vu6(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vu6)) {
            return false;
        }
        vu6 vu6Var = (vu6) obj;
        return this.X.equals(vu6Var.X) && this.Y.equals(vu6Var.Y);
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
        return this.Y.hashCode() ^ this.X.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.X + "=" + this.Y;
    }
}
