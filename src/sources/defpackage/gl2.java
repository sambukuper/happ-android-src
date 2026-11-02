package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gl2 {
    public static final l97 b = new l97(0);
    public final /* synthetic */ ml2 a;

    public gl2(ml2 ml2Var) {
        this.a = ml2Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        l97 l97Var = b;
        l97 l97Var2 = (l97) l97Var.get(classLoader);
        if (l97Var2 == null) {
            l97Var2 = new l97(0);
            l97Var.put(classLoader, l97Var2);
        }
        Class cls = (Class) l97Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        l97Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final qk2 a(String str) {
        try {
            return (qk2) c(this.a.w.C0.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new ok2(pc6.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
