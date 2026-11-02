package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ms8 {
    public static final fk2 a = new fk2("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        ro2 ro2Var = ro2.d;
        sb.append(ro2Var.a.a.a);
        sb.append('.');
        sb.append(ro2Var.b);
        b = sb.toString();
    }

    public static final kb6 a(Object obj) {
        if (obj instanceof o54) {
            return a(((o54) obj).f());
        }
        if (obj instanceof kb6) {
            return (kb6) obj;
        }
        if (obj instanceof nd0) {
            xu3 xu3VarF = ((nd0) obj).f();
            if (xu3VarF == obj) {
                xu3VarF = null;
            }
            if (xu3VarF != null) {
                return a(xu3VarF);
            }
        }
        return null;
    }

    public static final nb6 b(Object obj) {
        if (obj instanceof nb6) {
            return (nb6) obj;
        }
        if (obj instanceof mo2) {
            xu3 xu3VarF = ((mo2) obj).f();
            if (xu3VarF instanceof nb6) {
                return (nb6) xu3VarF;
            }
        }
        return null;
    }

    public static final pb6 c(Object obj) {
        if (obj instanceof o54) {
            return c(((o54) obj).f());
        }
        if (obj instanceof pb6) {
            return (pb6) obj;
        }
        if (obj instanceof nx5) {
            xu3 xu3VarF = ((nx5) obj).f();
            if (xu3VarF == obj) {
                xu3VarF = null;
            }
            if (xu3VarF != null) {
                return c(xu3VarF);
            }
        }
        return null;
    }

    public static final List d(zk zkVar) {
        Annotation annotationP;
        zkVar.getClass();
        sm<gm> annotations = zkVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (gm gmVar : annotations) {
            ke7 source = gmVar.getSource();
            if (source instanceof ga6) {
                annotationP = ((ga6) source).X;
            } else if (source instanceof hr6) {
                xa6 xa6Var = ((hr6) source).X;
                ja6 ja6Var = xa6Var instanceof ja6 ? (ja6) xa6Var : null;
                annotationP = ja6Var != null ? ja6Var.a : null;
            } else {
                annotationP = p(gmVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object f(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    bt.i("Parameter with void type is illegal");
                    return null;
                }
                em7.j(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final jd0 g(Class cls, xl1 xl1Var, yp2 yp2Var, w15 w15Var, ux4 ux4Var, s50 s50Var, rn2 rn2Var) {
        List list;
        yp2Var.getClass();
        w15Var.getClass();
        s50Var.getClass();
        gr6 gr6VarA = tx4.a(cls);
        if (yp2Var instanceof vy5) {
            list = ((vy5) yp2Var).k0;
        } else {
            if (!(yp2Var instanceof cz5)) {
                b61.o(yp2Var, "Unsupported message: ");
                return null;
            }
            list = ((cz5) yp2Var).k0;
        }
        List list2 = list;
        hl1 hl1Var = gr6VarA.a;
        vx4 vx4Var = hl1Var.b;
        dv8 dv8Var = dv8.b;
        list2.getClass();
        return (jd0) rn2Var.K(new ys4(new jl1(hl1Var, w15Var, (ed1) vx4Var, ux4Var, dv8Var, s50Var, xl1Var, (fc8) null, list2)), yp2Var);
    }

    public static final i44 h(ej1 ej1Var) {
        ej1Var.getClass();
        ld0 ld0VarV = ej1Var.V();
        yu3 yu3Var = ej1Var.X;
        if (!yu3Var.c() || !y72.f(ej1Var)) {
            if (yu3Var.c() && !y72.f(ej1Var)) {
                ov3 ov3VarD = ej1Var.D();
                ev3 ev3Var = ov3VarD instanceof ev3 ? (ev3) ov3VarD : null;
                if (ev3Var != null) {
                    return ev3Var.h0().p0();
                }
            } else {
                if (ld0VarV instanceof a41) {
                    return ((jo2) ((a41) ld0VarV)).n0;
                }
                if (ld0VarV.P() != null) {
                    ed1 ed1VarP = ld0VarV.p();
                    ed1VarP.getClass();
                    return ((sx4) ed1VarP).p0();
                }
            }
        }
        return null;
    }

    public static final boolean i(pw3 pw3Var) {
        pw3Var.getClass();
        lv3 lv3VarM = pw3Var.M();
        ev3 ev3Var = lv3VarM instanceof ev3 ? (ev3) lv3VarM : null;
        if (ev3Var != null && ev3Var.C()) {
            yy3 yy3VarI0 = ev3Var.i0();
            if ((yy3VarI0 != null ? yy3VarI0.m : null) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(zu3 zu3Var) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsM = zc1.M(zu3Var);
        try {
            declaredMethod = clsM.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (zc1.M(zc1.K(annotation)).getName().equals(ks3.g.a.a)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = zc1.M(zc1.K(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsM.equals(objInvoke);
            }
        }
        return false;
    }

    public static final boolean k(pw3 pw3Var) {
        pw3Var.getClass();
        if (pw3Var.z()) {
            return true;
        }
        u1 u1Var = (u1) pw3Var;
        u1 u1VarT = u1Var.T();
        if (u1VarT != null && k(u1VarT)) {
            return true;
        }
        if (u1Var.x()) {
            return false;
        }
        lv3 lv3VarM = pw3Var.M();
        if (!(lv3VarM instanceof rw3)) {
            return false;
        }
        List upperBounds = ((rw3) lv3VarM).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (k((pw3) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class l(ClassLoader classLoader, qs0 qs0Var, int i) {
        qs0Var.getClass();
        gk2 gk2Var = qs0Var.a().a;
        Integer numB0 = mm7.b0(fm7.J0(gk2Var.a, b));
        if (numB0 != null) {
            int iIntValue = numB0.intValue();
            oo2 oo2Var = oo2.d;
            return l(classLoader, new qs0(oo2Var.a, oo2Var.a(iIntValue + 1)), i);
        }
        String str = ll3.a;
        qs0 qs0VarH = ll3.h(gk2Var);
        if (qs0VarH == null) {
            qs0VarH = qs0Var;
        }
        if (!qs0VarH.equals(qs0Var)) {
            classLoader = ia6.d(dn8.class);
        }
        String str2 = qs0VarH.a.a.a;
        String str3 = qs0VarH.b.a.a;
        if (dh3.f(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(mm7.X(str3, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final mj0 m(ClassLoader classLoader, String str, boolean z) {
        Class clsN;
        str.getClass();
        lo2 lo2VarO = o(str);
        ArrayList<String> arrayList = lo2VarO.c;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(n(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = lo2VarO.b;
            clsN = n(classLoader, str3, 0, str3.length());
        } else {
            clsN = null;
        }
        return new mj0((Object) arrayList2, (Object) clsN, (byte) 26);
    }

    public static final Class n(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoader.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return e(n(classLoader, str, i + 1, i2));
        }
        switch (cCharAt) {
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new p14("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public static final lo2 o(String str) {
        int iL0;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (fm7.e0("VZCBSIFJD", cCharAt)) {
                iL0 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new p14("Unknown type prefix in the method signature: ".concat(str));
                }
                iL0 = fm7.l0(str, ';', i, 4) + 1;
            }
            arrayList.add(str.substring(i, iL0));
            i = iL0;
        }
        return new lo2(str.substring(i + 1), arrayList);
    }

    public static final Annotation p(gm gmVar) {
        sx4 sx4VarD = el1.d(gmVar);
        Class clsQ = sx4VarD != null ? q(sx4VarD) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = gmVar.e().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            v15 v15Var = (v15) entry.getKey();
            Object objR = r((s21) entry.getValue(), ia6.d(clsQ));
            qg5 qg5Var = objR != null ? new qg5(v15Var.b(), objR) : null;
            if (qg5Var != null) {
                arrayList.add(qg5Var);
            }
        }
        return (Annotation) w39.q(clsQ, zp4.P(arrayList));
    }

    public static final Class q(sx4 sx4Var) {
        ke7 source = sx4Var.getSource();
        source.getClass();
        if (source instanceof l04) {
            return ((l04) source).X.a;
        }
        if (source instanceof hr6) {
            return ((ta6) ((hr6) source).X).a;
        }
        qs0 qs0VarF = el1.f(sx4Var);
        if (qs0VarF == null) {
            return null;
        }
        return l(ia6.d(sx4Var.getClass()), qs0VarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(s21 s21Var, ClassLoader classLoader) {
        Class clsL;
        if (s21Var instanceof qm) {
            return p((gm) ((qm) s21Var).a);
        }
        int i = 0;
        if (s21Var instanceof du) {
            du duVar = (du) s21Var;
            gj8 gj8Var = duVar instanceof gj8 ? (gj8) duVar : null;
            if (gj8Var != null) {
                t14 t14Var = gj8Var.c;
                Object obj = duVar.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(r((s21) it.next(), classLoader));
                }
                v15 v15Var = zz3.e;
                ot0 ot0VarX = t14Var.n0().x();
                du5 du5VarS = ot0VarX == null ? null : zz3.s(ot0VarX);
                switch (du5VarS == null ? -1 : ls8.a[du5VarS.ordinal()]) {
                    case -1:
                        if (!zz3.z(t14Var)) {
                            xw3.s(t14Var, "Not an array type: ");
                            return null;
                        }
                        t14 t14VarB = ((ni8) wv0.O0(t14Var.l0())).b();
                        t14VarB.getClass();
                        ot0 ot0VarX2 = t14VarB.n0().x();
                        sx4 sx4Var = ot0VarX2 instanceof sx4 ? (sx4) ot0VarX2 : null;
                        if (sx4Var == null) {
                            b61.o(t14VarB, "Not a class type: ");
                            return null;
                        }
                        if (zz3.I(t14VarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (zz3.b(sx4Var, tg7.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                obj3.getClass();
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        qs0 qs0VarF = el1.f(sx4Var);
                        if (qs0VarF != null && (clsL = l(classLoader, qs0VarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsL, ((List) obj).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        b61.c();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            obj11.getClass();
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (s21Var instanceof x22) {
            qg5 qg5Var = (qg5) ((x22) s21Var).a;
            qs0 qs0Var = (qs0) qg5Var.X;
            v15 v15Var2 = (v15) qg5Var.Y;
            Class clsL2 = l(classLoader, qs0Var, 0);
            if (clsL2 != null) {
                return Enum.valueOf(clsL2, v15Var2.b());
            }
        } else {
            if (!(s21Var instanceof kv3)) {
                if ((s21Var instanceof v32) || (s21Var instanceof e75)) {
                    return null;
                }
                return s21Var.b();
            }
            jv3 jv3Var = (jv3) ((kv3) s21Var).a;
            if (jv3Var instanceof iv3) {
                vs0 vs0Var = ((iv3) jv3Var).a;
                return l(classLoader, vs0Var.a, vs0Var.b);
            }
            if (!(jv3Var instanceof hv3)) {
                b61.c();
                return null;
            }
            ot0 ot0VarX3 = ((hv3) jv3Var).a.n0().x();
            sx4 sx4Var2 = ot0VarX3 instanceof sx4 ? (sx4) ot0VarX3 : null;
            if (sx4Var2 != null) {
                return q(sx4Var2);
            }
        }
        return null;
    }

    public static final pw3 s(pw3 pw3Var) {
        pw3Var.getClass();
        lv3 lv3VarM = pw3Var.M();
        ev3 ev3Var = lv3VarM instanceof ev3 ? (ev3) lv3VarM : null;
        if (ev3Var != null) {
            return (pw3) ((cv3) ev3Var.Z.getValue()).l.getValue();
        }
        return null;
    }

    public static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listK;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (zc1.M(zc1.K((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        zu3 zu3VarK = zc1.K(annotation);
                        Class clsM = zc1.M(zu3VarK);
                        if (!clsM.getSimpleName().equals("Container") || clsM.getAnnotation(de6.class) == null) {
                            listK = i21.K(annotation);
                        } else {
                            Object objInvoke = zc1.M(zu3VarK).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listK = Arrays.asList((Annotation[]) objInvoke);
                            listK.getClass();
                        }
                        bw0.d0(arrayList, listK);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }
}
