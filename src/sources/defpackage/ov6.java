package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ov6 {
    public final LinkedHashMap a;
    public final y5 b;

    public ov6() {
        this.a = new LinkedHashMap();
        this.b = new y5(e02.X);
    }

    public final h76 a(Parcelable parcelable) {
        y5 y5Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) y5Var.f0;
        boolean zContainsKey = linkedHashMap.containsKey("state");
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) y5Var.Y;
        if (zContainsKey) {
            Object objA = linkedHashMap.get("state");
            if (objA == null) {
                if (!linkedHashMap2.containsKey("state")) {
                    linkedHashMap2.put("state", parcelable);
                }
                objA = ph7.a(linkedHashMap2.get("state"));
                linkedHashMap.put("state", objA);
            }
            return jm4.n((oh7) objA);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) y5Var.g0;
        Object objA2 = linkedHashMap3.get("state");
        if (objA2 == null) {
            if (!linkedHashMap2.containsKey("state")) {
                linkedHashMap2.put("state", parcelable);
            }
            objA2 = ph7.a(linkedHashMap2.get("state"));
            linkedHashMap3.put("state", objA2);
        }
        return jm4.n((oh7) objA2);
    }

    public final void b(Object obj) {
        if (obj != null) {
            ArrayList arrayList = qv6.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Class) it.next()).isInstance(obj));
            }
            em7.c(pc6.n("Can't put value with type ", obj.getClass(), " into saved state"));
            return;
        }
        ArrayList arrayList2 = qv6.a;
        Object obj2 = this.a.get("state");
        yz4 yz4Var = obj2 instanceof yz4 ? (yz4) obj2 : null;
        if (yz4Var != null) {
            yz4Var.j(obj);
        }
        this.b.a0(obj, "state");
    }

    public ov6(ip4 ip4Var) {
        this.a = new LinkedHashMap();
        this.b = new y5(ip4Var);
    }
}
