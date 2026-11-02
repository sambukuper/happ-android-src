package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 {
    public final d2 a;
    public final Object b;
    public final d2 c;
    public final zp2 d;
    public final Method e;

    public aq2(d2 d2Var, Object obj, d2 d2Var2, zp2 zp2Var, Class cls) {
        if (d2Var == null) {
            bt.q("Null containingTypeDefaultInstance");
            throw null;
        }
        if (zp2Var.Y == a39.h0 && d2Var2 == null) {
            bt.q("Null messageDefaultInstance");
            throw null;
        }
        this.a = d2Var;
        this.b = obj;
        this.c = d2Var2;
        this.d = zp2Var;
        if (!bg3.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            xw3.o(p61.n(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object a(Object obj) {
        if (this.d.Y.X != c39.k0) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            xw3.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xw3.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.Y.X == c39.k0 ? Integer.valueOf(((bg3) obj).a()) : obj;
    }
}
