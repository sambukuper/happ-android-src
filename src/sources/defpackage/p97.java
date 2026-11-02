package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p97 extends jx4 implements rv1, w85 {
    public x67 q0;
    public s67 r0;
    public DropShadowPainter s0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p97)) {
            return false;
        }
        p97 p97Var = (p97) obj;
        return dh3.f(this.q0, p97Var.q0) && dh3.f(this.r0, p97Var.r0);
    }

    public final int hashCode() {
        return this.r0.hashCode() + (this.q0.hashCode() * 31);
    }

    @Override // defpackage.w85
    public final void q0() {
        this.s0 = null;
        z68.W(this);
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        DropShadowPainter dropShadowPainter;
        DropShadowPainter dropShadowPainter2 = this.s0;
        if (dropShadowPainter2 == null) {
            dq dqVarB = yn0.a0(this).getGraphicsContext().b();
            x67 x67Var = this.q0;
            s67 s67Var = this.r0;
            dqVarB.getClass();
            DropShadowPainter dropShadowPainter3 = new DropShadowPainter(x67Var, s67Var, dqVarB);
            this.s0 = dropShadowPainter3;
            dropShadowPainter = dropShadowPainter3;
        } else {
            dropShadowPainter = dropShadowPainter2;
        }
        dropShadowPainter.g(p34Var, p34Var.X.e(), 1.0f, null);
        p34Var.a();
    }
}
