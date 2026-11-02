package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fb6 extends bb6 {
    public final Object a;

    public fb6(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.bb6
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        mj3 mj3Var = wl7.f;
        Method method = null;
        if (mj3Var == null) {
            Class<?> cls = obj.getClass();
            try {
                mj3Var = new mj3(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                mj3Var = new mj3(null, null);
            }
            wl7.f = mj3Var;
        }
        Method method2 = mj3Var.b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final gb6 f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        mj3 mj3Var = wl7.f;
        Class cls = null;
        if (mj3Var == null) {
            Class<?> cls2 = obj.getClass();
            try {
                mj3Var = new mj3(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                mj3Var = new mj3(null, null);
            }
            wl7.f = mj3Var;
        }
        Method method = mj3Var.a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new va6(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
