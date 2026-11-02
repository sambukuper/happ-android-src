package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia6 {
    public static final List a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Map d;

    static {
        zb6 zb6Var = yb6.a;
        int i = 0;
        List<zu3> listL = i21.L(zb6Var.b(Boolean.TYPE), zb6Var.b(Byte.TYPE), zb6Var.b(Character.TYPE), zb6Var.b(Double.TYPE), zb6Var.b(Float.TYPE), zb6Var.b(Integer.TYPE), zb6Var.b(Long.TYPE), zb6Var.b(Short.TYPE));
        a = listL;
        int iG = aq4.G(xv0.Z(listL, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (zu3 zu3Var : listL) {
            linkedHashMap.put(zc1.N(zu3Var), zc1.O(zu3Var));
        }
        b = linkedHashMap;
        List<zu3> list = a;
        int iG2 = aq4.G(xv0.Z(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG2 >= 16 ? iG2 : 16);
        for (zu3 zu3Var2 : list) {
            linkedHashMap2.put(zc1.O(zu3Var2), zc1.N(zu3Var2));
        }
        c = linkedHashMap2;
        List listL2 = i21.L(dn2.class, gn2.class, rn2.class, sn2.class, tn2.class, un2.class, vn2.class, wn2.class, xn2.class, yn2.class, en2.class, fn2.class, vo2.class, hn2.class, in2.class, jn2.class, kn2.class, ln2.class, mn2.class, nn2.class, pn2.class, qn2.class, vo2.class);
        ArrayList arrayList = new ArrayList(xv0.Z(listL2, 10));
        for (Object obj : listL2) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            arrayList.add(new qg5((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = zp4.P(arrayList);
    }

    public static final qs0 a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            bt.q(pc6.l(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            bt.q(pc6.l(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            fk2 fk2Var = new fk2(cls.getName());
            return new qs0(fk2Var.b(), wl7.h0(fk2Var.a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(v15.e(cls.getSimpleName()));
        }
        fk2 fk2Var2 = new fk2(cls.getName());
        return new qs0(fk2Var2.b(), fk2Var2.a.g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        bt.q(pc6.l(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return d02.X;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return w27.n0(new sd2(w27.i0(type, cd5.i0), cd5.j0, a37.X));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return eu.K0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return (Class) c.get(cls);
    }
}
