package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lor0;", "Lqx4;", "Lnr0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class or0 extends qx4 {
    public final h80 X;

    public or0(h80 h80Var) {
        this.X = h80Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        nr0 nr0Var = new nr0();
        nr0Var.q0 = this.X;
        return nr0Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        nr0 nr0Var = (nr0) jx4Var;
        nr0Var.q0 = this.X;
        ch3.I(nr0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof or0) {
            return this.X == ((or0) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
