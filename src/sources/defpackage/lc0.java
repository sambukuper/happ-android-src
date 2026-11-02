package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 {
    public final w35 a;

    public lc0(w35 w35Var) {
        this.a = w35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc0) && dh3.f(this.a, ((lc0) obj).a);
    }

    public final int hashCode() {
        w35 w35Var = this.a;
        if (w35Var != null) {
            return w35Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}
