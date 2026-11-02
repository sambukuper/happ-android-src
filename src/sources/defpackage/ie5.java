package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ie5 implements rn2 {
    public final /* synthetic */ kx4 X;
    public final /* synthetic */ sn2 Y;
    public final /* synthetic */ q58 Z;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ i48 g0;
    public final /* synthetic */ y68 h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ w58 j0;
    public final /* synthetic */ xz4 k0;
    public final /* synthetic */ gg5 l0;
    public final /* synthetic */ de3 m0;
    public final /* synthetic */ o88 n0;
    public final /* synthetic */ wx3 o0;
    public final /* synthetic */ ay6 p0;
    public final /* synthetic */ x67 q0;

    public ie5(kx4 kx4Var, sn2 sn2Var, q58 q58Var, boolean z, i48 i48Var, y68 y68Var, boolean z2, w58 w58Var, xz4 xz4Var, gg5 gg5Var, de3 de3Var, o88 o88Var, wx3 wx3Var, ay6 ay6Var, x67 x67Var) {
        this.X = kx4Var;
        this.Y = sn2Var;
        this.Z = q58Var;
        this.f0 = z;
        this.g0 = i48Var;
        this.h0 = y68Var;
        this.i0 = z2;
        this.j0 = w58Var;
        this.k0 = xz4Var;
        this.l0 = gg5Var;
        this.m0 = de3Var;
        this.n0 = o88Var;
        this.o0 = wx3Var;
        this.p0 = ay6Var;
        this.q0 = x67Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            sn2 sn2Var = this.Y;
            kx4 kx4VarA = hx4.X;
            if (sn2Var != null) {
                lp2Var.W(-2027097767);
                Object objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = new dx4((byte) 8);
                    lp2Var.g0(objK);
                }
                kx4VarA = os4.A(v07.a(kx4VarA, true, (gn2) objK), 0.0f, pn7.k(lp2Var), 0.0f, 0.0f, 13);
                lp2Var.p(false);
            } else {
                lp2Var.W(-2026714080);
                lp2Var.p(false);
            }
            kx4 kx4VarY = this.X.y(kx4VarA);
            String strB = w79.B(b56.default_error_message, lp2Var);
            if (this.f0) {
                kx4VarY = v07.a(kx4VarY, false, new nm7(strB, (byte) 3));
            }
            kx4 kx4VarA2 = b.a(kx4VarY, 280.0f, 56.0f);
            i48 i48Var = this.g0;
            boolean z = this.f0;
            fe7 fe7Var = new fe7(z ? i48Var.j : i48Var.i);
            x67 x67Var = this.q0;
            boolean z2 = this.i0;
            xz4 xz4Var = this.k0;
            x30.b(this.h0, kx4VarA2, this.i0, this.m0, this.n0, this.o0, this.j0, this.k0, fe7Var, new de5(this.h0, this.j0, this.Z, this.Y, z2, z, xz4Var, this.l0, i48Var, jm4.U(-98391231, new he5(z2, z, xz4Var, i48Var, x67Var), lp2Var)), this.p0, lp2Var, 0, 0, 0);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
