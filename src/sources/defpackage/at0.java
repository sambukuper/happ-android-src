package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class at0 extends vh8 implements Serializable {
    public at0(dh8 dh8Var, uh8 uh8Var, Collection collection) {
        super(dh8Var, uh8Var);
        HashSet hashSet = null;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                f25 f25Var = (f25) it.next();
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(f25Var.X.getName());
            }
        }
        if (hashSet == null) {
            Set set = Collections.EMPTY_SET;
        }
    }

    @Override // defpackage.vh8
    public String b(Object obj) {
        return d(obj, obj.getClass(), this.X);
    }

    @Override // defpackage.vh8
    public String c(Class cls, Object obj) {
        return d(obj, cls, this.X);
    }

    public final String d(Object obj, Class cls, uh8 uh8Var) {
        Class declaringClass;
        gh8 gh8Var;
        Class declaringClass2;
        gh8 gh8Var2;
        Class clsA = vh8.a(cls);
        String name = clsA.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                EnumSet enumSet = (EnumSet) obj;
                Annotation[] annotationArr = it0.a;
                if (enumSet.isEmpty()) {
                    ht0 ht0Var = ht0.e;
                    Field field = ht0Var.a;
                    if (field == null) {
                        bt.p(ht0Var.c, "Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: ");
                        return null;
                    }
                    try {
                        declaringClass2 = (Class) field.get(enumSet);
                    } catch (Exception e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    declaringClass2 = ((Enum) enumSet.iterator().next()).getDeclaringClass();
                }
                dh8 dh8VarC = uh8Var.c(null, declaringClass2, uh8.f0);
                String[] strArr = gh8.g0;
                TypeVariable[] typeParameters = EnumSet.class.getTypeParameters();
                int length = typeParameters == null ? 0 : typeParameters.length;
                if (length == 0) {
                    gh8Var2 = gh8.i0;
                } else {
                    if (length != 1) {
                        em7.b(length, EnumSet.class.getName(), " with 1 type parameter: class expects ");
                        return null;
                    }
                    gh8Var2 = new gh8(new String[]{typeParameters[0].getName()}, new dh8[]{dh8VarC}, null);
                }
                vv0 vv0Var = (vv0) uh8Var.c(null, EnumSet.class, gh8Var2);
                if (gh8Var2.f()) {
                    dh8 dh8VarZ0 = vv0Var.x0(Collection.class).z0();
                    if (!dh8VarZ0.equals(dh8VarC)) {
                        kp5.n("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{it0.u(EnumSet.class), dh8VarC, dh8VarZ0});
                        return null;
                    }
                }
                return vv0Var.w0();
            }
            if (obj instanceof EnumMap) {
                EnumMap enumMap = (EnumMap) obj;
                Annotation[] annotationArr2 = it0.a;
                if (enumMap.isEmpty()) {
                    ht0 ht0Var2 = ht0.e;
                    Field field2 = ht0Var2.b;
                    if (field2 == null) {
                        bt.p(ht0Var2.d, "Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: ");
                        return null;
                    }
                    try {
                        declaringClass = (Class) field2.get(enumMap);
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    declaringClass = ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
                }
                gh8 gh8Var3 = uh8.f0;
                dh8 dh8VarC2 = uh8Var.c(null, declaringClass, gh8Var3);
                dh8 dh8VarC3 = uh8Var.c(null, Object.class, gh8Var3);
                dh8[] dh8VarArr = {dh8VarC2, dh8VarC3};
                String[] strArr2 = gh8.g0;
                TypeVariable[] typeParameters2 = EnumMap.class.getTypeParameters();
                if (typeParameters2 == null || typeParameters2.length == 0) {
                    gh8Var = gh8.i0;
                } else {
                    int length2 = typeParameters2.length;
                    String[] strArr3 = new String[length2];
                    for (int i = 0; i < length2; i++) {
                        strArr3[i] = typeParameters2[i].getName();
                    }
                    if (length2 != 2) {
                        em7.b(length2, EnumMap.class.getName(), " with 2 type parameters: class expects ");
                        return null;
                    }
                    gh8Var = new gh8(strArr3, dh8VarArr, null);
                }
                tp4 tp4Var = (tp4) uh8Var.c(null, EnumMap.class, gh8Var);
                if (gh8Var.f()) {
                    dh8 dh8VarX0 = tp4Var.x0(Map.class);
                    dh8 dh8VarC0 = dh8VarX0.C0();
                    if (!dh8VarC0.equals(dh8VarC2)) {
                        kp5.n("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{it0.u(EnumMap.class), dh8VarC2, dh8VarC0});
                        return null;
                    }
                    dh8 dh8VarZ1 = dh8VarX0.z0();
                    if (!dh8VarZ1.equals(dh8VarC3)) {
                        kp5.n("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{it0.u(EnumMap.class), dh8VarC3, dh8VarZ1});
                        return null;
                    }
                }
                return tp4Var.w0();
            }
        } else if (name.indexOf(36) >= 0 && it0.m(clsA) != null) {
            dh8 dh8Var = this.Y;
            if (it0.m(dh8Var.j0) == null) {
                return dh8Var.j0.getName();
            }
        }
        return name;
    }
}
