package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao8 {
    public static final Unsafe a;
    public static final Class b;
    public static final cw0 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        zn8 zn8Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new yn8());
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = qa.a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        char c2 = 1;
        byte b2 = 0;
        if (unsafe != null) {
            if (!qa.a()) {
                zn8Var = new zn8(unsafe, (byte) 2);
            } else if (zD) {
                zn8Var = new zn8(unsafe, c2 == true ? 1 : 0);
            } else if (zD2) {
                zn8Var = new zn8(unsafe, b2);
            }
        }
        c = zn8Var;
        d = zn8Var == null ? false : zn8Var.E0();
        e = zn8Var == null ? false : zn8Var.D0();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        if (fieldC != null && zn8Var != null) {
            ((Unsafe) zn8Var.X).objectFieldOffset(fieldC);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return ((Unsafe) c.X).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            ((Unsafe) c.X).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (qa.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean d(Class cls) {
        if (!qa.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean e(long j, Object obj) {
        return ((byte) ((f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int f(long j, Object obj) {
        return ((Unsafe) c.X).getInt(obj, j);
    }

    public static long g(long j, Object obj) {
        return ((Unsafe) c.X).getLong(obj, j);
    }

    public static Object h(long j, Object obj) {
        return ((Unsafe) c.X).getObject(obj, j);
    }

    public static void i(Throwable th) {
        Logger.getLogger(ao8.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.y0(bArr, f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iF = f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (iF & (~(255 << i))));
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (f(j2, obj) & (~(255 << i))));
    }

    public static void m(Object obj, long j, int i) {
        ((Unsafe) c.X).putInt(obj, j, i);
    }

    public static void n(Object obj, long j, long j2) {
        ((Unsafe) c.X).putLong(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        ((Unsafe) c.X).putObject(obj, j, obj2);
    }
}
