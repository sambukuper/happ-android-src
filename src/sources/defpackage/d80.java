package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld80;", "Lqx4;", "Le80;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d80 extends qx4 {
    public final p50 X;
    public final boolean Y;

    public d80(p50 p50Var, boolean z) {
        this.X = p50Var;
        this.Y = z;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        e80 e80Var = new e80();
        e80Var.q0 = this.X;
        e80Var.r0 = this.Y;
        return e80Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        e80 e80Var = (e80) jx4Var;
        e80Var.q0 = this.X;
        e80Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d80 d80Var = obj instanceof d80 ? (d80) obj : null;
        return d80Var != null && this.X.equals(d80Var.X) && this.Y == d80Var.Y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y) + (this.X.hashCode() * 31);
    }
}
