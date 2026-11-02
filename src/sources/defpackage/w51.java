package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.Surface;
import androidx.compose.foundation.layout.b;
import io.sentry.c2;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w51 {
    public static final zy0 e;
    public static final zx6 l;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final zy0 f = new zy0(-1875201388, false, new l4(6));
    public static final zy0 g = new zy0(1608012273, false, new l4(7));
    public static final zy0 h = new zy0(1499649448, false, new l4(8));
    public static final zy0 i = new zy0(-620419371, false, new l4(9));
    public static final zy0 j = new zy0(1557776657, false, new l4(10));
    public static final zy0 k = new zy0(634362646, false, new l4(11));
    public static final dx0 m = new dx0(29);
    public static final float n = 3.0f;
    public static final cl6 o = new cl6();
    public static final wc2 p = new wc2(0);

    static {
        byte b2 = 5;
        e = new zy0(1164983891, false, new l4(b2));
        l = new zx6(b2);
    }

    public static final qb6 A(y45 y45Var, qs0 qs0Var, hv4 hv4Var) {
        qs0Var.getClass();
        hv4Var.getClass();
        String strX = mm7.X(qs0Var.b.a.a, '.', '$');
        fk2 fk2Var = qs0Var.a;
        if (!fk2Var.a.c()) {
            strX = fk2Var + '.' + strX;
        }
        vk1 vk1VarC = y45Var.C(strX);
        if (vk1VarC != null) {
            return (qb6) vk1VarC.Y;
        }
        return null;
    }

    public static final List B(pi1 pi1Var, String str) {
        pi1Var.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayListZ0 = wv0.Z0(pi1Var.a(str));
        while (!arrayListZ0.isEmpty()) {
            String str2 = (String) bw0.j0(arrayListZ0);
            linkedHashSet.add(str2);
            arrayListZ0.addAll(pi1Var.a(str2));
        }
        return wv0.Y0(linkedHashSet);
    }

    public static final sw3 C(TypeVariable typeVariable) throws IOException {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (ev3) yb6.a.b((Class) genericDeclaration);
        }
        boolean z = false;
        Object obj = null;
        if (genericDeclaration instanceof Constructor) {
            Class declaringClass = ((Constructor) genericDeclaration).getDeclaringClass();
            declaringClass.getClass();
            ev3 ev3Var = (ev3) yb6.a.b(declaringClass);
            Iterator it = ev3Var.u().iterator();
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
                if (dh3.f(i21.D((pv3) next), genericDeclaration)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            pk3 pk3Var = (pk3) obj;
            if (pk3Var != null) {
                return pk3Var;
            }
            StringBuilder sb = new StringBuilder("Constructor ");
            sb.append(genericDeclaration);
            sb.append(" is not found in ");
            sb.append(ev3Var);
            String strY0 = wv0.y0(ev3Var.u(), "\n", null, null, ag.A0, 30);
            sb.append(":\n");
            sb.append(strY0);
            throw new p14(sb.toString());
        }
        if (!(genericDeclaration instanceof Method)) {
            om0.h("Unsupported container of a type parameter: ", genericDeclaration, " (", typeVariable);
            return null;
        }
        Class<?> declaringClass2 = ((Method) genericDeclaration).getDeclaringClass();
        declaringClass2.getClass();
        ev3 ev3Var2 = (ev3) yb6.a.b(declaringClass2);
        Iterator it2 = u15.t(ev3Var2).iterator();
        Object obj3 = null;
        while (true) {
            if (!it2.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object next2 = it2.next();
            if (dh3.f(i21.F((pv3) next2), genericDeclaration)) {
                if (z) {
                    break;
                }
                z = true;
                obj3 = next2;
            }
        }
        qk3 qk3Var = (qk3) obj;
        if (qk3Var != null) {
            return qk3Var;
        }
        StringBuilder sb2 = new StringBuilder("Method ");
        sb2.append(genericDeclaration);
        sb2.append(" is not found in ");
        sb2.append(ev3Var2);
        String strY1 = wv0.y0(u15.t(ev3Var2), "\n", null, null, ag.u0, 30);
        sb2.append(":\n");
        sb2.append(strY1);
        throw new p14(sb2.toString());
    }

    public static final boolean D(Member member) {
        member.getClass();
        if (!(member instanceof Method)) {
            return false;
        }
        Method method = (Method) member;
        if (!method.getDeclaringClass().isEnum() || !Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        if (dh3.f(method.getName(), "values") && method.getParameterTypes().length == 0) {
            return true;
        }
        if (!dh3.f(method.getName(), "valueOf")) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return dh3.f(eu.E0(parameterTypes), String.class);
    }

    public static final boolean E(zu3 zu3Var) {
        zu3Var.getClass();
        return !dh3.f(zc1.M(zu3Var).getCanonicalName(), zu3Var.p());
    }

    public static final og7 F(b71 b71Var, s61 s61Var, e71 e71Var, rn2 rn2Var) {
        s61 s61VarM = ch3.M(b71Var, s61Var);
        e71Var.getClass();
        og7 r74Var = e71Var == e71.Y ? new r74(s61VarM, rn2Var) : new og7(s61VarM, true);
        r74Var.n0(e71Var, r74Var, rn2Var);
        return r74Var;
    }

    public static og7 G(b71 b71Var, s61 s61Var, e71 e71Var, rn2 rn2Var, int i2) {
        if ((i2 & 1) != 0) {
            s61Var = b02.X;
        }
        if ((i2 & 2) != 0) {
            e71Var = e71.X;
        }
        return F(b71Var, s61Var, e71Var, rn2Var);
    }

    public static final float H(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int I(int i2, float f2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static final jx4 J(nh1 nh1Var, int i2) {
        jx4 jx4Var = ((jx4) nh1Var).X.h0;
        if (jx4Var == null || (jx4Var.f0 & i2) == 0) {
            return null;
        }
        while (jx4Var != null) {
            int i3 = jx4Var.Z;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return jx4Var;
            }
            jx4Var = jx4Var.h0;
        }
        return null;
    }

    public static final mj0 K(nb6 nb6Var, String str) {
        str.getClass();
        lo2 lo2VarO = ms8.o(str);
        ArrayList arrayList = lo2VarO.c;
        boolean zF = dh3.f(wv0.B0(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = nr4.C(nb6Var).size() + (zF ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(wv0.U0(arrayList, arrayList.size() - size));
        for (qg5 qg5Var : wv0.e1(nr4.C(nb6Var), wv0.V0(size, arrayList))) {
            ob6 ob6Var = (ob6) qg5Var.X;
            String str2 = (String) qg5Var.Y;
            ob6Var.getClass();
            if (ob6Var.t() && ms8.i(ob6Var.B())) {
                Iterator it = w27.f0(w27.i0(ob6Var.B(), ve7.n0), 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ms8.k((pw3) it.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            lv3 lv3VarM = ob6Var.B().M();
                            lv3VarM.getClass();
                            StringBuilder sb = new StringBuilder("L");
                            String strReplace = ((ev3) ((zu3) lv3VarM)).Y.getName().replace('.', '/');
                            strReplace.getClass();
                            sb.append(strReplace);
                            sb.append(';');
                            arrayList2.add(sb.toString());
                            break;
                        }
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zF) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new mj0(str, m02.X) : new mj0(wv0.y0(arrayList2, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")", null, 56).concat(lo2VarO.b), linkedHashSet);
    }

    public static final j31 L(dn2 dn2Var) {
        return new j31(new td7(dn2Var, null), (byte) 7);
    }

    public static LinkedHashMap M() {
        si7 si7Var = si7.Y;
        qg5 qg5Var = new qg5(si7Var, 0L);
        si7 si7Var2 = si7.X;
        return zp4.K(new qg5(bd8.Y, zp4.K(qg5Var, new qg5(si7Var2, 0L))), new qg5(bd8.X, zp4.K(new qg5(si7Var, 0L), new qg5(si7Var2, 0L))));
    }

    public static final u1 N(s97 s97Var, Type type, gi8 gi8Var, boolean z) {
        if (z) {
            return s97Var;
        }
        lv3 lv3Var = s97Var.Y;
        List<uw3> list = s97Var.Z;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (uw3 uw3Var : list) {
            pw3 pw3Var = uw3Var.b;
            if (pw3Var != null) {
                uw3Var = new uw3(pw3Var, yw3.Z);
            }
            arrayList.add(uw3Var);
        }
        s97 s97VarR = r(type, lv3Var, arrayList, gi8Var != gi8.X);
        v51 v51Var = new v51(type, (byte) 1);
        boolean zEquals = s97Var.equals(s97VarR);
        Object ae2Var = s97Var;
        if (!zEquals) {
            ae2Var = new ae2(s97Var, s97VarR, false, v51Var);
        }
        return (ae2) ae2Var;
    }

    public static final List O(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(wv0.r0(list));
        }
        return d02.X;
    }

    public static final Map P(Map map) {
        int size = map.size();
        if (size == 0) {
            return e02.X;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) wv0.q0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0317  */
    /* JADX WARN: Code duplicated, block: B:129:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public static pw3 Q(Type type, Map map, gi8 gi8Var, boolean z, boolean z2, aj8 aj8Var, int i2) throws IOException {
        pw3 pw3Var;
        s97 s97VarR;
        ArrayList arrayList;
        ag agVar = ag.z0;
        ag agVar2 = ag.y0;
        int i3 = i2 & 2;
        gi8 gi8Var2 = gi8.Z;
        gi8 gi8Var3 = i3 != 0 ? gi8Var2 : gi8Var;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        aj8 aj8Var2 = (i2 & 16) != 0 ? aj8.Y : aj8Var;
        type.getClass();
        gi8Var3.getClass();
        aj8Var2.getClass();
        if (type.equals(Void.TYPE)) {
            return rg7.e;
        }
        boolean z5 = type instanceof Class;
        uw3 uw3VarS = null;
        if (z5) {
            Class cls = (Class) type;
            if (!f(cls).isEmpty() && !z4) {
                zu3 zu3VarB = (z3 && cls.equals(Class.class)) ? yb6.a.b(zu3.class) : yb6.a.b(cls);
                List listF = f(cls);
                ArrayList arrayList2 = new ArrayList(xv0.Z(listF, 10));
                int i4 = 0;
                for (Object obj : listF) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        i21.X();
                        throw null;
                    }
                    Type[] bounds = ((TypeVariable) w27.k0(w27.i0((TypeVariable) obj, ag.v0))).getBounds();
                    bounds.getClass();
                    Type type2 = (Type) eu.r0(bounds);
                    gi8 gi8Var4 = gi8.X;
                    if (!z3) {
                        if (!E(zu3VarB)) {
                            gi8Var4 = gi8Var2;
                        } else if (!z68.p0(w45.E((lv3) yn0.o(zu3VarB).get(i4), null, 7), rg7.a)) {
                            gi8Var4 = gi8.Y;
                        }
                    }
                    uw3 uw3Var = uw3.c;
                    type2.getClass();
                    arrayList2.add(hi5.g0(Q(type2, map, gi8Var4, false, true, null, 20)));
                    i4 = i5;
                }
                s97 s97VarR2 = r(cls, zu3VarB, arrayList2, false);
                s97 s97VarS = s(s97VarR2, cls);
                if (s97VarS != null) {
                    s97VarR2 = s97VarS;
                }
                List<TypeVariable> listF2 = f(cls);
                ArrayList arrayList3 = new ArrayList(xv0.Z(listF2, 10));
                for (TypeVariable typeVariable : listF2) {
                    arrayList3.add(uw3.c);
                }
                s97 s97VarR3 = r(cls, zu3VarB, arrayList3, true);
                return s97VarR2.equals(s97VarR3) ? s97VarR2 : new ae2(s97VarR2, s97VarR3, true, new f3(cls, (byte) 6));
            }
            if (cls.isArray()) {
                if (!cls.getComponentType().isPrimitive()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    uw3VarS = S(componentType, map, z3);
                }
                return N(r(type, yb6.a.b(cls), i21.M(uw3VarS), false), type, gi8Var3, z3);
            }
            zu3 zu3VarB2 = yb6.a.b(cls);
            List<TypeVariable> listF3 = f(cls);
            ArrayList arrayList4 = new ArrayList(xv0.Z(listF3, 10));
            for (TypeVariable typeVariable2 : listF3) {
                arrayList4.add(uw3.c);
            }
            s97VarR = r(type, zu3VarB2, arrayList4, false);
            pw3Var = null;
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                uw3 uw3VarS2 = S(genericComponentType, map, z3);
                pw3 pw3Var2 = uw3VarS2.b;
                pw3Var2.getClass();
                return N(r(type, yb6.a.b(ms8.e(zc1.M(ci8.v(pw3Var2)))), i21.K(uw3VarS2), false), type, gi8Var3, z3);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                pw3Var = null;
                Class cls2 = (Class) rawType;
                zu3 zu3VarB3 = (z3 && cls2.equals(Class.class)) ? yb6.a.b(zu3.class) : yb6.a.b(cls2);
                if (z4) {
                    List<Type> listN0 = w27.n0(new sd2(w27.i0(parameterizedType, agVar2), agVar, z27.X));
                    arrayList = new ArrayList(xv0.Z(listN0, 10));
                    for (Type type3 : listN0) {
                        arrayList.add(uw3.c);
                    }
                } else {
                    List listN1 = w27.n0(new sd2(w27.i0(parameterizedType, agVar2), agVar, z27.X));
                    arrayList = new ArrayList(xv0.Z(listN1, 10));
                    Iterator it = listN1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(S((Type) it.next(), map, z3));
                    }
                }
                s97VarR = r(type, zu3VarB3, arrayList, false);
            } else {
                pw3Var = null;
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        xw3.j(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls3 = type.getClass();
                    sb.append(" (");
                    sb.append(cls3);
                    sb.append(')');
                    throw new p14(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                rw3 rw3Var = (rw3) map.get(typeVariable3);
                if (rw3Var == null) {
                    List typeParameters = C(typeVariable3).getTypeParameters();
                    TypeVariable<?>[] typeParameters2 = typeVariable3.getGenericDeclaration().getTypeParameters();
                    typeParameters2.getClass();
                    rw3Var = (rw3) wv0.u0(eu.v0(typeVariable3, typeParameters2), typeParameters);
                    if (rw3Var == null) {
                        throw new p14("Type parameter " + typeVariable3.getName() + " is not found in " + C(typeVariable3));
                    }
                }
                s97VarR = r(type, rw3Var, d02.X, false);
            }
        }
        if (!z3) {
            s97 s97VarS2 = s(s97VarR, type);
            if (aj8Var2 != aj8.X) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    actualTypeArguments.getClass();
                    Type type4 = (Type) eu.y0(actualTypeArguments);
                    if ((type4 instanceof WildcardType) && ((WildcardType) type4).getLowerBounds().length == 1 && s97VarS2 != 0) {
                        lv3 lv3Var = s97VarS2.Y;
                        lv3Var.getClass();
                        if (((rw3) wv0.A0(((zu3) lv3Var).getTypeParameters())).g0 == yw3.Z) {
                            if (s97VarS2 == 0) {
                                s97VarS2 = s97VarR;
                            }
                        }
                    }
                }
                if (s97VarS2 != 0) {
                    v51 v51Var = new v51(type, (byte) 0);
                    if (!s97VarS2.equals(s97VarR)) {
                        s97VarS2 = new ae2(s97VarS2, s97VarR, false, v51Var);
                    }
                } else {
                    s97VarS2 = s97VarR;
                }
            } else if (s97VarS2 == 0) {
                s97VarS2 = s97VarR;
            }
            int iOrdinal = gi8Var3.ordinal();
            if (iOrdinal == 0) {
                return s97VarS2;
            }
            if (iOrdinal == 1) {
                return s97VarS2.S(true);
            }
            if (iOrdinal != 2) {
                b61.c();
                return pw3Var;
            }
            if (!z5 || !((Class) type).isPrimitive()) {
                u1 u1VarK = s97VarS2.K();
                u1 u1Var = u1VarK;
                if (u1VarK == null) {
                    u1Var = s97VarS2;
                }
                u1 u1VarT = s97VarS2.T();
                u1 u1Var2 = s97VarS2;
                if (u1VarT != null) {
                    u1Var2 = u1VarT;
                }
                u1 u1VarS = u1Var2.S(true);
                return u1Var.equals(u1VarS) ? u1Var : new ae2(u1Var, u1VarS, false, new v51(type, (byte) 2));
            }
        }
        return s97VarR;
    }

    public static final List R(TypeVariable[] typeVariableArr, sw3 sw3Var) {
        sw3 sw3VarH0;
        typeVariableArr.getClass();
        int iG = aq4.G(typeVariableArr.length);
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (TypeVariable typeVariable : typeVariableArr) {
            kb6 kb6Var = sw3Var instanceof kb6 ? (kb6) sw3Var : null;
            if (kb6Var == null || (sw3VarH0 = mb6.h0(kb6Var)) == null) {
                sw3VarH0 = sw3Var;
            }
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new rw3(null, sw3VarH0, name, yw3.X));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            rw3 rw3Var = (rw3) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList.add(Q(type, linkedHashMap, null, false, false, null, 30));
            }
            rw3Var.getClass();
            rw3Var.i0 = arrayList;
        }
        return wv0.Y0(linkedHashMap.values());
    }

    public static final uw3 S(Type type, Map map, boolean z) {
        if (!(type instanceof WildcardType)) {
            uw3 uw3Var = uw3.c;
            return hi5.g0(Q(type, map, null, z, false, null, 26));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            xw3.j(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            uw3 uw3Var2 = uw3.c;
            Object objD0 = eu.D0(lowerBounds);
            objD0.getClass();
            pw3 pw3VarQ = Q((Type) objD0, map, null, z, false, null, 26);
            pw3VarQ.getClass();
            return new uw3(pw3VarQ, yw3.Y);
        }
        if (upperBounds.length != 1) {
            return uw3.c;
        }
        if (dh3.f((Type) eu.D0(upperBounds), Object.class)) {
            return uw3.c;
        }
        uw3 uw3Var3 = uw3.c;
        Object objD1 = eu.D0(upperBounds);
        objD1.getClass();
        pw3 pw3VarQ2 = Q((Type) objD1, map, null, z, false, null, 26);
        pw3VarQ2.getClass();
        return new uw3(pw3VarQ2, yw3.Z);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final i12 T(i12 i12Var, v63 v63Var, pd5 pd5Var, oy1 oy1Var, s51 s51Var) {
        o12 o12Var;
        List list;
        int i2;
        boolean z;
        Bitmap bitmapO;
        int size;
        Bitmap bitmap;
        oy1 oy1Var2;
        i12 i12Var2 = i12Var;
        v63 v63Var2 = v63Var;
        pd5 pd5Var2 = pd5Var;
        if (s51Var instanceof o12) {
            o12Var = (o12) s51Var;
            int i3 = o12Var.n0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o12Var.n0 = i3 - Integer.MIN_VALUE;
            } else {
                o12Var = new o12(s51Var);
            }
        } else {
            o12Var = new o12(s51Var);
        }
        Object obj = o12Var.m0;
        int i4 = o12Var.n0;
        if (i4 == 0) {
            w39.n0(obj);
            list = (List) z68.F(v63Var2, y63.a);
            if (list.isEmpty()) {
                return i12Var2;
            }
            d53 d53Var = i12Var2.a;
            boolean z2 = d53Var instanceof d60;
            if (!z2 && !((Boolean) z68.F(v63Var2, y63.d)).booleanValue()) {
                return i12Var2;
            }
            i2 = 0;
            if (z2) {
                Bitmap bitmap2 = ((d60) d53Var).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (eu.Z(config, at8.a)) {
                    bitmapO = bitmap2;
                } else {
                    Drawable drawableG = z39.g(d53Var, pd5Var2.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) z68.G(pd5Var2, b73.b);
                    ta7 ta7Var = pd5Var2.b;
                    pw6 pw6Var = pd5Var2.c;
                    ta7 ta7Var2 = (ta7) z68.G(pd5Var2, y63.b);
                    if (pd5Var2.d == tr5.Y) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bitmapO = ci8.o(drawableG, config2, ta7Var, pw6Var, ta7Var2, z);
                }
            } else {
                Drawable drawableG2 = z39.g(d53Var, pd5Var2.a.getResources());
                Bitmap.Config config3 = (Bitmap.Config) z68.G(pd5Var2, b73.b);
                ta7 ta7Var3 = pd5Var2.b;
                pw6 pw6Var2 = pd5Var2.c;
                ta7 ta7Var4 = (ta7) z68.G(pd5Var2, y63.b);
                if (pd5Var2.d == tr5.Y) {
                    z = true;
                } else {
                    z = false;
                }
                bitmapO = ci8.o(drawableG2, config3, ta7Var3, pw6Var2, ta7Var4, z);
            }
            oy1Var.getClass();
            size = list.size();
            bitmap = bitmapO;
            oy1Var2 = oy1Var;
        } else {
            if (i4 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = o12Var.l0;
            int i6 = o12Var.k0;
            List list2 = o12Var.j0;
            oy1Var2 = o12Var.i0;
            pd5 pd5Var3 = o12Var.h0;
            v63 v63Var3 = o12Var.g0;
            i12 i12Var3 = o12Var.f0;
            w39.n0(obj);
            s61 s61Var = o12Var.Y;
            s61Var.getClass();
            u70.I(s61Var);
            size = i5;
            i12Var2 = i12Var3;
            bitmap = (Bitmap) obj;
            list = list2;
            pd5Var2 = pd5Var3;
            i2 = i6 + 1;
            v63Var2 = v63Var3;
        }
        if (i2 >= size) {
            oy1Var2.getClass();
            return new i12(new d60(bitmap), i12Var2.b, i12Var2.c, i12Var2.d);
        }
        if (list.get(i2) != null) {
            c2.m();
            return null;
        }
        ta7 ta7Var5 = pd5Var2.b;
        o12Var.f0 = i12Var2;
        o12Var.g0 = v63Var2;
        o12Var.h0 = pd5Var2;
        o12Var.i0 = oy1Var2;
        o12Var.j0 = list;
        o12Var.k0 = i2;
        o12Var.l0 = size;
        o12Var.n0 = 1;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a07 U(final o8 o8Var, final xr0 xr0Var, a07 a07Var) {
        q71 q71Var;
        int i2 = xr0Var.c;
        int i3 = xr0Var.b;
        boolean z = o8Var.Y;
        final int i4 = z ? i3 : i2;
        x78 x78Var = (x78) xr0Var.e;
        int i5 = xr0Var.d;
        c07 c07Var = new c07(xr0Var, i4, (byte) 0);
        w74 w74Var = w74.Y;
        final g44 g44VarP = x97.P(w74Var, c07Var);
        final int i6 = z ? i2 : i3;
        g44 g44VarP2 = x97.P(w74Var, new dn2() { // from class: d07
            @Override // defpackage.dn2
            public final Object invoke() {
                xr0 xr0Var2 = xr0Var;
                x78 x78Var2 = (x78) xr0Var2.e;
                int iIntValue = ((Number) g44VarP.getValue()).intValue();
                o8 o8Var2 = o8Var;
                boolean z2 = o8Var2.Y;
                boolean z3 = o8Var2.k() == q71.X;
                int i7 = i4;
                long jK = x78Var2.k(i7);
                bz4 bz4Var = x78Var2.b;
                int i8 = f88.c;
                int iH = (int) (jK >> 32);
                int i9 = bz4Var.f;
                if (bz4Var.c(iH) != iIntValue) {
                    iH = iIntValue >= i9 ? x78Var2.h(i9 - 1) : x78Var2.h(iIntValue);
                }
                int iB = (int) (jK & 4294967295L);
                if (bz4Var.c(iB) != iIntValue) {
                    iB = iIntValue >= i9 ? bz4Var.b(i9 - 1, false) : bz4Var.b(iIntValue, false);
                }
                int i10 = i6;
                if (iH == i10) {
                    return xr0Var2.c(iB);
                }
                if (iB == i10) {
                    return xr0Var2.c(iH);
                }
                if (!(z2 ^ z3) ? i7 >= iH : i7 > iB) {
                    iH = iB;
                }
                return xr0Var2.c(iH);
            }
        });
        if (1 != a07Var.c) {
            return (a07) g44VarP2.getValue();
        }
        if (i4 == i5) {
            return a07Var;
        }
        if (((Number) g44VarP.getValue()).intValue() != x78Var.b.c(i5)) {
            return (a07) g44VarP2.getValue();
        }
        int i7 = a07Var.b;
        long jK = x78Var.k(i7);
        if (i5 != -1) {
            if (i4 != i5) {
                q71 q71Var2 = q71.X;
                if (i3 < i2) {
                    q71Var = q71.Y;
                } else {
                    q71Var = i3 > i2 ? q71Var2 : q71.Z;
                }
                if (((z ? 1 : 0) ^ (q71Var == q71Var2 ? (byte) 1 : (byte) 0)) == 0) {
                }
            }
            return xr0Var.c(i4);
        }
        int i8 = f88.c;
        return (i7 == ((int) (jK >> 32)) || i7 == ((int) (jK & 4294967295L))) ? (a07) g44VarP2.getValue() : xr0Var.c(i4);
    }

    public static boolean V(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static final Object W(s61 s61Var, rn2 rn2Var, q51 q51Var) {
        Unsafe unsafe;
        long j2;
        s61 s61VarW = q51Var.w();
        s61 s61VarB0 = !((Boolean) s61Var.U(new dx0((byte) 23), Boolean.FALSE)).booleanValue() ? s61VarW.B0(s61Var) : ch3.w(s61VarW, s61Var, false);
        u70.I(s61VarB0);
        if (s61VarB0 == s61VarW) {
            fx6 fx6Var = new fx6(q51Var, s61VarB0);
            return z38.d(fx6Var, true, fx6Var, rn2Var);
        }
        pz2 pz2Var = pz2.E0;
        if (dh3.f(s61VarB0.H0(pz2Var), s61VarW.H0(pz2Var))) {
            am8 am8Var = new am8(q51Var, s61VarB0);
            s61 s61Var2 = am8Var.f0;
            Object objC = g98.c(s61Var2, null);
            try {
                return z38.d(am8Var, true, am8Var, rn2Var);
            } finally {
                g98.a(s61Var2, objC);
            }
        }
        pp1 pp1Var = new pp1(q51Var, s61VarB0);
        try {
            op1.a(mb6.H(mb6.w(pp1Var, pp1Var, rn2Var)), dn8.a);
            do {
                unsafe = iu.a;
                j2 = pp1.h0;
                int intVolatile = unsafe.getIntVolatile(pp1Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        bt.i("Already suspended");
                        return null;
                    }
                    Object objA = sm3.a(pp1Var.M());
                    if (objA instanceof xx0) {
                        throw ((xx0) objA).a;
                    }
                    return objA;
                }
            } while (!unsafe.compareAndSwapInt(pp1Var, j2, 0, 1));
            return c71.X;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof mp1) {
                th2 = ((mp1) th2).X;
            }
            pp1Var.f(new rj6(th2));
            throw th2;
        }
    }

    public static final void a(final boolean z, final Object obj, final ke1 ke1Var, final la laVar, final gn2 gn2Var, lp2 lp2Var, final int i2) {
        int i3;
        lp2Var.X(-389387633);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? lp2Var.f(obj) : lp2Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? lp2Var.f(ke1Var) : lp2Var.h(ke1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.f(laVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 16384 : 8192;
        }
        boolean z2 = true;
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            boolean z3 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && lp2Var.h(ke1Var))) | (i4 == 2048);
            Object objK = lp2Var.K();
            q51 q51Var = null;
            be beVar = zz0.a;
            if (z3 || objK == beVar) {
                objK = new k(laVar, ke1Var, q51Var, (byte) 14);
                lp2Var.g0(objK);
            }
            u70.h((rn2) objK, lp2Var, ke1Var);
            Object value = laVar.d.getValue();
            boolean z4 = ((57344 & i3) == 16384) | (i4 == 2048);
            Object objK2 = lp2Var.K();
            if (z4 || objK2 == beVar) {
                objK2 = new k(gn2Var, laVar, q51Var, (byte) 15);
                lp2Var.g0(objK2);
            }
            u70.h((rn2) objK2, lp2Var, value);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z5 = ((i3 & 14) == 4) | (i4 == 2048);
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !lp2Var.h(obj))) {
                z2 = false;
            }
            boolean z6 = z5 | z2;
            Object objK3 = lp2Var.K();
            if (z6 || objK3 == beVar) {
                objK3 = new z81(z, laVar, obj, (q51) null);
                lp2Var.g0(objK3);
            }
            u70.h((rn2) objK3, lp2Var, boolValueOf);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: ty2
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    w51.a(z, obj, ke1Var, laVar, gn2Var, (lp2) obj2, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Object obj, final ke1 ke1Var, final zy0 zy0Var, final kx4 kx4Var, final la laVar, boolean z2, final gn2 gn2Var, gn2 gn2Var2, final zy0 zy0Var2, lp2 lp2Var, final int i2) {
        int i3;
        gn2 gn2Var3;
        final boolean z3;
        final gn2 gn2Var4;
        int i4;
        gn2 gn2Var5;
        boolean z4;
        ke1Var.getClass();
        lp2Var.X(627029022);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? lp2Var.f(obj) : lp2Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? lp2Var.f(ke1Var) : lp2Var.h(ke1Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.f(kx4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= lp2Var.f(laVar) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            gn2Var3 = gn2Var;
            i5 |= lp2Var.h(gn2Var3) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        } else {
            gn2Var3 = gn2Var;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= lp2Var.h(zy0Var2) ? 536870912 : 268435456;
        }
        if (lp2Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                i4 = i5 & (-234881025);
                gn2Var5 = g9.b;
                z4 = true;
            } else {
                lp2Var.Q();
                i4 = i5 & (-234881025);
                z4 = z2;
                gn2Var5 = gn2Var2;
            }
            lp2Var.q();
            boolean z5 = lp2Var.j(y01.n) == z24.X;
            int i6 = i4 & 112;
            boolean z6 = i6 == 32 || ((i4 & 64) != 0 && lp2Var.f(obj));
            Object objK = lp2Var.K();
            Object obj2 = zz0.a;
            if (z6 || objK == obj2) {
                objK = laVar == null ? new la(obj) : laVar;
                lp2Var.g0(objK);
            }
            la laVar2 = (la) objK;
            int i7 = (i4 & 14) | (((i4 >> 3) & 8) << 3) | i6 | (i4 & 896) | ((i4 >> 9) & 57344);
            int i8 = i4;
            a(z, obj, ke1Var, laVar2, gn2Var3, lp2Var, i7);
            p50 p50Var = pz2.Z;
            xr4 xr4VarC = g80.c(p50Var, false);
            boolean z7 = z5;
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, xr4VarC);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var, numValueOf);
            pn7.l(lp2Var);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            Integer numValueOf2 = Integer.valueOf(((i8 >> 6) & 112) | 6);
            l80 l80Var = l80.a;
            zy0Var.x(l80Var, lp2Var, numValueOf2);
            kx4 kx4VarY = l80.a(hx4.X, pz2.i0).y(b.a);
            boolean zF = lp2Var.f(laVar2) | lp2Var.g(z7);
            Object objK2 = lp2Var.K();
            if (zF || objK2 == obj2) {
                objK2 = new zs1((Object) laVar2, z7, (byte) 3);
                lp2Var.g0(objK2);
            }
            kx4 kx4VarE = dh3.E(kx4VarY, (gn2) objK2);
            sg8 sg8Var = g9.a;
            sg8 sg8Var2 = new sg8(0, (xx1) null, 7);
            Object obj3 = (fi1) lp2Var.j(y01.h);
            boolean zF2 = lp2Var.f(obj3) | lp2Var.f(laVar2) | lp2Var.f(gn2Var5) | lp2Var.f(sg8Var2);
            Object objK3 = lp2Var.K();
            if (zF2 || objK3 == obj2) {
                objK3 = new xc7(new lr((Object) laVar2, (Object) gn2Var5, (Object) new o7(obj3, (byte) 2), (byte) 6), sg8Var2);
                lp2Var.g0(objK3);
            }
            kx4 kx4VarY2 = kx4VarE.y(new h9(laVar2, z4, Boolean.TRUE, (xc7) objK3));
            xr4 xr4VarC2 = g80.c(p50Var, false);
            int iHashCode2 = Long.hashCode(lp2Var.T);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarY2);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC2);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            zy0Var2.x(l80Var, lp2Var, Integer.valueOf(6 | ((i8 >> 24) & 112)));
            lp2Var.p(true);
            lp2Var.p(true);
            z3 = z4;
            gn2Var4 = gn2Var5;
        } else {
            lp2Var.Q();
            z3 = z2;
            gn2Var4 = gn2Var2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: sy2
                @Override // defpackage.rn2
                public final Object K(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    w51.b(z, obj, ke1Var, zy0Var, kx4Var, laVar, z3, gn2Var, gn2Var4, zy0Var2, (lp2) obj4, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static cp3 c(gn2 gn2Var) {
        um3 um3Var = vm3.d;
        um3Var.getClass();
        kn3 kn3Var = new kn3();
        mn3 mn3Var = um3Var.a;
        boolean z = mn3Var.c;
        kn3Var.a = mn3Var.a;
        kn3Var.b = mn3Var.b;
        String str = mn3Var.d;
        String str2 = mn3Var.e;
        ps0 ps0Var = mn3Var.g;
        boolean z2 = mn3Var.f;
        g55 g55Var = um3Var.b;
        boolean z3 = mn3Var.h;
        gn2Var.B(kn3Var);
        if (!str.equals("    ")) {
            bt.q("Indent should not be specified when default printing mode is used");
            return null;
        }
        mn3 mn3Var2 = new mn3(kn3Var.a, kn3Var.b, z, str, str2, z2, ps0Var, z3);
        g55Var.getClass();
        return new cp3(mn3Var2, g55Var);
    }

    public static final void d(sn6 sn6Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        int i3;
        sn6Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-1749115688);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.f(sn6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ci8.a(kx4Var, null, jm4.U(-1551827252, new o90((Object) sn6Var, gn2Var, (byte) 11), lp2Var), lp2Var, ((i3 >> 6) & 14) | 384, 2);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) sn6Var, (Object) gn2Var, (Object) kx4Var, i2, (byte) 14);
        }
    }

    public static final b07 e(o8 o8Var, z70 z70Var) {
        q71 q71VarK = o8Var.k();
        xr0 xr0Var = (xr0) o8Var.f0;
        boolean z = q71VarK == q71.X;
        return new b07(h(xr0Var, z, true, z70Var), h(xr0Var, z, false, z70Var), z);
    }

    public static final List f(Class cls) {
        return w27.n0(new sd2(w27.i0(cls, ag.w0), ag.x0, a37.X));
    }

    public static final kx4 g(kx4 kx4Var, float f2) {
        return f2 == 1.0f ? kx4Var : jm4.J(kx4Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static final a07 h(xr0 xr0Var, boolean z, boolean z2, z70 z70Var) {
        long j2;
        long jR = z70Var.R(z2 ? xr0Var.b : xr0Var.c, xr0Var);
        if (z ^ z2) {
            int i2 = f88.c;
            j2 = jR >> 32;
        } else {
            int i3 = f88.c;
            j2 = 4294967295L & jR;
        }
        return xr0Var.c((int) j2);
    }

    public static final yg1 i(b71 b71Var, s61 s61Var, e71 e71Var, rn2 rn2Var) {
        s61 s61VarM = ch3.M(b71Var, s61Var);
        e71Var.getClass();
        yg1 j44Var = e71Var == e71.Y ? new j44(s61VarM, rn2Var) : new yg1(s61VarM, true);
        j44Var.n0(e71Var, j44Var, rn2Var);
        return j44Var;
    }

    public static yg1 j(b71 b71Var, s61 s61Var, rn2 rn2Var, int i2) {
        if ((i2 & 1) != 0) {
            s61Var = b02.X;
        }
        return i(b71Var, s61Var, (i2 & 2) != 0 ? e71.X : e71.f0, rn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(g94 g94Var, s51 s51Var) throws Throwable {
        m94 m94Var;
        g94 g94Var2;
        ea6 ea6Var;
        Throwable th;
        c94 c94Var;
        c94 c94Var2;
        if (s51Var instanceof m94) {
            m94Var = (m94) s51Var;
            int i2 = m94Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m94Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                m94Var = new m94(s51Var);
            }
        } else {
            m94Var = new m94(s51Var);
        }
        Object obj = m94Var.h0;
        int i3 = m94Var.i0;
        dn8 dn8Var = dn8.a;
        if (i3 != 0) {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = m94Var.g0;
            g94Var2 = m94Var.f0;
            try {
                w39.n0(obj);
                c94Var2 = (c94) ea6Var.X;
                if (c94Var2 != null) {
                    g94Var2.f(c94Var2);
                }
                return dn8Var;
            } catch (Throwable th2) {
                th = th2;
                c94Var = (c94) ea6Var.X;
                if (c94Var != null) {
                    g94Var2.f(c94Var);
                }
                throw th;
            }
        }
        w39.n0(obj);
        if (g94Var.i.compareTo(o84.f0) >= 0) {
            return dn8Var;
        }
        ea6 ea6Var2 = new ea6();
        try {
            m94Var.f0 = g94Var;
            m94Var.g0 = ea6Var2;
            m94Var.i0 = 1;
            mm0 mm0Var = new mm0(1, mb6.H(m94Var));
            mm0Var.s();
            n94 n94Var = new n94(mm0Var);
            ea6Var2.X = n94Var;
            g94Var.a(n94Var);
            Object objQ = mm0Var.q();
            c71 c71Var = c71.X;
            if (objQ == c71Var) {
                return c71Var;
            }
            g94Var2 = g94Var;
            ea6Var = ea6Var2;
            c94Var2 = (c94) ea6Var.X;
            if (c94Var2 != null) {
                g94Var2.f(c94Var2);
            }
            return dn8Var;
        } catch (Throwable th3) {
            g94Var2 = g94Var;
            ea6Var = ea6Var2;
            th = th3;
            c94Var = (c94) ea6Var.X;
            if (c94Var != null) {
                g94Var2.f(c94Var);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final le5 l(hi0 hi0Var, cl7 cl7Var, Map map) {
        Integer num;
        o63 o63Var;
        fl0 fl0VarG;
        String str = hi0Var.a;
        LinkedHashMap linkedHashMap = cl7Var.f0;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        Iterator it = ((jp4) cl7Var.g0.entrySet()).iterator();
        do {
            int i2 = 1;
            le5 le5Var = null;
            if (!it.hasNext()) {
                for (fl0 fl0Var : cl7Var.i0) {
                    ArrayList<bl7> arrayList2 = fl0Var.b;
                    int i3 = fl0Var.a;
                    if (arrayList2.size() == i2) {
                        Surface surface = (Surface) map.get(new dl7(i3));
                        if (surface != null) {
                            linkedHashMap3.put(new pe5(((bl7) wv0.O0(arrayList2)).a), surface);
                        }
                    } else {
                        for (bl7 bl7Var : arrayList2) {
                            Object obj = linkedHashMap.get(bl7Var);
                            le5Var = le5Var;
                            if (obj == null) {
                                bt.i("Required value was null.");
                                return le5Var;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap4.get((al7) obj);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new dl7(i3));
                            if (surface2 != null) {
                                linkedHashMap3.put(new pe5(bl7Var.a), surface2);
                                i2 = 1;
                            }
                        }
                    }
                }
                le5 le5Var2 = le5Var;
                Iterator it2 = cl7Var.Z.iterator();
                af afVar = le5Var2;
                while (it2.hasNext()) {
                    al7 al7Var = (al7) it2.next();
                    ArrayList arrayList3 = al7Var.l;
                    ArrayList arrayList4 = al7Var.l;
                    List list = al7Var.k;
                    lh4 lh4Var = al7Var.f;
                    Integer num2 = al7Var.e;
                    Iterator it3 = it2;
                    String str2 = al7Var.d;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        List list2 = list;
                        lh4 lh4Var2 = lh4Var;
                        Surface surface3 = (Surface) map.get(new dl7(((fl0) it4.next()).a));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        lh4Var = lh4Var2;
                        list = list2;
                    }
                    List list3 = list;
                    lh4 lh4Var3 = lh4Var;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap4.get(al7Var);
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    if (outputConfiguration2 == null) {
                        if (lh4Var3 != null) {
                            num = num2;
                            if (arrayList5.size() != arrayList3.size()) {
                                af afVarF = be.f(null, null, lh4Var3, al7Var.g, al7Var.h, al7Var.i, list3, al7Var.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !dh3.f(str2, str) ? str2 : le5Var2, 2);
                                if (afVarF == null) {
                                    al7Var.toString();
                                } else {
                                    arrayList.add(afVarF);
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        linkedHashMap2.put(new dl7(((fl0) it5.next()).a), afVarF);
                                    }
                                }
                            }
                        } else {
                            num = num2;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj2 : arrayList3) {
                                if (!map.containsKey(new dl7(((fl0) obj2).a))) {
                                    arrayList6.add(obj2);
                                }
                            }
                            om0.i("Surfaces are not yet available for ", al7Var, "! Missing surfaces for ", arrayList6, 33);
                            return le5Var2;
                        }
                        af afVarF2 = be.f((Surface) wv0.r0(arrayList5), null, null, al7Var.g, al7Var.h, al7Var.i, list3, al7Var.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !dh3.f(str2, str) ? str2 : le5Var2, 6);
                        if (afVarF2 == null) {
                            al7Var.toString();
                        } else {
                            Iterator it6 = wv0.o0(arrayList5, 1).iterator();
                            while (it6.hasNext()) {
                                afVarF2.a((Surface) it6.next());
                            }
                            el0 el0Var = hi0Var.e;
                            if (el0Var != null) {
                                fl0 fl0Var2 = (fl0) cl7Var.Y.get(el0Var);
                                if (fl0Var2 == null) {
                                    bt.i("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return le5Var2;
                                }
                                if (afVar == 0 && arrayList3.contains(fl0Var2)) {
                                    afVar = afVarF2;
                                } else {
                                    arrayList.add(afVarF2);
                                }
                            } else {
                                arrayList.add(afVarF2);
                            }
                        }
                        it2 = it3;
                        linkedHashMap4 = linkedHashMap5;
                        afVar = afVar;
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (!map.containsKey(new dl7(((fl0) obj3).a))) {
                                    arrayList7.add(obj3);
                                }
                            }
                            om0.i("Surfaces are not yet available for ", al7Var, "! Missing surfaces for ", arrayList7, 33);
                            return le5Var2;
                        }
                        arrayList.add(new af(outputConfiguration2));
                    }
                    it2 = it3;
                    linkedHashMap4 = linkedHashMap5;
                    afVar = afVar;
                }
                return new le5(arrayList, linkedHashMap2, afVar, linkedHashMap3);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i4 = ((dl7) entry.getKey()).a;
            o63Var = (o63) entry.getValue();
            fl0VarG = cl7Var.g(i4);
            if (fl0VarG == null) {
                bt.i("Required value was null.");
                return null;
            }
        } while (fl0VarG.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            bt.q("Cannot configure multiple outputs pre-S!");
            return null;
        }
        yb6.a.b(ze.class);
        o63Var.getClass();
        throw null;
    }

    public static final ip4 m(Map map, cl7 cl7Var) {
        ip4 ip4Var = new ip4();
        for (fl0 fl0Var : cl7Var.i0) {
            Surface surface = (Surface) map.get(new dl7(fl0Var.a));
            if (surface != null) {
                Iterator it = fl0Var.b.iterator();
                while (it.hasNext()) {
                    ip4Var.put(new pe5(((bl7) it.next()).a), surface);
                }
            }
        }
        return ip4Var.b();
    }

    public static final pd0 n(rn2 rn2Var) {
        return new pd0(rn2Var, b02.X, -2, l90.X);
    }

    public static final a07 o(a07 a07Var, xr0 xr0Var, int i2) {
        return new a07(((x78) xr0Var.e).a(i2), i2, a07Var.c);
    }

    public static int p(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, wa.q(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static ds q() {
        dj2 dj2Var = dj2.Y;
        long jG = eu7.g(32);
        long jG2 = eu7.g(32);
        o88 o88Var = new o88(0L, jG, dj2Var, new bj2(0), eu7.g(0), 0, 0, jG2, 16646001);
        long jG3 = eu7.g(24);
        long jG4 = eu7.g(24);
        o88 o88Var2 = new o88(0L, jG3, dj2Var, new bj2(0), eu7.g(0), 0, 0, jG4, 16646001);
        dj2 dj2Var2 = dj2.Z;
        long jG5 = eu7.g(20);
        long jG6 = eu7.g(24);
        o88 o88Var3 = new o88(0L, jG5, dj2Var2, new bj2(0), eu7.f(0.15d), 0, 0, jG6, 16646001);
        long jG7 = eu7.g(18);
        long jG8 = eu7.g(21);
        cs csVar = new cs(o88Var, o88Var2, o88Var3, new o88(0L, jG7, dj2Var, new bj2(0), eu7.g(0), 0, 0, jG8, 16646001));
        long jG9 = eu7.g(16);
        long jG10 = eu7.g(24);
        o88 o88Var4 = new o88(0L, jG9, dj2Var, new bj2(0), eu7.g(0), 0, 0, jG10, 16646001);
        long jG11 = eu7.g(14);
        long jG12 = eu7.g(14);
        o88 o88Var5 = new o88(0L, jG11, dj2Var, new bj2(0), eu7.f(-0.3d), 0, 0, jG12, 16646001);
        long jG13 = eu7.g(12);
        long jF = eu7.f(15.4d);
        o88 o88Var6 = new o88(0L, jG13, dj2Var, new bj2(0), eu7.f(0.4d), 0, 0, jF, 16646001);
        long jG14 = eu7.g(10);
        long jF2 = eu7.f(12.8d);
        return new ds(csVar, o88Var4, o88Var5, o88Var6, new o88(0L, jG14, dj2Var, new bj2(0), eu7.g(0), 0, 0, jF2, 16646001));
    }

    public static s97 r(Type type, lv3 lv3Var, List list, boolean z) {
        return new s97(lv3Var, list, z, new qc3(d02.X), null, false, false, false, null, new v51(type, (byte) 3));
    }

    public static final s97 s(s97 s97Var, Type type) {
        pz4 pz4VarA;
        lv3 lv3Var = s97Var.Y;
        zu3 zu3Var = lv3Var instanceof zu3 ? (zu3) lv3Var : null;
        if (zu3Var == null || (pz4VarA = va0.a(zu3Var)) == null) {
            return null;
        }
        return new s97(s97Var.Y, s97Var.Z, s97Var.f0, new qc3(d02.X), null, false, false, false, pz4VarA, new v51(type, (byte) 3));
    }

    public static final xe2 t(xe2 xe2Var) {
        return xe2Var instanceof mh7 ? xe2Var : u(xe2Var, l, m);
    }

    public static final lq1 u(xe2 xe2Var, gn2 gn2Var, rn2 rn2Var) {
        if (xe2Var instanceof lq1) {
            lq1 lq1Var = (lq1) xe2Var;
            if (lq1Var.Y == gn2Var && lq1Var.Z == rn2Var) {
                return lq1Var;
            }
        }
        return new lq1(xe2Var, gn2Var, rn2Var);
    }

    public static final void v(sv1 sv1Var, long j2, float f2, float f3) {
        float f4 = f2 / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (sv1Var.e() >> 32)) - f4) - f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) / 2.0f;
        sv1.o0(sv1Var, j2, f4, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), null, 120);
    }

    public static final b07 w(b07 b07Var, o8 o8Var) {
        xr0 xr0Var = (xr0) o8Var.f0;
        if (b07Var != null) {
            a07 a07Var = b07Var.a;
            long j2 = a07Var.c;
            a07 a07Var2 = b07Var.b;
            if (j2 != a07Var2.c) {
                boolean z = b07Var.c;
                if ((z ? a07Var : a07Var2).b != 0) {
                    return b07Var;
                }
                if (z) {
                    a07Var = a07Var2;
                }
                if (((x78) xr0Var.e).a.a.Y.length() != a07Var.b) {
                    return b07Var;
                }
            } else if (a07Var.b != a07Var2.b) {
                return b07Var;
            }
        }
        b07 b07Var2 = (b07) o8Var.Z;
        String str = ((x78) xr0Var.e).a.a.Y;
        if (b07Var2 == null || str.length() == 0) {
            return b07Var;
        }
        boolean z2 = o8Var.Y;
        String str2 = ((x78) xr0Var.e).a.a.Y;
        int i2 = xr0Var.b;
        int length = str2.length();
        if (i2 == 0) {
            int iY = wl7.y(0, str2);
            return z2 ? b07.a(b07Var, o(b07Var.a, xr0Var, iY), null, true, 2) : b07.a(b07Var, null, o(b07Var.b, xr0Var, iY), false, 1);
        }
        if (i2 == length) {
            int iZ = wl7.z(length, str2);
            return z2 ? b07.a(b07Var, o(b07Var.a, xr0Var, iZ), null, false, 2) : b07.a(b07Var, null, o(b07Var.b, xr0Var, iZ), true, 1);
        }
        boolean z3 = b07Var2.c;
        int iZ2 = z2 ^ z3 ? wl7.z(i2, str2) : wl7.y(i2, str2);
        return z2 ? b07.a(b07Var, o(b07Var.a, xr0Var, iZ2), null, z3, 2) : b07.a(b07Var, null, o(b07Var.b, xr0Var, iZ2), z3, 1);
    }

    public static final Type x(nb6 nb6Var) {
        Type[] lowerBounds;
        if (nb6Var.h()) {
            Object objB0 = wv0.B0(nb6Var.r().a());
            ParameterizedType parameterizedType = objB0 instanceof ParameterizedType ? (ParameterizedType) objB0 : null;
            if (dh3.f(parameterizedType != null ? parameterizedType.getRawType() : null, q51.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objD0 = eu.D0(actualTypeArguments);
                WildcardType wildcardType = objD0 instanceof WildcardType ? (WildcardType) objD0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) eu.r0(lowerBounds);
                }
            }
        }
        return null;
    }

    public static final float y(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static i09 z(m31 m31Var, int i2, ArrayList arrayList, i09 i09Var) {
        int i3;
        int i4 = i2 == 0 ? m31Var.n0 : m31Var.o0;
        if (i4 != -1 && (i09Var == null || i4 != i09Var.b)) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                i09 i09Var2 = (i09) arrayList.get(i5);
                if (i09Var2.b == i4) {
                    if (i09Var != null) {
                        i09Var.c(i2, i09Var2);
                        arrayList.remove(i09Var);
                    }
                    i09Var = i09Var2;
                    break;
                }
            }
        } else if (i4 != -1) {
            return i09Var;
        }
        if (i09Var == null) {
            if (m31Var instanceof xz2) {
                xz2 xz2Var = (xz2) m31Var;
                int i6 = 0;
                while (true) {
                    if (i6 >= xz2Var.r0) {
                        i3 = -1;
                        break;
                    }
                    m31 m31Var2 = xz2Var.q0[i6];
                    if ((i2 == 0 && (i3 = m31Var2.n0) != -1) || (i2 == 1 && (i3 = m31Var2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        i09 i09Var3 = (i09) arrayList.get(i7);
                        if (i09Var3.b == i3) {
                            i09Var = i09Var3;
                            break;
                        }
                    }
                }
            }
            if (i09Var == null) {
                i09Var = new i09();
                i09Var.a = new ArrayList();
                i09Var.d = null;
                i09Var.e = -1;
                int i8 = i09.f;
                i09.f = i8 + 1;
                i09Var.b = i8;
                i09Var.c = i2;
            }
            arrayList.add(i09Var);
        }
        ArrayList arrayList2 = i09Var.a;
        if (arrayList2.contains(m31Var)) {
            return i09Var;
        }
        arrayList2.add(m31Var);
        if (m31Var instanceof av2) {
            av2 av2Var = (av2) m31Var;
            av2Var.t0.c(av2Var.u0 == 0 ? 1 : 0, i09Var, arrayList);
        }
        int i9 = i09Var.b;
        if (i2 == 0) {
            m31Var.n0 = i9;
            m31Var.I.c(i2, i09Var, arrayList);
            m31Var.K.c(i2, i09Var, arrayList);
        } else {
            m31Var.o0 = i9;
            m31Var.J.c(i2, i09Var, arrayList);
            m31Var.M.c(i2, i09Var, arrayList);
            m31Var.L.c(i2, i09Var, arrayList);
        }
        m31Var.P.c(i2, i09Var, arrayList);
        return i09Var;
    }
}
