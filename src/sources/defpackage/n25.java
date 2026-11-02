package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n25 {
    public final oh7 a = ph7.a(o25.i0);
    public final oh7 b;
    public final h76 c;
    public final kt d;
    public final kt e;
    public k25 f;
    public int g;
    public m25 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public n25() {
        oh7 oh7VarA = ph7.a(new l25());
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
        this.d = new kt();
        this.e = new kt();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(z47 z47Var, m25 m25Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        z47Var.getClass();
        if (m25Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(m25Var);
            z47 z47Var2 = m25Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(z47Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(m25Var);
        m25Var.a = z47Var;
        ((l25) this.c.X.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        m25Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        l25 l25Var;
        kt ktVar = this.d;
        if (!ktVar.isEmpty()) {
            Iterator it = ktVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((k25) it.next()).b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        kt ktVar2 = this.e;
        if (!ktVar2.isEmpty()) {
            Iterator it2 = ktVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((k25) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((m25) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((m25) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((m25) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        k25 k25VarC = this.f;
        if (k25VarC == null) {
            k25VarC = c(0);
        }
        k25 k25VarC2 = this.f;
        if (k25VarC2 == null) {
            k25VarC2 = c(0);
        }
        if (dh3.f(k25VarC2, k25VarC)) {
            if (k25VarC2 == null) {
                l25Var = new l25();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = ktVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((k25) it6.next()).b;
                }
                Iterator<E> it7 = ktVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((k25) it7.next()).b;
                }
                ys0 ys0Var = k25VarC2.a;
                gb4 gb4VarR = i21.r();
                bw0.d0(gb4VarR, arrayList);
                gb4VarR.add(ys0Var);
                bw0.d0(gb4VarR, d02.X);
                l25Var = new l25(arrayList.size(), i21.j(gb4VarR));
            }
            oh7 oh7Var = this.b;
            if (dh3.f((l25) oh7Var.getValue(), l25Var)) {
                return;
            }
            oh7Var.n(null, l25Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((m25) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((m25) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((m25) it10.next()).getClass();
            }
        }
    }

    public final k25 c(int i) {
        Object next;
        Object next2;
        kt ktVar = this.e;
        kt ktVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = ktVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((k25) next).b);
            k25 k25Var = (k25) next;
            if (k25Var != null) {
                return k25Var;
            }
            for (Object obj2 : ktVar) {
                if (((k25) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (k25) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = ktVar2.iterator();
            while (it2.hasNext()) {
                ((k25) it2.next()).getClass();
            }
            Iterator it3 = ktVar.iterator();
            while (it3.hasNext()) {
                ((k25) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = ktVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((k25) next2).b);
        k25 k25Var2 = (k25) next2;
        if (k25Var2 != null) {
            return k25Var2;
        }
        for (Object obj3 : ktVar) {
            if (((k25) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (k25) obj;
    }
}
