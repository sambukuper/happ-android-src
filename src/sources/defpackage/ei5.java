package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lei5;", "Lqx4;", "Ldi5;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ei5 extends qx4 {
    public final sn X;

    public ei5(sn snVar) {
        this.X = snVar;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        di5 di5Var = new di5();
        di5Var.q0 = this.X;
        return di5Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        di5 di5Var = (di5) jx4Var;
        di5Var.q0 = this.X;
        ch3.I(di5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ei5) {
            return this.X == ((ei5) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
