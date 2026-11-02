package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class k52 {
    public final String a;
    public final km5 b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k52(String str, km5 km5Var) {
        km5Var.getClass();
        this.a = str;
        this.b = km5Var;
        this.c = str.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k52 a(k52 k52Var, String str, km5 km5Var, int i) {
        if ((i & 1) != 0) {
            str = k52Var.a;
        }
        if ((i & 2) != 0) {
            km5Var = k52Var.b;
        }
        k52Var.getClass();
        str.getClass();
        km5Var.getClass();
        return new k52(str, km5Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k52)) {
            return false;
        }
        k52 k52Var = (k52) obj;
        return this.a.equals(k52Var.a) && dh3.f(this.b, k52Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ExcludedRoutesState(ipAddressInput=" + this.a + ", excludedIpAddresses=" + this.b + ")";
    }
}
