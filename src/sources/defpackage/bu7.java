package defpackage;

import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.feature.subscription_settings.SubscriptionSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class bu7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SubscriptionSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bu7(SubscriptionSettingsActivity subscriptionSettingsActivity, byte b) {
        this.X = b;
        this.Y = subscriptionSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        SubscriptionSettingsActivity subscriptionSettingsActivity = this.Y;
        byte b2 = 1;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                int i = SubscriptionSettingsActivity.z0;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    i21.a(jm4.U(-484256111, new bu7(subscriptionSettingsActivity, b2), lp2Var), lp2Var, 6);
                }
                break;
            default:
                int i2 = SubscriptionSettingsActivity.z0;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    eu7.b((mu7) subscriptionSettingsActivity.y0.getValue(), b.c, lp2Var, 56);
                }
                break;
        }
        return dn8Var;
    }
}
