package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zy0 Y;

    public /* synthetic */ l8(zy0 zy0Var, byte b) {
        this.X = b;
        this.Y = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        hx4 hx4Var = hx4.X;
        dn8 dn8Var = dn8.a;
        zy0 zy0Var = this.Y;
        byte b2 = 0;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    lp2Var.W(-1102039173);
                    lp2Var.p(false);
                    zy0Var.K(lp2Var, 0);
                }
                break;
            case 1:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    ig5 ig5Var = n8.a;
                    n8.b(jm4.U(-459506658, new l8(zy0Var, b2), lp2Var2), lp2Var2, 438);
                }
                break;
            case 2:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int I = km4.I(lp2Var3);
                    kl5 kl5VarL = lp2Var3.l();
                    kx4 kx4VarQ = w45.Q(lp2Var3, hx4Var);
                    uz0.j.getClass();
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(pz2.B0, lp2Var3, xr4VarC);
                    pn7.m(pz2.A0, lp2Var3, kl5VarL);
                    dx0 dx0Var = pz2.C0;
                    if (lp2Var3.S || !dh3.f(lp2Var3.K(), Integer.valueOf(I))) {
                        p61.v(I, lp2Var3, I, dx0Var);
                    }
                    pn7.m(pz2.z0, lp2Var3, kx4VarQ);
                    zy0Var.K(lp2Var3, 0);
                    lp2Var3.p(true);
                }
                break;
            default:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    kx4 kx4VarO = x97.O(hx4Var, "Container");
                    xr4 xr4VarC2 = g80.c(pz2.Z, true);
                    int I2 = km4.I(lp2Var4);
                    kl5 kl5VarL2 = lp2Var4.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var4, kx4VarO);
                    uz0.j.getClass();
                    lp2Var4.Z();
                    if (lp2Var4.S) {
                        lp2Var4.k();
                    } else {
                        lp2Var4.j0();
                    }
                    pn7.m(pz2.B0, lp2Var4, xr4VarC2);
                    pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                    dx0 dx0Var2 = pz2.C0;
                    if (lp2Var4.S || !dh3.f(lp2Var4.K(), Integer.valueOf(I2))) {
                        p61.v(I2, lp2Var4, I2, dx0Var2);
                    }
                    pn7.m(pz2.z0, lp2Var4, kx4VarQ2);
                    zy0Var.K(lp2Var4, 0);
                    lp2Var4.p(true);
                }
                break;
        }
        return dn8Var;
    }
}
