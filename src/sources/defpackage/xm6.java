package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xm6 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ym6 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xm6(ym6 ym6Var, byte b) {
        this.X = b;
        this.Y = ym6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        ym6 ym6Var = this.Y;
        switch (b) {
            case 0:
                return ((AppCompatEditText) ym6Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) ym6Var.X.g0).requestFocus();
            default:
                return ((HappForwardField) ym6Var.X.f0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        ym6 ym6Var = this.Y;
        switch (b) {
            case 0:
                return false;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((AppCompatEditText) ym6Var.X.Z).requestFocus();
            default:
                return ((HappForwardField) ym6Var.X.g0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        ym6 ym6Var = this.Y;
        switch (b) {
            case 0:
                return ((HappForwardField) ym6Var.X.g0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) ym6Var.X.f0).requestFocus();
            default:
                return ((HappForwardField) ym6Var.X.f0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        ym6 ym6Var = this.Y;
        switch (b) {
            case 0:
                return ((AppCompatEditText) ym6Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappForwardField) ym6Var.X.g0).requestFocus();
            default:
                return ((HappForwardField) ym6Var.X.f0).requestFocus();
        }
    }
}
