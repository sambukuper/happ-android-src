package defpackage;

import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class rj4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rj4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        MainActivity mainActivity = this.Y;
        byte b2 = 1;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = MainActivity.y1;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    i21.a(jm4.U(372327083, new rj4(mainActivity, b2), lp2Var), lp2Var, 6);
                }
                break;
            default:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = MainActivity.y1;
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    w39.e(mainActivity.G(), (sq6) mainActivity.f1.getValue(), (gw5) mainActivity.g1.getValue(), (dr2) mainActivity.h1.getValue(), (za3) mainActivity.i1.getValue(), (kr7) mainActivity.j1.getValue(), lp2Var2, 299592);
                }
                break;
        }
        return dn8Var;
    }
}
