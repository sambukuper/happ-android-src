package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h54 extends i54 {
    public static final /* synthetic */ int p = 0;
    public final ta6 n;
    public final p44 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h54(z47 z47Var, ta6 ta6Var, p44 p44Var) {
        super(z47Var, null);
        ta6Var.getClass();
        this.n = ta6Var;
        this.o = p44Var;
    }

    public static fx5 v(fx5 fx5Var) {
        if (fx5Var.r() != 2) {
            return fx5Var;
        }
        Collection collectionQ = fx5Var.q();
        collectionQ.getClass();
        Collection<fx5> collection = collectionQ;
        ArrayList arrayList = new ArrayList(xv0.Z(collection, 10));
        for (fx5 fx5Var2 : collection) {
            fx5Var2.getClass();
            arrayList.add(v(fx5Var2));
        }
        return (fx5) wv0.O0(wv0.Y0(wv0.b1(arrayList)));
    }

    @Override // defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return null;
    }

    @Override // defpackage.f54
    public final Set i(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        Set setB1 = wv0.b1(((ld1) this.e.invoke()).a());
        p44 p44Var = this.o;
        h54 h54VarC = xt7.c(p44Var);
        Set setC = h54VarC != null ? h54VarC.c() : null;
        if (setC == null) {
            setC = m02.X;
        }
        setB1.addAll(setC);
        if (this.n.a.isEnum()) {
            setB1.addAll(i21.L(ug7.c, ug7.a));
        }
        z47 z47Var = this.b;
        p44Var.getClass();
        z47Var.getClass();
        setB1.addAll(new ArrayList());
        return setB1;
    }

    @Override // defpackage.f54
    public final void j(v15 v15Var, ArrayList arrayList) {
        z47 z47Var = this.b;
        this.o.getClass();
        z47Var.getClass();
    }

    @Override // defpackage.f54
    public final ld1 k() {
        return new js0(this.n, cl1.C0);
    }

    @Override // defpackage.f54
    public final void m(LinkedHashSet linkedHashSet, v15 v15Var) {
        p44 p44Var = this.o;
        h54 h54VarC = xt7.c(p44Var);
        linkedHashSet.addAll(ch3.R(v15Var, h54VarC == null ? m02.X : wv0.c1(h54VarC.b(v15Var, x45.g0)), linkedHashSet, p44Var, ((q45) ((p45) ((c6) this.b.Y).Z)).d));
        if (this.n.a.isEnum()) {
            if (v15Var.equals(ug7.c)) {
                linkedHashSet.add(z91.v(p44Var));
            } else if (v15Var.equals(ug7.a)) {
                linkedHashSet.add(z91.w(p44Var));
            }
        }
    }

    @Override // defpackage.f54
    public final void n(v15 v15Var, ArrayList arrayList) {
        gx5 gx5VarU;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f0 f0Var = new f0(v15Var, (byte) 21);
        p44 p44Var = this.o;
        jb5.p(i21.K(p44Var), oy1.H0, new g54(p44Var, linkedHashSet, f0Var));
        boolean zIsEmpty = arrayList.isEmpty();
        z47 z47Var = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                fx5 fx5VarV = v((fx5) obj);
                Object arrayList2 = linkedHashMap.get(fx5VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(fx5VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                bw0.d0(arrayList3, ch3.R(v15Var, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, p44Var, ((q45) ((p45) ((c6) z47Var.Y).Z)).d));
            }
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(ch3.R(v15Var, linkedHashSet, arrayList, p44Var, ((q45) ((p45) ((c6) z47Var.Y).Z)).d));
        }
        if (this.n.a.isEnum() && v15Var.equals(ug7.b) && (gx5VarU = z91.u(p44Var)) != null) {
            arrayList.add(gx5VarU);
        }
    }

    @Override // defpackage.f54
    public final Set o(pk1 pk1Var) {
        pk1Var.getClass();
        Set setB1 = wv0.b1(((ld1) this.e.invoke()).f());
        cl1 cl1Var = cl1.D0;
        p44 p44Var = this.o;
        jb5.p(i21.K(p44Var), oy1.H0, new g54(p44Var, setB1, cl1Var));
        if (this.n.a.isEnum()) {
            setB1.add(ug7.b);
        }
        return setB1;
    }

    @Override // defpackage.f54
    public final ed1 q() {
        return this.o;
    }
}
