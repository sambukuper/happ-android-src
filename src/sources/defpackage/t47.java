package defpackage;

import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class t47 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ ServerCustomConfigActivity h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t47(ServerCustomConfigActivity serverCustomConfigActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = serverCustomConfigActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                break;
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ServerCustomConfigActivity serverCustomConfigActivity = this.h0;
        switch (b) {
            case 0:
                return new t47(serverCustomConfigActivity, q51Var, (byte) 0);
            default:
                return new t47(serverCustomConfigActivity, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        SnackbarHostActivity snackbarHostActivity = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                pu.M(snackbarHostActivity, y46.toast_none_data);
                break;
            default:
                w39.n0(obj);
                pu.Q(snackbarHostActivity, y46.toast_success);
                snackbarHostActivity.finish();
                break;
        }
        return dn8Var;
    }
}
