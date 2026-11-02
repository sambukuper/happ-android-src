package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ys6 implements Cloneable {
    public String A0;
    public ht6 B0;
    public Float C0;
    public ht6 D0;
    public Float E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public long X = 0;
    public ht6 Y;
    public Float Z;
    public ht6 f0;
    public Float g0;
    public ks6 h0;
    public Float i0;
    public ks6[] j0;
    public ks6 k0;
    public Float l0;
    public bs6 m0;
    public ArrayList n0;
    public ks6 o0;
    public Integer p0;
    public Boolean q0;
    public yr6 r0;
    public String s0;
    public String t0;
    public String u0;
    public Boolean v0;
    public Boolean w0;
    public ht6 x0;
    public Float y0;
    public String z0;

    public static ys6 a() {
        ys6 ys6Var = new ys6();
        ys6Var.X = -1L;
        bs6 bs6Var = bs6.Y;
        ys6Var.Y = bs6Var;
        ys6Var.F0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        ys6Var.Z = fValueOf;
        ys6Var.f0 = null;
        ys6Var.g0 = fValueOf;
        ys6Var.h0 = new ks6(1.0f);
        ys6Var.G0 = 1;
        ys6Var.H0 = 1;
        ys6Var.i0 = Float.valueOf(4.0f);
        ys6Var.j0 = null;
        ys6Var.k0 = new ks6(0.0f);
        ys6Var.l0 = fValueOf;
        ys6Var.m0 = bs6Var;
        ys6Var.n0 = null;
        ys6Var.o0 = new ks6(7, 12.0f);
        ys6Var.p0 = 400;
        ys6Var.I0 = 1;
        ys6Var.J0 = 1;
        ys6Var.K0 = 1;
        ys6Var.L0 = 1;
        Boolean bool = Boolean.TRUE;
        ys6Var.q0 = bool;
        ys6Var.r0 = null;
        ys6Var.s0 = null;
        ys6Var.t0 = null;
        ys6Var.u0 = null;
        ys6Var.v0 = bool;
        ys6Var.w0 = bool;
        ys6Var.x0 = bs6Var;
        ys6Var.y0 = fValueOf;
        ys6Var.z0 = null;
        ys6Var.M0 = 1;
        ys6Var.A0 = null;
        ys6Var.B0 = null;
        ys6Var.C0 = fValueOf;
        ys6Var.D0 = null;
        ys6Var.E0 = fValueOf;
        ys6Var.N0 = 1;
        ys6Var.O0 = 1;
        return ys6Var;
    }

    public final Object clone() {
        ys6 ys6Var = (ys6) super.clone();
        ks6[] ks6VarArr = this.j0;
        if (ks6VarArr != null) {
            ys6Var.j0 = (ks6[]) ks6VarArr.clone();
        }
        return ys6Var;
    }
}
