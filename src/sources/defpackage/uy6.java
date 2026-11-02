package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uy6 extends m2 {
    public final zu3 a;
    public final g44 b;
    public final Map c;
    public final LinkedHashMap d;

    public uy6(String str, zu3 zu3Var, zu3[] zu3VarArr, ow3[] ow3VarArr) {
        zu3Var.getClass();
        this.a = zu3Var;
        this.b = x97.P(w74.X, new a23((Object) str, (Object) this, (byte) 17));
        if (zu3VarArr.length != ow3VarArr.length) {
            u52.m("All subclasses of sealed class ", zu3Var.E(), " should be marked @Serializable");
            throw null;
        }
        Map mapP = zp4.P(eu.N0(zu3VarArr, ow3VarArr));
        this.c = mapP;
        Set<Map.Entry> setEntrySet = mapP.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((ow3) entry.getValue()).d().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strA);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (ow3) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.d = linkedHashMap2;
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return (e37) this.b.getValue();
    }

    @Override // defpackage.m2
    public final ow3 e(f01 f01Var, String str) {
        ow3 ow3Var = (ow3) this.d.get(str);
        if (ow3Var != null) {
            return ow3Var;
        }
        f01Var.o().getClass();
        this.a.getClass();
        ci8.B(1, null);
        return null;
    }

    @Override // defpackage.m2
    public final ow3 f(ol7 ol7Var, Object obj) {
        ow3 ow3Var;
        obj.getClass();
        ow3 ow3Var2 = (ow3) this.c.get(yb6.a.b(obj.getClass()));
        if (ow3Var2 != null) {
            ow3Var = ow3Var2;
        } else {
            ol7Var.e.getClass();
            zu3 zu3Var = this.a;
            zu3Var.getClass();
            if (zu3Var.O(obj)) {
                ci8.B(1, null);
            }
            ow3Var = null;
        }
        if (ow3Var != null) {
            return ow3Var;
        }
        return null;
    }

    @Override // defpackage.m2
    public final zu3 g() {
        return this.a;
    }
}
