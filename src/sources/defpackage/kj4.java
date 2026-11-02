package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kj4 extends jx4 implements as2, rv1, w07, w85 {
    public fi1 A0;
    public vo5 B0;
    public final rh5 C0;
    public zi1 D0;
    public long E0;
    public pf3 F0;
    public x90 G0;
    public final z58 q0;
    public final z58 r0;
    public final float s0;
    public final boolean t0;
    public final long u0;
    public final float v0;
    public final float w0;
    public final boolean x0;
    public final wo5 y0;
    public View z0;

    public kj4(z58 z58Var, z58 z58Var2) {
        e17 e17Var = lj4.a;
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            u52.k("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        wo5 wo5Var = i == 28 ? ts2.Y : zo5.X;
        this.q0 = z58Var;
        this.r0 = z58Var2;
        this.s0 = Float.NaN;
        this.t0 = true;
        this.u0 = 9205357640488583168L;
        this.v0 = Float.NaN;
        this.w0 = Float.NaN;
        this.x0 = true;
        this.y0 = wo5Var;
        this.C0 = new rh5(null, lh4.i0);
        this.E0 = 9205357640488583168L;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        q0();
        this.G0 = gv3.b(0, null, null, 7);
        w51.G(M0(), null, e71.f0, new tk0(this, null, (byte) 4), 1);
    }

    @Override // defpackage.jx4
    public final void R0() {
        vo5 vo5Var = this.B0;
        if (vo5Var != null) {
            ((xo5) vo5Var).b();
        }
        this.B0 = null;
    }

    public final long Y0() {
        zi1 zi1VarB = this.D0;
        if (zi1VarB == null) {
            zi1VarB = rd7.b(new jj4(this, (byte) 2));
            this.D0 = zi1VarB;
        }
        return ((z85) zi1VarB.getValue()).a;
    }

    public final void Z0() {
        fi1 fi1Var;
        vo5 vo5Var = this.B0;
        if (vo5Var == null || (fi1Var = this.A0) == null) {
            return;
        }
        xo5 xo5Var = (xo5) vo5Var;
        long jC = xo5Var.c();
        pf3 pf3Var = this.F0;
        if (pf3Var != null && jC == pf3Var.a) {
            return;
        }
        z58 z58Var = this.r0;
        if (z58Var != null) {
            long jR = fi1Var.r(u15.R(xo5Var.c()));
            a68 a68Var = z58Var.Y;
            fi1 fi1Var2 = (fi1) hi5.W(a68Var, y01.h);
            a68Var.w0.setValue(new pf3((((long) fi1Var2.x0(nt1.b(jR))) << 32) | (((long) fi1Var2.x0(nt1.a(jR))) & 4294967295L)));
        }
        this.F0 = new pf3(xo5Var.c());
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        this.C0.setValue(i55Var);
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        f17Var.a(lj4.a, new jj4(this, (byte) 1));
    }

    @Override // defpackage.w85
    public final void q0() {
        ch3.N(this, new jj4(this, (byte) 0));
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        p34Var.a();
        x90 x90Var = this.G0;
        if (x90Var != null) {
            x90Var.b(dn8.a);
        }
    }
}
