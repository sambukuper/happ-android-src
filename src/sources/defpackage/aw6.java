package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aw6 {
    public static final List a = i21.L(Application.class, ov6.class);
    public static final List b = i21.K(ov6.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listK0 = eu.K0(parameterTypes);
            if (list.equals(listK0)) {
                return constructor;
            }
            if (list.size() == listK0.size() && listK0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final xw8 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (xw8) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            xw3.o(pc6.l(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            xw3.o(pc6.n("A ", cls, " cannot be instantiated."), e2);
            return null;
        } catch (InvocationTargetException e3) {
            xw3.o(pc6.l(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
