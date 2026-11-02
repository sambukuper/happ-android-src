package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ dn2 Y;

    public /* synthetic */ pb(dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = dn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        dn2 dn2Var = this.Y;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.J1;
                dn2Var.invoke();
                break;
            case 1:
                Class cls2 = AndroidComposeView.J1;
                dn2Var.invoke();
                break;
            case 2:
                dn2Var.invoke();
                break;
            default:
                dn2Var.invoke();
                break;
        }
    }
}
