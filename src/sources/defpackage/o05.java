package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o05 {
    public final LinkedHashMap a;
    public final wl6 b;

    public o05(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new wl6(z);
    }

    public final Map a() {
        qg5 qg5Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iG = aq4.G(xv0.Z(setEntrySet, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                qg5Var = new qg5(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                qg5Var = new qg5(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(qg5Var.X, qg5Var.Y);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.Y).get()) {
            bt.i("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(js5 js5Var) {
        js5Var.getClass();
        Object obj = this.a.get(js5Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(js5 js5Var) {
        js5Var.getClass();
        b();
        this.a.remove(js5Var);
    }

    public final void e(js5 js5Var, Object obj) {
        js5Var.getClass();
        f(js5Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zF;
        if (obj instanceof o05) {
            LinkedHashMap linkedHashMap = ((o05) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zF = dh3.f(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zF = true;
                                } else {
                                    zF = false;
                                }
                            } else {
                                zF = false;
                            }
                            if (!zF) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(js5 js5Var, Object obj) {
        js5Var.getClass();
        b();
        if (obj == null) {
            d(js5Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(wv0.c1((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(js5Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(js5Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(js5Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return wv0.y0(this.a.entrySet(), ",\n", "{\n", "\n}", new dx4((byte) 2), 24);
    }

    public /* synthetic */ o05(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
