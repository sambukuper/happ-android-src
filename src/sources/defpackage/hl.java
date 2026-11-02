package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hl extends ul {
    public final transient Method E0;
    public Class[] F0;

    public hl(pi8 pi8Var, Method method, yr2 yr2Var, yr2[] yr2VarArr) {
        super(pi8Var, yr2Var, yr2VarArr);
        if (method != null) {
            this.E0 = method;
        } else {
            bt.q("Cannot construct AnnotatedMethod with null Method");
            throw null;
        }
    }

    @Override // defpackage.gl
    public final String A0() {
        String strA0 = super.A0();
        int iG0 = G0();
        if (iG0 == 0) {
            return strA0.concat("()");
        }
        if (iG0 != 1) {
            return String.format("%s(%d params)", super.A0(), Integer.valueOf(G0()));
        }
        return strA0 + "(" + I0(0).getName() + ")";
    }

    @Override // defpackage.gl
    public final Member B0() {
        return this.E0;
    }

    @Override // defpackage.gl
    public final Object C0(Object obj) {
        try {
            return this.E0.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + A0() + ": " + it0.h(e), e);
        }
    }

    @Override // defpackage.gl
    public final vj8 E0(yr2 yr2Var) {
        return new hl(this.B0, this.E0, yr2Var, this.D0);
    }

    @Override // defpackage.ul
    public final int G0() {
        return this.E0.getParameterTypes().length;
    }

    @Override // defpackage.ul
    public final dh8 H0(int i) {
        Type[] genericParameterTypes = this.E0.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.B0.d(genericParameterTypes[i]);
    }

    @Override // defpackage.ul
    public final Class I0(int i) {
        Class<?>[] parameterTypes = this.F0;
        if (parameterTypes == null) {
            parameterTypes = this.E0.getParameterTypes();
            this.F0 = parameterTypes;
        }
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // defpackage.vj8
    public final int K() {
        return this.E0.getModifiers();
    }

    @Override // defpackage.vj8
    public final String L() {
        return this.E0.getName();
    }

    @Override // defpackage.vj8
    public final Class N() {
        return this.E0.getReturnType();
    }

    @Override // defpackage.vj8
    public final dh8 Q() {
        return this.B0.d(this.E0.getGenericReturnType());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (it0.o(hl.class, obj)) {
            return Objects.equals(this.E0, ((hl) obj).E0);
        }
        return false;
    }

    public final int hashCode() {
        return this.E0.hashCode();
    }

    public final String toString() {
        return "[method " + A0() + "]";
    }

    @Override // defpackage.gl
    public final Class z0() {
        return this.E0.getDeclaringClass();
    }
}
