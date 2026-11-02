package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lf4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lf4(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4)) {
            return false;
        }
        lf4 lf4Var = (lf4) obj;
        return dh3.f(this.a, lf4Var.a) && dh3.f(this.b, lf4Var.b) && this.c.equals(lf4Var.c) && this.d.equals(lf4Var.d) && this.e == lf4Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.e) + pc6.e(pc6.e(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("LogFileUiState(name=", this.a, ", path=", this.b, ", date=");
        oi0.y(sbT, this.c, ", length=", this.d, ", isEncrypted=");
        return p61.o(sbT, this.e, ")");
    }
}
