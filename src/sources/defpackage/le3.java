package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lle3;", "Lqx4;", "Lne3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class le3 extends qx4 {
    public final v09 X;

    public le3(v09 v09Var) {
        this.X = v09Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new ne3(this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ne3 ne3Var = (ne3) jx4Var;
        v09 v09Var = ne3Var.s0;
        v09 v09Var2 = this.X;
        if (dh3.f(v09Var2, v09Var)) {
            return;
        }
        ne3Var.s0 = v09Var2;
        ne3Var.Z0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof le3) {
            return dh3.f(((le3) obj).X, this.X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
