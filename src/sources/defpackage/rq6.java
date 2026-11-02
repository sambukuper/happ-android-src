package defpackage;

import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rq6 extends uy7 implements rn2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new rq6(2, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        w39.n0(obj);
        kw4 kw4Var = kw4.a;
        la2 la2Var = new la2(new hu(kw4.d(), (byte) 1), true, new zw5((byte) 19));
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        em5 em5Var = new em5(dm5Var);
        ka2 ka2Var = new ka2(la2Var);
        while (ka2Var.hasNext()) {
            qg5 qg5Var = (qg5) ka2Var.next();
            Object obj2 = qg5Var.X;
            SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var.Y;
            String strD = ((SubId) obj2).d();
            em5Var.put(new SubId(strD), new yr7(strD, subscriptionItem, false));
        }
        dm5 dm5VarF = em5Var.f();
        SubId.Companion.getClass();
        if (dm5VarF.Z.containsKey(new SubId(SubId.c()))) {
            return dm5VarF;
        }
        dm5 dm5Var2 = dm5.f0;
        dm5Var2.getClass();
        em5 em5Var2 = new em5(dm5Var2);
        em5Var2.put(new SubId(SubId.c()), new yr7(SubId.c(), new SubscriptionItem(null, 268435455, null), false));
        em5Var2.putAll(dm5VarF);
        return em5Var2.f();
    }
}
