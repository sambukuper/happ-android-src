package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sf4 implements uf4 {
    public final e69 a;
    public final nf4 b;
    public final lf4 c;
    public final lf4 d;
    public final lf4 e;
    public final j2 f;
    public final String g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sf4(e69 e69Var, nf4 nf4Var, lf4 lf4Var, lf4 lf4Var2, lf4 lf4Var3, j2 j2Var, String str) {
        j2Var.getClass();
        this.a = e69Var;
        this.b = nf4Var;
        this.c = lf4Var;
        this.d = lf4Var2;
        this.e = lf4Var3;
        this.f = j2Var;
        this.g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sf4 a(sf4 sf4Var, e69 e69Var, nf4 nf4Var, j2 j2Var, String str, int i) {
        if ((i & 1) != 0) {
            e69Var = sf4Var.a;
        }
        e69 e69Var2 = e69Var;
        if ((i & 2) != 0) {
            nf4Var = sf4Var.b;
        }
        nf4 nf4Var2 = nf4Var;
        lf4 lf4Var = sf4Var.c;
        lf4 lf4Var2 = sf4Var.d;
        lf4 lf4Var3 = sf4Var.e;
        if ((i & 32) != 0) {
            j2Var = sf4Var.f;
        }
        j2 j2Var2 = j2Var;
        if ((i & 64) != 0) {
            str = sf4Var.g;
        }
        j2Var2.getClass();
        return new sf4(e69Var2, nf4Var2, lf4Var, lf4Var2, lf4Var3, j2Var2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf4)) {
            return false;
        }
        sf4 sf4Var = (sf4) obj;
        return this.a == sf4Var.a && this.b == sf4Var.b && dh3.f(this.c, sf4Var.c) && dh3.f(this.d, sf4Var.d) && dh3.f(this.e, sf4Var.e) && dh3.f(this.f, sf4Var.f) && dh3.f(this.g, sf4Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        lf4 lf4Var = this.c;
        int iHashCode2 = (iHashCode + (lf4Var == null ? 0 : lf4Var.hashCode())) * 31;
        lf4 lf4Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (lf4Var2 == null ? 0 : lf4Var2.hashCode())) * 31;
        lf4 lf4Var3 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (lf4Var3 == null ? 0 : lf4Var3.hashCode())) * 31)) * 31;
        String str = this.g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(coreLogs=");
        sb.append(this.a);
        sb.append(", outputFormat=");
        sb.append(this.b);
        sb.append(", accessFileUiState=");
        sb.append(this.c);
        sb.append(", subscriptionFileUiState=");
        sb.append(this.d);
        sb.append(", pushFileUiState=");
        sb.append(this.e);
        sb.append(", xrayFiles=");
        sb.append(this.f);
        sb.append(", currentlyDraggedFilePath=");
        return oi0.p(sb, this.g, ")");
    }
}
