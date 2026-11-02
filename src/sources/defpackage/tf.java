package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ir5 Y;
    public final /* synthetic */ y05 Z;

    public /* synthetic */ tf(ir5 ir5Var, y05 y05Var, byte b) {
        this.X = b;
        this.Y = ir5Var;
        this.Z = y05Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.Z;
        ir5 ir5Var = this.Y;
        byte b2 = 0;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    Object objK = lp2Var.K();
                    be beVar = zz0.a;
                    if (objK == beVar) {
                        objK = new y2((byte) 13);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4VarA = v07.a(hx4.X, false, (gn2) objK);
                    boolean zH = lp2Var.h(ir5Var);
                    Object objK2 = lp2Var.K();
                    if (zH || objK2 == beVar) {
                        objK2 = new uf(ir5Var, (byte) 0);
                        lp2Var.g0(objK2);
                    }
                    kx4 kx4VarG = w51.g(gv3.L(kx4VarA, (gn2) objK2), ir5Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    rn2 rn2Var = (rn2) y05Var.getValue();
                    Object objK3 = lp2Var.K();
                    if (objK3 == beVar) {
                        objK3 = ld.c;
                        lp2Var.g0(objK3);
                    }
                    xr4 xr4Var = (xr4) objK3;
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarG);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, xr4Var);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    rn2Var.K(lp2Var, 0);
                    lp2Var.p(true);
                }
                break;
            default:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    mb6.a(bg.b.a(Boolean.TRUE), jm4.U(1022273628, new tf(ir5Var, y05Var, b2), lp2Var), lp2Var, 56);
                }
                break;
        }
        return dn8Var;
    }
}
