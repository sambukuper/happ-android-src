package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jl extends cw0 {
    public final rs0 f0;
    public final boolean g0;

    public jl(m85 m85Var, rs0 rs0Var, boolean z) {
        super(m85Var);
        this.f0 = m85Var == null ? null : rs0Var;
        this.g0 = z;
    }

    public static boolean H0(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public final void F0(pi8 pi8Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        if (cls2 != null) {
            G0(pi8Var, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : it0.k(cls)) {
            if (H0(method)) {
                zs4 zs4Var = new zs4(method);
                il ilVar = (il) linkedHashMap.get(zs4Var);
                if (ilVar == null) {
                    linkedHashMap.put(zs4Var, new il(pi8Var, method, ((m85) this.X) == null ? xl.i : m0(method.getDeclaredAnnotations())));
                } else {
                    if (this.g0) {
                        ilVar.c = n0(ilVar.c, method.getDeclaredAnnotations());
                    }
                    Method method2 = ilVar.b;
                    if (method2 == null) {
                        ilVar.b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        ilVar.b = method;
                        ilVar.a = pi8Var;
                    }
                }
            }
        }
    }

    public final void G0(pi8 pi8Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        List list;
        if (((m85) this.X) == null) {
            return;
        }
        Annotation[] annotationArr = it0.a;
        if (cls2 == null || cls2 == cls || cls2 == Object.class) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(8);
            it0.a(cls2, cls, arrayList);
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (H0(method)) {
                    zs4 zs4Var = new zs4(method);
                    il ilVar = (il) linkedHashMap.get(zs4Var);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (ilVar == null) {
                        linkedHashMap.put(zs4Var, new il(pi8Var, null, m0(declaredAnnotations)));
                    } else {
                        ilVar.c = n0(ilVar.c, declaredAnnotations);
                    }
                }
            }
        }
    }
}
