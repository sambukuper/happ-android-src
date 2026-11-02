package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class h47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i47 a(EConfigType eConfigType) {
        switch (eConfigType == null ? -1 : g47.a[eConfigType.ordinal()]) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new o47();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new k47();
            case 3:
                return new l47();
            case 4:
                return new m47();
            case 5:
                return new n47();
            case 6:
                return new p47();
            case 7:
                return new j47();
            default:
                return null;
        }
    }
}
