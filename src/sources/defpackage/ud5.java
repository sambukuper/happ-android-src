package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ud5 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ z57 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ud5(z57 z57Var, byte b) {
        this.X = b;
        this.Y = z57Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        z57 z57Var = this.Y;
        switch (b) {
            case 0:
                return z57Var.a(z57Var.Y.k0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return z57Var.a(z57Var.Y.j0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return z57Var.a(z57Var.Y.i0);
            case 3:
                return z57Var.a(z57Var.Y.g0);
            default:
                return z57Var.a(z57Var.Y.h0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        z57 z57Var = this.Y;
        switch (b) {
            case 0:
                w57 w57Var = (w57) z57Var.Z.a1.getValue();
                return w57Var.a(w57Var.Y.n0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return z57Var.a(z57Var.Y.k0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                rl2 rl2Var = z57Var.Y;
                if (rl2Var.j0.getVisibility() == 0) {
                    return z57Var.a(rl2Var.j0);
                }
                w57 w57Var2 = (w57) z57Var.Z.a1.getValue();
                return w57Var2.a(w57Var2.Y.n0);
            case 3:
                return z57Var.a(z57Var.Y.i0);
            default:
                return z57Var.a(z57Var.Y.g0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        z57 z57Var = this.Y;
        switch (b) {
            case 0:
                return z57Var.a(z57Var.Y.j0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return z57Var.a(z57Var.Y.i0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return z57Var.a(z57Var.Y.g0);
            case 3:
                return z57Var.a(z57Var.Y.h0);
            default:
                v57 v57Var = (v57) z57Var.Z.c1.getValue();
                return v57Var.a(v57Var.Y.Z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        z57 z57Var = this.Y;
        switch (b) {
            case 0:
                return z57Var.a(z57Var.Y.k0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return z57Var.a(z57Var.Y.j0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return z57Var.a(z57Var.Y.i0);
            case 3:
                return z57Var.a(z57Var.Y.g0);
            default:
                return z57Var.a(z57Var.Y.h0);
        }
    }
}
