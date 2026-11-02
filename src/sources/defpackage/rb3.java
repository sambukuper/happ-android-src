package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrb3;", "Lqx4;", "Lsb3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rb3 extends qx4 {
    public final xz4 X;
    public final tb3 Y;

    public rb3(xz4 xz4Var, tb3 tb3Var) {
        this.X = xz4Var;
        this.Y = tb3Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        nh1 nh1VarA = this.Y.a(this.X);
        sb3 sb3Var = new sb3();
        sb3Var.s0 = nh1VarA;
        sb3Var.Y0(nh1VarA);
        return sb3Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        sb3 sb3Var = (sb3) jx4Var;
        nh1 nh1VarA = this.Y.a(this.X);
        sb3Var.Z0(sb3Var.s0);
        sb3Var.s0 = nh1VarA;
        sb3Var.Y0(nh1VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb3)) {
            return false;
        }
        rb3 rb3Var = (rb3) obj;
        return dh3.f(this.X, rb3Var.X) && dh3.f(this.Y, rb3Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + (this.X.hashCode() * 31);
    }
}
