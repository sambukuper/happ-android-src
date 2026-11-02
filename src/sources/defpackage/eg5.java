package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leg5;", "Lqx4;", "Lfg5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class eg5 extends qx4 {
    public final float X;
    public final float Y;
    public final float Z;
    public final float f0;

    public eg5(float f, float f2, float f3, float f4) {
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.f0 = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            uc3.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        fg5 fg5Var = new fg5();
        fg5Var.q0 = this.X;
        fg5Var.r0 = this.Y;
        fg5Var.s0 = this.Z;
        fg5Var.t0 = this.f0;
        fg5Var.u0 = true;
        return fg5Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        fg5 fg5Var = (fg5) jx4Var;
        fg5Var.q0 = this.X;
        fg5Var.r0 = this.Y;
        fg5Var.s0 = this.Z;
        fg5Var.t0 = this.f0;
        fg5Var.u0 = true;
    }

    public final boolean equals(Object obj) {
        eg5 eg5Var = obj instanceof eg5 ? (eg5) obj : null;
        return eg5Var != null && kt1.b(this.X, eg5Var.X) && kt1.b(this.Y, eg5Var.Y) && kt1.b(this.Z, eg5Var.Z) && kt1.b(this.f0, eg5Var.f0);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + pc6.d(pc6.d(pc6.d(Float.hashCode(this.X) * 31, this.Y, 31), this.Z, 31), this.f0, 31);
    }
}
