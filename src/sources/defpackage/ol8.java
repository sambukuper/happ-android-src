package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ol8 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ pl8 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ol8(pl8 pl8Var, byte b) {
        this.X = b;
        this.Y = pl8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        pl8 pl8Var = this.Y;
        switch (b) {
            case 0:
                return ((HappToggleField) pl8Var.X.g0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappSpinnerField) pl8Var.X.Z).requestFocus();
            default:
                return ((HappToggleField) pl8Var.X.h0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        pl8 pl8Var = this.Y;
        switch (b) {
            case 0:
                return false;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappToggleField) pl8Var.X.g0).requestFocus();
            default:
                return ((HappSpinnerField) pl8Var.X.Z).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        pl8 pl8Var = this.Y;
        switch (b) {
            case 0:
                return ((HappSpinnerField) pl8Var.X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                y5 y5Var = pl8Var.X;
                return ((HappToggleField) y5Var.h0).getVisibility() == 0 ? ((HappToggleField) y5Var.h0).requestFocus() : ((HappSpinnerField) y5Var.Z).requestFocus();
            default:
                return ((HappToggleField) pl8Var.X.h0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        pl8 pl8Var = this.Y;
        switch (b) {
            case 0:
                return ((HappToggleField) pl8Var.X.g0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappSpinnerField) pl8Var.X.Z).requestFocus();
            default:
                return ((HappToggleField) pl8Var.X.h0).requestFocus();
        }
    }
}
