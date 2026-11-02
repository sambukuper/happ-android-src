package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ed3 extends xi4 {
    @Override // defpackage.xi4
    public final void J0() {
        bj4 bj4Var = this.w0.w0.I0.q;
        bj4Var.getClass();
        bj4Var.m0();
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        zz2 zz2VarV = this.w0.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.g(layoutNode.getOuterCoordinator$ui(), layoutNode.l(), i);
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        zz2 zz2VarV = this.w0.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.d(layoutNode.getOuterCoordinator$ui(), layoutNode.l(), i);
    }

    @Override // defpackage.vi4
    public final int e0(r8 r8Var) {
        bj4 bj4Var = this.w0.w0.I0.q;
        bj4Var.getClass();
        o34 o34Var = bj4Var.u0;
        if (!bj4Var.m0) {
            r34 r34Var = bj4Var.h0;
            if (r34Var.d == k34.Y) {
                o34Var.f = true;
                if (o34Var.b) {
                    r34Var.f = true;
                    r34Var.g = true;
                }
            } else {
                o34Var.g = true;
            }
        }
        ed3 ed3Var = bj4Var.d().f1;
        Boolean boolValueOf = ed3Var != null ? Boolean.valueOf(ed3Var.q0) : null;
        ed3 ed3Var2 = bj4Var.d().f1;
        if (ed3Var2 != null) {
            ed3Var2.q0 = true;
        }
        bj4Var.B();
        ed3 ed3Var3 = bj4Var.d().f1;
        if (ed3Var3 != null) {
            ed3Var3.q0 = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) o34Var.i.get(r8Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.B0.g(iIntValue, r8Var);
        return iIntValue;
    }

    @Override // defpackage.tr4
    public final int k(int i) {
        zz2 zz2VarV = this.w0.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.f(layoutNode.getOuterCoordinator$ui(), layoutNode.l(), i);
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        zz2 zz2VarV = this.w0.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.i(layoutNode.getOuterCoordinator$ui(), layoutNode.l(), i);
    }

    @Override // defpackage.tr4
    public final eo5 o(long j) {
        Z(j);
        i55 i55Var = this.w0;
        c15 c15VarC = i55Var.w0.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            bj4 bj4Var = ((LayoutNode) objArr[i2]).I0.q;
            bj4Var.getClass();
            bj4Var.l0 = m34.Z;
        }
        LayoutNode layoutNode = i55Var.w0;
        N0(layoutNode.y0.c(this, layoutNode.l(), j));
        return this;
    }
}
