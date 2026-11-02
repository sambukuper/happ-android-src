package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls54;", "Lqx4;", "Lv54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s54 extends qx4 {
    public final x64 X;
    public final vk1 Y;
    public final sd5 Z;

    public s54(x64 x64Var, vk1 vk1Var, sd5 sd5Var) {
        this.X = x64Var;
        this.Y = vk1Var;
        this.Z = sd5Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        v54 v54Var = new v54();
        v54Var.q0 = this.X;
        v54Var.r0 = this.Y;
        v54Var.s0 = this.Z;
        return v54Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        v54 v54Var = (v54) jx4Var;
        v54Var.q0 = this.X;
        v54Var.r0 = this.Y;
        v54Var.s0 = this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s54)) {
            return false;
        }
        s54 s54Var = (s54) obj;
        return dh3.f(this.X, s54Var.X) && dh3.f(this.Y, s54Var.Y) && this.Z == s54Var.Z;
    }

    public final int hashCode() {
        return this.Z.hashCode() + pc6.f((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31, 31, false);
    }
}
