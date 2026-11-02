package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zk3 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ zk3(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Iterable] */
    @Override // defpackage.dn2
    public final Object invoke() {
        x22 x22Var;
        r14 r14Var;
        du duVarA;
        ?? K;
        List listAsList;
        b8 b8Var;
        String property;
        byte b = this.X;
        e02 e02Var = e02.X;
        List<String> listK0 = d02.X;
        int length = 0;
        Map mapSingletonMap = null;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return w79.k((bl3) obj, true);
            case 1:
                Map map = wj3.a;
                ka6 ka6Var = ((hl3) obj).d;
                ya6 ya6Var = ka6Var instanceof ya6 ? (ya6) ka6Var : null;
                if (ya6Var == null || (r14Var = (r14) wj3.b.get(v15.e(ya6Var.b.name()).b())) == null) {
                    x22Var = null;
                } else {
                    fk2 fk2Var = tg7.v;
                    fk2Var.getClass();
                    x22Var = new x22(new qs0(fk2Var.b(), fk2Var.a.g()), v15.e(r14Var.name()));
                }
                if (x22Var != null) {
                    mapSingletonMap = Collections.singletonMap(uj3.c, x22Var);
                    mapSingletonMap.getClass();
                }
                return mapSingletonMap == null ? e02Var : mapSingletonMap;
            case 2:
                ka6 ka6Var2 = ((il3) obj).d;
                if (ka6Var2 instanceof ma6) {
                    Map map2 = wj3.a;
                    duVarA = wj3.a(((ma6) ka6Var2).a());
                } else if (ka6Var2 instanceof ya6) {
                    Map map3 = wj3.a;
                    duVarA = wj3.a(i21.K(ka6Var2));
                } else {
                    duVarA = null;
                }
                if (duVarA != null) {
                    mapSingletonMap = Collections.singletonMap(uj3.b, duVarA);
                    mapSingletonMap.getClass();
                }
                return mapSingletonMap == null ? e02Var : mapSingletonMap;
            case 3:
                is3 is3Var = (is3) obj;
                gb4 gb4VarR = i21.r();
                gb4VarR.add(is3Var.a.X);
                je6 je6Var = is3Var.b;
                if (je6Var != null) {
                    gb4VarR.add("under-migration:".concat(je6Var.X));
                }
                for (Map.Entry entry : is3Var.c.entrySet()) {
                    gb4VarR.add("@" + entry.getKey() + ':' + ((je6) entry.getValue()).X);
                }
                return (String[]) i21.j(gb4VarR).toArray(new String[0]);
            case 4:
                rs3 rs3Var = (rs3) obj;
                ps3 ps3Var = rs3Var.f;
                if (ps3Var == null) {
                    bt.g("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                qs3 qs3Var = (qs3) ps3Var.invoke();
                rs3Var.f = null;
                return qs3Var;
            case 5:
                tt3 tt3Var = (tt3) obj;
                v44 v44Var = tt3Var.c;
                Collection collectionValues = ((Map) hi5.e0(v44Var.m0, v44.q0[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    hm1 hm1VarA = ((zl1) ((c6) tt3Var.b.Y).j0).a(v44Var, (qb6) it.next());
                    if (hm1VarA != null) {
                        arrayList.add(hm1VarA);
                    }
                }
                return (et4[]) z39.A(arrayList).toArray(new et4[0]);
            case 6:
                dw3 dw3Var = (dw3) obj;
                tb6 tb6Var = dw3Var.d;
                nw3 nw3Var = dw3.g[0];
                qb6 qb6Var = (qb6) tb6Var.invoke();
                if (qb6Var == null) {
                    return dt4.b;
                }
                tb6 tb6Var2 = dw3Var.a;
                nw3 nw3Var2 = nv3.b[0];
                Object objInvoke = tb6Var2.invoke();
                objInvoke.getClass();
                f63 f63Var = ((gr6) objInvoke).b;
                zl1 zl1Var = (zl1) f63Var.Y;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f63Var.f0;
                Class cls = qb6Var.a;
                qs0 qs0VarA = ia6.a(cls);
                Object obj2 = concurrentHashMap.get(qs0VarA);
                if (obj2 == null) {
                    fk2 fk2Var2 = ia6.a(cls).a;
                    b04 b04Var = qb6Var.b;
                    a04 a04Var = b04Var.a;
                    a04 a04Var2 = a04.MULTIFILE_CLASS;
                    if (a04Var == a04Var2) {
                        String[] strArr = b04Var.c;
                        if (a04Var != a04Var2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            listAsList = Arrays.asList(strArr);
                            listAsList.getClass();
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            listK0 = listAsList;
                        }
                        K = new ArrayList();
                        for (String str : listK0) {
                            if (str == null) {
                                zs3.a(0);
                                throw null;
                            }
                            fk2 fk2Var3 = new fk2(str.replace('/', '.'));
                            fk2 fk2VarB = fk2Var3.b();
                            v15 v15VarG = fk2Var3.a.g();
                            fk2 fk2Var4 = fk2.c;
                            gk2 gk2Var = wl7.h0(v15VarG).a;
                            gk2Var.c();
                            y45 y45Var = (y45) f63Var.Z;
                            zl1Var.c().c.getClass();
                            hv4.g.getClass();
                            String strX = mm7.X(gk2Var.a, '.', '$');
                            if (!fk2VarB.a.c()) {
                                strX = fk2VarB + '.' + strX;
                            }
                            vk1 vk1VarC = y45Var.C(strX);
                            qb6 qb6Var2 = vk1VarC != null ? (qb6) vk1VarC.Y : null;
                            if (qb6Var2 != null) {
                                K.add(qb6Var2);
                            }
                        }
                    } else {
                        K = i21.K(qb6Var);
                    }
                    h02 h02Var = new h02(zl1Var.c().b, fk2Var2, (byte) 0);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = K.iterator();
                    while (it2.hasNext()) {
                        hm1 hm1VarA2 = zl1Var.a(h02Var, (qb6) it2.next());
                        if (hm1VarA2 != null) {
                            arrayList2.add(hm1VarA2);
                        }
                    }
                    et4 et4VarO = dh3.o("package " + fk2Var2 + " (" + qb6Var + ')', wv0.Y0(arrayList2));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(qs0VarA, et4VarO);
                    obj2 = objPutIfAbsent == null ? et4VarO : objPutIfAbsent;
                }
                obj2.getClass();
                return (et4) obj2;
            case 7:
                return new q04((r04) obj);
            case 8:
                return new s04((t04) obj);
            case 9:
                return new u04((v04) obj);
            case 10:
                z04 z04Var = (z04) obj;
                m04 m04Var = z04Var.X;
                if ((m04Var.D() instanceof ew3) || mb6.L(m04Var)) {
                    return (Type) m04Var.r().a().get(z04Var.Z);
                }
                StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
                sb.append(m04Var.D());
                xw3.p(sb, m04Var.getName(), z04Var.g0);
                return null;
            case 11:
                return ch3.p((c14) obj, true);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new m14((n14) obj);
            case 13:
                ((b54) obj).o.i0.getClass();
                return null;
            case 14:
                x14 x14Var = (x14) ((z74) obj).Z.invoke();
                x14Var.getClass();
                return (t14) x14Var;
            case 15:
                dn2 dn2Var = ((d45) obj).Y;
                if (dn2Var != null) {
                    return (List) dn2Var.invoke();
                }
                return null;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ob6 ob6Var = (ob6) obj;
                if (mb6.J(ob6Var.f())) {
                    if (!(ob6Var instanceof z04)) {
                        return listK0;
                    }
                    z04 z04Var2 = (z04) ob6Var;
                    ArrayList arrayList3 = z04Var2.Y.e;
                    ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(ys0.W((dy3) it3.next(), ia6.d(z04Var2.X.D().t())));
                    }
                    return arrayList4;
                }
                Member memberB = ob6Var.f().r().b();
                if (memberB instanceof Method) {
                    b8Var = new b8(memberB, ob6Var.v() + (Modifier.isStatic(((Method) memberB).getModifiers()) ? 0 : -1), (byte) 5);
                } else {
                    if (!(memberB instanceof Constructor)) {
                        xw3.j(memberB, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberB;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (yb6.a.b(declaringClass).n() && (property = System.getProperty("java.version")) != null && mm7.Z(property, false, "1.")) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    b8Var = new b8(memberB, ob6Var.v() + length, (byte) 5);
                }
                int i = b8Var.b;
                Member member = (Member) b8Var.c;
                if (member instanceof Method) {
                    Annotation[] annotationArr = ((Method) member).getParameterAnnotations()[i];
                    annotationArr.getClass();
                    listK0 = eu.K0(annotationArr);
                } else if (member instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) member).getParameterAnnotations()[i];
                    annotationArr2.getClass();
                    listK0 = eu.K0(annotationArr2);
                }
                return ms8.t(listK0);
            case 17:
                return (et4) ((gx6) obj).b.B(z14.t);
            case 18:
                String stringExtra = ((ServerCustomConfigActivity) obj).getIntent().getStringExtra("guid");
                if (stringExtra == null) {
                    GuId.Companion.getClass();
                    stringExtra = GuId.EMPTY;
                }
                return new GuId(stringExtra);
            case 19:
                return os4.O((hi8) ((wg7) obj).b);
            case 20:
                return (ok7) obj;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return (fx8) ((zk3) obj).invoke();
            case 22:
                return (wu7) obj;
            case 23:
                return (fx8) ((zk3) obj).invoke();
            case 24:
                return new wi8(((wi8) obj).a);
            case 25:
                fw7 fw7Var = (fw7) obj;
                return fw7Var.i(hi5.b0(fw7Var.b, null, 3));
            case 26:
                return u32.c(s32.CANNOT_COMPUTE_ERASED_BOUND, ((xd6) obj).toString());
            case 27:
                return (List) ((nt8) obj).p0.getValue();
            default:
                return new x31[((xe2[]) obj).length];
        }
    }

    public /* synthetic */ zk3(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj2;
    }
}
