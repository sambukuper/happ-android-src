package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.a23;
import defpackage.aj4;
import defpackage.au2;
import defpackage.b44;
import defpackage.b61;
import defpackage.bj4;
import defpackage.bt;
import defpackage.c15;
import defpackage.c17;
import defpackage.cg;
import defpackage.d02;
import defpackage.d55;
import defpackage.dh3;
import defpackage.dx4;
import defpackage.ea6;
import defpackage.ei3;
import defpackage.f18;
import defpackage.fd3;
import defpackage.fi1;
import defpackage.fw8;
import defpackage.h05;
import defpackage.hx4;
import defpackage.i34;
import defpackage.i55;
import defpackage.j05;
import defpackage.j34;
import defpackage.jx4;
import defpackage.jz0;
import defpackage.k34;
import defpackage.kl5;
import defpackage.kq5;
import defpackage.kx4;
import defpackage.lf5;
import defpackage.lr;
import defpackage.lx4;
import defpackage.m34;
import defpackage.mf5;
import defpackage.n34;
import defpackage.nf5;
import defpackage.o34;
import defpackage.of5;
import defpackage.oh1;
import defpackage.os4;
import defpackage.ox1;
import defpackage.p01;
import defpackage.p5;
import defpackage.p61;
import defpackage.q01;
import defpackage.q03;
import defpackage.q31;
import defpackage.q34;
import defpackage.r34;
import defpackage.rh5;
import defpackage.ri1;
import defpackage.sm0;
import defpackage.t01;
import defpackage.t07;
import defpackage.t6;
import defpackage.tb2;
import defpackage.u01;
import defpackage.u86;
import defpackage.ua;
import defpackage.uz0;
import defpackage.v07;
import defpackage.vl6;
import defpackage.wc3;
import defpackage.wr4;
import defpackage.x97;
import defpackage.xr4;
import defpackage.xt2;
import defpackage.yn0;
import defpackage.yr2;
import defpackage.z24;
import defpackage.z91;
import defpackage.zz2;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0003\u0013\u0014\u0015J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Ljz0;", "Lnf5;", _UrlKt.FRAGMENT_ENCODE_SET, "Luz0;", "instance", _UrlKt.FRAGMENT_ENCODE_SET, "j", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "getChildren$ui", "()Ljava/util/List;", "children", "Li55;", "getOuterCoordinator$ui", "()Li55;", "outerCoordinator", "getChildrenInfo", "childrenInfo", "l34", "k34", "m34", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNode implements jz0, nf5, uz0 {
    public static final vl6 R0 = new vl6("Undefined intrinsics block and it is required", 1);
    public static final ei3 S0 = new ei3(12);
    public static final j34 T0 = new j34();
    public static final cg U0 = new cg((byte) 4);
    public fi1 A0;
    public z24 B0;
    public fw8 C0;
    public u01 D0;
    public m34 E0;
    public m34 F0;
    public boolean G0;
    public final t6 H0;
    public final r34 I0;
    public b44 J0;
    public i55 K0;
    public boolean L0;
    public kx4 M0;
    public kx4 N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public final boolean X;
    public int Y;
    public boolean Z;
    public long f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public LayoutNode k0;
    public int l0;
    public final zz2 m0;
    public c15 n0;
    public boolean o0;
    public LayoutNode p0;
    public mf5 q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public t07 u0;
    public boolean v0;
    public final c15 w0;
    public boolean x0;
    public xr4 y0;
    public zz2 z0;

    public LayoutNode(int i, boolean z) {
        this.X = z;
        this.Y = i;
        this.f0 = 9223372034707292159L;
        this.g0 = true;
        this.h0 = true;
        this.i0 = -4;
        this.m0 = new zz2(new c15(0, new LayoutNode[16]), new tb2(this, (byte) 17), (byte) 14);
        this.w0 = new c15(0, new LayoutNode[16]);
        this.x0 = true;
        this.y0 = R0;
        this.A0 = q34.a;
        this.B0 = z24.X;
        this.C0 = T0;
        u01.k.getClass();
        this.D0 = t01.b;
        m34 m34Var = m34.Z;
        this.E0 = m34Var;
        this.F0 = m34Var;
        this.H0 = new t6(this);
        this.I0 = new r34(this);
        this.L0 = true;
        this.M0 = hx4.X;
    }

    public static void W(LayoutNode layoutNode, boolean z, int i) {
        LayoutNode layoutNodeW;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.k0 == null) {
            wc3.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        mf5 mf5Var = layoutNode.q0;
        if (mf5Var == null || layoutNode.s0 || layoutNode.X) {
            return;
        }
        ((AndroidComposeView) mf5Var).u(layoutNode, true, z, z2);
        if (z3) {
            bj4 bj4Var = layoutNode.I0.q;
            bj4Var.getClass();
            r34 r34Var = bj4Var.h0;
            LayoutNode layoutNodeW2 = r34Var.a.w();
            m34 m34Var = r34Var.a.E0;
            if (layoutNodeW2 == null || m34Var == m34.Z) {
                return;
            }
            while (layoutNodeW2.E0 == m34Var && (layoutNodeW = layoutNodeW2.w()) != null) {
                layoutNodeW2 = layoutNodeW;
            }
            int iOrdinal = m34Var.ordinal();
            if (iOrdinal == 0) {
                if (layoutNodeW2.k0 != null) {
                    W(layoutNodeW2, z, 6);
                    return;
                } else {
                    Y(layoutNodeW2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                bt.i("Intrinsics isn't used by the parent");
            } else if (layoutNodeW2.k0 != null) {
                layoutNodeW2.V(z);
            } else {
                layoutNodeW2.X(z);
            }
        }
    }

    public static void Y(LayoutNode layoutNode, boolean z, int i) {
        mf5 mf5Var;
        LayoutNode layoutNodeW;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.s0 || layoutNode.X || (mf5Var = layoutNode.q0) == null) {
            return;
        }
        ((AndroidComposeView) mf5Var).u(layoutNode, false, z, z2);
        if (z3) {
            r34 r34Var = layoutNode.I0.p.h0;
            LayoutNode layoutNodeW2 = r34Var.a.w();
            m34 m34Var = r34Var.a.E0;
            if (layoutNodeW2 == null || m34Var == m34.Z) {
                return;
            }
            while (layoutNodeW2.E0 == m34Var && (layoutNodeW = layoutNodeW2.w()) != null) {
                layoutNodeW2 = layoutNodeW;
            }
            int iOrdinal = m34Var.ordinal();
            if (iOrdinal == 0) {
                Y(layoutNodeW2, z, 6);
            } else if (iOrdinal == 1) {
                layoutNodeW2.X(z);
            } else {
                bt.i("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void Z(LayoutNode layoutNode) {
        int i = n34.a[layoutNode.I0.d.ordinal()];
        r34 r34Var = layoutNode.I0;
        if (i != 1) {
            bt.p(r34Var.d, "Unexpected state ");
            return;
        }
        if (r34Var.e) {
            W(layoutNode, true, 6);
            return;
        }
        if (r34Var.f) {
            layoutNode.V(true);
        }
        if (layoutNode.q()) {
            Y(layoutNode, true, 6);
        } else if (layoutNode.p()) {
            layoutNode.X(true);
        }
    }

    private final String j(LayoutNode instance) {
        String strG = g(0);
        LayoutNode layoutNode = instance.p0;
        return "Cannot insert " + instance + " because it already has a parent or an owner. This tree: " + strG + " Other tree: " + (layoutNode != null ? layoutNode.g(0) : null);
    }

    public final float A() {
        return this.I0.p.H0;
    }

    public final c15 B() {
        boolean z = this.x0;
        c15 c15Var = this.w0;
        if (z) {
            c15Var.g();
            c15Var.c(c15Var.Z, C());
            Arrays.sort(c15Var.X, 0, c15Var.Z, U0);
            this.x0 = false;
        }
        return c15Var;
    }

    public final c15 C() {
        i0();
        if (this.l0 == 0) {
            return (c15) this.m0.Y;
        }
        c15 c15Var = this.n0;
        c15Var.getClass();
        return c15Var;
    }

    public final void D(long j, q03 q03Var, int i, boolean z) {
        i55 outerCoordinator$ui = getOuterCoordinator$ui();
        dx4 dx4Var = i55.X0;
        getOuterCoordinator$ui().b1(i55.c1, outerCoordinator$ui.S0(j), q03Var, i, z);
    }

    public final void E(int i, LayoutNode layoutNode) {
        if (layoutNode.p0 != null && layoutNode.q0 != null) {
            wc3.b(j(layoutNode));
        }
        layoutNode.p0 = this;
        zz2 zz2Var = this.m0;
        ((c15) zz2Var.Y).a(i, layoutNode);
        ((tb2) zz2Var.Z).invoke();
        R();
        if (layoutNode.X) {
            this.l0++;
        }
        J();
        mf5 mf5Var = this.q0;
        if (mf5Var != null) {
            layoutNode.d(mf5Var);
        }
        if (layoutNode.I0.l > 0) {
            r34 r34Var = this.I0;
            r34Var.d(r34Var.l + 1);
        }
        if (layoutNode.P0 > 0) {
            d0(this.P0 + 1);
        }
    }

    public final void F() {
        if (this.L0) {
            i55 i55Var = (fd3) this.H0.f0;
            i55 i55Var2 = getOuterCoordinator$ui().y0;
            this.K0 = null;
            while (!dh3.f(i55Var, i55Var2)) {
                if ((i55Var != null ? i55Var.V0 : null) != null) {
                    this.K0 = i55Var;
                    break;
                }
                i55Var = i55Var != null ? i55Var.y0 : null;
            }
            this.L0 = false;
        }
        i55 i55Var3 = this.K0;
        if (i55Var3 != null && i55Var3.V0 == null) {
            throw p61.j("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (i55Var3 != null) {
            i55Var3.d1();
            return;
        }
        LayoutNode layoutNodeW = w();
        if (layoutNodeW != null) {
            layoutNodeW.F();
            return;
        }
        mf5 mf5Var = this.q0;
        if (mf5Var != null) {
            ((AndroidComposeView) mf5Var).invalidate();
        }
    }

    public final void G() {
        i55 outerCoordinator$ui = getOuterCoordinator$ui();
        t6 t6Var = this.H0;
        fd3 fd3Var = (fd3) t6Var.f0;
        while (outerCoordinator$ui != fd3Var) {
            outerCoordinator$ui.getClass();
            i34 i34Var = (i34) outerCoordinator$ui;
            lf5 lf5Var = i34Var.V0;
            if (lf5Var != null) {
                ((au2) lf5Var).c();
            }
            outerCoordinator$ui = i34Var.x0;
        }
        lf5 lf5Var2 = ((fd3) t6Var.f0).V0;
        if (lf5Var2 != null) {
            ((au2) lf5Var2).c();
        }
    }

    public final void H() {
        if (this.X) {
            LayoutNode layoutNodeW = w();
            if (layoutNodeW != null) {
                layoutNodeW.H();
                return;
            }
            return;
        }
        if (this.k0 != null) {
            W(this, false, 7);
        } else {
            Y(this, false, 7);
        }
    }

    public final void I() {
        if (this.v0) {
            return;
        }
        if (((d55) this.H0.Z).h0 != null || this.N0 != null) {
            this.t0 = true;
            return;
        }
        t07 t07Var = this.u0;
        this.v0 = true;
        ea6 ea6Var = new ea6();
        ea6Var.X = new t07();
        of5 snapshotObserver = q34.a(this).getSnapshotObserver();
        a23 a23Var = new a23((Object) this, (Object) ea6Var, (byte) 2);
        snapshotObserver.a.c(this, snapshotObserver.d, a23Var);
        this.v0 = false;
        this.u0 = (t07) ea6Var.X;
        this.t0 = false;
        mf5 mf5VarA = q34.a(this);
        mf5VarA.getSemanticsOwner().b(this, t07Var);
        ((AndroidComposeView) mf5VarA).w();
    }

    public final void J() {
        LayoutNode layoutNode;
        if (this.l0 > 0) {
            this.o0 = true;
        }
        if (!this.X || (layoutNode = this.p0) == null) {
            return;
        }
        layoutNode.J();
    }

    public final boolean K() {
        return this.q0 != null;
    }

    public final boolean L() {
        return this.I0.p.v0;
    }

    public final Boolean M() {
        bj4 bj4Var = this.I0.q;
        if (bj4Var != null) {
            return Boolean.valueOf(bj4Var.t0 != aj4.Z);
        }
        return null;
    }

    public final void N() {
        LayoutNode layoutNodeW;
        if (this.E0 == m34.Z) {
            f();
        }
        bj4 bj4Var = this.I0.q;
        bj4Var.getClass();
        boolean z = true;
        try {
            bj4Var.i0 = true;
            if (!bj4Var.n0) {
                wc3.b("replace() called on item that was not placed");
            }
            bj4Var.E0 = false;
            if (bj4Var.t0 == aj4.Z) {
                z = false;
            }
            bj4Var.q0(bj4Var.q0, bj4Var.r0, bj4Var.s0);
            if (z && !bj4Var.E0 && (layoutNodeW = bj4Var.h0.a.w()) != null) {
                layoutNodeW.V(false);
            }
        } finally {
            bj4Var.i0 = false;
        }
    }

    public final void O(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            zz2 zz2Var = this.m0;
            c15 c15Var = (c15) zz2Var.Y;
            tb2 tb2Var = (tb2) zz2Var.Z;
            Object objK = c15Var.k(i5);
            tb2Var.invoke();
            ((c15) zz2Var.Y).a(i6, (LayoutNode) objK);
            tb2Var.invoke();
        }
        R();
        J();
        H();
    }

    public final void P(LayoutNode layoutNode) {
        if (layoutNode.I0.l > 0) {
            r34 r34Var = this.I0;
            r34Var.d(r34Var.l - 1);
        }
        if (this.q0 != null) {
            layoutNode.h();
        }
        layoutNode.p0 = null;
        if (layoutNode.P0 > 0) {
            d0(this.P0 - 1);
        }
        layoutNode.getOuterCoordinator$ui().y0 = null;
        if (layoutNode.X) {
            this.l0--;
            c15 c15Var = (c15) layoutNode.m0.Y;
            Object[] objArr = c15Var.X;
            int i = c15Var.Z;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getOuterCoordinator$ui().y0 = null;
            }
        }
        J();
        R();
    }

    public final void Q(i55 i55Var) {
        mf5 mf5Var = this.q0;
        u86 rectManager = mf5Var != null ? mf5Var.getRectManager() : null;
        r34 r34Var = this.I0;
        boolean z = r34Var.d != k34.g0 || q() || p();
        if (this.i0 != -4 && rectManager != null) {
            if (i55Var == getOuterCoordinator$ui()) {
                this.h0 = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.g0 = true;
                c15 c15VarC = C();
                Object[] objArr = c15VarC.X;
                int i = c15VarC.Z;
                for (int i2 = 0; i2 < i; i2++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    layoutNode.h0 = true;
                    if (!z) {
                        rectManager.g(layoutNode);
                    }
                }
                if (this.i0 != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.c;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        r34Var.p.s0();
    }

    public final void R() {
        if (!this.X) {
            this.x0 = true;
            return;
        }
        LayoutNode layoutNodeW = w();
        if (layoutNodeW != null) {
            layoutNodeW.R();
        }
    }

    public final void S() {
        zz2 zz2Var = this.m0;
        int i = ((c15) zz2Var.Y).Z;
        while (true) {
            i--;
            c15 c15Var = (c15) zz2Var.Y;
            if (-1 >= i) {
                c15Var.g();
                ((tb2) zz2Var.Z).invoke();
                return;
            }
            P((LayoutNode) c15Var.X[i]);
        }
    }

    public final void T(int i, int i2) {
        if (i2 < 0) {
            wc3.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            zz2 zz2Var = this.m0;
            P((LayoutNode) ((c15) zz2Var.Y).X[i3]);
            Object objK = ((c15) zz2Var.Y).k(i3);
            ((tb2) zz2Var.Z).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void U() {
        LayoutNode layoutNodeW;
        if (this.E0 == m34.Z) {
            f();
        }
        wr4 wr4Var = this.I0.p;
        r34 r34Var = wr4Var.h0;
        try {
            wr4Var.i0 = true;
            if (!wr4Var.m0) {
                wc3.b("replace called on unplaced item");
            }
            boolean z = wr4Var.v0;
            wr4Var.m0(wr4Var.p0, wr4Var.s0, wr4Var.q0, wr4Var.r0);
            if (z && !wr4Var.I0 && (layoutNodeW = r34Var.a.w()) != null) {
                layoutNodeW.X(false);
            }
            wr4Var.i0 = false;
        } catch (Throwable th) {
            try {
                r34Var.a.b0(th);
                throw null;
            } catch (Throwable th2) {
                wr4Var.i0 = false;
                throw th2;
            }
        }
    }

    public final void V(boolean z) {
        mf5 mf5Var;
        if (this.X || (mf5Var = this.q0) == null) {
            return;
        }
        ((AndroidComposeView) mf5Var).v(this, true, z);
    }

    public final void X(boolean z) {
        mf5 mf5Var;
        if (this.X || (mf5Var = this.q0) == null) {
            return;
        }
        ((AndroidComposeView) mf5Var).v(this, false, z);
    }

    @Override // defpackage.jz0
    public final void a() {
        b44 b44Var = this.J0;
        if (b44Var != null) {
            b44Var.a();
        }
        i55 i55Var = ((fd3) this.H0.f0).x0;
        for (i55 outerCoordinator$ui = getOuterCoordinator$ui(); !dh3.f(outerCoordinator$ui, i55Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.x0) {
            outerCoordinator$ui.i1();
        }
    }

    public final void a0() {
        c15 c15VarC = C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            m34 m34Var = layoutNode.F0;
            layoutNode.E0 = m34Var;
            if (m34Var != m34.Z) {
                layoutNode.a0();
            }
        }
    }

    @Override // defpackage.jz0
    public final void b() {
        ua autofillManager;
        b44 b44Var = this.J0;
        if (b44Var != null) {
            b44Var.i(true);
        }
        this.Q0 = true;
        jx4 jx4Var = (f18) this.H0.h0;
        for (jx4 jx4Var2 = jx4Var; jx4Var2 != null; jx4Var2 = jx4Var2.g0) {
            if (jx4Var2.p0) {
                jx4Var2.T0();
            }
        }
        for (jx4 jx4Var3 = jx4Var; jx4Var3 != null; jx4Var3 = jx4Var3.g0) {
            if (jx4Var3.p0) {
                jx4Var3.V0();
            }
        }
        while (jx4Var != null) {
            if (jx4Var.p0) {
                jx4Var.P0();
            }
            jx4Var = jx4Var.g0;
        }
        if (K()) {
            this.u0 = null;
            this.t0 = false;
        }
        mf5 mf5Var = this.q0;
        if (mf5Var != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) mf5Var;
            if (AndroidComposeView.b() && (autofillManager = androidComposeView.getAutofillManager()) != null && autofillManager.j0.e(this.Y)) {
                autofillManager.X.f(autofillManager.Z, this.Y, false);
            }
        }
    }

    public final void b0(Throwable th) {
        u01 u01Var = this.D0;
        ox1 ox1Var = q01.a;
        kl5 kl5Var = (kl5) u01Var;
        kl5Var.getClass();
        p01 p01Var = (p01) x97.S(kl5Var, ox1Var);
        if (p01Var == null) {
            throw th;
        }
        os4.U(th, new p5(p01Var, this, (byte) 18));
        throw th;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6011. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.kx4 r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.c(kx4):void");
    }

    public final void c0(fi1 fi1Var) {
        if (dh3.f(this.A0, fi1Var)) {
            return;
        }
        this.A0 = fi1Var;
        H();
        LayoutNode layoutNodeW = w();
        if (layoutNodeW != null) {
            layoutNodeW.F();
        } else {
            mf5 mf5Var = this.q0;
            if (mf5Var != null) {
                ((AndroidComposeView) mf5Var).invalidate();
            }
        }
        G();
        for (jx4 jx4Var = (jx4) this.H0.i0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.c();
        }
    }

    public final void d(mf5 mf5Var) {
        LayoutNode layoutNode;
        ua autofillManager;
        t07 t07VarY;
        if (this.q0 != null) {
            wc3.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        LayoutNode layoutNode2 = this.p0;
        if (layoutNode2 != null && !dh3.f(layoutNode2.q0, mf5Var)) {
            LayoutNode layoutNodeW = w();
            mf5 mf5Var2 = layoutNodeW != null ? layoutNodeW.q0 : null;
            String strG = g(0);
            LayoutNode layoutNode3 = this.p0;
            wc3.b("Attaching to a different owner(" + mf5Var + ") than the parent's owner(" + mf5Var2 + "). This tree: " + strG + " Parent tree: " + (layoutNode3 != null ? layoutNode3.g(0) : null));
        }
        LayoutNode layoutNodeW2 = w();
        r34 r34Var = this.I0;
        if (layoutNodeW2 == null) {
            r34Var.p.v0 = true;
            mf5Var.getRectManager().g(this);
            bj4 bj4Var = r34Var.q;
            if (bj4Var != null) {
                bj4Var.t0 = aj4.X;
            }
        }
        getOuterCoordinator$ui().y0 = layoutNodeW2 != null ? (fd3) layoutNodeW2.H0.f0 : null;
        this.q0 = mf5Var;
        this.r0 = (layoutNodeW2 != null ? layoutNodeW2.r0 : -1) + 1;
        kx4 kx4Var = this.N0;
        if (kx4Var != null) {
            c(kx4Var);
        }
        this.N0 = null;
        ((AndroidComposeView) mf5Var).getLayoutNodes().h(this.Y, this);
        LayoutNode layoutNode4 = this.p0;
        if (layoutNode4 == null || (layoutNode = layoutNode4.k0) == null) {
            layoutNode = this.k0;
        }
        e0(layoutNode);
        LayoutNode layoutNode5 = this.k0;
        t6 t6Var = this.H0;
        if (layoutNode5 == null && t6Var.j(512)) {
            e0(this);
        }
        if (!this.Q0) {
            for (jx4 jx4Var = (jx4) t6Var.i0; jx4Var != null; jx4Var = jx4Var.h0) {
                jx4Var.O0();
            }
        }
        c15 c15Var = (c15) this.m0.Y;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).d(mf5Var);
        }
        if (!this.Q0) {
            t6Var.m();
        }
        H();
        if (layoutNodeW2 != null) {
            layoutNodeW2.H();
        }
        r34Var.j();
        if (!this.Q0 && t6Var.j(8)) {
            I();
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) mf5Var;
        if (!AndroidComposeView.b() || (autofillManager = androidComposeView.getAutofillManager()) == null || (t07VarY = y()) == null || !t07VarY.X.b(c17.r)) {
            return;
        }
        autofillManager.j0.a(this.Y);
        autofillManager.X.f(autofillManager.Z, this.Y, true);
    }

    public final void d0(int i) {
        LayoutNode layoutNodeW;
        LayoutNode layoutNodeW2;
        int i2 = this.P0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (layoutNodeW2 = w()) != null) {
                layoutNodeW2.d0(layoutNodeW2.P0 + 1);
            }
            if (i == 0 && this.P0 > 0 && (layoutNodeW = w()) != null) {
                layoutNodeW.d0(layoutNodeW.P0 - 1);
            }
            this.P0 = i;
        }
    }

    public final void e() {
        this.F0 = this.E0;
        m34 m34Var = m34.Z;
        this.E0 = m34Var;
        c15 c15VarC = C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.E0 != m34Var) {
                layoutNode.e();
            }
        }
    }

    public final void e0(LayoutNode layoutNode) {
        if (dh3.f(layoutNode, this.k0)) {
            return;
        }
        this.k0 = layoutNode;
        r34 r34Var = this.I0;
        if (layoutNode != null) {
            if (r34Var.q == null) {
                r34Var.q = new bj4(r34Var);
            }
            i55 i55Var = ((fd3) this.H0.f0).x0;
            for (i55 outerCoordinator$ui = getOuterCoordinator$ui(); !dh3.f(outerCoordinator$ui, i55Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.x0) {
                outerCoordinator$ui.Q0();
            }
        } else {
            r34Var.q = null;
            r34Var.f = false;
            r34Var.e = false;
        }
        H();
    }

    public final void f() {
        this.F0 = this.E0;
        this.E0 = m34.Z;
        c15 c15VarC = C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.E0 == m34.Y) {
                layoutNode.f();
            }
        }
    }

    public final void f0(xr4 xr4Var) {
        if (dh3.f(this.y0, xr4Var)) {
            return;
        }
        this.y0 = xr4Var;
        zz2 zz2Var = this.z0;
        if (zz2Var != null) {
            ((rh5) zz2Var.Z).setValue(xr4Var);
        }
        H();
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        c15 c15VarC = C();
        Object[] objArr = c15VarC.X;
        int i3 = c15VarC.Z;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void g0(kx4 kx4Var) {
        if (this.X && this.M0 != hx4.X) {
            wc3.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Q0) {
            wc3.a("modifier is updated when deactivated");
        }
        if (!K()) {
            this.N0 = kx4Var;
            return;
        }
        c(kx4Var);
        if (this.t0) {
            I();
        }
    }

    public final List<LayoutNode> getChildren$ui() {
        return C().f();
    }

    public List<LayoutNode> getChildrenInfo() {
        return getChildren$ui();
    }

    public final i55 getOuterCoordinator$ui() {
        return (i55) this.H0.g0;
    }

    public final void h() {
        ua autofillManager;
        o34 o34Var;
        mf5 mf5Var = this.q0;
        if (mf5Var == null) {
            LayoutNode layoutNodeW = w();
            wc3.c("Cannot detach node that is already detached!  Tree: " + (layoutNodeW != null ? layoutNodeW.g(0) : null));
            b61.n();
            return;
        }
        LayoutNode layoutNodeW2 = w();
        r34 r34Var = this.I0;
        if (layoutNodeW2 != null) {
            layoutNodeW2.F();
            layoutNodeW2.H();
            wr4 wr4Var = r34Var.p;
            m34 m34Var = m34.Z;
            wr4Var.n0 = m34Var;
            bj4 bj4Var = r34Var.q;
            if (bj4Var != null) {
                bj4Var.l0 = m34Var;
            }
        }
        o34 o34Var2 = r34Var.p.A0;
        o34Var2.b = true;
        o34Var2.c = false;
        o34Var2.e = false;
        o34Var2.d = false;
        o34Var2.f = false;
        o34Var2.g = false;
        o34Var2.h = null;
        bj4 bj4Var2 = r34Var.q;
        if (bj4Var2 != null && (o34Var = bj4Var2.u0) != null) {
            o34Var.b = true;
            o34Var.c = false;
            o34Var.e = false;
            o34Var.d = false;
            o34Var.f = false;
            o34Var.g = false;
            o34Var.h = null;
        }
        t6 t6Var = this.H0;
        fd3 fd3Var = (fd3) t6Var.f0;
        jx4 jx4Var = (f18) t6Var.h0;
        i55 i55Var = fd3Var.x0;
        for (i55 outerCoordinator$ui = getOuterCoordinator$ui(); !dh3.f(outerCoordinator$ui, i55Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.x0) {
            outerCoordinator$ui.o1();
            if (outerCoordinator$ui.w0.L()) {
                outerCoordinator$ui.j1();
            }
        }
        for (jx4 jx4Var2 = jx4Var; jx4Var2 != null; jx4Var2 = jx4Var2.g0) {
            if (jx4Var2.p0) {
                jx4Var2.V0();
            }
        }
        this.s0 = true;
        c15 c15Var = (c15) this.m0.Y;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).h();
        }
        this.s0 = false;
        while (jx4Var != null) {
            if (jx4Var.p0) {
                jx4Var.P0();
            }
            jx4Var = jx4Var.g0;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) mf5Var;
        androidComposeView.getLayoutNodes().g(this.Y);
        ri1 ri1Var = androidComposeView.U0;
        lr lrVar = (lr) ri1Var.d;
        ((yr2) lrVar.Y).s(this);
        ((yr2) lrVar.Z).s(this);
        ((yr2) lrVar.f0).s(this);
        ((c15) ((zz2) ri1Var.e).Y).j(this);
        androidComposeView.O0 = true;
        if (AndroidComposeView.b() && (autofillManager = androidComposeView.getAutofillManager()) != null && autofillManager.j0.e(this.Y)) {
            autofillManager.X.f(autofillManager.Z, this.Y, false);
        }
        mf5Var.getRectManager().h(this);
        this.q0 = null;
        e0(null);
        this.r0 = 0;
        wr4 wr4Var2 = r34Var.p;
        wr4Var2.k0 = Integer.MAX_VALUE;
        wr4Var2.j0 = Integer.MAX_VALUE;
        wr4Var2.v0 = false;
        bj4 bj4Var3 = r34Var.q;
        if (bj4Var3 != null) {
            bj4Var3.k0 = Integer.MAX_VALUE;
            bj4Var3.j0 = Integer.MAX_VALUE;
            bj4Var3.t0 = aj4.Z;
        }
        if (t6Var.j(8)) {
            t07 t07Var = this.u0;
            this.u0 = null;
            this.t0 = false;
            mf5Var.getSemanticsOwner().b(this, t07Var);
            androidComposeView.w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void h0(fw8 fw8Var) {
        if (dh3.f(this.C0, fw8Var)) {
            return;
        }
        this.C0 = fw8Var;
        jx4 jx4Var = (jx4) this.H0.i0;
        if ((jx4Var.f0 & 16) != 0) {
            while (jx4Var != null) {
                if ((jx4Var.Z & 16) != 0) {
                    ?? T = jx4Var;
                    ?? c15Var = 0;
                    while (T != 0) {
                        if (T instanceof kq5) {
                            ((kq5) T).F0();
                        } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                            jx4 jx4Var2 = ((oh1) T).r0;
                            int i = 0;
                            T = T;
                            c15Var = c15Var;
                            while (jx4Var2 != null) {
                                if ((jx4Var2.Z & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c15Var = c15Var;
                                        T = jx4Var2;
                                    } else {
                                        if (c15Var == 0) {
                                            c15Var = new c15(0, new jx4[16]);
                                        }
                                        if (T != 0) {
                                            c15Var.b(T);
                                            T = 0;
                                        }
                                        c15Var.b(jx4Var2);
                                    }
                                }
                                jx4Var2 = jx4Var2.h0;
                                T = T;
                                c15Var = c15Var;
                            }
                            if (i == 1) {
                            }
                        }
                        T = yn0.T(c15Var);
                    }
                }
                if ((jx4Var.f0 & 16) == 0) {
                    return;
                } else {
                    jx4Var = jx4Var.h0;
                }
            }
        }
    }

    public final void i(sm0 sm0Var, xt2 xt2Var) {
        try {
            getOuterCoordinator$ui().O0(sm0Var, xt2Var);
        } catch (Throwable th) {
            b0(th);
            throw null;
        }
    }

    public final void i0() {
        if (this.l0 <= 0 || !this.o0) {
            return;
        }
        this.o0 = false;
        c15 c15Var = this.n0;
        if (c15Var == null) {
            c15Var = new c15(0, new LayoutNode[16]);
            this.n0 = c15Var;
        }
        c15Var.g();
        c15 c15Var2 = (c15) this.m0.Y;
        Object[] objArr = c15Var2.X;
        int i = c15Var2.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.X) {
                c15Var.c(c15Var.Z, layoutNode.C());
            } else {
                c15Var.b(layoutNode);
            }
        }
        r34 r34Var = this.I0;
        r34Var.p.C0 = true;
        bj4 bj4Var = r34Var.q;
        if (bj4Var != null) {
            bj4Var.w0 = true;
        }
    }

    public final void k() {
        if (this.k0 != null) {
            W(this, false, 5);
        } else {
            Y(this, false, 5);
        }
        wr4 wr4Var = this.I0.p;
        q31 q31Var = wr4Var.l0 ? new q31(wr4Var.f0) : null;
        mf5 mf5Var = this.q0;
        if (q31Var != null) {
            if (mf5Var != null) {
                ((AndroidComposeView) mf5Var).r(this, q31Var.a);
            }
        } else if (mf5Var != null) {
            ((AndroidComposeView) mf5Var).q(true);
        }
    }

    public final List l() {
        bj4 bj4Var = this.I0.q;
        bj4Var.getClass();
        c15 c15Var = bj4Var.v0;
        r34 r34Var = bj4Var.h0;
        r34Var.a.getChildren$ui();
        if (!bj4Var.w0) {
            return c15Var.f();
        }
        LayoutNode layoutNode = r34Var.a;
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (c15Var.Z <= i2) {
                bj4 bj4Var2 = layoutNode2.I0.q;
                bj4Var2.getClass();
                c15Var.b(bj4Var2);
            } else {
                bj4 bj4Var3 = layoutNode2.I0.q;
                bj4Var3.getClass();
                Object[] objArr2 = c15Var.X;
                Object obj = objArr2[i2];
                objArr2[i2] = bj4Var3;
            }
        }
        c15Var.l(layoutNode.getChildren$ui().size(), c15Var.Z);
        bj4Var.w0 = false;
        return c15Var.f();
    }

    public final List m() {
        return this.I0.p.a0();
    }

    public final List n() {
        return ((c15) this.m0.Y).f();
    }

    public final int o() {
        return this.I0.p.Y;
    }

    public final boolean p() {
        return this.I0.p.y0;
    }

    public final boolean q() {
        return this.I0.p.x0;
    }

    public final m34 r() {
        return this.I0.p.n0;
    }

    public final m34 s() {
        m34 m34Var;
        bj4 bj4Var = this.I0.q;
        return (bj4Var == null || (m34Var = bj4Var.l0) == null) ? m34.Z : m34Var;
    }

    @Override // defpackage.nf5
    public final boolean t() {
        return K();
    }

    public final String toString() {
        return z91.P(this) + " children: " + getChildren$ui().size() + " measurePolicy: " + this.y0 + " deactivated: " + this.Q0 + " isVirtual: " + this.X + " isPlaced: " + L();
    }

    public final List u() {
        t6 t6Var = this.H0;
        j05 j05Var = (j05) t6Var.j0;
        if (j05Var.i()) {
            return d02.X;
        }
        j05 j05Var2 = new j05(j05Var.b);
        jx4 jx4Var = (jx4) t6Var.i0;
        byte b = 0;
        int i = 0;
        while (jx4Var != null) {
            f18 f18Var = (f18) t6Var.h0;
            if (jx4Var == f18Var) {
                break;
            }
            i55 i55Var = jx4Var.j0;
            lf5 lf5Var = null;
            if (i55Var == null) {
                bt.q("getModifierInfo called on node with no coordinator");
                return null;
            }
            lf5 lf5Var2 = i55Var.V0;
            lf5 lf5Var3 = ((fd3) t6Var.f0).V0;
            jx4 jx4Var2 = jx4Var.h0;
            if (jx4Var2 == f18Var && i55Var != jx4Var2.j0) {
                lf5Var = lf5Var3;
            }
            if (lf5Var2 == null) {
                lf5Var2 = lf5Var;
            }
            j05Var2.a(new lx4((kx4) j05Var.g(i), i55Var, lf5Var2));
            jx4Var = jx4Var.h0;
            i++;
        }
        h05 h05Var = j05Var2.c;
        if (h05Var != null) {
            return h05Var;
        }
        h05 h05Var2 = new h05(j05Var2, b);
        j05Var2.c = h05Var2;
        return h05Var2;
    }

    public final zz2 v() {
        zz2 zz2Var = this.z0;
        if (zz2Var != null) {
            return zz2Var;
        }
        zz2 zz2Var2 = new zz2(this, this.y0);
        this.z0 = zz2Var2;
        return zz2Var2;
    }

    public final LayoutNode w() {
        LayoutNode layoutNode = this.p0;
        while (layoutNode != null && layoutNode.X) {
            layoutNode = layoutNode.p0;
        }
        return layoutNode;
    }

    public final int x() {
        return this.I0.p.k0;
    }

    public final t07 y() {
        if (K() && !this.Q0 && this.H0.j(8)) {
            return this.u0;
        }
        return null;
    }

    public final int z() {
        return this.I0.p.X;
    }

    public LayoutNode(int i) {
        this(v07.a.addAndGet(1), (i & 1) == 0);
    }
}
