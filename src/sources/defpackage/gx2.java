package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ gx2(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                mb6.c((kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            default:
                z64 z64Var = (z64) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    rg3 rg3VarD = z64Var.b.a.d(i);
                    ((zy0) rg3VarD.c.f0).F(z64Var.c, Integer.valueOf(i - rg3VarD.a), lp2Var, 0);
                }
                break;
        }
        return dn8Var;
    }
}
