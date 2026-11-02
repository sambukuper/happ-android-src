package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fj4 {
    public final LinkedHashMap a;

    public fj4(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public bh7 a(s39 s39Var) {
        s39Var.getClass();
        return (bh7) this.a.remove(s39Var);
    }

    public List b(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (dh3.f(((s39) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((s39) it.next());
        }
        return wv0.Y0(linkedHashMap.values());
    }

    public bh7 c(s39 s39Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object bh7Var = linkedHashMap.get(s39Var);
        if (bh7Var == null) {
            bh7Var = new bh7(s39Var);
            linkedHashMap.put(s39Var, bh7Var);
        }
        return (bh7) bh7Var;
    }
}
