package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wy2(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                String str = (String) obj4;
                kx4 kx4Var = (kx4) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    zc1.g(str, kx4Var, null, this.Y, 0, 1, 0, false, null, lp2Var, 12779520, 340);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                u78.a((o88) obj4, (zy0) obj3, (lp2) obj, w79.P(this.Y | 1));
                break;
        }
        return dn8Var;
    }
}
