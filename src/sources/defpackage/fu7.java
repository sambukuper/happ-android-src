package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class fu7 implements hu7 {
    public final boolean a;
    public final boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fu7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fu7 a(fu7 fu7Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = fu7Var.a;
        }
        if ((i & 2) != 0) {
            z2 = fu7Var.b;
        }
        return new fu7(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu7)) {
            return false;
        }
        fu7 fu7Var = (fu7) obj;
        return this.a == fu7Var.a && this.b == fu7Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Data(rejectDuplicates=" + this.a + ", useLegacyOkHttp=" + this.b + ")";
    }
}
