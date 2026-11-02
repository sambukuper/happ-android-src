package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class z42 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ ExcludedRoutesActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z42(ExcludedRoutesActivity excludedRoutesActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = excludedRoutesActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((z42) n((q51) obj2, bool)).q(dn8Var);
                return dn8Var;
            case 3:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((z42) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ExcludedRoutesActivity excludedRoutesActivity = this.i0;
        switch (b) {
            case 0:
                return new z42(excludedRoutesActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new z42(excludedRoutesActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                z42 z42Var = new z42(excludedRoutesActivity, q51Var, (byte) 2);
                z42Var.h0 = ((Boolean) obj).booleanValue();
                return z42Var;
            case 3:
                return new z42(excludedRoutesActivity, q51Var, (byte) 3);
            case 4:
                return new z42(excludedRoutesActivity, q51Var, (byte) 4);
            case 5:
                return new z42(excludedRoutesActivity, q51Var, (byte) 5);
            default:
                return new z42(excludedRoutesActivity, q51Var, (byte) 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        byte b2 = 2;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        ExcludedRoutesActivity excludedRoutesActivity = this.i0;
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
                m52 m52VarB = excludedRoutesActivity.B();
                this.h0 = true;
                m52VarB.e(this);
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    z42 z42Var = new z42(excludedRoutesActivity, q51Var, (byte) 0);
                    this.h0 = true;
                    if (u15.L(excludedRoutesActivity, z42Var, this) == c71Var) {
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
                w39.n0(obj);
                v5 v5Var = excludedRoutesActivity.Q0;
                if (v5Var != null) {
                    v5Var.m0.setEnabled(z3);
                    return dn8Var;
                }
                dh3.T("binding");
                throw null;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    xe2 xe2VarT = w51.t(new o(excludedRoutesActivity.B().d, (byte) 1));
                    z42 z42Var2 = new z42(excludedRoutesActivity, q51Var, b2);
                    this.h0 = true;
                    if (z91.n(xe2VarT, z42Var2, this) == c71Var) {
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
                    z42 z42Var3 = new z42(excludedRoutesActivity, q51Var, (byte) 3);
                    this.h0 = true;
                    if (u15.L(excludedRoutesActivity, z42Var3, this) == c71Var) {
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
                    xe2 xe2VarT2 = w51.t(new o(excludedRoutesActivity.B().d, (byte) 2));
                    k kVar = new k(excludedRoutesActivity, (q51) null, (byte) 9);
                    this.h0 = true;
                    if (z91.n(xe2VarT2, kVar, this) == c71Var) {
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
            default:
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    z42 z42Var4 = new z42(excludedRoutesActivity, q51Var, (byte) 5);
                    this.h0 = true;
                    if (u15.L(excludedRoutesActivity, z42Var4, this) == c71Var) {
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
        }
    }
}
