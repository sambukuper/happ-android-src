package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wa7 {
    public final oi a;
    public long b;

    public wa7(oi oiVar, long j) {
        this.a = oiVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wa7) {
            wa7 wa7Var = (wa7) obj;
            if (this.a == wa7Var.a && pf3.a(this.b, wa7Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + pf3.b(this.b) + ")";
    }
}
