package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i26 {
    public final ArrayList a;

    public i26(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static void d(i26 i26Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i26Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return;
        }
        while (true) {
            sb.append((CharSequence) it2.next());
            if (!it2.hasNext()) {
                return;
            } else {
                sb.append((CharSequence) " | ");
            }
        }
    }

    public final boolean a(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((f26) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final f26 b(Class cls) {
        for (f26 f26Var : this.a) {
            if (f26Var.getClass() == cls) {
                return f26Var;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (f26 f26Var : this.a) {
            if (cls.isAssignableFrom(f26Var.getClass())) {
                arrayList.add(f26Var);
            }
        }
        return arrayList;
    }
}
