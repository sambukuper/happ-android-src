package defpackage;

import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class op6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ RoutingRulesActivity i0;
    public final /* synthetic */ RouteProfile j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op6(RoutingRulesActivity routingRulesActivity, RouteProfile routeProfile, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = routingRulesActivity;
        this.j0 = routeProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        RouteProfile routeProfile = this.j0;
        RoutingRulesActivity routingRulesActivity = this.i0;
        switch (b) {
            case 0:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 2);
            case 3:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 3);
            case 4:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 4);
            default:
                return new op6(routingRulesActivity, routeProfile, q51Var, (byte) 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        q51 q51Var = null;
        switch (this.g0) {
            case 0:
                dn8 dn8Var = dn8.a;
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    RoutingRulesActivity routingRulesActivity = this.i0;
                    String str = routingRulesActivity.S0;
                    String strD = this.j0.d();
                    this.h0 = true;
                    mn6 mn6VarC = routingRulesActivity.C();
                    Object objN = z91.n(w51.t(new lf2((mh7) mn6VarC.h.getValue(), new GeoFileKey(mr2.GEOSITE, str, strD), (byte) 7)), new np6(routingRulesActivity, null), this);
                    if (objN != c71Var) {
                        objN = dn8Var;
                    }
                    if (objN == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    RoutingRulesActivity routingRulesActivity2 = this.i0;
                    op6 op6Var = new op6(routingRulesActivity2, this.j0, q51Var, (byte) 0);
                    this.h0 = true;
                    if (u15.L(routingRulesActivity2, op6Var, this) == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                dn8 dn8Var2 = dn8.a;
                c71 c71Var3 = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    RoutingRulesActivity routingRulesActivity3 = this.i0;
                    String str2 = routingRulesActivity3.S0;
                    String strD2 = this.j0.d();
                    this.h0 = true;
                    mn6 mn6VarC2 = routingRulesActivity3.C();
                    Object objN2 = z91.n(w51.t(new lf2((mh7) mn6VarC2.h.getValue(), new GeoFileKey(mr2.GEOIP, str2, strD2), (byte) 7)), new mp6(routingRulesActivity3, null), this);
                    if (objN2 != c71Var3) {
                        objN2 = dn8Var2;
                    }
                    if (objN2 == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var2;
            case 3:
                c71 c71Var4 = c71.X;
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    RoutingRulesActivity routingRulesActivity4 = this.i0;
                    op6 op6Var2 = new op6(routingRulesActivity4, this.j0, q51Var, (byte) 2);
                    this.h0 = true;
                    if (u15.L(routingRulesActivity4, op6Var2, this) == c71Var4) {
                        return c71Var4;
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 4:
                c71 c71Var5 = c71.X;
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    mn6 mn6VarC3 = this.i0.C();
                    String strC = this.j0.c();
                    String strD3 = this.j0.d();
                    mr2 mr2Var = mr2.GEOIP;
                    boolean z6 = this.i0.U0;
                    this.h0 = true;
                    vz7 vz7Var = mn6.j;
                    if (mn6VarC3.C(strC, strD3, mr2Var, z6, this) == c71Var5) {
                        return c71Var5;
                    }
                } else {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                c71 c71Var6 = c71.X;
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    mn6 mn6VarC4 = this.i0.C();
                    String strC2 = this.j0.c();
                    String strD4 = this.j0.d();
                    mr2 mr2Var2 = mr2.GEOSITE;
                    boolean z8 = this.i0.U0;
                    this.h0 = true;
                    vz7 vz7Var2 = mn6.j;
                    if (mn6VarC4.C(strC2, strD4, mr2Var2, z8, this) == c71Var6) {
                        return c71Var6;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }
}
