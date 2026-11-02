package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gp4 implements Map.Entry, qv3 {
    public final ip4 X;
    public final int Y;
    public final int Z;

    public gp4(ip4 ip4Var, int i) {
        this.X = ip4Var;
        this.Y = i;
        this.Z = ip4Var.j0;
    }

    public final void a() {
        if (this.X.j0 != this.Z) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return dh3.f(entry.getKey(), getKey()) && dh3.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.X.X[this.Y];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.X.Y;
        objArr.getClass();
        return objArr[this.Y];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        ip4 ip4Var = this.X;
        ip4Var.c();
        Object[] objArr = ip4Var.Y;
        if (objArr == null) {
            int length = ip4Var.X.length;
            if (length < 0) {
                bt.q("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ip4Var.Y = objArr;
        }
        int i = this.Y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
