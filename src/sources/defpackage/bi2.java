package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbi2;", "Lqx4;", "Lci2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bi2 extends qx4 {
    public final xz4 X;

    public bi2(xz4 xz4Var) {
        this.X = xz4Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new ci2(this.X, (t48) null, 6);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((ci2) jx4Var).d1(this.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bi2) {
            return dh3.f(this.X, ((bi2) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        xz4 xz4Var = this.X;
        if (xz4Var != null) {
            return xz4Var.hashCode();
        }
        return 0;
    }
}
