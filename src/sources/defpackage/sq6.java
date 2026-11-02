package defpackage;

import java.util.Map;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sq6 extends xw8 {
    public final oh7 b;
    public final h76 c;
    public final u77 d;
    public final f76 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sq6() {
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        oh7 oh7VarA = ph7.a(new kq6(dm5Var, null, true));
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.d = u77VarB;
        this.e = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        Object value;
        kq6 kq6Var;
        dm5 dm5Var;
        oh7 oh7Var = this.b;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            kq6Var = (kq6) value;
            kq6Var.getClass();
            dm5Var = dm5.f0;
            dm5Var.getClass();
        } while (!oh7Var.k(value, kq6.a(kq6Var, dm5Var, null, false, 4)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(qq6 qq6Var) {
        Object value;
        kq6 kq6Var;
        Object value2;
        kq6 kq6Var2;
        boolean z = qq6Var instanceof oq6;
        oh7 oh7Var = this.b;
        if (z) {
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                kq6Var2 = (kq6) value2;
                kq6Var2.getClass();
            } while (!oh7Var.k(value2, kq6.a(kq6Var2, null, null, true, 3)));
            jm4.Q(zw8.a(this), (u61) null, new r5(this, (q51) null, (byte) 28), 3);
            return;
        }
        boolean z2 = qq6Var instanceof nq6;
        h76 h76Var = this.c;
        if (z2) {
            String str = ((kq6) h76Var.X.getValue()).b;
            if (str == null) {
                return;
            }
            jm4.Q(zw8.a(this), (u61) null, new jy2(this, str, (q51) null, (byte) 27), 3);
            return;
        }
        if (!(qq6Var instanceof pq6)) {
            if (qq6Var instanceof mq6) {
                e();
                return;
            } else {
                b61.c();
                return;
            }
        }
        String str2 = ((pq6) qq6Var).a;
        b2 b2Var = ((kq6) h76Var.X.getValue()).a;
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        em5 em5Var = new em5(dm5Var);
        for (Map.Entry entry : b2Var.a()) {
            Object key = entry.getKey();
            yr7 yr7Var = (yr7) entry.getValue();
            String strD = ((SubId) key).d();
            SubId subId = new SubId(strD);
            boolean zF = dh3.f(strD, str2);
            String str3 = yr7Var.a;
            SubscriptionItem subscriptionItem = yr7Var.b;
            str3.getClass();
            subscriptionItem.getClass();
            em5Var.put(subId, new yr7(str3, subscriptionItem, zF));
        }
        cm5 cm5VarF = em5Var.f();
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            kq6Var = (kq6) value;
            kq6Var.getClass();
        } while (!oh7Var.k(value, kq6.a(kq6Var, cm5VarF, str2, false, 4)));
    }
}
