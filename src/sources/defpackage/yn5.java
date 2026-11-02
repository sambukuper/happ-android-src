package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yn5 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xn5 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yn5(xn5 xn5Var, byte b) {
        this.X = b;
        this.Y = xn5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        xn5 xn5Var = this.Y;
        switch (b) {
            case 0:
                return ((HappSpinnerField) xn5Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappSliderField) xn5Var.X.j0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappEditText) xn5Var.X.g0).requestFocus();
            default:
                return ((HappSpinnerField) xn5Var.X.k0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        xn5 xn5Var = this.Y;
        switch (b) {
            case 0:
                l lVarI = ((RecyclerView) xn5Var.X.i0).I(((in5) xn5Var.Y.T0.getValue()).a() - 1);
                hn5 hn5Var = lVarI instanceof hn5 ? (hn5) lVarI : null;
                if (hn5Var == null) {
                    return false;
                }
                return ((qi3) hn5Var.v.Y).Z.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappSpinnerField) xn5Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappSliderField) xn5Var.X.j0).requestFocus();
            default:
                return ((HappEditText) xn5Var.X.g0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        xn5 xn5Var = this.Y;
        switch (b) {
            case 0:
                return ((HappSliderField) xn5Var.X.j0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappEditText) xn5Var.X.g0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappSpinnerField) xn5Var.X.k0).requestFocus();
            default:
                return ((HappSpinnerField) xn5Var.X.k0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        xn5 xn5Var = this.Y;
        switch (b) {
            case 0:
                return ((HappSpinnerField) xn5Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappSliderField) xn5Var.X.j0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((HappEditText) xn5Var.X.g0).requestFocus();
            default:
                return ((HappSpinnerField) xn5Var.X.k0).requestFocus();
        }
    }
}
