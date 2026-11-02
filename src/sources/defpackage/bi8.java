package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bi8 {
    public static final bi8 a = new bi8();

    public static ArrayList a(AbstractCollection abstractCollection, rn2 rn2Var) {
        ArrayList<aa7> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            aa7 aa7Var = (aa7) it.next();
            if (!arrayList.isEmpty()) {
                for (aa7 aa7Var2 : arrayList) {
                    if (aa7Var2 != aa7Var) {
                        aa7Var2.getClass();
                        aa7Var.getClass();
                        if (((Boolean) rn2Var.K(aa7Var2, aa7Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [ch8] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ch8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17, types: [aa7] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [aa7, java.lang.Object, t14] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Set] */
    public final aa7 b(ArrayList arrayList) {
        aa7 aa7VarA;
        arrayList.size();
        ArrayList<aa7> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aa7 aa7Var = (aa7) it.next();
            if (aa7Var.n0() instanceof qg3) {
                Collection collectionC = aa7Var.n0().c();
                collectionC.getClass();
                Collection<t14> collection = collectionC;
                ArrayList arrayList3 = new ArrayList(xv0.Z(collection, 10));
                for (t14 t14Var : collection) {
                    t14Var.getClass();
                    aa7 aa7VarH0 = yn0.h0(t14Var);
                    if (aa7Var.o0()) {
                        aa7VarH0 = aa7VarH0.r0(true);
                    }
                    arrayList3.add(aa7VarH0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(aa7Var);
            }
        }
        Iterator it2 = arrayList2.iterator();
        ai8 ai8VarA = ai8.X;
        while (it2.hasNext()) {
            ai8VarA = ai8VarA.a((mo8) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (aa7 aa7VarR0 : arrayList2) {
            if (ai8VarA == ai8.f0) {
                if (aa7VarR0 instanceof c45) {
                    c45 c45Var = (c45) aa7VarR0;
                    aa7VarR0 = new c45(c45Var.Y, c45Var.Z, c45Var.f0, c45Var.g0, c45Var.h0, true);
                }
                aa7VarR0.getClass();
                aa7 aa7VarJ = ra.j(aa7VarR0, false);
                aa7VarR0 = (aa7VarJ == null && (aa7VarJ = jm4.S(aa7VarR0)) == null) ? aa7VarR0.r0(false) : aa7VarJ;
            }
            linkedHashSet.add(aa7VarR0);
        }
        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((aa7) it3.next()).m0());
        }
        Iterator it4 = arrayList4.iterator();
        aa7 aa7Var2 = null;
        if (!it4.hasNext()) {
            u52.k("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            ch8 ch8Var = (ch8) it4.next();
            next = (ch8) next;
            next.getClass();
            xd6 xd6Var = ch8.Y;
            ch8Var.getClass();
            if (!next.isEmpty() || !ch8Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) xd6Var.Y).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    wm wmVar = (wm) next.X.get(iIntValue);
                    wm wmVar2 = (wm) ch8Var.X.get(iIntValue);
                    if (wmVar != null) {
                        if (!dh3.f(wmVar2, wmVar)) {
                            wmVar = null;
                        }
                        wmVar2 = wmVar;
                    } else if (wmVar2 == null || !dh3.f(wmVar, wmVar2)) {
                        wmVar2 = null;
                    }
                    if (wmVar2 != null) {
                        arrayList5.add(wmVar2);
                    }
                }
                next = xd6.k(arrayList5);
            }
        }
        ch8 ch8Var2 = (ch8) next;
        if (linkedHashSet.size() == 1) {
            aa7VarA = (aa7) wv0.N0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new yn1(2, this, bi8.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, (byte) 10));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    u52.k("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    aa7 aa7Var3 = (aa7) it6.next();
                    next2 = (aa7) next2;
                    if (next2 != 0 && aa7Var3 != null) {
                        lh8 lh8VarN0 = next2.n0();
                        lh8 lh8VarN1 = aa7Var3.n0();
                        boolean z = lh8VarN0 instanceof sf3;
                        if (z && (lh8VarN1 instanceof sf3)) {
                            Set set = ((sf3) lh8VarN0).X;
                            Set set2 = ((sf3) lh8VarN1).X;
                            set.getClass();
                            set2.getClass();
                            Set setB1 = wv0.b1(set);
                            bw0.d0(setB1, set2);
                            sf3 sf3Var = new sf3(setB1);
                            ch8.Y.getClass();
                            ch8 ch8Var3 = ch8.Z;
                            ch8Var3.getClass();
                            next2 = dh3.O(u32.a(o32.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ch8Var3, sf3Var, d02.X, false);
                        } else if (z) {
                            if (((sf3) lh8VarN0).X.contains(aa7Var3)) {
                                next2 = aa7Var3;
                            }
                        } else if (!(lh8VarN1 instanceof sf3) || !((sf3) lh8VarN1).X.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                aa7Var2 = (aa7) next2;
            }
            if (aa7Var2 != null) {
                aa7VarA = aa7Var2;
            } else {
                p45.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new yn1(2, o45.b, q45.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, (byte) 11));
                arrayListA2.isEmpty();
                aa7VarA = arrayListA2.size() < 2 ? (aa7) wv0.N0(arrayListA2) : new qg3(linkedHashSet).a();
            }
        }
        return aa7VarA.t0(ch8Var2);
    }
}
