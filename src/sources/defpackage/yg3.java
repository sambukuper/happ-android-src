package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyg3;", "Lqx4;", "Lah3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yg3 extends qx4 {
    @Override // defpackage.qx4
    public final jx4 a() {
        ah3 ah3Var = new ah3((byte) 0);
        ah3Var.r0 = wg3.Y;
        ah3Var.s0 = true;
        return ah3Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        ah3 ah3Var = (ah3) jx4Var;
        ah3Var.r0 = wg3.Y;
        ah3Var.s0 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg3 ? (yg3) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (wg3.Y.hashCode() * 31);
    }
}
