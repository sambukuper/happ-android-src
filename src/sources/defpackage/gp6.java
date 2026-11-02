package defpackage;

import android.content.Context;
import android.content.Intent;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class gp6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RoutingRulesActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gp6(RoutingRulesActivity routingRulesActivity, byte b) {
        this.X = b;
        this.Y = routingRulesActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity] */
    public final Object invoke() {
        byte b = this.X;
        ?? r3 = this.Y;
        switch (b) {
            case 0:
                int i = RoutingRulesActivity.X0;
                Intent intentPutExtra = new Intent((Context) r3, (Class<?>) RoutingSettingsActivity.class).addFlags(268435456).putExtra("profileId", r3.S0);
                intentPutExtra.getClass();
                r3.startActivity(intentPutExtra);
                return dn8.a;
            default:
                s6 s6Var = r3.Q0;
                if (s6Var != null) {
                    return new rp6(s6Var);
                }
                dh3.T("binding");
                throw null;
        }
    }
}
