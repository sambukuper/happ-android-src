package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo97;", "Lqx4;", "Lp97;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class o97 extends qx4 {
    public final x67 X;
    public final s67 Y;

    public o97(x67 x67Var, s67 s67Var) {
        this.X = x67Var;
        this.Y = s67Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        p97 p97Var = new p97();
        p97Var.q0 = this.X;
        p97Var.r0 = this.Y;
        return p97Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        p97 p97Var = (p97) jx4Var;
        x67 x67Var = p97Var.q0;
        x67 x67Var2 = this.X;
        boolean zF = dh3.f(x67Var, x67Var2);
        s67 s67Var = this.Y;
        if (!zF || !dh3.f(p97Var.r0, s67Var)) {
            p97Var.s0 = null;
        }
        p97Var.q0 = x67Var2;
        p97Var.r0 = s67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o97)) {
            return false;
        }
        o97 o97Var = (o97) obj;
        return dh3.f(this.X, o97Var.X) && this.Y.equals(o97Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.X + ", shadow=" + this.Y + ")";
    }
}
