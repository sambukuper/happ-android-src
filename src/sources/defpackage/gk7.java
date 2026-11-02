package defpackage;

import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.SubRoutingState;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class gk7 {
    public final vz7 a = new vz7(new r47((byte) 21));
    public final vz7 b = new vz7(new r47((byte) 22));
    public final vz7 c = new vz7(new r47((byte) 23));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(MetaParams metaParams, boolean z, String str, s51 s51Var) {
        Object objC;
        Boolean routingEnable;
        bk7 bk7Var = (bk7) this.a.getValue();
        bk7Var.getClass();
        vz7 vz7Var = bk7Var.b;
        if (str != null) {
            ((zt7) bk7Var.c.getValue()).b(str, new gq6(metaParams, str, (byte) 5));
            mn6 mn6Var = (mn6) vz7Var.getValue();
            mn6Var.getClass();
            SubRoutingState subRoutingStateQ = mn6Var.q(str);
            if ((subRoutingStateQ == null || !subRoutingStateQ.e()) && (routingEnable = metaParams.getRoutingEnable()) != null) {
                ((mn6) vz7Var.getValue()).F(str, routingEnable.booleanValue());
            }
        }
        EIpType preferredIpType = metaParams.getPreferredIpType();
        if (preferredIpType != null) {
            bk7Var.a().q("pref_ip_type", preferredIpType.getValue());
        }
        InboundAuthMode socksAuthMode = metaParams.getSocksAuthMode();
        if (socksAuthMode != null) {
            bk7Var.a().l(socksAuthMode.ordinal(), "pref_socks_auth_mode");
        }
        String socksAuthUser = metaParams.getSocksAuthUser();
        if (socksAuthUser != null) {
            bk7Var.a().q("pref_socks_auth_manual_user", socksAuthUser);
        }
        String socksAuthPassword = metaParams.getSocksAuthPassword();
        if (socksAuthPassword != null) {
            bk7Var.a().q("pref_socks_auth_manual_pass", socksAuthPassword);
        }
        InboundAuthMode httpAuthMode = metaParams.getHttpAuthMode();
        if (httpAuthMode != null) {
            bk7Var.a().l(httpAuthMode.ordinal(), "pref_http_auth_mode");
        }
        String httpAuthUser = metaParams.getHttpAuthUser();
        if (httpAuthUser != null) {
            bk7Var.a().q("pref_http_auth_manual_user", httpAuthUser);
        }
        String httpAuthPassword = metaParams.getHttpAuthPassword();
        if (httpAuthPassword != null) {
            bk7Var.a().q("pref_http_auth_manual_pass", httpAuthPassword);
        }
        Boolean useOkhttpLegacy = metaParams.getUseOkhttpLegacy();
        if (useOkhttpLegacy != null) {
            bk7Var.a().p("pref_use_legacy_okhttp", useOkhttpLegacy.booleanValue());
        }
        HappApplication happApplication = HappApplication.M0;
        k32.i().d().h(new as((byte) 13, z));
        return (z && (objC = ((ek7) this.b.getValue()).c(str, metaParams, s51Var)) == c71.X) ? objC : dn8.a;
    }
}
