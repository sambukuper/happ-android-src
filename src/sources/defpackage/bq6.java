package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bq6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RoutingSettingsEditSearchActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bq6(RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity, byte b) {
        this.X = b;
        this.Y = routingSettingsEditSearchActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity = this.Y;
        switch (b) {
            case 0:
                return routingSettingsEditSearchActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return routingSettingsEditSearchActivity.e();
            default:
                return routingSettingsEditSearchActivity.d();
        }
    }
}
