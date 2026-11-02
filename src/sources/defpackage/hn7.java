package defpackage;

import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.feature.routing.sub.SubRoutingActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class hn7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SubRoutingActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hn7(SubRoutingActivity subRoutingActivity, byte b) {
        this.X = b;
        this.Y = subRoutingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        SubRoutingActivity subRoutingActivity = this.Y;
        byte b2 = 1;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = SubRoutingActivity.C0;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    i21.a(jm4.U(-1843808098, new hn7(subRoutingActivity, b2), lp2Var), lp2Var, 6);
                }
                break;
            default:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = SubRoutingActivity.C0;
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    pn7.g((np7) subRoutingActivity.y0.getValue(), (vv5) subRoutingActivity.z0.getValue(), (gw5) subRoutingActivity.A0.getValue(), subRoutingActivity.B0, b.c, lp2Var2, 25160);
                }
                break;
        }
        return dn8Var;
    }
}
