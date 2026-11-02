package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class v93 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ z93 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v93(z93 z93Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = z93Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 3:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 4:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 5:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 6:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 7:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 8:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 9:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            default:
                return n((q51) obj2, (dn8) obj).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        z93 z93Var = this.i0;
        switch (b) {
            case 0:
                return new v93(z93Var, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new v93(z93Var, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new v93(z93Var, q51Var, (byte) 2);
            case 3:
                return new v93(z93Var, q51Var, (byte) 3);
            case 4:
                return new v93(z93Var, q51Var, (byte) 4);
            case 5:
                return new v93(z93Var, q51Var, (byte) 5);
            case 6:
                return new v93(z93Var, q51Var, (byte) 6);
            case 7:
                return new v93(z93Var, q51Var, (byte) 7);
            case 8:
                return new v93(z93Var, q51Var, (byte) 8);
            case 9:
                return new v93(z93Var, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new v93(z93Var, q51Var, (byte) 10);
            default:
                return new v93(z93Var, q51Var, (byte) 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        z93 z93Var = this.i0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        byte b2 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    xe2 xe2VarT = w51.t(new o(z93Var.f, (byte) 5));
                    s93 s93Var = new s93(z93Var, q51Var, (byte) 0);
                    this.h0 = true;
                    if (z91.n(xe2VarT, s93Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    xe2 xe2VarT2 = w51.t(new o(z93Var.f, (byte) 6));
                    s93 s93Var2 = new s93(z93Var, q51Var, b2);
                    this.h0 = true;
                    if (z91.n(xe2VarT2, s93Var2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objL = z93Var.g.l(n93.a, this);
                    if (objL != c71Var) {
                        objL = dn8Var;
                    }
                    if (objL == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 5:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    ig8 ig8VarF = z93Var.f();
                    this.h0 = true;
                    if (ig8VarF.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 6:
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 7:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z8) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 8:
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z9) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 9:
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    ig8 ig8VarF2 = z93Var.f();
                    this.h0 = true;
                    if (ig8VarF2.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z10) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                boolean z11 = this.h0;
                if (!z11) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (z93Var.g(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z11) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            default:
                boolean z12 = this.h0;
                if (!z12) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objL2 = z93Var.g.l(o93.a, this);
                    if (objL2 != c71Var) {
                        objL2 = dn8Var;
                    }
                    if (objL2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z12) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
        }
    }
}
