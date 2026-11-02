package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r54 {
    public final int a;
    public final int b;

    public r54(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            zc3.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        zc3.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r54)) {
            return false;
        }
        r54 r54Var = (r54) obj;
        return this.a == r54Var.a && this.b == r54Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.k(this.a, "Interval(start=", this.b, ", end=", ")");
    }
}
