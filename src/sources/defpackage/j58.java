package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j58 implements sn2 {
    public final /* synthetic */ lh7 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ o88 Z;
    public final /* synthetic */ rn2 f0;

    public j58(yd8 yd8Var, long j, o88 o88Var, rn2 rn2Var) {
        this.X = yd8Var;
        this.Y = j;
        this.Z = o88Var;
        this.f0 = rn2Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        kx4 kx4Var = (kx4) obj;
        lp2 lp2Var = (lp2) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= lp2Var.f(kx4Var) ? 4 : 2;
        }
        if (lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            lh7 lh7Var = this.X;
            boolean zF = lp2Var.f(lh7Var);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new sf1(lh7Var, (byte) 2);
                lp2Var.g0(objK);
            }
            kx4 kx4VarI = jm4.I(kx4Var, (gn2) objK);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarI);
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
            pn7.b(this.Y, this.Z, this.f0, lp2Var, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
