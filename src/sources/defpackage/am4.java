package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.f;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class am4 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ck4 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ am4(ck4 ck4Var, byte b) {
        this.X = b;
        this.Y = ck4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        ck4 ck4Var = this.Y;
        switch (b) {
            case 0:
                return ck4Var.X.C0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ck4Var.X.C0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ck4Var.X.n0.requestFocus();
            case 3:
                return ck4Var.X.f0.requestFocus();
            case 4:
                return ck4Var.X.n0.requestFocus();
            case 5:
                return ck4Var.X.C0.requestFocus();
            case 6:
                AppCompatButton appCompatButton = ck4Var.X.o0;
                return appCompatButton != null && appCompatButton.requestFocus();
            case 7:
                return ck4Var.X.Y.requestFocus();
            default:
                return ck4Var.X.y0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        ck4 ck4Var = this.Y;
        switch (b) {
            case 0:
                return ck4Var.X.E0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ck4Var.X.C0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ck4Var.X.C0.requestFocus();
            case 3:
                b6 b6Var = ck4Var.X;
                return b6Var.n0.getVisibility() == 0 ? b6Var.n0.requestFocus() : b6Var.C0.requestFocus();
            case 4:
                b6 b6Var2 = ck4Var.X;
                if (b6Var2.f0.getVisibility() == 0) {
                    return b6Var2.f0.requestFocus();
                }
                return b6Var2.n0.getVisibility() == 0 ? b6Var2.n0.requestFocus() : b6Var2.C0.requestFocus();
            case 5:
                b6 b6Var3 = ck4Var.X;
                if (b6Var3.g0.getVisibility() == 0) {
                    return b6Var3.g0.requestFocus();
                }
                if (b6Var3.f0.getVisibility() == 0) {
                    return b6Var3.f0.requestFocus();
                }
                return b6Var3.n0.getVisibility() == 0 ? b6Var3.n0.requestFocus() : b6Var3.E0.requestFocus();
            case 6:
                return ck4Var.X.i0.requestFocus();
            case 7:
                return ck4Var.X.i0.requestFocus();
            default:
                b6 b6Var4 = ck4Var.X;
                return b6Var4.Y.getVisibility() == 0 ? b6Var4.Y.requestFocus() : b6Var4.i0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        AppCompatButton appCompatButton;
        byte b = this.X;
        ck4 ck4Var = this.Y;
        switch (b) {
            case 0:
                return ck4Var.X.i0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                b6 b6Var = ck4Var.X;
                if (b6Var.n0.getVisibility() == 0) {
                    return b6Var.n0.requestFocus();
                }
                if (b6Var.f0.getVisibility() == 0) {
                    return b6Var.f0.requestFocus();
                }
                return b6Var.g0.getVisibility() == 0 ? b6Var.g0.requestFocus() : b6Var.i0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                b6 b6Var2 = ck4Var.X;
                if (b6Var2.f0.getVisibility() == 0) {
                    return b6Var2.f0.requestFocus();
                }
                return b6Var2.g0.getVisibility() == 0 ? b6Var2.g0.requestFocus() : b6Var2.i0.requestFocus();
            case 3:
                b6 b6Var3 = ck4Var.X;
                return b6Var3.g0.getVisibility() == 0 ? b6Var3.g0.requestFocus() : b6Var3.i0.requestFocus();
            case 4:
                return ck4Var.X.i0.requestFocus();
            case 5:
                b6 b6Var4 = ck4Var.X;
                LinearLayout linearLayout = b6Var4.x0;
                if (linearLayout != null && linearLayout.getVisibility() == 0 && (appCompatButton = b6Var4.o0) != null && appCompatButton.isEnabled()) {
                    AppCompatButton appCompatButton2 = b6Var4.o0;
                    return appCompatButton2 != null && appCompatButton2.requestFocus();
                }
                if (b6Var4.Y.getVisibility() == 0) {
                    return b6Var4.Y.requestFocus();
                }
                return b6Var4.y0.getVisibility() == 0 ? b6Var4.y0.requestFocus() : b6Var4.i0.requestFocus();
            case 6:
                AppCompatButton appCompatButton3 = ck4Var.X.o0;
                return appCompatButton3 != null && appCompatButton3.requestFocus();
            case 7:
                b6 b6Var5 = ck4Var.X;
                return b6Var5.y0.getVisibility() == 0 ? b6Var5.y0.requestFocus() : b6Var5.Y.requestFocus();
            default:
                return ck4Var.X.y0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        ck4 ck4Var = this.Y;
        switch (b) {
            case 0:
                b6 b6Var = ck4Var.X;
                f adapter = b6Var.A0.getAdapter();
                return (adapter != null ? adapter.a() : 0) > 0 ? ck4Var.b() : b6Var.E0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ck4Var.X.E0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ck4Var.X.E0.requestFocus();
            case 3:
                return ck4Var.X.E0.requestFocus();
            case 4:
                return ck4Var.X.E0.requestFocus();
            case 5:
                b6 b6Var2 = ck4Var.X;
                f adapter2 = b6Var2.A0.getAdapter();
                return (adapter2 != null ? adapter2.a() : 0) > 0 ? ck4Var.b() : b6Var2.E0.requestFocus();
            case 6:
                b6 b6Var3 = ck4Var.X;
                f adapter3 = b6Var3.A0.getAdapter();
                if ((adapter3 != null ? adapter3.a() : 0) > 0) {
                    return ck4Var.b();
                }
                AppCompatButton appCompatButton = b6Var3.o0;
                return appCompatButton != null && appCompatButton.requestFocus();
            case 7:
                return ck4Var.X.Y.requestFocus();
            default:
                return ck4Var.X.y0.requestFocus();
        }
    }
}
