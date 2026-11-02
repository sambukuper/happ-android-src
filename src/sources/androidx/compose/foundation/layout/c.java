package androidx.compose.foundation.layout;

import defpackage.io8;
import defpackage.jx4;
import defpackage.kt1;
import defpackage.qx4;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Lqx4;", "Lio8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends qx4 {
    public final float X;
    public final float Y;

    public c(float f, float f2) {
        this.X = f;
        this.Y = f2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        io8 io8Var = new io8();
        io8Var.q0 = this.X;
        io8Var.r0 = this.Y;
        return io8Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        io8 io8Var = (io8) jx4Var;
        io8Var.q0 = this.X;
        io8Var.r0 = this.Y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kt1.b(this.X, cVar.X) && kt1.b(this.Y, cVar.Y);
    }

    public final int hashCode() {
        return Float.hashCode(this.Y) + (Float.hashCode(this.X) * 31);
    }
}
