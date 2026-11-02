package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc70;", "Lqx4;", "Lb70;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c70 extends qx4 {
    public final float X;
    public final fe7 Y;
    public final x67 Z;

    public c70(float f, fe7 fe7Var, x67 x67Var) {
        this.X = f;
        this.Y = fe7Var;
        this.Z = x67Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new b70(this.X, this.Y, this.Z);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        b70 b70Var = (b70) jx4Var;
        float f = b70Var.t0;
        ic0 ic0Var = b70Var.w0;
        float f2 = this.X;
        if (!kt1.b(f, f2)) {
            b70Var.t0 = f2;
            ic0Var.Y0();
        }
        fe7 fe7Var = b70Var.u0;
        fe7 fe7Var2 = this.Y;
        if (!dh3.f(fe7Var, fe7Var2)) {
            b70Var.u0 = fe7Var2;
            ic0Var.Y0();
        }
        x67 x67Var = b70Var.v0;
        x67 x67Var2 = this.Z;
        if (dh3.f(x67Var, x67Var2)) {
            return;
        }
        b70Var.v0 = x67Var2;
        ic0Var.Y0();
        ch3.I(b70Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj;
        return kt1.b(this.X, c70Var.X) && this.Y.equals(c70Var.Y) && dh3.f(this.Z, c70Var.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((this.Y.hashCode() + (Float.hashCode(this.X) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + kt1.c(this.X) + ", brush=" + this.Y + ", shape=" + this.Z + ")";
    }
}
