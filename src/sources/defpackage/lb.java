package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AndroidComposeView Y;

    public /* synthetic */ lb(AndroidComposeView androidComposeView, byte b) {
        this.X = b;
        this.Y = androidComposeView;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        AndroidComposeView androidComposeView = this.Y;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.J1;
                return new rf(androidComposeView, androidComposeView.getTextInputService(), (b71) obj);
            case 1:
                dn2 dn2Var = (dn2) obj;
                Class cls2 = AndroidComposeView.J1;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    dn2Var.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new pb(dn2Var, (byte) 0));
                    }
                }
                return dn8Var;
            case 2:
                Class cls3 = AndroidComposeView.J1;
                ((gh2) androidComposeView.getFocusOwner()).g(((ug2) obj).a, false);
                return dn8Var;
            case 3:
                return androidComposeView.getSavedStateRegistry();
            default:
                return Boolean.valueOf(androidComposeView.getScrollCaptureInProgress());
        }
    }
}
