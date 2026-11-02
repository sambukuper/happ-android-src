package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lph2;", "Lqx4;", "Lrh2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ph2 extends qx4 {
    public final oh2 X;

    public ph2(oh2 oh2Var) {
        this.X = oh2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        rh2 rh2Var = new rh2();
        rh2Var.q0 = this.X;
        return rh2Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        rh2 rh2Var = (rh2) jx4Var;
        rh2Var.q0.a.j(rh2Var);
        oh2 oh2Var = this.X;
        rh2Var.q0 = oh2Var;
        oh2Var.a.b(rh2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph2) && dh3.f(this.X, ((ph2) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.X + ")";
    }
}
