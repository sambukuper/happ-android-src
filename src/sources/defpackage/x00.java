package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx00;", "Lqx4;", "Ly00;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x00 extends qx4 {
    public final long X;
    public final d90 Y;
    public final x67 Z;

    public x00(long j, ea4 ea4Var, x67 x67Var, int i) {
        j = (i & 1) != 0 ? dw0.g : j;
        ea4Var = (i & 2) != 0 ? null : ea4Var;
        this.X = j;
        this.Y = ea4Var;
        this.Z = x67Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        y00 y00Var = new y00();
        y00Var.q0 = this.X;
        y00Var.r0 = this.Y;
        y00Var.s0 = 1.0f;
        y00Var.t0 = this.Z;
        y00Var.u0 = 9205357640488583168L;
        return y00Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        y00 y00Var = (y00) jx4Var;
        y00Var.q0 = this.X;
        y00Var.r0 = this.Y;
        y00Var.s0 = 1.0f;
        x67 x67Var = y00Var.t0;
        x67 x67Var2 = this.Z;
        if (!dh3.f(x67Var, x67Var2)) {
            y00Var.t0 = x67Var2;
            ch3.I(y00Var);
        }
        z68.W(y00Var);
    }

    public final boolean equals(Object obj) {
        x00 x00Var = obj instanceof x00 ? (x00) obj : null;
        if (x00Var == null) {
            return false;
        }
        long j = x00Var.X;
        int i = dw0.h;
        return tk8.a(this.X, j) && dh3.f(this.Y, x00Var.Y) && dh3.f(this.Z, x00Var.Z);
    }

    public final int hashCode() {
        int i = dw0.h;
        int iHashCode = Long.hashCode(this.X) * 31;
        d90 d90Var = this.Y;
        return this.Z.hashCode() + pc6.d((iHashCode + (d90Var != null ? d90Var.hashCode() : 0)) * 31, 1.0f, 31);
    }
}
