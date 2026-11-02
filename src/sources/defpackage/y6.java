package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y6 implements bo2, Serializable {
    public final Object X;
    public final Class Y;
    public final String Z;
    public final String f0;
    public final boolean g0 = false;
    public final byte h0;
    public final int i0;

    /* JADX WARN: Multi-variable type inference failed */
    public y6(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.X = obj;
        this.Y = cls;
        this.Z = str;
        this.f0 = str2;
        this.h0 = i;
        this.i0 = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return this.g0 == y6Var.g0 && this.h0 == y6Var.h0 && this.i0 == y6Var.i0 && dh3.f(this.X, y6Var.X) && this.Y.equals(y6Var.Y) && this.Z.equals(y6Var.Z) && this.f0.equals(y6Var.f0);
    }

    public final int hashCode() {
        Object obj = this.X;
        return ((((pc6.e(pc6.e((this.Y.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.Z), 31, this.f0) + (this.g0 ? 1231 : 1237)) * 31) + this.h0) * 31) + this.i0;
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.h0;
    }

    public final String toString() {
        return yb6.a.i(this);
    }
}
