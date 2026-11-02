package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kq6 {
    public final cm5 a;
    public final String b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kq6(cm5 cm5Var, String str, boolean z) {
        this.a = cm5Var;
        this.b = str;
        this.c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kq6 a(kq6 kq6Var, cm5 cm5Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            cm5Var = kq6Var.a;
        }
        if ((i & 2) != 0) {
            str = kq6Var.b;
        }
        if ((i & 4) != 0) {
            z = kq6Var.c;
        }
        kq6Var.getClass();
        cm5Var.getClass();
        return new kq6(cm5Var, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof kq6) {
                kq6 kq6Var = (kq6) obj;
                if (this.a.equals(kq6Var.a)) {
                    String str = kq6Var.b;
                    String str2 = this.b;
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
                    if (zEquals && this.c == kq6Var.c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.b;
        if (str == null) {
            str = "null";
        }
        StringBuilder sb = new StringBuilder("RoutingSubscriptionSelectState(subMap=");
        sb.append(this.a);
        sb.append(", selectedSub=");
        sb.append(str);
        sb.append(", isLoading=");
        return p61.o(sb, this.c, ")");
    }
}
