package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz3 implements dz3 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d;

    public jz3() {
        bv4.a.getClass();
        List listA = av4.a();
        ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            arrayList.add(new rt3());
        }
        this.d = arrayList;
    }

    @Override // defpackage.dz3
    public final ArrayList a() {
        return this.b;
    }

    @Override // defpackage.dz3
    public final List b() {
        return this.a;
    }

    @Override // defpackage.dz3
    public final ArrayList c() {
        return this.c;
    }
}
