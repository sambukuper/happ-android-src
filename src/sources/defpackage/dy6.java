package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldy6;", "Lqx4;", "Lmy6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class dy6 extends qx4 {
    public final ny6 X;
    public final sd5 Y;
    public final boolean Z;
    public final boolean f0;
    public final xz4 g0;

    public dy6(ny6 ny6Var, sd5 sd5Var, boolean z, boolean z2, xz4 xz4Var) {
        this.X = ny6Var;
        this.Y = sd5Var;
        this.Z = z;
        this.f0 = z2;
        this.g0 = xz4Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new my6(null, null, null, this.g0, this.Y, this.X, this.Z, this.f0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((my6) jx4Var).t1(null, null, null, this.g0, this.Y, this.X, this.Z, this.f0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy6)) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return dh3.f(this.X, dy6Var.X) && this.Y == dy6Var.Y && this.Z == dy6Var.Z && this.f0 == dy6Var.f0 && dh3.f(this.g0, dy6Var.g0);
    }

    public final int hashCode() {
        int iF = pc6.f(pc6.f((this.Y.hashCode() + (this.X.hashCode() * 31)) * 961, 31, this.Z), 961, this.f0);
        xz4 xz4Var = this.g0;
        return (iF + (xz4Var != null ? xz4Var.hashCode() : 0)) * 31;
    }
}
