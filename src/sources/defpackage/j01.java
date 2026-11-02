package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j01 implements wf5 {
    public final List a;
    public final String b;

    public j01(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        wv0.c1(list).size();
    }

    @Override // defpackage.wf5
    public final boolean a(fk2 fk2Var) {
        fk2Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!vj8.S((wf5) it.next(), fk2Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wf5
    public final void b(fk2 fk2Var, ArrayList arrayList) {
        fk2Var.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vj8.u((wf5) it.next(), fk2Var, arrayList);
        }
    }

    @Override // defpackage.wf5
    public final Collection t(fk2 fk2Var, gn2 gn2Var) {
        fk2Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((wf5) it.next()).t(fk2Var, gn2Var));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
