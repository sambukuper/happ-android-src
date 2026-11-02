package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rv5 implements tv5 {
    public final String a;
    public final fn6 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rv5(String str, fn6 fn6Var) {
        str.getClass();
        this.a = str;
        this.b = fn6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv5)) {
            return false;
        }
        rv5 rv5Var = (rv5) obj;
        return dh3.f(this.a, rv5Var.a) && dh3.f(this.b, rv5Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fn6 fn6Var = this.b;
        return iHashCode + (fn6Var == null ? 0 : fn6Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Load(subId=" + this.a + ", geoFilesListener=" + this.b + ")";
    }
}
