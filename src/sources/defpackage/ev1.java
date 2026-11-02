package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lev1;", "T", "Lqx4;", "Lfv1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ev1<T> extends qx4 {
    public final t5 X;
    public final rn2 Y;

    public ev1(t5 t5Var, rn2 rn2Var) {
        this.X = t5Var;
        this.Y = rn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        fv1 fv1Var = new fv1();
        fv1Var.q0 = this.X;
        fv1Var.r0 = this.Y;
        fv1Var.s0 = sd5.X;
        return fv1Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        fv1 fv1Var = (fv1) jx4Var;
        fv1Var.q0 = this.X;
        fv1Var.r0 = this.Y;
        fv1Var.s0 = sd5.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev1)) {
            return false;
        }
        ev1 ev1Var = (ev1) obj;
        return dh3.f(this.X, ev1Var.X) && this.Y == ev1Var.Y;
    }

    public final int hashCode() {
        return sd5.X.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31);
    }
}
