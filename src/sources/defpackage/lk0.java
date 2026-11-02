package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 {
    public static final lk0 b;
    public static final lk0 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new i84(0));
        b = new lk0(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new i84(1));
        c = new lk0(linkedHashSet2);
    }

    public lk0(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (i84 i84Var : this.a) {
            List<xi0> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            i84Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (xi0 xi0Var : listUnmodifiableList) {
                mb6.o(xi0Var instanceof aj0, "The camera info doesn't contain internal implementation.");
                if (xi0Var.j() == i84Var.a) {
                    arrayList3.add(xi0Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (i84 i84Var : this.a) {
            if (i84Var instanceof i84) {
                Integer numValueOf = Integer.valueOf(i84Var.a ? 1 : 0);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    bt.i("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final cj0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((cj0) it.next()).c());
        }
        ArrayList arrayListA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            cj0 cj0Var = (cj0) it2.next();
            if (arrayListA.contains(cj0Var.c())) {
                linkedHashSet2.add(cj0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (cj0) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            aj0 aj0VarS = ((cj0) it4.next()).s();
            sb.append(" Id:" + aj0VarS.e() + "  Lens:" + aj0VarS.j());
        }
        String string = sb.toString();
        LinkedHashSet<i84> linkedHashSet3 = this.a;
        StringBuilder sb2 = new StringBuilder(pc6.j(linkedHashSet3.size(), "PhyId:null  Filters:"));
        for (i84 i84Var : linkedHashSet3) {
            sb2.append(" Id:");
            i84Var.getClass();
            sb2.append(i84.b);
            if (i84Var instanceof i84) {
                sb2.append(" LensFilter:");
                sb2.append(i84Var.a ? 1 : 0);
            }
        }
        bt.q(oi0.m("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }
}
