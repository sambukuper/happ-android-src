package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t39 {
    public final long a;
    public final long b;

    public t39(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t39.class.equals(obj.getClass())) {
            t39 t39Var = (t39) obj;
            if (t39Var.a == this.a && t39Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ie2.g(this.b, "}", pc6.s(this.a, "PeriodicityInfo{repeatIntervalMillis=", ", flexIntervalMillis="));
    }
}
