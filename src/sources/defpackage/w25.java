package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw25;", "Lqx4;", "Lz25;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w25 extends qx4 {
    public final t25 X;

    public w25(t25 t25Var) {
        this.X = t25Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new z25(this.X, null);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        z25 z25Var = (z25) jx4Var;
        z25Var.q0 = this.X;
        z47 z47Var = z25Var.r0;
        if (((z25) z47Var.Y) == z25Var) {
            z47Var.Y = null;
            z47Var.g0 = null;
            z47Var.f0 = zc1.b;
        }
        z47 z47Var2 = new z47((byte) 25);
        z25Var.r0 = z47Var2;
        if (z25Var.p0) {
            z47Var2.Y = z25Var;
            z47Var2.Z = null;
            z25Var.s0 = null;
            z47Var2.f0 = new tb2(z25Var, (byte) 24);
            z47Var2.g0 = z25Var.M0();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w25) && dh3.f(((w25) obj).X, this.X);
    }

    public final int hashCode() {
        return this.X.hashCode() * 31;
    }
}
