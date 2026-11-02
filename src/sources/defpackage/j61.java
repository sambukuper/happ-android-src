package defpackage;

import java.util.Iterator;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.statistics.StatisticsSettingsActivity;
import su.happ.proxyutility.service.XRayProxyOnlyService;
import su.happ.proxyutility.service.XRayVpnService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j61 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j61(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(oi7 oi7Var) {
        ServerConfig serverConfigB;
        String remarks;
        String remarks2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((k61) obj).b.iterator();
                while (it.hasNext()) {
                    ((j61) it.next()).a(oi7Var);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                StatisticsSettingsActivity statisticsSettingsActivity = (StatisticsSettingsActivity) obj;
                int i = StatisticsSettingsActivity.W0;
                ((yz4) statisticsSettingsActivity.R0.getValue()).j(oi7Var);
                statisticsSettingsActivity.B();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                XRayProxyOnlyService xRayProxyOnlyService = (XRayProxyOnlyService) obj;
                kw4 kw4Var = kw4.a;
                String strI = kw4.h().i("SELECTED_SERVER");
                if (strI == null) {
                    strI = null;
                }
                serverConfigB = strI != null ? kw4.b(strI) : null;
                if (serverConfigB != null && (remarks = serverConfigB.getRemarks()) != null) {
                    jz8.f(xRayProxyOnlyService.e(), xRayProxyOnlyService, remarks, oi7Var, null, 8);
                    break;
                }
                break;
            default:
                XRayVpnService xRayVpnService = (XRayVpnService) obj;
                kw4 kw4Var2 = kw4.a;
                String strI2 = kw4.h().i("SELECTED_SERVER");
                if (strI2 == null) {
                    strI2 = null;
                }
                serverConfigB = strI2 != null ? kw4.b(strI2) : null;
                if (serverConfigB != null && (remarks2 = serverConfigB.getRemarks()) != null) {
                    jz8.f(xRayVpnService.e(), xRayVpnService, remarks2, oi7Var, null, 8);
                    break;
                }
                break;
        }
    }
}
