package defpackage;

import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.service.d;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class za3 extends xw8 {
    public final vz7 b = new vz7(new tv2((byte) 26));
    public final oh7 c;
    public final h76 d;
    public final u77 e;
    public final f76 f;
    public og7 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public za3() {
        oh7 oh7VarA = ph7.a(ia3.a);
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 6, (l90) null);
        this.e = u77VarB;
        this.f = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ms e() {
        return (ms) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(xa3 xa3Var) {
        Object value;
        if (xa3Var instanceof sa3) {
            ja3 ja3Var = ((sa3) xa3Var).a;
            oh7 oh7Var = this.c;
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
                ((ja3) value).getClass();
            } while (!oh7Var.k(value, ja3Var));
            tu0 tu0VarA = zw8.a(this);
            nf1 nf1Var = tp1.a;
            this.g = jm4.Q(tu0VarA, dm4.a, new y9(ja3Var, this, (q51) null, (byte) 6), 2);
            return;
        }
        if (xa3Var instanceof oa3) {
            og7 og7Var = this.g;
            if (og7Var != null) {
                og7Var.m((CancellationException) null);
            }
            jm4.Q(zw8.a(this), (u61) null, new tk0(this, (q51) null, (byte) 3), 3);
            return;
        }
        if (xa3Var instanceof ra3) {
            og7 og7Var2 = this.g;
            if (og7Var2 != null) {
                og7Var2.m((CancellationException) null);
            }
            jm4.Q(zw8.a(this), (u61) null, new tk0(this, (q51) null, (byte) 3), 3);
            return;
        }
        if (xa3Var instanceof wa3) {
            jm4.Q(zw8.a(this), (u61) null, new jy2(this, ((wa3) xa3Var).a, (q51) null, (byte) 2), 3);
            return;
        }
        if (xa3Var instanceof ta3) {
            ms msVarE = e();
            msVarE.getClass();
            HappApplication happApplication = HappApplication.M0;
            HappApplication happApplicationI = k32.i();
            long j = msVarE.e;
            Long lValueOf = j != -1 ? Long.valueOf(j) : null;
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                d dVar = d.a;
                d.f(happApplicationI, jLongValue);
            }
            h(true);
            return;
        }
        if (xa3Var instanceof ua3) {
            jm4.Q(zw8.a(this), (u61) null, new ya3(this, null, (byte) 1), 3);
            return;
        }
        if (xa3Var instanceof va3) {
            u15.S(this.c, new ya2((byte) 22));
            return;
        }
        if (xa3Var instanceof pa3) {
            u15.S(this.c, new ya2((byte) 23));
        } else if (xa3Var instanceof qa3) {
            jm4.Q(zw8.a(this), (u61) null, new ya3(this, null, (byte) 0), 3);
        } else {
            b61.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(na3 na3Var, uy7 uy7Var) {
        Object objL = this.e.l(na3Var, uy7Var);
        return objL == c71.X ? objL : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z) {
        Object value;
        zo8 zo8Var;
        DownloadFilesInfo downloadFilesInfo;
        boolean z2;
        Object value2 = this.d.X.getValue();
        ga3 ga3Var = value2 instanceof ga3 ? (ga3) value2 : null;
        if (ga3Var == null) {
            return;
        }
        oh7 oh7Var = this.c;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            ((ja3) value).getClass();
            zo8Var = ga3Var.a;
            downloadFilesInfo = ga3Var.b;
            z2 = ga3Var.c;
            zo8Var.getClass();
            downloadFilesInfo.getClass();
        } while (!oh7Var.k(value, new ga3(zo8Var, downloadFilesInfo, z2, z)));
    }
}
