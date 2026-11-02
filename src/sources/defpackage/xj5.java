package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xj5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ PerAppProxyActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj5(PerAppProxyActivity perAppProxyActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = perAppProxyActivity;
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
                return n(q51Var, b71Var).q(dn8Var);
            case 5:
                return n(q51Var, b71Var).q(dn8Var);
            case 6:
                return n(q51Var, b71Var).q(dn8Var);
            case 7:
                return n(q51Var, b71Var).q(dn8Var);
            case 8:
                return n(q51Var, b71Var).q(dn8Var);
            case 9:
                return n(q51Var, b71Var).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                n(q51Var, b71Var).q(dn8Var);
                return c71.X;
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        PerAppProxyActivity perAppProxyActivity = this.i0;
        switch (b) {
            case 0:
                return new xj5(perAppProxyActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new xj5(perAppProxyActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new xj5(perAppProxyActivity, q51Var, (byte) 2);
            case 3:
                return new xj5(perAppProxyActivity, q51Var, (byte) 3);
            case 4:
                return new xj5(perAppProxyActivity, q51Var, (byte) 4);
            case 5:
                return new xj5(perAppProxyActivity, q51Var, (byte) 5);
            case 6:
                return new xj5(perAppProxyActivity, q51Var, (byte) 6);
            case 7:
                return new xj5(perAppProxyActivity, q51Var, (byte) 7);
            case 8:
                return new xj5(perAppProxyActivity, q51Var, (byte) 8);
            case 9:
                return new xj5(perAppProxyActivity, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new xj5(perAppProxyActivity, q51Var, (byte) 10);
            default:
                return new xj5(perAppProxyActivity, q51Var, (byte) 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        byte b2 = 4;
        byte b3 = 2;
        byte b4 = 8;
        byte b5 = 0;
        dn8 dn8Var = dn8.a;
        PerAppProxyActivity perAppProxyActivity = this.i0;
        c71 c71Var = c71.X;
        byte b6 = 1;
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
                xe2 xe2VarT = w51.t(new o(perAppProxyActivity.B().g, (byte) 15));
                jy2 jy2Var = new jy2(perAppProxyActivity, (q51) null, (byte) 17);
                this.h0 = true;
                return z91.n(xe2VarT, jy2Var, this) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    xj5 xj5Var = new xj5(perAppProxyActivity, q51Var, b5);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var, this) == c71Var ? c71Var : dn8Var;
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
                xe2 xe2VarT2 = w51.t(new o(perAppProxyActivity.B().g, (byte) 16));
                yj5 yj5Var = new yj5(perAppProxyActivity, q51Var, b5);
                this.h0 = true;
                return z91.n(xe2VarT2, yj5Var, this) == c71Var ? c71Var : dn8Var;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    xj5 xj5Var2 = new xj5(perAppProxyActivity, q51Var, b3);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var2, this) == c71Var ? c71Var : dn8Var;
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
                    if (z5) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xe2 xe2VarT3 = w51.t(new o(perAppProxyActivity.B().g, (byte) 17));
                l40 l40Var = new l40(perAppProxyActivity, (q51) null, (byte) 8);
                this.h0 = true;
                return z91.n(xe2VarT3, l40Var, this) == c71Var ? c71Var : dn8Var;
            case 5:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    xj5 xj5Var3 = new xj5(perAppProxyActivity, q51Var, b2);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var3, this) == c71Var ? c71Var : dn8Var;
                }
                if (z6) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.h0;
                if (z7) {
                    if (z7) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                cl5 cl5VarB = perAppProxyActivity.B();
                this.h0 = true;
                h76 h76Var = cl5VarB.g;
                Object objN = z91.n(zc1.H(w51.t(new lf2(new xe2[]{w51.t(new o(h76Var, (byte) 18)), w51.t(new o(h76Var, (byte) 19)), w51.t(new o(h76Var, (byte) 20))}, new xk5(cl5VarB, null), (byte) 4)), tp1.a), new k(cl5VarB, (q51) null, (byte) 23), this);
                if (objN != c71Var) {
                    objN = dn8Var;
                }
                return objN == c71Var ? c71Var : dn8Var;
            case 7:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    xj5 xj5Var4 = new xj5(perAppProxyActivity, q51Var, (byte) 6);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var4, this) == c71Var ? c71Var : dn8Var;
                }
                if (z8) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z9 = this.h0;
                if (z9) {
                    if (z9) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                cl5 cl5VarB2 = perAppProxyActivity.B();
                this.h0 = true;
                cl5VarB2.i(this);
                return c71Var;
            case 9:
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    xj5 xj5Var5 = new xj5(perAppProxyActivity, q51Var, b4);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var5, this) == c71Var ? c71Var : dn8Var;
                }
                if (z10) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                boolean z11 = this.h0;
                if (z11) {
                    if (!z11) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = perAppProxyActivity.B().i;
                yj5 yj5Var2 = new yj5(perAppProxyActivity, q51Var, b6);
                f76Var.getClass();
                this.h0 = true;
                if (z91.n(f76Var, yj5Var2, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            default:
                boolean z12 = this.h0;
                if (!z12) {
                    w39.n0(obj);
                    xj5 xj5Var6 = new xj5(perAppProxyActivity, q51Var, (byte) 10);
                    this.h0 = true;
                    return u15.L(perAppProxyActivity, xj5Var6, this) == c71Var ? c71Var : dn8Var;
                }
                if (z12) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
