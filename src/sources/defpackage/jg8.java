package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jg8 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b67 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jg8(b67 b67Var, byte b) {
        this.X = b;
        this.Y = b67Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        b67 b67Var = this.Y;
        switch (b) {
            case 0:
                return b67Var.a(b67Var.Y.E0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return b67Var.a(b67Var.Y.n0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return b67Var.a(b67Var.Y.m0);
            case 3:
                return b67Var.a(b67Var.Y.o0);
            case 4:
                return b67Var.a(b67Var.Y.p0);
            case 5:
                return b67Var.a(b67Var.Y.g0);
            case 6:
                return b67Var.a(b67Var.Y.I0);
            case 7:
                return b67Var.a(b67Var.Y.k0);
            case 8:
                return b67Var.a(b67Var.Y.l0);
            case 9:
                return b67Var.a(b67Var.Y.D0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return b67Var.a(b67Var.Y.f0);
            case 11:
                return b67Var.a(b67Var.Y.F0);
            case 12:
                return b67Var.a(b67Var.Y.Y);
            case 13:
                return b67Var.a(b67Var.Y.K0);
            case 14:
                return b67Var.a(b67Var.Y.q0);
            case 15:
                return b67Var.a(b67Var.Y.G0);
            case 16:
                return b67Var.a(b67Var.Y.Z);
            case 17:
                return b67Var.a(b67Var.Y.H0);
            case 18:
                return b67Var.a(b67Var.Y.B0);
            case 19:
                return b67Var.a(b67Var.Y.C0);
            case 20:
                return b67Var.a(b67Var.Y.i0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return b67Var.a(b67Var.Y.h0);
            case 22:
                return b67Var.a(b67Var.Y.j0);
            default:
                return b67Var.a(b67Var.Y.J0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        b67 b67Var = this.Y;
        switch (b) {
            case 0:
                return b67Var.a(b67Var.Y.J0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return b67Var.a(b67Var.Y.E0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return b67Var.a(b67Var.Y.n0);
            case 3:
                return b67Var.a(b67Var.Y.m0);
            case 4:
                return b67Var.a(b67Var.Y.o0);
            case 5:
                return b67Var.a(b67Var.Y.B0);
            case 6:
                dm2 dm2Var = b67Var.Y;
                if (dm2Var.t0.getVisibility() != 0) {
                    return b67Var.a(dm2Var.H0);
                }
                if (dm2Var.u0.getVisibility() == 0) {
                    return dm2Var.x0.getVisibility() == 0 ? b67Var.a(dm2Var.p0) : b67Var.a(dm2Var.J0);
                }
                return dm2Var.s0.getVisibility() == 0 ? b67Var.a(dm2Var.g0) : b67Var.a(dm2Var.B0);
            case 7:
                return b67Var.a(b67Var.Y.I0);
            case 8:
                return b67Var.a(b67Var.Y.k0);
            case 9:
                return b67Var.a(b67Var.Y.l0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                c67 c67Var = (c67) b67Var.Z.Y0.getValue();
                return c67Var.a(c67Var.Y.Z);
            case 11:
                dm2 dm2Var2 = b67Var.Y;
                return dm2Var2.w0.getVisibility() == 0 ? b67Var.a(dm2Var2.D0) : b67Var.a(dm2Var2.I0);
            case 12:
                return b67Var.a(b67Var.Y.F0);
            case 13:
                return b67Var.a(b67Var.Y.Y);
            case 14:
                return b67Var.a(b67Var.Y.K0);
            case 15:
                return b67Var.a(b67Var.Y.q0);
            case 16:
                return b67Var.a(b67Var.Y.f0);
            case 17:
                return b67Var.a(b67Var.Y.Z);
            case 18:
                return b67Var.a(b67Var.Y.H0);
            case 19:
                return b67Var.a(b67Var.Y.B0);
            case 20:
                return b67Var.a(b67Var.Y.C0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return b67Var.a(b67Var.Y.i0);
            case 22:
                return b67Var.a(b67Var.Y.h0);
            default:
                return b67Var.a(b67Var.Y.j0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        b67 b67Var = this.Y;
        switch (b) {
            case 0:
                return b67Var.a(b67Var.Y.n0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return b67Var.a(b67Var.Y.m0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return b67Var.a(b67Var.Y.o0);
            case 3:
                return b67Var.a(b67Var.Y.p0);
            case 4:
                return b67Var.a(b67Var.Y.I0);
            case 5:
                return b67Var.a(b67Var.Y.I0);
            case 6:
                dm2 dm2Var = b67Var.Y;
                return dm2Var.w0.getVisibility() == 0 ? b67Var.a(dm2Var.k0) : b67Var.a(dm2Var.F0);
            case 7:
                return b67Var.a(b67Var.Y.l0);
            case 8:
                return b67Var.a(b67Var.Y.D0);
            case 9:
                return b67Var.a(b67Var.Y.F0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return b67Var.a(b67Var.Y.Z);
            case 11:
                return b67Var.a(b67Var.Y.Y);
            case 12:
                return b67Var.a(b67Var.Y.K0);
            case 13:
                dm2 dm2Var2 = b67Var.Y;
                if (dm2Var2.A0.getVisibility() == 0) {
                    return b67Var.a(dm2Var2.q0);
                }
                w57 w57Var = (w57) b67Var.Z.a1.getValue();
                return w57Var.a(w57Var.Y.g0);
            case 14:
                return b67Var.a(b67Var.Y.G0);
            case 15:
                w57 w57Var2 = (w57) b67Var.Z.a1.getValue();
                return w57Var2.a(w57Var2.Y.g0);
            case 16:
                return b67Var.a(b67Var.Y.H0);
            case 17:
                dm2 dm2Var3 = b67Var.Y;
                return dm2Var3.t0.getVisibility() == 0 ? b67Var.a(dm2Var3.B0) : b67Var.a(dm2Var3.I0);
            case 18:
                dm2 dm2Var4 = b67Var.Y;
                if (dm2Var4.u0.getVisibility() == 0) {
                    return b67Var.a(dm2Var4.C0);
                }
                return dm2Var4.s0.getVisibility() == 0 ? b67Var.a(dm2Var4.g0) : b67Var.a(dm2Var4.I0);
            case 19:
                return b67Var.a(b67Var.Y.i0);
            case 20:
                return b67Var.a(b67Var.Y.h0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return b67Var.a(b67Var.Y.j0);
            case 22:
                return b67Var.a(b67Var.Y.J0);
            default:
                dm2 dm2Var5 = b67Var.Y;
                return dm2Var5.x0.getVisibility() == 0 ? b67Var.a(dm2Var5.E0) : b67Var.a(dm2Var5.I0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        b67 b67Var = this.Y;
        switch (b) {
            case 0:
                return b67Var.a(b67Var.Y.E0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return b67Var.a(b67Var.Y.n0);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return b67Var.a(b67Var.Y.m0);
            case 3:
                return b67Var.a(b67Var.Y.o0);
            case 4:
                return b67Var.a(b67Var.Y.p0);
            case 5:
                return b67Var.a(b67Var.Y.g0);
            case 6:
                return b67Var.a(b67Var.Y.I0);
            case 7:
                return b67Var.a(b67Var.Y.k0);
            case 8:
                return b67Var.a(b67Var.Y.l0);
            case 9:
                return b67Var.a(b67Var.Y.D0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return b67Var.a(b67Var.Y.f0);
            case 11:
                return b67Var.a(b67Var.Y.F0);
            case 12:
                return b67Var.a(b67Var.Y.Y);
            case 13:
                return b67Var.a(b67Var.Y.K0);
            case 14:
                return b67Var.a(b67Var.Y.q0);
            case 15:
                return b67Var.a(b67Var.Y.G0);
            case 16:
                return b67Var.a(b67Var.Y.Z);
            case 17:
                return b67Var.a(b67Var.Y.H0);
            case 18:
                return b67Var.a(b67Var.Y.B0);
            case 19:
                return b67Var.a(b67Var.Y.C0);
            case 20:
                return b67Var.a(b67Var.Y.i0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return b67Var.a(b67Var.Y.h0);
            case 22:
                return b67Var.a(b67Var.Y.j0);
            default:
                return b67Var.a(b67Var.Y.J0);
        }
    }
}
