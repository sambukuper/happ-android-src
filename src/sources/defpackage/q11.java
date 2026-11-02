package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 implements ds5 {
    public final ArrayList a;

    public q11(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ds5
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ds5) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
