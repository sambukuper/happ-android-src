package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class bm4 implements v85, ao2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gn2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bm4(gn2 gn2Var, byte b) {
        this.a = b;
        this.b = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void a(Object obj) throws Exception {
        byte b = this.a;
        t16 t16Var = this.b;
        switch (b) {
            case 0:
                t16Var.B(obj);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ((yp6) t16Var).B(obj);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                t16Var.B(obj);
                break;
            default:
                ((gq6) t16Var).B(obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final on2 b() {
        byte b = this.a;
        t16 t16Var = this.b;
        switch (b) {
            case 0:
                return t16Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return (yp6) t16Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return t16Var;
            default:
                return (gq6) t16Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        byte b = this.a;
        on2 on2Var = this.b;
        switch (b) {
            case 0:
                if ((obj instanceof v85) && (obj instanceof ao2)) {
                    return on2Var.equals(((ao2) obj).b());
                }
                return false;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return (obj instanceof v85) && (obj instanceof ao2) && ((yp6) on2Var) == ((ao2) obj).b();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return (obj instanceof v85) && (obj instanceof ao2) && ((t16) on2Var) == ((ao2) obj).b();
            default:
                return (obj instanceof v85) && (obj instanceof ao2) && ((gq6) on2Var) == ((ao2) obj).b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        byte b = this.a;
        t16 t16Var = this.b;
        switch (b) {
            case 0:
                return t16Var.hashCode();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((yp6) t16Var).hashCode();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return t16Var.hashCode();
            default:
                return ((gq6) t16Var).hashCode();
        }
    }
}
