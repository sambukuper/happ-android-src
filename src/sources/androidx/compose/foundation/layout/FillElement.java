package androidx.compose.foundation.layout;

import defpackage.fa2;
import defpackage.fp1;
import defpackage.jx4;
import defpackage.qx4;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lqx4;", "Lfa2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FillElement extends qx4 {
    public final fp1 X;

    public FillElement(fp1 fp1Var) {
        this.X = fp1Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        fa2 fa2Var = new fa2();
        fa2Var.q0 = this.X;
        fa2Var.r0 = 1.0f;
        return fa2Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        fa2 fa2Var = (fa2) jx4Var;
        fa2Var.q0 = this.X;
        fa2Var.r0 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.X == ((FillElement) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.X.hashCode() * 31);
    }
}
