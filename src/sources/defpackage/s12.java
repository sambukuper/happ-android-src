package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls12;", "Lqx4;", "Lf22;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s12 extends qx4 {
    public final ce8 X;
    public final sd8 Y;
    public final sd8 Z;
    public final sd8 f0;
    public final g22 g0;
    public final h62 h0;
    public final x77 i0;
    public final dn2 j0;
    public final t12 k0;

    public s12(ce8 ce8Var, sd8 sd8Var, sd8 sd8Var2, sd8 sd8Var3, g22 g22Var, h62 h62Var, x77 x77Var, dn2 dn2Var, t12 t12Var) {
        this.X = ce8Var;
        this.Y = sd8Var;
        this.Z = sd8Var2;
        this.f0 = sd8Var3;
        this.g0 = g22Var;
        this.h0 = h62Var;
        this.i0 = x77Var;
        this.j0 = dn2Var;
        this.k0 = t12Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new f22(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        f22 f22Var = (f22) jx4Var;
        f22Var.r0 = this.X;
        f22Var.s0 = this.Y;
        f22Var.t0 = this.Z;
        f22Var.u0 = this.f0;
        f22Var.v0 = this.g0;
        f22Var.w0 = this.h0;
        f22Var.x0 = this.i0;
        f22Var.y0 = this.j0;
        f22Var.z0 = this.k0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s12)) {
            return false;
        }
        s12 s12Var = (s12) obj;
        return s12Var.X == this.X && dh3.f(s12Var.Y, this.Y) && dh3.f(s12Var.Z, this.Z) && dh3.f(s12Var.f0, this.f0) && s12Var.g0.equals(this.g0) && dh3.f(s12Var.h0, this.h0) && s12Var.i0 == this.i0 && s12Var.j0 == this.j0 && dh3.f(s12Var.k0, this.k0);
    }

    public final int hashCode() {
        int iHashCode = this.X.hashCode() * 31;
        sd8 sd8Var = this.Y;
        int iHashCode2 = (iHashCode + (sd8Var != null ? sd8Var.hashCode() : 0)) * 31;
        sd8 sd8Var2 = this.Z;
        int iHashCode3 = (iHashCode2 + (sd8Var2 != null ? sd8Var2.hashCode() : 0)) * 31;
        sd8 sd8Var3 = this.f0;
        return this.i0.hashCode() + (this.k0.hashCode() * 31) + ((this.j0.hashCode() + ((this.h0.a.hashCode() + ((this.g0.a.hashCode() + ((iHashCode3 + (sd8Var3 != null ? sd8Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
