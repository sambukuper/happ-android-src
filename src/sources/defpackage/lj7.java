package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj7 extends ar3 implements Serializable {
    public static final Object Y = new Object();
    public final Class X;

    public lj7(lj7 lj7Var) {
        this.X = lj7Var.X;
    }

    public static ar3 j(t37 t37Var, d50 d50Var, ar3 ar3Var) {
        gl glVarB;
        Object objD;
        Object obj = Y;
        Map identityHashMap = (Map) t37Var.r(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            e51 e51Var = (e51) t37Var.f0;
            e51 e51Var2 = e51.j0;
            e51Var.getClass();
            Map map = Collections.EMPTY_MAP;
            HashMap map2 = e51Var.i0;
            if (map2 == null) {
                HashMap map3 = new HashMap();
                map3.put(obj, identityHashMap);
                e51 e51Var3 = new e51();
                e51Var3.i0 = map3;
                e51Var = e51Var3;
            } else {
                map2.put(obj, identityHashMap);
            }
            t37Var.f0 = e51Var;
        } else if (identityHashMap.get(d50Var) != null) {
            return ar3Var;
        }
        identityHashMap.put(d50Var, Boolean.TRUE);
        try {
            m85 m85VarD = t37Var.X.d();
            if ((d50Var != null) && (glVarB = d50Var.b()) != null && (objD = m85VarD.D(glVarB)) != null) {
                d50Var.b();
                t37Var.f(objD);
                t37Var.s();
                throw null;
            }
            if (ar3Var == null) {
                identityHashMap.remove(d50Var);
                return ar3Var;
            }
            ar3 ar3VarV = t37Var.v(ar3Var, d50Var);
            identityHashMap.remove(d50Var);
            return ar3VarV;
        } catch (Throwable th) {
            identityHashMap.remove(d50Var);
            throw th;
        }
    }

    public static no3 k(t37 t37Var, d50 d50Var, Class cls) {
        if (d50Var != null) {
            return d50Var.c(t37Var.X, cls);
        }
        t37Var.X.getClass();
        return no3.k0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public static void m(t37 t37Var, Exception exc, Object obj, int i) throws IOException {
        boolean z;
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        Annotation[] annotationArr = it0.a;
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        if (t37Var != null) {
            if (t37Var.X.j(n37.i0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (cause instanceof IOException) {
            if (!z || !(cause instanceof hj3)) {
                throw ((IOException) cause);
            }
        } else if (!z) {
            it0.w(cause);
        }
        op3 op3Var = new op3();
        op3Var.X = obj;
        op3Var.Z = i;
        throw pp3.d(cause, op3Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public static void n(t37 t37Var, Exception exc, Object obj, String str) throws IOException {
        boolean z;
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        Annotation[] annotationArr = it0.a;
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        if (t37Var != null) {
            if (t37Var.X.j(n37.i0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (cause instanceof IOException) {
            if (!z || !(cause instanceof hj3)) {
                throw ((IOException) cause);
            }
        } else if (!z) {
            it0.w(cause);
        }
        throw pp3.d(cause, new op3(obj, str));
    }

    @Override // defpackage.ar3
    public final Class b() {
        return this.X;
    }

    public final void l(t37 t37Var, Object obj) {
        t37Var.X.getClass();
        t37Var.z(this.X, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        throw null;
    }

    public lj7(int i, Class cls) {
        this.X = cls;
    }

    public lj7(dh8 dh8Var) {
        this.X = dh8Var.j0;
    }

    public lj7(Class cls) {
        this.X = cls;
    }
}
