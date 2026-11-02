package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La78;", "Lqx4;", "Lb78;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a78 extends qx4 {
    public final y78 X;
    public final kd8 Y;
    public final o88 Z;
    public final boolean f0;
    public final wx3 g0;

    public a78(y78 y78Var, kd8 kd8Var, o88 o88Var, boolean z, wx3 wx3Var) {
        this.X = y78Var;
        this.Y = kd8Var;
        this.Z = o88Var;
        this.f0 = z;
        this.g0 = wx3Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new b78(this.X, this.Y, this.Z, this.f0, this.g0);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        b78 b78Var = (b78) jx4Var;
        y78 y78Var = b78Var.s0;
        y78 y78Var2 = this.X;
        b78Var.s0 = y78Var2;
        y78Var2.getClass();
        boolean z = this.f0;
        b78Var.t0 = z;
        y78Var2.a.X.setValue(new t58(this.Y, this.Z, z, !z, this.g0.c == 4));
        if (dh3.f(y78Var, y78Var2)) {
            return;
        }
        r80 r80Var = b78Var.u0;
        q80 q80Var = y78Var2.g;
        q80 q80Var2 = r80Var.q0;
        if (q80Var2 != null) {
            q80Var2.a.j(r80Var);
        }
        q80Var.a.b(r80Var);
        r80Var.q0 = q80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a78)) {
            return false;
        }
        a78 a78Var = (a78) obj;
        return this.f0 == a78Var.f0 && dh3.f(this.X, a78Var.X) && dh3.f(this.Y, a78Var.Y) && dh3.f(this.Z, a78Var.Z) && this.g0.equals(a78Var.g0);
    }

    public final int hashCode() {
        return this.g0.hashCode() + pc6.g(this.Z, (this.Y.hashCode() + ((this.X.hashCode() + (Boolean.hashCode(this.f0) * 31)) * 31)) * 31, 961);
    }
}
