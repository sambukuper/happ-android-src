package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf13;", "Lqx4;", "Lj13;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f13 extends qx4 {
    public final xz4 X;

    public f13(xz4 xz4Var) {
        this.X = xz4Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        j13 j13Var = new j13();
        j13Var.q0 = this.X;
        return j13Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        j13 j13Var = (j13) jx4Var;
        xz4 xz4Var = j13Var.q0;
        xz4 xz4Var2 = this.X;
        if (dh3.f(xz4Var, xz4Var2)) {
            return;
        }
        j13Var.a1();
        j13Var.q0 = xz4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f13) && dh3.f(((f13) obj).X, this.X);
    }

    public final int hashCode() {
        return this.X.hashCode() * 31;
    }
}
