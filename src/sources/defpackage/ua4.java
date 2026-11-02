package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ua4 extends a1 {
    public final ta4 a;

    public ua4() {
        yl7 yl7Var = yl7.a;
        eo3 eo3Var = eo3.a;
        this.a = new ta4(yl7.b, eo3.b);
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        h(obj);
        ta4 ta4Var = this.a;
        ol7 ol7VarA = ol7Var.a(ta4Var);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ol7VarA.q(ta4Var, i, yl7.a, key);
            i += 2;
            ol7VarA.q(ta4Var, i2, eo3.a, value);
        }
        ol7VarA.v(ta4Var);
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return this.a;
    }

    @Override // defpackage.a1
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // defpackage.a1
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.a1
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.a1
    public final int h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        Map map = (Map) obj;
        eo3 eo3Var = eo3.a;
        map.getClass();
        yl7 yl7Var = yl7.a;
        ta4 ta4Var = this.a;
        Object objQ = f01Var.q(ta4Var, i, yl7Var, null);
        int iE = f01Var.e(ta4Var);
        if (iE == i + 1) {
            map.put(objQ, (!map.containsKey(objQ) || (eo3.b.b instanceof zt5)) ? f01Var.q(ta4Var, iE, eo3Var, null) : f01Var.q(ta4Var, iE, eo3Var, zp4.H(map, objQ)));
        } else {
            em7.c(pc6.m("Value must follow key in a map, index for key: ", i, iE, ", returned index for value: "));
        }
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        throw null;
    }

    @Override // defpackage.a1
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
