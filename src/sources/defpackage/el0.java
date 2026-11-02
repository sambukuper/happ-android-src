package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 {
    public final List a;

    public el0(List list) {
        this.a = list;
        ze5 ze5Var = (ze5) wv0.r0(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ze5) it.next()).b != ze5Var.b) {
                bt.i("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.a + ", imageSourceConfig=null)";
    }
}
