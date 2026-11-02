package defpackage;

import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class h93 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ InboundAuthActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h93(InboundAuthActivity inboundAuthActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = inboundAuthActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (q93) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (p93) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        InboundAuthActivity inboundAuthActivity = this.i0;
        switch (b) {
            case 0:
                h93 h93Var = new h93(inboundAuthActivity, q51Var, (byte) 0);
                h93Var.h0 = obj;
                return h93Var;
            default:
                h93 h93Var2 = new h93(inboundAuthActivity, q51Var, (byte) 1);
                h93Var2.h0 = obj;
                return h93Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        InboundAuthActivity inboundAuthActivity = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                int i = InboundAuthActivity.T0;
                inboundAuthActivity.C((q93) obj2, true);
                return dn8Var;
            default:
                p93 p93Var = (p93) obj2;
                w39.n0(obj);
                int i2 = InboundAuthActivity.T0;
                if (p93Var instanceof o93) {
                    pu.O(inboundAuthActivity, y46.warning_settings_after_tunnel_restart);
                    return dn8Var;
                }
                if (p93Var instanceof n93) {
                    pu.O(inboundAuthActivity, y46.title_pref_proxy_sharing_enabled_extend_warning);
                    return dn8Var;
                }
                b61.c();
                return null;
        }
    }
}
