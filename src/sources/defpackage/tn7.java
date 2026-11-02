package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tn7 implements co7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tn7(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn7)) {
            return false;
        }
        tn7 tn7Var = (tn7) obj;
        return dh3.f(this.a, tn7Var.a) && dh3.f(this.b, tn7Var.b) && this.c == tn7Var.c && dh3.f(this.d, tn7Var.d) && dh3.f(this.e, tn7Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = pc6.e(pc6.f(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("ProfileImportDuplicatedName(id=", this.a, ", name=", this.b, ", activateInEnd=");
        sbT.append(this.c);
        sbT.append(", subId=");
        sbT.append(this.d);
        sbT.append(", routingSettingsJson=");
        return oi0.p(sbT, this.e, ")");
    }
}
