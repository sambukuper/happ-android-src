package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj3 {
    public static final aj3 d;
    public static final RuntimeException e;
    public final Method a;
    public final Method b;
    public final Method c;

    static {
        aj3 aj3Var = null;
        try {
            e = null;
            aj3Var = new aj3();
        } catch (RuntimeException e2) {
            e = e2;
        }
        d = aj3Var;
        e = e;
    }

    public aj3() {
        try {
            this.a = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.b = cls.getMethod("getName", null);
            this.c = cls.getMethod("getType", null);
        } catch (Exception e2) {
            xw3.o(oi0.m("Failed to access Methods needed to support `java.lang.Record`: (", e2.getClass().getName(), ") ", e2.getMessage()), e2);
            throw null;
        }
    }

    public final Object[] a(Class cls) {
        boolean zEquals;
        try {
            return (Object[]) this.a.invoke(cls, null);
        } catch (Exception e2) {
            e = e2;
            if (g25.a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"))) {
                if (e instanceof InvocationTargetException) {
                    e = e.getCause();
                }
                zEquals = e.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
            } else {
                zEquals = false;
            }
            if (zEquals) {
                return null;
            }
            bt.q("Failed to access RecordComponents of type ".concat(it0.u(cls)));
            return null;
        }
    }
}
