package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx2 implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ b83 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ kx4 g0;

    public /* synthetic */ nx2(b83 b83Var, int i, gn2 gn2Var, kx4 kx4Var) {
        this.Y = b83Var;
        this.Z = i;
        this.f0 = gn2Var;
        this.g0 = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i = 0;
                    for (Object obj3 : this.Y) {
                        int i2 = i + 1;
                        if (i < 0) {
                            i21.X();
                            throw null;
                        }
                        ox2 ox2Var = (ox2) obj3;
                        lp2Var.U(123539103, ox2Var.b);
                        boolean z = this.Z == i;
                        ig5 ig5Var = new ig5(4.0f, 4.0f, 16.0f, 4.0f);
                        gn2 gn2Var = this.f0;
                        boolean zF = lp2Var.f(gn2Var) | lp2Var.d(i);
                        Object objK = lp2Var.K();
                        if (zF || objK == zz0.a) {
                            objK = new lx2(gn2Var, i, (byte) 0);
                            lp2Var.g0(objK);
                        }
                        z68.e(ox2Var, z, (dn2) objK, this.g0, ig5Var, lp2Var, 3072);
                        lp2Var.p(false);
                        i = i2;
                    }
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            default:
                ((Integer) obj2).getClass();
                z68.d(this.Y, this.Z, this.f0, this.g0, (lp2) obj, w79.P(3073));
                return dn8Var;
        }
    }

    public /* synthetic */ nx2(b83 b83Var, int i, gn2 gn2Var, kx4 kx4Var, int i2) {
        this.Y = b83Var;
        this.Z = i;
        this.f0 = gn2Var;
        this.g0 = kx4Var;
    }
}
