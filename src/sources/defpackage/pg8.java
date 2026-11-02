package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.settings.TunnelSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pg8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ TunnelSettingsFragment i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg8(TunnelSettingsFragment tunnelSettingsFragment, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = tunnelSettingsFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                return c71.X;
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
                return n(q51Var, b71Var).q(dn8Var);
            case 11:
                return n(q51Var, b71Var).q(dn8Var);
            case 12:
                return n(q51Var, b71Var).q(dn8Var);
            case 13:
                return n(q51Var, b71Var).q(dn8Var);
            case 14:
                return n(q51Var, b71Var).q(dn8Var);
            case 15:
                return n(q51Var, b71Var).q(dn8Var);
            case 16:
                return n(q51Var, b71Var).q(dn8Var);
            case 17:
                return n(q51Var, b71Var).q(dn8Var);
            case 18:
                return n(q51Var, b71Var).q(dn8Var);
            case 19:
                return n(q51Var, b71Var).q(dn8Var);
            case 20:
                return n(q51Var, b71Var).q(dn8Var);
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        TunnelSettingsFragment tunnelSettingsFragment = this.i0;
        switch (b) {
            case 0:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 2);
            case 3:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 3);
            case 4:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 4);
            case 5:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 5);
            case 6:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 6);
            case 7:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 7);
            case 8:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 8);
            case 9:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 10);
            case 11:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 11);
            case 12:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 12);
            case 13:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 13);
            case 14:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 14);
            case 15:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 15);
            case 16:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 16);
            case 17:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 17);
            case 18:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 18);
            case 19:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 19);
            case 20:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 20);
            default:
                return new pg8(tunnelSettingsFragment, q51Var, (byte) 21);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        TunnelSettingsFragment tunnelSettingsFragment = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = tunnelSettingsFragment.U().e;
                l40 l40Var = new l40(tunnelSettingsFragment, (q51) null, (byte) 16);
                this.h0 = true;
                if (z91.n(f76Var, l40Var, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    ig8 ig8VarU = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU2 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU2.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU3 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU3.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU4 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU4.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU5 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU5.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU6 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU6.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU7 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU7.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU8 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU8.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU9 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU9.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU10 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU10.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU11 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU11.b(this) == c71Var ? c71Var : dn8Var;
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
                    ig8 ig8VarU12 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU12.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z13) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z14 = this.h0;
                if (!z14) {
                    w39.n0(obj);
                    ig8 ig8VarU13 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU13.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z14) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z15 = this.h0;
                if (!z15) {
                    w39.n0(obj);
                    ig8 ig8VarU14 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU14.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z15) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z16 = this.h0;
                if (!z16) {
                    w39.n0(obj);
                    ig8 ig8VarU15 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU15.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z16) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                boolean z17 = this.h0;
                if (!z17) {
                    w39.n0(obj);
                    ig8 ig8VarU16 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU16.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z17) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                boolean z18 = this.h0;
                if (!z18) {
                    w39.n0(obj);
                    ig8 ig8VarU17 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU17.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z18) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z19 = this.h0;
                if (!z19) {
                    w39.n0(obj);
                    ig8 ig8VarU18 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU18.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z19) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z20 = this.h0;
                if (!z20) {
                    w39.n0(obj);
                    ig8 ig8VarU19 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU19.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z20) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z21 = this.h0;
                if (!z21) {
                    w39.n0(obj);
                    ig8 ig8VarU20 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU20.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z21) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z22 = this.h0;
                if (!z22) {
                    w39.n0(obj);
                    ig8 ig8VarU21 = tunnelSettingsFragment.U();
                    this.h0 = true;
                    return ig8VarU21.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (z22) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
