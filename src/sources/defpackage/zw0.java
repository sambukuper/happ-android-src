package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzw0;", "Lqx4;", "Lcx0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zw0 extends qx4 {
    public final xz4 X;
    public final tb3 Y;
    public final boolean Z;
    public final dn2 f0;
    public final dn2 g0;

    public zw0(dn2 dn2Var, dn2 dn2Var2, tb3 tb3Var, xz4 xz4Var, boolean z) {
        this.X = xz4Var;
        this.Y = tb3Var;
        this.Z = z;
        this.f0 = dn2Var;
        this.g0 = dn2Var2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new cx0(this.f0, this.g0, this.Y, this.X, this.Z);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        cx0 cx0Var = (cx0) jx4Var;
        cx0Var.N0 = true;
        boolean z2 = cx0Var.M0 == null;
        dn2 dn2Var = this.g0;
        if (z2 != (dn2Var == null)) {
            cx0Var.d1();
            ch3.I(cx0Var);
            z = true;
        } else {
            z = false;
        }
        cx0Var.M0 = dn2Var;
        boolean z3 = cx0Var.x0;
        boolean z4 = this.Z;
        boolean z5 = z3 != z4 ? true : z;
        cx0Var.o1(this.X, this.Y, false, z4, null, null, this.f0);
        if (z5) {
            cx0Var.p1(false);
            cx0Var.p1(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zw0.class != obj.getClass()) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return dh3.f(this.X, zw0Var.X) && dh3.f(this.Y, zw0Var.Y) && this.Z == zw0Var.Z && this.f0 == zw0Var.f0 && this.g0 == zw0Var.g0;
    }

    public final int hashCode() {
        xz4 xz4Var = this.X;
        int iHashCode = (xz4Var != null ? xz4Var.hashCode() : 0) * 31;
        tb3 tb3Var = this.Y;
        int iHashCode2 = (this.f0.hashCode() + pc6.f(pc6.f((iHashCode + (tb3Var != null ? tb3Var.hashCode() : 0)) * 31, 31, false), 29791, this.Z)) * 961;
        dn2 dn2Var = this.g0;
        return Boolean.hashCode(true) + ((iHashCode2 + (dn2Var != null ? dn2Var.hashCode() : 0)) * 961);
    }
}
