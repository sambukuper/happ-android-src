package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbn8;", "Lqx4;", "Lcn8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bn8 extends qx4 {
    public final wc2 X;

    public bn8(wc2 wc2Var) {
        this.X = wc2Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        cn8 cn8Var = new cn8();
        cn8Var.s0 = this.X;
        return cn8Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        cn8 cn8Var = (cn8) jx4Var;
        wc2 wc2Var = cn8Var.s0;
        wc2 wc2Var2 = this.X;
        if (wc2Var2.equals(wc2Var)) {
            return;
        }
        cn8Var.s0 = wc2Var2;
        cn8Var.Z0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bn8) {
            return ((bn8) obj).X.equals(this.X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
