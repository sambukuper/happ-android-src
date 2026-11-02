package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ex8 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapQ = zp4.Q(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapQ.values().iterator();
        while (it.hasNext()) {
            ((xw8) it.next()).b();
        }
    }

    public final String toString() {
        String strE = yb6.a.b(ex8.class).E();
        if (strE == null) {
            strE = "ViewModelStore";
        }
        int iHashCode = hashCode();
        km4.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strE + "@" + string + "(keys=" + wv0.c1(this.a.keySet()) + ")";
    }
}
