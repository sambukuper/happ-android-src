package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends gm1 {
    public final tf5 g;
    public final zy5 h;
    public final String i;
    public final fk2 j;

    public hm1(tf5 tf5Var, zy5 zy5Var, w15 w15Var, s50 s50Var, st3 st3Var, hl1 hl1Var, String str, dn2 dn2Var) {
        zy5Var.getClass();
        w15Var.getClass();
        s50Var.getClass();
        hl1Var.getClass();
        tz5 tz5Var = zy5Var.i0;
        tz5Var.getClass();
        ux4 ux4Var = new ux4(tz5Var);
        dv8 dv8Var = dv8.b;
        a06 a06Var = zy5Var.j0;
        a06Var.getClass();
        jl1 jl1Var = new jl1(hl1Var, w15Var, (ed1) tf5Var, ux4Var, z38.b(a06Var), s50Var, (xl1) st3Var, (fc8) null, (List) d02.X);
        List list = zy5Var.f0;
        list.getClass();
        List list2 = zy5Var.g0;
        list2.getClass();
        List list3 = zy5Var.h0;
        list3.getClass();
        super(jl1Var, list, list2, list3, dn2Var);
        this.g = tf5Var;
        this.h = zy5Var;
        this.i = str;
        this.j = ((uf5) tf5Var).i0;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        List listI = i(pk1Var, gn2Var);
        Iterable iterable = ((hl1) this.b.X).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList, ((ls0) it.next()).b(this.j));
        }
        return wv0.H0(listI, arrayList);
    }

    @Override // defpackage.gm1, defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        ((hl1) this.b.X).i.getClass();
        x45Var.getClass();
        tf5 tf5Var = this.g;
        tf5Var.getClass();
        v15Var.getClass();
        String str = ((uf5) tf5Var).i0.a.a;
        v15Var.b().getClass();
        str.getClass();
        return super.e(v15Var, x45Var);
    }

    @Override // defpackage.gm1
    public final qs0 l(v15 v15Var) {
        v15Var.getClass();
        return new qs0(this.j, v15Var);
    }

    @Override // defpackage.gm1
    public final Set n() {
        return m02.X;
    }

    @Override // defpackage.gm1
    public final Set o() {
        return m02.X;
    }

    @Override // defpackage.gm1
    public final Set p() {
        return m02.X;
    }

    @Override // defpackage.gm1
    public final boolean q(v15 v15Var) {
        v15Var.getClass();
        if (m().contains(v15Var)) {
            return true;
        }
        Iterable iterable = ((hl1) this.b.X).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((ls0) it.next()).c(this.j, v15Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }

    @Override // defpackage.gm1
    public final void h(ArrayList arrayList, gn2 gn2Var) {
    }
}
