package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.profile.RoutingProfileActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class on6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RoutingProfileActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ on6(RoutingProfileActivity routingProfileActivity, byte b) {
        this.X = b;
        this.Y = routingProfileActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        RoutingProfileActivity routingProfileActivity = this.Y;
        switch (b) {
            case 0:
                return routingProfileActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return routingProfileActivity.e();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return routingProfileActivity.d();
            case 3:
                return routingProfileActivity.c();
            case 4:
                return routingProfileActivity.e();
            case 5:
                return routingProfileActivity.d();
            case 6:
                return routingProfileActivity.c();
            case 7:
                return routingProfileActivity.e();
            default:
                return routingProfileActivity.d();
        }
    }
}
