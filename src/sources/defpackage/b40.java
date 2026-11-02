package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class b40 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b88 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b40(b88 b88Var, byte b) {
        this.X = b;
        this.Y = b88Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        byte b2 = 2;
        b88 b88Var = this.Y;
        switch (b) {
            case 0:
                return Boolean.valueOf(b88Var != null ? ((Boolean) new b40(b88Var, b2).invoke()).booleanValue() : false);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return Boolean.valueOf(b88Var != null ? ((Boolean) new b40(b88Var, b2).invoke()).booleanValue() : false);
            default:
                ql qlVar = b88Var.b;
                x78 x78Var = (x78) b88Var.a.getValue();
                return Boolean.valueOf(dh3.f(qlVar, x78Var != null ? x78Var.a.a : null));
        }
    }
}
