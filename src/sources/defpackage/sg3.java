package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsg3;", "Lqx4;", "Ltg3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sg3 extends qx4 {
    @Override // defpackage.qx4
    public final jx4 a() {
        tg3 tg3Var = new tg3((byte) 0);
        tg3Var.r0 = wg3.Y;
        tg3Var.s0 = true;
        return tg3Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        tg3 tg3Var = (tg3) jx4Var;
        tg3Var.r0 = wg3.Y;
        tg3Var.s0 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg3 ? (sg3) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (wg3.Y.hashCode() * 31);
    }
}
