package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mz8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ VpnSettingsActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz8(VpnSettingsActivity vpnSettingsActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = vpnSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return n(q51Var, b71Var).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return n(q51Var, b71Var).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return n(q51Var, b71Var).q(dn8Var);
            case 3:
                n(q51Var, b71Var).q(dn8Var);
                return c71Var;
            case 4:
                return n(q51Var, b71Var).q(dn8Var);
            case 5:
                n(q51Var, b71Var).q(dn8Var);
                return c71Var;
            case 6:
                return n(q51Var, b71Var).q(dn8Var);
            case 7:
                return n(q51Var, b71Var).q(dn8Var);
            case 8:
                return n(q51Var, b71Var).q(dn8Var);
            case 9:
                return n(q51Var, b71Var).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return n(q51Var, b71Var).q(dn8Var);
            case 11:
                return n(q51Var, b71Var).q(dn8Var);
            case 12:
                return n(q51Var, b71Var).q(dn8Var);
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        VpnSettingsActivity vpnSettingsActivity = this.i0;
        switch (b) {
            case 0:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 2);
            case 3:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 3);
            case 4:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 4);
            case 5:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 5);
            case 6:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 6);
            case 7:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 7);
            case 8:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 8);
            case 9:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 10);
            case 11:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 11);
            case 12:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 12);
            default:
                return new mz8(vpnSettingsActivity, q51Var, (byte) 13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        VpnSettingsActivity vpnSettingsActivity = this.i0;
        c71 c71Var = c71.X;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    uz8 uz8VarC = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    uz8 uz8VarC2 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC2.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    uz8 uz8VarC3 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC3.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.h0;
                if (z4) {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                h76 h76Var = vpnSettingsActivity.C().d;
                nz8 nz8Var = new nz8(vpnSettingsActivity, null, (byte) 0);
                h76Var.getClass();
                this.h0 = true;
                if (z91.n(h76Var, nz8Var, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    mz8 mz8Var = new mz8(vpnSettingsActivity, q51Var, (byte) 3);
                    this.h0 = true;
                    return u15.L(vpnSettingsActivity, mz8Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z5) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.h0;
                if (z6) {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = vpnSettingsActivity.C().f;
                nz8 nz8Var2 = new nz8(vpnSettingsActivity, null, (byte) 1);
                f76Var.getClass();
                this.h0 = true;
                if (z91.n(f76Var, nz8Var2, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 6:
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    mz8 mz8Var2 = new mz8(vpnSettingsActivity, q51Var, (byte) 5);
                    this.h0 = true;
                    return u15.L(vpnSettingsActivity, mz8Var2, this) == c71Var ? c71Var : dn8Var;
                }
                if (z7) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.h0;
                if (z8) {
                    if (z8) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                uz8 uz8VarC4 = vpnSettingsActivity.C();
                this.h0 = true;
                uz8VarC4.f(this);
                return c71Var;
            case 8:
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    mz8 mz8Var3 = new mz8(vpnSettingsActivity, q51Var, (byte) 7);
                    this.h0 = true;
                    return u15.L(vpnSettingsActivity, mz8Var3, this) == c71Var ? c71Var : dn8Var;
                }
                if (z9) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    uz8 uz8VarC5 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC5.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z10) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                boolean z11 = this.h0;
                if (!z11) {
                    w39.n0(obj);
                    uz8 uz8VarC6 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC6.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z11) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z12 = this.h0;
                if (!z12) {
                    w39.n0(obj);
                    uz8 uz8VarC7 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC7.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z12) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z13 = this.h0;
                if (!z13) {
                    w39.n0(obj);
                    uz8 uz8VarC8 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC8.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z13) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z14 = this.h0;
                if (!z14) {
                    w39.n0(obj);
                    uz8 uz8VarC9 = vpnSettingsActivity.C();
                    this.h0 = true;
                    return uz8VarC9.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z14) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
