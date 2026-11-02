package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh95;", "Lqx4;", "Li95;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h95 extends qx4 {
    public final gn2 X;

    public h95(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        i95 i95Var = new i95();
        i95Var.q0 = this.X;
        i95Var.r0 = true;
        return i95Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        i95 i95Var = (i95) jx4Var;
        gn2 gn2Var = i95Var.q0;
        gn2 gn2Var2 = this.X;
        if (gn2Var != gn2Var2 || !i95Var.r0) {
            yn0.Z(i95Var).X(false);
        }
        i95Var.q0 = gn2Var2;
        i95Var.r0 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h95 h95Var = obj instanceof h95 ? (h95) obj : null;
        return h95Var != null && this.X == h95Var.X;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.X + ", rtlAware=true)";
    }
}
