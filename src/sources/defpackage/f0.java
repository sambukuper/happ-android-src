package defpackage;

import android.view.KeyEvent;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements gn2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public f0(sx4 sx4Var, q66 q66Var, aa7 aa7Var, nl3 nl3Var) {
        this.X = (byte) 28;
        this.Y = sx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:178:0x041f  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:380:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) throws InvocationTargetException {
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        fk2 fk2VarC;
        Object next;
        tf5 tf5Var;
        jl1 jl1Var;
        tf5 tf5Var2;
        boolean z3;
        Object next2;
        boolean zEquals;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z4 = true;
        byte b2 = 0;
        Object[] objArr = 0;
        qg3 qg3Var = null;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                qb6 qb6Var = (qb6) obj;
                qb6Var.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                dq dqVar = new dq((fu6) obj2, map, map2);
                Class cls = qb6Var.a;
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i = 0;
                while (i < length) {
                    Method method = declaredMethods[i];
                    v15 v15VarE = v15.e(method.getName());
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    int length2 = parameterTypes.length;
                    for (int i2 = b2; i2 < length2; i2++) {
                        Class<?> cls2 = parameterTypes[i2];
                        cls2.getClass();
                        sb.append(ia6.b(cls2));
                    }
                    sb.append(")");
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    sb.append(ia6.b(returnType));
                    String string = sb.toString();
                    String strB = v15VarE.b();
                    strB.getClass();
                    z47 z47Var = new z47(dqVar, new gt4(strB.concat(string)));
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    declaredAnnotations.getClass();
                    int length3 = declaredAnnotations.length;
                    for (int i3 = b2; i3 < length3; i3++) {
                        Annotation annotation = declaredAnnotations[i3];
                        annotation.getClass();
                        yn0.U(z47Var, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    parameterAnnotations.getClass();
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length4 = annotationArr.length;
                    int i4 = b2;
                    while (i4 < length4) {
                        Annotation[] annotationArr2 = annotationArr[i4];
                        annotationArr2.getClass();
                        int length5 = annotationArr2.length;
                        int i5 = b2;
                        while (i5 < length5) {
                            Annotation annotation2 = annotationArr2[i5];
                            Class cls3 = cls;
                            Class clsM = zc1.M(zc1.K(annotation2));
                            Method[] methodArr = declaredMethods;
                            int i6 = length;
                            fc8 fc8VarT = z47Var.T(i4, ia6.a(clsM), new ga6(annotation2));
                            if (fc8VarT != null) {
                                yn0.V(fc8VarT, annotation2, clsM);
                            }
                            i5++;
                            cls = cls3;
                            declaredMethods = methodArr;
                            length = i6;
                        }
                        i4++;
                        b2 = 0;
                    }
                    z47Var.c();
                    i++;
                    b2 = 0;
                }
                Class cls4 = cls;
                Constructor<?>[] declaredConstructors = cls4.getDeclaredConstructors();
                declaredConstructors.getClass();
                int length6 = declaredConstructors.length;
                int i7 = 0;
                while (i7 < length6) {
                    Constructor<?> constructor = declaredConstructors[i7];
                    v15 v15Var = hf7.e;
                    constructor.getClass();
                    StringBuilder sb2 = new StringBuilder("(");
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    parameterTypes2.getClass();
                    for (Class<?> cls5 : parameterTypes2) {
                        cls5.getClass();
                        sb2.append(ia6.b(cls5));
                    }
                    sb2.append(")V");
                    String string2 = sb2.toString();
                    v15Var.getClass();
                    String strB2 = v15Var.b();
                    strB2.getClass();
                    z47 z47Var2 = new z47(dqVar, new gt4(strB2.concat(string2)));
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    declaredAnnotations2.getClass();
                    for (Annotation annotation3 : declaredAnnotations2) {
                        annotation3.getClass();
                        yn0.U(z47Var2, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    if (parameterAnnotations2.length != 0) {
                        int length7 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length8 = parameterAnnotations2.length;
                        for (int i8 = 0; i8 < length8; i8++) {
                            Annotation[] annotationArr3 = parameterAnnotations2[i8];
                            annotationArr3.getClass();
                            int length9 = annotationArr3.length;
                            int i9 = 0;
                            while (i9 < length9) {
                                Constructor<?>[] constructorArr = declaredConstructors;
                                Annotation annotation4 = annotationArr3[i9];
                                int i10 = length6;
                                Class clsM2 = zc1.M(zc1.K(annotation4));
                                int i11 = i7;
                                int i12 = length7;
                                Annotation[][] annotationArr4 = parameterAnnotations2;
                                fc8 fc8VarT2 = z47Var2.T(i8 + length7, ia6.a(clsM2), new ga6(annotation4));
                                if (fc8VarT2 != null) {
                                    yn0.V(fc8VarT2, annotation4, clsM2);
                                }
                                i9++;
                                declaredConstructors = constructorArr;
                                i7 = i11;
                                length6 = i10;
                                length7 = i12;
                                parameterAnnotations2 = annotationArr4;
                            }
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    int i13 = length6;
                    int i14 = i7;
                    z47Var2.c();
                    i7 = i14 + 1;
                    declaredConstructors = constructorArr2;
                    length6 = i13;
                }
                Field[] declaredFields = cls4.getDeclaredFields();
                declaredFields.getClass();
                int length10 = declaredFields.length;
                int i15 = 0;
                while (i15 < length10) {
                    Field field = declaredFields[i15];
                    v15 v15VarE2 = v15.e(field.getName());
                    Class<?> type = field.getType();
                    type.getClass();
                    String strB3 = ia6.b(type);
                    String strB4 = v15VarE2.b();
                    strB4.getClass();
                    gt4 gt4Var = new gt4(strB4 + '#' + strB3);
                    ArrayList arrayList = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    declaredAnnotations3.getClass();
                    int length11 = declaredAnnotations3.length;
                    int i16 = 0;
                    while (i16 < length11) {
                        Annotation annotation5 = declaredAnnotations3[i16];
                        annotation5.getClass();
                        Class clsM3 = zc1.M(zc1.K(annotation5));
                        Field[] fieldArr = declaredFields;
                        fc8 fc8VarB0 = ((fu6) dqVar.Y).b0(ia6.a(clsM3), new ga6(annotation5), arrayList);
                        if (fc8VarB0 != null) {
                            yn0.V(fc8VarB0, annotation5, clsM3);
                        }
                        i16++;
                        declaredFields = fieldArr;
                    }
                    Field[] fieldArr2 = declaredFields;
                    if (!arrayList.isEmpty()) {
                        ((HashMap) dqVar.Z).put(gt4Var, arrayList);
                    }
                    i15++;
                    declaredFields = fieldArr2;
                }
                return new um(map, map2, map3);
            case 1:
                ((z14) obj).getClass();
                return (aa7) ((l0) obj2).Y.Y.invoke();
            case 2:
                ws3 ws3Var = (ws3) obj2;
                fk2 fk2Var = (fk2) obj;
                fk2Var.getClass();
                oa0 oa0VarC = ws3Var.c(fk2Var);
                if (oa0VarC == null) {
                    return null;
                }
                hl1 hl1Var = ws3Var.c;
                if (hl1Var != null) {
                    oa0VarC.I0(hl1Var);
                    return oa0VarC;
                }
                dh3.T("components");
                throw null;
            case 3:
                km1 km1Var = (km1) obj2;
                mo8 mo8Var = (mo8) obj;
                mo8Var.getClass();
                if (vr3.J(mo8Var)) {
                    z = false;
                } else {
                    ot0 ot0VarX = mo8Var.n0().x();
                    if (!(ot0VarX instanceof hi8) || dh3.f(((hi8) ot0VarX).p(), km1Var)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                i3 i3Var = (i3) obj2;
                h3 h3Var = (h3) obj;
                h3Var.getClass();
                lh4 lh4VarD = i3Var.d();
                Collection collection = h3Var.a;
                lh4VarD.getClass();
                collection.getClass();
                if (collection.isEmpty()) {
                    t14 t14VarB = i3Var.b();
                    List listK = t14VarB != null ? i21.K(t14VarB) : null;
                    if (listK == null) {
                        listK = d02.X;
                    }
                    collection = listK;
                }
                List listY0 = collection instanceof List ? (List) collection : null;
                if (listY0 == null) {
                    listY0 = wv0.Y0(collection);
                }
                List listI = i3Var.i(listY0);
                listI.getClass();
                h3Var.b = listI;
                return dn8Var;
            case 5:
                do5.h((do5) obj, (eo5) obj2, 0, 0);
                return dn8Var;
            case 6:
                do5 do5Var = (do5) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                int size = arrayList2.size() - 1;
                if (size >= 0) {
                    int i17 = 0;
                    while (true) {
                        do5.h(do5Var, (eo5) arrayList2.get(i17), 0, 0);
                        if (i17 != size) {
                            i17++;
                        }
                    }
                }
                return dn8Var;
            case 7:
                ((pm0) obj2).cancel();
                return dn8Var;
            case 8:
                ((ld0) obj).getClass();
                return Boolean.valueOf(ff7.i.containsKey(w45.z((q97) obj2)));
            case 9:
                ((Call) obj2).cancel();
                return dn8Var;
            case 10:
                cb6 cb6Var = (cb6) obj;
                cb6Var.getClass();
                if (((Boolean) ((js0) obj2).b.B(cb6Var)).booleanValue()) {
                    Class<?> declaringClass = ((Method) cb6Var.b()).getDeclaringClass();
                    declaringClass.getClass();
                    if (declaringClass.isInterface()) {
                        String strB5 = cb6Var.c().b();
                        int iHashCode = strB5.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB5.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) cb6Var.g()).isEmpty();
                                }
                            } else if (strB5.equals("equals")) {
                                ib6 ib6Var = (ib6) wv0.Q0(cb6Var.g());
                                gb6 gb6Var = ib6Var != null ? ib6Var.a : null;
                                va6 va6Var = gb6Var instanceof va6 ? (va6) gb6Var : null;
                                if (va6Var != null) {
                                    zj3 zj3Var = va6Var.b;
                                    if ((zj3Var instanceof ta6) && (fk2VarC = ((ta6) zj3Var).c()) != null && dh3.f(fk2VarC.a.a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB5.equals("toString")) {
                            zIsEmpty = ((ArrayList) cb6Var.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        z2 = zIsEmpty ? false : true;
                    }
                }
                return Boolean.valueOf(z2);
            case 11:
                os0 os0Var = (os0) obj2;
                ns0 ns0Var = (ns0) obj;
                ns0Var.getClass();
                qs0 qs0Var = ns0Var.a;
                hl1 hl1Var2 = os0Var.a;
                Iterator it = hl1Var2.k.iterator();
                while (it.hasNext()) {
                    sx4 sx4VarA = ((ls0) it.next()).a(qs0Var);
                    if (sx4VarA != null) {
                        return sx4VarA;
                    }
                }
                if (os0.c.contains(qs0Var)) {
                    return null;
                }
                hs0 hs0VarY = ns0Var.b;
                if (hs0VarY == null && (hs0VarY = hl1Var2.d.y(qs0Var)) == null) {
                    return null;
                }
                w15 w15Var = hs0VarY.a;
                fy5 fy5Var = hs0VarY.b;
                s50 s50Var = hs0VarY.c;
                ke7 ke7Var = hs0VarY.d;
                qs0 qs0VarE = qs0Var.e();
                if (qs0VarE != null) {
                    sx4 sx4VarA2 = os0Var.a(qs0VarE, null);
                    vl1 vl1Var = sx4VarA2 instanceof vl1 ? (vl1) sx4VarA2 : null;
                    if (vl1Var == null) {
                        return null;
                    }
                    if (!vl1Var.B0().m().contains(qs0Var.f())) {
                        return null;
                    }
                    jl1Var = vl1Var.n0;
                } else {
                    wf5 wf5Var = hl1Var2.f;
                    fk2 fk2Var2 = qs0Var.a;
                    wf5Var.getClass();
                    fk2Var2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    wf5Var.b(fk2Var2, arrayList3);
                    Iterator it2 = arrayList3.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            tf5Var2 = (tf5) next;
                            if (tf5Var2 instanceof oa0) {
                            }
                        } else {
                            next = null;
                        }
                        tf5Var = (tf5) next;
                        if (tf5Var == null) {
                            return null;
                        }
                        tz5 tz5Var = fy5Var.C0;
                        tz5Var.getClass();
                        ux4 ux4Var = new ux4(tz5Var);
                        dv8 dv8Var = dv8.b;
                        a06 a06Var = fy5Var.E0;
                        a06Var.getClass();
                        dv8 dv8VarB = z38.b(a06Var);
                        w15Var.getClass();
                        jl1Var = new jl1(hl1Var2, w15Var, (ed1) tf5Var, ux4Var, dv8VarB, s50Var, (xl1) null, (fc8) null, (List) d02.X);
                    } while (!((gm1) ((oa0) tf5Var2).K()).m().contains(qs0Var.f()));
                    tf5Var = (tf5) next;
                    if (tf5Var == null) {
                        return null;
                    }
                    tz5 tz5Var2 = fy5Var.C0;
                    tz5Var2.getClass();
                    ux4 ux4Var2 = new ux4(tz5Var2);
                    dv8 dv8Var2 = dv8.b;
                    a06 a06Var2 = fy5Var.E0;
                    a06Var2.getClass();
                    dv8 dv8VarB2 = z38.b(a06Var2);
                    w15Var.getClass();
                    jl1Var = new jl1(hl1Var2, w15Var, (ed1) tf5Var, ux4Var2, dv8VarB2, s50Var, (xl1) null, (fc8) null, (List) d02.X);
                }
                return new vl1(jl1Var, fy5Var, w15Var, s50Var, ke7Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                vx4 vx4Var = (vx4) obj;
                vx4Var.getClass();
                return vx4Var.f().r((du5) obj2);
            case 13:
                ld0 ld0Var = (ld0) obj;
                if (ld0Var != null) {
                    ((al1) obj2).p.z(ld0Var);
                    return dn8Var;
                }
                bt.q("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                GeoFileKey geoFileKey = (GeoFileKey) entry.getKey();
                StateDownloadFileV2 stateDownloadFileV2 = (StateDownloadFileV2) entry.getValue();
                RouteProfile routeProfileN = ((mn6) ((dr2) obj2).b.getValue()).n(geoFileKey.getProfileId(), geoFileKey.getSubId());
                kw4 kw4Var = kw4.a;
                SubscriptionItem subscriptionItemF = kw4.f(geoFileKey.getSubId());
                if (routeProfileN != null) {
                    return new ir2(geoFileKey, stateDownloadFileV2, routeProfileN.getData().getName(), subscriptionItemF != null ? subscriptionItemF.getRemarks() : null);
                }
                return null;
            case 15:
                KeyEvent keyEvent = ((cx3) obj).a;
                eh2 eh2Var = (eh2) obj2;
                keyEvent.getClass();
                long jD = pu.d(keyEvent.getKeyCode());
                if (!ax3.a(jD, ax3.d) || w39.S(keyEvent) != 2) {
                    if (ax3.a(jD, ax3.e) && w39.S(keyEvent) == 2) {
                        ((gh2) eh2Var).g(6, true);
                    } else {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
                ((gh2) eh2Var).g(5, true);
                z3 = true;
                return Boolean.valueOf(z3);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qg3 qg3Var2 = (qg3) obj2;
                z14 z14Var = (z14) obj;
                z14Var.getClass();
                LinkedHashSet linkedHashSet = qg3Var2.Y;
                ArrayList arrayList4 = new ArrayList(xv0.Z(linkedHashSet, 10));
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((t14) it3.next()).p0(z14Var));
                    objArr = 1;
                }
                if (objArr != 0) {
                    t14 t14Var = qg3Var2.X;
                    t14 t14VarS0 = t14Var != null ? t14Var.p0(z14Var) : null;
                    arrayList4.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList4);
                    linkedHashSet2.hashCode();
                    qg3 qg3Var3 = new qg3(linkedHashSet2);
                    qg3Var3.X = t14VarS0;
                    qg3Var = qg3Var3;
                }
                if (qg3Var != null) {
                    qg3Var2 = qg3Var;
                }
                return qg3Var2.a();
            case 17:
                b24 b24Var = (b24) obj2;
                fk2 fk2Var3 = (fk2) obj;
                fk2Var3.getClass();
                fk2 fk2Var4 = el3.a;
                g75.D.getClass();
                zz2 zz2Var = f75.b;
                zz2Var.getClass();
                je6 je6Var = (je6) ((vt1) zz2Var.Z).B(fk2Var3);
                if (je6Var != null) {
                    return je6Var;
                }
                zz2 zz2Var2 = el3.c;
                zz2Var2.getClass();
                fl3 fl3Var = (fl3) ((vt1) zz2Var2.Z).B(fk2Var3);
                if (fl3Var == null) {
                    return je6.IGNORE;
                }
                b24 b24Var2 = fl3Var.b;
                return (b24Var2 == null || b24Var2.f0 - b24Var.f0 > 0) ? fl3Var.a : fl3Var.c;
            case 18:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                String str = (String) qg5Var.X;
                String str2 = (String) qg5Var.Y;
                List listK2 = i21.K(pm.a(((us3) obj2).X.h0, pc6.q("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                return listK2.isEmpty() ? oy1.f0 : new vm(listK2, b2);
            case 19:
                n44 n44Var = (n44) obj2;
                ja6 ja6Var = (ja6) obj;
                ja6Var.getClass();
                v15 v15Var2 = uj3.a;
                return uj3.b(ja6Var, n44Var.X, n44Var.Z);
            case 20:
                p44 p44Var = (p44) obj2;
                ((z14) obj).getClass();
                return new t44(p44Var.l0, p44Var, p44Var.j0, p44Var.k0 != null, p44Var.s0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                et4 et4Var = (et4) obj;
                et4Var.getClass();
                return et4Var.f((v15) obj2, x45.g0);
            case 22:
                xm0 xm0Var = (xm0) obj2;
                hb6 hb6Var = (hb6) obj;
                hb6Var.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xm0Var.Z;
                ed1 ed1Var = (ed1) xm0Var.g0;
                Integer num = (Integer) linkedHashMap.get(hb6Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                z47 z47Var3 = (z47) xm0Var.f0;
                z47Var3.getClass();
                return new j54(pu.q(new z47((c6) z47Var3.Y, xm0Var, (g44) z47Var3.f0), ed1Var.getAnnotations()), hb6Var, xm0Var.Y + iIntValue, ed1Var);
            case 23:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            case 24:
                wx4 wx4Var = (wx4) obj2;
                fk2 fk2Var5 = (fk2) obj;
                fk2Var5.getClass();
                cg5 cg5Var = wx4Var.j0;
                ve4 ve4Var = wx4Var.g0;
                ((bg5) cg5Var).getClass();
                ve4Var.getClass();
                return new n74(wx4Var, fk2Var5, ve4Var);
            case 25:
                fk2 fk2Var6 = (fk2) obj;
                fk2Var6.getClass();
                Map map4 = (Map) ((zz2) obj2).Y;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map4.entrySet()) {
                    fk2 fk2Var7 = (fk2) entry2.getKey();
                    if (!fk2Var6.equals(fk2Var7)) {
                        fk2Var7.getClass();
                        if (dh3.f(fk2Var6.a.c() ? null : fk2Var6.b(), fk2Var7)) {
                        }
                    }
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it4 = linkedHashMap2.entrySet().iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        int length12 = z68.I0((fk2) ((Map.Entry) next2).getKey(), fk2Var6).a.a.length();
                        do {
                            Object next3 = it4.next();
                            int length13 = z68.I0((fk2) ((Map.Entry) next3).getKey(), fk2Var6).a.a.length();
                            if (length12 > length13) {
                                next2 = next3;
                                length12 = length13;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry3 = (Map.Entry) next2;
                if (entry3 != null) {
                    return entry3.getValue();
                }
                return null;
            case 26:
                obj.getClass();
                ((pc7) obj2).add(obj);
                return dn8Var;
            case 27:
                ((mm0) obj2).f(dn8Var);
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((z14) obj).getClass();
                el1.f((sx4) obj2);
                return null;
            default:
                ta6 ta6Var = (ta6) obj2;
                Method method2 = (Method) obj;
                if (method2.isSynthetic()) {
                    z4 = false;
                } else if (ta6Var.a.isEnum()) {
                    String name = method2.getName();
                    if (dh3.f(name, "values")) {
                        Class<?>[] parameterTypes3 = method2.getParameterTypes();
                        parameterTypes3.getClass();
                        if (parameterTypes3.length == 0) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (dh3.f(name, "valueOf")) {
                        zEquals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }

    public /* synthetic */ f0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
