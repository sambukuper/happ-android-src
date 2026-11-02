package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dw5 implements fw5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final fn6 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dw5(String str, String str2, boolean z, String str3, String str4, fn6 fn6Var) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = fn6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw5)) {
            return false;
        }
        dw5 dw5Var = (dw5) obj;
        return dh3.f(this.a, dw5Var.a) && dh3.f(this.b, dw5Var.b) && this.c == dw5Var.c && dh3.f(this.d, dw5Var.d) && dh3.f(this.e, dw5Var.e) && dh3.f(this.f, dw5Var.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = pc6.f(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iE = pc6.e((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        fn6 fn6Var = this.f;
        return iE + (fn6Var != null ? fn6Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("Load(id=", this.a, ", name=", this.b, ", activateInEnd=");
        sbT.append(this.c);
        sbT.append(", routingSettingsJson=");
        sbT.append(this.d);
        sbT.append(", subId=");
        sbT.append(this.e);
        sbT.append(", listener=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
