package defpackage;

import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class gw4 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gw4(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final Object B(Object obj) {
        byte b = this.X;
        String str = this.Y;
        switch (b) {
            case 0:
                String strB = ((GuId) obj).b();
                strB.getClass();
                kw4 kw4Var = kw4.a;
                ServerConfig serverConfigB = kw4.b(strB);
                if (serverConfigB == null) {
                    return null;
                }
                if (!dh3.f(serverConfigB.getSubscriptionId(), str)) {
                    serverConfigB = null;
                }
                if (serverConfigB != null) {
                    return new qg5(new GuId(strB), serverConfigB);
                }
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                String strB2 = ((GuId) obj).b();
                strB2.getClass();
                kw4 kw4Var2 = kw4.a;
                ServerConfig serverConfigB2 = kw4.b(strB2);
                if (serverConfigB2 == null) {
                    strB2 = null;
                } else {
                    if (!dh3.f(serverConfigB2.getSubscriptionId(), str)) {
                        serverConfigB2 = null;
                    }
                    if (serverConfigB2 == null) {
                        strB2 = null;
                    }
                }
                if (strB2 != null) {
                    return new GuId(strB2);
                }
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                String strB3 = ((GuId) obj).b();
                strB3.getClass();
                kw4 kw4Var3 = kw4.a;
                ServerConfig serverConfigB3 = kw4.b(strB3);
                String subscriptionId = serverConfigB3 != null ? serverConfigB3.getSubscriptionId() : null;
                return Boolean.valueOf(subscriptionId == null ? false : subscriptionId.equals(str));
            default:
                String strD = ((SubId) obj).d();
                strD.getClass();
                return Boolean.valueOf(!strD.equals(str));
        }
    }
}
