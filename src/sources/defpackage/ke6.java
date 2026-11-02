package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ke6 {
    public final boolean a;
    public final String b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ke6(boolean z, String str) {
        this.a = z;
        this.b = str;
        this.c = z && str.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ke6 a(ke6 ke6Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = ke6Var.a;
        }
        if ((i & 2) != 0) {
            str = ke6Var.b;
        }
        return new ke6(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke6)) {
            return false;
        }
        ke6 ke6Var = (ke6) obj;
        return this.a == ke6Var.a && this.b.equals(ke6Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ReportState(isAllowedToSendData=" + this.a + ", reportText=" + this.b + ")";
    }
}
