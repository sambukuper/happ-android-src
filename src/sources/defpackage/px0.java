package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class px0 {
    public static final LinkedHashSet a;

    static {
        Set<du5> set = du5.g0;
        v15 v15Var = ug7.a;
        ArrayList arrayList = new ArrayList(xv0.Z(set, 10));
        for (du5 du5Var : set) {
            du5Var.getClass();
            arrayList.add(ug7.k.a(du5Var.X));
        }
        ArrayList<fk2> arrayListI0 = wv0.I0(wv0.I0(wv0.I0(arrayList, tg7.f.i()), tg7.h.i()), tg7.j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fk2 fk2Var : arrayListI0) {
            fk2Var.getClass();
            linkedHashSet.add(new qs0(fk2Var.b(), fk2Var.a.g()));
        }
        a = linkedHashSet;
    }
}
