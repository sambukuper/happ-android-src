package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z79 extends w79 {
    public final /* synthetic */ byte i;

    @Override // defpackage.w79
    public is2 g(Context context, Looper looper, fu6 fu6Var, Object obj, ps2 ps2Var, qs2 qs2Var) {
        switch (this.i) {
            case 0:
                Object obj2 = fu6Var.h0;
                Integer num = (Integer) fu6Var.i0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new z87(context, looper, fu6Var, bundle, ps2Var, qs2Var);
            case 1:
                throw pc6.i(obj);
            default:
                return super.g(context, looper, fu6Var, obj, ps2Var, qs2Var);
        }
    }

    @Override // defpackage.w79
    public is2 h(Context context, Looper looper, fu6 fu6Var, Object obj, i89 i89Var, i89 i89Var2) {
        switch (this.i) {
            case 2:
                return new f89(context, looper, 449, fu6Var, i89Var, i89Var2);
            case 3:
                return new i99(context, looper, fu6Var, (j28) obj, i89Var, i89Var2);
            case 4:
                return new fa9(context, looper, 457, fu6Var, i89Var, i89Var2);
            default:
                return super.h(context, looper, fu6Var, obj, i89Var, i89Var2);
        }
    }
}
