package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr4 extends eo5 implements tr4, v8, jy4 {
    public boolean D0;
    public final vr4 F0;
    public final vr4 G0;
    public float H0;
    public boolean I0;
    public gn2 J0;
    public xt2 K0;
    public float M0;
    public final vr4 N0;
    public boolean O0;
    public final r34 h0;
    public boolean i0;
    public boolean l0;
    public boolean m0;
    public boolean o0;
    public gn2 q0;
    public xt2 r0;
    public float s0;
    public Object u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public int j0 = Integer.MAX_VALUE;
    public int k0 = Integer.MAX_VALUE;
    public m34 n0 = m34.Z;
    public long p0 = 0;
    public boolean t0 = true;
    public final o34 A0 = new o34(this, (byte) 0);
    public final c15 B0 = new c15(0, new wr4[16]);
    public boolean C0 = true;
    public long E0 = s31.b(0, 0, 0, 0, 15);
    public long L0 = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [vr4] */
    /* JADX WARN: Type inference failed for: r2v4, types: [vr4] */
    /* JADX WARN: Type inference failed for: r7v4, types: [vr4] */
    public wr4(r34 r34Var) {
        this.h0 = r34Var;
        final byte b = 1;
        final byte b2 = 0;
        this.F0 = new dn2(this) { // from class: vr4
            public final /* synthetic */ wr4 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x010c  */
            @Override // defpackage.dn2
            public final Object invoke() {
                boolean z;
                byte b3 = b2;
                j05 j05Var = null;
                dn8 dn8Var = dn8.a;
                wr4 wr4Var = this.Y;
                switch (b3) {
                    case 0:
                        wr4Var.h0.a().o(wr4Var.E0);
                        break;
                    case 1:
                        r34 r34Var2 = wr4Var.h0;
                        r34Var2.i = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            wr4 wr4Var2 = ((LayoutNode) objArr[i2]).I0.p;
                            wr4Var2.j0 = wr4Var2.k0;
                            wr4Var2.k0 = Integer.MAX_VALUE;
                            wr4Var2.w0 = false;
                            if (wr4Var2.n0 == m34.Y) {
                                wr4Var2.n0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).I0.p.A0.d = false;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            if (layoutNode2.getOuterCoordinator$ui().q0) {
                                if (j05Var == null) {
                                    j05Var = new j05();
                                }
                                j05Var.a(layoutNode2);
                            }
                            layoutNode2.getOuterCoordinator$ui().q0 = wr4Var.d().q0;
                        }
                        wr4Var.d().s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            if (j05Var != null) {
                                z = true;
                                if (!j05Var.e(layoutNode3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            layoutNode3.getOuterCoordinator$ui().q0 = z;
                        }
                        c15 c15VarC3 = layoutNode.C();
                        Object[] objArr3 = c15VarC3.X;
                        int i7 = c15VarC3.Z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode4 = (LayoutNode) objArr3[i8];
                            r34 r34Var3 = layoutNode4.I0;
                            if (r34Var3.p.j0 != layoutNode4.x()) {
                                layoutNode.R();
                                layoutNode.F();
                                if (layoutNode4.x() == Integer.MAX_VALUE) {
                                    if (r34Var3.c || os4.t(layoutNode4)) {
                                        bj4 bj4Var = r34Var3.q;
                                        bj4Var.getClass();
                                        bj4Var.e0(false);
                                    }
                                    r34Var3.p.i0();
                                }
                            }
                        }
                        c15 c15VarC4 = layoutNode.C();
                        Object[] objArr4 = c15VarC4.X;
                        int i9 = c15VarC4.Z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            o34 o34Var = ((LayoutNode) objArr4[i10]).I0.p.A0;
                            o34Var.e = o34Var.d;
                        }
                        break;
                    default:
                        r34 r34Var4 = wr4Var.h0;
                        i55 i55Var = r34Var4.a().y0;
                        do5 placementScope = i55Var != null ? i55Var.r0 : q34.a(r34Var4.a).getPlacementScope();
                        gn2 gn2Var = wr4Var.J0;
                        xt2 xt2Var = wr4Var.K0;
                        if (xt2Var != null) {
                            i55 i55VarA = r34Var4.a();
                            long j = wr4Var.L0;
                            float f = wr4Var.M0;
                            placementScope.d(i55VarA);
                            i55VarA.T(hf3.c(j, i55VarA.g0), f, xt2Var);
                        } else if (gn2Var == null) {
                            i55 i55VarA2 = r34Var4.a();
                            long j2 = wr4Var.L0;
                            float f2 = wr4Var.M0;
                            placementScope.d(i55VarA2);
                            i55VarA2.S(hf3.c(j2, i55VarA2.g0), f2, null);
                        } else {
                            i55 i55VarA3 = r34Var4.a();
                            long j3 = wr4Var.L0;
                            float f3 = wr4Var.M0;
                            placementScope.d(i55VarA3);
                            i55VarA3.S(hf3.c(j3, i55VarA3.g0), f3, gn2Var);
                        }
                        break;
                }
                return dn8Var;
            }
        };
        this.G0 = new dn2(this) { // from class: vr4
            public final /* synthetic */ wr4 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x010c  */
            @Override // defpackage.dn2
            public final Object invoke() {
                boolean z;
                byte b3 = b;
                j05 j05Var = null;
                dn8 dn8Var = dn8.a;
                wr4 wr4Var = this.Y;
                switch (b3) {
                    case 0:
                        wr4Var.h0.a().o(wr4Var.E0);
                        break;
                    case 1:
                        r34 r34Var2 = wr4Var.h0;
                        r34Var2.i = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            wr4 wr4Var2 = ((LayoutNode) objArr[i2]).I0.p;
                            wr4Var2.j0 = wr4Var2.k0;
                            wr4Var2.k0 = Integer.MAX_VALUE;
                            wr4Var2.w0 = false;
                            if (wr4Var2.n0 == m34.Y) {
                                wr4Var2.n0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).I0.p.A0.d = false;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            if (layoutNode2.getOuterCoordinator$ui().q0) {
                                if (j05Var == null) {
                                    j05Var = new j05();
                                }
                                j05Var.a(layoutNode2);
                            }
                            layoutNode2.getOuterCoordinator$ui().q0 = wr4Var.d().q0;
                        }
                        wr4Var.d().s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            if (j05Var != null) {
                                z = true;
                                if (!j05Var.e(layoutNode3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            layoutNode3.getOuterCoordinator$ui().q0 = z;
                        }
                        c15 c15VarC3 = layoutNode.C();
                        Object[] objArr3 = c15VarC3.X;
                        int i7 = c15VarC3.Z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode4 = (LayoutNode) objArr3[i8];
                            r34 r34Var3 = layoutNode4.I0;
                            if (r34Var3.p.j0 != layoutNode4.x()) {
                                layoutNode.R();
                                layoutNode.F();
                                if (layoutNode4.x() == Integer.MAX_VALUE) {
                                    if (r34Var3.c || os4.t(layoutNode4)) {
                                        bj4 bj4Var = r34Var3.q;
                                        bj4Var.getClass();
                                        bj4Var.e0(false);
                                    }
                                    r34Var3.p.i0();
                                }
                            }
                        }
                        c15 c15VarC4 = layoutNode.C();
                        Object[] objArr4 = c15VarC4.X;
                        int i9 = c15VarC4.Z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            o34 o34Var = ((LayoutNode) objArr4[i10]).I0.p.A0;
                            o34Var.e = o34Var.d;
                        }
                        break;
                    default:
                        r34 r34Var4 = wr4Var.h0;
                        i55 i55Var = r34Var4.a().y0;
                        do5 placementScope = i55Var != null ? i55Var.r0 : q34.a(r34Var4.a).getPlacementScope();
                        gn2 gn2Var = wr4Var.J0;
                        xt2 xt2Var = wr4Var.K0;
                        if (xt2Var != null) {
                            i55 i55VarA = r34Var4.a();
                            long j = wr4Var.L0;
                            float f = wr4Var.M0;
                            placementScope.d(i55VarA);
                            i55VarA.T(hf3.c(j, i55VarA.g0), f, xt2Var);
                        } else if (gn2Var == null) {
                            i55 i55VarA2 = r34Var4.a();
                            long j2 = wr4Var.L0;
                            float f2 = wr4Var.M0;
                            placementScope.d(i55VarA2);
                            i55VarA2.S(hf3.c(j2, i55VarA2.g0), f2, null);
                        } else {
                            i55 i55VarA3 = r34Var4.a();
                            long j3 = wr4Var.L0;
                            float f3 = wr4Var.M0;
                            placementScope.d(i55VarA3);
                            i55VarA3.S(hf3.c(j3, i55VarA3.g0), f3, gn2Var);
                        }
                        break;
                }
                return dn8Var;
            }
        };
        final byte b3 = 2;
        this.N0 = new dn2(this) { // from class: vr4
            public final /* synthetic */ wr4 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x010c  */
            @Override // defpackage.dn2
            public final Object invoke() {
                boolean z;
                byte b4 = b3;
                j05 j05Var = null;
                dn8 dn8Var = dn8.a;
                wr4 wr4Var = this.Y;
                switch (b4) {
                    case 0:
                        wr4Var.h0.a().o(wr4Var.E0);
                        break;
                    case 1:
                        r34 r34Var2 = wr4Var.h0;
                        r34Var2.i = 0;
                        LayoutNode layoutNode = r34Var2.a;
                        c15 c15VarC = layoutNode.C();
                        Object[] objArr = c15VarC.X;
                        int i = c15VarC.Z;
                        for (int i2 = 0; i2 < i; i2++) {
                            wr4 wr4Var2 = ((LayoutNode) objArr[i2]).I0.p;
                            wr4Var2.j0 = wr4Var2.k0;
                            wr4Var2.k0 = Integer.MAX_VALUE;
                            wr4Var2.w0 = false;
                            if (wr4Var2.n0 == m34.Y) {
                                wr4Var2.n0 = m34.Z;
                            }
                        }
                        c15 c15VarC2 = layoutNode.C();
                        Object[] objArr2 = c15VarC2.X;
                        int i3 = c15VarC2.Z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).I0.p.A0.d = false;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            if (layoutNode2.getOuterCoordinator$ui().q0) {
                                if (j05Var == null) {
                                    j05Var = new j05();
                                }
                                j05Var.a(layoutNode2);
                            }
                            layoutNode2.getOuterCoordinator$ui().q0 = wr4Var.d().q0;
                        }
                        wr4Var.d().s0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            if (j05Var != null) {
                                z = true;
                                if (!j05Var.e(layoutNode3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            layoutNode3.getOuterCoordinator$ui().q0 = z;
                        }
                        c15 c15VarC3 = layoutNode.C();
                        Object[] objArr3 = c15VarC3.X;
                        int i7 = c15VarC3.Z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode4 = (LayoutNode) objArr3[i8];
                            r34 r34Var3 = layoutNode4.I0;
                            if (r34Var3.p.j0 != layoutNode4.x()) {
                                layoutNode.R();
                                layoutNode.F();
                                if (layoutNode4.x() == Integer.MAX_VALUE) {
                                    if (r34Var3.c || os4.t(layoutNode4)) {
                                        bj4 bj4Var = r34Var3.q;
                                        bj4Var.getClass();
                                        bj4Var.e0(false);
                                    }
                                    r34Var3.p.i0();
                                }
                            }
                        }
                        c15 c15VarC4 = layoutNode.C();
                        Object[] objArr4 = c15VarC4.X;
                        int i9 = c15VarC4.Z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            o34 o34Var = ((LayoutNode) objArr4[i10]).I0.p.A0;
                            o34Var.e = o34Var.d;
                        }
                        break;
                    default:
                        r34 r34Var4 = wr4Var.h0;
                        i55 i55Var = r34Var4.a().y0;
                        do5 placementScope = i55Var != null ? i55Var.r0 : q34.a(r34Var4.a).getPlacementScope();
                        gn2 gn2Var = wr4Var.J0;
                        xt2 xt2Var = wr4Var.K0;
                        if (xt2Var != null) {
                            i55 i55VarA = r34Var4.a();
                            long j = wr4Var.L0;
                            float f = wr4Var.M0;
                            placementScope.d(i55VarA);
                            i55VarA.T(hf3.c(j, i55VarA.g0), f, xt2Var);
                        } else if (gn2Var == null) {
                            i55 i55VarA2 = r34Var4.a();
                            long j2 = wr4Var.L0;
                            float f2 = wr4Var.M0;
                            placementScope.d(i55VarA2);
                            i55VarA2.S(hf3.c(j2, i55VarA2.g0), f2, null);
                        } else {
                            i55 i55VarA3 = r34Var4.a();
                            long j3 = wr4Var.L0;
                            float f3 = wr4Var.M0;
                            placementScope.d(i55VarA3);
                            i55VarA3.S(hf3.c(j3, i55VarA3.g0), f3, gn2Var);
                        }
                        break;
                }
                return dn8Var;
            }
        };
    }

    @Override // defpackage.v8
    public final void B() {
        boolean zR0;
        this.D0 = true;
        o34 o34Var = this.A0;
        o34Var.h();
        boolean z = this.y0;
        r34 r34Var = this.h0;
        if (z) {
            c15 c15VarC = r34Var.a.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                boolean zQ = layoutNode.q();
                r34 r34Var2 = layoutNode.I0;
                if (zQ && layoutNode.r() == m34.X) {
                    wr4 wr4Var = r34Var2.p;
                    q31 q31Var = wr4Var.l0 ? new q31(wr4Var.f0) : null;
                    if (q31Var != null) {
                        if (layoutNode.E0 == m34.Z) {
                            layoutNode.e();
                        }
                        zR0 = r34Var2.p.r0(q31Var.a);
                    } else {
                        zR0 = false;
                    }
                    if (zR0) {
                        LayoutNode.Y(r34Var.a, false, 7);
                    }
                }
            }
        }
        if (this.z0 || (!this.o0 && !d().q0 && this.y0)) {
            this.y0 = false;
            k34 k34Var = r34Var.d;
            r34Var.d = k34.Z;
            r34Var.g(false);
            LayoutNode layoutNode2 = r34Var.a;
            of5 snapshotObserver = q34.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.c(layoutNode2, snapshotObserver.e, this.G0);
            r34Var.d = k34Var;
            this.z0 = false;
        }
        if (o34Var.d) {
            o34Var.e = true;
        }
        if (o34Var.b && o34Var.e()) {
            o34Var.g();
        }
        this.D0 = false;
    }

    @Override // defpackage.v8
    public final void J() {
        LayoutNode.Y(this.h0.a, false, 7);
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        r34 r34Var = this.h0;
        if (!os4.t(r34Var.a)) {
            j0();
            return r34Var.a().K(i);
        }
        bj4 bj4Var = r34Var.q;
        bj4Var.getClass();
        return bj4Var.K(i);
    }

    @Override // defpackage.eo5
    public final int N(r8 r8Var) {
        r34 r34Var = this.h0;
        LayoutNode layoutNodeW = r34Var.a.w();
        k34 k34Var = layoutNodeW != null ? layoutNodeW.I0.d : null;
        k34 k34Var2 = k34.X;
        o34 o34Var = this.A0;
        if (k34Var == k34Var2) {
            o34Var.c = true;
        } else {
            LayoutNode layoutNodeW2 = r34Var.a.w();
            if ((layoutNodeW2 != null ? layoutNodeW2.I0.d : null) == k34.Z) {
                o34Var.d = true;
            }
        }
        this.o0 = true;
        int iN = r34Var.a().N(r8Var);
        this.o0 = false;
        return iN;
    }

    @Override // defpackage.eo5
    public final int O() {
        return this.h0.a().O();
    }

    @Override // defpackage.eo5
    public final int P() {
        return this.h0.a().P();
    }

    @Override // defpackage.eo5
    public final void S(long j, float f, gn2 gn2Var) {
        q0(j, f, gn2Var, null);
    }

    @Override // defpackage.eo5
    public final void T(long j, float f, xt2 xt2Var) {
        q0(j, f, null, xt2Var);
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        r34 r34Var = this.h0;
        if (!os4.t(r34Var.a)) {
            j0();
            return r34Var.a().a(i);
        }
        bj4 bj4Var = r34Var.q;
        bj4Var.getClass();
        return bj4Var.a(i);
    }

    public final List a0() {
        r34 r34Var = this.h0;
        r34Var.a.i0();
        boolean z = this.C0;
        c15 c15Var = this.B0;
        if (!z) {
            return c15Var.f();
        }
        LayoutNode layoutNode = r34Var.a;
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (c15Var.Z <= i2) {
                c15Var.b(layoutNode2.I0.p);
            } else {
                wr4 wr4Var = layoutNode2.I0.p;
                Object[] objArr2 = c15Var.X;
                Object obj = objArr2[i2];
                objArr2[i2] = wr4Var;
            }
        }
        c15Var.l(layoutNode.getChildren$ui().size(), c15Var.Z);
        this.C0 = false;
        return c15Var.f();
    }

    @Override // defpackage.v8
    public final o34 c() {
        return this.A0;
    }

    @Override // defpackage.v8
    public final fd3 d() {
        return (fd3) this.h0.a.H0.f0;
    }

    public final void e0() {
        boolean z = this.v0;
        this.v0 = true;
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        t6 t6Var = layoutNode.H0;
        if (!z) {
            ((fd3) t6Var.f0).h1();
            q34.a(layoutNode).getRectManager().g(r34Var.a);
            if (layoutNode.q()) {
                LayoutNode.Y(layoutNode, true, 6);
            } else if (layoutNode.I0.e) {
                LayoutNode.W(layoutNode, true, 6);
            }
        }
        i55 i55Var = ((fd3) t6Var.f0).x0;
        for (i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !dh3.f(outerCoordinator$ui, i55Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.x0) {
            if (outerCoordinator$ui.U0) {
                outerCoordinator$ui.d1();
            }
        }
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.x() != Integer.MAX_VALUE) {
                layoutNode2.I0.p.e0();
                LayoutNode.Z(layoutNode2);
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
        return r34Var.p;
    }

    public final void i0() {
        if (this.v0) {
            this.v0 = false;
            r34 r34Var = this.h0;
            LayoutNode layoutNode = r34Var.a;
            LayoutNode layoutNode2 = r34Var.a;
            q34.a(layoutNode).getRectManager().h(layoutNode2);
            i55 i55Var = ((fd3) layoutNode2.H0.f0).x0;
            for (i55 outerCoordinator$ui = layoutNode2.getOuterCoordinator$ui(); !dh3.f(outerCoordinator$ui, i55Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.x0) {
                outerCoordinator$ui.j1();
                outerCoordinator$ui.o1();
            }
            c15 c15VarC = layoutNode2.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).I0.p.i0();
            }
        }
    }

    public final void j0() {
        m34 m34Var;
        r34 r34Var = this.h0;
        LayoutNode.Y(r34Var.a, false, 7);
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
    public final int k(int i) {
        r34 r34Var = this.h0;
        if (!os4.t(r34Var.a)) {
            j0();
            return r34Var.a().k(i);
        }
        bj4 bj4Var = r34Var.q;
        bj4Var.getClass();
        return bj4Var.k(i);
    }

    @Override // defpackage.v8
    public final int l() {
        return this.k0;
    }

    public final void l0() {
        this.I0 = true;
        r34 r34Var = this.h0;
        LayoutNode layoutNodeW = r34Var.a.w();
        float f = d().I0;
        LayoutNode layoutNode = r34Var.a;
        i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        fd3 fd3Var = (fd3) layoutNode.H0.f0;
        while (outerCoordinator$ui != fd3Var) {
            outerCoordinator$ui.getClass();
            i34 i34Var = (i34) outerCoordinator$ui;
            f += i34Var.I0;
            outerCoordinator$ui = i34Var.x0;
        }
        if (f != this.H0) {
            this.H0 = f;
            if (layoutNodeW != null) {
                layoutNodeW.R();
            }
            if (layoutNodeW != null) {
                layoutNodeW.F();
            }
        }
        if (!d().q0) {
            boolean z = this.v0;
            if (!z || this.A0.d()) {
                e0();
            }
            if (z) {
                ((fd3) layoutNode.H0.f0).h1();
            } else {
                if (layoutNodeW != null) {
                    layoutNodeW.F();
                }
                if (this.i0 && layoutNodeW != null) {
                    layoutNodeW.X(false);
                }
            }
        }
        if (layoutNodeW != null) {
            r34 r34Var2 = layoutNodeW.I0;
            if (!this.i0 && r34Var2.d == k34.Z) {
                if (this.k0 != Integer.MAX_VALUE) {
                    wc3.b("Place was called on a node which was placed already");
                }
                int i = r34Var2.i;
                this.k0 = i;
                r34Var2.i = i + 1;
            }
        } else {
            this.k0 = 0;
        }
        B();
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        r34 r34Var = this.h0;
        if (!os4.t(r34Var.a)) {
            j0();
            return r34Var.a().m(i);
        }
        bj4 bj4Var = r34Var.q;
        bj4Var.getClass();
        return bj4Var.m(i);
    }

    public final void m0(long j, float f, gn2 gn2Var, xt2 xt2Var) {
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        if (layoutNode.Q0) {
            wc3.a("place is called on a deactivated node");
        }
        r34Var.d = k34.Z;
        this.p0 = j;
        this.s0 = f;
        this.q0 = gn2Var;
        this.r0 = xt2Var;
        this.I0 = false;
        mf5 mf5VarA = q34.a(layoutNode2);
        if (this.y0 || !this.v0) {
            this.A0.g = false;
            r34Var.f(false);
            this.J0 = gn2Var;
            this.L0 = j;
            this.M0 = f;
            this.K0 = xt2Var;
            of5 snapshotObserver = mf5VarA.getSnapshotObserver();
            snapshotObserver.a.c(layoutNode2, snapshotObserver.f, this.N0);
        } else {
            i55 i55VarA = r34Var.a();
            i55VarA.m1(hf3.c(j, i55VarA.g0), f, gn2Var, xt2Var);
            l0();
        }
        r34Var.d = k34.g0;
        if (r34Var.a().q0 && (r34Var.k || r34Var.j)) {
            requestLayout();
        }
        this.m0 = true;
    }

    @Override // defpackage.tr4
    public final eo5 o(long j) {
        m34 m34Var;
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        m34 m34Var2 = layoutNode.E0;
        m34 m34Var3 = m34.Z;
        if (m34Var2 == m34Var3) {
            layoutNode.e();
        }
        if (os4.t(layoutNode2)) {
            bj4 bj4Var = r34Var.q;
            bj4Var.getClass();
            bj4Var.l0 = m34Var3;
            bj4Var.o(j);
        }
        LayoutNode layoutNodeW = layoutNode2.w();
        if (layoutNodeW != null) {
            r34 r34Var2 = layoutNodeW.I0;
            if (this.n0 != m34Var3 && !layoutNode2.G0) {
                wc3.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = r34Var2.d.ordinal();
            if (iOrdinal == 0) {
                m34Var = m34.X;
            } else {
                if (iOrdinal != 2) {
                    bt.p(r34Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                m34Var = m34.Y;
            }
            this.n0 = m34Var;
        } else {
            this.n0 = m34Var3;
        }
        r0(j);
        return this;
    }

    public final void q0(long j, float f, gn2 gn2Var, xt2 xt2Var) {
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        try {
            this.w0 = true;
            if (!hf3.a(j, this.p0) || gn2Var != this.q0 || this.O0) {
                if (r34Var.k || r34Var.j || this.O0) {
                    this.y0 = true;
                    this.O0 = false;
                }
            }
            bj4 bj4Var = r34Var.q;
            if (bj4Var != null) {
                r34 r34Var2 = bj4Var.h0;
                if (bj4Var.t0 == aj4.Z && !os4.t(r34Var2.a)) {
                    r34Var2.c = true;
                }
            }
            bj4 bj4Var2 = r34Var.q;
            if (bj4Var2 != null && bj4Var2.a0()) {
                i55 i55Var = r34Var.a().y0;
                do5 placementScope = i55Var != null ? i55Var.r0 : q34.a(layoutNode2).getPlacementScope();
                bj4 bj4Var3 = r34Var.q;
                bj4Var3.getClass();
                LayoutNode layoutNodeW = layoutNode2.w();
                if (layoutNodeW != null) {
                    layoutNodeW.I0.h = 0;
                }
                bj4Var3.k0 = Integer.MAX_VALUE;
                do5.f(placementScope, bj4Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            bj4 bj4Var4 = r34Var.q;
            if (bj4Var4 != null && !bj4Var4.n0) {
                wc3.b("Error: Placement happened before lookahead.");
            }
            m0(j, f, gn2Var, xt2Var);
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
            mf5 mf5VarA = q34.a(layoutNode2);
            LayoutNode layoutNodeW = layoutNode2.w();
            boolean z = true;
            layoutNode2.G0 = layoutNode2.G0 || (layoutNodeW != null && layoutNodeW.G0);
            if (!layoutNode2.q() && q31.b(this.f0, j)) {
                ((AndroidComposeView) mf5VarA).g(layoutNode2, false);
                layoutNode2.a0();
                return false;
            }
            this.A0.f = false;
            c15 c15VarC = layoutNode2.C();
            Object[] objArr = c15VarC.X;
            int i = c15VarC.Z;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).I0.p.A0.c = false;
            }
            this.l0 = true;
            long j2 = r34Var.a().Z;
            Z(j);
            k34 k34Var = r34Var.d;
            k34 k34Var2 = k34.g0;
            if (k34Var != k34Var2) {
                wc3.b("layout state is not idle before measure starts");
            }
            this.E0 = j;
            k34 k34Var3 = k34.X;
            r34Var.d = k34Var3;
            this.x0 = false;
            of5 snapshotObserver = q34.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.c(layoutNode2, snapshotObserver.c, this.F0);
            if (r34Var.d == k34Var3) {
                this.y0 = true;
                this.z0 = true;
                r34Var.d = k34Var2;
            }
            if (pf3.a(r34Var.a().Z, j2) && r34Var.a().X == this.X && r34Var.a().Y == this.Y) {
                z = false;
            }
            V((((long) r34Var.a().Y) & 4294967295L) | (((long) r34Var.a().X) << 32));
            return z;
        } catch (Throwable th) {
            layoutNode.b0(th);
            throw null;
        }
    }

    @Override // defpackage.v8
    public final void requestLayout() {
        this.h0.a.X(false);
    }

    @Override // defpackage.v8
    public final void s(y0 y0Var) {
        c15 c15VarC = this.h0.a.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            y0Var.B(((LayoutNode) objArr[i2]).I0.p);
        }
    }

    public final void s0() {
        r34 r34Var = this.h0;
        LayoutNode layoutNode = r34Var.a;
        LayoutNode layoutNode2 = r34Var.a;
        if (!layoutNode.L() || r34Var.l <= 0) {
            return;
        }
        r34 r34Var2 = layoutNode2.I0;
        if ((r34Var2.j || r34Var2.k) && !r34Var2.p.y0) {
            layoutNode2.X(false);
        }
        c15 c15VarC = layoutNode2.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).I0.p.s0();
        }
    }

    @Override // defpackage.eo5, defpackage.tr4
    public final Object w() {
        return this.u0;
    }

    @Override // defpackage.jy4
    public final void z(boolean z) {
        r34 r34Var = this.h0;
        if (z != r34Var.a().n0) {
            r34Var.a().n0 = z;
            this.O0 = true;
        }
    }
}
