package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class up5 {
    public final qp5 a;
    public final fp5 b;

    public up5(qp5 qp5Var, fp5 fp5Var) {
        this.a = qp5Var;
        this.b = fp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up5)) {
            return false;
        }
        up5 up5Var = (up5) obj;
        return dh3.f(this.b, up5Var.b) && dh3.f(this.a, up5Var.a);
    }

    public final int hashCode() {
        qp5 qp5Var = this.a;
        int iHashCode = (qp5Var != null ? qp5Var.hashCode() : 0) * 31;
        fp5 fp5Var = this.b;
        return iHashCode + (fp5Var != null ? fp5Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
