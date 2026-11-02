package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sm4 implements tm4 {
    public final String a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof sm4) {
            String str = ((sm4) obj).a;
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
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.a;
        if (str == null) {
            str = "null";
        }
        return pc6.p("Visible(subId=", str, ")");
    }
}
