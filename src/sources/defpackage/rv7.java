package defpackage;

import su.happ.proxyutility.dto.ConfigGroupCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rv7 implements tv7 {
    public final ConfigGroupCache a;
    public final ConfigGroupCache b;
    public final boolean c;
    public final boolean d;
    public final Integer e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = ConfigGroupCache.$stable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rv7(ConfigGroupCache configGroupCache, ConfigGroupCache configGroupCache2, boolean z, boolean z2, Integer num) {
        this.a = configGroupCache;
        this.b = configGroupCache2;
        this.c = z;
        this.d = z2;
        this.e = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv7)) {
            return false;
        }
        rv7 rv7Var = (rv7) obj;
        return this.a.equals(rv7Var.a) && this.b.equals(rv7Var.b) && this.c == rv7Var.c && this.d == rv7Var.d && dh3.f(this.e, rv7Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = pc6.f(pc6.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return iF + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Subscription(value=" + this.a + ", payloadComparator=" + this.b + ", isChecked=" + this.c + ", isCollapseAllowed=" + this.d + ", updateInterval=" + this.e + ")";
    }
}
