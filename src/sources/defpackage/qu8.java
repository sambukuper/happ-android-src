package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqu8;", "Lqx4;", "Lsu8;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class qu8 extends qx4 {
    public final ce8 X;
    public final sd8 Y;
    public final g22 Z;
    public final h62 f0;
    public final x77 g0;

    public qu8(ce8 ce8Var, sd8 sd8Var, g22 g22Var, h62 h62Var, x77 x77Var) {
        this.X = ce8Var;
        this.Y = sd8Var;
        this.Z = g22Var;
        this.f0 = h62Var;
        this.g0 = x77Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        su8 su8Var = new su8();
        su8Var.q0 = this.Y;
        su8Var.r0 = this.Z;
        su8Var.s0 = this.f0;
        su8Var.t0 = this.g0;
        return su8Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        su8 su8Var = (su8) jx4Var;
        su8Var.getClass();
        su8Var.q0 = this.Y;
        su8Var.r0 = this.Z;
        su8Var.s0 = this.f0;
        su8Var.t0 = this.g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qu8) {
            qu8 qu8Var = (qu8) obj;
            return this.X == qu8Var.X && dh3.f(this.Y, qu8Var.Y) && this.Z.equals(qu8Var.Z) && dh3.f(this.f0, qu8Var.f0) && this.g0 == qu8Var.g0;
        }
        return false;
    }

    public final int hashCode() {
        return this.g0.hashCode() + ((this.f0.a.hashCode() + ((this.Z.a.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.X + ", veilAnimation=" + this.Y + ", enter=" + this.Z + ", exit=" + this.f0 + ", mutableTransformState=" + this.g0 + ")";
    }
}
