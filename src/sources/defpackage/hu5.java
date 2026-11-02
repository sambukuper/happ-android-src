package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu5 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(fu5.X, 0);
        map.put(fu5.Y, 1);
        map.put(fu5.Z, 2);
        for (fu5 fu5Var : map.keySet()) {
            a.append(((Integer) b.get(fu5Var)).intValue(), fu5Var);
        }
    }

    public static int a(fu5 fu5Var) {
        Integer num = (Integer) b.get(fu5Var);
        if (num != null) {
            return num.intValue();
        }
        u52.r(fu5Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static fu5 b(int i) {
        fu5 fu5Var = (fu5) a.get(i);
        if (fu5Var != null) {
            return fu5Var;
        }
        bt.q(pc6.j(i, "Unknown Priority for value "));
        return null;
    }
}
