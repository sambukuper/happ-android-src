package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly98;", "Lqx4;", "Laa8;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class y98 extends qx4 {
    public final xz4 X;
    public final boolean Y;
    public final wf7 Z;

    public y98(xz4 xz4Var, boolean z, wf7 wf7Var) {
        this.X = xz4Var;
        this.Y = z;
        this.Z = wf7Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        aa8 aa8Var = new aa8();
        aa8Var.q0 = this.X;
        aa8Var.r0 = this.Y;
        aa8Var.s0 = this.Z;
        aa8Var.w0 = Float.NaN;
        aa8Var.x0 = Float.NaN;
        return aa8Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        aa8 aa8Var = (aa8) jx4Var;
        aa8Var.q0 = this.X;
        boolean z = aa8Var.r0;
        boolean z2 = this.Y;
        if (z != z2) {
            nr4.E(aa8Var);
        }
        aa8Var.r0 = z2;
        aa8Var.s0 = this.Z;
        if (aa8Var.v0 == null && !Float.isNaN(aa8Var.x0)) {
            aa8Var.v0 = z51.b(aa8Var.x0);
        }
        if (aa8Var.u0 != null || Float.isNaN(aa8Var.w0)) {
            return;
        }
        aa8Var.u0 = z51.b(aa8Var.w0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y98)) {
            return false;
        }
        y98 y98Var = (y98) obj;
        return dh3.f(this.X, y98Var.X) && this.Y == y98Var.Y && this.Z.equals(y98Var.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + pc6.f(this.X.hashCode() * 31, 31, this.Y);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.X + ", checked=" + this.Y + ", animationSpec=" + this.Z + ')';
    }
}
