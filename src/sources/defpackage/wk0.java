package defpackage;

import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class wk0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk0(int i, q51 q51Var, byte b) {
        super(i, q51Var);
        this.g0 = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                break;
            case 3:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new wk0(2, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new wk0(2, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new wk0(2, q51Var, (byte) 2);
            case 3:
                return new wk0(2, q51Var, (byte) 3);
            default:
                return new wk0(2, q51Var, (byte) 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        rj6 rj6Var = dn8.a;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    return u70.F(3000L, this) == c71Var ? c71Var : rj6Var;
                }
                if (z) {
                    w39.n0(obj);
                    return rj6Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    of7 of7Var = of7.a;
                    this.h0 = true;
                    return of7Var.a(this) == c71Var ? c71Var : rj6Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return rj6Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    of7 of7Var2 = of7.a;
                    this.h0 = true;
                    return of7Var2.a(this) == c71Var ? c71Var : rj6Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return rj6Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    of7 of7Var3 = of7.a;
                    this.h0 = true;
                    return of7Var3.a(this) == c71Var ? c71Var : rj6Var;
                }
                if (z4) {
                    w39.n0(obj);
                    return rj6Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.h0;
                try {
                    if (!z5) {
                        w39.n0(obj);
                        an7 an7Var = (an7) ev7.b.getValue();
                        this.h0 = true;
                        if (an7Var.c(this) == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z5) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                return new sj6(rj6Var);
        }
    }
}
