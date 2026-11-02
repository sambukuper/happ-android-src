package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pf5 {
    public final l37 a;
    public final ce1 b;
    public final dh8 c;
    public final al d;
    public final hz8 e;
    public final m85 f;
    public final boolean g;
    public final boolean h;
    public boolean i;
    public LinkedHashMap j;
    public List k;
    public o8 l;
    public LinkedList m;
    public LinkedList n;
    public LinkedList o;
    public LinkedList p;
    public LinkedList q;
    public LinkedList r;
    public LinkedHashMap s;
    public no3 t;

    public pf5(l37 l37Var, dh8 dh8Var, al alVar, ce1 ce1Var) {
        hz8 hz8Var;
        this.a = l37Var;
        this.c = dh8Var;
        this.d = alVar;
        this.h = it0.t(dh8Var.j0);
        if (l37Var.f(xp4.Z)) {
            this.g = true;
            this.f = l37Var.d();
        } else {
            this.g = false;
            this.f = z55.X;
        }
        Class cls = dh8Var.j0;
        if (it0.q(cls)) {
            hz8Var = hz8.i0;
        } else {
            long j = l37Var.X;
            long j2 = wp4.l0;
            long j3 = j & j2;
            hn3 hn3Var = hn3.X;
            hz8 hz8Var2 = hz8.h0;
            if (j3 != j2) {
                boolean zF = l37Var.f(xp4.h0);
                hn3 hn3Var2 = hn3.Z;
                if (!zF) {
                    hn3 hn3Var3 = hn3.Y;
                    hz8Var2 = new hz8(hn3Var3, hn3Var3, hn3Var, hn3Var, hn3Var2);
                }
                if (!l37Var.f(xp4.i0) && hz8Var2.X != hn3Var2) {
                    hz8Var2 = new hz8(hn3Var2, hz8Var2.Y, hz8Var2.Z, hz8Var2.f0, hz8Var2.g0);
                }
                if (!l37Var.f(xp4.j0) && hz8Var2.Y != hn3Var2) {
                    hz8 hz8Var3 = new hz8(hz8Var2.X, hn3Var2, hz8Var2.Z, hz8Var2.f0, hz8Var2.g0);
                    hn3Var2 = hn3Var2;
                    hz8Var2 = hz8Var3;
                }
                if (!l37Var.f(xp4.k0) && hz8Var2.Z != hn3Var2) {
                    hn3 hn3Var4 = hn3Var2;
                    hn3Var2 = hn3Var4;
                    hz8Var2 = new hz8(hz8Var2.X, hz8Var2.Y, hn3Var4, hz8Var2.f0, hz8Var2.g0);
                }
                if (!l37Var.f(xp4.g0) && hz8Var2.f0 != hn3Var2) {
                    hz8Var2 = new hz8(hz8Var2.X, hz8Var2.Y, hz8Var2.Z, hn3Var2, hz8Var2.g0);
                }
            }
            if (it0.t(cls) && l37Var.f(xp4.g0) && hz8Var2.f0 != hn3Var) {
                hz8 hz8Var4 = hz8Var2;
                hz8Var2 = new hz8(hz8Var4.X, hz8Var4.Y, hz8Var4.Z, hn3Var, hz8Var4.g0);
            }
            hz8Var = hz8Var2;
        }
        this.e = l37Var.d().b(alVar, hz8Var);
        this.b = ce1Var;
    }

    public static boolean g(LinkedList linkedList) {
        do {
            gl glVar = (gl) linkedList.get(0);
            gl glVar2 = (gl) linkedList.get(1);
            if (glVar instanceof el) {
                if (!(glVar2 instanceof hl)) {
                    return false;
                }
                linkedList.remove(0);
            } else {
                if (!(glVar instanceof hl) || !(glVar2 instanceof el)) {
                    return false;
                }
                linkedList.remove(1);
            }
        } while (linkedList.size() > 1);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    public final void a(o8 o8Var, List list, LinkedHashMap linkedHashMap, boolean z) {
        m85 m85Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qr5 qr5Var = (qr5) it.next();
            if (qr5Var.b) {
                it.remove();
                int iOrdinal = qr5Var.c.ordinal();
                boolean zA = false;
                l37 l37Var = this.a;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        zA = true;
                        break;
                    }
                    ul ulVar = qr5Var.a;
                    ulVar.G0();
                    qr5Var.b(l37Var);
                    int length = qr5Var.e.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            LinkedList linkedList = this.r;
                            if (linkedList != null && !linkedList.isEmpty()) {
                                break;
                            }
                            if (ulVar.G0() != 1) {
                                zA = qr5Var.a(l37Var);
                                break;
                            }
                            jx5 jx5Var = qr5Var.d[0];
                            if (jx5Var != null) {
                                rf5 rf5Var = (rf5) linkedHashMap.get(jx5Var.X);
                                if (rf5Var == null) {
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            m85Var = this.f;
                                            if (m85Var != null) {
                                                break;
                                            }
                                        } else {
                                            rf5 rf5Var2 = (rf5) it2.next();
                                            if (!rf5Var2.F() || rf5Var2.E() || (!rf5.A(rf5Var2.h0, jx5Var) && !rf5.A(rf5Var2.j0, jx5Var) && !rf5.A(rf5Var2.k0, jx5Var) && !rf5.A(rf5Var2.i0, jx5Var))) {
                                            }
                                        }
                                    }
                                } else if (!rf5Var.F() || rf5Var.E()) {
                                    m85Var = this.f;
                                    if (m85Var != null) {
                                        break;
                                    }
                                }
                            } else {
                                m85Var = this.f;
                                if (m85Var != null && m85Var.i(ulVar.F0(0)) != null) {
                                    break;
                                }
                                break;
                                break;
                            }
                        } else if (qr5Var.e[i] == null) {
                            i++;
                        }
                        zA = true;
                        break;
                    }
                }
                if (!zA) {
                    ArrayList arrayList = (ArrayList) o8Var.f0;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        o8Var.f0 = arrayList;
                    }
                    arrayList.add(qr5Var);
                } else if (!z) {
                    o8Var.c(l37Var, qr5Var, "explicit", true);
                }
            }
        }
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ul ulVar = (ul) it.next();
            arrayList.add(new qr5(ulVar, this.g ? this.f.d(this.a, ulVar) : null));
        }
        return arrayList;
    }

    public final void d(jj3 jj3Var, gl glVar) {
        if (jj3Var == null) {
            return;
        }
        Object obj = jj3Var.X;
        LinkedHashMap linkedHashMap = this.s;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.s = linkedHashMap;
        }
        gl glVar2 = (gl) linkedHashMap.put(obj, glVar);
        if (glVar2 == null || glVar2.getClass() != glVar.getClass()) {
            return;
        }
        j("Duplicate injectable value with id '%s' (of type %s)", obj, it0.e(obj));
        throw null;
    }

    public final rf5 e(LinkedHashMap linkedHashMap, jx5 jx5Var) {
        String str = jx5Var.X;
        rf5 rf5Var = (rf5) linkedHashMap.get(str);
        if (rf5Var != null) {
            return rf5Var;
        }
        rf5 rf5Var2 = new rf5(this.a, this.f, jx5Var, jx5Var);
        linkedHashMap.put(str, rf5Var2);
        return rf5Var2;
    }

    public final rf5 f(LinkedHashMap linkedHashMap, String str) {
        rf5 rf5Var = (rf5) linkedHashMap.get(str);
        if (rf5Var != null) {
            return rf5Var;
        }
        m85 m85Var = this.f;
        jx5 jx5VarA = jx5.a(str);
        rf5 rf5Var2 = new rf5(this.a, m85Var, jx5VarA, jx5VarA);
        linkedHashMap.put(str, rf5Var2);
        return rf5Var2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:6: B:65:0x0117->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178 A[LOOP:8: B:81:0x0172->B:83:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c4  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0102, please report this as an issue */
    public final void h(LinkedHashMap linkedHashMap) {
        int i;
        boolean z;
        gl glVar;
        LinkedHashMap linkedHashMap2;
        Collection<rf5> collectionValues;
        String strJ;
        TreeMap treeMap;
        Iterator it;
        rf5 rf5Var;
        Integer num;
        rf5 rf5Var2;
        m85 m85Var = this.f;
        al alVar = this.d;
        Boolean boolG = m85Var.G(alVar);
        l37 l37Var = this.a;
        boolean zF = boolG == null ? l37Var.f(xp4.v0) : boolG.booleanValue();
        Iterator it2 = linkedHashMap.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((rf5) it2.next()).i().Y != null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        boolean z2 = z && l37Var.f(xp4.y0);
        String[] strArrF = m85Var.F(alVar);
        if (zF || z || this.k != null || strArrF != null) {
            int size = linkedHashMap.size();
            Map treeMap2 = zF ? new TreeMap() : new LinkedHashMap(size + size);
            for (rf5 rf5Var3 : linkedHashMap.values()) {
                treeMap2.put(rf5Var3.j(), rf5Var3);
            }
            LinkedList linkedList = this.m;
            if (linkedList == null) {
                LinkedList linkedList2 = this.n;
                if (linkedList2 != null) {
                    glVar = (gl) linkedList2.getFirst();
                }
                linkedHashMap2 = new LinkedHashMap(size + size);
                if (strArrF != null) {
                    for (String strJ2 : strArrF) {
                        rf5Var2 = (rf5) treeMap2.remove(strJ2);
                        if (rf5Var2 == null) {
                            for (rf5 rf5Var4 : linkedHashMap.values()) {
                                if (strJ2.equals(rf5Var4.g0.X)) {
                                    strJ2 = rf5Var4.j();
                                    rf5Var2 = rf5Var4;
                                    break;
                                }
                            }
                        }
                        if (rf5Var2 != null) {
                            linkedHashMap2.put(strJ2, rf5Var2);
                        }
                    }
                }
                if (z2) {
                    treeMap = new TreeMap();
                    it = treeMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        rf5Var = (rf5) ((Map.Entry) it.next()).getValue();
                        num = rf5Var.i().Y;
                        if (num != null) {
                            treeMap.put(num, rf5Var);
                            it.remove();
                        }
                    }
                    for (rf5 rf5Var5 : treeMap.values()) {
                        linkedHashMap2.put(rf5Var5.j(), rf5Var5);
                    }
                }
                if (this.k != null && (!zF || l37Var.f(xp4.w0))) {
                    if (zF || l37Var.f(xp4.x0)) {
                        collectionValues = this.k;
                    } else {
                        TreeMap treeMap3 = new TreeMap();
                        for (rf5 rf5Var6 : this.k) {
                            if (rf5Var6 != null) {
                                treeMap3.put(rf5Var6.j(), rf5Var6);
                            }
                        }
                        collectionValues = treeMap3.values();
                    }
                    for (rf5 rf5Var7 : collectionValues) {
                        if (rf5Var7 == null) {
                            strJ = rf5Var7.j();
                            if (treeMap2.containsKey(strJ)) {
                                linkedHashMap2.put(strJ, rf5Var7);
                            }
                        }
                    }
                }
                linkedHashMap2.putAll(treeMap2);
                linkedHashMap.clear();
                linkedHashMap.putAll(linkedHashMap2);
            }
            glVar = (gl) linkedList.getFirst();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(treeMap2.size() * 2);
            rf5 rf5Var8 = null;
            for (rf5 rf5Var9 : treeMap2.values()) {
                jp jpVar = rf5Var9.h0;
                Member memberB0 = glVar.B0();
                while (true) {
                    if (jpVar == null) {
                        jp jpVar2 = rf5Var9.j0;
                        Member memberB1 = glVar.B0();
                        while (true) {
                            if (jpVar2 == null) {
                                linkedHashMap3.put(rf5Var9.j(), rf5Var9);
                                break;
                            } else if (((gl) jpVar2.g).B0() != memberB1) {
                                jpVar2 = (jp) jpVar2.b;
                            }
                        }
                    } else if (((gl) jpVar.g).B0() != memberB0) {
                        jpVar = (jp) jpVar.b;
                    }
                    rf5Var8 = rf5Var9;
                    break;
                }
            }
            if (rf5Var8 != null) {
                linkedHashMap3.put(rf5Var8.j(), rf5Var8);
            }
            treeMap2 = linkedHashMap3;
            linkedHashMap2 = new LinkedHashMap(size + size);
            if (strArrF != null) {
                while (i < r1) {
                    rf5Var2 = (rf5) treeMap2.remove(strJ2);
                    if (rf5Var2 == null) {
                        while (r10.hasNext()) {
                            if (strJ2.equals(rf5Var4.g0.X)) {
                                strJ2 = rf5Var4.j();
                                rf5Var2 = rf5Var4;
                                break;
                            }
                        }
                    }
                    if (rf5Var2 != null) {
                        linkedHashMap2.put(strJ2, rf5Var2);
                    }
                }
            }
            if (z2) {
                treeMap = new TreeMap();
                it = treeMap2.entrySet().iterator();
                while (it.hasNext()) {
                    rf5Var = (rf5) ((Map.Entry) it.next()).getValue();
                    num = rf5Var.i().Y;
                    if (num != null) {
                        treeMap.put(num, rf5Var);
                        it.remove();
                    }
                }
                while (r0.hasNext()) {
                    linkedHashMap2.put(rf5Var5.j(), rf5Var5);
                }
            }
            if (this.k != null) {
                if (zF) {
                    collectionValues = this.k;
                } else {
                    collectionValues = this.k;
                }
                while (r14.hasNext()) {
                    if (rf5Var7 == null) {
                        strJ = rf5Var7.j();
                        if (treeMap2.containsKey(strJ)) {
                            linkedHashMap2.put(strJ, rf5Var7);
                        }
                    }
                }
            }
            linkedHashMap2.putAll(treeMap2);
            linkedHashMap.clear();
            linkedHashMap.putAll(linkedHashMap2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:237:0x045b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0473  */
    /* JADX WARN: Code duplicated, block: B:253:0x0496  */
    /* JADX WARN: Code duplicated, block: B:272:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:274:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:276:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:277:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:289:0x0515  */
    /* JADX WARN: Code duplicated, block: B:292:0x0520  */
    /* JADX WARN: Code duplicated, block: B:294:0x052f  */
    /* JADX WARN: Code duplicated, block: B:298:0x053c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0544  */
    /* JADX WARN: Code duplicated, block: B:301:0x054b A[LOOP:6: B:293:0x052d->B:301:0x054b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x0557  */
    /* JADX WARN: Code duplicated, block: B:309:0x0566  */
    /* JADX WARN: Code duplicated, block: B:312:0x0571 A[LOOP:7: B:310:0x056b->B:312:0x0571, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:337:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:340:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:344:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:362:0x061b  */
    /* JADX WARN: Code duplicated, block: B:364:0x0625  */
    /* JADX WARN: Code duplicated, block: B:367:0x062c  */
    /* JADX WARN: Code duplicated, block: B:368:0x062e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0642  */
    /* JADX WARN: Code duplicated, block: B:376:0x0644  */
    /* JADX WARN: Code duplicated, block: B:390:0x066e  */
    /* JADX WARN: Code duplicated, block: B:396:0x0693  */
    /* JADX WARN: Code duplicated, block: B:401:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:402:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:404:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:406:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:407:0x06db  */
    /* JADX WARN: Code duplicated, block: B:414:0x0713  */
    /* JADX WARN: Code duplicated, block: B:416:0x0717  */
    /* JADX WARN: Code duplicated, block: B:418:0x0723  */
    /* JADX WARN: Code duplicated, block: B:419:0x0728  */
    /* JADX WARN: Code duplicated, block: B:421:0x072e  */
    /* JADX WARN: Code duplicated, block: B:422:0x0731  */
    /* JADX WARN: Code duplicated, block: B:541:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:775:0x0469 A[EDGE_INSN: B:775:0x0469->B:240:0x0469 BREAK  A[LOOP:2: B:235:0x0453->B:777:0x0453], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x0537 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x068d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v57, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        hz8 hz8Var;
        m85 m85Var;
        boolean z;
        Class cls;
        jj3 jj3VarI;
        jp jpVar;
        jp jpVar2;
        mq3 mq3VarR;
        mq3 mq3VarR2;
        boolean z2;
        String str;
        int length;
        qr5 qr5Var;
        Iterator it;
        boolean zHasNext;
        nn3 nn3Var;
        Iterator it2;
        Class cls2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        qr5 qr5Var2;
        ul ulVar;
        ArrayList arrayList;
        int iG0;
        int i;
        ll llVarF0;
        jx5 jx5Var;
        jx5 jx5VarA;
        boolean z3;
        rf5 rf5VarE;
        jx5 jx5Var2;
        rf5 rf5VarE2;
        ul ulVar2;
        ul ulVar3;
        ArrayList arrayList2;
        qr5 qr5Var3;
        ul ulVar4;
        ?? r9;
        jx5 jx5Var3;
        Object obj;
        rf5 rf5Var;
        int iOrdinal;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LinkedList linkedList;
        Iterator it6;
        List arrayList5;
        Iterator it7;
        qr5 qr5Var4;
        int length2;
        int i2;
        Iterator it8;
        boolean z4;
        boolean z5;
        Iterator it9;
        ul ulVar5;
        Class clsI0;
        zz2[] zz2VarArr;
        int i3;
        cl clVar;
        boolean z6;
        String strC;
        jx5 jx5Var4;
        boolean z7;
        boolean z8;
        rf5 rf5Var2;
        boolean zA;
        String strB;
        boolean zA2;
        boolean z9;
        boolean z10;
        al alVar = this.d;
        Class cls3 = alVar.C0;
        this.l = new o8((byte) 7);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xp4 xp4Var = xp4.f0;
        l37 l37Var = this.a;
        boolean zF = l37Var.f(xp4Var);
        Iterator it10 = alVar.A0().iterator();
        while (true) {
            boolean zHasNext2 = it10.hasNext();
            hz8Var = this.e;
            m85Var = this.f;
            if (!zHasNext2) {
                break;
            }
            el elVar = (el) it10.next();
            Boolean bool = Boolean.TRUE;
            if (bool.equals(m85Var.R(elVar))) {
                LinkedList linkedList2 = this.q;
                if (linkedList2 == null) {
                    linkedList2 = new LinkedList();
                    this.q = linkedList2;
                }
                linkedList2.add(elVar);
            }
            if (bool.equals(m85Var.S(elVar))) {
                LinkedList linkedList3 = this.r;
                if (linkedList3 == null) {
                    linkedList3 = new LinkedList();
                    this.r = linkedList3;
                }
                linkedList3.add(elVar);
            } else {
                boolean zEquals = bool.equals(m85Var.O(elVar));
                boolean zEquals2 = bool.equals(m85Var.Q(elVar));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        LinkedList linkedList4 = this.n;
                        if (linkedList4 == null) {
                            linkedList4 = new LinkedList();
                            this.n = linkedList4;
                        }
                        linkedList4.add(elVar);
                    }
                    if (zEquals2) {
                        LinkedList linkedList5 = this.p;
                        if (linkedList5 == null) {
                            linkedList5 = new LinkedList();
                            this.p = linkedList5;
                        }
                        linkedList5.add(elVar);
                    }
                }
                String name = elVar.D0.getName();
                if (name != null) {
                    jx5.b(name, null);
                    jx5 jx5VarM = m85Var.m(elVar);
                    boolean z11 = jx5VarM != null;
                    if (z11 && jx5VarM.c()) {
                        jx5VarM = jx5.b(name, null);
                        z9 = false;
                    } else {
                        z9 = z11;
                    }
                    jx5 jx5Var5 = jx5VarM;
                    boolean zA3 = jx5Var5 != null;
                    if (!zA3) {
                        hz8Var.getClass();
                        zA3 = hz8Var.g0.a(elVar.D0);
                    }
                    boolean z12 = zA3;
                    boolean zU = m85Var.U(elVar);
                    if (Modifier.isTransient(elVar.D0.getModifiers()) && !z11) {
                        if (zF) {
                            z10 = true;
                            rf5 rf5VarF = f(linkedHashMap, name);
                            rf5VarF.h0 = new jp(elVar, rf5VarF.h0, jx5Var5, z9, z12, z10);
                        } else if (!zU) {
                        }
                    }
                    z10 = zU;
                    rf5 rf5VarF2 = f(linkedHashMap, name);
                    rf5VarF2.h0 = new jp(elVar, rf5VarF2.h0, jx5Var5, z9, z12, z10);
                }
            }
        }
        Iterator it11 = alVar.B0().iterator();
        while (true) {
            boolean zHasNext3 = it11.hasNext();
            z = this.h;
            if (!zHasNext3) {
                break;
            }
            hl hlVar = (hl) it11.next();
            int iG1 = hlVar.G0();
            Method method = hlVar.E0;
            ce1 ce1Var = this.b;
            if (iG1 == 0) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Void.TYPE && (returnType != Void.class || l37Var.f(xp4.p0))) {
                    Boolean bool2 = Boolean.TRUE;
                    if (bool2.equals(m85Var.O(hlVar))) {
                        LinkedList linkedList6 = this.m;
                        if (linkedList6 == null) {
                            linkedList6 = new LinkedList();
                            this.m = linkedList6;
                        }
                        linkedList6.add(hlVar);
                    } else if (bool2.equals(m85Var.R(hlVar))) {
                        LinkedList linkedList7 = this.q;
                        if (linkedList7 == null) {
                            linkedList7 = new LinkedList();
                            this.q = linkedList7;
                        }
                        linkedList7.add(hlVar);
                    } else if (bool2.equals(m85Var.S(hlVar))) {
                        LinkedList linkedList8 = this.r;
                        if (linkedList8 == null) {
                            linkedList8 = new LinkedList();
                            this.r = linkedList8;
                        }
                        linkedList8.add(hlVar);
                    }
                    jx5 jx5VarM2 = m85Var.m(hlVar);
                    boolean z13 = jx5VarM2 != null;
                    if (z13) {
                        strC = ce1Var.c(hlVar, method.getName());
                        if (strC == null) {
                            strC = ce1Var.a(hlVar, method.getName());
                        }
                        if (strC == null) {
                            strC = method.getName();
                        }
                        if (jx5VarM2.c()) {
                            jx5VarM2 = jx5.b(strC, null);
                            z13 = false;
                        }
                        jx5Var4 = jx5VarM2;
                        z7 = z13;
                        z8 = true;
                    } else {
                        strC = ce1Var.c(hlVar, method.getName());
                        if (strC == null) {
                            strC = ce1Var.a(hlVar, method.getName());
                            if (strC != null) {
                                hz8Var.getClass();
                                zA = hz8Var.Y.a(method);
                            }
                        } else {
                            hz8Var.getClass();
                            zA = hz8Var.X.a(method);
                        }
                        jx5Var4 = jx5VarM2;
                        z7 = z13;
                        z8 = zA;
                    }
                    String strB2 = b(strC);
                    boolean zU2 = m85Var.U(hlVar);
                    if (!z || z7 || !zU2 || strB2.equals(method.getName()) || (rf5Var2 = (rf5) linkedHashMap.get(strB2)) == null || rf5Var2.h0 == null) {
                        rf5 rf5VarF3 = f(linkedHashMap, strB2);
                        rf5VarF3.j0 = new jp(hlVar, rf5VarF3.j0, jx5Var4, z7, z8, zU2);
                    }
                }
            } else if (iG1 == 1) {
                jx5 jx5VarL = m85Var.l(hlVar);
                boolean z14 = jx5VarL != null;
                if (z14) {
                    strB = ce1Var.b(method.getName());
                    if (strB == null) {
                        strB = method.getName();
                    }
                    if (jx5VarL.c()) {
                        jx5VarL = jx5.b(strB, null);
                        z14 = false;
                    }
                    zA2 = true;
                } else {
                    strB = ce1Var.b(method.getName());
                    if (strB != null) {
                        hz8Var.getClass();
                        zA2 = hz8Var.Z.a(method);
                    }
                }
                jx5 jx5Var6 = jx5VarL;
                boolean z15 = z14;
                String strB3 = b(strB);
                boolean zU3 = m85Var.U(hlVar);
                rf5 rf5VarF4 = f(linkedHashMap, strB3);
                rf5VarF4.k0 = new jp(hlVar, rf5VarF4.k0, jx5Var6, z15, zA2, zU3);
            } else if (iG1 == 2 && Boolean.TRUE.equals(m85Var.Q(hlVar))) {
                LinkedList linkedList9 = this.o;
                if (linkedList9 == null) {
                    linkedList9 = new LinkedList();
                    this.o = linkedList9;
                }
                linkedList9.add(hlVar);
            }
        }
        Boolean boolValueOf = alVar.O0;
        if (boolValueOf == null) {
            Annotation[] annotationArr = it0.a;
            if (Modifier.isStatic(cls3.getModifiers())) {
                z6 = false;
            } else if ((it0.s(cls3) ? null : cls3.getEnclosingClass()) != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolValueOf = Boolean.valueOf(z6);
            alVar.O0 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            o8 o8Var = this.l;
            List listC = c((List) alVar.z0().Z);
            List listC2 = c((List) alVar.z0().f0);
            cl clVar2 = (cl) alVar.z0().Y;
            boolean z16 = this.g;
            qr5 qr5Var5 = clVar2 == null ? null : new qr5(clVar2, z16 ? m85Var.d(l37Var, clVar2) : null);
            if (z) {
                RuntimeException runtimeException = aj3.e;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                aj3 aj3Var = aj3.d;
                Object[] objArrA = aj3Var.a(cls3);
                if (objArrA == null) {
                    zz2VarArr = null;
                } else {
                    zz2VarArr = new zz2[objArrA.length];
                    int i4 = 0;
                    while (i4 < objArrA.length) {
                        try {
                            zz2[] zz2VarArr2 = zz2VarArr;
                            i3 = i4;
                            try {
                                try {
                                    aj3 aj3Var2 = aj3Var;
                                    zz2VarArr2[i3] = new zz2((Class) aj3Var.c.invoke(objArrA[i3], null), (String) aj3Var.b.invoke(objArrA[i4], null), (byte) 4);
                                    i4 = i3 + 1;
                                    zz2VarArr = zz2VarArr2;
                                    aj3Var = aj3Var2;
                                } catch (Exception e) {
                                    throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i3), Integer.valueOf(objArrA.length), it0.u(cls3)), e);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i3), Integer.valueOf(objArrA.length), it0.u(cls3)), e);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i3 = i4;
                        }
                    }
                }
                if (zz2VarArr != null) {
                    int length3 = zz2VarArr.length;
                    if (length3 != 0 || (clVar = (cl) alVar.z0().Y) == null) {
                        Iterator it12 = listC.iterator();
                        loop11: while (true) {
                            if (!it12.hasNext()) {
                                bt.q("Failed to find the canonical Record constructor of type ".concat(it0.n(alVar.B0)));
                                return;
                            }
                            qr5Var = (qr5) it12.next();
                            ul ulVar6 = qr5Var.a;
                            zz2VarArr = zz2VarArr;
                            if (ulVar6.G0() == length3) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length3) {
                                        jx5[] jx5VarArr = new jx5[length3];
                                        int i6 = 0;
                                        while (i6 < length3) {
                                            jx5VarArr[i6] = jx5.a((String) zz2VarArr[i6].Z);
                                            i6++;
                                            length3 = length3;
                                        }
                                        if (qr5Var.d != null) {
                                            break loop11;
                                        }
                                        int iG2 = ulVar6.G0();
                                        if (iG2 != 0) {
                                            qr5Var.e = new jx5[iG2];
                                            qr5Var.d = jx5VarArr;
                                            m85 m85VarD = l37Var.d();
                                            int i7 = 0;
                                            while (i7 < iG2) {
                                                int i8 = iG2;
                                                jx5 jx5VarL2 = m85VarD.l(ulVar6.F0(i7));
                                                if (jx5VarL2 != null && !jx5VarL2.c()) {
                                                    qr5Var.e[i7] = jx5VarL2;
                                                }
                                                i7++;
                                                iG2 = i8;
                                            }
                                            break loop11;
                                        }
                                        jx5[] jx5VarArr2 = qr5.f;
                                        qr5Var.e = jx5VarArr2;
                                        qr5Var.d = jx5VarArr2;
                                        break loop11;
                                    }
                                    Iterator it13 = it12;
                                    int i9 = i5;
                                    if (!ulVar6.I0(i5).equals((Class) zz2VarArr[i9].Y)) {
                                        it12 = it13;
                                        break;
                                    } else {
                                        i5 = i9 + 1;
                                        it12 = it13;
                                    }
                                }
                            }
                        }
                    } else {
                        qr5Var = new qr5(clVar, null);
                    }
                }
                it = listC.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    nn3Var = nn3.Y;
                    if (zHasNext) {
                        break;
                    } else if (((qr5) it.next()).c == nn3Var) {
                        it.remove();
                    }
                }
                it2 = listC2.iterator();
                while (it2.hasNext()) {
                    if (((qr5) it2.next()).c == nn3Var) {
                        it2.remove();
                    }
                }
                if (qr5Var5 != null && qr5Var5.c == nn3Var) {
                    qr5Var5 = null;
                }
                cls2 = this.c.j0;
                it3 = listC2.iterator();
                while (it3.hasNext()) {
                    qr5 qr5Var6 = (qr5) it3.next();
                    z5 = qr5Var6.b;
                    it9 = it3;
                    ulVar5 = qr5Var6.a;
                    if (!z5 && qr5Var != qr5Var6) {
                        if (cls2.isAssignableFrom(ulVar5.N()) || ulVar5.G0() != 1) {
                            it9.remove();
                        } else {
                            String strL = ulVar5.L();
                            if (!"valueOf".equals(strL) && (!"fromString".equals(strL) || ((clsI0 = ulVar5.I0(0)) != String.class && !CharSequence.class.isAssignableFrom(clsI0)))) {
                                it9.remove();
                            }
                        }
                    }
                    it3 = it9;
                }
                if (z16) {
                    a(o8Var, listC, linkedHashMap, false);
                    if (((qr5) o8Var.Z) != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a(o8Var, listC2, linkedHashMap, z4);
                    if (qr5Var5 != null && qr5Var5.b && ((qr5) o8Var.Z) == null) {
                        o8Var.c(l37Var, qr5Var5, "explicit", true);
                    }
                }
                if (((qr5) o8Var.Z) == null) {
                    it6 = listC.iterator();
                    arrayList5 = null;
                    while (it6.hasNext()) {
                        qr5Var4 = (qr5) it6.next();
                        qr5Var4.b(l37Var);
                        length2 = qr5Var4.e.length;
                        i2 = 0;
                        while (i2 < length2) {
                            it8 = it6;
                            if (qr5Var4.e[i2] != null) {
                                it8.remove();
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList(4);
                                }
                                arrayList5.add(qr5Var4);
                                it6 = it8;
                                break;
                            }
                            i2++;
                            it6 = it8;
                        }
                    }
                    if (arrayList5 == null) {
                        arrayList5 = Collections.EMPTY_LIST;
                    }
                    if (qr5Var == null && arrayList5.contains(qr5Var)) {
                        o8Var.c(l37Var, qr5Var, "implicit", false);
                    } else {
                        it7 = arrayList5.iterator();
                        while (it7.hasNext()) {
                            o8Var.c(l37Var, (qr5) it7.next(), "implicit", false);
                        }
                    }
                }
                if (qr5Var != null && (listC.remove(qr5Var) || listC2.remove(qr5Var))) {
                    iOrdinal = qr5Var.c.ordinal();
                    if (iOrdinal != 1 || (iOrdinal != 2 && iOrdinal != 3 && qr5Var.a.G0() == 1 && (linkedList = this.r) != null && !linkedList.isEmpty())) {
                        arrayList3 = (ArrayList) o8Var.f0;
                        if ((arrayList3 != null || arrayList3.isEmpty()) && !o8Var.Y) {
                            arrayList4 = (ArrayList) o8Var.f0;
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                o8Var.f0 = arrayList4;
                            }
                            arrayList4.add(qr5Var);
                        }
                    } else if (((qr5) o8Var.Z) == null) {
                        o8Var.c(l37Var, qr5Var, "primary", false);
                    }
                }
                if (((qr5) o8Var.Z) == null && (((arrayList2 = (ArrayList) o8Var.f0) == null || arrayList2.isEmpty()) && ((cl) alVar.z0().Y) == null && listC.size() == 1)) {
                    qr5Var3 = (qr5) listC.get(0);
                    ulVar4 = qr5Var3.a;
                    hz8Var.getClass();
                    if (hz8Var.f0.a(ulVar4.B0())) {
                        qr5Var3.b(l37Var);
                        if (ulVar4.G0() != 1) {
                            r9 = 0;
                            if (m85Var != null || m85Var.i(ulVar4.F0(0)) == null) {
                                jx5Var3 = qr5Var3.d[0];
                                if (jx5Var3 == null) {
                                    obj = null;
                                } else {
                                    obj = jx5Var3.X;
                                }
                                if (obj != null && (rf5Var = (rf5) linkedHashMap.get(obj)) != null && rf5Var.F() && !rf5Var.E()) {
                                    r9 = 0;
                                    listC.remove((int) r9);
                                    o8Var.c(l37Var, qr5Var3, "implicit", r9);
                                }
                            } else {
                                listC.remove((int) r9);
                                o8Var.c(l37Var, qr5Var3, "implicit", r9);
                            }
                        } else if (!qr5Var3.a(l37Var)) {
                            r9 = 0;
                            listC.remove((int) r9);
                            o8Var.c(l37Var, qr5Var3, "implicit", r9);
                        }
                    }
                }
                it4 = listC.iterator();
                while (it4.hasNext()) {
                    ulVar3 = ((qr5) it4.next()).a;
                    hz8Var.getClass();
                    if (!hz8Var.f0.a(ulVar3.B0())) {
                        it4.remove();
                    }
                }
                it5 = listC2.iterator();
                while (it5.hasNext()) {
                    ulVar2 = ((qr5) it5.next()).a;
                    hz8Var.getClass();
                    if (!hz8Var.f0.a(ulVar2.B0())) {
                        it5.remove();
                    }
                }
                qr5Var2 = (qr5) o8Var.Z;
                if (qr5Var2 == null) {
                    this.k = Collections.EMPTY_LIST;
                } else {
                    ulVar = qr5Var2.a;
                    arrayList = new ArrayList();
                    this.k = arrayList;
                    iG0 = ulVar.G0();
                    for (i = 0; i < iG0; i++) {
                        llVarF0 = ulVar.F0(i);
                        jx5Var = qr5Var2.e[i];
                        jx5VarA = qr5Var2.d[i];
                        if (jx5Var != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 || jx5VarA != null) {
                            if (jx5VarA != null) {
                                jx5VarA = jx5.a(b(jx5VarA.X));
                            }
                            if (jx5VarA == null) {
                                rf5VarE = e(linkedHashMap, jx5Var);
                            } else {
                                rf5VarE = e(linkedHashMap, jx5VarA);
                            }
                            if (z3) {
                                jx5Var2 = jx5Var;
                            } else {
                                jx5Var2 = jx5VarA;
                            }
                            rf5VarE.i0 = new jp(llVarF0, rf5VarE.i0, jx5Var2, z3, true, false);
                            rf5VarE2 = rf5VarE;
                        } else if (m85Var.M(llVarF0) != null) {
                            jx5 jx5Var7 = new jx5(pc6.j(llVarF0.F0, "@JsonUnwrapped/"), null);
                            rf5VarE2 = e(linkedHashMap, jx5Var7);
                            rf5VarE2.i0 = new jp(llVarF0, rf5VarE2.i0, jx5Var7, false, true, false);
                        } else {
                            rf5VarE2 = null;
                        }
                        arrayList.add(rf5VarE2);
                    }
                }
            } else {
                m85Var.getClass();
            }
            qr5Var = null;
            it = listC.iterator();
            while (true) {
                zHasNext = it.hasNext();
                nn3Var = nn3.Y;
                if (zHasNext) {
                    break;
                    break;
                } else if (((qr5) it.next()).c == nn3Var) {
                    it.remove();
                }
            }
            it2 = listC2.iterator();
            while (it2.hasNext()) {
                if (((qr5) it2.next()).c == nn3Var) {
                    it2.remove();
                }
            }
            if (qr5Var5 != null) {
                qr5Var5 = null;
            }
            cls2 = this.c.j0;
            it3 = listC2.iterator();
            while (it3.hasNext()) {
                qr5 qr5Var7 = (qr5) it3.next();
                z5 = qr5Var7.b;
                it9 = it3;
                ulVar5 = qr5Var7.a;
                if (!z5) {
                    if (cls2.isAssignableFrom(ulVar5.N())) {
                        it9.remove();
                    } else {
                        it9.remove();
                    }
                }
                it3 = it9;
            }
            if (z16) {
                a(o8Var, listC, linkedHashMap, false);
                if (((qr5) o8Var.Z) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                a(o8Var, listC2, linkedHashMap, z4);
                if (qr5Var5 != null) {
                    o8Var.c(l37Var, qr5Var5, "explicit", true);
                }
            }
            if (((qr5) o8Var.Z) == null) {
                it6 = listC.iterator();
                arrayList5 = null;
                while (it6.hasNext()) {
                    qr5Var4 = (qr5) it6.next();
                    qr5Var4.b(l37Var);
                    length2 = qr5Var4.e.length;
                    i2 = 0;
                    while (i2 < length2) {
                        it8 = it6;
                        if (qr5Var4.e[i2] != null) {
                            it8.remove();
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList(4);
                            }
                            arrayList5.add(qr5Var4);
                            it6 = it8;
                            break;
                            break;
                        }
                        i2++;
                        it6 = it8;
                    }
                }
                if (arrayList5 == null) {
                    arrayList5 = Collections.EMPTY_LIST;
                }
                if (qr5Var == null) {
                    it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        o8Var.c(l37Var, (qr5) it7.next(), "implicit", false);
                    }
                } else {
                    it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        o8Var.c(l37Var, (qr5) it7.next(), "implicit", false);
                    }
                }
            }
            if (qr5Var != null) {
                iOrdinal = qr5Var.c.ordinal();
                if (iOrdinal != 1) {
                    arrayList3 = (ArrayList) o8Var.f0;
                    if (arrayList3 != null) {
                        arrayList4 = (ArrayList) o8Var.f0;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            o8Var.f0 = arrayList4;
                        }
                        arrayList4.add(qr5Var);
                    } else {
                        arrayList4 = (ArrayList) o8Var.f0;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            o8Var.f0 = arrayList4;
                        }
                        arrayList4.add(qr5Var);
                    }
                } else {
                    arrayList3 = (ArrayList) o8Var.f0;
                    if (arrayList3 != null) {
                        arrayList4 = (ArrayList) o8Var.f0;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            o8Var.f0 = arrayList4;
                        }
                        arrayList4.add(qr5Var);
                    } else {
                        arrayList4 = (ArrayList) o8Var.f0;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            o8Var.f0 = arrayList4;
                        }
                        arrayList4.add(qr5Var);
                    }
                }
            }
            if (((qr5) o8Var.Z) == null) {
                qr5Var3 = (qr5) listC.get(0);
                ulVar4 = qr5Var3.a;
                hz8Var.getClass();
                if (hz8Var.f0.a(ulVar4.B0())) {
                    qr5Var3.b(l37Var);
                    if (ulVar4.G0() != 1) {
                        r9 = 0;
                        if (m85Var != null) {
                        }
                        jx5Var3 = qr5Var3.d[0];
                        if (jx5Var3 == null) {
                            obj = null;
                        } else {
                            obj = jx5Var3.X;
                        }
                        if (obj != null) {
                            r9 = 0;
                            listC.remove((int) r9);
                            o8Var.c(l37Var, qr5Var3, "implicit", r9);
                        }
                    } else if (!qr5Var3.a(l37Var)) {
                        r9 = 0;
                        listC.remove((int) r9);
                        o8Var.c(l37Var, qr5Var3, "implicit", r9);
                    }
                }
            }
            it4 = listC.iterator();
            while (it4.hasNext()) {
                ulVar3 = ((qr5) it4.next()).a;
                hz8Var.getClass();
                if (!hz8Var.f0.a(ulVar3.B0())) {
                    it4.remove();
                }
            }
            it5 = listC2.iterator();
            while (it5.hasNext()) {
                ulVar2 = ((qr5) it5.next()).a;
                hz8Var.getClass();
                if (!hz8Var.f0.a(ulVar2.B0())) {
                    it5.remove();
                }
            }
            qr5Var2 = (qr5) o8Var.Z;
            if (qr5Var2 == null) {
                this.k = Collections.EMPTY_LIST;
            } else {
                ulVar = qr5Var2.a;
                arrayList = new ArrayList();
                this.k = arrayList;
                iG0 = ulVar.G0();
                while (i < iG0) {
                    llVarF0 = ulVar.F0(i);
                    jx5Var = qr5Var2.e[i];
                    jx5VarA = qr5Var2.d[i];
                    if (jx5Var != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        if (jx5VarA != null) {
                            jx5VarA = jx5.a(b(jx5VarA.X));
                        }
                        if (jx5VarA == null) {
                            rf5VarE = e(linkedHashMap, jx5Var);
                        } else {
                            rf5VarE = e(linkedHashMap, jx5VarA);
                        }
                        if (z3) {
                            jx5Var2 = jx5Var;
                        } else {
                            jx5Var2 = jx5VarA;
                        }
                        rf5VarE.i0 = new jp(llVarF0, rf5VarE.i0, jx5Var2, z3, true, false);
                        rf5VarE2 = rf5VarE;
                    } else {
                        if (jx5VarA != null) {
                            jx5VarA = jx5.a(b(jx5VarA.X));
                        }
                        if (jx5VarA == null) {
                            rf5VarE = e(linkedHashMap, jx5Var);
                        } else {
                            rf5VarE = e(linkedHashMap, jx5VarA);
                        }
                        if (z3) {
                            jx5Var2 = jx5Var;
                        } else {
                            jx5Var2 = jx5VarA;
                        }
                        rf5VarE.i0 = new jp(llVarF0, rf5VarE.i0, jx5Var2, z3, true, false);
                        rf5VarE2 = rf5VarE;
                    }
                    arrayList.add(rf5VarE2);
                }
            }
        }
        if (l37Var.f(xp4.C0)) {
            HashMap map = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                rf5 rf5Var3 = (rf5) entry.getValue();
                if (!(rf5.q(rf5Var3.h0) || rf5.q(rf5Var3.j0) || rf5.q(rf5Var3.k0) || rf5.q(rf5Var3.i0))) {
                    if (rf5Var3.h0 == null) {
                        if (rf5Var3.i0 != null) {
                        }
                    }
                    if (!(rf5Var3.j0 != null)) {
                        if (!(rf5Var3.k0 != null) && (length = (str = (String) entry.getKey()).length()) != 0 && ((length != 1 && !Character.isLowerCase(str.charAt(1))) || !Character.isLowerCase(str.charAt(0)))) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(entry.getKey(), rf5Var3);
                        }
                    }
                }
            }
            if (map != null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    Iterator it14 = linkedHashMap.entrySet().iterator();
                    rf5 rf5Var4 = (rf5) entry2.getValue();
                    String str2 = (String) entry2.getKey();
                    while (it14.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it14.next();
                        rf5 rf5Var5 = (rf5) entry3.getValue();
                        if (rf5Var5 != rf5Var4 && rf5Var5.h0 == null && str2.equalsIgnoreCase((String) entry3.getKey())) {
                            it14.remove();
                            rf5Var4.D(rf5Var5);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it15 = linkedHashMap.values().iterator();
        while (it15.hasNext()) {
            rf5 rf5Var6 = (rf5) it15.next();
            if (!rf5Var6.F()) {
                it15.remove();
            } else if (rf5Var6.E()) {
                if (rf5.s(rf5Var6.h0) || rf5.s(rf5Var6.j0) || rf5.s(rf5Var6.k0)) {
                    z2 = true;
                    break;
                }
                jp jpVar3 = rf5Var6.i0;
                while (true) {
                    if (jpVar3 == null) {
                        z2 = false;
                        break;
                    } else {
                        if (!jpVar3.f && ((jx5) jpVar3.c) != null && jpVar3.d) {
                            z2 = true;
                            break;
                        }
                        jpVar3 = (jp) jpVar3.b;
                    }
                }
                if (z2) {
                    jp jpVarG = rf5Var6.h0;
                    if (jpVarG != null) {
                        jpVarG = jpVarG.g();
                    }
                    rf5Var6.h0 = jpVarG;
                    jp jpVarG2 = rf5Var6.j0;
                    if (jpVarG2 != null) {
                        jpVarG2 = jpVarG2.g();
                    }
                    rf5Var6.j0 = jpVarG2;
                    jp jpVarG3 = rf5Var6.k0;
                    if (jpVarG3 != null) {
                        jpVarG3 = jpVarG3.g();
                    }
                    rf5Var6.k0 = jpVarG3;
                    jp jpVarG4 = rf5Var6.i0;
                    if (jpVarG4 != null) {
                        jpVarG4 = jpVarG4.g();
                    }
                    rf5Var6.i0 = jpVarG4;
                    if (!rf5Var6.a()) {
                        rf5Var6.j();
                    }
                } else {
                    it15.remove();
                    rf5Var6.j();
                }
            }
        }
        boolean zF2 = l37Var.f(xp4.m0);
        for (rf5 rf5Var7 : linkedHashMap.values()) {
            rf5Var7.getClass();
            m85 m85Var2 = rf5Var7.Z;
            mq3 mq3Var = mq3.X;
            if (m85Var2 != null) {
                jp jpVar4 = rf5Var7.j0;
                if ((jpVar4 == null || (mq3VarR2 = m85Var2.r((gl) jpVar4.g)) == null || mq3VarR2 == mq3Var) && (((jpVar = rf5Var7.h0) == null || (mq3VarR2 = m85Var2.r((gl) jpVar.g)) == null || mq3VarR2 == mq3Var) && ((jpVar2 = rf5Var7.i0) == null || (mq3VarR2 = m85Var2.r((gl) jpVar2.g)) == null || mq3VarR2 == mq3Var))) {
                    jp jpVar5 = rf5Var7.k0;
                    if (jpVar5 == null || (mq3VarR = m85Var2.r((gl) jpVar5.g)) == null || mq3VarR == mq3Var) {
                        mq3VarR2 = null;
                    } else {
                        mq3VarR2 = mq3VarR;
                    }
                }
            } else {
                mq3VarR2 = null;
            }
            if (rf5Var7.Y.f(xp4.s0)) {
                mq3 mq3Var2 = mq3.Z;
                mq3 mq3Var3 = mq3.Y;
                if (mq3VarR2 == mq3Var3) {
                    mq3VarR2 = mq3Var2;
                } else if (mq3VarR2 == mq3Var2) {
                    mq3VarR2 = mq3Var3;
                }
            }
            if (mq3VarR2 != null) {
                mq3Var = mq3VarR2;
            }
            int iOrdinal2 = mq3Var.ordinal();
            if (iOrdinal2 == 1) {
                rf5Var7.k0 = null;
                rf5Var7.i0 = null;
            } else if (iOrdinal2 == 2) {
                rf5Var7.j0 = null;
                rf5Var7.h0 = null;
            } else if (iOrdinal2 != 3) {
                jp jpVarI = rf5Var7.j0;
                if (jpVarI != null) {
                    jpVarI = jpVarI.i();
                }
                rf5Var7.j0 = jpVarI;
                jp jpVarI2 = rf5Var7.i0;
                if (jpVarI2 != null) {
                    jpVarI2 = jpVarI2.i();
                }
                rf5Var7.i0 = jpVarI2;
                if (!zF2 || rf5Var7.j0 == null) {
                    jp jpVarI3 = rf5Var7.h0;
                    if (jpVarI3 != null) {
                        jpVarI3 = jpVarI3.i();
                    }
                    rf5Var7.h0 = jpVarI3;
                    jp jpVarI4 = rf5Var7.k0;
                    if (jpVarI4 != null) {
                        jpVarI4 = jpVarI4.i();
                    }
                    rf5Var7.k0 = jpVarI4;
                }
            }
        }
        Iterator it16 = linkedHashMap.entrySet().iterator();
        LinkedList<rf5> linkedList10 = null;
        while (it16.hasNext()) {
            rf5 rf5Var8 = (rf5) ((Map.Entry) it16.next()).getValue();
            Set setX = rf5.x(rf5Var8.i0, rf5.x(rf5Var8.k0, rf5.x(rf5Var8.j0, rf5.x(rf5Var8.h0, null))));
            if (setX == null) {
                setX = Collections.EMPTY_SET;
            }
            if (!setX.isEmpty()) {
                it16.remove();
                if (linkedList10 == null) {
                    linkedList10 = new LinkedList();
                }
                if (setX.size() == 1) {
                    linkedList10.add(new rf5(rf5Var8, (jx5) setX.iterator().next()));
                } else {
                    HashMap map2 = new HashMap();
                    Set set = setX;
                    rf5Var8.w(set, map2, rf5Var8.h0);
                    rf5Var8.w(set, map2, rf5Var8.j0);
                    rf5Var8.w(set, map2, rf5Var8.k0);
                    rf5Var8.w(set, map2, rf5Var8.i0);
                    linkedList10.addAll(map2.values());
                }
            }
        }
        if (linkedList10 != null) {
            for (rf5 rf5Var9 : linkedList10) {
                String strJ = rf5Var9.j();
                rf5 rf5Var10 = (rf5) linkedHashMap.get(strJ);
                if (rf5Var10 == null) {
                    linkedHashMap.put(strJ, rf5Var9);
                } else {
                    rf5Var10.D(rf5Var9);
                }
                List list = this.k;
                ll llVarF = rf5Var9.f();
                if (list != null && llVarF != null) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        rf5 rf5Var11 = (rf5) list.get(i10);
                        if (rf5Var11 != null && rf5Var11.f() == llVarF) {
                            list.set(i10, rf5Var9);
                            break;
                        }
                    }
                }
            }
        }
        for (gl glVar : alVar.A0()) {
            d(m85Var.i(glVar), glVar);
        }
        for (hl hlVar2 : alVar.B0()) {
            if (hlVar2.G0() == 1) {
                d(m85Var.i(hlVar2), hlVar2);
            }
        }
        if (this.s != null) {
            for (rf5 rf5Var12 : this.k) {
                if (rf5Var12 != null && (jj3VarI = m85Var.i(rf5Var12.f())) != null) {
                    this.s.remove(jj3VarI.X);
                }
            }
        }
        for (rf5 rf5Var13 : linkedHashMap.values()) {
            jp jpVar6 = rf5Var13.j0;
            jp jpVar7 = rf5Var13.h0;
            if (jpVar6 != null) {
                rf5Var13.j0 = rf5.v(rf5Var13.j0, rf5.B(0, jpVar6, jpVar7, rf5Var13.i0, rf5Var13.k0));
            } else if (jpVar7 != null) {
                rf5Var13.h0 = rf5.v(rf5Var13.h0, rf5.B(0, jpVar7, rf5Var13.i0, rf5Var13.k0));
            }
        }
        Object objN = m85Var.n(alVar);
        if (objN != null && (cls = (Class) objN) != kx5.class) {
            if (!kx5.class.isAssignableFrom(cls)) {
                j("AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`", it0.e(cls));
                throw null;
            }
            p61.x(it0.g(cls, l37Var.f(xp4.q0)));
        }
        for (rf5 rf5Var14 : linkedHashMap.values()) {
            jp jpVarE = rf5Var14.h0;
            if (jpVarE != null) {
                jpVarE = jpVarE.e();
            }
            rf5Var14.h0 = jpVarE;
            jp jpVarE2 = rf5Var14.j0;
            if (jpVarE2 != null) {
                jpVarE2 = jpVarE2.e();
            }
            rf5Var14.j0 = jpVarE2;
            jp jpVarE3 = rf5Var14.k0;
            if (jpVarE3 != null) {
                jpVarE3 = jpVarE3.e();
            }
            rf5Var14.k0 = jpVarE3;
            jp jpVarE4 = rf5Var14.i0;
            if (jpVarE4 != null) {
                jpVarE4 = jpVarE4.e();
            }
            rf5Var14.i0 = jpVarE4;
        }
        if (l37Var.f(xp4.A0)) {
            Iterator it17 = linkedHashMap.entrySet().iterator();
            while (it17.hasNext()) {
                if (((rf5) ((Map.Entry) it17.next()).getValue()).e() != null) {
                    m85Var.getClass();
                }
            }
        }
        h(linkedHashMap);
        this.j = linkedHashMap;
        this.i = true;
    }

    public final void j(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.d + ": " + str);
    }

    public final String b(String str) {
        return str;
    }
}
