package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tq7 implements xq7 {
    public final String a;
    public final String b;
    public final Boolean c;
    public final Boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tq7(String str, String str2, Boolean bool, Boolean bool2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = bool2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq7)) {
            return false;
        }
        tq7 tq7Var = (tq7) obj;
        return dh3.f(this.a, tq7Var.a) && dh3.f(this.b, tq7Var.b) && this.c.equals(tq7Var.c) && this.d.equals(tq7Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("Save(url=", this.a, ", title=", this.b, ", hideSettings=");
        sbT.append(this.c);
        sbT.append(", insecure=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
