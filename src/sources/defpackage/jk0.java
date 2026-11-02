package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jk0 implements fg3 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public xb4 d;
    public qd0 e;
    public t6 f;

    @Override // defpackage.fg3
    public final void a(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f.i(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<cj0> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((cj0) this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (cj0) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (cj0) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    for (cj0 cj0Var : arrayList) {
                        if (cj0Var != null) {
                            cj0Var.p();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (kl0 e) {
            throw new ll0("Failed to create CameraInternal", e);
        }
    }

    public final cj0 b(String str) {
        cj0 cj0Var;
        synchronized (this.a) {
            try {
                cj0Var = (cj0) this.b.get(str);
                if (cj0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cj0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(t6 t6Var) {
        this.f = t6Var;
        synchronized (this.a) {
            try {
                for (String str : t6Var.h()) {
                    hi5.z0("CameraRepository");
                    cj0 cj0Var = (cj0) this.b.put(str, t6Var.i(str));
                    if (cj0Var != null) {
                        cj0Var.a();
                    }
                }
            } catch (kl0 e) {
                throw new pc3(e);
            }
        }
    }
}
