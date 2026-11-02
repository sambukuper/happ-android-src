package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends jx4 implements ye8, xt1, w24 {
    public final gn2 q0;
    public wt1 r0;
    public xt1 s0;
    public long t0;

    public wt1(p0 p0Var, int i) {
        this.q0 = (i & 2) != 0 ? null : p0Var;
        this.t0 = 0L;
    }

    @Override // defpackage.xt1
    public final void C(pt1 pt1Var) {
        y0 y0Var = new y0((Object) pt1Var, (byte) 26);
        if (y0Var.B(this) != xe8.X) {
            return;
        }
        ts7.j(this, y0Var);
    }

    @Override // defpackage.xt1
    public final boolean K0(pt1 pt1Var) {
        wt1 wt1Var = this.r0;
        if (wt1Var != null) {
            return wt1Var.K0(pt1Var);
        }
        xt1 xt1Var = this.s0;
        if (xt1Var != null) {
            return xt1Var.K0(pt1Var);
        }
        return false;
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.s0 = null;
        this.r0 = null;
    }

    @Override // defpackage.w24, defpackage.as4
    public final void a(long j) {
        this.t0 = j;
    }

    @Override // defpackage.xt1
    public final void j0(pt1 pt1Var) {
        xt1 xt1Var = this.s0;
        if (xt1Var != null) {
            xt1Var.j0(pt1Var);
        }
        wt1 wt1Var = this.r0;
        if (wt1Var != null) {
            wt1Var.j0(pt1Var);
        }
        this.r0 = null;
    }

    @Override // defpackage.ye8
    public final Object o() {
        return pz2.J0;
    }

    @Override // defpackage.xt1
    public final void r0(pt1 pt1Var) {
        xt1 xt1Var = this.s0;
        if (xt1Var != null) {
            xt1Var.r0(pt1Var);
            return;
        }
        wt1 wt1Var = this.r0;
        if (wt1Var != null) {
            wt1Var.r0(pt1Var);
        }
    }

    @Override // defpackage.xt1
    public final void s(pt1 pt1Var) {
        xt1 xt1Var = this.s0;
        if (xt1Var != null) {
            xt1Var.s(pt1Var);
            return;
        }
        wt1 wt1Var = this.r0;
        if (wt1Var != null) {
            wt1Var.s(pt1Var);
        }
    }

    @Override // defpackage.xt1
    public final void t0(pt1 pt1Var) {
        ye8 ye8Var;
        wt1 wt1Var;
        wt1 wt1Var2 = this.r0;
        if (wt1Var2 == null || !mb6.u(wt1Var2, x97.A(pt1Var))) {
            if (this.X.p0) {
                ea6 ea6Var = new ea6();
                ts7.j(this, new vt1(ea6Var, this, pt1Var, (byte) 0));
                ye8Var = (ye8) ea6Var.X;
            } else {
                ye8Var = null;
            }
            wt1Var = (wt1) ye8Var;
        } else {
            wt1Var = wt1Var2;
        }
        if (wt1Var != null && wt1Var2 == null) {
            wt1Var.s(pt1Var);
            wt1Var.t0(pt1Var);
            xt1 xt1Var = this.s0;
            if (xt1Var != null) {
                xt1Var.j0(pt1Var);
            }
        } else if (wt1Var == null && wt1Var2 != null) {
            xt1 xt1Var2 = this.s0;
            if (xt1Var2 != null) {
                xt1Var2.s(pt1Var);
                xt1Var2.t0(pt1Var);
            }
            wt1Var2.j0(pt1Var);
        } else if (!dh3.f(wt1Var, wt1Var2)) {
            if (wt1Var != null) {
                wt1Var.s(pt1Var);
                wt1Var.t0(pt1Var);
            }
            if (wt1Var2 != null) {
                wt1Var2.j0(pt1Var);
            }
        } else if (wt1Var != null) {
            wt1Var.t0(pt1Var);
        } else {
            xt1 xt1Var3 = this.s0;
            if (xt1Var3 != null) {
                xt1Var3.t0(pt1Var);
            }
        }
        this.r0 = wt1Var;
    }
}
