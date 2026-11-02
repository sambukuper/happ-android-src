package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta6 extends xa6 implements vj3, zj3, pl3 {
    public final Class a;

    public ta6(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.vj3
    public final ja6 a(fk2 fk2Var) {
        fk2Var.getClass();
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return ys0.s(declaredAnnotations, fk2Var);
        }
        return null;
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return w27.n0(w27.l0(new la2(eu.Y(declaredFields), false, qa6.X), ra6.X));
    }

    public final fk2 c() {
        return ia6.a(this.a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        return w27.n0(w27.l0(new la2(eu.Y(declaredMethods), true, new f0(this, (byte) 29)), sa6.X));
    }

    public final v15 e() {
        Class cls = this.a;
        return cls.isAnonymousClass() ? v15.e(fm7.L0(cls.getName(), ".")) : v15.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ta6) {
            return this.a.equals(((ta6) obj).a);
        }
        return false;
    }

    public final ArrayList f() {
        z47 z47Var = z68.k;
        Object[] objArr = null;
        if (z47Var == null) {
            try {
                z47Var = new z47(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                z47Var = new z47(objArr, objArr, objArr, objArr, (byte) 21);
            }
            z68.k = z47Var;
        }
        Method method = (Method) z47Var.g0;
        objArr = method != null ? (Object[]) method.invoke(this.a, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new fb6(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        z47 z47Var = z68.k;
        Boolean bool = null;
        if (z47Var == null) {
            try {
                z47Var = new z47(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                z47Var = new z47(bool, bool, bool, bool, (byte) 21);
            }
            z68.k = z47Var;
        }
        Method method = (Method) z47Var.f0;
        if (method != null) {
            Object objInvoke = method.invoke(this.a, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        return declaredAnnotations != null ? ys0.u(declaredAnnotations) : d02.X;
    }

    @Override // defpackage.pl3
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new hb6(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ta6.class.getName() + ": " + this.a;
    }
}
