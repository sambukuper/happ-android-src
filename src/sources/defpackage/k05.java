package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k05 extends qd5 {
    public static k05 j() {
        return new k05(new TreeMap(qd5.Y));
    }

    public static k05 k(l11 l11Var) {
        TreeMap treeMap = new TreeMap(qd5.Y);
        for (zx zxVar : l11Var.b()) {
            Set<k11> setE = l11Var.e(zxVar);
            ArrayMap arrayMap = new ArrayMap();
            for (k11 k11Var : setE) {
                arrayMap.put(k11Var, l11Var.f(zxVar, k11Var));
            }
            treeMap.put(zxVar, arrayMap);
        }
        return new k05(treeMap);
    }

    public final void l(zx zxVar, k11 k11Var, Object obj) {
        k11 k11Var2;
        TreeMap treeMap = this.X;
        Map map = (Map) treeMap.get(zxVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(zxVar, arrayMap);
            arrayMap.put(k11Var, obj);
            return;
        }
        k11 k11Var3 = (k11) Collections.min(map.keySet());
        if (Objects.equals(map.get(k11Var3), obj) || k11Var3 != (k11Var2 = k11.Z) || k11Var != k11Var2) {
            map.put(k11Var, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(zxVar.a);
        sb.append(", existing value (");
        sb.append(k11Var3);
        Object obj2 = map.get(k11Var3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(k11Var);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void o(zx zxVar, Object obj) {
        l(zxVar, k11.f0, obj);
    }

    public final void w(zx zxVar) {
        this.X.remove(zxVar);
    }
}
