package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.ui.ActionView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class n11 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ hn1 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n11(hn1 hn1Var, byte b) {
        this.X = b;
        this.Y = hn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        hn1 hn1Var = this.Y;
        switch (b) {
            case 0:
                return ((ActionView) hn1Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((ActionView) hn1Var.X.h0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((ActionView) hn1Var.X.j0).requestFocus();
            case 3:
                return ((ActionView) hn1Var.X.g0).requestFocus();
            case 4:
                return ((ActionView) hn1Var.X.Z).requestFocus();
            case 5:
                return ((ActionView) hn1Var.X.f0).requestFocus();
            default:
                return ((ActionView) hn1Var.X.Y).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        hn1 hn1Var = this.Y;
        switch (b) {
            case 0:
                return ((ActionView) hn1Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((ActionView) hn1Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((ActionView) hn1Var.X.h0).requestFocus();
            case 3:
                return ((ActionView) hn1Var.X.j0).requestFocus();
            case 4:
                return ((ActionView) hn1Var.X.g0).requestFocus();
            case 5:
                jl1 jl1Var = hn1Var.X;
                return ((ActionView) jl1Var.Z).getVisibility() == 0 ? ((ActionView) jl1Var.Z).requestFocus() : ((ActionView) jl1Var.h0).requestFocus();
            default:
                jl1 jl1Var2 = hn1Var.X;
                return ((ActionView) jl1Var2.f0).getVisibility() == 0 ? ((ActionView) jl1Var2.f0).requestFocus() : ((ActionView) jl1Var2.Y).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        byte b = this.X;
        hn1 hn1Var = this.Y;
        switch (b) {
            case 0:
                hn1Var.a();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                hn1Var.a();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                hn1Var.a();
                break;
            case 3:
                hn1Var.a();
                break;
            case 4:
                hn1Var.a();
                break;
            case 5:
                hn1Var.a();
                break;
            default:
                hn1Var.a();
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        hn1 hn1Var = this.Y;
        switch (b) {
            case 0:
                return ((ActionView) hn1Var.X.h0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                jl1 jl1Var = hn1Var.X;
                return ((ActionView) jl1Var.j0).getVisibility() == 0 ? ((ActionView) jl1Var.j0).requestFocus() : ((ActionView) jl1Var.f0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((ActionView) hn1Var.X.g0).requestFocus();
            case 3:
                return ((ActionView) hn1Var.X.Z).requestFocus();
            case 4:
                return ((ActionView) hn1Var.X.f0).requestFocus();
            case 5:
                return ((ActionView) hn1Var.X.Y).requestFocus();
            default:
                return ((ActionView) hn1Var.X.Y).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        hn1 hn1Var = this.Y;
        switch (b) {
            case 0:
                return ((ActionView) hn1Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((ActionView) hn1Var.X.h0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((ActionView) hn1Var.X.j0).requestFocus();
            case 3:
                return ((ActionView) hn1Var.X.g0).requestFocus();
            case 4:
                return ((ActionView) hn1Var.X.Z).requestFocus();
            case 5:
                return ((ActionView) hn1Var.X.f0).requestFocus();
            default:
                return ((ActionView) hn1Var.X.Y).requestFocus();
        }
    }
}
