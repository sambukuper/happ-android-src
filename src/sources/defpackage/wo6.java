package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class wo6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ ep6 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo6(ep6 ep6Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = ep6Var;
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
            default:
                return n((q51) obj2, (dn8) obj).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new wo6(this.i0, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new wo6(this.i0, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new wo6(this.i0, q51Var, (byte) 2);
            case 3:
                return new wo6(this.i0, q51Var, (byte) 3);
            case 4:
                return new wo6(this.i0, q51Var, (byte) 4);
            default:
                return new wo6(this.i0, q51Var, (byte) 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object value;
        Object value2;
        byte b = this.g0;
        un6 un6Var = un6.a;
        dn8 dn8Var = dn8.a;
        ep6 ep6Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (ep6Var.k(un6Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ep6Var.getClass();
                oh7 oh7Var = ep6Var.e;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, sn6.a((sn6) value, null, null, null, null, null, op7.Y, false, null, 479)));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (ep6Var.k(un6Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ep6Var.getClass();
                oh7 oh7Var2 = ep6Var.e;
                oh7Var2.getClass();
                do {
                    value2 = oh7Var2.getValue();
                } while (!oh7Var2.k(value2, sn6.a((sn6) value2, null, null, null, null, null, op7.Z, false, null, 479)));
                return dn8Var;
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
                xe2 xe2VarH = zc1.H(new lf2(ep6Var.e().g, ep6Var, (byte) 8), tp1.a);
                k kVar = new k(ep6Var, (q51) null, (byte) 29);
                this.h0 = true;
                return z91.n(xe2VarH, kVar, this) == c71Var ? c71Var : dn8Var;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    this.h0 = true;
                    ep6Var.l(this);
                    return c71Var;
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
                this.h0 = true;
                Object objB = ((ig8) ep6Var.c.getValue()).b(this);
                if (objB != c71Var) {
                    objB = dn8Var;
                }
                return objB == c71Var ? c71Var : dn8Var;
            default:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    this.h0 = true;
                    return ep6Var.k(bo6.a, this) == c71Var ? c71Var : dn8Var;
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
