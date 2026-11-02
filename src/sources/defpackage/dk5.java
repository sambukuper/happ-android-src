package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dk5 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ PerAppProxyActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dk5(PerAppProxyActivity perAppProxyActivity, byte b) {
        this.X = b;
        this.Y = perAppProxyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        PerAppProxyActivity perAppProxyActivity = this.Y;
        switch (b) {
            case 0:
                return perAppProxyActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return perAppProxyActivity.e();
            default:
                return perAppProxyActivity.d();
        }
    }
}
