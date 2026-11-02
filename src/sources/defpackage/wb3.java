package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wb3 extends oh1 implements s01 {
    public oi A0;
    public x67 B0;
    public final oi C0;
    public final ic0 D0;
    public boolean s0;
    public boolean t0;
    public xz4 u0;
    public float v0;
    public float w0;
    public boolean x0;
    public og7 y0;
    public i48 z0;

    public wb3(boolean z, boolean z2, xz4 xz4Var, i48 i48Var, x67 x67Var, float f, float f2) {
        this.s0 = z;
        this.t0 = z2;
        this.u0 = xz4Var;
        this.v0 = f;
        this.w0 = f2;
        this.z0 = i48Var;
        this.B0 = x67Var;
        this.C0 = new oi(new kt1((this.x0 && z) ? f : f2), ys0.l0, null, 12);
        ic0 ic0Var = new ic0(new jc0(), new vj2(this, (byte) 7));
        Y0(ic0Var);
        this.D0 = ic0Var;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        byte b = 2;
        this.y0 = w51.G(M0(), null, null, new vb3(this, null, b), 3);
        if (this.A0 == null) {
            i48 i48VarO0 = this.z0;
            if (i48VarO0 == null) {
                i48VarO0 = lh4.O0((iw0) hi5.W(this, kw0.a), (h88) hi5.W(this, i88.a));
            }
            long jC = i48VarO0.c(this.s0, this.t0, this.x0);
            this.A0 = new oi(new dw0(jC), new ug8(ti.i0, new wi(dw0.e(jC), b)), null, 12);
        }
    }

    public final void b1() {
        q51 q51Var = null;
        w51.G(M0(), null, null, new vb3(this, q51Var, (byte) 0), 3);
        w51.G(M0(), null, null, new vb3(this, q51Var, (byte) 1), 3);
    }

    public final Object c1(uy7 uy7Var) throws Throwable {
        this.x0 = false;
        this.u0.a.a(new te0(new ArrayList(), this, (byte) 7), uy7Var);
        return c71.X;
    }
}
