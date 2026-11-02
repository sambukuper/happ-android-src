package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lub3;", "Lqx4;", "Lwb3;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ub3 extends qx4 {
    public final boolean X;
    public final boolean Y;
    public final xz4 Z;
    public final i48 f0;
    public final x67 g0;
    public final float h0;
    public final float i0;

    public ub3(boolean z, boolean z2, xz4 xz4Var, i48 i48Var, x67 x67Var, float f, float f2) {
        this.X = z;
        this.Y = z2;
        this.Z = xz4Var;
        this.f0 = i48Var;
        this.g0 = x67Var;
        this.h0 = f;
        this.i0 = f2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new wb3(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        wb3 wb3Var = (wb3) jx4Var;
        boolean z2 = wb3Var.s0;
        boolean z3 = this.X;
        boolean z4 = true;
        if (z2 != z3) {
            wb3Var.s0 = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = wb3Var.t0;
        boolean z6 = this.Y;
        if (z5 != z6) {
            wb3Var.t0 = z6;
            z = true;
        }
        xz4 xz4Var = wb3Var.u0;
        xz4 xz4Var2 = this.Z;
        if (xz4Var != xz4Var2) {
            wb3Var.u0 = xz4Var2;
            og7 og7Var = wb3Var.y0;
            q51 q51Var = null;
            if (og7Var != null) {
                og7Var.m(null);
            }
            wb3Var.y0 = w51.G(wb3Var.M0(), null, null, new vb3(wb3Var, q51Var, (byte) 3), 3);
        }
        i48 i48Var = wb3Var.z0;
        i48 i48Var2 = this.f0;
        if (!dh3.f(i48Var, i48Var2)) {
            wb3Var.z0 = i48Var2;
            z = true;
        }
        x67 x67Var = wb3Var.B0;
        x67 x67Var2 = this.g0;
        if (!dh3.f(x67Var, x67Var2)) {
            if (!dh3.f(wb3Var.B0, x67Var2)) {
                wb3Var.B0 = x67Var2;
                wb3Var.D0.Y0();
            }
            z = true;
        }
        float f = wb3Var.v0;
        float f2 = this.h0;
        if (!kt1.b(f, f2)) {
            wb3Var.v0 = f2;
            z = true;
        }
        float f3 = wb3Var.w0;
        float f4 = this.i0;
        if (kt1.b(f3, f4)) {
            z4 = z;
        } else {
            wb3Var.w0 = f4;
        }
        if (z4) {
            wb3Var.b1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub3)) {
            return false;
        }
        ub3 ub3Var = (ub3) obj;
        return this.X == ub3Var.X && this.Y == ub3Var.Y && dh3.f(this.Z, ub3Var.Z) && this.f0.equals(ub3Var.f0) && dh3.f(this.g0, ub3Var.g0) && kt1.b(this.h0, ub3Var.h0) && kt1.b(this.i0, ub3Var.i0);
    }

    public final int hashCode() {
        int iHashCode = (this.f0.hashCode() + ((this.Z.hashCode() + pc6.f(Boolean.hashCode(this.X) * 31, 31, this.Y)) * 31)) * 31;
        x67 x67Var = this.g0;
        return Float.hashCode(this.i0) + pc6.d((iHashCode + (x67Var == null ? 0 : x67Var.hashCode())) * 31, this.h0, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.X + ", isError=" + this.Y + ", interactionSource=" + this.Z + ", colors=" + this.f0 + ", textFieldShape=" + this.g0 + ", focusedIndicatorLineThickness=" + ((Object) kt1.c(this.h0)) + ", unfocusedIndicatorLineThickness=" + ((Object) kt1.c(this.i0)) + ')';
    }
}
