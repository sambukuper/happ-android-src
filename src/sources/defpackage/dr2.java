package defpackage;

import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dr2 extends xw8 {
    public final vz7 b = new vz7(new j72((byte) 14));
    public final oh7 c;
    public final h76 d;
    public final u77 e;
    public final f76 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dr2() {
        oh7 oh7VarA = ph7.a(new pq2(ec7.Y, true));
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.e = u77VarB;
        this.f = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(yq2 yq2Var) {
        Object value;
        pq2 pq2Var;
        Object value2;
        pq2 pq2Var2;
        boolean z = yq2Var instanceof vq2;
        oh7 oh7Var = this.c;
        if (z) {
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                pq2Var2 = (pq2) value2;
                pq2Var2.getClass();
            } while (!oh7Var.k(value2, pq2.a(pq2Var2, null, 1)));
            jm4.Q(zw8.a(this), (u61) null, new zq2(this, null, (byte) 1), 3);
            return;
        }
        if (yq2Var instanceof uq2) {
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
                pq2Var = (pq2) value;
                pq2Var.getClass();
            } while (!oh7Var.k(value, pq2.a(pq2Var, ec7.Y, 2)));
            jm4.Q(zw8.a(this), (u61) null, new zq2(this, null, (byte) 0), 3);
            return;
        }
        if (yq2Var instanceof wq2) {
            jm4.Q(zw8.a(this), (u61) null, new q0(this, ((wq2) yq2Var).a, (q51) null, (byte) 28), 3);
            return;
        }
        if (!(yq2Var instanceof xq2)) {
            b61.c();
            return;
        }
        GeoFileKey geoFileKey = ((xq2) yq2Var).a;
        mn6 mn6Var = (mn6) this.b.getValue();
        String strD = geoFileKey.d();
        vz7 vz7Var = mn6.j;
        RouteProfile routeProfileN = mn6Var.n(strD, (String) null);
        if (routeProfileN == null) {
            return;
        }
        jm4.Q(zw8.a(this), (u61) null, new r0(this, routeProfileN, geoFileKey, (q51) null, (byte) 23), 3);
    }
}
