package defpackage;

import android.widget.LinearLayout;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vl4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vl4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        MainActivity mainActivity = this.Y;
        switch (b) {
            case 0:
                b6 b6Var = mainActivity.Q0;
                if (b6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                b6Var.A0.setVisibility(8);
                b6 b6Var2 = mainActivity.Q0;
                if (b6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = b6Var2.x0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            default:
                b6 b6Var3 = mainActivity.Q0;
                if (b6Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                b6Var3.A0.setVisibility(0);
                b6 b6Var4 = mainActivity.Q0;
                if (b6Var4 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = b6Var4.x0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
