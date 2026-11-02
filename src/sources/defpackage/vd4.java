package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd4 {
    public static final q06 a;

    static {
        Object rj6Var;
        try {
            ClassLoader classLoader = yv6.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof q06) {
                        rj6Var = (q06) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof ti1)) {
                    i++;
                }
                rj6Var = null;
                break;
            }
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        q06 ox1Var = (q06) (rj6Var instanceof rj6 ? null : rj6Var);
        if (ox1Var == null) {
            ox1Var = new ox1(new ei3((byte) 27), (byte) 1);
        }
        a = ox1Var;
    }
}
