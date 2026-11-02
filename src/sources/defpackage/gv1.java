package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgv1;", "Lqx4;", "Lkv1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gv1 extends qx4 {
    public static final h80 k0 = new h80(19);
    public final lv1 X;
    public final sd5 Y;
    public final boolean Z;
    public final xz4 f0;
    public final boolean g0;
    public final sn2 h0;
    public final sn2 i0;
    public final boolean j0;

    public gv1(lv1 lv1Var, sd5 sd5Var, boolean z, xz4 xz4Var, boolean z2, iv1 iv1Var, sn2 sn2Var, boolean z3) {
        this.X = lv1Var;
        this.Y = sd5Var;
        this.Z = z;
        this.f0 = xz4Var;
        this.g0 = z2;
        this.h0 = iv1Var;
        this.i0 = sn2Var;
        this.j0 = z3;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        kv1 kv1Var = new kv1(k0, this.Z, this.f0, this.Y);
        kv1Var.L0 = this.X;
        kv1Var.M0 = this.g0;
        kv1Var.N0 = this.h0;
        kv1Var.O0 = this.i0;
        kv1Var.P0 = this.j0;
        return kv1Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        boolean z2;
        kv1 kv1Var = (kv1) jx4Var;
        lv1 lv1Var = kv1Var.L0;
        lv1 lv1Var2 = this.X;
        if (dh3.f(lv1Var, lv1Var2)) {
            z = false;
        } else {
            kv1Var.L0 = lv1Var2;
            z = true;
        }
        boolean z3 = kv1Var.P0;
        boolean z4 = this.j0;
        if (z3 != z4) {
            kv1Var.P0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        kv1Var.N0 = this.h0;
        kv1Var.O0 = this.i0;
        kv1Var.M0 = this.g0;
        kv1Var.s1(k0, this.Z, this.f0, this.Y, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gv1.class != obj.getClass()) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        return dh3.f(this.X, gv1Var.X) && this.Y == gv1Var.Y && this.Z == gv1Var.Z && dh3.f(this.f0, gv1Var.f0) && this.g0 == gv1Var.g0 && dh3.f(this.h0, gv1Var.h0) && dh3.f(this.i0, gv1Var.i0) && this.j0 == gv1Var.j0;
    }

    public final int hashCode() {
        int iF = pc6.f((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31, 31, this.Z);
        xz4 xz4Var = this.f0;
        return Boolean.hashCode(this.j0) + ((this.i0.hashCode() + ((this.h0.hashCode() + pc6.f((iF + (xz4Var != null ? xz4Var.hashCode() : 0)) * 31, 31, this.g0)) * 31)) * 31);
    }
}
