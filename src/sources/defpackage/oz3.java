package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oz3 {
    public int a;
    public final String b;
    public final int c;
    public final rz3 d;
    public final ArrayList e;
    public final ArrayList f;

    public oz3(int i, String str, int i2, rz3 rz3Var) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = rz3Var;
        this.e = new ArrayList(1);
        bv4.a.getClass();
        List listA = av4.a();
        ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            arrayList.add(new uu3());
        }
        this.f = arrayList;
    }
}
