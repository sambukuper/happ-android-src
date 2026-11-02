package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb41;", "Lqx4;", "Lc41;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b41 extends qx4 {
    public final gn2 X;

    public b41(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        c41 c41Var = new c41();
        c41Var.s0 = this.X;
        return c41Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        c41 c41Var = (c41) jx4Var;
        gn2 gn2Var = c41Var.s0;
        gn2 gn2Var2 = this.X;
        if (gn2Var2 != gn2Var) {
            c41Var.s0 = gn2Var2;
            c41Var.Z0();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b41) && ((b41) obj).X == this.X;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
