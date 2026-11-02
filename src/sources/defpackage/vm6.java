package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vm6 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wm6 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vm6(wm6 wm6Var, byte b) {
        this.X = b;
        this.Y = wm6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        wm6 wm6Var = this.Y;
        switch (b) {
            case 0:
                return ((HappToggleField) wm6Var.X.k0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) wm6Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappForwardField) wm6Var.X.h0).requestFocus();
            case 3:
                return ((HappForwardField) wm6Var.X.g0).requestFocus();
            default:
                return ((HappSpinnerField) wm6Var.X.Z).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        wm6 wm6Var = this.Y;
        switch (b) {
            case 0:
                return false;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappToggleField) wm6Var.X.k0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappForwardField) wm6Var.X.i0).requestFocus();
            case 3:
                return ((HappForwardField) wm6Var.X.h0).requestFocus();
            default:
                return ((HappForwardField) wm6Var.X.g0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        wm6 wm6Var = this.Y;
        switch (b) {
            case 0:
                return ((HappForwardField) wm6Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) wm6Var.X.h0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappForwardField) wm6Var.X.g0).requestFocus();
            case 3:
                return ((HappSpinnerField) wm6Var.X.Z).requestFocus();
            default:
                return ((HappSpinnerField) wm6Var.X.Z).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        wm6 wm6Var = this.Y;
        switch (b) {
            case 0:
                return ((HappToggleField) wm6Var.X.k0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) wm6Var.X.i0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappForwardField) wm6Var.X.h0).requestFocus();
            case 3:
                return ((HappForwardField) wm6Var.X.g0).requestFocus();
            default:
                return ((HappSpinnerField) wm6Var.X.Z).requestFocus();
        }
    }
}
