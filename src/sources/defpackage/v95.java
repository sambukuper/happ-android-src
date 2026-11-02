package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v95 extends ys0 {
    public final u95 w0;
    public final d94 x0;

    public v95(d94 d94Var, u95 u95Var) {
        u95Var.getClass();
        this.w0 = u95Var;
        this.x0 = d94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95Var = (v95) obj;
        return dh3.f(this.w0, v95Var.w0) && dh3.f(this.x0, v95Var.x0);
    }

    public final int hashCode() {
        int iHashCode = this.w0.hashCode() * 31;
        d94 d94Var = this.x0;
        return iHashCode + (d94Var == null ? 0 : d94Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.w0 + ", owner=" + this.x0 + ')';
    }
}
