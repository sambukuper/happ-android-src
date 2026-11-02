package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rh8 {
    public final LinkedHashMap a;

    public rh8(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final rh8 a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ql3 ql3Var = (ql3) entry.getValue();
            linkedHashMap2.put(key, new ql3(ql3Var.a, ql3Var.b, ql3Var.c, true, true));
        }
        return new rh8(linkedHashMap2);
    }
}
