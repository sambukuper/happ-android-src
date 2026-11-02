package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends gm1 {
    public final z14 g;
    public final te4 h;
    public final te4 i;
    public final /* synthetic */ vl1 j;

    public sl1(vl1 vl1Var, z14 z14Var) {
        this.j = vl1Var;
        jl1 jl1Var = vl1Var.n0;
        fy5 fy5Var = vl1Var.g0;
        List list = fy5Var.s0;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!md2.A.e(((vy5) obj).f0).booleanValue()) {
                arrayList.add(obj);
            }
        }
        List list2 = fy5Var.t0;
        list2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!md2.L.e(((cz5) obj2).f0).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        List list3 = fy5Var.u0;
        list3.getClass();
        List list4 = fy5Var.m0;
        list4.getClass();
        w15 w15Var = (w15) vl1Var.n0.Y;
        ArrayList arrayList3 = new ArrayList(xv0.Z(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList3.add(u70.S(w15Var, ((Number) it.next()).intValue()));
        }
        super(jl1Var, arrayList, arrayList2, list3, new pl1(arrayList3, (byte) 0));
        hl1 hl1Var = (hl1) jl1Var.X;
        this.g = z14Var;
        ve4 ve4Var = hl1Var.a;
        ql1 ql1Var = new ql1(this, (byte) 0);
        ve4Var.getClass();
        this.h = new te4(ve4Var, ql1Var);
        ve4 ve4Var2 = hl1Var.a;
        ql1 ql1Var2 = new ql1(this, (byte) 1);
        ve4Var2.getClass();
        this.i = new te4(ve4Var2, ql1Var2);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return (Collection) this.h.invoke();
    }

    @Override // defpackage.gm1, defpackage.ft4, defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        s(v15Var, x45Var);
        return super.b(v15Var, x45Var);
    }

    @Override // defpackage.gm1, defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        sx4 sx4Var;
        v15Var.getClass();
        x45Var.getClass();
        s(v15Var, x45Var);
        z47 z47Var = this.j.r0;
        return (z47Var == null || (sx4Var = (sx4) ((vt1) z47Var.Z).B(v15Var)) == null) ? super.e(v15Var, x45Var) : sx4Var;
    }

    @Override // defpackage.gm1, defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        s(v15Var, x45Var);
        return super.f(v15Var, x45Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d02] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // defpackage.gm1
    public final void h(ArrayList arrayList, gn2 gn2Var) {
        ?? arrayList2;
        z47 z47Var = this.j.r0;
        if (z47Var != null) {
            Set<v15> setKeySet = ((LinkedHashMap) z47Var.Y).keySet();
            arrayList2 = new ArrayList();
            for (v15 v15Var : setKeySet) {
                v15Var.getClass();
                sx4 sx4Var = (sx4) ((vt1) z47Var.Z).B(v15Var);
                if (sx4Var != null) {
                    arrayList2.add(sx4Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = d02.X;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.gm1
    public final void j(v15 v15Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((t14) it.next()).K().b(v15Var, x45.Z));
        }
        jl1 jl1Var = this.b;
        arrayList.addAll(((hl1) jl1Var.X).n.l(v15Var, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((q45) ((hl1) jl1Var.X).q).d.h(v15Var, arrayList2, arrayList3, this.j, new rl1(arrayList, (byte) 0));
    }

    @Override // defpackage.gm1
    public final void k(v15 v15Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((t14) it.next()).K().f(v15Var, x45.Z));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((q45) ((hl1) this.b.X).q).d.h(v15Var, arrayList2, arrayList3, this.j, new rl1(arrayList, (byte) 0));
    }

    @Override // defpackage.gm1
    public final qs0 l(v15 v15Var) {
        v15Var.getClass();
        return this.j.j0.d(v15Var);
    }

    @Override // defpackage.gm1
    public final Set n() {
        List listC = this.j.p0.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            Set setD = ((t14) it.next()).K().d();
            if (setD == null) {
                return null;
            }
            bw0.d0(linkedHashSet, setD);
        }
        return linkedHashSet;
    }

    @Override // defpackage.gm1
    public final Set o() {
        vl1 vl1Var = this.j;
        List listC = vl1Var.p0.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            bw0.d0(linkedHashSet, ((t14) it.next()).K().c());
        }
        linkedHashSet.addAll(((hl1) this.b.X).n.f(vl1Var));
        return linkedHashSet;
    }

    @Override // defpackage.gm1
    public final Set p() {
        List listC = this.j.p0.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            bw0.d0(linkedHashSet, ((t14) it.next()).K().g());
        }
        return linkedHashSet;
    }

    @Override // defpackage.gm1
    public final boolean r(jm1 jm1Var) {
        return ((hl1) this.b.X).o.K(this.j, jm1Var);
    }

    public final void s(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        ((hl1) this.b.X).i.getClass();
        this.j.getClass();
    }
}
