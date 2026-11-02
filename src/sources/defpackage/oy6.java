package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loy6;", "Lqx4;", "Lvx6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oy6 extends qx4 {
    public final ay6 X;

    public oy6(ay6 ay6Var) {
        this.X = ay6Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        vx6 vx6Var = new vx6();
        vx6Var.q0 = this.X;
        vx6Var.r0 = true;
        return vx6Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        vx6 vx6Var = (vx6) jx4Var;
        vx6Var.q0 = this.X;
        vx6Var.r0 = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oy6) {
            return dh3.f(this.X, ((oy6) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + pc6.f(this.X.hashCode() * 31, 31, false);
    }
}
