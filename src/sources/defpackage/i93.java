package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class i93 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ InboundAuthActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i93(InboundAuthActivity inboundAuthActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = inboundAuthActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
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
                return n(q51Var, b71Var).q(dn8Var);
            case 4:
                n(q51Var, b71Var).q(dn8Var);
                return c71.X;
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        InboundAuthActivity inboundAuthActivity = this.i0;
        switch (b) {
            case 0:
                return new i93(inboundAuthActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new i93(inboundAuthActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new i93(inboundAuthActivity, q51Var, (byte) 2);
            case 3:
                return new i93(inboundAuthActivity, q51Var, (byte) 3);
            case 4:
                return new i93(inboundAuthActivity, q51Var, (byte) 4);
            default:
                return new i93(inboundAuthActivity, q51Var, (byte) 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        byte b2 = 0;
        dn8 dn8Var = dn8.a;
        InboundAuthActivity inboundAuthActivity = this.i0;
        c71 c71Var = c71.X;
        byte b3 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                o oVar = new o(inboundAuthActivity.B().f, (byte) 3);
                h93 h93Var = new h93(inboundAuthActivity, q51Var, b2);
                this.h0 = true;
                return z91.n(oVar, h93Var, this) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    i93 i93Var = new i93(inboundAuthActivity, q51Var, b2);
                    this.h0 = true;
                    return u15.L(inboundAuthActivity, i93Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                z93 z93VarB = inboundAuthActivity.B();
                this.h0 = true;
                z93VarB.k(this);
                return c71Var;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    i93 i93Var2 = new i93(inboundAuthActivity, q51Var, (byte) 2);
                    this.h0 = true;
                    return u15.L(inboundAuthActivity, i93Var2, this) == c71Var ? c71Var : dn8Var;
                }
                if (z4) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.h0;
                if (z5) {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = inboundAuthActivity.B().h;
                h93 h93Var2 = new h93(inboundAuthActivity, q51Var, b3);
                f76Var.getClass();
                this.h0 = true;
                if (z91.n(f76Var, h93Var2, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            default:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    i93 i93Var3 = new i93(inboundAuthActivity, q51Var, (byte) 4);
                    this.h0 = true;
                    return u15.L(inboundAuthActivity, i93Var3, this) == c71Var ? c71Var : dn8Var;
                }
                if (z6) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
