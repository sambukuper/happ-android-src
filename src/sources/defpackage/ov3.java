package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ov3 implements fs0 {
    public static final kc6 X = new kc6("<v#(\\d+)>");

    public static void G(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        int size;
        List listSubList;
        boolean zF = dh3.f(wv0.B0(arrayList2), ge1.class);
        List list = arrayList2;
        if (zF) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        if (z2) {
            list = listSubList;
            size = list.size() - 1;
        } else {
            list = listSubList;
            size = list.size();
        }
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        arrayList.add(z ? ge1.class : Object.class);
    }

    public static Method c0(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodC0;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodD0 = d0(cls, str, clsArr, cls2);
        if (methodD0 != null) {
            return methodD0;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodC0 = c0(superclass, str, clsArr, cls2, z)) != null) {
            return methodC0;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i];
            cls4.getClass();
            Method methodC1 = c0(cls4, str, clsArr, cls2, z);
            if (methodC1 != null) {
                return methodC1;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, ia6.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodD1 = d0(cls3, str, clsArr, cls2);
                    if (methodD1 != null) {
                        return methodD1;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public static Method d0(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (dh3.f(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (dh3.f(method.getName(), str) && dh3.f(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final h14 K(int i, String str) {
        str.getClass();
        kz3 kz3VarZ = Z(i);
        if (kz3VarZ == null) {
            return null;
        }
        if (kz3VarZ.f == null) {
            return ow.r.x(ow.a[37], kz3VarZ) ? new r04(this, str, null, kz3VarZ, yu3.k) : new h14(this, str, null, kz3VarZ, yu3.k);
        }
        throw new p14(oi0.p(new StringBuilder("Local property "), kz3VarZ.b, " is an extension, which is not yet supported"));
    }

    public final Method N(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(t());
        }
        mj0 mj0VarM = ms8.m(ia6.d(t()), str2, true);
        G(arrayList, (ArrayList) mj0VarM.Y, false, z2);
        Class clsA0 = a0();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) mj0VarM.Z;
        cls.getClass();
        return c0(clsA0, strConcat, clsArr, cls, z);
    }

    public final Field S(String str) throws NoSuchFieldException {
        str.getClass();
        Class cls = ((ev3) this).Y;
        Field declaredField = cls.getDeclaredField(str);
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls);
        sb.append(':');
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        sb.append(declaredFields.length == 0 ? " no fields found" : "\n".concat(eu.x0(declaredFields, "\n", null, null, cl1.x0, 30)));
        throw new p14(sb.toString());
    }

    public final Method T(String str, String str2) {
        Method methodC0;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        mj0 mj0VarM = ms8.m(ia6.d(t()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) mj0VarM.Y).toArray(new Class[0]);
        Class cls = (Class) mj0VarM.Z;
        cls.getClass();
        Method methodC1 = c0(a0(), str, clsArr, cls, false);
        if (methodC1 != null) {
            return methodC1;
        }
        if (!a0().isInterface() || (methodC0 = c0(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodC0;
    }

    public final kz3 U(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((dw3) ((ew3) this).Z.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList, ((jz3) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            kz3 kz3Var = (kz3) obj;
            if (dh3.f(kz3Var.b, str) && dh3.f(ys0.o(kz3Var, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbT = oi0.t("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbT.append(this);
            throw new p14(sbT.toString());
        }
        if (arrayList2.size() <= 1) {
            return (kz3) wv0.O0(arrayList2);
        }
        StringBuilder sbT2 = oi0.t("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbT2.append(this);
        throw new p14(sbT2.toString());
    }

    public Collection V() {
        throw new p14("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public Collection W() {
        throw new p14("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public Collection X(v15 v15Var) {
        throw new p14("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public fx5 Y(int i) {
        return null;
    }

    public kz3 Z(int i) {
        return null;
    }

    public Class a0() {
        Class clsE = ia6.e(t());
        return clsE == null ? t() : clsE;
    }

    public Collection b0(v15 v15Var) {
        throw new p14("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }
}
