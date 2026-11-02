package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a68 extends y58 implements s01 {
    public kd8 s0;
    public r68 t0;
    public y78 u0;
    public boolean v0;
    public final rh5 w0;
    public final oi x0;
    public final kj4 y0;
    public og7 z0;

    public a68(kd8 kd8Var, r68 r68Var, y78 y78Var, boolean z) {
        this.s0 = kd8Var;
        this.t0 = r68Var;
        this.u0 = y78Var;
        this.v0 = z;
        rh5 rh5VarH = z51.H(new pf3(0L));
        this.w0 = rh5VarH;
        this.x0 = new oi(new z85(bs7.b(this.s0, this.t0, this.u0, ((pf3) rh5VarH.getValue()).a)), o07.b, new z85(o07.c), 8);
        kj4 kj4Var = new kj4(new z58(this, (byte) 0), new z58(this, (byte) 1));
        Y0(kj4Var);
        this.y0 = kj4Var;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        c1();
    }

    @Override // defpackage.y58
    public final void b1(kd8 kd8Var, r68 r68Var, y78 y78Var, boolean z) {
        kd8 kd8Var2 = this.s0;
        r68 r68Var2 = this.t0;
        y78 y78Var2 = this.u0;
        boolean z2 = this.v0;
        this.s0 = kd8Var;
        this.t0 = r68Var;
        this.u0 = y78Var;
        this.v0 = z;
        if (dh3.f(kd8Var, kd8Var2) && r68Var == r68Var2 && dh3.f(y78Var, y78Var2) && z == z2) {
            return;
        }
        c1();
    }

    public final void c1() {
        og7 og7Var = this.z0;
        q51 q51Var = null;
        if (og7Var != null) {
            og7Var.m(null);
        }
        this.z0 = null;
        e17 e17Var = lj4.a;
        if (Build.VERSION.SDK_INT >= 28) {
            if (!this.v0 && (((z85) this.x0.d()).a & 9223372034707292159L) != 9205357640488583168L) {
                w51.G(M0(), null, e71.f0, new ym7(this, q51Var, (byte) 4), 1);
            }
            this.z0 = w51.G(M0(), null, null, new t17(this, q51Var, (byte) 14), 3);
        }
    }

    @Override // defpackage.y58
    public final void e0(i55 i55Var) {
        this.y0.e0(i55Var);
    }

    @Override // defpackage.y58, defpackage.w07
    public final void h(f17 f17Var) {
        this.y0.h(f17Var);
    }

    @Override // defpackage.y58, defpackage.rv1
    public final void u0(p34 p34Var) {
        p34Var.a();
        this.y0.u0(p34Var);
    }
}
