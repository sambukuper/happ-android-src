package defpackage;

import android.content.Intent;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ze6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ResetSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ze6(ResetSettingsActivity resetSettingsActivity, byte b) {
        this.X = b;
        this.Y = resetSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context, su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity] */
    public final Object invoke() {
        byte b = this.X;
        ?? r5 = this.Y;
        switch (b) {
            case 0:
                h6 h6Var = r5.Q0;
                if (h6Var != null) {
                    return new bf6(h6Var);
                }
                dh3.T("binding");
                throw null;
            default:
                xj7 xj7Var = (xj7) r5.R0.getValue();
                xj7Var.getClass();
                jm4.Q(HappApplication.N0, (u61) null, new wj7(xj7Var, (q51) null, (byte) 0), 3);
                r5.startActivity(new Intent(r5.getApplicationContext(), (Class<?>) MainActivity.class).setFlags(268468224));
                return dn8.a;
        }
    }
}
