package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj48;", "Lqx4;", "Ln48;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class j48 extends qx4 {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final y78 f0;
    public final kd8 g0;
    public final r68 h0;
    public final d90 i0;
    public final boolean j0;
    public final ay6 k0;
    public final sd5 l0;
    public final ub8 m0;
    public final ip5 n0;

    public j48(boolean z, boolean z2, boolean z3, y78 y78Var, kd8 kd8Var, r68 r68Var, d90 d90Var, boolean z4, ay6 ay6Var, sd5 sd5Var, ub8 ub8Var, ip5 ip5Var) {
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.f0 = y78Var;
        this.g0 = kd8Var;
        this.h0 = r68Var;
        this.i0 = d90Var;
        this.j0 = z4;
        this.k0 = ay6Var;
        this.l0 = sd5Var;
        this.m0 = ub8Var;
        this.n0 = ip5Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new n48(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        bm3 bm3Var;
        n48 n48Var = (n48) jx4Var;
        boolean zC1 = n48Var.c1();
        boolean z = n48Var.s0;
        kd8 kd8Var = n48Var.v0;
        y78 y78Var = n48Var.u0;
        r68 r68Var = n48Var.w0;
        ay6 ay6Var = n48Var.z0;
        boolean z2 = this.X;
        n48Var.s0 = z2;
        r68 r68Var2 = this.h0;
        r68Var2.h = z2;
        boolean z3 = this.Y;
        n48Var.t0 = z3;
        y78 y78Var2 = this.f0;
        n48Var.u0 = y78Var2;
        kd8 kd8Var2 = this.g0;
        n48Var.v0 = kd8Var2;
        n48Var.w0 = r68Var2;
        n48Var.x0 = this.i0;
        n48Var.y0 = this.j0;
        ay6 ay6Var2 = this.k0;
        n48Var.z0 = ay6Var2;
        n48Var.A0 = this.l0;
        ub8 ub8Var = this.m0;
        n48Var.B0 = ub8Var;
        n48Var.C0 = this.n0;
        n48Var.J0.b1(kd8Var2, r68Var2, y78Var2, z2 || z3 || this.Z);
        w38 w38Var = n48Var.K0;
        w38Var.s0.a = null;
        w38Var.s0 = ub8Var;
        ub8Var.a = w38Var;
        ub8Var.b = w38Var.p0 ? tb8.Z : tb8.Y;
        if (!n48Var.c1()) {
            og7 og7Var = n48Var.E0;
            if (og7Var != null) {
                og7Var.m(null);
            }
            n48Var.E0 = null;
            o8 o8Var = n48Var.D0;
            if (o8Var != null && (bm3Var = (bm3) ((AtomicReference) o8Var.Z).getAndSet(null)) != null) {
                bm3Var.m(null);
            }
        } else if (!z || !dh3.f(kd8Var, kd8Var2) || !zC1) {
            n48Var.d1();
        }
        if (dh3.f(kd8Var, kd8Var2) && dh3.f(y78Var, y78Var2) && dh3.f(r68Var, r68Var2) && dh3.f(ay6Var, ay6Var2)) {
            return;
        }
        nr4.E(n48Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j48) {
            j48 j48Var = (j48) obj;
            if (this.X == j48Var.X && this.Y == j48Var.Y && this.Z == j48Var.Z && dh3.f(this.f0, j48Var.f0) && dh3.f(this.g0, j48Var.g0) && this.h0 == j48Var.h0 && dh3.f(this.i0, j48Var.i0) && this.j0 == j48Var.j0 && dh3.f(this.k0, j48Var.k0) && this.l0 == j48Var.l0 && dh3.f(this.m0, j48Var.m0) && dh3.f(this.n0, j48Var.n0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.m0.hashCode() + ((this.l0.hashCode() + ((this.k0.hashCode() + pc6.f((this.i0.hashCode() + ((this.h0.hashCode() + ((this.g0.hashCode() + ((this.f0.hashCode() + pc6.f(pc6.f(Boolean.hashCode(this.X) * 31, 31, this.Y), 31, this.Z)) * 31)) * 31)) * 31)) * 31, 31, this.j0)) * 31)) * 31)) * 31;
        ip5 ip5Var = this.n0;
        return iHashCode + (ip5Var == null ? 0 : ip5Var.hashCode());
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.X + ", isDragHovered=" + this.Y + ", isTouchDragInProgress=" + this.Z + ", textLayoutState=" + this.f0 + ", textFieldState=" + this.g0 + ", textFieldSelectionState=" + this.h0 + ", cursorBrush=" + this.i0 + ", writeable=" + this.j0 + ", scrollState=" + this.k0 + ", orientation=" + this.l0 + ", toolbarRequester=" + this.m0 + ", platformSelectionBehaviors=" + this.n0 + ")";
    }
}
