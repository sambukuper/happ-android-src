package defpackage;

import android.net.ConnectivityManager;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.XRayVpnService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class p69 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ XRayVpnService Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p69(XRayVpnService xRayVpnService, byte b) {
        this.X = b;
        this.Y = xRayVpnService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        XRayVpnService xRayVpnService = this.Y;
        switch (b) {
            case 0:
                int i = XRayVpnService.v0;
                return new r69(xRayVpnService);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return Boolean.valueOf(xRayVpnService.k0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                int i2 = XRayVpnService.v0;
                xRayVpnService.n();
                return dn8.a;
            case 3:
                int i3 = XRayVpnService.v0;
                return new jz8(xRayVpnService);
            case 4:
                int i4 = XRayVpnService.v0;
                return new j61(xRayVpnService, (byte) 3);
            case 5:
                int i5 = XRayVpnService.v0;
                return new ri7(xRayVpnService);
            default:
                int i6 = XRayVpnService.v0;
                Object systemService = xRayVpnService.getSystemService("connectivity");
                systemService.getClass();
                return (ConnectivityManager) systemService;
        }
    }
}
