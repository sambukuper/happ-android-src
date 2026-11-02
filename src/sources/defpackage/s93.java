package defpackage;

import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class s93 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ z93 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s93(z93 z93Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = z93Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        InboundAuthMode inboundAuthMode = (InboundAuthMode) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, inboundAuthMode).q(dn8Var);
                break;
            default:
                n(q51Var, inboundAuthMode).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        z93 z93Var = this.i0;
        switch (b) {
            case 0:
                s93 s93Var = new s93(z93Var, q51Var, (byte) 0);
                s93Var.h0 = obj;
                return s93Var;
            default:
                s93 s93Var2 = new s93(z93Var, q51Var, (byte) 1);
                s93Var2.h0 = obj;
                return s93Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object value;
        q93 q93Var;
        Object value2;
        q93 q93Var2;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        z93 z93Var = this.i0;
        InboundAuthMode inboundAuthMode = (InboundAuthMode) this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                if (inboundAuthMode == InboundAuthMode.MANUAL) {
                    String strJ = z93Var.e().j("pref_socks_auth_manual_user", "");
                    String str = strJ == null ? "" : strJ;
                    String strJ2 = z93Var.e().j("pref_socks_auth_manual_pass", "");
                    String str2 = strJ2 == null ? "" : strJ2;
                    oh7 oh7Var = z93Var.e;
                    oh7Var.getClass();
                    do {
                        value = oh7Var.getValue();
                        q93Var = (q93) value;
                    } while (!oh7Var.k(value, q93.a(q93Var, m93.a(q93Var.a, null, null, str, str2, 3), false, null, 6)));
                }
                break;
            default:
                w39.n0(obj);
                if (inboundAuthMode == InboundAuthMode.MANUAL) {
                    String strJ3 = z93Var.e().j("pref_http_auth_manual_user", "");
                    String str3 = strJ3 == null ? "" : strJ3;
                    String strJ4 = z93Var.e().j("pref_http_auth_manual_pass", "");
                    String str4 = strJ4 == null ? "" : strJ4;
                    oh7 oh7Var2 = z93Var.e;
                    oh7Var2.getClass();
                    do {
                        value2 = oh7Var2.getValue();
                        q93Var2 = (q93) value2;
                    } while (!oh7Var2.k(value2, q93.a(q93Var2, null, false, m93.a(q93Var2.c, null, null, str3, str4, 3), 3)));
                }
                break;
        }
        return dn8Var;
    }
}
