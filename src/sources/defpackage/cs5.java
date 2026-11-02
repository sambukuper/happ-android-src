package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cs5 {
    public final rh8 a;
    public final List b;
    public final String c;
    public final cs5 d;

    public cs5(rh8 rh8Var, List list, String str) {
        list.getClass();
        this.a = rh8Var;
        this.b = list;
        this.c = str;
        cs5 cs5Var = null;
        if (str != null) {
            rh8 rh8VarA = rh8Var != null ? rh8Var.a() : null;
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rh8 rh8Var2 = (rh8) it.next();
                arrayList.add(rh8Var2 != null ? rh8Var2.a() : null);
            }
            cs5Var = new cs5(rh8VarA, arrayList, null);
        }
        this.d = cs5Var;
    }
}
