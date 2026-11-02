package defpackage;

import su.happ.proxyutility.feature.settings.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class u57 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u57(SettingsActivity settingsActivity, byte b) {
        this.X = b;
        this.Y = settingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        SettingsActivity settingsActivity = this.Y;
        byte b2 = 1;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                int i = SettingsActivity.e1;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    i21.a(jm4.U(-160762451, new u57(settingsActivity, b2), lp2Var), lp2Var, 6);
                }
                break;
            default:
                int i2 = SettingsActivity.e1;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    jb5.f((p67) settingsActivity.W0.getValue(), (za3) settingsActivity.X0.getValue(), lp2Var, 72);
                }
                break;
        }
        return dn8Var;
    }
}
