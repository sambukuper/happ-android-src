package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltz2;", "Lqx4;", "Lvz2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tz2 extends qx4 {
    public final o88 X;
    public final int Y;
    public final int Z;

    public tz2(o88 o88Var, int i, int i2) {
        this.X = o88Var;
        this.Y = i;
        this.Z = i2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        vz2 vz2Var = new vz2();
        vz2Var.q0 = this.X;
        vz2Var.r0 = this.Y;
        vz2Var.s0 = this.Z;
        vz2Var.u0 = -1;
        vz2Var.v0 = -1;
        return vz2Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        vz2 vz2Var = (vz2) jx4Var;
        o88 o88Var = vz2Var.q0;
        o88 o88Var2 = this.X;
        boolean zF = dh3.f(o88Var, o88Var2);
        int i = this.Y;
        int i2 = this.Z;
        if (zF && vz2Var.r0 == i && vz2Var.s0 == i2) {
            return;
        }
        vz2Var.q0 = o88Var2;
        vz2Var.r0 = i;
        vz2Var.s0 = i2;
        vz2Var.w0 = xt7.d(o88Var2, yn0.Z(vz2Var).B0);
        vz2Var.t0 = true;
        nr4.E(vz2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz2)) {
            return false;
        }
        tz2 tz2Var = (tz2) obj;
        return dh3.f(this.X, tz2Var.X) && this.Y == tz2Var.Y && this.Z == tz2Var.Z;
    }

    public final int hashCode() {
        return (((this.X.hashCode() * 31) + this.Y) * 31) + this.Z;
    }
}
