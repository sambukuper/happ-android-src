package defpackage;

import androidx.compose.ui.node.LayoutNode;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i34 extends i55 {
    public static final df g1;
    public g34 e1;
    public h34 f1;

    static {
        df dfVarC = u15.c();
        int i = dw0.h;
        dfVarC.f(dw0.e);
        dfVarC.l(1.0f);
        dfVarC.m(1);
        g1 = dfVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i34(LayoutNode layoutNode, g34 g34Var) {
        super(layoutNode);
        this.e1 = g34Var;
        this.f1 = layoutNode.k0 != null ? new h34(this) : null;
        if ((((jx4) g34Var).X.Z & 512) == 0) {
            return;
        }
        c2.m();
        throw null;
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        g34 g34Var = this.e1;
        i55 i55Var = this.x0;
        i55Var.getClass();
        return g34Var.y0(this, i55Var, i);
    }

    @Override // defpackage.i55
    public final void Q0() {
        if (this.f1 == null) {
            this.f1 = new h34(this);
        }
    }

    @Override // defpackage.eo5
    public final void S(long j, float f, gn2 gn2Var) {
        m1(j, f, gn2Var, null);
        w1();
    }

    @Override // defpackage.i55, defpackage.eo5
    public final void T(long j, float f, xt2 xt2Var) {
        m1(j, f, null, xt2Var);
        w1();
    }

    @Override // defpackage.i55
    public final xi4 T0() {
        return this.f1;
    }

    @Override // defpackage.i55
    public final jx4 V0() {
        return ((jx4) this.e1).X;
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        g34 g34Var = this.e1;
        i55 i55Var = this.x0;
        i55Var.getClass();
        return g34Var.J0(this, i55Var, i);
    }

    @Override // defpackage.vi4
    public final int e0(r8 r8Var) {
        h34 h34Var = this.f1;
        if (h34Var == null) {
            return km4.o(this, r8Var);
        }
        f05 f05Var = h34Var.B0;
        int iD = f05Var.d(r8Var);
        if (iD >= 0) {
            return f05Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.tr4
    public final int k(int i) {
        g34 g34Var = this.e1;
        i55 i55Var = this.x0;
        i55Var.getClass();
        return g34Var.m0(this, i55Var, i);
    }

    @Override // defpackage.i55
    public final void l1(sm0 sm0Var, xt2 xt2Var) {
        i55 i55Var;
        i55 i55Var2 = this.x0;
        i55Var2.getClass();
        i55Var2.O0(sm0Var, xt2Var);
        if (!q34.a(this.w0).getShowLayoutBounds() || (i55Var = this.x0) == null) {
            return;
        }
        if (pf3.a(this.Z, i55Var.Z) && hf3.a(i55Var.H0, 0L)) {
            return;
        }
        long j = this.Z;
        sm0Var.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, g1);
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        g34 g34Var = this.e1;
        i55 i55Var = this.x0;
        i55Var.getClass();
        return g34Var.i0(this, i55Var, i);
    }

    @Override // defpackage.tr4
    public final eo5 o(long j) {
        Z(j);
        g34 g34Var = this.e1;
        i55 i55Var = this.x0;
        i55Var.getClass();
        p1(g34Var.K(this, i55Var, j));
        g1();
        return this;
    }

    public final void w1() {
        if (this.p0) {
            return;
        }
        h1();
        i55 i55Var = this.x0;
        i55Var.getClass();
        boolean z = i55Var.q0;
        i55Var.q0 = this.q0;
        s0().d();
        i55Var.q0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(g34 g34Var) {
        if (g34Var.equals(this.e1) || (((jx4) g34Var).X.Z & 512) == 0) {
            this.e1 = g34Var;
        } else {
            c2.m();
        }
    }
}
