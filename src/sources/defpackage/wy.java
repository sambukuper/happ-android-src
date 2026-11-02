package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wy extends i35 {
    public final h35 a;
    public final g35 b;

    public wy(h35 h35Var, g35 g35Var) {
        this.a = h35Var;
        this.b = g35Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i35) {
            i35 i35Var = (i35) obj;
            h35 h35Var = this.a;
            if (h35Var != null ? h35Var.equals(((wy) i35Var).a) : ((wy) i35Var).a == null) {
                g35 g35Var = this.b;
                if (g35Var != null ? g35Var.equals(((wy) i35Var).b) : ((wy) i35Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h35 h35Var = this.a;
        int iHashCode = ((h35Var == null ? 0 : h35Var.hashCode()) ^ 1000003) * 1000003;
        g35 g35Var = this.b;
        return iHashCode ^ (g35Var != null ? g35Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
