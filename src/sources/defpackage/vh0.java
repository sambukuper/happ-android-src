package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 implements fg3 {
    public final zh0 a;
    public final Object b;
    public jk0 c;
    public final ArrayList d;
    public boolean e;
    public boolean f;

    public vh0(rj0 rj0Var, zh0 zh0Var) {
        zh0Var.getClass();
        this.a = zh0Var;
        this.b = new Object();
        this.d = new ArrayList();
    }

    @Override // defpackage.fg3
    public final void a(List list) throws ll0 {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setC = zh0.c(this.a);
            if (setC == null) {
                setC = m02.X;
            }
            for (Set set : setC) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vi0) it.next()).a);
                }
                Set setC1 = wv0.c1(arrayList);
                if (list.containsAll(setC1)) {
                    List listY0 = wv0.Y0(set);
                    if (listY0.size() >= 2) {
                        String str = ((vi0) listY0.get(0)).a;
                        String str2 = ((vi0) listY0.get(1)).a;
                        try {
                            if (hi5.h0(this.a, str) && hi5.h0(this.a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(str);
                                obj.getClass();
                                ((List) obj).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(str2);
                                obj2.getClass();
                                ((List) obj2).add(str);
                            }
                        } catch (pc3 e) {
                            if (hi5.m0()) {
                                Objects.toString(set);
                                e.getMessage();
                            }
                        }
                    }
                } else if (hi5.m0()) {
                    setC1.toString();
                    list.toString();
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new ll0("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d02] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [vh0] */
    public final void b(jk0 jk0Var) throws ll0 {
        ?? arrayList;
        jk0Var.getClass();
        synchronized (this.b) {
            this.c = jk0Var;
        }
        ArrayList arrayListA = zh0.a(this.a);
        if (arrayListA != null) {
            arrayList = new ArrayList(xv0.Z(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((vi0) it.next()).a);
            }
        } else {
            arrayList = d02.X;
        }
        a(arrayList);
    }
}
