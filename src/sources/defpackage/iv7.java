package defpackage;

import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class iv7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ dw7 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ iv7(dw7 dw7Var, byte b) {
        this.X = b;
        this.Y = dw7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dw7 dw7Var = this.Y;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                Object obj2 = ((eb4) dw7Var).c.f.get(iIntValue);
                rv7 rv7Var = obj2 instanceof rv7 ? (rv7) obj2 : null;
                if (rv7Var != null) {
                    return rv7Var;
                }
                bt.q("Required value was null.");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                pv7 pv7VarL = dw7Var.l(iIntValue);
                if (pv7VarL != null) {
                    return pv7VarL;
                }
                bt.q("Required value was null.");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                List list = ((eb4) dw7Var).c.f;
                list.getClass();
                return Boolean.valueOf(!(wv0.u0(iIntValue + 1, list) instanceof qv7));
            default:
                Object obj3 = ((eb4) dw7Var).c.f.get(iIntValue);
                ov7 ov7Var = obj3 instanceof ov7 ? (ov7) obj3 : null;
                if (ov7Var != null) {
                    return ov7Var;
                }
                bt.q("Required value was null.");
                return null;
        }
    }
}
