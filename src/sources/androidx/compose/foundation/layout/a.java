package androidx.compose.foundation.layout;

import defpackage.jx4;
import defpackage.kt1;
import defpackage.pc6;
import defpackage.qx4;
import defpackage.za7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Lqx4;", "Lza7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends qx4 {
    public final float X;
    public final float Y;
    public final float Z;
    public final float f0;
    public final boolean g0;

    public a(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        za7 za7Var = new za7();
        za7Var.q0 = this.X;
        za7Var.r0 = this.Y;
        za7Var.s0 = this.Z;
        za7Var.t0 = this.f0;
        za7Var.u0 = this.g0;
        return za7Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        za7 za7Var = (za7) jx4Var;
        za7Var.q0 = this.X;
        za7Var.r0 = this.Y;
        za7Var.s0 = this.Z;
        za7Var.t0 = this.f0;
        za7Var.u0 = this.g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kt1.b(this.X, aVar.X) && kt1.b(this.Y, aVar.Y) && kt1.b(this.Z, aVar.Z) && kt1.b(this.f0, aVar.f0) && this.g0 == aVar.g0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g0) + pc6.d(pc6.d(pc6.d(Float.hashCode(this.X) * 31, this.Y, 31), this.Z, 31), this.f0, 31);
    }

    public a(float f, float f2, float f3, float f4, boolean z) {
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.f0 = f4;
        this.g0 = z;
    }
}
