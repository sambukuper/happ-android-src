package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo80;", "Lqx4;", "Lr80;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o80 extends qx4 {
    public final q80 X;

    public o80(q80 q80Var) {
        this.X = q80Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new r80(this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        r80 r80Var = (r80) jx4Var;
        q80 q80Var = r80Var.q0;
        if (q80Var != null) {
            q80Var.a.j(r80Var);
        }
        q80 q80Var2 = this.X;
        if (q80Var2 != null) {
            q80Var2.a.b(r80Var);
        }
        r80Var.q0 = q80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o80) {
            return dh3.f(this.X, ((o80) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
