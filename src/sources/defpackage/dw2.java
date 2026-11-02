package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class dw2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zy0 Y;
    public final /* synthetic */ uw0 Z;
    public final /* synthetic */ dn2 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dw2(zy0 zy0Var, uw0 uw0Var, dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = zy0Var;
        this.Z = uw0Var;
        this.f0 = dn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        dn2 dn2Var = this.f0;
        uw0 uw0Var = this.Z;
        zy0 zy0Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    zy0Var.F(uw0Var, dn2Var, lp2Var, 0);
                }
                break;
            default:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    zy0Var.F(uw0Var, dn2Var, lp2Var, 0);
                }
                break;
        }
        return dn8Var;
    }
}
