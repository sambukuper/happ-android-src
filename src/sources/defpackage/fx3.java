package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfx3;", "Lqx4;", "Lhx3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fx3 extends qx4 {
    public final gn2 X;
    public final gn2 Y;

    public fx3(gn2 gn2Var, gn2 gn2Var2) {
        this.X = gn2Var;
        this.Y = gn2Var2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        hx3 hx3Var = new hx3();
        hx3Var.q0 = this.X;
        hx3Var.r0 = this.Y;
        return hx3Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        hx3 hx3Var = (hx3) jx4Var;
        hx3Var.q0 = this.X;
        hx3Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx3)) {
            return false;
        }
        fx3 fx3Var = (fx3) obj;
        return this.X == fx3Var.X && this.Y == fx3Var.Y;
    }

    public final int hashCode() {
        gn2 gn2Var = this.X;
        int iHashCode = (gn2Var != null ? gn2Var.hashCode() : 0) * 31;
        gn2 gn2Var2 = this.Y;
        return iHashCode + (gn2Var2 != null ? gn2Var2.hashCode() : 0);
    }
}
