package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cw5 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cw5(String str, String str2, String str3, String str4, boolean z) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw5)) {
            return false;
        }
        cw5 cw5Var = (cw5) obj;
        String str = cw5Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && dh3.f(this.b, cw5Var.b) && dh3.f(this.c, cw5Var.c) && this.d == cw5Var.d && dh3.f(this.e, cw5Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        int iF = pc6.f(pc6.e(pc6.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str2 = this.e;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.a;
        if (str == null) {
            str = "null";
        }
        StringBuilder sbT = oi0.t("ProfileDuplicatedNameState(id=", str, ", subId=", this.b, ", name=");
        sbT.append(this.c);
        sbT.append(", activateInEnd=");
        sbT.append(this.d);
        sbT.append(", routingSettingsJson=");
        return oi0.p(sbT, this.e, ")");
    }
}
