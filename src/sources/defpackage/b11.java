package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class b11 implements qj2 {
    public final ArrayList a;

    public b11(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.qj2
    public rj2 a() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s55) it.next()).a());
        }
        return arrayList2.size() == 1 ? (rj2) wv0.O0(arrayList2) : new c11(arrayList2, (byte) 0);
    }

    @Override // defpackage.qj2
    public li5 b() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s55) it.next()).b());
        }
        return pu.l(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b11) {
            return this.a.equals(((b11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oi0.o(new StringBuilder("ConcatenatedFormatStructure("), wv0.y0(this.a, ", ", null, null, null, 62), ')');
    }
}
