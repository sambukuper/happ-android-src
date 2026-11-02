package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw68;", "Lqx4;", "Lx68;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w68 extends qx4 {
    public final o88 X;

    public w68(o88 o88Var) {
        this.X = o88Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new x68(this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        x68 x68Var = (x68) jx4Var;
        x68Var.getClass();
        o88 o88VarD = xt7.d(this.X, yn0.Z(x68Var).B0);
        x68Var.Y0(o88VarD, (fi2) hi5.W(x68Var, y01.k));
        v68 v68Var = x68Var.s0;
        if (v68Var == null) {
            throw ie2.d("Min size state is not set.");
        }
        v68.a(v68Var, null, null, o88VarD, 23);
        nr4.E(x68Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w68)) {
            return false;
        }
        return dh3.f(this.X, ((w68) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
