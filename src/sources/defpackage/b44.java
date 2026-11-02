package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b44 implements jz0 {
    public final LayoutNode X;
    public m01 Y;
    public yp7 Z;
    public int f0;
    public int g0;
    public final s05 h0;
    public final s05 i0;
    public final v34 j0;
    public final s34 k0;
    public final s05 l0;
    public final xp7 m0;
    public final s05 n0;
    public final c15 o0;
    public int p0;
    public int q0;
    public final String r0;

    public b44(LayoutNode layoutNode, yp7 yp7Var) {
        this.X = layoutNode;
        this.Z = yp7Var;
        long[] jArr = uw6.a;
        this.h0 = new s05();
        this.i0 = new s05();
        this.j0 = new v34(this);
        this.k0 = new s34(this);
        this.l0 = new s05();
        this.m0 = new xp7();
        this.n0 = new s05();
        this.o0 = new c15(0, new Object[16]);
        this.r0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(t34 t34Var) {
        t05 t05Var;
        mj5 mj5Var = t34Var.f;
        if (mj5Var != null) {
            mj5Var.h.set(oj5.Y);
            p91 p91Var = mj5Var.k;
            if (((t05) p91Var.d).h()) {
                t05Var = (t05) p91Var.d;
                t05 t05Var2 = vw6.a;
                p91Var.d = new t05();
                ((c15) p91Var.c).g();
            } else {
                t05Var = null;
            }
            p91Var.c();
            r01 r01Var = mj5Var.a;
            r01Var.s0 = null;
            if (t05Var != null) {
                r01Var.w0.k = t05Var;
                r01Var.y0 = (byte) 2;
            }
            t34Var.f = null;
            r01 r01Var2 = t34Var.c;
            if (r01Var2 != null) {
                r01Var2.m();
            }
            t34Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.jz0
    public final void a() {
        r01 r01Var;
        LayoutNode layoutNode = this.X;
        layoutNode.s0 = true;
        s05 s05Var = this.h0;
        Object[] objArr = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (r01Var = ((t34) objArr[(i << 3) + i3]).c) != null) {
                            r01Var.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        layoutNode.S();
        layoutNode.s0 = false;
        s05Var.a();
        this.i0.a();
        this.q0 = 0;
        this.p0 = 0;
        this.l0.a();
        h();
    }

    @Override // defpackage.jz0
    public final void b() {
        i(true);
    }

    public final void c(t34 t34Var, boolean z) {
        mj5 mj5Var = t34Var.f;
        if (mj5Var != null) {
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                LayoutNode layoutNode = this.X;
                layoutNode.s0 = true;
                if (z) {
                    while (!mj5Var.c()) {
                        try {
                            mj5Var.e(new xw3());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                mj5Var.a();
                t34Var.f = null;
                layoutNode.s0 = false;
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            } catch (Throwable th2) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th2;
            }
        }
    }

    public final up7 e(Object obj) {
        return !this.X.K() ? new y34() : new z34(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.p0 = 0;
        List listN = this.X.n();
        h05 h05Var = (h05) listN;
        int i2 = (((c15) h05Var.Y).Z - this.q0) - 1;
        if (i <= i2) {
            this.m0.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.h0.g((LayoutNode) h05Var.get(i3));
                    objG.getClass();
                    ((l05) this.m0.Y).a(((t34) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.Z.e(this.m0);
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((h05) listN).get(i2);
                    Object objG2 = this.h0.g(layoutNode);
                    objG2.getClass();
                    t34 t34Var = (t34) objG2;
                    Object obj = t34Var.a;
                    if (((l05) this.m0.Y).c(obj)) {
                        this.p0++;
                        if (((Boolean) t34Var.g.getValue()).booleanValue()) {
                            r34 r34Var = layoutNode.I0;
                            wr4 wr4Var = r34Var.p;
                            m34 m34Var = m34.Z;
                            wr4Var.n0 = m34Var;
                            bj4 bj4Var = r34Var.q;
                            if (bj4Var != null) {
                                bj4Var.l0 = m34Var;
                            }
                            l(t34Var, false);
                            if (t34Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.X;
                        layoutNode2.s0 = true;
                        this.h0.j(layoutNode);
                        r01 r01Var = t34Var.c;
                        if (r01Var != null) {
                            r01Var.m();
                        }
                        this.X.T(i2, 1);
                        layoutNode2.s0 = false;
                    }
                    this.i0.j(obj);
                    i2--;
                } catch (Throwable th) {
                    yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                    throw th;
                }
            }
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (kd7.c) {
                t05 t05Var = kd7.j.h;
                if (t05Var != null && t05Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                kd7.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        LayoutNode layoutNode = (LayoutNode) this.l0.j(obj);
        LayoutNode layoutNode2 = this.X;
        if (layoutNode != null) {
            if (this.q0 <= 0) {
                wc3.b("No pre-composed items to dispose");
            }
            int i = ((c15) ((h05) layoutNode2.n()).Y).i(layoutNode);
            if (i < ((c15) ((h05) layoutNode2.n()).Y).Z - this.q0) {
                wc3.b("Item is not in pre-composed item range");
            }
            this.p0++;
            this.q0--;
            t34 t34Var = (t34) this.h0.g(layoutNode);
            if (t34Var != null) {
                d(t34Var);
            }
            int i2 = (((c15) ((h05) layoutNode2.n()).Y).Z - this.q0) - this.p0;
            j(i, i2);
            f(i2);
        }
        if (this.o0.h(obj)) {
            LayoutNode.Y(layoutNode2, true, 6);
        }
    }

    public final void h() {
        int i = ((c15) ((h05) this.X.n()).Y).Z;
        int i2 = this.h0.e;
        if (i2 != i) {
            wc3.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.p0;
        int i4 = this.q0;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbR = oi0.r(i, "Incorrect state. Total children ", i3, ". Reusable children ", ". Precomposed children ");
            sbR.append(i4);
            wc3.a(sbR.toString());
        }
        int i5 = this.l0.e;
        int i6 = this.q0;
        if (i5 == i6) {
            return;
        }
        wc3.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.q0 = 0;
        this.l0.a();
        List listN = this.X.n();
        int i = ((c15) ((h05) listN).Y).Z;
        if (this.p0 != i) {
            this.p0 = i;
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((h05) listN).get(i2);
                    t34 t34Var = (t34) this.h0.g(layoutNode);
                    if (t34Var != null && ((Boolean) t34Var.g.getValue()).booleanValue()) {
                        r34 r34Var = layoutNode.I0;
                        wr4 wr4Var = r34Var.p;
                        m34 m34Var = m34.Z;
                        wr4Var.n0 = m34Var;
                        bj4 bj4Var = r34Var.q;
                        if (bj4Var != null) {
                            bj4Var.l0 = m34Var;
                        }
                        l(t34Var, z);
                        t34Var.a = sp7.a;
                    }
                } catch (Throwable th) {
                    yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                    throw th;
                }
            }
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            this.i0.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        LayoutNode layoutNode = this.X;
        layoutNode.s0 = true;
        layoutNode.O(i, i2, 1);
        layoutNode.s0 = false;
    }

    public final void k(Object obj, rn2 rn2Var, boolean z) {
        LayoutNode layoutNode = this.X;
        if (layoutNode.K()) {
            h();
            if (this.i0.c(obj)) {
                return;
            }
            this.n0.j(obj);
            s05 s05Var = this.l0;
            Object objG = s05Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((c15) ((h05) layoutNode.n()).Y).i(objG), ((c15) ((h05) layoutNode.n()).Y).Z);
                    this.q0++;
                } else {
                    int i = ((c15) ((h05) layoutNode.n()).Y).Z;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.s0 = true;
                    layoutNode.E(i, layoutNode2);
                    layoutNode.s0 = false;
                    this.q0++;
                    objG = layoutNode2;
                }
                s05Var.l(obj, objG);
            }
            m((LayoutNode) objG, obj, z, rn2Var);
        }
    }

    public final void l(t34 t34Var, boolean z) {
        r01 r01Var;
        if (z || !t34Var.h) {
            t34Var.g = z51.H(Boolean.FALSE);
        } else {
            t34Var.g.setValue(Boolean.FALSE);
        }
        if (t34Var.f != null) {
            d(t34Var);
            return;
        }
        if (z) {
            r01 r01Var2 = t34Var.c;
            if (r01Var2 != null) {
                r01Var2.l();
                return;
            }
            return;
        }
        xd5 outOfFrameExecutor = q34.a(this.X).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((AndroidComposeView) outOfFrameExecutor).C(new tb2(t34Var, (byte) 18));
        } else {
            if (t34Var.h || (r01Var = t34Var.c) == null) {
                return;
            }
            r01Var.l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(LayoutNode layoutNode, Object obj, boolean z, rn2 rn2Var) {
        boolean z2;
        r01 r01Var;
        s05 s05Var = this.h0;
        Object objG = s05Var.g(layoutNode);
        Object obj2 = objG;
        if (objG == null) {
            zy0 zy0Var = km4.e;
            t34 t34Var = new t34();
            t34Var.a = obj;
            t34Var.b = zy0Var;
            t34Var.c = null;
            t34Var.g = z51.H(Boolean.TRUE);
            s05Var.l(layoutNode, t34Var);
            obj2 = t34Var;
        }
        t34 t34Var2 = (t34) obj2;
        boolean z3 = t34Var2.b != rn2Var;
        if (t34Var2.f != null) {
            if (z3) {
                d(t34Var2);
            } else if (z) {
                return;
            } else {
                c(t34Var2, true);
            }
        }
        r01 r01Var2 = t34Var2.c;
        if (r01Var2 != null) {
            synchronized (r01Var2.f0) {
                z2 = r01Var2.p0.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || t34Var2.d) {
            t34Var2.b = rn2Var;
            if (t34Var2.f != null) {
                wc3.a("new subcompose call while paused composition is still active");
            }
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                LayoutNode layoutNode2 = this.X;
                layoutNode2.s0 = true;
                r01 r01Var3 = t34Var2.c;
                m01 m01Var = this.Y;
                if (m01Var == null) {
                    wc3.c("parent composition reference not set");
                    throw new o14();
                }
                if (r01Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = m59.a;
                        r01Var = new r01(m01Var, new ml8(layoutNode));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = m59.a;
                        r01Var = new r01(m01Var, new ml8(layoutNode));
                    }
                    r01Var3 = r01Var;
                } else {
                    if (r01Var3.y0 == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = m59.a;
                            r01Var = new r01(m01Var, new ml8(layoutNode));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = m59.a;
                            r01Var = new r01(m01Var, new ml8(layoutNode));
                        }
                        r01Var3 = r01Var;
                    }
                }
                t34Var2.c = r01Var3;
                rn2 zy0Var2 = t34Var2.b;
                if (q34.a(this.X).getOutOfFrameExecutor() != null) {
                    t34Var2.h = false;
                } else {
                    t34Var2.h = true;
                    zy0Var2 = new zy0(1524156494, true, new i9(t34Var2, zy0Var2, (byte) 16));
                }
                if (z) {
                    if (t34Var2.e) {
                        r01Var3.i();
                        r01Var3.q();
                        t34Var2.f = r01Var3.k(true, zy0Var2);
                    } else {
                        t34Var2.f = r01Var3.k(r01Var3.i(), zy0Var2);
                    }
                } else if (t34Var2.e) {
                    r01Var3.i();
                    r01Var3.q();
                    lp2 lp2Var = r01Var3.x0;
                    lp2Var.z = 0;
                    lp2Var.y = true;
                    r01Var3.X.a(r01Var3, zy0Var2);
                    if (lp2Var.F || lp2Var.z != 0) {
                        wr5.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    lp2Var.z = -1;
                    lp2Var.y = false;
                } else {
                    r01Var3.A(zy0Var2);
                }
                t34Var2.e = false;
                layoutNode2.s0 = false;
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                t34Var2.d = false;
            } catch (Throwable th) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th;
            }
        }
    }

    public final LayoutNode n(Object obj) {
        s05 s05Var;
        int i;
        if (this.p0 == 0) {
            return null;
        }
        h05 h05Var = (h05) this.X.n();
        int i2 = ((c15) h05Var.Y).Z - this.q0;
        int i3 = i2 - this.p0;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            s05Var = this.h0;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = s05Var.g((LayoutNode) h05Var.get(i5));
            objG.getClass();
            if (((t34) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = s05Var.g((LayoutNode) h05Var.get(i4));
                objG2.getClass();
                t34 t34Var = (t34) objG2;
                Object obj2 = t34Var.a;
                if (obj2 == sp7.a || this.Z.O(obj, obj2)) {
                    t34Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.p0--;
        LayoutNode layoutNode = (LayoutNode) h05Var.get(i3);
        Object objG3 = s05Var.g(layoutNode);
        objG3.getClass();
        t34 t34Var2 = (t34) objG3;
        t34Var2.g = z51.H(Boolean.TRUE);
        t34Var2.e = true;
        t34Var2.d = true;
        return layoutNode;
    }
}
