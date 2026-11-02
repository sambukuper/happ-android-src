package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class nq2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ pv3 Y;
    public final /* synthetic */ dn2 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nq2(pv3 pv3Var, dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = pv3Var;
        this.Z = dn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        dn2 dn2Var = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                gn2Var.B(uq2.a);
                dn2Var.invoke();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                gn2Var.B(pv5.a);
                dn2Var.invoke();
                break;
            default:
                gn2Var.B(qv5.a);
                dn2Var.invoke();
                break;
        }
        return dn8Var;
    }
}
