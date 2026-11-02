package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public jt0(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            n84 n84Var = (n84) entry.getValue();
            List arrayList = (List) this.a.get(n84Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(n84Var, arrayList);
            }
            arrayList.add((kt0) entry.getKey());
        }
    }

    public static void a(List list, d94 d94Var, n84 n84Var, c94 c94Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                kt0 kt0Var = (kt0) list.get(size);
                Method method = kt0Var.b;
                try {
                    int i = kt0Var.a;
                    if (i == 0) {
                        method.invoke(c94Var, null);
                    } else if (i == 1) {
                        method.invoke(c94Var, d94Var);
                    } else if (i == 2) {
                        method.invoke(c94Var, d94Var, n84Var);
                    }
                } catch (IllegalAccessException e) {
                    u52.q(e);
                    return;
                } catch (InvocationTargetException e2) {
                    xw3.o("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
