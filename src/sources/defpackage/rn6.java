package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class rn6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ vo6 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rn6(gn2 gn2Var, vo6 vo6Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = vo6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        vo6 vo6Var = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                String str = vo6Var.c;
                str.getClass();
                gn2Var.B(new lo6(str));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                gn2Var.B(new ko6(vo6Var.a.d(), vo6Var.c));
                break;
            default:
                gn2Var.B(new so6(vo6Var.a.d(), vo6Var.c));
                break;
        }
        return dn8Var;
    }
}
