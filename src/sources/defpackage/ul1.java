package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends n0 {
    public final /* synthetic */ byte Z = 1;
    public final te4 f0;
    public final /* synthetic */ m0 g0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ul1(p44 p44Var) {
        this.g0 = p44Var;
        z47 z47Var = p44Var.l0;
        super((ve4) ((c6) z47Var.Y).f0);
        this.f0 = new te4((ve4) ((c6) z47Var.Y).f0, new o44(p44Var, (byte) 2));
    }

    @Override // defpackage.lh8
    public final boolean B() {
        switch (this.Z) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0262  */
    /* JADX WARN: Code duplicated, block: B:108:0x0267  */
    /* JADX WARN: Code duplicated, block: B:111:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x0287 A[LOOP:1: B:112:0x0281->B:114:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02af  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x0224  */
    /* JADX WARN: Code duplicated, block: B:93:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0086, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // defpackage.i3
    public final Collection a() {
        String strB;
        fk2 fk2VarA;
        ?? arrayList;
        String str;
        fk2 fk2Var;
        fk2 fk2Var2;
        ArrayList arrayList2;
        aa7 aa7VarM;
        Iterator it;
        sx4 sx4Var;
        t14 t14VarH;
        ArrayList arrayList3;
        va6 va6Var;
        t14 t14VarC;
        t14 t14Var;
        lh8 lh8VarN0;
        lh8 lh8VarN1;
        byte b = this.Z;
        m0 m0Var = this.g0;
        switch (b) {
            case 0:
                vl1 vl1Var = (vl1) m0Var;
                fy5 fy5Var = vl1Var.g0;
                jl1 jl1Var = vl1Var.n0;
                List listA0 = vr3.a0(fy5Var, (ux4) jl1Var.f0);
                ArrayList arrayList4 = new ArrayList(xv0.Z(listA0, 10));
                Iterator it2 = listA0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((fc8) jl1Var.j0).i((nz5) it2.next()));
                }
                ArrayList arrayListH0 = wv0.H0(arrayList4, ((hl1) jl1Var.X).n.k(vl1Var));
                ArrayList<e65> arrayList5 = new ArrayList();
                Iterator it3 = arrayListH0.iterator();
                while (it3.hasNext()) {
                    ot0 ot0VarX = ((t14) it3.next()).n0().x();
                    e65 e65Var = ot0VarX instanceof e65 ? (e65) ot0VarX : null;
                    if (e65Var != null) {
                        arrayList5.add(e65Var);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    l32 l32Var = ((hl1) jl1Var.X).h;
                    ArrayList arrayList6 = new ArrayList(xv0.Z(arrayList5, 10));
                    for (e65 e65Var2 : arrayList5) {
                        qs0 qs0VarF = el1.f(e65Var2);
                        if (qs0VarF == null || (fk2VarA = qs0VarF.a()) == null || (strB = fk2VarA.a.a) == null) {
                            strB = e65Var2.getName().b();
                            strB.getClass();
                        }
                        arrayList6.add(strB);
                    }
                    l32Var.t(vl1Var, arrayList6);
                }
                return wv0.Y0(arrayListH0);
            default:
                p44 p44Var = (p44) m0Var;
                z47 z47Var = p44Var.l0;
                Class cls = p44Var.j0.a;
                boolean zEquals = cls.equals(Object.class);
                d02 d02Var = d02.X;
                if (zEquals) {
                    arrayList = d02Var;
                } else {
                    ps psVar = new ps(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    psVar.b(genericSuperclass != null ? genericSuperclass : Object.class);
                    psVar.c(cls.getGenericInterfaces());
                    ArrayList arrayList7 = psVar.b;
                    List listL = i21.L(arrayList7.toArray(new Type[arrayList7.size()]));
                    arrayList = new ArrayList(xv0.Z(listL, 10));
                    Iterator it4 = listL.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new va6((Type) it4.next()));
                    }
                }
                ArrayList arrayList8 = new ArrayList(arrayList.size());
                ArrayList<gb6> arrayList9 = new ArrayList(0);
                n44 n44Var = p44Var.w0;
                fk2 fk2Var3 = ks3.p;
                fk2Var3.getClass();
                gm gmVarP = n44Var.p(fk2Var3);
                if (gmVarP != null) {
                    Object objP0 = wv0.P0(gmVarP.e().values());
                    bm7 bm7Var = objP0 instanceof bm7 ? (bm7) objP0 : null;
                    if (bm7Var != null && (str = (String) bm7Var.a) != null) {
                        int length = str.length();
                        ih7 ih7Var = ih7.X;
                        int i = 0;
                        while (true) {
                            ih7 ih7Var2 = ih7.Z;
                            if (i < length) {
                                char cCharAt = str.charAt(i);
                                int iOrdinal = ih7Var.ordinal();
                                if (iOrdinal == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        ih7Var = ih7.Y;
                                        i++;
                                    }
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        ih7Var = ih7.Y;
                                        i++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        ih7Var = ih7Var2;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i++;
                                }
                            } else {
                                fk2Var = ih7Var != ih7Var2 ? new fk2(str) : null;
                            }
                        }
                    }
                }
                if (fk2Var != null) {
                    gk2 gk2Var = fk2Var.a;
                    if (gk2Var.c()) {
                        fk2Var = null;
                    } else {
                        v15 v15Var = ug7.j;
                        v15Var.getClass();
                        if (!gk2Var.h(v15Var)) {
                            fk2Var = null;
                        }
                    }
                } else {
                    fk2Var = null;
                }
                rt8 rt8Var = rt8.INVARIANT;
                if (fk2Var == null) {
                    LinkedHashMap linkedHashMap = z72.a;
                    fk2Var2 = (fk2) z72.b.get(el1.g(p44Var));
                    if (fk2Var2 == null) {
                        aa7VarM = null;
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        va6Var = (va6) it.next();
                        t14VarC = ((f63) z47Var.g0).C(va6Var, pu.U(zi8.X, false, null, 7));
                        Object obj = z47Var.Y;
                        Iterator it5 = it;
                        t14Var = (t14) k32.e(t14VarC.q0(), new g97(null, false, z47Var, km.TYPE_USE, true).m(t14VarC, d02Var, null, false), 0, true).c;
                        if (t14Var == null) {
                            t14Var = t14VarC;
                        }
                        if (t14Var.n0().x() instanceof e65) {
                            arrayList9.add(va6Var);
                        }
                        lh8VarN0 = t14Var.n0();
                        if (aa7VarM != null) {
                            lh8VarN1 = aa7VarM.n0();
                        } else {
                            lh8VarN1 = null;
                        }
                        if (!dh3.f(lh8VarN0, lh8VarN1) && !zz3.y(t14Var)) {
                            arrayList8.add(t14Var);
                        }
                        it = it5;
                    }
                    sx4Var = p44Var.k0;
                    if (sx4Var != null) {
                        t14VarH = new wi8(w79.q(sx4Var, p44Var)).h(sx4Var.X(), rt8Var);
                    } else {
                        t14VarH = null;
                    }
                    if (t14VarH != null) {
                        arrayList8.add(t14VarH);
                    }
                    if (aa7VarM != null) {
                        arrayList8.add(aa7VarM);
                    }
                    if (!arrayList9.isEmpty()) {
                        return !arrayList8.isEmpty() ? wv0.Y0(arrayList8) : i21.K(((wx4) ((c6) z47Var.Y).n0).h0.e());
                    }
                    Object obj2 = z47Var.Y;
                    arrayList3 = new ArrayList(xv0.Z(arrayList9, 10));
                    for (gb6 gb6Var : arrayList9) {
                        gb6Var.getClass();
                        arrayList3.add(((va6) gb6Var).a.toString());
                    }
                    kp5.m("Incomplete hierarchy for class ", p44Var.getName(), ", unresolved classes ", arrayList3);
                    return null;
                }
                fk2Var2 = fk2Var;
                wx4 wx4Var = (wx4) ((c6) z47Var.Y).n0;
                int i2 = el1.a;
                gk2 gk2Var2 = fk2Var2.a;
                gk2Var2.c();
                ot0 ot0VarE = wx4Var.b0(fk2Var2.b()).k0.e(gk2Var2.g(), x45.j0);
                sx4 sx4Var2 = ot0VarE instanceof sx4 ? (sx4) ot0VarE : null;
                if (sx4Var2 == null) {
                    aa7VarM = null;
                } else {
                    int size = sx4Var2.l().g().size();
                    List listG = p44Var.r0.g();
                    listG.getClass();
                    int size2 = listG.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(xv0.Z(listG, 10));
                        Iterator it6 = listG.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(new wg7(((hi8) it6.next()).X(), rt8Var));
                        }
                    } else if (size2 == 1 && size > 1 && fk2Var == null) {
                        wg7 wg7Var = new wg7(((hi8) wv0.O0(listG)).X(), rt8Var);
                        kf3 kf3Var = new kf3(1, size, 1);
                        ArrayList arrayList10 = new ArrayList(xv0.Z(kf3Var, 10));
                        Iterator it7 = kf3Var.iterator();
                        while (true) {
                            jf3 jf3Var = (jf3) it7;
                            if (jf3Var.Z) {
                                jf3Var.nextInt();
                                arrayList10.add(wg7Var);
                            } else {
                                arrayList2 = arrayList10;
                            }
                        }
                    } else {
                        aa7VarM = null;
                    }
                    ch8.Y.getClass();
                    aa7VarM = dh3.M(ch8.Z, sx4Var2, arrayList2);
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    va6Var = (va6) it.next();
                    t14VarC = ((f63) z47Var.g0).C(va6Var, pu.U(zi8.X, false, null, 7));
                    Object obj3 = z47Var.Y;
                    Iterator it8 = it;
                    t14Var = (t14) k32.e(t14VarC.q0(), new g97(null, false, z47Var, km.TYPE_USE, true).m(t14VarC, d02Var, null, false), 0, true).c;
                    if (t14Var == null) {
                        t14Var = t14VarC;
                    }
                    if (t14Var.n0().x() instanceof e65) {
                        arrayList9.add(va6Var);
                    }
                    lh8VarN0 = t14Var.n0();
                    if (aa7VarM != null) {
                        lh8VarN1 = aa7VarM.n0();
                    } else {
                        lh8VarN1 = null;
                    }
                    if (!dh3.f(lh8VarN0, lh8VarN1)) {
                        arrayList8.add(t14Var);
                    }
                    it = it8;
                }
                sx4Var = p44Var.k0;
                if (sx4Var != null) {
                    t14VarH = new wi8(w79.q(sx4Var, p44Var)).h(sx4Var.X(), rt8Var);
                } else {
                    t14VarH = null;
                }
                if (t14VarH != null) {
                    arrayList8.add(t14VarH);
                }
                if (aa7VarM != null) {
                    arrayList8.add(aa7VarM);
                }
                if (!arrayList9.isEmpty()) {
                    if (!arrayList8.isEmpty()) {
                    }
                }
                Object obj4 = z47Var.Y;
                arrayList3 = new ArrayList(xv0.Z(arrayList9, 10));
                while (r2.hasNext()) {
                    gb6Var.getClass();
                    arrayList3.add(((va6) gb6Var).a.toString());
                }
                kp5.m("Incomplete hierarchy for class ", p44Var.getName(), ", unresolved classes ", arrayList3);
                return null;
        }
    }

    @Override // defpackage.i3
    public final lh4 d() {
        switch (this.Z) {
            case 0:
                break;
            default:
                Object obj = ((p44) this.g0).l0.Y;
                break;
        }
        return lh4.G0;
    }

    @Override // defpackage.lh8
    public final List g() {
        switch (this.Z) {
            case 0:
                break;
        }
        return (List) this.f0.invoke();
    }

    @Override // defpackage.n0
    /* JADX INFO: renamed from: k */
    public final sx4 x() {
        byte b = this.Z;
        m0 m0Var = this.g0;
        switch (b) {
            case 0:
                return (vl1) m0Var;
            default:
                return (p44) m0Var;
        }
    }

    public final String toString() {
        byte b = this.Z;
        m0 m0Var = this.g0;
        switch (b) {
            case 0:
                String str = ((vl1) m0Var).getName().X;
                str.getClass();
                return str;
            default:
                String strB = ((p44) m0Var).getName().b();
                strB.getClass();
                return strB;
        }
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        byte b = this.Z;
        m0 m0Var = this.g0;
        switch (b) {
            case 0:
                return (vl1) m0Var;
            default:
                return (p44) m0Var;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ul1(vl1 vl1Var) {
        this.g0 = vl1Var;
        jl1 jl1Var = vl1Var.n0;
        super(((hl1) jl1Var.X).a);
        ve4 ve4Var = ((hl1) jl1Var.X).a;
        ol1 ol1Var = new ol1(vl1Var, (byte) 6);
        ve4Var.getClass();
        this.f0 = new te4(ve4Var, ol1Var);
    }
}
