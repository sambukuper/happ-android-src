package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g37 implements e37, tc0 {
    public final String a;
    public final nr4 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final e37[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final e37[] j;
    public final vz7 k;

    public g37(String str, nr4 nr4Var, int i, List list, dt0 dt0Var) {
        this.a = str;
        this.b = nr4Var;
        this.c = i;
        ArrayList arrayList = dt0Var.b;
        HashSet hashSet = new HashSet(aq4.G(xv0.Z(arrayList, 12)));
        wv0.W0(arrayList, hashSet);
        this.d = hashSet;
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = wl7.u(dt0Var.d);
        this.g = (List[]) dt0Var.e.toArray(new List[0]);
        ArrayList arrayList2 = dt0Var.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        gu guVar = new gu(new o7((Object) strArr, (byte) 8), (byte) 1);
        ArrayList arrayList3 = new ArrayList(xv0.Z(guVar, 10));
        Iterator it2 = guVar.iterator();
        while (true) {
            rw1 rw1Var = (rw1) it2;
            if (!rw1Var.Y.hasNext()) {
                this.i = zp4.P(arrayList3);
                this.j = wl7.u(list);
                this.k = new vz7(new hr5(this, (byte) 18));
                return;
            }
            pb3 pb3Var = (pb3) rw1Var.next();
            arrayList3.add(new qg5(pb3Var.b, Integer.valueOf(pb3Var.a)));
        }
    }

    @Override // defpackage.e37
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tc0
    public final Set b() {
        return this.d;
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.e37
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g37) {
            e37 e37Var = (e37) obj;
            if (this.a.equals(e37Var.a()) && Arrays.equals(this.j, ((g37) obj).j)) {
                int iE = e37Var.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        e37[] e37VarArr = this.f;
                        if (dh3.f(e37VarArr[i2].a(), e37Var.h(i2).a()) && dh3.f(e37VarArr[i2].r(), e37Var.h(i2).r())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.e37
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.e37
    public final List g(int i) {
        return this.g[i];
    }

    @Override // defpackage.e37
    public final List getAnnotations() {
        return d02.X;
    }

    @Override // defpackage.e37
    public final e37 h(int i) {
        return this.f[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        return this.h[i];
    }

    @Override // defpackage.e37
    public final nr4 r() {
        return this.b;
    }

    public final String toString() {
        return dh3.U(this);
    }
}
