package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class it0 {
    public static final Annotation[] a = new Annotation[0];
    public static final gt0[] b = new gt0[0];
    public static final Method c;

    static {
        Collections.emptyIterator();
        Method method = null;
        try {
            method = Class.class.getMethod("isRecord", null);
        } catch (NoSuchMethodException unused) {
        }
        c = method;
    }

    public static void a(Class cls, Class cls2, ArrayList arrayList) {
        if (cls == cls2 || cls == null || cls == Object.class || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, arrayList);
        }
        a(cls.getSuperclass(), cls2, arrayList);
    }

    public static void b(Class cls, Throwable th) {
        String name = cls.getName();
        String name2 = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sbT = oi0.t("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbT.append(message);
        throw new IllegalArgumentException(sbT.toString(), th);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || q(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            Class<?> declaringClass2 = member.getDeclaringClass();
            StringBuilder sb = new StringBuilder("Cannot access ");
            sb.append(member);
            String name = declaringClass2.getName();
            String message = e.getMessage();
            sb.append(" (from class ");
            sb.append(name);
            sb.append("; failed to set access: ");
            sb.append(message);
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e2) {
            if (!"InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw e2;
            }
            String simpleName = member.getClass().getSimpleName();
            String name2 = member.getName();
            String strU = u(member.getDeclaringClass());
            String name3 = e2.getClass().getName();
            String message2 = e2.getMessage();
            StringBuilder sbT = oi0.t("Failed to call `setAccess()` on ", simpleName, " '", name2, "' (of class ");
            oi0.y(sbT, strU, ") due to `", name3, "`, problem: ");
            sbT.append(message2);
            throw new IllegalArgumentException(sbT.toString(), e2);
        }
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return u(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void f(r59 r59Var, Closeable closeable, Exception exc) throws IOException {
        if (r59Var != null) {
            r59Var.j1(qo3.f0);
            try {
                r59Var.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        if (exc instanceof IOException) {
            throw ((IOException) exc);
        }
        w(exc);
        throw new RuntimeException(exc);
    }

    public static Object g(Class cls, boolean z) {
        Constructor declaredConstructor;
        try {
            declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                d(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
        } catch (NoSuchMethodException unused) {
            declaredConstructor = null;
        } catch (Exception e) {
            e = e;
            String str = "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage();
            while (e.getCause() != null) {
                e = e.getCause();
            }
            w(e);
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw new IllegalArgumentException(str, e);
        }
        if (declaredConstructor == null) {
            u52.m("Class ", cls.getName(), " has no default (no arg) constructor");
            return null;
        }
        try {
            return declaredConstructor.newInstance(null);
        } catch (Exception e2) {
            e = e2;
            String str2 = "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage();
            while (e.getCause() != null) {
                e = e.getCause();
            }
            w(e);
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw new IllegalArgumentException(str2, e);
        }
    }

    public static String h(Throwable th) {
        if (th instanceof hj3) {
            return ((hj3) th).a();
        }
        return (!(th instanceof InvocationTargetException) || th.getCause() == null) ? th.getMessage() : th.getCause().getMessage();
    }

    public static Annotation[] i(Class cls) {
        return s(cls) ? a : cls.getDeclaredAnnotations();
    }

    public static ArrayList j(Class cls, Class cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static Method[] k(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Exception e) {
            b(cls, e);
            throw null;
        } catch (NoClassDefFoundError e2) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                b(cls, e2);
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Exception e3) {
                    b(cls, e3);
                    throw null;
                }
            } catch (ClassNotFoundException e4) {
                e2.addSuppressed(e4);
                b(cls, e2);
                throw null;
            }
        }
    }

    public static gt0[] l(Class cls) {
        if (cls.isInterface() || s(cls)) {
            return b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        gt0[] gt0VarArr = new gt0[length];
        for (int i = 0; i < length; i++) {
            gt0VarArr[i] = new gt0(declaredConstructors[i]);
        }
        return gt0VarArr;
    }

    public static Class m(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if ((s(cls) || cls.getEnclosingMethod() == null) && !s(cls)) {
                    return cls.getEnclosingClass();
                }
                return null;
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static String n(dh8 dh8Var) {
        if (dh8Var == null) {
            return "[null]";
        }
        int i = 0;
        while (true) {
            dh8Var.getClass();
            if (!(dh8Var instanceof cu)) {
                break;
            }
            i++;
            dh8Var = ((cu) dh8Var).s0;
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(dh8Var.w0());
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                sb.append('`');
                return sb.toString();
            }
            sb.append(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            i = i2;
        }
    }

    public static boolean o(Class cls, Object obj) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean p(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == w45.class;
    }

    public static boolean q(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.");
    }

    public static boolean r(ar3 ar3Var) {
        return ar3Var == null || ar3Var.getClass().getAnnotation(lj3.class) != null;
    }

    public static boolean s(Class cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean t(Class cls) {
        Method method = c;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(cls, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String u(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2);
        sb2.append('`');
        sb2.append(simpleName);
        sb2.append('`');
        return sb2.toString();
    }

    public static Class v(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void w(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
    }

    public static void x(Class cls, Serializable serializable, String str) {
        if (serializable.getClass() == cls) {
            return;
        }
        bt.i(oi0.p(oi0.t("Sub-class ", serializable.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
    }
}
