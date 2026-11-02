package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 implements ls0 {
    public final ve4 a;
    public final vx4 b;

    public ha0(ve4 ve4Var, wx4 wx4Var) {
        wx4Var.getClass();
        this.a = ve4Var;
        this.b = wx4Var;
    }

    @Override // defpackage.ls0
    public final sx4 a(qs0 qs0Var) {
        fk2 fk2Var;
        to2 to2VarA;
        qs0Var.getClass();
        if (!qs0Var.c && !qs0Var.g()) {
            String str = qs0Var.b.a.a;
            if (fm7.d0(str, "Function", false) && (to2VarA = uo2.b.a((fk2Var = qs0Var.a), str)) != null) {
                so2 so2Var = to2VarA.a;
                int i = to2VarA.b;
                List list = (List) hi5.e0(this.b.b0(fk2Var).i0, n74.l0[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof oa0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (wv0.t0(arrayList2) == null) {
                    return new do2(this.a, (oa0) wv0.r0(arrayList), so2Var, i);
                }
                c2.m();
            }
        }
        return null;
    }

    @Override // defpackage.ls0
    public final Collection b(fk2 fk2Var) {
        fk2Var.getClass();
        return m02.X;
    }

    @Override // defpackage.ls0
    public final boolean c(fk2 fk2Var, v15 v15Var) {
        fk2Var.getClass();
        v15Var.getClass();
        String strB = v15Var.b();
        strB.getClass();
        return (mm7.Z(strB, false, "Function") || mm7.Z(strB, false, "KFunction") || mm7.Z(strB, false, "SuspendFunction") || mm7.Z(strB, false, "KSuspendFunction")) && uo2.b.a(fk2Var, strB) != null;
    }
}
