package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j54 extends v1 {
    public final z47 o0;
    public final hb6 p0;

    public j54(z47 z47Var, hb6 hb6Var, int i, ed1 ed1Var) {
        super(i, new n44(z47Var, hb6Var, false), ed1Var, (ve4) ((c6) z47Var.Y).f0, v15.e(hb6Var.a.getName()), rt8.INVARIANT, false);
        this.o0 = z47Var;
        this.p0 = hb6Var;
    }

    @Override // defpackage.k3
    public final List H0(List list) {
        j54 j54Var;
        z47 z47Var = this.o0;
        Object obj = z47Var.Y;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t14 t14Var = (t14) it.next();
            cd5 cd5Var = cd5.D0;
            t14Var.getClass();
            if (cj8.c(t14Var, cd5Var, null)) {
                j54Var = this;
            } else {
                j54Var = this;
                t14 t14Var2 = (t14) k32.e(t14Var.q0(), new g97(j54Var, false, z47Var, km.TYPE_PARAMETER_BOUNDS, false).m(t14Var, d02.X, null, false), 0, false).c;
                if (t14Var2 != null) {
                    t14Var = t14Var2;
                }
            }
            arrayList.add(t14Var);
            this = j54Var;
        }
        return arrayList;
    }

    @Override // defpackage.k3
    public final List I0() {
        Type[] bounds = this.p0.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new va6(type));
        }
        va6 va6Var = (va6) wv0.Q0(arrayList);
        Collection collection = arrayList;
        if (dh3.f(va6Var != null ? va6Var.a : null, Object.class)) {
            collection = d02.X;
        }
        boolean zIsEmpty = collection.isEmpty();
        z47 z47Var = this.o0;
        if (zIsEmpty) {
            return i21.K(dh3.s(((wx4) ((c6) z47Var.Y).n0).h0.e(), ((wx4) ((c6) z47Var.Y).n0).h0.p()));
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((f63) z47Var.g0).C((va6) it.next(), pu.U(zi8.Y, false, this, 3)));
        }
        return arrayList2;
    }
}
