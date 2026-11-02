package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl4 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl4(bo5 bo5Var, q51 q51Var) {
        super(3, q51Var);
        this.g0 = (byte) 1;
        this.i0 = bo5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        switch (this.g0) {
            case 0:
                List list = (List) this.h0;
                a45 a45Var = (a45) this.i0;
                w39.n0(obj);
                return new qg5(list, a45Var);
            case 1:
                w39.n0(obj);
                Throwable th = (Throwable) this.h0;
                bo5 bo5Var = (bo5) this.i0;
                if (bo5Var.j0.get()) {
                    bo5Var.d(null, th);
                } else {
                    new Integer(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return dn8.a;
            default:
                w39.n0(obj);
                e87 e87Var = (e87) this.h0;
                o05 o05Var = (o05) this.i0;
                Set setKeySet = o05Var.a().keySet();
                ArrayList arrayList = new ArrayList(xv0.Z(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((js5) it.next()).a);
                }
                Map<String, ?> all = e87Var.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = wv0.c1((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        o05 o05Var2 = new o05(new LinkedHashMap(o05Var.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                str.getClass();
                                o05Var2.f(new js5(str), value2);
                            } else if (value2 instanceof Float) {
                                str.getClass();
                                o05Var2.f(new js5(str), value2);
                            } else if (value2 instanceof Integer) {
                                str.getClass();
                                o05Var2.f(new js5(str), value2);
                            } else if (value2 instanceof Long) {
                                str.getClass();
                                o05Var2.f(new js5(str), value2);
                            } else if (value2 instanceof String) {
                                str.getClass();
                                o05Var2.f(new js5(str), value2);
                            } else if (value2 instanceof Set) {
                                str.getClass();
                                o05Var2.f(new js5(str), (Set) value2);
                            }
                        }
                        return new o05(new LinkedHashMap(o05Var2.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = e87Var.b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                break;
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        int i = 3;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                dl4 dl4Var = new dl4(i, (q51) obj3, (byte) 0);
                dl4Var.h0 = (List) obj;
                dl4Var.i0 = (a45) obj2;
                return dl4Var.q(dn8Var);
            case 1:
                dl4 dl4Var2 = new dl4((bo5) this.i0, (q51) obj3);
                dl4Var2.h0 = (Throwable) obj2;
                dl4Var2.q(dn8Var);
                return dn8Var;
            default:
                dl4 dl4Var3 = new dl4(i, (q51) obj3, (byte) 2);
                dl4Var3.h0 = (e87) obj;
                dl4Var3.i0 = (o05) obj2;
                return dl4Var3.q(dn8Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl4(int i, q51 q51Var, byte b) {
        super(i, q51Var);
        this.g0 = b;
    }
}
