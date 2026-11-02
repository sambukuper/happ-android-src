package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tn6 {
    public final String a;
    public final boolean b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tn6(String str, boolean z, String str2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn6)) {
            return false;
        }
        tn6 tn6Var = (tn6) obj;
        return dh3.f(this.a, tn6Var.a) && this.b == tn6Var.b && dh3.f(this.c, tn6Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = pc6.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutingProfileSubItemUiState(subId=");
        sb.append(this.a);
        sb.append(", isJsonSub=");
        sb.append(this.b);
        sb.append(", title=");
        return oi0.p(sb, this.c, ")");
    }
}
