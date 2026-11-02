package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ja6 extends xa6 {
    public final Annotation a;

    public ja6(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        ka6 ua6Var;
        Annotation annotation = this.a;
        Method[] declaredMethods = zc1.M(zc1.K(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            v15 v15VarE = v15.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = ia6.a;
            if (Enum.class.isAssignableFrom(cls)) {
                ua6Var = new ya6(v15VarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                ua6Var = new la6(v15VarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                ua6Var = new ma6(v15VarE, (Object[]) objInvoke);
            } else {
                ua6Var = objInvoke instanceof Class ? new ua6(v15VarE, (Class) objInvoke) : new ab6(v15VarE, objInvoke);
            }
            arrayList.add(ua6Var);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ja6) {
            return this.a == ((ja6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return ja6.class.getName() + ": " + this.a;
    }
}
