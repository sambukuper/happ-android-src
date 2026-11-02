package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class aa3 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ pv3 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ aa3(pv3 pv3Var, byte b) {
        this.X = b;
        this.Y = pv3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                gn2Var.B(oa3.a);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                gn2Var.B(dh4.a);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                gn2Var.B(qo6.a);
                break;
            case 3:
                gn2Var.B(mo6.a);
                break;
            case 4:
                gn2Var.B(fo6.a);
                break;
            case 5:
                gn2Var.B(new to6());
                break;
            case 6:
                gn2Var.B(eo6.a);
                break;
            case 7:
                gn2Var.B(nq6.a);
                break;
            case 8:
                gn2Var.B(j67.a);
                break;
            case 9:
                gn2Var.B(no7.a);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                gn2Var.B(zo7.a);
                break;
            case 11:
                gn2Var.B(ho7.a);
                break;
            case 12:
                gn2Var.B(new yo7(false));
                break;
            case 13:
                gn2Var.B(go7.a);
                break;
            case 14:
                gn2Var.B(ar7.a);
                break;
            default:
                gn2Var.B(mt7.a);
                break;
        }
        return dn8Var;
    }
}
