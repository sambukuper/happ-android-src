package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hr2 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kx4 Y;

    public /* synthetic */ hr2(kx4 kx4Var, byte b) {
        this.X = b;
        this.Y = kx4Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        kx4 kx4Var = this.Y;
        k44 k44Var = (k44) obj;
        lp2 lp2Var = (lp2) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        k44Var.getClass();
        switch (b) {
            case 0:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    z39.c(dh3.p(k44Var, kx4Var), lp2Var, 0, 0);
                }
                break;
            case 1:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    z39.c(dh3.p(k44Var, kx4Var), lp2Var, 0, 0);
                }
                break;
            case 2:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    z39.c(dh3.p(k44Var, kx4Var), lp2Var, 0, 0);
                }
                break;
            case 3:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    z39.c(dh3.p(k44Var, kx4Var), lp2Var, 0, 0);
                }
                break;
            default:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    z39.c(dh3.p(k44Var, kx4Var), lp2Var, 0, 0);
                }
                break;
        }
        return dn8Var;
    }
}
