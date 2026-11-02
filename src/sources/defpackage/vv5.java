package defpackage;

import java.util.ListIterator;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vv5 extends xw8 {
    public final vz7 b = new vz7(new dw4((byte) 24));
    public fn6 c;
    public final oh7 d;
    public final h76 e;
    public final u77 f;
    public final f76 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vv5() {
        oh7 oh7VarA = ph7.a(new nv5());
        this.d = oh7VarA;
        this.e = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.f = u77VarB;
        this.g = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        Object value;
        oh7 oh7Var = this.d;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            ((nv5) value).getClass();
        } while (!oh7Var.k(value, new nv5()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(tv5 tv5Var) {
        Object value;
        nv5 nv5Var;
        if (tv5Var instanceof rv5) {
            rv5 rv5Var = (rv5) tv5Var;
            String str = rv5Var.a;
            this.c = rv5Var.b;
            jm4.Q(zw8.a(this), (u61) null, new y9(this, str, (q51) null, (byte) 14), 3);
            return;
        }
        if (tv5Var instanceof pv5) {
            e();
            return;
        }
        if (tv5Var instanceof qv5) {
            jm4.Q(zw8.a(this), (u61) null, new bv(this, (q51) null, (byte) 9), 3);
            return;
        }
        if (!(tv5Var instanceof sv5)) {
            b61.c();
            return;
        }
        RouteProfile routeProfile = ((sv5) tv5Var).a;
        h76 h76Var = this.e;
        km5 km5VarX = ((nv5) h76Var.X.getValue()).c.contains(routeProfile) ? oc.x(((nv5) h76Var.X.getValue()).c, routeProfile) : oc.z(((nv5) h76Var.X.getValue()).c, routeProfile);
        j2 j2Var = ((nv5) h76Var.X.getValue()).b;
        qm5 qm5VarC = ec7.Y.c();
        ListIterator listIterator = j2Var.listIterator(0);
        while (listIterator.hasNext()) {
            om6 om6Var = (om6) listIterator.next();
            boolean zContainsKey = km5VarX.Z.containsKey(om6Var.a);
            RouteProfile routeProfile2 = om6Var.a;
            SubscriptionItem subscriptionItem = om6Var.b;
            routeProfile2.getClass();
            qm5VarC.add(new om6(routeProfile2, subscriptionItem, zContainsKey));
        }
        j2 j2VarC = qm5VarC.c();
        oh7 oh7Var = this.d;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            nv5Var = (nv5) value;
            nv5Var.getClass();
        } while (!oh7Var.k(value, nv5.a(nv5Var, null, j2VarC, km5VarX, 9)));
    }
}
