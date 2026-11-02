package defpackage;

import libxray.XRayPoint;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cb2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ ea6 h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb2(ea6 ea6Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = ea6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                n((q51) obj2, (dn8) obj).q(dn8Var);
                return dn8Var;
            case 3:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            default:
                return n((q51) obj2, (b71) obj).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ea6 ea6Var = this.h0;
        switch (b) {
            case 0:
                return new cb2(ea6Var, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new cb2(ea6Var, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new cb2(ea6Var, q51Var, (byte) 2);
            case 3:
                return new cb2(ea6Var, q51Var, (byte) 3);
            default:
                return new cb2(ea6Var, q51Var, (byte) 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ea6 ea6Var = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                XRayPoint xRayPoint = (XRayPoint) ea6Var.X;
                if (xRayPoint != null && xRayPoint.getIsRunning()) {
                    Object obj2 = ea6Var.X;
                    obj2.getClass();
                    ((XRayPoint) obj2).coreStopLoop();
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                XRayPoint xRayPoint2 = (XRayPoint) ea6Var.X;
                if (xRayPoint2 != null && xRayPoint2.getIsRunning()) {
                    Object obj3 = ea6Var.X;
                    obj3.getClass();
                    ((XRayPoint) obj3).coreStopLoop();
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                ea6Var.X = null;
                return dn8Var;
            case 3:
                w39.n0(obj);
                XRayPoint xRayPoint3 = (XRayPoint) ea6Var.X;
                if (xRayPoint3 == null) {
                    return null;
                }
                if (xRayPoint3.getIsRunning()) {
                    xRayPoint3.coreStopLoop();
                }
                return dn8Var;
            default:
                w39.n0(obj);
                XRayPoint xRayPoint4 = (XRayPoint) ea6Var.X;
                if (xRayPoint4 == null) {
                    return null;
                }
                if (xRayPoint4.getIsRunning()) {
                    xRayPoint4.coreStopLoop();
                }
                return dn8Var;
        }
    }
}
