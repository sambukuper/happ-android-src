package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final LinkedHashMap c;
    public final o8 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (km kmVar : km.values()) {
            String str = kmVar.X;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, kmVar);
            }
        }
        c = linkedHashMap;
    }

    public e0(o8 o8Var) {
        this.a = o8Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    public static rl3 b(e0 e0Var, rl3 rl3Var, Iterable iterable) {
        boolean z;
        boolean z2;
        bk3 bk3Var;
        je6 je6VarK;
        bk3 bk3Var2;
        Object objC;
        Object next;
        qg5 qg5Var;
        g39 g39VarJ;
        e0Var.getClass();
        iterable.getClass();
        o8 o8Var = e0Var.a;
        boolean z3 = o8Var.Y;
        if (!z3) {
            ArrayList<bk3> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                z = false;
                bk3 bk3Var3 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                je6 je6Var = je6.IGNORE;
                if (z3 || (bk3Var = (bk3) ck3.b.get(e0Var.d(next2))) == null) {
                    bk3Var2 = null;
                } else {
                    fk2 fk2VarD = e0Var.d(next2);
                    if (fk2VarD == null || !ck3.a.containsKey(fk2VarD)) {
                        je6VarK = e0Var.k(next2);
                        if (je6VarK == null) {
                            je6VarK = ((is3) o8Var.Z).a;
                        }
                    } else {
                        je6VarK = (je6) ((f0) o8Var.f0).B(fk2VarD);
                    }
                    if (je6VarK == je6Var) {
                        je6VarK = null;
                    }
                    if (je6VarK == null) {
                        bk3Var2 = null;
                    } else {
                        g39 g39VarA = g39.a(bk3Var.a, null, je6VarK.a(), 1);
                        Collection collection = bk3Var.b;
                        boolean z4 = bk3Var.c;
                        boolean z5 = bk3Var.d;
                        boolean z6 = bk3Var.e;
                        collection.getClass();
                        bk3Var2 = new bk3(g39VarA, collection, z4, z5, z6);
                    }
                }
                if (bk3Var2 != null) {
                    bk3Var3 = bk3Var2;
                } else {
                    if (((is3) o8Var.Z).d || (objC = e0Var.c(next2, ls3.f)) == null) {
                        qg5Var = null;
                    } else {
                        Iterator it2 = e0Var.f(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (e0Var.l(next) == null);
                        if (next == null) {
                            qg5Var = null;
                        } else {
                            Iterable iterableA = e0Var.a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = iterableA.iterator();
                            while (it3.hasNext()) {
                                km kmVar = (km) c.get((String) it3.next());
                                if (kmVar != null) {
                                    linkedHashSet.add(kmVar);
                                }
                            }
                            if (linkedHashSet.contains(km.TYPE_USE)) {
                                linkedHashSet = q57.Z(q57.X(eu.L0(km.values()), km.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            qg5Var = new qg5(next, linkedHashSet);
                        }
                    }
                    if (qg5Var != null) {
                        Object obj = qg5Var.X;
                        Set set = (Set) qg5Var.Y;
                        je6 je6VarK2 = e0Var.k(next2);
                        if (je6VarK2 == null && (je6VarK2 = e0Var.k(obj)) == null) {
                            je6VarK2 = ((is3) o8Var.Z).a;
                        }
                        if (je6VarK2 != je6Var) {
                            obj.getClass();
                            g39 g39VarJ2 = e0Var.j(obj, false);
                            if (g39VarJ2 == null) {
                                Object objL = e0Var.l(obj);
                                if (objL != null) {
                                    je6 je6VarK3 = e0Var.k(obj);
                                    if (je6VarK3 == null) {
                                        je6VarK3 = ((is3) o8Var.Z).a;
                                    }
                                    if (je6VarK3 == je6Var || (g39VarJ = e0Var.j(objL, false)) == null) {
                                        g39VarJ2 = null;
                                    } else {
                                        g39VarJ2 = g39.a(g39VarJ, null, je6VarK3.a(), 1);
                                    }
                                } else {
                                    g39VarJ2 = null;
                                }
                            }
                            if (g39VarJ2 != null) {
                                bk3Var3 = new bk3(g39.a(g39VarJ2, null, je6VarK2.a(), 1), set, 28);
                            }
                        }
                    }
                }
                if (bk3Var3 != null) {
                    arrayList.add(bk3Var3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(km.class);
                for (bk3 bk3Var4 : arrayList) {
                    for (km kmVar2 : bk3Var4.b) {
                        if (enumMap.containsKey(kmVar2) && e0Var.h()) {
                            bk3 bk3Var5 = (bk3) enumMap.get(kmVar2);
                            if (bk3Var5 != null) {
                                g39 g39Var = bk3Var5.a;
                                g39 g39Var2 = bk3Var4.a;
                                if (!dh3.f(g39Var2, g39Var) && (!(z2 = g39Var2.b) || g39Var.b)) {
                                    bk3Var5 = (z2 || !g39Var.b) ? null : bk3Var4;
                                }
                                enumMap.put(kmVar2, bk3Var5);
                            }
                        } else {
                            enumMap.put(kmVar2, bk3Var4);
                        }
                    }
                }
                EnumMap enumMap2 = rl3Var != null ? new EnumMap(rl3Var.a) : new EnumMap(km.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    km kmVar3 = (km) entry.getKey();
                    bk3 bk3Var6 = (bk3) entry.getValue();
                    if (bk3Var6 != null) {
                        enumMap2.put(kmVar3, bk3Var6);
                        z = true;
                    }
                }
                if (z) {
                    return new rl3(enumMap2);
                }
            }
        }
        return rl3Var;
    }

    public Iterable a(Object obj, boolean z) {
        ((Annotation) obj).getClass();
        throw new p14("Should not be called because kotlin-reflect doesn't support JSR-305 annotations.");
    }

    public final Object c(Object obj, fk2 fk2Var) {
        for (Object obj2 : f(obj)) {
            if (dh3.f(d(obj2), fk2Var)) {
                return obj2;
            }
        }
        return null;
    }

    public fk2 d(Object obj) {
        gm gmVar = (gm) obj;
        gmVar.getClass();
        return gmVar.d();
    }

    public Object e(Object obj) {
        gm gmVar = (gm) obj;
        gmVar.getClass();
        sx4 sx4VarD = el1.d(gmVar);
        sx4VarD.getClass();
        return sx4VarD;
    }

    public Iterable f(Object obj) {
        sm annotations;
        gm gmVar = (gm) obj;
        gmVar.getClass();
        sx4 sx4VarD = el1.d(gmVar);
        return (sx4VarD == null || (annotations = sx4VarD.getAnnotations()) == null) ? d02.X : annotations;
    }

    public final boolean g(Object obj, fk2 fk2Var) {
        Iterable iterableF = f(obj);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            return false;
        }
        Iterator it = iterableF.iterator();
        while (it.hasNext()) {
            if (dh3.f(d(it.next()), fk2Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return false;
    }

    public final boolean i(Object obj) {
        obj.getClass();
        Object objC = c(obj, tg7.t);
        if (objC != null) {
            Iterable iterableA = a(objC, false);
            if (!(iterableA instanceof Collection) || !((Collection) iterableA).isEmpty()) {
                Iterator it = iterableA.iterator();
                while (it.hasNext()) {
                    if (dh3.f((String) it.next(), "TYPE")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r8.equals("UNKNOWN") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r8.equals("NEVER") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r8.equals("MAYBE") == false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g39 j(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            fk2 r0 = r8.d(r9)
            r1 = 0
            if (r0 != 0) goto L9
            goto L90
        L9:
            o8 r2 = r8.a
            java.lang.Object r2 = r2.f0
            f0 r2 = (defpackage.f0) r2
            java.lang.Object r2 = r2.B(r0)
            je6 r2 = (defpackage.je6) r2
            r2.getClass()
            je6 r3 = defpackage.je6.IGNORE
            if (r2 != r3) goto L1d
            return r1
        L1d:
            java.util.Set r3 = defpackage.ls3.k
            boolean r3 = r3.contains(r0)
            h75 r4 = defpackage.h75.Z
            r5 = 0
            if (r3 == 0) goto L29
            goto L81
        L29:
            java.util.Set r3 = defpackage.ls3.l
            boolean r3 = r3.contains(r0)
            h75 r6 = defpackage.h75.Y
            if (r3 == 0) goto L35
        L33:
            r4 = r6
            goto L81
        L35:
            java.util.Set r3 = defpackage.ls3.m
            boolean r3 = r3.contains(r0)
            h75 r7 = defpackage.h75.X
            if (r3 == 0) goto L41
        L3f:
            r4 = r7
            goto L81
        L41:
            fk2 r3 = defpackage.ls3.g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L90
            java.lang.Iterable r8 = r8.a(r9, r5)
            java.lang.Object r8 = defpackage.wv0.s0(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L81
            int r9 = r8.hashCode()
            switch(r9) {
                case 73135176: goto L78;
                case 74175084: goto L6f;
                case 433141802: goto L66;
                case 1933739535: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L90
        L5d:
            java.lang.String r9 = "ALWAYS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L90
            goto L81
        L66:
            java.lang.String r9 = "UNKNOWN"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L3f
            goto L90
        L6f:
            java.lang.String r9 = "NEVER"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L33
            goto L90
        L78:
            java.lang.String r9 = "MAYBE"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L33
            goto L90
        L81:
            g39 r8 = new g39
            boolean r9 = r2.a()
            if (r9 != 0) goto L8b
            if (r10 == 0) goto L8c
        L8b:
            r5 = 1
        L8c:
            r8.<init>(r4, r5)
            return r8
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0.j(java.lang.Object, boolean):g39");
    }

    public final je6 k(Object obj) {
        Iterable iterableA;
        String str;
        is3 is3Var = (is3) this.a.Z;
        je6 je6Var = (je6) is3Var.c.get(d(obj));
        if (je6Var != null) {
            return je6Var;
        }
        Object objC = c(obj, ls3.p);
        if (objC == null || (iterableA = a(objC, false)) == null || (str = (String) wv0.s0(iterableA)) == null) {
            return null;
        }
        je6 je6Var2 = is3Var.b;
        if (je6Var2 != null) {
            return je6Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return je6.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return je6.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return je6.WARN;
        }
        return null;
    }

    public final Object l(Object obj) {
        Object objL;
        obj.getClass();
        if (!((is3) this.a.Z).d) {
            if (wv0.m0(ls3.j, d(obj)) || g(obj, ls3.d)) {
                return obj;
            }
            if (g(obj, ls3.e)) {
                Object objE = e(obj);
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(objE);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = f(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objL = null;
                        break;
                    }
                    objL = l(it.next());
                } while (objL == null);
                if (objL != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objE, objL);
                    return objPutIfAbsent == null ? objL : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
