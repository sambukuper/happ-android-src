package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh79;", "Lqx4;", "Lj79;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h79 extends qx4 {
    public final float X;
    public final Object Y;

    public h79(Object obj, float f) {
        this.X = f;
        this.Y = obj;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        j79 j79Var = new j79();
        j79Var.q0 = this.X;
        j79Var.r0 = this.Y;
        return j79Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        j79 j79Var = (j79) jx4Var;
        j79Var.q0 = this.X;
        j79Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h79)) {
            return false;
        }
        h79 h79Var = (h79) obj;
        return h79Var.X == this.X && dh3.f(h79Var.Y, this.Y);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.X) * 31;
        Object obj = this.Y;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
