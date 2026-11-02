package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.sub.SubRoutingActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class in7 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SubRoutingActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ in7(SubRoutingActivity subRoutingActivity, byte b) {
        this.X = b;
        this.Y = subRoutingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        SubRoutingActivity subRoutingActivity = this.Y;
        switch (b) {
            case 0:
                return subRoutingActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return subRoutingActivity.e();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return subRoutingActivity.d();
            case 3:
                return subRoutingActivity.c();
            case 4:
                return subRoutingActivity.e();
            case 5:
                return subRoutingActivity.d();
            case 6:
                return subRoutingActivity.c();
            case 7:
                return subRoutingActivity.e();
            default:
                return subRoutingActivity.d();
        }
    }
}
