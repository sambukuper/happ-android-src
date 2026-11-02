package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li60;", "Lqx4;", "Lj60;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i60 extends qx4 {
    public final gn2 X;

    public i60(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new j60(this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        i55 i55Var;
        j60 j60Var = (j60) jx4Var;
        gn2 gn2Var = this.X;
        j60Var.q0 = gn2Var;
        if (j60Var.X.p0 && (i55Var = yn0.X(j60Var, 2).x0) != null) {
            i55Var.t1(gn2Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i60) {
            return this.X == ((i60) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
