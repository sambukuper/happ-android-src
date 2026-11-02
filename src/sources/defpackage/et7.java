package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class et7 {
    public final String a;
    public final boolean b;
    public final qs7 c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public et7(String str, boolean z, qs7 qs7Var) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = qs7Var;
        this.d = dh3.f(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static et7 a(et7 et7Var, qs7 qs7Var) {
        String str = et7Var.a;
        boolean z = et7Var.b;
        str.getClass();
        return new et7(str, z, qs7Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et7)) {
            return false;
        }
        et7 et7Var = (et7) obj;
        return dh3.f(this.a, et7Var.a) && this.b == et7Var.b && dh3.f(this.c, et7Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = pc6.f(this.a.hashCode() * 31, 31, this.b);
        qs7 qs7Var = this.c;
        return iF + (qs7Var == null ? 0 : qs7Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SubscriptionPropertiesState(subId=" + this.a + ", isExtra=" + this.b + ", properties=" + this.c + ")";
    }
}
