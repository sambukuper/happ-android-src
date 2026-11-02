package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk8 {
    public static final boolean a;
    public static final Method b;
    public static final Object c;
    public static final Object d;

    static {
        Class<?> cls;
        try {
            Class<?>[] declaredClasses = Locale.class.getDeclaredClasses();
            int length = declaredClasses.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cls = null;
                    break;
                }
                cls = declaredClasses[i];
                if (cls.getName().equals("java.util.Locale$Category")) {
                    break;
                } else {
                    i++;
                }
            }
            if (cls == null) {
                return;
            }
            b = Locale.class.getDeclaredMethod("getDefault", cls);
            Locale.class.getDeclaredMethod("setDefault", cls, Locale.class);
            Method method = cls.getMethod("name", null);
            for (Object obj : cls.getEnumConstants()) {
                String str = (String) method.invoke(obj, null);
                if (str.equals("DISPLAY")) {
                    c = obj;
                } else if (str.equals("FORMAT")) {
                    d = obj;
                }
            }
            if (c != null && d != null) {
                a = true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
        }
    }
}
