package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lze8;", "Lqx4;", "Laf8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ze8 extends qx4 {
    public final p64 X;

    public ze8(p64 p64Var) {
        this.X = p64Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        af8 af8Var = new af8();
        af8Var.q0 = this.X;
        return af8Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((af8) jx4Var).q0 = this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze8) && dh3.f(this.X, ((ze8) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.X + ")";
    }
}
