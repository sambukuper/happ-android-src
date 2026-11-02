package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n00 extends ys0 {
    public final Object w0;
    public final long x0;

    public n00(long j, Object obj) {
        this.w0 = obj;
        this.x0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return this.w0.equals(n00Var.w0) && this.x0 == n00Var.x0;
    }

    public final int hashCode() {
        return Long.hashCode(this.x0) + (this.w0.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.w0 + ", compositeKey=" + this.x0 + ')';
    }
}
