package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ff7 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final bf7 g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set setL0 = eu.L0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(xv0.Z(setL0, 10));
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            arrayList.add(g55.v("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", ut3.BOOLEAN.Z));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((bf7) it2.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((bf7) it3.next()).b.b());
        }
        ut3 ut3Var = ut3.BOOLEAN;
        String str = ut3Var.Z;
        String str2 = ut3Var.Z;
        bf7 bf7VarV = g55.v("java/util/Collection", "contains", "Ljava/lang/Object;", str);
        ef7 ef7Var = ef7.f0;
        qg5 qg5Var = new qg5(bf7VarV, ef7Var);
        qg5 qg5Var2 = new qg5(g55.v("java/util/Collection", "remove", "Ljava/lang/Object;", str2), ef7Var);
        qg5 qg5Var3 = new qg5(g55.v("java/util/Map", "containsKey", "Ljava/lang/Object;", str2), ef7Var);
        qg5 qg5Var4 = new qg5(g55.v("java/util/Map", "containsValue", "Ljava/lang/Object;", str2), ef7Var);
        qg5 qg5Var5 = new qg5(g55.v("java/util/Map", "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), ef7Var);
        qg5 qg5Var6 = new qg5(g55.v("java/util/Map", "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), ef7.g0);
        bf7 bf7VarV2 = g55.v("java/util/Map", "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        ef7 ef7Var2 = ef7.Y;
        qg5 qg5Var7 = new qg5(bf7VarV2, ef7Var2);
        qg5 qg5Var8 = new qg5(g55.v("java/util/Map", "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), ef7Var2);
        ut3 ut3Var2 = ut3.INT;
        bf7 bf7VarV3 = g55.v("java/util/List", "indexOf", "Ljava/lang/Object;", ut3Var2.Z);
        ef7 ef7Var3 = ef7.Z;
        Map mapJ = zp4.J(qg5Var, qg5Var2, qg5Var3, qg5Var4, qg5Var5, qg5Var6, qg5Var7, qg5Var8, new qg5(bf7VarV3, ef7Var3), new qg5(g55.v("java/util/List", "lastIndexOf", "Ljava/lang/Object;", ut3Var2.Z), ef7Var3));
        c = mapJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(mapJ.size()));
        for (Map.Entry entry : mapJ.entrySet()) {
            linkedHashMap.put(((bf7) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetZ = q57.Z(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(xv0.Z(linkedHashSetZ, 10));
        Iterator it4 = linkedHashSetZ.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((bf7) it4.next()).b);
        }
        e = wv0.c1(arrayList5);
        ArrayList arrayList6 = new ArrayList(xv0.Z(linkedHashSetZ, 10));
        Iterator it5 = linkedHashSetZ.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((bf7) it5.next()).e);
        }
        f = wv0.c1(arrayList6);
        ut3 ut3Var3 = ut3.INT;
        String str3 = ut3Var3.Z;
        String str4 = ut3Var3.Z;
        bf7 bf7VarV4 = g55.v("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        g = bf7VarV4;
        Map mapJ2 = zp4.J(new qg5(new bf7("java/lang/Number", id5.w, _UrlKt.FRAGMENT_ENCODE_SET, ut3.BYTE.Z), v15.e("byteValue")), new qg5(new bf7("java/lang/Number", id5.v, _UrlKt.FRAGMENT_ENCODE_SET, ut3.SHORT.Z), v15.e("shortValue")), new qg5(new bf7("java/lang/Number", id5.u, _UrlKt.FRAGMENT_ENCODE_SET, str4), v15.e("intValue")), new qg5(new bf7("java/lang/Number", id5.t, _UrlKt.FRAGMENT_ENCODE_SET, ut3.LONG.Z), v15.e("longValue")), new qg5(new bf7("java/lang/Number", id5.s, _UrlKt.FRAGMENT_ENCODE_SET, ut3.FLOAT.Z), v15.e("floatValue")), new qg5(new bf7("java/lang/Number", id5.r, _UrlKt.FRAGMENT_ENCODE_SET, ut3.DOUBLE.Z), v15.e("doubleValue")), new qg5(bf7VarV4, v15.e("remove")), new qg5(g55.v("java/lang/CharSequence", "get", str4, ut3.CHAR.Z), v15.e("charAt")), new qg5(g55.v("java/util/concurrent/atomic/AtomicInteger", "load", _UrlKt.FRAGMENT_ENCODE_SET, "I"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicInteger", "store", "I", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicInteger", "exchange", "I", "I"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicInteger", "fetchAndAdd", "I", "I"), v15.e("getAndAdd")), new qg5(g55.v("java/util/concurrent/atomic/AtomicInteger", "addAndFetch", "I", "I"), v15.e("addAndGet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLong", "load", _UrlKt.FRAGMENT_ENCODE_SET, "J"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLong", "store", "J", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLong", "exchange", "J", "J"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLong", "fetchAndAdd", "J", "J"), v15.e("getAndAdd")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLong", "addAndFetch", "J", "J"), v15.e("addAndGet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicBoolean", "load", _UrlKt.FRAGMENT_ENCODE_SET, "Z"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicBoolean", "store", "Z", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicBoolean", "exchange", "Z", "Z"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReference", "load", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/Object;"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReference", "store", "Ljava/lang/Object;", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReference", "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "loadAt", "I", "I"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "storeAt", "II", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "exchangeAt", "II", "I"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "compareAndSetAt", "III", "Z"), v15.e("compareAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "fetchAndAddAt", "II", "I"), v15.e("getAndAdd")), new qg5(g55.v("java/util/concurrent/atomic/AtomicIntegerArray", "addAndFetchAt", "II", "I"), v15.e("addAndGet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "loadAt", "I", "J"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "storeAt", "IJ", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "exchangeAt", "IJ", "J"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "compareAndSetAt", "IJJ", "Z"), v15.e("compareAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "fetchAndAddAt", "IJ", "J"), v15.e("getAndAdd")), new qg5(g55.v("java/util/concurrent/atomic/AtomicLongArray", "addAndFetchAt", "IJ", "J"), v15.e("addAndGet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReferenceArray", "loadAt", "I", "Ljava/lang/Object;"), v15.e("get")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReferenceArray", "storeAt", "ILjava/lang/Object;", "V"), v15.e("set")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReferenceArray", "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), v15.e("getAndSet")), new qg5(g55.v("java/util/concurrent/atomic/AtomicReferenceArray", "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), v15.e("compareAndSet")));
        h = mapJ2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(mapJ2.size()));
        for (Map.Entry entry2 : mapJ2.entrySet()) {
            linkedHashMap2.put(((bf7) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            bf7 bf7Var = (bf7) entry3.getKey();
            v15 v15Var = (v15) entry3.getValue();
            String str5 = bf7Var.a;
            String str6 = bf7Var.c;
            String str7 = bf7Var.d;
            v15Var.getClass();
            linkedHashSet.add(str5 + '.' + (v15Var + '(' + str6 + ')' + str7));
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((bf7) it6.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<qg5> arrayList7 = new ArrayList(xv0.Z(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new qg5(((bf7) entry4.getKey()).b, entry4.getValue()));
        }
        int iG = aq4.G(xv0.Z(arrayList7, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iG);
        for (qg5 qg5Var9 : arrayList7) {
            linkedHashMap3.put((v15) qg5Var9.Y, (v15) qg5Var9.X);
        }
        k = linkedHashMap3;
    }
}
