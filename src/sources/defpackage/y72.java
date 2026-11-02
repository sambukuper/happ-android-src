package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y72 {
    public static final tx0 a = new tx0(new gn2[]{cl1.f0, cl1.g0}, 0);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (defpackage.vr3.J(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pw3 a(defpackage.pw3 r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof defpackage.u1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            u1 r0 = (defpackage.u1) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            lv3 r2 = r0.M()
            boolean r2 = r2 instanceof defpackage.t32
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof defpackage.kk1
            if (r2 == 0) goto L1b
            kk1 r0 = (defpackage.kk1) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            t14 r0 = r0.Y
            if (r0 == 0) goto L2a
            boolean r0 = defpackage.vr3.J(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            lv3 r0 = r7.M()
            if (r0 == 0) goto L70
            java.util.List r2 = r7.L()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.xv0.Z(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            uw3 r4 = (defpackage.uw3) r4
            pw3 r5 = r4.b
            if (r5 == 0) goto L58
            pw3 r5 = a(r5, r8)
            goto L59
        L58:
            r5 = r1
        L59:
            yw3 r4 = r4.a
            uw3 r6 = new uw3
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L43
        L64:
            java.util.List r7 = r7.Q()
            r8 = 8
            r1 = 0
            u1 r7 = defpackage.w45.G(r0, r3, r1, r7, r8)
            return r7
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            zb6 r2 = defpackage.yb6.a
            zu3 r7 = r2.b(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y72.a(pw3, java.lang.String):pw3");
    }

    public static final ArrayList b(ev3 ev3Var, b32 b32Var) {
        ev3Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (pw3 pw3Var : ev3Var.c()) {
            lv3 lv3VarM = pw3Var.M();
            zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
            if (zu3Var != null) {
                ww3 ww3Var = ww3.c;
                ww3 ww3VarV = mb6.v(pw3Var);
                Iterator it = c(zu3Var).entrySet().iterator();
                while (it.hasNext()) {
                    kb6 kb6Var = (kb6) ((Map.Entry) it.next()).getValue();
                    if (kb6Var instanceof nb6) {
                        kb6 kb6Var2 = (nb6) kb6Var;
                        if (b32Var.equals(h(kb6Var2.A(ev3Var, yu3.a(((lb6) kb6Var2).X.d(ww3VarV), null, null, Boolean.valueOf(f(kb6Var)), d(kb6Var), kb6Var2.getTypeParameters(), null, false, false, false, false, 995)), a32.i))) {
                            arrayList.add(kb6Var);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final Map c(zu3 zu3Var) {
        if (zu3Var instanceof ev3) {
            tb6 tb6Var = ((cv3) ((ev3) zu3Var).Z.getValue()).p;
            nw3 nw3Var = cv3.r[12];
            Object objInvoke = tb6Var.invoke();
            objInvoke.getClass();
            return (Map) objInvoke;
        }
        if (zu3Var instanceof pz4) {
            return c(((pz4) zu3Var).q());
        }
        kp5.q(yb6.a.b(zu3Var.getClass()), "Unknown type ");
        return null;
    }

    public static final ov3 d(kb6 kb6Var) {
        ov3 ov3Var = ((lb6) kb6Var).X.d;
        return ov3Var == null ? kb6Var.D() : ov3Var;
    }

    public static final boolean e(ev3 ev3Var, kb6 kb6Var) {
        Field fieldE;
        Class<?> declaringClass;
        ev3Var.getClass();
        kb6Var.getClass();
        if (kb6Var.e() == zw3.f0) {
            return true;
        }
        if (f(kb6Var) && ev3Var.g0() == ts0.INTERFACE) {
            return !(kb6Var instanceof nw3) || (fieldE = i21.E((nw3) kb6Var)) == null || (declaringClass = fieldE.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null;
        }
        return false;
    }

    public static final boolean f(kb6 kb6Var) {
        List listL;
        kb6Var.getClass();
        Boolean bool = ((lb6) kb6Var).X.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        vk3 vk3Var = kb6Var instanceof vk3 ? (vk3) kb6Var : null;
        if (vk3Var == null || (listL = (List) vk3Var.i0.getValue()) == null) {
            listL = kb6Var.l();
        }
        ob6 ob6Var = (ob6) wv0.t0(listL);
        return (ob6Var != null ? ob6Var.x() : null) != fw3.X;
    }

    public static final ww3 g(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return null;
        }
        if (list.isEmpty()) {
            return ww3.c;
        }
        ArrayList<qg5> arrayListE1 = wv0.e1(list, list2);
        int iG = aq4.G(xv0.Z(arrayListE1, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (qg5 qg5Var : arrayListE1) {
            rw3 rw3Var = (rw3) qg5Var.X;
            rw3 rw3Var2 = (rw3) qg5Var.Y;
            uw3 uw3Var = uw3.c;
            linkedHashMap.put(rw3Var, hi5.g0(w45.E(rw3Var2, null, 7)));
        }
        return new ww3(linkedHashMap, false);
    }

    public static final b32 h(kb6 kb6Var, ch3 ch3Var) {
        List listL;
        f97 f97Var;
        Field fieldE;
        Class<?> declaringClass;
        kb6Var.getClass();
        vk3 vk3Var = kb6Var instanceof vk3 ? (vk3) kb6Var : null;
        if (vk3Var == null || (listL = (List) vk3Var.i0.getValue()) == null) {
            listL = kb6Var.l();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((ob6) obj).x() != fw3.X) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ob6) it.next()).B());
        }
        boolean z = kb6Var instanceof nw3;
        if (z && (fieldE = i21.E((nw3) kb6Var)) != null && (declaringClass = fieldE.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            f97Var = f97.Z;
        } else if (z) {
            f97Var = f97.Y;
        } else {
            if (!(kb6Var instanceof pv3)) {
                kp5.q(yb6.a.b(kb6Var.getClass()), "Unknown kind for ");
                return null;
            }
            f97Var = f97.X;
        }
        f97 f97Var2 = f97Var;
        pv3 pv3Var = kb6Var instanceof pv3 ? (pv3) kb6Var : null;
        Method methodF = pv3Var != null ? i21.F(pv3Var) : null;
        Type[] genericParameterTypes = methodF != null ? methodF.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listK0 = eu.K0(genericParameterTypes);
        Class<?>[] parameterTypes = methodF != null ? methodF.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new b32(f97Var2, kb6Var.getName(), methodF != null ? methodF.getName() : null, kb6Var.getTypeParameters(), arrayList2, eu.K0(parameterTypes), listK0, f(kb6Var), ch3Var);
    }
}
