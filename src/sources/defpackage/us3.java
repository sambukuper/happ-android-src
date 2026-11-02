package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class us3 implements i7, po5 {
    public static final /* synthetic */ nw3[] j0 = {new lx5(us3.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new lx5(us3.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new lx5(us3.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    public final wx4 X;
    public final te4 Y;
    public final aa7 Z;
    public final te4 f0;
    public final pe4 g0;
    public final te4 h0;
    public final pe4 i0;

    public us3(wx4 wx4Var, ve4 ve4Var, zk3 zk3Var) {
        this.X = wx4Var;
        this.Y = new te4(ve4Var, zk3Var);
        ms0 ms0Var = new ms0(new h02(wx4Var, new fk2("java.io"), (byte) 1), v15.e("Serializable"), fx4.g0, us0.Y, i21.K(new z74(ve4Var, new ss3(this, (byte) 1))), ve4Var);
        ms0Var.B0(dt4.b, m02.X, null);
        this.Z = ms0Var.X();
        this.f0 = new te4(ve4Var, new c3((Object) this, (Object) ve4Var, (byte) 21));
        this.g0 = new pe4(ve4Var, new ConcurrentHashMap(3, 1.0f, 2), new ve7((byte) 15), (byte) 0);
        this.h0 = new te4(ve4Var, new ss3(this, (byte) 0));
        this.i0 = ve4Var.b(new f0(this, (byte) 18));
    }

    @Override // defpackage.po5
    public final boolean K(sx4 sx4Var, jm1 jm1Var) {
        sx4Var.getClass();
        p44 p44VarA = a(sx4Var);
        if (p44VarA == null || !jm1Var.getAnnotations().k(qo5.a)) {
            return true;
        }
        b().getClass();
        String strY = w45.y(jm1Var, 3);
        t44 t44VarB0 = p44VarA.B0();
        v15 name = jm1Var.getName();
        name.getClass();
        Collection collectionB = t44VarB0.b(name, x45.X);
        if ((collectionB instanceof Collection) && collectionB.isEmpty()) {
            return false;
        }
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            if (w45.y((q97) it.next(), 3).equals(strY)) {
                return true;
            }
        }
        return false;
    }

    public final p44 a(sx4 sx4Var) {
        fk2 fk2VarA;
        if (sx4Var == null) {
            zz3.a(108);
            throw null;
        }
        if (!zz3.b(sx4Var, tg7.a) && zz3.K(sx4Var)) {
            int i = el1.a;
            gk2 gk2VarF = bl1.f(sx4Var);
            gk2VarF.getClass();
            if (gk2VarF.d()) {
                String str = ll3.a;
                qs0 qs0VarH = ll3.h(gk2VarF);
                if (qs0VarH != null && (fk2VarA = qs0VarH.a()) != null) {
                    sx4 sx4VarW = vr3.W(b().a, fk2VarA);
                    if (sx4VarW instanceof p44) {
                        return (p44) sx4VarW;
                    }
                }
            }
        }
        return null;
    }

    public final qs3 b() {
        return (qs3) hi5.e0(this.Y, j0[0]);
    }

    @Override // defpackage.i7
    public final Collection e(sx4 sx4Var) {
        gk2 gk2VarF;
        qe4 qe4Var = qe4.A0;
        if (sx4Var.g0() == us0.X) {
            b().getClass();
            p44 p44VarA = a(sx4Var);
            if (p44VarA != null) {
                fk2 fk2VarG = el1.g(p44VarA);
                a82 a82Var = a82.f;
                a82Var.getClass();
                String str = ll3.a;
                qs0 qs0VarG = ll3.g(fk2VarG);
                sx4 sx4VarJ = qs0VarG != null ? a82Var.j(qs0VarG.a()) : null;
                if (sx4VarJ != null) {
                    wi8 wi8Var = new wi8(w79.q(sx4VarJ, p44VarA));
                    List list = (List) p44VarA.s0.q.invoke();
                    ArrayList<gs0> arrayList = new ArrayList();
                    for (Object obj : list) {
                        gs0 gs0Var = (gs0) obj;
                        if (gs0Var.e().a.Y) {
                            Collection collectionB = sx4VarJ.B();
                            collectionB.getClass();
                            Collection collection = collectionB;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                Iterator it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        gs0 gs0Var2 = (gs0) it.next();
                                        gs0Var2.getClass();
                                        if (hf5.j(gs0Var2, gs0Var.g(wi8Var)) == 1) {
                                        }
                                    }
                                }
                            }
                            if (gs0Var.L().size() == 1) {
                                List listL = gs0Var.L();
                                listL.getClass();
                                ot0 ot0VarX = ((ot8) wv0.O0(listL)).c().n0().x();
                                if (ot0VarX != null) {
                                    int i = el1.a;
                                    gk2VarF = bl1.f(ot0VarX);
                                    gk2VarF.getClass();
                                } else {
                                    gk2VarF = null;
                                }
                                gk2 gk2VarF2 = bl1.f(sx4Var);
                                gk2VarF2.getClass();
                                if (dh3.f(gk2VarF, gk2VarF2)) {
                                }
                            }
                            if (!zz3.D(gs0Var)) {
                                LinkedHashSet linkedHashSet = xs3.f;
                                String strY = w45.y(gs0Var, 3);
                                String str2 = ll3.a;
                                qs0 qs0VarH = ll3.h(el1.g(p44VarA).a);
                                if (!linkedHashSet.contains((qs0VarH != null ? zs3.b(qs0VarH) : z51.t(p44VarA, qe4Var)) + '.' + strY)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                    for (gs0 gs0Var3 : arrayList) {
                        gs0Var3.getClass();
                        io2 io2VarM0 = gs0Var3.M0(wi8.b);
                        io2VarM0.Y = sx4Var;
                        io2VarM0.r(sx4Var.X());
                        io2VarM0.q0 = true;
                        io2VarM0.X = wi8Var.a;
                        LinkedHashSet linkedHashSet2 = xs3.g;
                        String strY2 = w45.y(gs0Var3, 3);
                        String str3 = ll3.a;
                        qs0 qs0VarH2 = ll3.h(el1.g(p44VarA).a);
                        if (!linkedHashSet2.contains((qs0VarH2 != null ? zs3.b(qs0VarH2) : z51.t(p44VarA, qe4Var)) + '.' + strY2)) {
                            io2VarM0.n((sm) hi5.e0(this.h0, j0[2]));
                        }
                        jo2 jo2VarJ0 = io2VarM0.z0.J0(io2VarM0);
                        jo2VarJ0.getClass();
                        arrayList2.add((gs0) jo2VarJ0);
                    }
                    return arrayList2;
                }
            }
        }
        return d02.X;
    }

    @Override // defpackage.i7
    public final Collection f(sx4 sx4Var) {
        Set setC;
        sx4Var.getClass();
        b().getClass();
        p44 p44VarA = a(sx4Var);
        if (p44VarA == null || (setC = p44VarA.B0().c()) == null) {
            setC = m02.X;
        }
        return setC;
    }

    @Override // defpackage.i7
    public final Collection k(sx4 sx4Var) {
        int i = el1.a;
        gk2 gk2VarF = bl1.f(sx4Var);
        gk2VarF.getClass();
        LinkedHashSet linkedHashSet = xs3.a;
        gk2 gk2Var = tg7.g;
        boolean zEquals = gk2VarF.equals(gk2Var);
        boolean zIsAssignableFrom = false;
        aa7 aa7Var = this.Z;
        if (!zEquals) {
            HashMap map = tg7.g0;
            if (map.get(gk2VarF) == null) {
                if (gk2VarF.equals(gk2Var) || map.get(gk2VarF) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = ll3.a;
                    qs0 qs0VarH = ll3.h(gk2VarF);
                    if (qs0VarH != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(qs0VarH.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? i21.K(aa7Var) : d02.X;
            }
        }
        return i21.L((aa7) hi5.e0(this.f0, j0[1]), aa7Var);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    @Override // defpackage.i7
    public final Collection l(v15 v15Var, sx4 sx4Var) {
        q97 q97Var;
        sm smVar;
        Set setU;
        Object obj;
        boolean zBooleanValue;
        sx4Var.getClass();
        boolean zEquals = v15Var.equals(qu0.e);
        x45 x45Var = x45.X;
        nw3[] nw3VarArr = j0;
        List<q97> list = d02.X;
        if (zEquals && (sx4Var instanceof vl1) && (zz3.b(sx4Var, tg7.g) || zz3.s(sx4Var) != null)) {
            vl1 vl1Var = (vl1) sx4Var;
            List list2 = vl1Var.g0.s0;
            list2.getClass();
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (u70.S((w15) vl1Var.n0.Y, ((vy5) it.next()).h0).equals(qu0.e)) {
                        return list;
                    }
                }
            }
            go2 go2VarI0 = ((q97) wv0.N0(((aa7) hi5.e0(this.f0, nw3VarArr[1])).K().b(v15Var, x45Var))).i0();
            go2VarI0.w(vl1Var);
            go2VarI0.k(gl1.e);
            go2VarI0.r(vl1Var.X());
            go2VarI0.f(vl1Var.p0());
            ho2 ho2VarBuild = go2VarI0.build();
            ho2VarBuild.getClass();
            return i21.K((q97) ho2VarBuild);
        }
        b().getClass();
        p44 p44VarA = a(sx4Var);
        if (p44VarA != null) {
            fk2 fk2VarG = el1.g(p44VarA);
            a82 a82Var = a82.f;
            a82Var.getClass();
            String str = ll3.a;
            qs0 qs0VarG = ll3.g(fk2VarG);
            sx4 sx4VarJ = qs0VarG != null ? a82Var.j(qs0VarG.a()) : null;
            if (sx4VarJ == null) {
                setU = m02.X;
            } else {
                gk2 gk2VarF = bl1.f(sx4VarJ);
                gk2VarF.getClass();
                fk2 fk2Var = (fk2) ll3.k.get(gk2VarF);
                setU = fk2Var == null ? w45.U(sx4VarJ) : i21.L(sx4VarJ, a82Var.j(fk2Var));
            }
            Iterable iterable = setU;
            if (iterable instanceof List) {
                List list3 = (List) iterable;
                if (list3.isEmpty()) {
                    obj = null;
                } else {
                    obj = list3.get(list3.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            sx4 sx4Var2 = (sx4) obj;
            if (sx4Var2 != null) {
                int i = pc7.Z;
                ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(el1.g((sx4) it3.next()));
                }
                pc7 pc7Var = new pc7();
                pc7Var.addAll(arrayList);
                String str2 = ll3.a;
                boolean zContainsKey = ll3.j.containsKey(bl1.f(sx4Var));
                fk2 fk2VarG2 = el1.g(p44VarA);
                c3 c3Var = new c3((Object) p44VarA, (Object) sx4Var2, (byte) 22);
                pe4 pe4Var = this.g0;
                pe4Var.getClass();
                Object objB = pe4Var.B(new re4(fk2VarG2, c3Var));
                if (objB == null) {
                    pe4.c(3);
                    throw null;
                }
                et4 et4VarR0 = ((sx4) objB).r0();
                et4VarR0.getClass();
                Collection collectionB = et4VarR0.b(v15Var, x45Var);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionB) {
                    q97 q97Var2 = (q97) obj2;
                    if (q97Var2.r() == 1 && q97Var2.e().a.Y && !zz3.D(q97Var2)) {
                        Collection collectionQ = q97Var2.q();
                        if (!(collectionQ instanceof Collection) || !collectionQ.isEmpty()) {
                            Iterator it4 = collectionQ.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    ed1 ed1VarP = ((ho2) it4.next()).p();
                                    ed1VarP.getClass();
                                    if (pc7Var.contains(el1.g(ed1VarP))) {
                                    }
                                }
                            }
                        }
                        ed1 ed1VarP2 = q97Var2.p();
                        ed1VarP2.getClass();
                        sx4 sx4Var3 = (sx4) ed1VarP2;
                        String strY = w45.y(q97Var2, 3);
                        LinkedHashSet linkedHashSet = xs3.e;
                        String str3 = ll3.a;
                        qs0 qs0VarH = ll3.h(el1.g(sx4Var3).a);
                        if (linkedHashSet.contains((qs0VarH != null ? zs3.b(qs0VarH) : z51.t(sx4Var3, qe4.A0)) + '.' + strY) ^ zContainsKey) {
                            zBooleanValue = true;
                        } else {
                            Boolean boolW = jb5.w(i21.K(q97Var2), pz2.X0, new ve7(this, (byte) 14));
                            boolW.getClass();
                            zBooleanValue = boolW.booleanValue();
                        }
                        if (!zBooleanValue) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (q97 q97Var3 : list) {
            ed1 ed1VarP3 = q97Var3.p();
            ed1VarP3.getClass();
            ho2 ho2VarG = q97Var3.g(new wi8(w79.q((sx4) ed1VarP3, sx4Var)));
            ho2VarG.getClass();
            go2 go2VarI1 = ((q97) ho2VarG).i0();
            go2VarI1.w(sx4Var);
            go2VarI1.f(sx4Var.p0());
            go2VarI1.g();
            ed1 ed1VarP4 = q97Var3.p();
            ed1VarP4.getClass();
            Object objP = jb5.p(i21.K((sx4) ed1VarP4), new vk1((Object) this, (byte) 19), new c91(w45.y(q97Var3, 3), new ea6(), (byte) 2));
            objP.getClass();
            int iOrdinal = ((ts3) objP).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        v15 name = q97Var3.getName();
                        boolean zF = dh3.f(name, vs3.a);
                        pe4 pe4Var2 = this.i0;
                        if (zF) {
                            smVar = (sm) pe4Var2.B(new qg5(q97Var3.getName().b(), "first"));
                        } else {
                            if (!dh3.f(name, vs3.b)) {
                                kp5.q(q97Var3.getName(), "Unexpected name: ");
                                return null;
                            }
                            smVar = (sm) pe4Var2.B(new qg5(q97Var3.getName().b(), "last"));
                        }
                        go2VarI1.n(smVar);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            b61.c();
                            return null;
                        }
                        q97Var = null;
                    } else {
                        go2VarI1.n((sm) hi5.e0(this.h0, nw3VarArr[2]));
                    }
                }
                ho2 ho2VarBuild2 = go2VarI1.build();
                ho2VarBuild2.getClass();
                q97Var = (q97) ho2VarBuild2;
            } else if (sx4Var.m() != fx4.Y || sx4Var.g0() == us0.Z) {
                go2VarI1.i();
                ho2 ho2VarBuild3 = go2VarI1.build();
                ho2VarBuild3.getClass();
                q97Var = (q97) ho2VarBuild3;
            } else {
                q97Var = null;
            }
            if (q97Var != null) {
                arrayList3.add(q97Var);
            }
        }
        return arrayList3;
    }
}
