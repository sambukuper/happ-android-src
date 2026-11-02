package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 {
    public static final ra c = new ra(22, false);
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final pk1 m;
    public static final pk1 n;
    public static final pk1 o;
    public static final pk1 p;
    public static final pk1 q;
    public static final vz7 r;
    public static final vz7 s;
    public final List a;
    public final int b;

    static {
        int iK = ra.k();
        e = iK;
        int iK2 = ra.k();
        f = iK2;
        int iK3 = ra.k();
        g = iK3;
        int iK4 = ra.k();
        h = iK4;
        int iK5 = ra.k();
        i = iK5;
        int iK6 = ra.k();
        j = iK6;
        int iK7 = ra.k() - 1;
        k = iK7;
        int i2 = iK | iK2 | iK3;
        l = i2;
        m = new pk1(iK7);
        n = new pk1(iK5 | iK6);
        new pk1(iK);
        new pk1(iK2);
        new pk1(iK3);
        o = new pk1(i2);
        new pk1(iK4);
        p = new pk1(iK5);
        q = new pk1(iK6);
        new pk1(iK2 | iK5 | iK6);
        r = new vz7(tz.i0);
        s = new vz7(tz.j0);
    }

    public pk1(int i2, List list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((nk1) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pk1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pk1 pk1Var = (pk1) obj;
        return dh3.f(this.a, pk1Var.a) && this.b == pk1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = ((List) r.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ok1) next).a != this.b);
        ok1 ok1Var = (ok1) next;
        String strY0 = ok1Var != null ? ok1Var.b : null;
        if (strY0 == null) {
            List<ok1> list = (List) s.getValue();
            ArrayList arrayList = new ArrayList();
            for (ok1 ok1Var2 : list) {
                String str = a(ok1Var2.a) ? ok1Var2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strY0 = wv0.y0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbP = p61.p("DescriptorKindFilter(", strY0, ", ");
        sbP.append(this.a);
        sbP.append(')');
        return sbP.toString();
    }

    public /* synthetic */ pk1(int i2) {
        this(i2, d02.X);
    }
}
