package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vw4 implements rn2 {
    public final /* synthetic */ long X;
    public final /* synthetic */ dn2 Y;
    public final /* synthetic */ o87 Z;
    public final /* synthetic */ ax4 f0;
    public final /* synthetic */ oi g0;
    public final /* synthetic */ b71 h0;
    public final /* synthetic */ gn2 i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ x67 l0;
    public final /* synthetic */ long m0;
    public final /* synthetic */ long n0;
    public final /* synthetic */ rn2 o0;
    public final /* synthetic */ rn2 p0;
    public final /* synthetic */ zy0 q0;

    public vw4(long j, dn2 dn2Var, o87 o87Var, ax4 ax4Var, oi oiVar, b71 b71Var, gn2 gn2Var, float f, boolean z, x67 x67Var, long j2, long j3, rn2 rn2Var, rn2 rn2Var2, zy0 zy0Var) {
        this.X = j;
        this.Y = dn2Var;
        this.Z = o87Var;
        this.f0 = ax4Var;
        this.g0 = oiVar;
        this.h0 = b71Var;
        this.i0 = gn2Var;
        this.j0 = f;
        this.k0 = z;
        this.l0 = x67Var;
        this.m0 = j2;
        this.n0 = j3;
        this.o0 = rn2Var;
        this.p0 = rn2Var2;
        this.q0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            kx4 kx4VarT = z91.T(b.c, z91.e);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new uh3((byte) 29);
                lp2Var.g0(objK);
            }
            kx4 kx4VarA = v07.a(kx4VarT, false, (gn2) objK);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarA);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            o87 o87Var = this.Z;
            boolean z = ((p87) ((zi1) o87Var.d.j0).getValue()) != p87.X;
            boolean z2 = this.f0.b;
            long j = this.X;
            dn2 dn2Var = this.Y;
            zw4.c(j, dn2Var, z, z2, lp2Var, 0);
            zw4.b(this.g0, this.h0, dn2Var, this.i0, hx4.X, o87Var, this.j0, this.k0, this.l0, this.m0, this.n0, 0.0f, this.o0, this.p0, this.q0, lp2Var, 70);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
