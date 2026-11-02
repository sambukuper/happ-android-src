package androidx.compose.foundation.layout;

import defpackage.e59;
import defpackage.fp1;
import defpackage.jx4;
import defpackage.pc6;
import defpackage.qx4;
import defpackage.rn2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "Lqx4;", "Le59;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends qx4 {
    public final fp1 X;
    public final rn2 Y;
    public final Object Z;

    public d(fp1 fp1Var, rn2 rn2Var, Object obj) {
        this.X = fp1Var;
        this.Y = rn2Var;
        this.Z = obj;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        e59 e59Var = new e59();
        e59Var.q0 = this.X;
        e59Var.r0 = this.Y;
        return e59Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        e59 e59Var = (e59) jx4Var;
        e59Var.q0 = this.X;
        e59Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.X == dVar.X && this.Z.equals(dVar.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + pc6.f(this.X.hashCode() * 31, 31, false);
    }
}
