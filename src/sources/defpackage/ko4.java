package defpackage;

import java.util.Iterator;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ko4 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (cm5) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        ko4 ko4Var = new ko4(2, q51Var);
        ko4Var.g0 = obj;
        return ko4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        boolean z;
        b2 b2Var = (cm5) this.g0;
        w39.n0(obj);
        if (b2Var.isEmpty() || b2Var.isEmpty()) {
            z = true;
        } else {
            Iterator it = b2Var.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((Map.Entry) it.next()).getValue() instanceof StateDownloadFileV2.Success)) {
                    z = false;
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
