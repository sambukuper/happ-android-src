package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yy3 implements dz3 {
    public int a;
    public String b;
    public String m;
    public mz3 n;
    public final ArrayList s;
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(1);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList(0);
    public final ArrayList h = new ArrayList(1);
    public final ArrayList i = new ArrayList(0);
    public final ArrayList j = new ArrayList(0);
    public final ArrayList k = new ArrayList(0);
    public final ArrayList l = new ArrayList(0);
    public final ArrayList o = new ArrayList(0);
    public final ArrayList p = new ArrayList(0);
    public final ArrayList q = new ArrayList(0);
    public final LinkedHashMap r = new LinkedHashMap(0);

    public yy3() {
        bv4.a.getClass();
        List listA = av4.a();
        ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            arrayList.add(new ys3());
        }
        this.s = arrayList;
    }

    @Override // defpackage.dz3
    public final ArrayList a() {
        return this.f;
    }

    @Override // defpackage.dz3
    public final List b() {
        return this.e;
    }

    @Override // defpackage.dz3
    public final ArrayList c() {
        return this.g;
    }
}
