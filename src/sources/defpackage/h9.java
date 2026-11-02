package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lh9;", "T", "Lqx4;", "Lz9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h9<T> extends qx4 {
    public final la X;
    public final boolean Y;
    public final Boolean Z;
    public final xc7 f0;

    public h9(la laVar, boolean z, Boolean bool, xc7 xc7Var) {
        this.X = laVar;
        this.Y = z;
        this.Z = bool;
        this.f0 = xc7Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        z9 z9Var = new z9(t9.a, this.Y, null, sd5.Y);
        z9Var.L0 = this.X;
        z9Var.M0 = this.Z;
        z9Var.N0 = this.f0;
        return z9Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        boolean z2;
        z9 z9Var = (z9) jx4Var;
        xc7 xc7Var = this.f0;
        z9Var.N0 = xc7Var;
        la laVar = z9Var.L0;
        la laVar2 = this.X;
        if (dh3.f(laVar, laVar2)) {
            z = false;
        } else {
            z9Var.L0 = laVar2;
            z9Var.v1(xc7Var);
            z = true;
        }
        sd5 sd5Var = z9Var.s0;
        sd5 sd5Var2 = sd5.Y;
        if (sd5Var != sd5Var2) {
            z9Var.s0 = sd5Var2;
            z = true;
        }
        Boolean bool = z9Var.M0;
        Boolean bool2 = this.Z;
        if (dh3.f(bool, bool2)) {
            z2 = z;
        } else {
            z9Var.M0 = bool2;
            z2 = true;
        }
        z9Var.s1(z9Var.t0, this.Y, null, sd5Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return dh3.f(this.X, h9Var.X) && this.Y == h9Var.Y && this.Z.equals(h9Var.Z) && dh3.f(this.f0, h9Var.f0);
    }

    public final int hashCode() {
        int iHashCode = (this.Z.hashCode() + pc6.f((sd5.Y.hashCode() + (this.X.hashCode() * 31)) * 31, 31, this.Y)) * 923521;
        xc7 xc7Var = this.f0;
        return iHashCode + (xc7Var != null ? xc7Var.hashCode() : 0);
    }
}
