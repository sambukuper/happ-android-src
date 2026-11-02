package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwz6;", "Lqx4;", "Lyz6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wz6 extends qx4 {
    public final boolean X;
    public final xz4 Y;
    public final tb3 Z;
    public final boolean f0;
    public final kl6 g0;
    public final dn2 h0;

    public wz6(boolean z, xz4 xz4Var, tb3 tb3Var, boolean z2, kl6 kl6Var, dn2 dn2Var) {
        this.X = z;
        this.Y = xz4Var;
        this.Z = tb3Var;
        this.f0 = z2;
        this.g0 = kl6Var;
        this.h0 = dn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        yz6 yz6Var = new yz6(this.Y, this.Z, false, this.f0, null, this.g0, this.h0);
        yz6Var.O0 = this.X;
        return yz6Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        yz6 yz6Var = (yz6) jx4Var;
        boolean z = yz6Var.O0;
        boolean z2 = this.X;
        if (z != z2) {
            yz6Var.O0 = z2;
            ch3.I(yz6Var);
        }
        yz6Var.o1(this.Y, this.Z, false, this.f0, null, this.g0, this.h0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wz6.class != obj.getClass()) {
            return false;
        }
        wz6 wz6Var = (wz6) obj;
        return this.X == wz6Var.X && dh3.f(this.Y, wz6Var.Y) && dh3.f(this.Z, wz6Var.Z) && this.f0 == wz6Var.f0 && this.g0.equals(wz6Var.g0) && this.h0 == wz6Var.h0;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.X) * 31;
        xz4 xz4Var = this.Y;
        int iHashCode2 = (iHashCode + (xz4Var != null ? xz4Var.hashCode() : 0)) * 31;
        tb3 tb3Var = this.Z;
        return this.h0.hashCode() + oi0.e(this.g0.a, pc6.f(pc6.f((iHashCode2 + (tb3Var != null ? tb3Var.hashCode() : 0)) * 31, 31, false), 31, this.f0), 31);
    }
}
