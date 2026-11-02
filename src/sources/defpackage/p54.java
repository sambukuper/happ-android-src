package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp54;", "Lqx4;", "Lq54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p54 extends qx4 {
    public final sg8 X;
    public final wf7 Y;
    public final sg8 Z;

    public p54(sg8 sg8Var, wf7 wf7Var, sg8 sg8Var2) {
        this.X = sg8Var;
        this.Y = wf7Var;
        this.Z = sg8Var2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        q54 q54Var = new q54();
        q54Var.q0 = this.X;
        q54Var.r0 = this.Y;
        q54Var.s0 = this.Z;
        return q54Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        q54 q54Var = (q54) jx4Var;
        q54Var.q0 = this.X;
        q54Var.r0 = this.Y;
        q54Var.s0 = this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p54)) {
            return false;
        }
        p54 p54Var = (p54) obj;
        return this.X.equals(p54Var.X) && this.Y.equals(p54Var.Y) && this.Z.equals(p54Var.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.X + ", placementSpec=" + this.Y + ", fadeOutSpec=" + this.Z + ")";
    }
}
