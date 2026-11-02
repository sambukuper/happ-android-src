package defpackage;

import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class v47 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ f63 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ v47(f63 f63Var, byte b) {
        this.X = b;
        this.Y = f63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        f63 f63Var = this.Y;
        switch (b) {
            case 0:
                c6 c6Var = (c6) f63Var.Y;
                if (((RelativeLayout) c6Var.f0).getVisibility() == 0) {
                    return ((RelativeLayout) c6Var.f0).requestFocus();
                }
                return ((RelativeLayout) c6Var.n0).getVisibility() == 0 ? ((RelativeLayout) c6Var.n0).requestFocus() : f63Var.v();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return f63Var.v();
            default:
                return f63Var.v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        f63 f63Var = this.Y;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return f63Var.w();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        f63 f63Var = this.Y;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return f63Var.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        f63 f63Var = this.Y;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return ((ConstraintLayout) ((c6) f63Var.Y).j0).requestFocus();
    }
}
