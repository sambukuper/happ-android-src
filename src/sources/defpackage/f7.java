package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf7;", "Lqx4;", "Lg7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f7 extends qx4 {
    public final d67 X;

    public f7(d67 d67Var) {
        this.X = d67Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        g7 g7Var = new g7();
        g7Var.s0 = this.X;
        y0 y0Var = new y0((Object) g7Var, (byte) 2);
        e7 e7Var = new e7();
        e7Var.q0 = y0Var;
        g7Var.Y0(e7Var);
        return g7Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((g7) jx4Var).s0 = this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f7) {
            return this.X == ((f7) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
