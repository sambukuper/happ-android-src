package defpackage;

import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pp6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ RoutingRulesActivity i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ String k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp6(RoutingRulesActivity routingRulesActivity, String str, String str2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = routingRulesActivity;
        this.j0 = str;
        this.k0 = str2;
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
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new pp6(this.i0, this.j0, this.k0, q51Var, (byte) 0);
            default:
                return new pp6(this.i0, this.j0, this.k0, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    mn6 mn6VarC = this.i0.C();
                    String str = this.j0;
                    String str2 = this.k0;
                    mr2 mr2Var = mr2.GEOIP;
                    boolean z2 = this.i0.U0;
                    this.h0 = true;
                    vz7 vz7Var = mn6.j;
                    if (mn6VarC.C(str, str2, mr2Var, z2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                c71 c71Var2 = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    mn6 mn6VarC2 = this.i0.C();
                    String str3 = this.j0;
                    String str4 = this.k0;
                    mr2 mr2Var2 = mr2.GEOSITE;
                    boolean z4 = this.i0.U0;
                    this.h0 = true;
                    vz7 vz7Var2 = mn6.j;
                    if (mn6VarC2.C(str3, str4, mr2Var2, z4, this) == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }
}
