package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyt0;", "Lqx4;", "Lbu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yt0 extends qx4 {
    public final xz4 X;
    public final tb3 Y;
    public final boolean Z;
    public final boolean f0;
    public final String g0;
    public final kl6 h0;
    public final dn2 i0;

    public yt0(xz4 xz4Var, tb3 tb3Var, boolean z, boolean z2, String str, kl6 kl6Var, dn2 dn2Var) {
        this.X = xz4Var;
        this.Y = tb3Var;
        this.Z = z;
        this.f0 = z2;
        this.g0 = str;
        this.h0 = kl6Var;
        this.i0 = dn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new bu0(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((bu0) jx4Var).o1(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yt0.class != obj.getClass()) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return dh3.f(this.X, yt0Var.X) && dh3.f(this.Y, yt0Var.Y) && this.Z == yt0Var.Z && this.f0 == yt0Var.f0 && dh3.f(this.g0, yt0Var.g0) && dh3.f(this.h0, yt0Var.h0) && this.i0 == yt0Var.i0;
    }

    public final int hashCode() {
        xz4 xz4Var = this.X;
        int iHashCode = (xz4Var != null ? xz4Var.hashCode() : 0) * 31;
        tb3 tb3Var = this.Y;
        int iF = pc6.f(pc6.f((iHashCode + (tb3Var != null ? tb3Var.hashCode() : 0)) * 31, 31, this.Z), 31, this.f0);
        String str = this.g0;
        int iHashCode2 = (iF + (str != null ? str.hashCode() : 0)) * 31;
        kl6 kl6Var = this.h0;
        return this.i0.hashCode() + ((iHashCode2 + (kl6Var != null ? Integer.hashCode(kl6Var.a) : 0)) * 31);
    }
}
