package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qg5 implements Serializable {
    public final Object X;
    public final Object Y;

    public qg5(Object obj, Object obj2) {
        this.X = obj;
        this.Y = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        return dh3.f(this.X, qg5Var.X) && dh3.f(this.Y, qg5Var.Y);
    }

    public final int hashCode() {
        Object obj = this.X;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.Y;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.X + ", " + this.Y + ')';
    }
}
