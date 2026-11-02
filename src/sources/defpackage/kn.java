package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dn2 dn2Var = (dn2) obj;
                if (dn2Var != null) {
                    dn2Var.invoke();
                }
                break;
            case 1:
                ((wp) obj).C();
                break;
            case 2:
                ((iq4) obj).a();
                break;
            case 3:
                ((s95) obj).a();
                break;
            default:
                ((nb8) obj).run();
                break;
        }
    }
}
