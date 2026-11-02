package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhg5;", "Lqx4;", "Ljg5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hg5 extends qx4 {
    public final gg5 X;

    public hg5(gg5 gg5Var) {
        this.X = gg5Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        jg5 jg5Var = new jg5();
        jg5Var.q0 = this.X;
        return jg5Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((jg5) jx4Var).q0 = this.X;
    }

    public final boolean equals(Object obj) {
        hg5 hg5Var = obj instanceof hg5 ? (hg5) obj : null;
        if (hg5Var == null) {
            return false;
        }
        return dh3.f(this.X, hg5Var.X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
