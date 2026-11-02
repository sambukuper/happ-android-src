package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt64;", "Lqx4;", "Lw64;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t64 extends qx4 {
    public final dn2 X;
    public final s64 Y;
    public final sd5 Z;
    public final boolean f0;

    public t64(dn2 dn2Var, s64 s64Var, sd5 sd5Var, boolean z) {
        this.X = dn2Var;
        this.Y = s64Var;
        this.Z = sd5Var;
        this.f0 = z;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new w64(this.X, this.Y, this.Z, this.f0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        w64 w64Var = (w64) jx4Var;
        w64Var.q0 = this.X;
        w64Var.r0 = this.Y;
        sd5 sd5Var = w64Var.s0;
        sd5 sd5Var2 = this.Z;
        if (sd5Var != sd5Var2) {
            w64Var.s0 = sd5Var2;
            ch3.I(w64Var);
        }
        boolean z = w64Var.t0;
        boolean z2 = this.f0;
        if (z == z2) {
            return;
        }
        w64Var.t0 = z2;
        w64Var.Y0();
        ch3.I(w64Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t64)) {
            return false;
        }
        t64 t64Var = (t64) obj;
        return this.X == t64Var.X && dh3.f(this.Y, t64Var.Y) && this.Z == t64Var.Z && this.f0 == t64Var.f0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + pc6.f((this.Z.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31)) * 31, 31, this.f0);
    }
}
