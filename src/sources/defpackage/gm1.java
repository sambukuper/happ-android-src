package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gm1 extends ft4 {
    public static final /* synthetic */ nw3[] f = {new lx5(gm1.class, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new lx5(gm1.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final jl1 b;
    public final fm1 c;
    public final te4 d;
    public final se4 e;

    public gm1(jl1 jl1Var, List list, List list2, List list3, dn2 dn2Var) {
        jl1Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.b = jl1Var;
        hl1 hl1Var = (hl1) jl1Var.X;
        hl1Var.c.getClass();
        this.c = new fm1(this, list, list2, list3);
        ve4 ve4Var = hl1Var.a;
        bm1 bm1Var = new bm1(dn2Var, (byte) 0);
        ve4Var.getClass();
        this.d = new te4(ve4Var, bm1Var);
        f3 f3Var = new f3(this, (byte) 18);
        ve4Var.getClass();
        this.e = new se4(ve4Var, f3Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        fm1 fm1Var = this.c;
        fm1Var.getClass();
        return !((Set) hi5.e0(fm1Var.g, fm1.j[0])).contains(v15Var) ? d02.X : (Collection) fm1Var.d.B(v15Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set c() {
        return (Set) hi5.e0(this.c.g, fm1.j[0]);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set d() {
        nw3 nw3Var = f[1];
        se4 se4Var = this.e;
        se4Var.getClass();
        nw3Var.getClass();
        return (Set) se4Var.invoke();
    }

    @Override // defpackage.ft4, defpackage.et4
    public ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        if (!q(v15Var)) {
            fm1 fm1Var = this.c;
            if (!fm1Var.c.keySet().contains(v15Var)) {
                return null;
            }
            fm1Var.getClass();
            return (km1) fm1Var.f.B(v15Var);
        }
        hl1 hl1Var = (hl1) this.b.X;
        qs0 qs0VarL = l(v15Var);
        qs0VarL.getClass();
        os0 os0Var = hl1Var.t;
        Set set = os0.c;
        return os0Var.a(qs0VarL, null);
    }

    @Override // defpackage.ft4, defpackage.et4
    public Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        fm1 fm1Var = this.c;
        fm1Var.getClass();
        return !((Set) hi5.e0(fm1Var.h, fm1.j[1])).contains(v15Var) ? d02.X : (Collection) fm1Var.e.B(v15Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set g() {
        return (Set) hi5.e0(this.c.h, fm1.j[1]);
    }

    public final List i(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (pk1Var.a(pk1.f)) {
            h(arrayList, gn2Var);
        }
        fm1 fm1Var = this.c;
        fm1Var.getClass();
        te4 te4Var = fm1Var.g;
        te4 te4Var2 = fm1Var.h;
        l71 l71Var = l71.g0;
        boolean zA = pk1Var.a(pk1.j);
        d02 d02Var = d02.X;
        if (zA) {
            Set<v15> set = (Set) hi5.e0(te4Var2, fm1.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (v15 v15Var : set) {
                if (((Boolean) gn2Var.B(v15Var)).booleanValue()) {
                    v15Var.getClass();
                    arrayList2.addAll(!((Set) hi5.e0(te4Var2, fm1.j[1])).contains(v15Var) ? d02Var : (Collection) fm1Var.e.B(v15Var));
                }
            }
            aw0.c0(arrayList2, l71Var);
            arrayList.addAll(arrayList2);
        }
        if (pk1Var.a(pk1.i)) {
            Set<v15> set2 = (Set) hi5.e0(te4Var, fm1.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (v15 v15Var2 : set2) {
                if (((Boolean) gn2Var.B(v15Var2)).booleanValue()) {
                    v15Var2.getClass();
                    arrayList3.addAll(!((Set) hi5.e0(te4Var, fm1.j[0])).contains(v15Var2) ? d02Var : (Collection) fm1Var.d.B(v15Var2));
                }
            }
            aw0.c0(arrayList3, l71Var);
            arrayList.addAll(arrayList3);
        }
        if (pk1Var.a(pk1.l)) {
            for (v15 v15Var3 : m()) {
                if (((Boolean) gn2Var.B(v15Var3)).booleanValue()) {
                    hl1 hl1Var = (hl1) this.b.X;
                    qs0 qs0VarL = l(v15Var3);
                    qs0VarL.getClass();
                    os0 os0Var = hl1Var.t;
                    Set set3 = os0.c;
                    sx4 sx4VarA = os0Var.a(qs0VarL, null);
                    if (sx4VarA != null) {
                        arrayList.add(sx4VarA);
                    }
                }
            }
        }
        if (pk1Var.a(pk1.g)) {
            for (v15 v15Var4 : fm1Var.c.keySet()) {
                if (((Boolean) gn2Var.B(v15Var4)).booleanValue()) {
                    fm1Var.getClass();
                    v15Var4.getClass();
                    km1 km1Var = (km1) fm1Var.f.B(v15Var4);
                    if (km1Var != null) {
                        arrayList.add(km1Var);
                    }
                }
            }
        }
        return ys0.m(arrayList);
    }

    public qs0 l(v15 v15Var) {
        v15Var.getClass();
        int i = h7.a;
        throw new IllegalStateException("should not be called");
    }

    public final Set m() {
        return (Set) hi5.e0(this.d, f[0]);
    }

    public Set n() {
        return m02.X;
    }

    public Set o() {
        return m02.X;
    }

    public Set p() {
        return m02.X;
    }

    public boolean q(v15 v15Var) {
        v15Var.getClass();
        return m().contains(v15Var);
    }

    public boolean r(jm1 jm1Var) {
        return true;
    }

    public void h(ArrayList arrayList, gn2 gn2Var) {
    }

    public void j(v15 v15Var, ArrayList arrayList) {
    }

    public void k(v15 v15Var, ArrayList arrayList) {
    }
}
