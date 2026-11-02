package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ua0 {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        gk2 gk2Var = tg7.j;
        qg5 qg5Var = new qg5(gk2Var.a(v15.e("name")).i(), ug7.d);
        qg5 qg5Var2 = new qg5(gk2Var.a(v15.e("ordinal")).i(), v15.e("ordinal"));
        qg5 qg5Var3 = new qg5(g33.i(tg7.C, "size"), v15.e("size"));
        fk2 fk2Var = tg7.G;
        Map mapJ = zp4.J(qg5Var, qg5Var2, qg5Var3, new qg5(g33.i(fk2Var, "size"), v15.e("size")), new qg5(tg7.e.a(v15.e("length")).i(), v15.e("length")), new qg5(g33.i(fk2Var, "keys"), v15.e("keySet")), new qg5(g33.i(fk2Var, "values"), v15.e("values")), new qg5(g33.i(fk2Var, "entries"), v15.e("entrySet")), new qg5(g33.i(tg7.a0, "size"), v15.e("length")), new qg5(g33.i(tg7.b0, "size"), v15.e("length")), new qg5(g33.i(tg7.c0, "size"), v15.e("length")));
        a = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        ArrayList<qg5> arrayList = new ArrayList(xv0.Z(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new qg5(((fk2) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (qg5 qg5Var4 : arrayList) {
            v15 v15Var = (v15) qg5Var4.Y;
            Object arrayList2 = linkedHashMap.get(v15Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(v15Var, arrayList2);
            }
            ((List) arrayList2).add((v15) qg5Var4.X);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), wv0.n0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = ll3.a;
            qs0 qs0VarH = ll3.h(((fk2) entry3.getKey()).b().a);
            qs0VarH.getClass();
            linkedHashSet.add(qs0VarH.a().a((v15) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(xv0.Z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((fk2) it.next()).a.g());
        }
        d = wv0.c1(arrayList3);
    }
}
