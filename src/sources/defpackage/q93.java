package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class q93 {
    public final m93 a;
    public final boolean b;
    public final m93 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q93(m93 m93Var, boolean z, m93 m93Var2) {
        this.a = m93Var;
        this.b = z;
        this.c = m93Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q93 a(q93 q93Var, m93 m93Var, boolean z, m93 m93Var2, int i) {
        if ((i & 1) != 0) {
            m93Var = q93Var.a;
        }
        if ((i & 2) != 0) {
            z = q93Var.b;
        }
        if ((i & 4) != 0) {
            m93Var2 = q93Var.c;
        }
        q93Var.getClass();
        return new q93(m93Var, z, m93Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q93)) {
            return false;
        }
        q93 q93Var = (q93) obj;
        return this.a.equals(q93Var.a) && this.b == q93Var.b && this.c.equals(q93Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + pc6.f(this.a.hashCode() * 31, 31, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InboundAuthState(socks=" + this.a + ", httpEnabled=" + this.b + ", http=" + this.c + ")";
    }
}
