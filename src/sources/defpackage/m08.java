package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm08;", "Lqx4;", "Ln08;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m08 extends qx4 {
    public final gn2 X;

    public m08(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        n08 n08Var = new n08(w51.p);
        n08Var.t0 = this.X;
        return n08Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        n08 n08Var = (n08) jx4Var;
        gn2 gn2Var = n08Var.t0;
        gn2 gn2Var2 = this.X;
        if (gn2Var != gn2Var2) {
            n08Var.t0 = gn2Var2;
            c29 c29Var = n08Var.u0;
            if (c29Var != null) {
                v09 v09Var = (v09) gn2Var2.B(c29Var);
                if (dh3.f(v09Var, n08Var.s0)) {
                    return;
                }
                n08Var.s0 = v09Var;
                n08Var.Z0();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m08) {
            return this.X == ((m08) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
