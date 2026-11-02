package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgb8;", "Lqx4;", "Lhb8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gb8 extends qx4 {
    public final boolean X;
    public final xz4 Y;
    public final boolean Z;
    public final kl6 f0;
    public final gn2 g0;

    public gb8(boolean z, xz4 xz4Var, boolean z2, kl6 kl6Var, gn2 gn2Var) {
        this.X = z;
        this.Y = xz4Var;
        this.Z = z2;
        this.f0 = kl6Var;
        this.g0 = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new hb8(this.X, this.Y, this.Z, this.f0, this.g0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        hb8 hb8Var = (hb8) jx4Var;
        boolean z = hb8Var.O0;
        boolean z2 = this.X;
        if (z != z2) {
            hb8Var.O0 = z2;
            ch3.I(hb8Var);
        }
        hb8Var.P0 = this.g0;
        hb8Var.o1(this.Y, null, false, this.Z, null, this.f0, hb8Var.Q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gb8.class != obj.getClass()) {
            return false;
        }
        gb8 gb8Var = (gb8) obj;
        return this.X == gb8Var.X && dh3.f(this.Y, gb8Var.Y) && this.Z == gb8Var.Z && this.f0.equals(gb8Var.f0) && this.g0 == gb8Var.g0;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.X) * 31;
        xz4 xz4Var = this.Y;
        return this.g0.hashCode() + oi0.e(this.f0.a, pc6.f(pc6.f((iHashCode + (xz4Var != null ? xz4Var.hashCode() : 0)) * 961, 31, false), 31, this.Z), 31);
    }
}
