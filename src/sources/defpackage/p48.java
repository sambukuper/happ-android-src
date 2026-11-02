package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp48;", "Lqx4;", "Ly48;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p48 extends qx4 {
    public final kd8 X;
    public final y78 Y;
    public final r68 Z;
    public final de3 f0;
    public final boolean g0;
    public final wx3 h0;
    public final boolean i0;
    public final xz4 j0;
    public final w05 k0;

    public p48(kd8 kd8Var, y78 y78Var, r68 r68Var, de3 de3Var, boolean z, wx3 wx3Var, boolean z2, xz4 xz4Var, w05 w05Var) {
        this.X = kd8Var;
        this.Y = y78Var;
        this.Z = r68Var;
        this.f0 = de3Var;
        this.g0 = z;
        this.h0 = wx3Var;
        this.i0 = z2;
        this.j0 = xz4Var;
        this.k0 = w05Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new y48(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        og7 og7Var;
        y48 y48Var = (y48) jx4Var;
        cz7 cz7Var = y48Var.C0;
        ci2 ci2Var = y48Var.B0;
        boolean z = y48Var.w0;
        kd8 kd8Var = y48Var.s0;
        wx3 wx3Var = y48Var.x0;
        r68 r68Var = y48Var.u0;
        xz4 xz4Var = y48Var.z0;
        w05 w05Var = y48Var.A0;
        kd8 kd8Var2 = this.X;
        y48Var.s0 = kd8Var2;
        y48Var.t0 = this.Y;
        r68 r68Var2 = this.Z;
        y48Var.u0 = r68Var2;
        y48Var.v0 = this.f0;
        boolean z2 = this.g0;
        y48Var.w0 = z2;
        wx3 wx3Var2 = this.h0;
        y48Var.x0 = wx3Var2;
        y48Var.y0 = this.i0;
        xz4 xz4Var2 = this.j0;
        y48Var.z0 = xz4Var2;
        w05 w05Var2 = this.k0;
        y48Var.A0 = w05Var2;
        if (z2 != z || !dh3.f(kd8Var2, kd8Var) || !wx3Var2.equals(wx3Var) || !dh3.f(w05Var2, w05Var)) {
            if (z2 && (y48Var.e1() || y48Var.J0 != null)) {
                y48Var.g1(false);
            } else if (!z2) {
                y48Var.c1();
            }
        }
        if (z2 != z || z2 != z || wx3Var2.a() != wx3Var.a()) {
            ch3.I(y48Var);
        }
        if (r68Var2 != r68Var) {
            cz7Var.a1();
            if (y48Var.p0) {
                r68Var2.m = y48Var.K0;
                if (y48Var.e1() && (og7Var = y48Var.G0) != null) {
                    og7Var.m(null);
                    y48Var.G0 = w51.G(y48Var.M0(), null, null, new x48(r68Var2, null, (byte) 0), 3);
                }
            }
            r68Var2.l = new s48(y48Var, (byte) 2);
        }
        if (!dh3.f(xz4Var2, xz4Var)) {
            cz7Var.a1();
            if (ci2Var.p0) {
                ci2Var.d1(xz4Var2);
            }
        }
        if (z2 != z) {
            if (!z2) {
                y48Var.Z0(ci2Var);
            } else {
                y48Var.Y0(ci2Var);
                ci2Var.d1(xz4Var2);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p48) {
            p48 p48Var = (p48) obj;
            if (dh3.f(this.X, p48Var.X) && dh3.f(this.Y, p48Var.Y) && this.Z == p48Var.Z && dh3.f(this.f0, p48Var.f0) && this.g0 == p48Var.g0 && this.h0.equals(p48Var.h0) && this.i0 == p48Var.i0 && dh3.f(this.j0, p48Var.j0) && dh3.f(this.k0, p48Var.k0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.Z.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31)) * 31;
        de3 de3Var = this.f0;
        int iF = pc6.f((this.j0.hashCode() + pc6.f((this.h0.hashCode() + pc6.f(pc6.f((iHashCode + (de3Var == null ? 0 : de3Var.hashCode())) * 31, 31, this.g0), 31, false)) * 961, 31, this.i0)) * 31, 31, false);
        w05 w05Var = this.k0;
        return iF + (w05Var != null ? w05Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.X + ", textLayoutState=" + this.Y + ", textFieldSelectionState=" + this.Z + ", filter=" + this.f0 + ", enabled=" + this.g0 + ", readOnly=false, keyboardOptions=" + this.h0 + ", keyboardActionHandler=null, singleLine=" + this.i0 + ", interactionSource=" + this.j0 + ", isPassword=false, stylusHandwritingTrigger=" + this.k0 + ")";
    }
}
