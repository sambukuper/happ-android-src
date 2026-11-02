package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pw7 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final m32 a(v63 v63Var, Throwable th) {
        d53 d53Var;
        if (th instanceof b75) {
            gn2 gn2Var = v63Var.n;
            t63 t63Var = v63Var.t;
            d53Var = (d53) gn2Var.B(v63Var);
            if (d53Var == null) {
                d53Var = (d53) t63Var.j.B(v63Var);
            }
            if (d53Var == null && (d53Var = (d53) v63Var.m.B(v63Var)) == null) {
                d53Var = (d53) t63Var.i.B(v63Var);
            }
        } else {
            d53Var = (d53) v63Var.m.B(v63Var);
            if (d53Var == null) {
                d53Var = (d53) v63Var.t.i.B(v63Var);
            }
        }
        return new m32(d53Var, v63Var, th);
    }

    public static ow7 b() {
        return new ow7(null);
    }

    public static final f63 c(aa7 aa7Var, pt0 pt0Var, int i) {
        if (pt0Var == null || u32.f(pt0Var)) {
            return null;
        }
        int size = pt0Var.k0().size() + i;
        if (pt0Var.n()) {
            List listSubList = aa7Var.l0().subList(i, size);
            ed1 ed1VarP = pt0Var.p();
            return new f63(pt0Var, listSubList, c(aa7Var, ed1VarP instanceof pt0 ? (pt0) ed1VarP : null, size));
        }
        if (size != aa7Var.l0().size()) {
            bl1.m(pt0Var);
        }
        return new f63(pt0Var, aa7Var.l0().subList(i, aa7Var.l0().size()), (f63) null);
    }

    public static final List d(pt0 pt0Var) {
        List listG;
        Object next;
        lh8 lh8VarL;
        List listK0 = pt0Var.k0();
        listK0.getClass();
        if (!pt0Var.n() && !(pt0Var.p() instanceof jd0)) {
            return listK0;
        }
        int i = el1.a;
        cl1 cl1Var = cl1.Y;
        List listN0 = w27.n0(new sd2(new la2(new hu(w27.f0(w27.i0(pt0Var, cl1Var), 1), (byte) 7), true, ve7.i0), ve7.j0, a37.X));
        Iterator it = w27.f0(w27.i0(pt0Var, cl1Var), 1).iterator();
        do {
            listG = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof sx4));
        sx4 sx4Var = (sx4) next;
        if (sx4Var != null && (lh8VarL = sx4Var.l()) != null) {
            listG = lh8VarL.g();
        }
        if (listG == null) {
            listG = d02.X;
        }
        if (listN0.isEmpty() && listG.isEmpty()) {
            List listK1 = pt0Var.k0();
            listK1.getClass();
            return listK1;
        }
        ArrayList<hi8> arrayListH0 = wv0.H0(listN0, listG);
        ArrayList arrayList = new ArrayList(xv0.Z(arrayListH0, 10));
        for (hi8 hi8Var : arrayListH0) {
            hi8Var.getClass();
            arrayList.add(new go0(hi8Var, pt0Var, listK0.size()));
        }
        return wv0.H0(listK0, arrayList);
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    public static final void f(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
