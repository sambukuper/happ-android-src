package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bn4 implements kn4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bn4(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
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
        if (!(obj instanceof bn4)) {
            return false;
        }
        bn4 bn4Var = (bn4) obj;
        return dh3.f(this.a, bn4Var.a) && dh3.f(this.b, bn4Var.b) && this.c == bn4Var.c && dh3.f(this.d, bn4Var.d) && this.e.equals(bn4Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = pc6.f(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("ProfileImportDuplicatedName(id=", this.a, ", name=", this.b, ", activateInEnd=");
        sbT.append(this.c);
        sbT.append(", routingSettingsJson=");
        sbT.append(this.d);
        sbT.append(", subId=");
        return oi0.p(sbT, this.e, ")");
    }
}
