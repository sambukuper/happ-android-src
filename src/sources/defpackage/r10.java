package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r10 implements q51, d71, Serializable {
    public final q51 X;

    public r10(q51 q51Var) {
        this.X = q51Var;
    }

    public d71 c() {
        q51 q51Var = this.X;
        if (q51Var instanceof d71) {
            return (d71) q51Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.q51
    public final void f(Object obj) {
        ?? r2 = this;
        while (true) {
            r10 r10Var = (r10) r2;
            q51 q51Var = r10Var.X;
            q51Var.getClass();
            try {
                obj = r10Var.q(obj);
                if (obj == c71.X) {
                    return;
                }
            } catch (Throwable th) {
                obj = new rj6(th);
            }
            r10Var.r();
            if (!(q51Var instanceof r10)) {
                q51Var.f(obj);
                return;
            }
            r2 = q51Var;
        }
    }

    public q51 m(q51 q51Var) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public q51 n(q51 q51Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement p() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        yc1 yc1Var = (yc1) getClass().getAnnotation(yc1.class);
        String str = null;
        if (yc1Var == null || yc1Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? yc1Var.l()[iIntValue] : -1;
        ru0 ru0Var = z51.j;
        ru0 ru0Var2 = z51.k;
        if (ru0Var2 == null) {
            try {
                ru0 ru0Var3 = new ru0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                z51.k = ru0Var3;
                ru0Var2 = ru0Var3;
            } catch (Exception unused2) {
                z51.k = ru0Var;
                ru0Var2 = ru0Var;
            }
        }
        if (ru0Var2 != ru0Var && (method = ru0Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = ru0Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = ru0Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = yc1Var.c();
        } else {
            strC = str + '/' + yc1Var.c();
        }
        return new StackTraceElement(strC, yc1Var.m(), yc1Var.f(), i);
    }

    public Object q(Object obj) {
        w39.n0(obj);
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objP = p();
        if (objP == null) {
            objP = getClass().getName();
        }
        sb.append(objP);
        return sb.toString();
    }

    public void r() {
    }
}
