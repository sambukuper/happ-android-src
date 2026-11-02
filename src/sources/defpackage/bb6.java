package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bb6 extends xa6 implements vj3, fk3 {
    @Override // defpackage.vj3
    public final ja6 a(fk2 fk2Var) {
        fk2Var.getClass();
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return ys0.s(declaredAnnotations, fk2Var);
        }
        return null;
    }

    public abstract Member b();

    public final v15 c() {
        String name = b().getName();
        return name != null ? v15.e(name) : hf7.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        gb6 na6Var;
        gb6 eb6Var;
        boolean z2;
        ArrayList arrayList = new ArrayList(typeArr.length);
        ArrayList arrayListM = pz2.U0.m(b());
        int size = arrayListM != null ? arrayListM.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            type.getClass();
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    eb6Var = new eb6(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        na6Var = new na6(type);
                    } else {
                        na6Var = type instanceof WildcardType ? new jb6((WildcardType) type) : new va6(type);
                    }
                    eb6Var = na6Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    na6Var = new na6(type);
                } else {
                    na6Var = new na6(type);
                }
                eb6Var = na6Var;
            }
            String str = null;
            if (arrayListM != null) {
                String str2 = (String) wv0.u0(i + size, arrayListM);
                if (str2 == null) {
                    u52.e(i, size, c(), eb6Var, this);
                    return null;
                }
                str = str2;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList.add(new ib6(eb6Var, annotationArr[i], str, z2));
        }
        return arrayList;
    }

    public final l5 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return az8.f0;
        }
        if (Modifier.isPrivate(modifiers)) {
            return xy8.f0;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? xl3.f0 : wl3.f0;
        }
        return vl3.f0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bb6) && dh3.f(b(), ((bb6) obj).b());
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? ys0.u(declaredAnnotations) : d02.X;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
