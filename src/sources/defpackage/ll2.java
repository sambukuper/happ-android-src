package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ll2 implements jl2 {
    public final /* synthetic */ ml2 a;

    public ll2(ml2 ml2Var) {
        this.a = ml2Var;
    }

    @Override // defpackage.jl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zU;
        ml2 ml2Var = this.a;
        ArrayList arrayList3 = ml2Var.n;
        if (ml2.K(2)) {
            Objects.toString(ml2Var.a);
        }
        if (ml2Var.d.isEmpty()) {
            zU = false;
        } else {
            r00 r00Var = (r00) oi0.h(1, ml2Var.d);
            ml2Var.h = r00Var;
            Iterator it = r00Var.a.iterator();
            while (it.hasNext()) {
                qk2 qk2Var = ((cm2) it.next()).b;
                if (qk2Var != null) {
                    qk2Var.o0 = true;
                }
            }
            zU = ml2Var.U(-1, 0, arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(ml2.G((r00) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    c2.m();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
