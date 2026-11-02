package defpackage;

import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class uj4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ uj4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        MainActivity mainActivity = this.Y;
        switch (b) {
            case 0:
                String str = ((xm4) mainActivity.G().x.X.getValue()).a;
                if (str != null) {
                    return new GuId(str);
                }
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return mainActivity.c();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return mainActivity.e();
            case 3:
                return mainActivity.d();
            case 4:
                return mainActivity.c();
            case 5:
                return mainActivity.e();
            case 6:
                return mainActivity.d();
            case 7:
                return mainActivity.c();
            case 8:
                return mainActivity.e();
            case 9:
                return mainActivity.d();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return mainActivity.c();
            case 11:
                return mainActivity.e();
            case 12:
                return mainActivity.d();
            case 13:
                return mainActivity.c();
            case 14:
                return mainActivity.e();
            case 15:
                return mainActivity.d();
            case 16:
                return mainActivity.c();
            case 17:
                return mainActivity.e();
            default:
                return mainActivity.d();
        }
    }
}
