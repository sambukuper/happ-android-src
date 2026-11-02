package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ax6 {
    public static final /* synthetic */ int a = 0;

    static {
        lh4.a1("Schedulers");
    }

    public static void a(n49 n49Var, f08 f08Var, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n49Var.e(jCurrentTimeMillis, ((l49) it.next()).a);
            }
        }
    }

    public static void b(xy0 xy0Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n49 n49VarX = workDatabase.x();
        new ArrayList();
        workDatabase.b();
        try {
            ql6 ql6Var = n49VarX.a;
            ql6 ql6Var2 = n49VarX.a;
            List list2 = (List) u15.G(ql6Var, true, false, new ut8((byte) 18));
            a(n49VarX, (f08) xy0Var.g0, list2);
            List list3 = (List) u15.G(ql6Var2, true, false, new ut8((byte) 22));
            List list4 = (List) u15.G(ql6Var2, true, false, new ut8((byte) 24));
            a(n49VarX, (f08) xy0Var.g0, list4);
            list4.addAll(list2);
            workDatabase.p();
            workDatabase.l();
            c(list4, list, true);
            c(list3, list, false);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }

    public static void c(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        l49[] l49VarArr = (l49[]) list.toArray(new l49[list.size()]);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            xw6 xw6Var = (xw6) it.next();
            if (xw6Var.c() == z) {
                xw6Var.e(l49VarArr);
            }
        }
    }
}
