package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jk8 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ c67 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jk8(c67 c67Var, byte b) {
        this.X = b;
        this.Y = c67Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        c67 c67Var = this.Y;
        switch (b) {
            case 0:
                return c67Var.a(c67Var.Y.Y);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return c67Var.a(c67Var.Y.f0);
            default:
                return c67Var.a(c67Var.Y.Z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        c67 c67Var = this.Y;
        switch (b) {
            case 0:
                return false;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return c67Var.a(c67Var.Y.Y);
            default:
                return c67Var.a(c67Var.Y.f0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        c67 c67Var = this.Y;
        switch (b) {
            case 0:
                return c67Var.a(c67Var.Y.f0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return c67Var.a(c67Var.Y.Z);
            default:
                b67 b67Var = (b67) c67Var.Z.Z0.getValue();
                return b67Var.a(b67Var.Y.f0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        c67 c67Var = this.Y;
        switch (b) {
            case 0:
                return c67Var.a(c67Var.Y.Y);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return c67Var.a(c67Var.Y.f0);
            default:
                return c67Var.a(c67Var.Y.Z);
        }
    }
}
