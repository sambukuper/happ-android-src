package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld44;", "Lqx4;", "Le44;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d44 extends qx4 {
    public final float X;
    public final boolean Y;

    public d44(float f, boolean z) {
        this.X = f;
        this.Y = z;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        e44 e44Var = new e44();
        e44Var.q0 = this.X;
        e44Var.r0 = this.Y;
        return e44Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        e44 e44Var = (e44) jx4Var;
        e44Var.q0 = this.X;
        e44Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d44 d44Var = obj instanceof d44 ? (d44) obj : null;
        return d44Var != null && this.X == d44Var.X && this.Y == d44Var.Y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y) + (Float.hashCode(this.X) * 31);
    }
}
