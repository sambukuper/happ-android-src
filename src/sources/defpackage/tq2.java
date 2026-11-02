package defpackage;

import android.app.Activity;
import android.content.Intent;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tq2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(mr2 mr2Var, RoutingRulesActivity routingRulesActivity, String str, String str2, q51 q51Var) {
        super(2, q51Var);
        this.h0 = mr2Var;
        this.i0 = routingRulesActivity;
        this.j0 = str;
        this.k0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (sq2) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (b71) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.k0;
        Object obj3 = this.j0;
        Object obj4 = this.i0;
        switch (b) {
            case 0:
                tq2 tq2Var = new tq2((dn2) obj4, (gn2) obj3, (Activity) obj2, q51Var);
                tq2Var.h0 = obj;
                return tq2Var;
            default:
                return new tq2((mr2) this.h0, (RoutingRulesActivity) obj4, (String) obj3, (String) obj2, q51Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.i0;
        Object obj3 = this.j0;
        Object obj4 = this.k0;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj4;
                sq2 sq2Var = (sq2) this.h0;
                w39.n0(obj);
                if (sq2Var instanceof qq2) {
                    ((dn2) obj2).invoke();
                    return dn8Var;
                }
                if (!(sq2Var instanceof rq2)) {
                    b61.c();
                    return null;
                }
                ((gn2) obj3).B(uq2.a);
                if (activity == null) {
                    return dn8Var;
                }
                activity.startActivity(new Intent(activity, (Class<?>) RoutingRulesActivity.class).putExtra("profileId", ((rq2) sq2Var).a));
                return dn8Var;
            default:
                String str = (String) obj4;
                String str2 = (String) obj3;
                RoutingRulesActivity routingRulesActivity = (RoutingRulesActivity) obj2;
                w39.n0(obj);
                mr2 mr2Var = (mr2) this.h0;
                mr2 mr2Var2 = mr2.GEOIP;
                mr2 mr2Var3 = mr2.GEOSITE;
                if (mr2Var != mr2Var3) {
                    s6 s6Var = routingRulesActivity.Q0;
                    if (s6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    s6Var.D0.setText(routingRulesActivity.D(mr2Var2, str2, str));
                }
                if (mr2Var != mr2Var2) {
                    s6 s6Var2 = routingRulesActivity.Q0;
                    if (s6Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    s6Var2.F0.setText(routingRulesActivity.D(mr2Var3, str2, str));
                }
                s6 s6Var3 = routingRulesActivity.Q0;
                if (s6Var3 != null) {
                    rp7.g(14, s6Var3.t0, routingRulesActivity.C().b(str2, str), false);
                    return dn8Var;
                }
                dh3.T("binding");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(dn2 dn2Var, gn2 gn2Var, Activity activity, q51 q51Var) {
        super(2, q51Var);
        this.i0 = dn2Var;
        this.j0 = gn2Var;
        this.k0 = activity;
    }
}
