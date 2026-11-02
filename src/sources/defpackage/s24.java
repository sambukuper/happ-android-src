package defpackage;

import java.util.Iterator;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class s24 {
    public final vz7 a = new vz7(new ei3((byte) 10));
    public final vz7 b = new vz7(new ei3((byte) 11));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        Object obj;
        str.getClass();
        gv6 gv6Var = (gv6) this.b.getValue();
        gv6Var.getClass();
        vz7 vz7Var = gv6Var.a;
        ((ak7) vz7Var.getValue()).d("current_provider_id", str);
        String strA = ak7.a((ak7) vz7Var.getValue(), "current_provider_id");
        if (strA == null) {
            yb6.a.b(gv6.class).E();
            ((ak7) vz7Var.getValue()).d("current_provider_id", str);
            return;
        }
        kw4 kw4Var = kw4.a;
        Iterator it = kw4.d().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String providerId = ((SubscriptionItem) ((qg5) next).Y).getProviderId();
            if (!dh3.f(providerId != null ? providerId : null, strA)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            yb6.a.b(gv6.class).E();
            ((ak7) vz7Var.getValue()).d("current_provider_id", str);
        }
    }
}
