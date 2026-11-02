package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqs;", "Lqx4;", "Ll61;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qs extends qx4 implements ix4 {
    public final boolean X;
    public final gn2 Y;

    public qs(boolean z, gn2 gn2Var) {
        this.X = z;
        this.Y = gn2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new l61(this.X, false, this.Y);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        l61 l61Var = (l61) jx4Var;
        l61Var.q0 = this.X;
        l61Var.s0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        return this.X == qsVar.X && this.Y == qsVar.Y;
    }

    public final int hashCode() {
        return this.Y.hashCode() + (Boolean.hashCode(this.X) * 31);
    }
}
