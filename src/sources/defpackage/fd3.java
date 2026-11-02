package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fd3 extends i55 {
    public static final df g1;
    public final f18 e1;
    public ed3 f1;

    static {
        df dfVarC = u15.c();
        int i = dw0.h;
        dfVarC.f(dw0.d);
        dfVarC.l(1.0f);
        dfVarC.m(1);
        g1 = dfVarC;
    }

    public fd3(LayoutNode layoutNode) {
        super(layoutNode);
        f18 f18Var = new f18();
        f18Var.f0 = 0;
        this.e1 = f18Var;
        f18Var.j0 = this;
        this.f1 = layoutNode.k0 != null ? new ed3(this) : null;
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        zz2 zz2VarV = this.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.g(layoutNode.getOuterCoordinator$ui(), layoutNode.m(), i);
    }

    @Override // defpackage.i55
    public final void Q0() {
        if (this.f1 == null) {
            this.f1 = new ed3(this);
        }
    }

    @Override // defpackage.eo5
    public final void S(long j, float f, gn2 gn2Var) {
        m1(j, f, gn2Var, null);
        if (this.p0) {
            return;
        }
        this.w0.I0.p.l0();
    }

    @Override // defpackage.i55
    public final xi4 T0() {
        return this.f1;
    }

    @Override // defpackage.i55
    public final jx4 V0() {
        return this.e1;
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        zz2 zz2VarV = this.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.d(layoutNode.getOuterCoordinator$ui(), layoutNode.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.i55
    public final void c1(h55 h55Var, long j, q03 q03Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        LayoutNode layoutNode;
        long jA;
        LayoutNode layoutNode2 = this.w0;
        boolean z3 = false;
        if (h55Var.n(layoutNode2)) {
            if (!v1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(N0(j, U0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = q03Var.Z;
                    c15 c15VarB = layoutNode2.B();
                    objArr = c15VarB.X;
                    i3 = c15VarB.Z - 1;
                    while (i3 >= 0) {
                        layoutNode = (LayoutNode) objArr[i3];
                        if (layoutNode.L()) {
                            h55Var.h(layoutNode, j, q03Var, i2, z2);
                            jA = q03Var.a();
                            if (w45.K(jA) >= 0.0f && w45.O(jA) && !w45.N(jA) && !h55Var.l(q03Var, layoutNode)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    q03Var.Z = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = q03Var.Z;
                c15 c15VarB2 = layoutNode2.B();
                objArr = c15VarB2.X;
                i3 = c15VarB2.Z - 1;
                while (i3 >= 0) {
                    layoutNode = (LayoutNode) objArr[i3];
                    if (layoutNode.L()) {
                        h55Var.h(layoutNode, j, q03Var, i2, z2);
                        jA = q03Var.a();
                        if (w45.K(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                q03Var.Z = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = q03Var.Z;
            c15 c15VarB3 = layoutNode2.B();
            objArr = c15VarB3.X;
            i3 = c15VarB3.Z - 1;
            while (i3 >= 0) {
                layoutNode = (LayoutNode) objArr[i3];
                if (layoutNode.L()) {
                    h55Var.h(layoutNode, j, q03Var, i2, z2);
                    jA = q03Var.a();
                    if (w45.K(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            q03Var.Z = i6;
        }
    }

    @Override // defpackage.vi4
    public final int e0(r8 r8Var) {
        ed3 ed3Var = this.f1;
        if (ed3Var != null) {
            return ed3Var.e0(r8Var);
        }
        wr4 wr4Var = this.w0.I0.p;
        o34 o34Var = wr4Var.A0;
        if (!wr4Var.o0) {
            if (wr4Var.h0.d == k34.X) {
                o34Var.f = true;
                if (o34Var.b) {
                    wr4Var.y0 = true;
                    wr4Var.z0 = true;
                }
            } else {
                o34Var.g = true;
            }
        }
        fd3 fd3VarD = wr4Var.d();
        boolean z = fd3VarD.q0;
        fd3VarD.q0 = true;
        wr4Var.B();
        fd3VarD.q0 = z;
        Integer num = (Integer) o34Var.i.get(r8Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.tr4
    public final int k(int i) {
        zz2 zz2VarV = this.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.f(layoutNode.getOuterCoordinator$ui(), layoutNode.m(), i);
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        zz2 zz2VarV = this.w0.v();
        xr4 xr4VarM0 = zz2VarV.m0();
        LayoutNode layoutNode = (LayoutNode) zz2VarV.Y;
        return xr4VarM0.i(layoutNode.getOuterCoordinator$ui(), layoutNode.m(), i);
    }

    @Override // defpackage.tr4
    public final eo5 o(long j) {
        Z(j);
        LayoutNode layoutNode = this.w0;
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).I0.p.n0 = m34.Z;
        }
        p1(layoutNode.y0.c(this, layoutNode.m(), j));
        g1();
        return this;
    }
}
