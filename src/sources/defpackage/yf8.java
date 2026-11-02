package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yf8 implements Serializable {
    public final Object X;
    public final Object Y;
    public final Object Z;

    public yf8(Object obj, Object obj2, Object obj3) {
        this.X = obj;
        this.Y = obj2;
        this.Z = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf8)) {
            return false;
        }
        yf8 yf8Var = (yf8) obj;
        return dh3.f(this.X, yf8Var.X) && dh3.f(this.Y, yf8Var.Y) && dh3.f(this.Z, yf8Var.Z);
    }

    public final int hashCode() {
        Object obj = this.X;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.Y;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.Z;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.X + ", " + this.Y + ", " + this.Z + ')';
    }
}
