package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ci2 extends oh1 implements w07, as2, s01, w85, ye8 {
    public static final k42 y0 = new k42();
    public xz4 s0;
    public final gn2 t0;
    public yg2 u0;
    public k64 v0;
    public i55 w0;
    public final ai2 x0;

    public ci2(xz4 xz4Var, int i, gn2 gn2Var) {
        this.s0 = xz4Var;
        this.t0 = gn2Var;
        ai2 ai2Var = new ai2(i, new yn1(2, this, ci2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 1), 10);
        Y0(ai2Var);
        this.x0 = ai2Var;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void S0() {
        k64 k64Var = this.v0;
        if (k64Var != null) {
            k64Var.b();
        }
        this.v0 = null;
    }

    public final void b1(xz4 xz4Var, vf3 vf3Var) {
        if (!this.p0) {
            xz4Var.b(vf3Var);
            return;
        }
        bm3 bm3Var = (bm3) ((m51) M0()).Y.H0(oy1.E0);
        w51.G(M0(), null, null, new r0((Object) xz4Var, (Object) vf3Var, (Object) (bm3Var != null ? bm3Var.D(new p0(xz4Var, vf3Var, (byte) 25)) : null), (q51) null, (byte) 22), 3);
    }

    public final void c1() {
        t6 t6Var;
        if (this.p0) {
            if (!this.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4 jx4Var = this.X.g0;
            LayoutNode layoutNodeZ = yn0.Z(this);
            while (layoutNodeZ != null) {
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 262144) != 0) {
                    while (jx4Var != null) {
                        if ((jx4Var.Z & 262144) != 0) {
                            jx4 jx4VarT = jx4Var;
                            c15 c15Var = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ye8) {
                                    if (di2.q0 == ((ye8) jx4VarT).o()) {
                                        return;
                                    }
                                }
                                if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                    int i = 0;
                                    for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                        if ((jx4Var2.Z & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                jx4VarT = jx4Var2;
                                            } else {
                                                if (c15Var == null) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var.b(jx4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var);
                            }
                        }
                        jx4Var = jx4Var.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
            }
        }
    }

    public final void d1(xz4 xz4Var) {
        yg2 yg2Var;
        if (dh3.f(this.s0, xz4Var)) {
            return;
        }
        xz4 xz4Var2 = this.s0;
        if (xz4Var2 != null && (yg2Var = this.u0) != null) {
            xz4Var2.b(new zg2(yg2Var));
        }
        this.u0 = null;
        this.s0 = xz4Var;
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        this.w0 = i55Var;
        if (this.x0.d1().b()) {
            if (!i55Var.V0().p0) {
                c1();
                return;
            }
            i55 i55Var2 = this.w0;
            if (i55Var2 == null || !i55Var2.V0().p0) {
                return;
            }
            c1();
        }
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        boolean zB = this.x0.d1().b();
        nw3[] nw3VarArr = d17.a;
        e17 e17Var = c17.l;
        nw3 nw3Var = d17.a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        e17Var.getClass();
        f17Var.a(e17Var, boolValueOf);
        f17Var.a(s07.w, new q3(null, new ub(0, this, ci2.class, "requestFocus", "requestFocus()Z", 0, (byte) 12)));
    }

    @Override // defpackage.ye8
    public final Object o() {
        return y0;
    }

    @Override // defpackage.w85
    public final void q0() {
        ea6 ea6Var = new ea6();
        ch3.N(this, new p5(ea6Var, this, (byte) 24));
        k64 k64Var = (k64) ea6Var.X;
        if (this.x0.d1().b()) {
            k64 k64Var2 = this.v0;
            if (k64Var2 != null) {
                k64Var2.b();
            }
            if (k64Var != null) {
                k64Var.a();
            } else {
                k64Var = null;
            }
            this.v0 = k64Var;
        }
    }

    public ci2(xz4 xz4Var, t48 t48Var, int i) {
        this(xz4Var, 1, (i & 4) != 0 ? null : t48Var);
    }
}
