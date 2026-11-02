package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bj4 extends eo5 implements tr4, v8, jy4 {
    public Object A0;
    public final zi4 C0;
    public final zi4 D0;
    public boolean E0;
    public final r34 h0;
    public boolean i0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public q31 p0;
    public gn2 r0;
    public xt2 s0;
    public boolean x0;
    public final zi4 y0;
    public int j0 = Integer.MAX_VALUE;
    public int k0 = Integer.MAX_VALUE;
    public m34 l0 = m34.Z;
    public long q0 = 0;
    public aj4 t0 = aj4.Z;
    public final o34 u0 = new o34(this, (byte) 1);
    public final c15 v0 = new c15(0, new bj4[16]);
    public boolean w0 = true;
    public boolean z0 = true;
    public long B0 = s31.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [zi4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zi4] */
    /* JADX WARN: Type inference failed for: r5v5, types: [zi4] */
    public bj4(r34 r34Var) {
        this.h0 = r34Var;
        final byte b = 1;
        final byte b2 = 0;
        this.y0 = new dn2(this) { // from class: zi4
            public final /* synthetic */ bj4 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                xi4 xi4VarT0;
                byte b3 = b2;
                dn8 dn8Var = dn8.a;
                j05 j05Var = null;
                placementScope = null;
                placementScope = null;
                do5 placementScope = null;
                bj4 bj4Var = this.Y;
                switch (b3) {
                    case 0:
                        r34 r34Var2 = bj4Var.h0;
                        r34Var2.h = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            bj4 bj4Var2 = ((LayoutNode) objArr[i2]).I0.q;
                            bj4Var2.getClass();
                            bj4Var2.j0 = bj4Var2.k0;
                            bj4Var2.k0 = Integer.MAX_VALUE;
                            if (bj4Var2.l0 == m34.Y) {
                                bj4Var2.l0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            bj4 bj4Var3 = ((LayoutNode) objArr2[i4]).I0.q;
                            bj4Var3.getClass();
                            bj4Var3.u0.d = false;
                        }
                        ed3 ed3Var = bj4Var.d().f1;
                        if (ed3Var == null) {
                            bt.i("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            xi4 xi4VarT1 = layoutNode2.getOuterCoordinator$ui().T0();
                            if (xi4VarT1 != null) {
                                if (xi4VarT1.q0) {
                                    if (j05Var == null) {
                                        j05Var = new j05();
                                    }
                                    j05Var.a(layoutNode2);
                                }
                                xi4VarT1.q0 = ed3Var.q0;
                            }
                        }
                        ed3Var.s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                c15 c15VarC3 = layoutNode.C();
                                Object[] objArr3 = c15VarC3.X;
                                int i7 = c15VarC3.Z;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bj4 bj4Var4 = ((LayoutNode) objArr3[i8]).I0.q;
                                    bj4Var4.getClass();
                                    int i9 = bj4Var4.j0;
                                    int i10 = bj4Var4.k0;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        bj4Var4.e0(true);
                                    }
                                }
                                c15 c15VarC4 = layoutNode.C();
                                Object[] objArr4 = c15VarC4.X;
                                int i11 = c15VarC4.Z;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    bj4 bj4Var5 = ((LayoutNode) objArr4[i12]).I0.q;
                                    bj4Var5.getClass();
                                    o34 o34Var = bj4Var5.u0;
                                    o34Var.e = o34Var.d;
                                }
                                return dn8Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = j05Var != null && j05Var.e(layoutNode3);
                            xi4 xi4VarT2 = layoutNode3.getOuterCoordinator$ui().T0();
                            if (xi4VarT2 != null) {
                                xi4VarT2.q0 = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        xi4 xi4VarT3 = bj4Var.h0.a().T0();
                        xi4VarT3.getClass();
                        xi4VarT3.o(bj4Var.B0);
                        return dn8Var;
                    default:
                        r34 r34Var3 = bj4Var.h0;
                        if (os4.t(r34Var3.a) || r34Var3.c) {
                            i55 i55Var = r34Var3.a().y0;
                            if (i55Var != null) {
                                placementScope = i55Var.r0;
                            }
                        } else {
                            i55 i55Var2 = r34Var3.a().y0;
                            if (i55Var2 != null && (xi4VarT0 = i55Var2.T0()) != null) {
                                placementScope = xi4VarT0.r0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = q34.a(r34Var3.a).getPlacementScope();
                        }
                        xi4 xi4VarT4 = r34Var3.a().T0();
                        xi4VarT4.getClass();
                        do5.g(placementScope, xi4VarT4, bj4Var.q0);
                        return dn8Var;
                }
            }
        };
        this.A0 = r34Var.p.u0;
        this.C0 = new dn2(this) { // from class: zi4
            public final /* synthetic */ bj4 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                xi4 xi4VarT0;
                byte b3 = b;
                dn8 dn8Var = dn8.a;
                j05 j05Var = null;
                placementScope = null;
                placementScope = null;
                do5 placementScope = null;
                bj4 bj4Var = this.Y;
                switch (b3) {
                    case 0:
                        r34 r34Var2 = bj4Var.h0;
                        r34Var2.h = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            bj4 bj4Var2 = ((LayoutNode) objArr[i2]).I0.q;
                            bj4Var2.getClass();
                            bj4Var2.j0 = bj4Var2.k0;
                            bj4Var2.k0 = Integer.MAX_VALUE;
                            if (bj4Var2.l0 == m34.Y) {
                                bj4Var2.l0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            bj4 bj4Var3 = ((LayoutNode) objArr2[i4]).I0.q;
                            bj4Var3.getClass();
                            bj4Var3.u0.d = false;
                        }
                        ed3 ed3Var = bj4Var.d().f1;
                        if (ed3Var == null) {
                            bt.i("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            xi4 xi4VarT1 = layoutNode2.getOuterCoordinator$ui().T0();
                            if (xi4VarT1 != null) {
                                if (xi4VarT1.q0) {
                                    if (j05Var == null) {
                                        j05Var = new j05();
                                    }
                                    j05Var.a(layoutNode2);
                                }
                                xi4VarT1.q0 = ed3Var.q0;
                            }
                        }
                        ed3Var.s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                c15 c15VarC3 = layoutNode.C();
                                Object[] objArr3 = c15VarC3.X;
                                int i7 = c15VarC3.Z;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bj4 bj4Var4 = ((LayoutNode) objArr3[i8]).I0.q;
                                    bj4Var4.getClass();
                                    int i9 = bj4Var4.j0;
                                    int i10 = bj4Var4.k0;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        bj4Var4.e0(true);
                                    }
                                }
                                c15 c15VarC4 = layoutNode.C();
                                Object[] objArr4 = c15VarC4.X;
                                int i11 = c15VarC4.Z;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    bj4 bj4Var5 = ((LayoutNode) objArr4[i12]).I0.q;
                                    bj4Var5.getClass();
                                    o34 o34Var = bj4Var5.u0;
                                    o34Var.e = o34Var.d;
                                }
                                return dn8Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = j05Var != null && j05Var.e(layoutNode3);
                            xi4 xi4VarT2 = layoutNode3.getOuterCoordinator$ui().T0();
                            if (xi4VarT2 != null) {
                                xi4VarT2.q0 = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        xi4 xi4VarT3 = bj4Var.h0.a().T0();
                        xi4VarT3.getClass();
                        xi4VarT3.o(bj4Var.B0);
                        return dn8Var;
                    default:
                        r34 r34Var3 = bj4Var.h0;
                        if (os4.t(r34Var3.a) || r34Var3.c) {
                            i55 i55Var = r34Var3.a().y0;
                            if (i55Var != null) {
                                placementScope = i55Var.r0;
                            }
                        } else {
                            i55 i55Var2 = r34Var3.a().y0;
                            if (i55Var2 != null && (xi4VarT0 = i55Var2.T0()) != null) {
                                placementScope = xi4VarT0.r0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = q34.a(r34Var3.a).getPlacementScope();
                        }
                        xi4 xi4VarT4 = r34Var3.a().T0();
                        xi4VarT4.getClass();
                        do5.g(placementScope, xi4VarT4, bj4Var.q0);
                        return dn8Var;
                }
            }
        };
        final byte b3 = 2;
        this.D0 = new dn2(this) { // from class: zi4
            public final /* synthetic */ bj4 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                xi4 xi4VarT0;
                byte b4 = b3;
                dn8 dn8Var = dn8.a;
                j05 j05Var = null;
                placementScope = null;
                placementScope = null;
                do5 placementScope = null;
                bj4 bj4Var = this.Y;
                switch (b4) {
                    case 0:
                        r34 r34Var2 = bj4Var.h0;
                        r34Var2.h = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            bj4 bj4Var2 = ((LayoutNode) objArr[i2]).I0.q;
                            bj4Var2.getClass();
                            bj4Var2.j0 = bj4Var2.k0;
                            bj4Var2.k0 = Integer.MAX_VALUE;
                            if (bj4Var2.l0 == m34.Y) {
                                bj4Var2.l0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            bj4 bj4Var3 = ((LayoutNode) objArr2[i4]).I0.q;
                            bj4Var3.getClass();
                            bj4Var3.u0.d = false;
                        }
                        ed3 ed3Var = bj4Var.d().f1;
                        if (ed3Var == null) {
                            bt.i("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            xi4 xi4VarT1 = layoutNode2.getOuterCoordinator$ui().T0();
                            if (xi4VarT1 != null) {
                                if (xi4VarT1.q0) {
                                    if (j05Var == null) {
                                        j05Var = new j05();
                                    }
                                    j05Var.a(layoutNode2);
                                }
                                xi4VarT1.q0 = ed3Var.q0;
                            }
                        }
                        ed3Var.s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                c15 c15VarC3 = layoutNode.C();
                                Object[] objArr3 = c15VarC3.X;
                                int i7 = c15VarC3.Z;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bj4 bj4Var4 = ((LayoutNode) objArr3[i8]).I0.q;
                                    bj4Var4.getClass();
                                    int i9 = bj4Var4.j0;
                                    int i10 = bj4Var4.k0;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        bj4Var4.e0(true);
                                    }
                                }
                                c15 c15VarC4 = layoutNode.C();
                                Object[] objArr4 = c15VarC4.X;
                                int i11 = c15VarC4.Z;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    bj4 bj4Var5 = ((LayoutNode) objArr4[i12]).I0.q;
                                    bj4Var5.getClass();
                                    o34 o34Var = bj4Var5.u0;
                                    o34Var.e = o34Var.d;
                                }
                                return dn8Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = j05Var != null && j05Var.e(layoutNode3);
                            xi4 xi4VarT2 = layoutNode3.getOuterCoordinator$ui().T0();
                            if (xi4VarT2 != null) {
                                xi4VarT2.q0 = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        xi4 xi4VarT3 = bj4Var.h0.a().T0();
                        xi4VarT3.getClass();
                        xi4VarT3.o(bj4Var.B0);
                        return dn8Var;
                    default:
                        r34 r34Var3 = bj4Var.h0;
                        if (os4.t(r34Var3.a) || r34Var3.c) {
                            i55 i55Var = r34Var3.a().y0;
                            if (i55Var != null) {
                                placementScope = i55Var.r0;
                            }
                        } else {
                            i55 i55Var2 = r34Var3.a().y0;
                            if (i55Var2 != null && (xi4VarT0 = i55Var2.T0()) != null) {
                                placementScope = xi4VarT0.r0;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = q34.a(r34Var3.a).getPlacementScope();
                        }
                        xi4 xi4VarT4 = r34Var3.a().T0();
                        xi4VarT4.getClass();
                        do5.g(placementScope, xi4VarT4, bj4Var.q0);
                        return dn8Var;
                }
            }
        };
    }

    @Override // defpackage.v8
    public final void B() {
        this.x0 = true;
        o34 o34Var = this.u0;
        o34Var.h();
        r34 r34Var = this.h0;
        boolean z = r34Var.f;
        LayoutNode layoutNode = r34Var.a;
        if (z) {
            c15 c15VarC = layoutNode.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                r34 r34Var2 = layoutNode2.I0;
                if (r34Var2.e && layoutNode2.s() == m34.X) {
                    bj4 bj4Var = r34Var2.q;
                    bj4Var.getClass();
                    bj4 bj4Var2 = r34Var2.q;
                    q31 q31Var = bj4Var2 != null ? bj4Var2.p0 : null;
                    q31Var.getClass();
                    if (bj4Var.r0(q31Var.a)) {
                        LayoutNode.W(layoutNode, false, 7);
                    }
                }
            }
        }
        ed3 ed3Var = d().f1;
        ed3Var.getClass();
        if (r34Var.g || (!this.m0 && !ed3Var.q0 && r34Var.f)) {
            r34Var.f = false;
            k34 k34Var = r34Var.d;
            r34Var.d = k34.f0;
            r34Var.i(false);
            of5 snapshotObserver = q34.a(layoutNode).getSnapshotObserver();
            snapshotObserver.a.c(layoutNode, snapshotObserver.h, this.y0);
            r34Var.d = k34Var;
            if (r34Var.m && ed3Var.q0) {
                requestLayout();
            }
            r34Var.g = false;
        }
        if (o34Var.d) {
            o34Var.e = true;
        }
        if (o34Var.b && o34Var.e()) {
            o34Var.g();
        }
        this.x0 = false;
    }

    @Override // defpackage.v8
    public final void J() {
        LayoutNode.W(this.h0.a, false, 7);
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        l0();
        xi4 xi4VarT0 = this.h0.a().T0();
        xi4VarT0.getClass();
        return xi4VarT0.K(i);
    }

    @Override // defpackage.eo5
    public final int N(r8 r8Var) {
        r34 r34Var = this.h0;
        LayoutNode layoutNodeW = r34Var.a.w();
        k34 k34Var = layoutNodeW != null ? layoutNodeW.I0.d : null;
        k34 k34Var2 = k34.Y;
        o34 o34Var = this.u0;
        if (k34Var == k34Var2) {
            o34Var.c = true;
        } else {
            LayoutNode layoutNodeW2 = r34Var.a.w();
            if ((layoutNodeW2 != null ? layoutNodeW2.I0.d : null) == k34.f0) {
                o34Var.d = true;
            }
        }
        this.m0 = true;
        xi4 xi4VarT0 = r34Var.a().T0();
        xi4VarT0.getClass();
        int iN = xi4VarT0.N(r8Var);
        this.m0 = false;
        return iN;
    }

    @Override // defpackage.eo5
    public final void S(long j, float f, gn2 gn2Var) {
        q0(j, gn2Var, null);
    }

    @Override // defpackage.eo5
    public final void T(long j, float f, xt2 xt2Var) {
        q0(j, null, xt2Var);
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        l0();
        xi4 xi4VarT0 = this.h0.a().T0();
        xi4VarT0.getClass();
        return xi4VarT0.a(i);
    }

    public final boolean a0() {
        r34 r34Var = this.h0;
        return os4.t(r34Var.a) || r34Var.c;
    }

    @Override // defpackage.v8
    public final o34 c() {
        return this.u0;
    }

    @Override // defpackage.v8
    public final fd3 d() {
        return (fd3) this.h0.a.H0.f0;
    }

    public final void e0(boolean z) {
        if (z && a0()) {
            return;
        }
        if (z || a0()) {
            this.t0 = aj4.Z;
            c15 c15VarC = this.h0.a.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                bj4 bj4Var = ((LayoutNode) objArr[i2]).I0.q;
                bj4Var.getClass();
                bj4Var.e0(true);
            }
        }
    }

    @Override // defpackage.v8
    public final v8 f() {
        r34 r34Var;
        LayoutNode layoutNodeW = this.h0.a.w();
        if (layoutNodeW == null || (r34Var = layoutNodeW.I0) == null) {
            return null;
        }
        return r34Var.q;
    }

    public final void i0() {
        aj4 aj4Var = this.t0;
        r34 r34Var = this.h0;
        boolean z = r34Var.c;
        LayoutNode layoutNode = r34Var.a;
        aj4 aj4Var2 = aj4.X;
        if (z) {
            this.t0 = aj4.Y;
        } else {
            this.t0 = aj4Var2;
        }
        if (aj4Var != aj4Var2 && r34Var.e) {
            LayoutNode.W(layoutNode, true, 6);
        }
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            bj4 bj4Var = layoutNode2.I0.q;
            if (bj4Var == null) {
                bt.q("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (bj4Var.k0 != Integer.MAX_VALUE) {
                bj4Var.i0();
                LayoutNode.Z(layoutNode2);
            }
        }
    }

    public final void j0() {
        r34 r34Var = this.h0;
        if (r34Var.o > 0) {
            c15 c15VarC = r34Var.a.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                r34 r34Var2 = layoutNode.I0;
                if ((r34Var2.m || r34Var2.n) && !r34Var2.f) {
                    layoutNode.V(false);
                }
                bj4 bj4Var = r34Var2.q;
                if (bj4Var != null) {
                    bj4Var.j0();
                }
            }
        }
    }

    @Override // defpackage.tr4
    public final int k(int i) {
        l0();
        xi4 xi4VarT0 = this.h0.a().T0();
        xi4VarT0.getClass();
        return xi4VarT0.k(i);
    }

    @Override // defpackage.v8
    public final int l() {
        return this.k0;
    }

    public final void l0() {
        m34 m34Var;
        r34 r34Var = this.h0;
        LayoutNode.W(r34Var.a, false, 7);
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNodeW = layoutNode.w();
        if (layoutNodeW == null || layoutNode.E0 != m34.Z) {
            return;
        }
        int iOrdinal = layoutNodeW.I0.d.ordinal();
        if (iOrdinal != 0) {
            m34Var = iOrdinal != 2 ? layoutNodeW.E0 : m34.Y;
        } else {
            m34Var = m34.X;
        }
        layoutNode.E0 = m34Var;
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        l0();
        xi4 xi4VarT0 = this.h0.a().T0();
        xi4VarT0.getClass();
        return xi4VarT0.m(i);
    }

    public final void m0() {
        k34 k34Var;
        this.E0 = true;
        r34 r34Var = this.h0;
        LayoutNode layoutNodeW = r34Var.a.w();
        aj4 aj4Var = this.t0;
        if ((aj4Var != aj4.X && !r34Var.c) || (aj4Var != aj4.Y && r34Var.c)) {
            i0();
            if (this.i0 && layoutNodeW != null) {
                layoutNodeW.V(false);
            }
        }
        if (layoutNodeW != null) {
            r34 r34Var2 = layoutNodeW.I0;
            if (!this.i0 && ((k34Var = r34Var2.d) == k34.Z || k34Var == k34.f0)) {
                if (this.k0 != Integer.MAX_VALUE) {
                    wc3.b("Place was called on a node which was placed already");
                }
                int i = r34Var2.h;
                this.k0 = i;
                r34Var2.h = i + 1;
            }
        } else {
            this.k0 = 0;
        }
        B();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.tr4
    public final eo5 o(long j) {
        m34 m34Var;
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        LayoutNode layoutNodeW = layoutNode.w();
        if ((layoutNodeW != null ? layoutNodeW.I0.d : null) == k34.Y) {
            r34Var.b = false;
        } else {
            LayoutNode layoutNodeW2 = layoutNode2.w();
            if ((layoutNodeW2 != null ? layoutNodeW2.I0.d : null) == k34.f0) {
                r34Var.b = false;
            }
        }
        LayoutNode layoutNodeW3 = layoutNode2.w();
        m34 m34Var2 = m34.Z;
        if (layoutNodeW3 != null) {
            r34 r34Var2 = layoutNodeW3.I0;
            if (this.l0 != m34Var2 && !layoutNode2.G0) {
                wc3.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = r34Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                m34Var = m34.X;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    bt.p(r34Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                m34Var = m34.Y;
            }
            this.l0 = m34Var;
        } else {
            this.l0 = m34Var2;
        }
        if (layoutNode2.E0 == m34Var2) {
            layoutNode2.e();
        }
        r0(j);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    public final void q0(long j, gn2 gn2Var, xt2 xt2Var) {
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        try {
            LayoutNode layoutNodeW = layoutNode.w();
            k34 k34Var = layoutNodeW != null ? layoutNodeW.I0.d : null;
            k34 k34Var2 = k34.f0;
            if (k34Var == k34Var2) {
                r34Var.c = false;
            }
            if (layoutNode2.Q0) {
                wc3.a("place is called on a deactivated node");
            }
            r34Var.d = k34Var2;
            boolean z = true;
            this.n0 = true;
            this.E0 = false;
            if (!hf3.a(j, this.q0)) {
                if (r34Var.n || r34Var.m) {
                    r34Var.f = true;
                }
                j0();
            }
            mf5 mf5VarA = q34.a(layoutNode2);
            this.q0 = j;
            if (r34Var.f) {
                r34Var.h(false);
                this.u0.g = false;
                of5 snapshotObserver = mf5VarA.getSnapshotObserver();
                snapshotObserver.a.c(layoutNode2, snapshotObserver.g, this.D0);
            } else {
                if (this.t0 == aj4.Z) {
                    z = false;
                }
                if (z) {
                    xi4 xi4VarT0 = r34Var.a().T0();
                    xi4VarT0.getClass();
                    xi4VarT0.K0(hf3.c(j, xi4VarT0.g0));
                    m0();
                } else {
                    r34Var.h(false);
                    this.u0.g = false;
                    of5 snapshotObserver2 = mf5VarA.getSnapshotObserver();
                    snapshotObserver2.a.c(layoutNode2, snapshotObserver2.g, this.D0);
                }
            }
            this.r0 = gn2Var;
            this.s0 = xt2Var;
            r34Var.d = k34.g0;
        } catch (Throwable th) {
            layoutNode.b0(th);
            throw null;
        }
    }

    public final boolean r0(long j) {
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        try {
            if (layoutNode.Q0) {
                wc3.a("measure is called on a deactivated node");
            }
            LayoutNode layoutNodeW = layoutNode2.w();
            layoutNode2.G0 = layoutNode2.G0 || (layoutNodeW != null && layoutNodeW.G0);
            if (!layoutNode2.I0.e) {
                q31 q31Var = this.p0;
                if (q31Var == null ? false : q31.b(q31Var.a, j)) {
                    mf5 mf5Var = layoutNode2.q0;
                    if (mf5Var != null) {
                        ((AndroidComposeView) mf5Var).g(layoutNode2, true);
                    }
                    layoutNode2.a0();
                    return false;
                }
            }
            this.p0 = new q31(j);
            Z(j);
            this.u0.f = false;
            c15 c15VarC = layoutNode2.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                bj4 bj4Var = ((LayoutNode) objArr[i2]).I0.q;
                bj4Var.getClass();
                bj4Var.u0.c = false;
            }
            long j2 = this.o0 ? this.Z : -9223372034707292160L;
            this.o0 = true;
            xi4 xi4VarT0 = r34Var.a().T0();
            if (xi4VarT0 == null) {
                wc3.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            r34Var.c(j);
            V((((long) xi4VarT0.X) << 32) | (((long) xi4VarT0.Y) & 4294967295L));
            return (((int) (j2 >> 32)) == xi4VarT0.X && ((int) (j2 & 4294967295L)) == xi4VarT0.Y) ? false : true;
        } catch (Throwable th) {
            layoutNode.b0(th);
            throw null;
        }
    }

    @Override // defpackage.v8
    public final void requestLayout() {
        this.h0.a.V(false);
    }

    @Override // defpackage.v8
    public final void s(y0 y0Var) {
        c15 c15VarC = this.h0.a.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            bj4 bj4Var = ((LayoutNode) objArr[i2]).I0.q;
            bj4Var.getClass();
            y0Var.B(bj4Var);
        }
    }

    @Override // defpackage.eo5, defpackage.tr4
    public final Object w() {
        return this.A0;
    }

    @Override // defpackage.jy4
    public final void z(boolean z) {
        xi4 xi4VarT0;
        r34 r34Var = this.h0;
        xi4 xi4VarT1 = r34Var.a().T0();
        if (Boolean.valueOf(z).equals(xi4VarT1 != null ? Boolean.valueOf(xi4VarT1.n0) : null) || (xi4VarT0 = r34Var.a().T0()) == null) {
            return;
        }
        xi4VarT0.n0 = z;
    }
}
