package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z72 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(qg7.y, a("java.util.ArrayList", "java.util.LinkedList"));
        b(qg7.z, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(qg7.A, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        fk2 fk2Var = new fk2("java.util.function.Function");
        b(new qs0(fk2Var.b(), fk2Var.a.g()), a("java.util.function.UnaryOperator"));
        fk2 fk2Var2 = new fk2("java.util.function.BiFunction");
        b(new qs0(fk2Var2.b(), fk2Var2.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new qg5(((qs0) entry.getKey()).a(), ((qs0) entry.getValue()).a()));
        }
        b = zp4.P(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            fk2 fk2Var = new fk2(str);
            arrayList.add(new qs0(fk2Var.b(), fk2Var.a.g()));
        }
        return arrayList;
    }

    public static void b(qs0 qs0Var, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, qs0Var);
        }
    }
}
