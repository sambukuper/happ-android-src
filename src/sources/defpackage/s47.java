package defpackage;

import android.view.View;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class s47 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ServerCustomConfigActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s47(ServerCustomConfigActivity serverCustomConfigActivity, byte b) {
        this.X = b;
        this.Y = serverCustomConfigActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        ServerCustomConfigActivity serverCustomConfigActivity = this.Y;
        switch (b) {
            case 0:
                fu6 fu6Var = serverCustomConfigActivity.Q0;
                if (fu6Var != null) {
                    ((TextProcessor) fu6Var.Z).requestFocus();
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            default:
                int i = ServerCustomConfigActivity.X0;
                serverCustomConfigActivity.D();
                return;
        }
    }
}
