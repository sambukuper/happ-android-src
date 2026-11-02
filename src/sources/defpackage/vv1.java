package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvv1;", "Lqx4;", "Lic0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vv1 extends qx4 {
    public final gn2 X;

    public vv1(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new ic0(new jc0(), this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ic0 ic0Var = (ic0) jx4Var;
        ic0Var.s0 = this.X;
        ic0Var.Y0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vv1) {
            return this.X == ((vv1) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
