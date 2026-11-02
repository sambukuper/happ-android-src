package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r34 {
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public bj4 q;
    public k34 d = k34.g0;
    public final wr4 p = new wr4(this);

    public r34(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final i55 a() {
        return (i55) this.a.H0.g0;
    }

    public final void b() {
        k34 k34Var = this.a.I0.d;
        k34 k34Var2 = k34.Z;
        k34 k34Var3 = k34.f0;
        if (k34Var == k34Var2 || k34Var == k34Var3) {
            if (this.p.D0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (k34Var == k34Var3) {
            bj4 bj4Var = this.q;
            if (bj4Var == null || !bj4Var.x0) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        bj4 bj4Var = this.q;
        if (bj4Var != null) {
            r34 r34Var = bj4Var.h0;
            r34Var.d = k34.Y;
            LayoutNode layoutNode = r34Var.a;
            r34Var.e = false;
            bj4Var.B0 = j;
            of5 snapshotObserver = q34.a(layoutNode).getSnapshotObserver();
            zi4 zi4Var = bj4Var.C0;
            snapshotObserver.a.c(layoutNode, snapshotObserver.b, zi4Var);
            r34Var.f = true;
            r34Var.g = true;
            boolean zT = os4.t(layoutNode);
            wr4 wr4Var = r34Var.p;
            if (zT) {
                wr4Var.y0 = true;
                wr4Var.z0 = true;
            } else {
                wr4Var.x0 = true;
            }
            r34Var.d = k34.g0;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeW = this.a.w();
            r34 r34Var = layoutNodeW != null ? layoutNodeW.I0 : null;
            if (r34Var != null) {
                int i3 = r34Var.l;
                if (i == 0) {
                    r34Var.d(i3 - 1);
                } else {
                    r34Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeW = this.a.w();
            r34 r34Var = layoutNodeW != null ? layoutNodeW.I0 : null;
            if (r34Var != null) {
                int i3 = r34Var.o;
                if (i == 0) {
                    r34Var.e(i3 - 1);
                } else {
                    r34Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        wr4 wr4Var = this.p;
        r34 r34Var = wr4Var.h0;
        Object obj = wr4Var.u0;
        LayoutNode layoutNode = this.a;
        if ((obj != null || r34Var.a().w() != null) && wr4Var.t0) {
            wr4Var.t0 = false;
            wr4Var.u0 = r34Var.a().w();
            LayoutNode layoutNodeW = layoutNode.w();
            if (layoutNodeW != null) {
                LayoutNode.Y(layoutNodeW, false, 7);
            }
        }
        bj4 bj4Var = this.q;
        if (bj4Var != null) {
            r34 r34Var2 = bj4Var.h0;
            if (bj4Var.A0 == null) {
                xi4 xi4VarT0 = r34Var2.a().T0();
                xi4VarT0.getClass();
                if (xi4VarT0.w0.w() == null) {
                    return;
                }
            }
            if (bj4Var.z0) {
                bj4Var.z0 = false;
                xi4 xi4VarT1 = r34Var2.a().T0();
                xi4VarT1.getClass();
                bj4Var.A0 = xi4VarT1.w0.w();
                if (os4.t(layoutNode)) {
                    LayoutNode layoutNodeW2 = layoutNode.w();
                    if (layoutNodeW2 != null) {
                        LayoutNode.Y(layoutNodeW2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode layoutNodeW3 = layoutNode.w();
                if (layoutNodeW3 != null) {
                    LayoutNode.W(layoutNodeW3, false, 7);
                }
            }
        }
    }
}
