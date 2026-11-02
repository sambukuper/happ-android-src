package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ProfileRoutingSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class gw5 extends xw8 {
    public final vz7 b = new vz7(new dw4((byte) 25));
    public fn6 c;
    public final oh7 d;
    public final h76 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gw5() {
        SubId.Companion.getClass();
        oh7 oh7VarA = ph7.a(new cw5(null, SubId.c(), "", null, false));
        this.d = oh7VarA;
        this.e = jm4.n(oh7VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    public final void e(fw5 fw5Var) {
        mn6 mn6Var;
        String str;
        RouteProfileId routeProfileId;
        ProfileRoutingSettings profileRoutingSettingsE0;
        Object value;
        if (fw5Var instanceof dw5) {
            dw5 dw5Var = (dw5) fw5Var;
            String str2 = dw5Var.a;
            String str3 = dw5Var.b;
            boolean z = dw5Var.c;
            String str4 = dw5Var.d;
            String str5 = dw5Var.e;
            this.c = dw5Var.f;
            oh7 oh7Var = this.d;
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
                ((cw5) value).getClass();
                str5.getClass();
                str3.getClass();
            } while (!oh7Var.k(value, new cw5(str2, str5, str3, str4, z)));
            return;
        }
        if (!(fw5Var instanceof ew5)) {
            b61.c();
            return;
        }
        h76 h76Var = this.e;
        String str6 = ((cw5) h76Var.X.getValue()).e;
        vz7 vz7Var = this.b;
        if (str6 != null) {
            ((mn6) vz7Var.getValue()).getClass();
            Object objF = mn6.f(str6);
            if (objF instanceof rj6) {
                objF = null;
            }
            profileRoutingSettingsE0 = (ProfileRoutingSettings) objF;
            if (profileRoutingSettingsE0 == null) {
                mn6Var = (mn6) vz7Var.getValue();
                str = ((cw5) h76Var.X.getValue()).a;
                if (str != null) {
                    routeProfileId = new RouteProfileId(str);
                } else {
                    routeProfileId = null;
                }
                if (routeProfileId != null) {
                    bt.q("Required value was null.");
                    return;
                } else {
                    String strC = routeProfileId.c();
                    mn6Var.getClass();
                    profileRoutingSettingsE0 = ys0.e0(mn6.d(strC), ((cw5) h76Var.X.getValue()).c);
                }
            }
        } else {
            mn6Var = (mn6) vz7Var.getValue();
            str = ((cw5) h76Var.X.getValue()).a;
            if (str != null) {
                routeProfileId = new RouteProfileId(str);
            } else {
                routeProfileId = null;
            }
            if (routeProfileId != null) {
                bt.q("Required value was null.");
                return;
            } else {
                String strC2 = routeProfileId.c();
                mn6Var.getClass();
                profileRoutingSettingsE0 = ys0.e0(mn6.d(strC2), ((cw5) h76Var.X.getValue()).c);
            }
        }
        jm4.Q(zw8.a(this), (u61) null, new jy2(this, profileRoutingSettingsE0, (q51) null, (byte) 21), 3);
    }
}
