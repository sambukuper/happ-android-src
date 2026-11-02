package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class a69 implements gn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        switch (this.X) {
            case 0:
                return ((bo3) obj).c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                bo3 bo3Var = (bo3) obj;
                bo3Var.getClass();
                return Boolean.valueOf(bo3Var instanceof bq3);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((bo3) obj).c();
            case 3:
                bo3 bo3Var2 = (bo3) obj;
                bo3Var2.getClass();
                return Boolean.valueOf(bo3Var2 instanceof bq3);
            case 4:
                return ((bo3) obj).c();
            case 5:
                XRayConfig.InboundBean inboundBean = (XRayConfig.InboundBean) obj;
                inboundBean.getClass();
                return Boolean.valueOf(dh3.f(inboundBean.getProtocol(), "http"));
            case 6:
                bo3 bo3Var3 = (bo3) obj;
                bo3Var3.getClass();
                return Boolean.valueOf(bo3Var3 instanceof bq3);
            case 7:
                return ((bo3) obj).c();
            default:
                ((k79) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
