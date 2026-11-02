package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class th5 {
    public final String a;
    public final g62 b;
    public final List c;
    public final List d;

    public th5(l39 l39Var) {
        this.a = l39Var.b;
        this.b = l39Var.c;
        this.c = l39Var.d;
        List list = l39Var.g;
        this.d = null;
        if (list != null) {
            this.d = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.d.add(new th5((l39) it.next()));
            }
        }
    }

    public static ArrayList a(x39 x39Var, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            th5 th5Var = (th5) it.next();
            arrayList.add(new l39(x39Var, th5Var.a, th5Var.b, th5Var.c, a(x39Var, th5Var.d)));
        }
        return arrayList;
    }

    public th5(String str, g62 g62Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = g62Var;
        this.c = arrayList;
        this.d = arrayList2;
    }
}
