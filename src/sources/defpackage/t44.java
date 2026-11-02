package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t44 extends f54 {
    public static final /* synthetic */ int v = 0;
    public final sx4 n;
    public final ta6 o;
    public final boolean p;
    public final te4 q;
    public final te4 r;
    public final te4 s;
    public final te4 t;
    public final vt1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t44(z47 z47Var, sx4 sx4Var, ta6 ta6Var, boolean z, t44 t44Var) {
        super(z47Var, t44Var);
        z47Var.getClass();
        ta6Var.getClass();
        this.n = sx4Var;
        this.o = ta6Var;
        this.p = z;
        ve4 ve4Var = (ve4) ((c6) z47Var.Y).f0;
        this.q = new te4(ve4Var, new q44(this, z47Var));
        this.r = new te4(ve4Var, new r44(this, (byte) 0));
        this.s = new te4(ve4Var, new q44(z47Var, this));
        this.t = new te4(ve4Var, new r44(this, (byte) 1));
        this.u = ve4Var.c(new d3(this, z47Var, (byte) 10));
    }

    public static q97 A(q97 q97Var, ho2 ho2Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return q97Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            q97 q97Var2 = (q97) it.next();
            if (!q97Var.equals(q97Var2) && q97Var2.F0 == null && D(q97Var2, ho2Var)) {
                ho2 ho2VarBuild = q97Var.i0().v().build();
                ho2VarBuild.getClass();
                return (q97) ho2VarBuild;
            }
        }
        return q97Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static q97 B(q97 q97Var) {
        fk2 fk2VarI;
        List listL = q97Var.L();
        listL.getClass();
        ot8 ot8Var = (ot8) wv0.B0(listL);
        if (ot8Var != null) {
            ot0 ot0VarX = ot8Var.c().n0().x();
            if (ot0VarX != null) {
                int i = el1.a;
                gk2 gk2VarF = bl1.f(ot0VarX);
                gk2VarF.getClass();
                if (!gk2VarF.d()) {
                    gk2VarF = null;
                }
                if (gk2VarF != null) {
                    fk2VarI = gk2VarF.i();
                } else {
                    fk2VarI = null;
                }
            } else {
                fk2VarI = null;
            }
            if (!dh3.f(fk2VarI, ug7.g)) {
                ot8Var = null;
            }
            if (ot8Var != null) {
                go2 go2VarI0 = q97Var.i0();
                List listL2 = q97Var.L();
                listL2.getClass();
                q97 q97Var2 = (q97) go2VarI0.a(wv0.p0(1, listL2)).r(((ni8) ot8Var.c().l0().get(0)).b()).build();
                if (q97Var2 != null) {
                    q97Var2.y0 = true;
                }
                return q97Var2;
            }
        }
        return null;
    }

    public static boolean D(ho2 ho2Var, ho2 ho2Var2) {
        int iB = hf5.c.n(ho2Var2, ho2Var, true).b();
        if (iB != 0) {
            return iB == 1 && !w39.u(ho2Var2, ho2Var);
        }
        throw null;
    }

    public static boolean E(q97 q97Var, q97 q97Var2) {
        int i = sa0.l;
        q97Var.getClass();
        if (dh3.f(q97Var.getName().b(), "removeAt") && dh3.f(w45.z(q97Var), ff7.g.e)) {
            q97Var2 = q97Var2.G0();
        }
        q97Var2.getClass();
        return D(q97Var2, q97Var);
    }

    public static q97 F(fx5 fx5Var, String str, gn2 gn2Var) {
        q97 q97Var;
        Iterator it = ((Iterable) gn2Var.B(v15.e(str))).iterator();
        do {
            q97Var = null;
            if (!it.hasNext()) {
                break;
            }
            q97 q97Var2 = (q97) it.next();
            if (q97Var2.L().size() == 0) {
                q45 q45Var = v14.a;
                t14 t14Var = q97Var2.k0;
                if (t14Var == null ? false : q45Var.b(t14Var, fx5Var.c())) {
                    q97Var = q97Var2;
                }
            }
        } while (q97Var == null);
        return q97Var;
    }

    public static q97 H(fx5 fx5Var, gn2 gn2Var) {
        q97 q97Var;
        t14 t14Var;
        String strB = fx5Var.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) gn2Var.B(v15.e(js3.b(strB)))).iterator();
        do {
            q97Var = null;
            if (!it.hasNext()) {
                break;
            }
            q97 q97Var2 = (q97) it.next();
            if (q97Var2.L().size() == 1 && (t14Var = q97Var2.k0) != null) {
                v15 v15Var = zz3.e;
                if (zz3.E(t14Var, tg7.d)) {
                    q45 q45Var = v14.a;
                    List listL = q97Var2.L();
                    listL.getClass();
                    if (q45Var.a(((ot8) wv0.O0(listL)).c(), fx5Var.c())) {
                        q97Var = q97Var2;
                    }
                }
            }
        } while (q97Var == null);
        return q97Var;
    }

    public static boolean K(q97 q97Var, ho2 ho2Var) {
        String strY = w45.y(q97Var, 2);
        ho2 ho2VarA = ho2Var.a();
        ho2VarA.getClass();
        return strY.equals(w45.y(ho2VarA, 2)) && !D(q97Var, ho2Var);
    }

    public final boolean C(fx5 fx5Var, gn2 gn2Var) {
        if (vj8.V(fx5Var)) {
            return false;
        }
        q97 q97VarG = G(fx5Var, gn2Var);
        q97 q97VarH = H(fx5Var, gn2Var);
        if (q97VarG == null) {
            return false;
        }
        if (fx5Var.R()) {
            return q97VarH != null && q97VarH.m() == q97VarG.m();
        }
        return true;
    }

    public final q97 G(fx5 fx5Var, gn2 gn2Var) {
        v15 v15Var;
        hx5 hx5VarB = fx5Var.b();
        String strB = null;
        hx5 hx5Var = hx5VarB != null ? (hx5) gv3.A(hx5VarB) : null;
        if (hx5Var != null) {
            zz3.A(hx5Var);
            ld0 ld0VarB = el1.b(el1.i(hx5Var), ag.s0);
            if (ld0VarB != null && (v15Var = (v15) ua0.a.get(el1.g(ld0VarB))) != null) {
                strB = v15Var.b();
            }
        }
        if (strB != null && !gv3.D(this.n, hx5Var)) {
            return F(fx5Var, strB, gn2Var);
        }
        String strB2 = fx5Var.getName().b();
        strB2.getClass();
        return F(fx5Var, js3.a(strB2), gn2Var);
    }

    public final LinkedHashSet I(v15 v15Var) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            bw0.d0(linkedHashSet, ((t14) it.next()).K().b(v15Var, x45.g0));
        }
        return linkedHashSet;
    }

    public final Set J(v15 v15Var) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionF = ((t14) it.next()).K().f(v15Var, x45.g0);
            ArrayList arrayList2 = new ArrayList(xv0.Z(collectionF, 10));
            Iterator it2 = collectionF.iterator();
            while (it2.hasNext()) {
                arrayList2.add((fx5) it2.next());
            }
            bw0.d0(arrayList, arrayList2);
        }
        return wv0.c1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[LOOP:5: B:57:0x012f->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x015f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x0178 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[LOOP:3: B:39:0x00d4->B:97:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0120 A[SYNTHETIC] */
    public final boolean L(q97 q97Var) {
        v15 v15Var;
        v15 name;
        q97 q97VarB;
        LinkedHashSet<q97> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        ho2 ho2VarA;
        ArrayList arrayList2;
        q97 q97Var2;
        Iterator it3;
        q97 q97Var3;
        v15 name2 = q97Var.getName();
        name2.getClass();
        List listF = z91.F(name2);
        if (listF.isEmpty()) {
            ArrayList arrayList3 = ff7.a;
            v15 name3 = q97Var.getName();
            name3.getClass();
            v15Var = (v15) ff7.k.get(name3);
            if (v15Var == null) {
                int i = ta0.l;
                name = q97Var.getName();
                name.getClass();
                if (!ff7.e.contains(name)) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name4 = q97Var.getName();
                    name4.getClass();
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (q97 q97Var4 : linkedHashSetI) {
                        if (q97Var4.h() || !D(q97VarB, q97Var4)) {
                        }
                    }
                    return true;
                }
                v15 name5 = q97Var.getName();
                name5.getClass();
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    ho2VarA = ta0.a((q97) it.next());
                    if (ho2VarA != null) {
                        arrayList.add(ho2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name6 = q97Var.getName();
                    name6.getClass();
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (q97Var4.h()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(q97Var, (ho2) it2.next())) {
                    }
                }
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name7 = q97Var.getName();
                name7.getClass();
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(v15Var);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                q97Var3 = (q97) obj;
                q97Var3.getClass();
                if (gv3.A(q97Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = ta0.l;
                name = q97Var.getName();
                name.getClass();
                if (!ff7.e.contains(name)) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name8 = q97Var.getName();
                    name8.getClass();
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (q97Var4.h()) {
                        }
                    }
                    return true;
                }
                v15 name9 = q97Var.getName();
                name9.getClass();
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    ho2VarA = ta0.a((q97) it.next());
                    if (ho2VarA != null) {
                        arrayList.add(ho2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name10 = q97Var.getName();
                    name10.getClass();
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (q97Var4.h()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(q97Var, (ho2) it2.next())) {
                    }
                }
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name11 = q97Var.getName();
                name11.getClass();
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            go2 go2VarI0 = q97Var.i0();
            go2VarI0.x(v15Var);
            go2VarI0.z();
            go2VarI0.g();
            ho2 ho2VarBuild = go2VarI0.build();
            ho2VarBuild.getClass();
            q97Var2 = (q97) ho2VarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = ta0.l;
                name = q97Var.getName();
                name.getClass();
                if (!ff7.e.contains(name)) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name12 = q97Var.getName();
                    name12.getClass();
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (q97Var4.h()) {
                        }
                    }
                    return true;
                }
                v15 name13 = q97Var.getName();
                name13.getClass();
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    ho2VarA = ta0.a((q97) it.next());
                    if (ho2VarA != null) {
                        arrayList.add(ho2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q97VarB = B(q97Var);
                    if (q97VarB == null) {
                        return true;
                    }
                    v15 name14 = q97Var.getName();
                    name14.getClass();
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (q97Var4.h()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(q97Var, (ho2) it2.next())) {
                    }
                }
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name15 = q97Var.getName();
                name15.getClass();
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((q97) it3.next(), q97Var2)) {
                }
            }
            int i4 = ta0.l;
            name = q97Var.getName();
            name.getClass();
            if (!ff7.e.contains(name)) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name16 = q97Var.getName();
                name16.getClass();
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            v15 name17 = q97Var.getName();
            name17.getClass();
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                ho2VarA = ta0.a((q97) it.next());
                if (ho2VarA != null) {
                    arrayList.add(ho2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name18 = q97Var.getName();
                name18.getClass();
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(q97Var, (ho2) it2.next())) {
                }
            }
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name19 = q97Var.getName();
            name19.getClass();
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        Iterator it4 = listF.iterator();
        while (it4.hasNext()) {
            Set<fx5> setJ = J((v15) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (fx5 fx5Var : setJ) {
                    if (C(fx5Var, new d3(q97Var, this, (byte) 11))) {
                        if (!fx5Var.R()) {
                            String strB = q97Var.getName().b();
                            strB.getClass();
                            fk2 fk2Var = js3.a;
                            if (!mm7.Z(strB, false, "set")) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = ff7.a;
        v15 name20 = q97Var.getName();
        name20.getClass();
        v15Var = (v15) ff7.k.get(name20);
        if (v15Var == null) {
            int i5 = ta0.l;
            name = q97Var.getName();
            name.getClass();
            if (!ff7.e.contains(name)) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name110 = q97Var.getName();
                name110.getClass();
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            v15 name111 = q97Var.getName();
            name111.getClass();
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                ho2VarA = ta0.a((q97) it.next());
                if (ho2VarA != null) {
                    arrayList.add(ho2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name112 = q97Var.getName();
                name112.getClass();
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(q97Var, (ho2) it2.next())) {
                }
            }
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name113 = q97Var.getName();
            name113.getClass();
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(v15Var);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            q97Var3 = (q97) obj;
            q97Var3.getClass();
            if (gv3.A(q97Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = ta0.l;
            name = q97Var.getName();
            name.getClass();
            if (!ff7.e.contains(name)) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name114 = q97Var.getName();
                name114.getClass();
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            v15 name115 = q97Var.getName();
            name115.getClass();
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                ho2VarA = ta0.a((q97) it.next());
                if (ho2VarA != null) {
                    arrayList.add(ho2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name116 = q97Var.getName();
                name116.getClass();
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(q97Var, (ho2) it2.next())) {
                }
            }
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name117 = q97Var.getName();
            name117.getClass();
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        go2 go2VarI1 = q97Var.i0();
        go2VarI1.x(v15Var);
        go2VarI1.z();
        go2VarI1.g();
        ho2 ho2VarBuild2 = go2VarI1.build();
        ho2VarBuild2.getClass();
        q97Var2 = (q97) ho2VarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = ta0.l;
            name = q97Var.getName();
            name.getClass();
            if (!ff7.e.contains(name)) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name118 = q97Var.getName();
                name118.getClass();
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            v15 name119 = q97Var.getName();
            name119.getClass();
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                ho2VarA = ta0.a((q97) it.next());
                if (ho2VarA != null) {
                    arrayList.add(ho2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                q97VarB = B(q97Var);
                if (q97VarB == null) {
                    return true;
                }
                v15 name1110 = q97Var.getName();
                name1110.getClass();
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (q97Var4.h()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(q97Var, (ho2) it2.next())) {
                }
            }
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name1111 = q97Var.getName();
            name1111.getClass();
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((q97) it3.next(), q97Var2)) {
            }
        }
        int i8 = ta0.l;
        name = q97Var.getName();
        name.getClass();
        if (!ff7.e.contains(name)) {
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name1112 = q97Var.getName();
            name1112.getClass();
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        v15 name1113 = q97Var.getName();
        name1113.getClass();
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            ho2VarA = ta0.a((q97) it.next());
            if (ho2VarA != null) {
                arrayList.add(ho2VarA);
            }
        }
        if (arrayList.isEmpty()) {
            q97VarB = B(q97Var);
            if (q97VarB == null) {
                return true;
            }
            v15 name1114 = q97Var.getName();
            name1114.getClass();
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (q97Var4.h()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(q97Var, (ho2) it2.next())) {
            }
        }
        q97VarB = B(q97Var);
        if (q97VarB == null) {
            return true;
        }
        v15 name1115 = q97Var.getName();
        name1115.getClass();
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r6.hasNext()) {
            if (q97Var4.h()) {
            }
        }
        return true;
        return false;
    }

    public final void M(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        Object obj = this.b.Y;
        this.n.getClass();
    }

    public final ArrayList N(v15 v15Var) {
        Collection collectionC = ((ld1) this.e.invoke()).c(v15Var);
        ArrayList arrayList = new ArrayList(xv0.Z(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((cb6) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(v15 v15Var) {
        LinkedHashSet linkedHashSetI = I(v15Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            q97 q97Var = (q97) obj;
            q97Var.getClass();
            if (gv3.A(q97Var) == null && ta0.a(q97Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.f54, defpackage.ft4, defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        M(v15Var, x45Var);
        return super.b(v15Var, x45Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        vt1 vt1Var;
        sx4 sx4Var;
        v15Var.getClass();
        x45Var.getClass();
        M(v15Var, x45Var);
        t44 t44Var = (t44) this.c;
        return (t44Var == null || (vt1Var = t44Var.u) == null || (sx4Var = (sx4) vt1Var.B(v15Var)) == null) ? (ot0) this.u.B(v15Var) : sx4Var;
    }

    @Override // defpackage.f54, defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        M(v15Var, x45Var);
        return super.f(v15Var, x45Var);
    }

    @Override // defpackage.f54
    public final Set h(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return q57.Z((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // defpackage.f54
    public final Set i(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        sx4 sx4Var = this.n;
        Collection collectionC = sx4Var.l().c();
        collectionC.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            bw0.d0(linkedHashSet, ((t14) it.next()).K().c());
        }
        te4 te4Var = this.e;
        linkedHashSet.addAll(((ld1) te4Var.invoke()).a());
        linkedHashSet.addAll(((ld1) te4Var.invoke()).e());
        linkedHashSet.addAll(h(pk1Var, gn2Var));
        z47 z47Var = this.b;
        sx4Var.getClass();
        z47Var.getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // defpackage.f54
    public final void j(v15 v15Var, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        boolean zG = this.o.g();
        sx4 sx4Var = this.n;
        z47 z47Var = this.b;
        if (zG) {
            te4 te4Var = this.e;
            if (((ld1) te4Var.invoke()).b(v15Var) != null) {
                if (arrayList.isEmpty()) {
                    fb6 fb6VarB = ((ld1) te4Var.invoke()).b(v15Var);
                    fb6VarB.getClass();
                    dl3 dl3VarV0 = dl3.V0(sx4Var, hi5.w0(z47Var, fb6VarB), fb6VarB.c(), lh4.Z0(fb6VarB), true);
                    t14 t14VarC = ((f63) z47Var.g0).C(fb6VarB.f(), pu.U(zi8.Y, false, null, 6));
                    i44 i44VarP = p();
                    fx4.X.getClass();
                    fl1 fl1Var = gl1.e;
                    d02 d02Var = d02.X;
                    dl3VarV0.U0(null, i44VarP, d02Var, d02Var, d02Var, t14VarC, fx4.f0, fl1Var, null);
                    dl3VarV0.H0 = 1;
                    arrayList.add(dl3VarV0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((q97) it.next()).L().isEmpty()) {
                        }
                    }
                    fb6 fb6VarB2 = ((ld1) te4Var.invoke()).b(v15Var);
                    fb6VarB2.getClass();
                    dl3 dl3VarV1 = dl3.V0(sx4Var, hi5.w0(z47Var, fb6VarB2), fb6VarB2.c(), lh4.Z0(fb6VarB2), true);
                    t14 t14VarC2 = ((f63) z47Var.g0).C(fb6VarB2.f(), pu.U(zi8.Y, false, null, 6));
                    i44 i44VarP2 = p();
                    fx4.X.getClass();
                    fl1 fl1Var2 = gl1.e;
                    d02 d02Var2 = d02.X;
                    dl3VarV1.U0(null, i44VarP2, d02Var2, d02Var2, d02Var2, t14VarC2, fx4.f0, fl1Var2, null);
                    dl3VarV1.H0 = 1;
                    arrayList.add(dl3VarV1);
                }
            }
        }
        sx4Var.getClass();
        z47Var.getClass();
    }

    @Override // defpackage.f54
    public final ld1 k() {
        return new js0(this.o, cl1.A0);
    }

    @Override // defpackage.f54
    public final void m(LinkedHashSet linkedHashSet, v15 v15Var) {
        LinkedHashSet linkedHashSetI = I(v15Var);
        ArrayList arrayList = ff7.a;
        if (!ff7.j.contains(v15Var)) {
            int i = ta0.l;
            if (!ff7.e.contains(v15Var)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ho2) it.next()).h()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((q97) obj)) {
                        arrayList2.add(obj);
                    }
                }
                w(linkedHashSet, v15Var, arrayList2, false);
                return;
            }
        }
        pc7 pc7Var = new pc7();
        LinkedHashSet linkedHashSetQ = ch3.Q(v15Var, linkedHashSetI, d02.X, this.n, l32.n, ((q45) ((p45) ((c6) this.b.Y).Z)).d);
        Class<t44> cls = t44.class;
        x(v15Var, linkedHashSet, linkedHashSetQ, linkedHashSet, new d0(1, this, cls, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 20));
        x(v15Var, linkedHashSet, linkedHashSetQ, pc7Var, new d0(1, this, cls, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 21));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((q97) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, v15Var, wv0.H0(arrayList3, pc7Var), true);
    }

    @Override // defpackage.f54
    public final void n(v15 v15Var, ArrayList arrayList) {
        v15 v15Var2;
        boolean zIsAnnotation = this.o.a.isAnnotation();
        z47 z47Var = this.b;
        if (zIsAnnotation) {
            v15Var2 = v15Var;
            cb6 cb6Var = (cb6) wv0.P0(((ld1) this.e.invoke()).c(v15Var2));
            if (cb6Var != null) {
                gl3 gl3VarP0 = gl3.P0(this.n, hi5.w0(z47Var, cb6Var), s08.k(cb6Var.e()), false, cb6Var.c(), lh4.Z0(cb6Var), false);
                hx5 hx5VarS = z91.s(gl3VarP0, oy1.f0);
                gl3VarP0.L0(hx5VarS, null, null, null);
                z47Var.getClass();
                t14 t14VarL = f54.l(cb6Var, new z47((c6) z47Var.Y, new xm0(z47Var, gl3VarP0, cb6Var, 0), (g44) z47Var.f0));
                i44 i44VarP = p();
                d02 d02Var = d02.X;
                gl3VarP0.O0(t14VarL, d02Var, i44VarP, null, d02Var);
                hx5VarS.q0 = t14VarL;
                arrayList.add(gl3VarP0);
            }
        } else {
            v15Var2 = v15Var;
        }
        Set setJ = J(v15Var);
        if (setJ.isEmpty()) {
            return;
        }
        pc7 pc7Var = new pc7();
        pc7 pc7Var2 = new pc7();
        y(setJ, arrayList, pc7Var, new s44(this, (byte) 0));
        y(q57.Y(setJ, pc7Var), pc7Var2, null, new s44(this, (byte) 1));
        LinkedHashSet linkedHashSetZ = q57.Z(setJ, pc7Var2);
        c6 c6Var = (c6) z47Var.Y;
        v15 v15Var3 = v15Var2;
        arrayList.addAll(ch3.Q(v15Var3, linkedHashSetZ, arrayList, this.n, qe4.r0, ((q45) ((p45) c6Var.Z)).d));
    }

    @Override // defpackage.f54
    public final Set o(pk1 pk1Var) {
        pk1Var.getClass();
        if (this.o.a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((ld1) this.e.invoke()).f());
        Collection collectionC = this.n.l().c();
        collectionC.getClass();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            bw0.d0(linkedHashSet, ((t14) it.next()).K().g());
        }
        return linkedHashSet;
    }

    @Override // defpackage.f54
    public final i44 p() {
        sx4 sx4Var = this.n;
        if (sx4Var != null) {
            int i = bl1.a;
            return sx4Var.p0();
        }
        bl1.a(0);
        throw null;
    }

    @Override // defpackage.f54
    public final ed1 q() {
        return this.n;
    }

    @Override // defpackage.f54
    public final boolean r(dl3 dl3Var) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return L(dl3Var);
    }

    @Override // defpackage.f54
    public final e54 s(cb6 cb6Var, ArrayList arrayList, t14 t14Var, List list) {
        cb6Var.getClass();
        Object obj = this.b.Y;
        if (this.n == null) {
            z68.a(1);
            throw null;
        }
        List list2 = Collections.EMPTY_LIST;
        if (list2 != null) {
            return new e54(t14Var, list, arrayList, list2);
        }
        kp5.n("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
        return null;
    }

    @Override // defpackage.f54
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, yj3 yj3Var, int i, cb6 cb6Var, t14 t14Var, t14 t14Var2) {
        ka6 ua6Var;
        rm rmVar = oy1.f0;
        v15 v15VarC = cb6Var.c();
        if (t14Var == null) {
            cj8.a(2);
            throw null;
        }
        mo8 mo8VarG = cj8.g(t14Var, false);
        Object defaultValue = cb6Var.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = ia6.a;
            if (Enum.class.isAssignableFrom(cls)) {
                ua6Var = new ya6(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                ua6Var = new la6(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                ua6Var = new ma6(null, (Object[]) defaultValue);
            } else {
                ua6Var = defaultValue instanceof Class ? new ua6(null, (Class) defaultValue) : new ab6(null, defaultValue);
            }
        } else {
            ua6Var = null;
        }
        boolean z = ua6Var != null;
        mo8 mo8VarG2 = t14Var2 != null ? cj8.g(t14Var2, false) : null;
        Object obj = this.b.Y;
        arrayList.add(new ot8(yj3Var, null, i, rmVar, v15VarC, mo8VarG, z, false, false, mo8VarG2, lh4.Z0(cb6Var)));
    }

    public final void w(LinkedHashSet linkedHashSet, v15 v15Var, ArrayList arrayList, boolean z) {
        c6 c6Var = (c6) this.b.Y;
        LinkedHashSet<q97> linkedHashSetQ = ch3.Q(v15Var, arrayList, linkedHashSet, this.n, qe4.r0, ((q45) ((p45) c6Var.Z)).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetQ);
            return;
        }
        ArrayList arrayListH0 = wv0.H0(linkedHashSet, linkedHashSetQ);
        ArrayList arrayList2 = new ArrayList(xv0.Z(linkedHashSetQ, 10));
        for (q97 q97VarA : linkedHashSetQ) {
            q97 q97Var = (q97) gv3.B(q97VarA);
            if (q97Var != null) {
                q97VarA = A(q97VarA, q97Var, arrayListH0);
            }
            arrayList2.add(q97VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(v15 v15Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, gn2 gn2Var) {
        q97 q97VarA;
        Object next;
        q97 q97Var;
        q97 q97VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            q97 q97Var2 = (q97) it.next();
            q97 q97Var3 = (q97) gv3.A(q97Var2);
            q97 q97Var4 = null;
            if (q97Var3 != null) {
                String strY = gv3.y(q97Var3);
                strY.getClass();
                Iterator it2 = ((Collection) gn2Var.B(v15.e(strY))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        q97VarA = null;
                        break;
                    }
                    go2 go2VarI0 = ((q97) it2.next()).i0();
                    go2VarI0.x(v15Var);
                    go2VarI0.z();
                    go2VarI0.g();
                    ho2 ho2VarBuild = go2VarI0.build();
                    ho2VarBuild.getClass();
                    q97 q97Var5 = (q97) ho2VarBuild;
                    if (E(q97Var3, q97Var5)) {
                        q97VarA = A(q97Var5, q97Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                q97VarA = null;
                break;
            }
            if (q97VarA != null) {
                abstractSet.add(q97VarA);
            }
            ho2 ho2VarA = ta0.a(q97Var2);
            if (ho2VarA == 0) {
                q97VarA2 = null;
            } else {
                v15 name = ((fd1) ho2VarA).getName();
                name.getClass();
                Iterator it3 = ((Iterable) gn2Var.B(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((q97) next, ho2VarA));
                q97 q97Var6 = (q97) next;
                if (q97Var6 != null) {
                    go2 go2VarI1 = q97Var6.i0();
                    List listL = ho2VarA.L();
                    listL.getClass();
                    ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
                    Iterator it4 = listL.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((ot8) it4.next()).c());
                    }
                    List listL2 = q97Var6.L();
                    listL2.getClass();
                    go2VarI1.a(xt7.b(arrayList, listL2, ho2VarA));
                    go2VarI1.z();
                    go2VarI1.g();
                    go2VarI1.h();
                    q97Var = (q97) go2VarI1.build();
                } else {
                    q97Var = null;
                }
                if (q97Var == null) {
                    q97VarA2 = null;
                } else {
                    if (!L(q97Var)) {
                        q97Var = null;
                    }
                    if (q97Var != null) {
                        q97VarA2 = A(q97Var, ho2VarA, linkedHashSet);
                    } else {
                        q97VarA2 = null;
                    }
                }
            }
            if (q97VarA2 != null) {
                abstractSet.add(q97VarA2);
            }
            if (q97Var2.h()) {
                v15 name2 = q97Var2.getName();
                name2.getClass();
                Iterator it5 = ((Iterable) gn2Var.B(name2)).iterator();
                while (it5.hasNext()) {
                    q97 q97VarB = B((q97) it5.next());
                    if (q97VarB == null || !D(q97VarB, q97Var2)) {
                        q97VarB = null;
                    }
                    if (q97VarB != null) {
                        q97Var4 = q97VarB;
                        break;
                    }
                }
            }
            if (q97Var4 != null) {
                abstractSet.add(q97Var4);
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, pc7 pc7Var, gn2 gn2Var) {
        q97 q97VarH;
        tx5 tx5VarA;
        kk3 kk3Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fx5 fx5Var = (fx5) it.next();
            if (C(fx5Var, gn2Var)) {
                q97 q97VarG = G(fx5Var, gn2Var);
                q97VarG.getClass();
                if (fx5Var.R()) {
                    q97VarH = H(fx5Var, gn2Var);
                    q97VarH.getClass();
                } else {
                    q97VarH = null;
                }
                if (q97VarH != null) {
                    q97VarH.m();
                    q97VarG.m();
                }
                sx4 sx4Var = this.n;
                sx4Var.getClass();
                kk3 kk3Var2 = new kk3(sx4Var, oy1.f0, q97VarG.m(), q97VarG.e(), q97VarH != null, fx5Var.getName(), q97VarG.getSource(), null, 1, false, null);
                t14 t14Var = q97VarG.k0;
                t14Var.getClass();
                i44 i44VarP = p();
                d02 d02Var = d02.X;
                kk3Var2.O0(t14Var, d02Var, i44VarP, null, d02Var);
                hx5 hx5VarY = z91.y(kk3Var2, q97VarG.getAnnotations(), false, q97VarG.getSource());
                hx5VarY.p0 = q97VarG;
                hx5VarY.J0(kk3Var2.c());
                if (q97VarH != null) {
                    List listL = q97VarH.L();
                    listL.getClass();
                    ot8 ot8Var = (ot8) wv0.t0(listL);
                    if (ot8Var == null) {
                        throw new AssertionError("No parameter found for " + q97VarH);
                    }
                    tx5VarA = z91.A(kk3Var2, q97VarH.getAnnotations(), ot8Var.getAnnotations(), false, q97VarH.e(), q97VarH.getSource());
                    tx5VarA.p0 = q97VarH;
                } else {
                    tx5VarA = null;
                }
                kk3Var2.L0(hx5VarY, tx5VarA, null, null);
                kk3Var = kk3Var2;
            } else {
                kk3Var = null;
            }
            if (kk3Var != null) {
                abstractCollection.add(kk3Var);
                if (pc7Var != null) {
                    pc7Var.add(fx5Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        sx4 sx4Var = this.n;
        if (z) {
            Collection collectionC = sx4Var.l().c();
            collectionC.getClass();
            return collectionC;
        }
        Object obj = this.b.Y;
        sx4Var.getClass();
        Collection collectionC2 = sx4Var.l().c();
        collectionC2.getClass();
        return collectionC2;
    }
}
