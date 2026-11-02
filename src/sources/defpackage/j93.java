package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j93 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ InboundAuthActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j93(InboundAuthActivity inboundAuthActivity, byte b) {
        this.X = b;
        this.Y = inboundAuthActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        InboundAuthActivity inboundAuthActivity = this.Y;
        switch (b) {
            case 0:
                return inboundAuthActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return inboundAuthActivity.e();
            default:
                return inboundAuthActivity.d();
        }
    }
}
