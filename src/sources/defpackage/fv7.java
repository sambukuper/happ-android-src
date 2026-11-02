package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class fv7 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zv7 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fv7(zv7 zv7Var, byte b) {
        this.X = b;
        this.Y = zv7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        zv7 zv7Var = this.Y;
        switch (b) {
            case 0:
                si3 si3Var = (si3) zv7Var.X;
                if (si3Var.s0.getVisibility() == 0) {
                    return si3Var.s0.requestFocus();
                }
                if (si3Var.r0.getVisibility() == 0) {
                    return si3Var.r0.requestFocus();
                }
                if (si3Var.o0.getVisibility() == 0) {
                    return si3Var.o0.requestFocus();
                }
                return si3Var.f0.getVisibility() == 0 ? si3Var.f0.requestFocus() : si3Var.h0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                si3 si3Var2 = (si3) zv7Var.X;
                if (si3Var2.r0.getVisibility() == 0) {
                    return si3Var2.r0.requestFocus();
                }
                if (si3Var2.o0.getVisibility() == 0) {
                    return si3Var2.o0.requestFocus();
                }
                return si3Var2.f0.getVisibility() == 0 ? si3Var2.f0.requestFocus() : si3Var2.s0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                si3 si3Var3 = (si3) zv7Var.X;
                if (si3Var3.o0.getVisibility() == 0) {
                    return si3Var3.o0.requestFocus();
                }
                return si3Var3.f0.getVisibility() == 0 ? si3Var3.f0.requestFocus() : si3Var3.r0.requestFocus();
            case 3:
                ck4 ck4Var = ((dw7) zv7Var.Y).n;
                return ck4Var != null && ck4Var.X.i0.requestFocus();
            case 4:
                return ((si3) zv7Var.X).f0.requestFocus();
            case 5:
                boolean zN = zv7Var.n();
                si3 si3Var4 = (si3) zv7Var.X;
                return zN ? si3Var4.v0.requestFocus() : si3Var4.w0.requestFocus();
            default:
                return ((si3) zv7Var.X).v0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        zv7 zv7Var = this.Y;
        switch (b) {
            case 0:
                return zv7Var.t();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return zv7Var.t();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return zv7Var.t();
            case 3:
                return zv7Var.t();
            case 4:
                return zv7Var.t();
            case 5:
                return ((si3) zv7Var.X).h0.requestFocus();
            default:
                return ((si3) zv7Var.X).h0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        zv7 zv7Var = this.Y;
        switch (b) {
            case 0:
                si3 si3Var = (si3) zv7Var.X;
                if (zv7Var.o()) {
                    return si3Var.w0.requestFocus();
                }
                return zv7Var.n() ? si3Var.v0.requestFocus() : zv7Var.s();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                si3 si3Var2 = (si3) zv7Var.X;
                if (zv7Var.o()) {
                    return si3Var2.w0.requestFocus();
                }
                return zv7Var.n() ? si3Var2.v0.requestFocus() : zv7Var.s();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                si3 si3Var3 = (si3) zv7Var.X;
                if (si3Var3.w0.getVisibility() == 0) {
                    return si3Var3.w0.requestFocus();
                }
                return si3Var3.v0.getVisibility() == 0 ? si3Var3.v0.requestFocus() : zv7Var.s();
            case 3:
                si3 si3Var4 = (si3) zv7Var.X;
                if (zv7Var.o()) {
                    return si3Var4.w0.requestFocus();
                }
                return zv7Var.n() ? si3Var4.v0.requestFocus() : zv7Var.s();
            case 4:
                si3 si3Var5 = (si3) zv7Var.X;
                if (zv7Var.o()) {
                    return si3Var5.w0.requestFocus();
                }
                return zv7Var.n() ? si3Var5.v0.requestFocus() : zv7Var.s();
            case 5:
                return zv7Var.s();
            default:
                return zv7Var.s();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        zv7 zv7Var = this.Y;
        switch (b) {
            case 0:
                return ((si3) zv7Var.X).h0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                si3 si3Var = (si3) zv7Var.X;
                return si3Var.h0.getVisibility() == 0 ? si3Var.h0.requestFocus() : si3Var.s0.requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                si3 si3Var2 = (si3) zv7Var.X;
                if (si3Var2.s0.getVisibility() == 0) {
                    return si3Var2.s0.requestFocus();
                }
                return si3Var2.h0.getVisibility() == 0 ? si3Var2.h0.requestFocus() : si3Var2.r0.requestFocus();
            case 3:
                si3 si3Var3 = (si3) zv7Var.X;
                if (si3Var3.r0.getVisibility() == 0) {
                    return si3Var3.r0.requestFocus();
                }
                if (si3Var3.s0.getVisibility() == 0) {
                    return si3Var3.s0.requestFocus();
                }
                return si3Var3.h0.getVisibility() == 0 ? si3Var3.h0.requestFocus() : si3Var3.o0.requestFocus();
            case 4:
                si3 si3Var4 = (si3) zv7Var.X;
                if (si3Var4.r0.getVisibility() == 0) {
                    return si3Var4.r0.requestFocus();
                }
                if (si3Var4.s0.getVisibility() == 0) {
                    return si3Var4.s0.requestFocus();
                }
                return si3Var4.h0.getVisibility() == 0 ? si3Var4.h0.requestFocus() : si3Var4.f0.requestFocus();
            case 5:
                return ((si3) zv7Var.X).w0.requestFocus();
            default:
                boolean zO = zv7Var.o();
                si3 si3Var5 = (si3) zv7Var.X;
                return zO ? si3Var5.w0.requestFocus() : si3Var5.v0.requestFocus();
        }
    }
}
