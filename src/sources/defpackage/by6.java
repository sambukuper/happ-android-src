package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lby6;", "Lqx4;", "Lcy6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class by6 extends qx4 {
    public final ny6 X;
    public final sd5 Y;
    public final boolean Z;
    public final he2 f0;
    public final xz4 g0;
    public final w80 h0;
    public final boolean i0;
    public final td j0;

    public by6(td tdVar, w80 w80Var, he2 he2Var, xz4 xz4Var, sd5 sd5Var, ny6 ny6Var, boolean z, boolean z2) {
        this.X = ny6Var;
        this.Y = sd5Var;
        this.Z = z;
        this.f0 = he2Var;
        this.g0 = xz4Var;
        this.h0 = w80Var;
        this.i0 = z2;
        this.j0 = tdVar;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        cy6 cy6Var = new cy6();
        cy6Var.s0 = this.X;
        cy6Var.t0 = this.Y;
        cy6Var.u0 = this.Z;
        cy6Var.v0 = this.f0;
        cy6Var.w0 = this.g0;
        cy6Var.x0 = this.h0;
        cy6Var.y0 = this.i0;
        cy6Var.z0 = this.j0;
        return cy6Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        xz4 xz4Var = this.g0;
        ((cy6) jx4Var).d1(this.j0, this.h0, this.f0, xz4Var, this.Y, this.X, this.i0, this.Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || by6.class != obj.getClass()) {
            return false;
        }
        by6 by6Var = (by6) obj;
        return this.X.equals(by6Var.X) && this.Y == by6Var.Y && this.Z == by6Var.Z && dh3.f(this.f0, by6Var.f0) && dh3.f(this.g0, by6Var.g0) && dh3.f(this.h0, by6Var.h0) && this.i0 == by6Var.i0 && dh3.f(this.j0, by6Var.j0);
    }

    public final int hashCode() {
        int iF = pc6.f(pc6.f((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31, 31, this.Z), 31, false);
        he2 he2Var = this.f0;
        int iHashCode = (iF + (he2Var != null ? he2Var.hashCode() : 0)) * 31;
        xz4 xz4Var = this.g0;
        int iHashCode2 = (iHashCode + (xz4Var != null ? xz4Var.hashCode() : 0)) * 31;
        w80 w80Var = this.h0;
        int iF2 = pc6.f((iHashCode2 + (w80Var != null ? w80Var.hashCode() : 0)) * 31, 31, this.i0);
        td tdVar = this.j0;
        return iF2 + (tdVar != null ? tdVar.hashCode() : 0);
    }
}
