package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc34;", "Lqx4;", "Ld34;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class c34 extends qx4 {
    public final Object X;

    public c34(Object obj) {
        this.X = obj;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        d34 d34Var = new d34();
        d34Var.q0 = this.X;
        return d34Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ((d34) jx4Var).q0 = this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c34) && this.X.equals(((c34) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.X + ")";
    }
}
