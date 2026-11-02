package defpackage;

import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.feature.logs.settings.LogsSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mh4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ LogsSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mh4(LogsSettingsActivity logsSettingsActivity, byte b) {
        this.X = b;
        this.Y = logsSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        LogsSettingsActivity logsSettingsActivity = this.Y;
        byte b2 = 1;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                int i = LogsSettingsActivity.z0;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    i21.a(jm4.U(364481012, new mh4(logsSettingsActivity, b2), lp2Var), lp2Var, 6);
                }
                break;
            default:
                int i2 = LogsSettingsActivity.z0;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    x97.b((th4) logsSettingsActivity.y0.getValue(), b.c, lp2Var, 56);
                }
                break;
        }
        return dn8Var;
    }
}
