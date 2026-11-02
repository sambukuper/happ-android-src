package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp4 extends aq4 {
    public static Object H(Map map, Object obj) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap I(qg5... qg5VarArr) {
        HashMap map = new HashMap(aq4.G(qg5VarArr.length));
        N(map, qg5VarArr);
        return map;
    }

    public static Map J(qg5... qg5VarArr) {
        if (qg5VarArr.length <= 0) {
            return e02.X;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(qg5VarArr.length));
        N(linkedHashMap, qg5VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap K(qg5... qg5VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(qg5VarArr.length));
        N(linkedHashMap, qg5VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap L(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void M(AbstractMap abstractMap, la2 la2Var) {
        ka2 ka2Var = new ka2(la2Var);
        while (ka2Var.hasNext()) {
            qg5 qg5Var = (qg5) ka2Var.next();
            abstractMap.put(qg5Var.X, qg5Var.Y);
        }
    }

    public static final void N(HashMap map, qg5[] qg5VarArr) {
        for (qg5 qg5Var : qg5VarArr) {
            map.put(qg5Var.X, qg5Var.Y);
        }
    }

    public static List O(Map map) {
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return i21.K(new qg5(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new qg5(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new qg5(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return d02.X;
    }

    public static Map P(List list) {
        int size = list.size();
        if (size == 0) {
            return e02.X;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(list.size()));
            R(list, linkedHashMap);
            return linkedHashMap;
        }
        qg5 qg5Var = (qg5) list.get(0);
        qg5Var.getClass();
        Map mapSingletonMap = Collections.singletonMap(qg5Var.X, qg5Var.Y);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map Q(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return e02.X;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static void R(Iterable iterable, AbstractMap abstractMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qg5 qg5Var = (qg5) it.next();
            abstractMap.put(qg5Var.X, qg5Var.Y);
        }
    }

    public static LinkedHashMap S(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
