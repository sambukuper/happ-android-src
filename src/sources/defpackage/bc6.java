package defpackage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class bc6 extends zb6 {
    public static ov3 l(nd0 nd0Var) {
        mv3 mv3VarU = nd0Var.U();
        return mv3VarU instanceof ov3 ? (ov3) mv3VarU : a02.Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zb6
    public final pv3 a(mo2 mo2Var) throws IOException {
        ov3 ov3VarL = l(mo2Var);
        String name = mo2Var.getName();
        String strA = mo2Var.a();
        if (!q08.a) {
            boolean z = ov3VarL instanceof ev3;
            int i = 0;
            boolean z2 = z && ((ev3) ov3VarL).Y.getAnnotation(Metadata.class) == null && !w51.E((zu3) ov3VarL);
            if (name.equals("<init>")) {
                Object obj = null;
                constructor = null;
                Constructor<?> constructor = null;
                obj = null;
                if (!z2) {
                    strA.getClass();
                    Iterator it = ov3VarL.W().iterator();
                    Object obj2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (i == 0) {
                                break;
                            }
                            obj = obj2;
                            break;
                        }
                        Object next = it.next();
                        cz3 cz3Var = (cz3) next;
                        cz3Var.getClass();
                        if (String.valueOf(ch3.D(cz3Var).a).equals(strA)) {
                            if (i != 0) {
                                break;
                            }
                            i = 1;
                            obj2 = next;
                        }
                    }
                    cz3 cz3Var2 = (cz3) obj;
                    if (cz3Var2 != null) {
                        return new n04(ov3VarL, strA, mo2Var.T(), cz3Var2);
                    }
                    String strY0 = wv0.y0(ov3VarL.W(), "\n", null, null, cl1.v0, 30);
                    StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                    sb.append(strA);
                    sb.append(") not resolved in ");
                    sb.append(ov3VarL);
                    sb.append(':');
                    sb.append(strY0.length() != 0 ? " several matching constructors found:\n".concat(strY0) : " no constructors found");
                    throw new p14(sb.toString());
                }
                strA.getClass();
                Constructor<?>[] declaredConstructors = ov3VarL.t().getDeclaredConstructors();
                declaredConstructors.getClass();
                int length = declaredConstructors.length;
                boolean z3 = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i >= length) {
                        if (!z3) {
                            break;
                        }
                        constructor = constructor2;
                        break;
                    }
                    Constructor<?> constructor3 = declaredConstructors[i];
                    constructor3.getClass();
                    if (km4.K(constructor3).equals(strA)) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        constructor2 = constructor3;
                    }
                    i++;
                    z3 = z3;
                }
                if (constructor != null) {
                    return new pk3(ov3VarL, constructor, mo2Var.T());
                }
                Constructor<?>[] declaredConstructors2 = ov3VarL.t().getDeclaredConstructors();
                declaredConstructors2.getClass();
                String strX0 = eu.x0(declaredConstructors2, "\n", null, null, cl1.w0, 30);
                StringBuilder sb2 = new StringBuilder("Constructor (JVM signature: ");
                sb2.append(strA);
                sb2.append(") not resolved in ");
                sb2.append(ov3VarL);
                sb2.append(':');
                sb2.append(strX0.length() != 0 ? "\n".concat(strX0) : " no constructors found");
                throw new p14(sb2.toString());
            }
            if (ov3VarL instanceof ew3) {
                strA.getClass();
                ew3 ew3Var = (ew3) ov3VarL;
                ArrayList arrayListE0 = ew3Var.e0();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListE0) {
                    iz3 iz3Var = (iz3) obj3;
                    if (dh3.f(iz3Var.b, name) && String.valueOf(ch3.E(iz3Var).a).equals(strA)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return new y04(ov3VarL, strA, mo2Var.T(), (iz3) wv0.O0(arrayList), yu3.k);
                }
                String strY1 = wv0.y0(ew3Var.e0(), "\n", null, null, cl1.s0, 30);
                StringBuilder sbT = oi0.t("Function '", name, "' (JVM signature: ", strA, ") not resolved in ");
                sbT.append(ov3VarL);
                sbT.append(':');
                sbT.append(strY1.length() == 0 ? " no members found" : " several matching members found:\n".concat(strY1));
                throw new p14(sbT.toString());
            }
            if (z) {
                ev3 ev3Var = (ev3) ov3VarL;
                if (!ev3Var.k0() && z2) {
                    strA.getClass();
                    String strSubstring = strA.substring(fm7.l0(strA, '(', 0, 6), strA.length());
                    mj0 mj0VarM = ms8.m(ia6.d(ev3Var.t()), strSubstring, true);
                    Class[] clsArr = (Class[]) ((ArrayList) mj0VarM.Y).toArray(new Class[0]);
                    Class cls = (Class) mj0VarM.Z;
                    cls.getClass();
                    Method methodC0 = ov3.c0(ov3VarL.a0(), name, clsArr, cls, false);
                    if (methodC0 != null) {
                        return new vk3(ov3VarL, methodC0, mo2Var.T(), yu3.k);
                    }
                    Method[] declaredMethods = ev3Var.Y.getDeclaredMethods();
                    declaredMethods.getClass();
                    String strX1 = eu.x0(declaredMethods, "\n", null, null, cl1.u0, 30);
                    StringBuilder sbT2 = oi0.t("Method '", name, "' (JVM signature: ", strSubstring, ") not resolved in ");
                    sbT2.append(ov3VarL);
                    sbT2.append(':');
                    sbT2.append(strX1.length() == 0 ? " no methods found" : "\n".concat(strX1));
                    throw new p14(sbT2.toString());
                }
            }
        }
        Object objT = mo2Var.T();
        name.getClass();
        strA.getClass();
        return new gj1(ov3VarL, name, strA, null, objT, yu3.k);
    }

    @Override // defpackage.zb6
    public final zu3 b(Class cls) {
        return uc0.a(cls);
    }

    @Override // defpackage.zb6
    public final mv3 c(Class cls) {
        mj0 mj0Var = uc0.a;
        cls.getClass();
        return (mv3) uc0.b.Q(cls);
    }

    @Override // defpackage.zb6
    public final wv3 d(i58 i58Var) {
        ov3 ov3VarL = l(i58Var);
        String name = i58Var.getName();
        String strA = i58Var.a();
        if (q08.a) {
            return new ij1(ov3VarL, name, strA, i58Var.T());
        }
        ac6 ac6Var = new ac6(strA, ov3VarL, (nx5) i58Var, name, (byte) 1);
        name.getClass();
        return new k54(name, ac6Var);
    }

    @Override // defpackage.zb6
    public final yv3 e(p05 p05Var) {
        ov3 ov3VarL = l(p05Var);
        String name = p05Var.getName();
        String strA = p05Var.a();
        if (q08.a) {
            return new kj1(ov3VarL, name, strA, p05Var.T());
        }
        ac6 ac6Var = new ac6(ov3VarL, name, strA, (nx5) p05Var, (byte) 3);
        name.getClass();
        return new l54(name, ac6Var);
    }

    @Override // defpackage.zb6
    public final jw3 f(a74 a74Var) {
        ov3 ov3VarL = l(a74Var);
        String name = a74Var.getName();
        String strA = a74Var.a();
        return !q08.a ? new m54(name, new ac6(strA, ov3VarL, (nx5) a74Var, name, (byte) 0)) : new zj1(ov3VarL, name, strA, a74Var.T());
    }

    @Override // defpackage.zb6
    public final lw3 g(lx5 lx5Var) {
        ov3 ov3VarL = l(lx5Var);
        String name = lx5Var.getName();
        String strA = lx5Var.a();
        return !q08.a ? new n54(name, new ac6(ov3VarL, name, strA, (nx5) lx5Var, (byte) 2)) : new ck1(ov3VarL, name, strA, lx5Var.T());
    }

    @Override // defpackage.zb6
    public final mw3 h(mx5 mx5Var) {
        return new fk1(l(mx5Var), mx5Var.getName(), mx5Var.a());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // defpackage.zb6
    public final String i(bo2 bo2Var) throws IOException {
        gj1 gj1Var;
        Metadata metadata = (Metadata) bo2Var.getClass().getAnnotation(Metadata.class);
        Object obj = null;
        if (metadata == null) {
            gj1Var = null;
        } else {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 == null) {
                gj1Var = null;
            } else {
                qg5 qg5VarG = mu3.g(strArrD1, metadata.d2());
                qt3 qt3Var = (qt3) qg5VarG.X;
                vy5 vy5Var = (vy5) qg5VarG.Y;
                hv4 hv4Var = new hv4((metadata.xi() & 8) != 0, metadata.mv());
                Class<?> cls = bo2Var.getClass();
                tz5 tz5Var = vy5Var.s0;
                tz5Var.getClass();
                gj1Var = new gj1(a02.Y, (q97) ms8.g(cls, xb6.X, vy5Var, qt3Var, new ux4(tz5Var), hv4Var, sb6.X));
            }
        }
        if (gj1Var == null) {
            return super.i(bo2Var);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = gj1Var.g().iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((ob6) next).x() == fw3.Z) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        ob6 ob6Var = (ob6) obj;
        if (ob6Var != null) {
            sb.append(lh4.W0(ob6Var.B(), false));
            sb.append(".");
        }
        wv0.x0(nr4.C(gj1Var), sb, ", ", "(", ")", cd5.o0, 48);
        sb.append(" -> ");
        sb.append(lh4.W0(gj1Var.j(), false));
        return sb.toString();
    }

    @Override // defpackage.zb6
    public final String j(g24 g24Var) {
        return i(g24Var);
    }

    @Override // defpackage.zb6
    public final pw3 k(zu3 zu3Var, boolean z) {
        List list = Collections.EMPTY_LIST;
        if (!(zu3Var instanceof fs0)) {
            return w45.F(zu3Var, list, z, list, null);
        }
        Class clsT = ((fs0) zu3Var).t();
        mj0 mj0Var = uc0.a;
        clsT.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (u1) uc0.d.Q(clsT) : (u1) uc0.c.Q(clsT);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) uc0.e.Q(clsT);
        qg5 qg5Var = new qg5(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(qg5Var);
        if (obj == null) {
            u1 u1VarG = w45.G(uc0.a(clsT), list, z, d02.X, 8);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(qg5Var, u1VarG);
            obj = objPutIfAbsent == null ? u1VarG : objPutIfAbsent;
        }
        return (pw3) obj;
    }
}
