package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 {
    public static final ra0 b = new ra0(null);
    public final Map a;

    public ra0(ps psVar) {
        Map map = null;
        if (psVar != null) {
            ArrayList arrayList = psVar.b;
            int iG = aq4.G(xv0.Z(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
            for (Object obj : arrayList) {
                String str = ((yy3) obj).b;
                if (str == null) {
                    dh3.T("name");
                    throw null;
                }
                linkedHashMap.put(str, obj);
            }
            map = linkedHashMap;
        }
        this.a = map == null ? e02.X : map;
    }
}
