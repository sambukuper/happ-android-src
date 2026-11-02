package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 {
    public static final lt0 c = new lt0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, kt0 kt0Var, n84 n84Var, Class cls) {
        n84 n84Var2 = (n84) map.get(kt0Var);
        if (n84Var2 == null || n84Var == n84Var2) {
            if (n84Var2 == null) {
                map.put(kt0Var, n84Var);
            }
        } else {
            String name = kt0Var.b.getName();
            String name2 = cls.getName();
            bt.q(p61.n(oi0.t("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(n84Var2), ", new value ", String.valueOf(n84Var)));
        }
    }

    public final jt0 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            jt0 jt0VarA = (jt0) map2.get(superclass);
            if (jt0VarA == null) {
                jt0VarA = a(superclass, null);
            }
            map.putAll(jt0VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            jt0 jt0VarA2 = (jt0) map2.get(cls2);
            if (jt0VarA2 == null) {
                jt0VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : jt0VarA2.b.entrySet()) {
                b(map, (kt0) entry.getKey(), (n84) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            qa5 qa5Var = (qa5) method.getAnnotation(qa5.class);
            if (qa5Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!d94.class.isAssignableFrom(parameterTypes[0])) {
                        bt.q("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                n84 n84VarValue = qa5Var.value();
                if (parameterTypes.length > 1) {
                    if (!n84.class.isAssignableFrom(parameterTypes[1])) {
                        bt.q("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (n84VarValue != n84.ON_ANY) {
                        bt.q("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    bt.q("cannot have more than 2 params");
                    return null;
                }
                b(map, new kt0(i, method), n84VarValue, cls);
                z = true;
            }
        }
        jt0 jt0Var = new jt0(map);
        map2.put(cls, jt0Var);
        this.b.put(cls, Boolean.valueOf(z));
        return jt0Var;
    }
}
