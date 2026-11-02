package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 implements rn2 {
    public final /* synthetic */ rn2 X;
    public final /* synthetic */ rn2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ zy0 h0;

    public j8(rn2 rn2Var, rn2 rn2Var2, long j, long j2, long j3, long j4, zy0 zy0Var) {
        this.X = rn2Var;
        this.Y = rn2Var2;
        this.Z = j2;
        this.f0 = j3;
        this.g0 = j4;
        this.h0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            kx4 kx4VarW = os4.w(hx4.X, n8.a);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarW);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var3);
            }
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            lp2Var.W(346092326);
            lp2Var.p(false);
            rn2 rn2Var = this.X;
            if (rn2Var == null) {
                lp2Var.W(346396529);
            } else {
                lp2Var.W(346396530);
                jm4.l(this.Z, yj8.a(z68.e, lp2Var), jm4.U(71284337, new i8(rn2Var, (byte) 0), lp2Var), lp2Var, 384);
            }
            lp2Var.p(false);
            rn2 rn2Var2 = this.Y;
            if (rn2Var2 == null) {
                lp2Var.W(347174009);
            } else {
                lp2Var.W(347174010);
                jm4.l(this.f0, yj8.a(z68.g, lp2Var), jm4.U(705583346, new i8(rn2Var2, (byte) 1), lp2Var), lp2Var, 384);
            }
            lp2Var.p(false);
            r03 r03Var = new r03(pz2.s0);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I2 = km4.I(lp2Var);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, r03Var);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I2))) {
                p61.v(I2, lp2Var, I2, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            jm4.l(this.g0, yj8.a(z68.c, lp2Var), this.h0, lp2Var, 0);
            lp2Var.p(true);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
