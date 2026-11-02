package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lp7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ np7 h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp7(np7 np7Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = np7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        np7 np7Var = this.h0;
        switch (b) {
            case 0:
                return new lp7(np7Var, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new lp7(np7Var, q51Var, (byte) 1);
            default:
                return new lp7(np7Var, q51Var, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        np7 np7Var = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                return np7Var.f().q(((qn7) np7Var.f.X.getValue()).a);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                return np7Var.e(((qn7) np7Var.f.X.getValue()).a);
            default:
                w39.n0(obj);
                String strP = np7Var.f().p(((qn7) np7Var.f.X.getValue()).a, true);
                if (strP != null) {
                    return new RouteProfileId(strP);
                }
                return null;
        }
    }
}
