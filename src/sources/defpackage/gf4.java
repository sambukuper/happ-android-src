package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class gf4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ la i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf4(la laVar, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = laVar;
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new gf4(this.i0, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new gf4(this.i0, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new gf4(this.i0, q51Var, (byte) 2);
            case 3:
                return new gf4(this.i0, q51Var, (byte) 3);
            case 4:
                return new gf4(this.i0, q51Var, (byte) 4);
            case 5:
                return new gf4(this.i0, q51Var, (byte) 5);
            case 6:
                return new gf4(this.i0, q51Var, (byte) 6);
            case 7:
                return new gf4(this.i0, q51Var, (byte) 7);
            case 8:
                return new gf4(this.i0, q51Var, (byte) 8);
            case 9:
                return new gf4(this.i0, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new gf4(this.i0, q51Var, (byte) 10);
            default:
                return new gf4(this.i0, q51Var, (byte) 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        cv1 cv1Var = cv1.X;
        bv1 bv1Var = bv1.X;
        dn8 dn8Var = dn8.a;
        la laVar = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, dv1.Y, this) == c71Var ? c71Var : dn8Var;
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
                    this.h0 = true;
                    return t9.a(laVar, dv1.X, this) == c71Var ? c71Var : dn8Var;
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
                    this.h0 = true;
                    return t9.a(laVar, cv1.Y, this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, cv1Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z4) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, cv1.Z, this) == c71Var ? c71Var : dn8Var;
                }
                if (z5) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, cv1Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z6) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, cv1Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z7) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, bv1.Y, this) == c71Var ? c71Var : dn8Var;
                }
                if (z8) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, bv1Var, this) == c71Var ? c71Var : dn8Var;
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
                    this.h0 = true;
                    return t9.a(laVar, bv1.Z, this) == c71Var ? c71Var : dn8Var;
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
                    this.h0 = true;
                    return t9.a(laVar, bv1Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z11) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z12 = this.h0;
                if (!z12) {
                    w39.n0(obj);
                    this.h0 = true;
                    return t9.a(laVar, bv1Var, this) == c71Var ? c71Var : dn8Var;
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
