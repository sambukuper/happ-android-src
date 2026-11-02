package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldq5;", "Lqx4;", "Leq5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class dq5 extends qx4 {
    public final sf X;

    public dq5(sf sfVar) {
        this.X = sfVar;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new eq5(this.X, null);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        eq5 eq5Var = (eq5) jx4Var;
        sf sfVar = eq5Var.r0;
        sf sfVar2 = this.X;
        if (dh3.f(sfVar, sfVar2)) {
            return;
        }
        eq5Var.r0 = sfVar2;
        if (eq5Var.s0) {
            eq5Var.a1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq5) && this.X.equals(((dq5) obj).X);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.X + ", overrideDescendants=false)";
    }
}
