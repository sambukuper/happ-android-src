package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uh8 implements Serializable {
    public static final dh8[] Y = new dh8[0];
    public static final uh8 Z = new uh8();
    public static final gh8 f0 = gh8.i0;
    public static final Class g0 = String.class;
    public static final Class h0 = Object.class;
    public static final Class i0 = Comparable.class;
    public static final Class j0 = Enum.class;
    public static final Class k0 = up3.class;
    public static final Class l0;
    public static final Class m0;
    public static final Class n0;
    public static final Class o0;
    public static final ba7 p0;
    public static final ba7 q0;
    public static final ba7 r0;
    public static final ba7 s0;
    public static final ba7 t0;
    public static final ba7 u0;
    public static final ba7 v0;
    public static final ba7 w0;
    public static final ba7 x0;
    public final c24 X = new c24(16, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);

    static {
        Class cls = Boolean.TYPE;
        l0 = cls;
        Class cls2 = Double.TYPE;
        m0 = cls2;
        Class cls3 = Integer.TYPE;
        n0 = cls3;
        Class cls4 = Long.TYPE;
        o0 = cls4;
        p0 = new ba7(cls);
        q0 = new ba7(cls2);
        r0 = new ba7(cls3);
        s0 = new ba7(cls4);
        t0 = new ba7(String.class);
        u0 = new ba7(Object.class);
        v0 = new ba7(Comparable.class);
        w0 = new ba7(Enum.class);
        x0 = new ba7(up3.class);
    }

    public static ba7 a(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls == g0) {
                return t0;
            }
            if (cls == h0) {
                return u0;
            }
            if (cls == k0) {
                return x0;
            }
            return null;
        }
        if (cls == l0) {
            return p0;
        }
        if (cls == n0) {
            return r0;
        }
        if (cls == o0) {
            return s0;
        }
        if (cls == m0) {
            return q0;
        }
        return null;
    }

    public static boolean e(dh8 dh8Var, dh8 dh8Var2) {
        if (dh8Var2 instanceof ho5) {
            ((ho5) dh8Var2).t0 = dh8Var;
            return true;
        }
        if (dh8Var.j0 == dh8Var2.j0) {
            List listE = dh8Var.y0().e();
            List listE2 = dh8Var2.y0().e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                if (e((dh8) listE.get(i), (dh8) listE2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static dh8 f(dh8 dh8Var, Class cls) {
        Class cls2 = dh8Var.j0;
        if (cls2 == cls) {
            return dh8Var;
        }
        dh8 dh8VarX0 = dh8Var.x0(cls);
        if (dh8VarX0 == null) {
            dh8VarX0 = null;
            if (!cls.isAssignableFrom(cls2)) {
                kp5.n("Class %s not a super-type of %s", new Object[]{cls.getName(), dh8Var});
                return null;
            }
            kp5.n("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), dh8Var});
        }
        return dh8VarX0;
    }

    public static dh8[] h(dh8 dh8Var, Class cls) {
        dh8 dh8VarX0 = dh8Var.x0(cls);
        return dh8VarX0 == null ? Y : dh8VarX0.y0().Y;
    }

    public final dh8 b(lr lrVar, Type type, gh8 gh8Var) {
        Type[] bounds;
        dh8 dh8Var;
        gh8 gh8VarC;
        if (type instanceof Class) {
            return c(lrVar, (Class) type, f0);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (cls == j0) {
                return w0;
            }
            if (cls == i0) {
                return v0;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                gh8VarC = f0;
            } else {
                dh8[] dh8VarArr = new dh8[length];
                for (int i = 0; i < length; i++) {
                    dh8VarArr[i] = b(lrVar, actualTypeArguments[i], gh8Var);
                }
                gh8VarC = gh8.c(cls, dh8VarArr);
            }
            return c(lrVar, cls, gh8VarC);
        }
        if (type instanceof dh8) {
            return (dh8) type;
        }
        if (type instanceof GenericArrayType) {
            dh8 dh8VarB = b(lrVar, ((GenericArrayType) type).getGenericComponentType(), gh8Var);
            int i2 = cu.u0;
            return new cu(dh8VarB, gh8Var, Array.newInstance((Class<?>) dh8VarB.j0, 0), null, null, false);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof WildcardType) {
                return b(lrVar, ((WildcardType) type).getUpperBounds()[0], gh8Var);
            }
            StringBuilder sb = new StringBuilder("Unrecognized Type: ");
            sb.append(type == null ? "[null]" : type.toString());
            throw new IllegalArgumentException(sb.toString());
        }
        TypeVariable typeVariable = (TypeVariable) type;
        String name = typeVariable.getName();
        dh8 dh8Var2 = null;
        if (gh8Var == null) {
            bt.q(pc6.p("Null `bindings` passed (type variable \"", name, "\")"));
            return null;
        }
        String[] strArr = gh8Var.X;
        int length2 = strArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (name.equals(strArr[i3])) {
                dh8Var2 = gh8Var.Y[i3];
                if (!(dh8Var2 instanceof kf6) || (dh8Var = ((kf6) dh8Var2).s0) == null) {
                    break;
                    break;
                }
                dh8Var2 = dh8Var;
                break;
            }
        }
        if (dh8Var2 != null) {
            return dh8Var2;
        }
        String[] strArr2 = gh8Var.Z;
        if (strArr2 != null) {
            int length3 = strArr2.length;
            do {
                length3--;
                if (length3 >= 0) {
                }
            } while (!name.equals(strArr2[length3]));
            return u0;
        }
        String[] strArr3 = gh8Var.Z;
        int length4 = strArr3 == null ? 0 : strArr3.length;
        String[] strArr4 = length4 == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr3, length4 + 1);
        strArr4[length4] = name;
        gh8 gh8Var2 = new gh8(gh8Var.X, gh8Var.Y, strArr4);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(lrVar, bounds[0], gh8Var2);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0223  */
    public final dh8 c(lr lrVar, Class cls, gh8 gh8Var) {
        Object obj;
        lr lrVar2;
        lr lrVar3;
        dh8 dh8VarB;
        dh8[] dh8VarArrD;
        dh8[] dh8VarArr;
        dh8 dh8VarM0;
        dh8 dh8Var;
        gh8 gh8Var2;
        dh8 dh8Var2;
        Class cls2;
        gh8 gh8Var3;
        Class cls3;
        dh8 dh8Var3;
        eh8 eh8Var;
        Class cls4 = cls;
        wu5 wu5Var = (wu5) this.X.X;
        ba7 ba7VarA = a(cls4);
        if (ba7VarA != null) {
            return ba7VarA;
        }
        int i = 0;
        if (gh8Var == null || gh8Var.f()) {
            obj = cls4;
        } else {
            dh8[] dh8VarArr2 = gh8Var.Y;
            int length = dh8VarArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    eh8Var = new eh8(cls4, dh8VarArr2, gh8Var.f0);
                    break;
                }
                if (dh8VarArr2[i2] instanceof y43) {
                    eh8Var = null;
                    break;
                }
                i2++;
            }
            obj = eh8Var;
        }
        dh8 dh8Var4 = obj == null ? null : (dh8) wu5Var.get(obj);
        if (dh8Var4 != null) {
            return dh8Var4;
        }
        if (lrVar == null) {
            lrVar3 = new lr((lr) null, cls4);
        } else {
            if (((Class) lrVar.Z) != cls4) {
                Object obj2 = lrVar.Y;
                while (true) {
                    lr lrVar4 = (lr) obj2;
                    if (lrVar4 == null) {
                        lrVar2 = null;
                        break;
                    }
                    if (((Class) lrVar4.Z) == cls4) {
                        lrVar2 = lrVar4;
                        break;
                    }
                    obj2 = lrVar4.Y;
                }
            } else {
                lrVar2 = lrVar;
            }
            if (lrVar2 != null) {
                kf6 kf6Var = new kf6(cls, f0, null, null, 0, null, null, false);
                ArrayList arrayList = (ArrayList) lrVar2.f0;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    lrVar2.f0 = arrayList;
                }
                arrayList.add(kf6Var);
                return kf6Var;
            }
            lrVar3 = new lr(lrVar, cls4);
        }
        if (cls4.isArray()) {
            dh8 dh8VarB2 = b(lrVar3, cls4.getComponentType(), gh8Var);
            int i3 = cu.u0;
            dh8VarM0 = new cu(dh8VarB2, gh8Var, Array.newInstance((Class<?>) dh8VarB2.j0, 0), null, null, false);
            dh8Var2 = null;
        } else {
            if (cls4.isInterface()) {
                dh8VarArrD = d(lrVar3, cls4, gh8Var);
                dh8VarB = null;
            } else {
                Annotation[] annotationArr = it0.a;
                Type genericSuperclass = cls4.getGenericSuperclass();
                dh8VarB = genericSuperclass == null ? null : b(lrVar3, genericSuperclass, gh8Var);
                dh8VarArrD = d(lrVar3, cls4, gh8Var);
            }
            dh8 dh8Var5 = t0;
            if (cls4 == Properties.class) {
                dh8VarArr = dh8VarArrD;
                dh8Var = dh8VarB;
                dh8Var2 = null;
                cls2 = Properties.class;
                dh8VarM0 = new tp4(cls4, gh8Var, dh8Var, dh8VarArr, dh8Var5, dh8Var5, null, null, false);
                gh8Var2 = gh8Var;
            } else {
                dh8 dh8Var6 = dh8Var4;
                dh8VarArr = dh8VarArrD;
                dh8VarM0 = dh8Var6;
                dh8Var = dh8VarB;
                gh8Var2 = gh8Var;
                dh8Var2 = null;
                cls2 = Properties.class;
                if (dh8Var != null) {
                    dh8VarM0 = dh8Var.M0(cls4, gh8Var2, dh8Var, dh8VarArr);
                }
            }
            if (dh8VarM0 == null) {
                gh8 gh8Var4 = gh8Var2 == null ? f0 : gh8Var2;
                dh8 dh8Var7 = u0;
                if (cls4 == Map.class) {
                    if (cls4 != cls2) {
                        List listE = gh8Var4.e();
                        int size = listE.size();
                        if (size == 0) {
                            dh8Var5 = dh8Var7;
                        } else {
                            if (size != 2) {
                                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", it0.u(cls4), Integer.valueOf(size), size == 1 ? _UrlKt.FRAGMENT_ENCODE_SET : "s", gh8Var4));
                            }
                            dh8 dh8Var8 = (dh8) listE.get(0);
                            dh8Var3 = (dh8) listE.get(1);
                            dh8Var5 = dh8Var8;
                            gh8Var4 = gh8Var4;
                        }
                        gh8Var3 = gh8Var2;
                        cls3 = cls;
                        dh8VarM0 = new tp4(cls3, gh8Var4, dh8Var, dh8VarArr, dh8Var5, dh8Var3, null, null, false);
                    }
                    dh8Var3 = dh8Var5;
                    gh8Var3 = gh8Var2;
                    cls3 = cls;
                    dh8VarM0 = new tp4(cls3, gh8Var4, dh8Var, dh8VarArr, dh8Var5, dh8Var3, null, null, false);
                } else {
                    gh8Var3 = gh8Var2;
                    cls3 = cls4;
                    gh8 gh8Var5 = gh8Var4;
                    if (cls3 == Collection.class) {
                        List listE2 = gh8Var5.e();
                        if (!listE2.isEmpty()) {
                            if (listE2.size() != 1) {
                                u52.m("Strange Collection type ", cls3.getName(), ": cannot determine type parameters");
                                return dh8Var2;
                            }
                            dh8Var7 = (dh8) listE2.get(0);
                        }
                        dh8VarM0 = new vv0(cls3, gh8Var5, dh8Var, dh8VarArr, dh8Var7, null, null, false);
                    } else if (cls3 == AtomicReference.class) {
                        List listE3 = gh8Var5.e();
                        if (!listE3.isEmpty()) {
                            if (listE3.size() != 1) {
                                u52.m("Strange Reference type ", cls3.getName(), ": cannot determine type parameters");
                                return dh8Var2;
                            }
                            dh8Var7 = (dh8) listE3.get(0);
                        }
                        dh8VarM0 = new fa6(cls3, gh8Var5, dh8Var, dh8VarArr, dh8Var7, null, null, null, false);
                    } else if (cls3 == Iterator.class || cls3 == Stream.class) {
                        List listE4 = gh8Var5.e();
                        if (!listE4.isEmpty()) {
                            if (listE4.size() != 1) {
                                u52.m("Strange Iteration type ", cls.getName(), ": cannot determine type parameters");
                                return dh8Var2;
                            }
                            dh8Var7 = (dh8) listE4.get(0);
                        }
                        cls3 = cls;
                        dh8VarM0 = new zi3(cls3, gh8Var5, dh8Var, dh8VarArr, dh8Var7, null, null, false);
                    } else if (!BaseStream.class.isAssignableFrom(cls3)) {
                        cls3 = cls;
                        dh8VarM0 = dh8Var2;
                    } else if (DoubleStream.class.isAssignableFrom(cls3)) {
                        dh8VarM0 = new zi3(cls3, gh8Var5, dh8Var, dh8VarArr, q0, null, null, false);
                    } else if (IntStream.class.isAssignableFrom(cls3)) {
                        dh8VarM0 = new zi3(cls3, gh8Var5, dh8Var, dh8VarArr, r0, null, null, false);
                    } else if (LongStream.class.isAssignableFrom(cls3)) {
                        dh8VarM0 = new zi3(cls3, gh8Var5, dh8Var, dh8VarArr, s0, null, null, false);
                        cls3 = cls;
                    } else {
                        cls3 = cls;
                        dh8VarM0 = dh8Var2;
                    }
                }
                if (dh8VarM0 == null) {
                    int length2 = dh8VarArr.length;
                    while (true) {
                        if (i >= length2) {
                            dh8VarM0 = dh8Var2;
                            break;
                        }
                        dh8 dh8VarM1 = dh8VarArr[i].M0(cls3, gh8Var3, dh8Var, dh8VarArr);
                        if (dh8VarM1 != null) {
                            dh8VarM0 = dh8VarM1;
                            break;
                        }
                        i++;
                    }
                    if (dh8VarM0 == null) {
                        dh8VarM0 = new ba7(cls3, gh8Var3, dh8Var, dh8VarArr);
                    }
                }
            }
        }
        cls4 = cls4;
        ArrayList<kf6> arrayList2 = (ArrayList) lrVar3.f0;
        if (arrayList2 != null) {
            for (kf6 kf6Var2 : arrayList2) {
                if (kf6Var2.s0 != null) {
                    kp5.m("Trying to re-set self reference; old value = ", kf6Var2.s0, ", new = ", dh8VarM0);
                    return dh8Var2;
                }
                kf6Var2.s0 = dh8VarM0;
            }
        }
        if (obj != null && !dh8VarM0.G0()) {
            wu5Var.g(obj, dh8VarM0, true);
        }
        return dh8VarM0;
    }

    public final dh8[] d(lr lrVar, Class cls, gh8 gh8Var) {
        Annotation[] annotationArr = it0.a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return Y;
        }
        int length = genericInterfaces.length;
        dh8[] dh8VarArr = new dh8[length];
        for (int i = 0; i < length; i++) {
            dh8VarArr[i] = b(lrVar, genericInterfaces[i], gh8Var);
        }
        return dh8VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094 A[LOOP:0: B:45:0x0092->B:46:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r3 == java.util.EnumSet.class) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dh8 g(defpackage.dh8 r24, java.lang.Class r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh8.g(dh8, java.lang.Class, boolean):dh8");
    }
}
