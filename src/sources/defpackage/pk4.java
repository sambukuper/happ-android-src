package defpackage;

import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pk4 extends uy7 implements sn2 {
    public boolean g0;
    public /* synthetic */ String h0;
    public /* synthetic */ ImportResult i0;
    public final /* synthetic */ MainActivity j0;
    public final /* synthetic */ String k0;
    public final /* synthetic */ SubscriptionItem l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ boolean o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk4(MainActivity mainActivity, String str, SubscriptionItem subscriptionItem, boolean z, String str2, boolean z2, q51 q51Var) {
        super(3, q51Var);
        this.j0 = mainActivity;
        this.k0 = str;
        this.l0 = subscriptionItem;
        this.m0 = z;
        this.n0 = str2;
        this.o0 = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        qg5 qg5Var;
        Object next;
        String str = this.h0;
        ImportResult importResult = this.i0;
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            int i = MainActivity.y1;
            boolean zC = this.j0.H().c("pref_reject_duplicates_subscription", true);
            kw4 kw4Var = kw4.a;
            List listD = kw4.d();
            String strX0 = fm7.x0("happ://add/", str);
            String str2 = this.k0;
            if (zC) {
                Iterator it = listD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((SubscriptionItem) ((qg5) next).Y).Y(strX0));
                qg5 qg5Var2 = (qg5) next;
                qg5Var = qg5Var2 == null ? new qg5(Boolean.FALSE, new SubId(str2)) : new qg5(Boolean.TRUE, qg5Var2.X);
            } else {
                qg5Var = new qg5(Boolean.FALSE, new SubId(str2));
            }
            boolean zBooleanValue = ((Boolean) qg5Var.X).booleanValue();
            String strD = ((SubId) qg5Var.Y).d();
            this.h0 = null;
            this.i0 = null;
            this.g0 = true;
            Object objS = this.j0.S(importResult, strD, this.l0, this.m0, zBooleanValue, this.n0, null, null, this.o0, true, listD, this);
            c71 c71Var = c71.X;
            if (objS == c71Var) {
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(Object obj, Object obj2, Object obj3) {
        String str = this.n0;
        boolean z = this.o0;
        pk4 pk4Var = new pk4(this.j0, this.k0, this.l0, this.m0, str, z, (q51) obj3);
        pk4Var.h0 = (String) obj;
        pk4Var.i0 = (ImportResult) obj2;
        return pk4Var.q(dn8.a);
    }
}
