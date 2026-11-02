package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f41 {
    public final int a;
    public final long b;
    public final g41 c;
    public final lr5 d;

    public f41(int i, long j, g41 g41Var, lr5 lr5Var) {
        this.a = i;
        this.b = j;
        this.c = g41Var;
        this.d = lr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return this.a == f41Var.a && this.b == f41Var.b && this.c == f41Var.c && dh3.f(this.d, f41Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p61.g(Integer.hashCode(this.a) * 31, this.b, 31)) * 31;
        lr5 lr5Var = this.d;
        return iHashCode + (lr5Var == null ? 0 : lr5Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
