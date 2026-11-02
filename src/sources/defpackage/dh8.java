package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dh8 extends mb6 implements uq3, Serializable, Type {
    public static final gh8 r0 = gh8.i0;
    public final Class j0;
    public final int k0;
    public final Object l0;
    public final Object m0;
    public final boolean n0;
    public final dh8 o0;
    public final dh8[] p0;
    public final gh8 q0;

    public dh8(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr, int i, Object obj, Object obj2, boolean z) {
        this.j0 = cls;
        this.k0 = cls.hashCode() + (i * 31);
        this.l0 = obj;
        this.m0 = obj2;
        this.n0 = z;
        this.q0 = gh8Var == null ? r0 : gh8Var;
        this.o0 = dh8Var;
        this.p0 = dh8VarArr;
    }

    public static void u0(Class cls, StringBuilder sb, boolean z) {
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            if (z) {
                sb.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb.append('F');
            return;
        }
        if (cls == Double.TYPE) {
            sb.append('D');
        } else if (cls == Void.TYPE) {
            sb.append('V');
        } else {
            bt.i("Unrecognized primitive type: ".concat(cls.getName()));
        }
    }

    public StringBuilder A0(StringBuilder sb) {
        u0(this.j0, sb, true);
        return sb;
    }

    public abstract StringBuilder B0(StringBuilder sb);

    public dh8 C0() {
        return null;
    }

    @Override // defpackage.mb6
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public dh8 E() {
        return null;
    }

    public dh8 E0() {
        return this.o0;
    }

    public boolean F0() {
        return this.q0.Y.length > 0;
    }

    public boolean G0() {
        return (this.m0 == null && this.l0 == null) ? false : true;
    }

    public final boolean H0(Class cls) {
        return this.j0 == cls;
    }

    public boolean I0() {
        return true;
    }

    public final boolean J0() {
        Annotation[] annotationArr = it0.a;
        return Enum.class.isAssignableFrom(this.j0);
    }

    public final boolean K0() {
        return this.j0 == Object.class;
    }

    public final boolean L0(Class cls) {
        Class cls2 = this.j0;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return null;
    }

    public final String N0() {
        return w0();
    }

    public dh8 O0(dh8 dh8Var) {
        return new cu(dh8Var, this.q0, Array.newInstance((Class<?>) dh8Var.j0, 0), this.l0, this.m0, this.n0);
    }

    public dh8 P0(si8 si8Var) {
        ho5.U0();
        throw null;
    }

    public dh8 Q0(dh8 dh8Var) {
        Object obj = dh8Var.m0;
        dh8 dh8VarS0 = obj != this.m0 ? S0(obj) : this;
        Object obj2 = dh8Var.l0;
        return obj2 != this.l0 ? dh8VarS0.T0(obj2) : dh8VarS0;
    }

    public dh8 R0() {
        ho5.U0();
        throw null;
    }

    public dh8 S0(Object obj) {
        ho5.U0();
        throw null;
    }

    public dh8 T0(Object obj) {
        ho5.U0();
        throw null;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.k0;
    }

    public final boolean v0(int i) {
        return this.j0.getTypeParameters().length == i;
    }

    public String w0() {
        return this.j0.getName();
    }

    public final dh8 x0(Class cls) {
        dh8 dh8VarX0;
        dh8[] dh8VarArr;
        if (cls == this.j0) {
            return this;
        }
        if (cls.isInterface() && (dh8VarArr = this.p0) != null) {
            for (dh8 dh8Var : dh8VarArr) {
                dh8 dh8VarX1 = dh8Var.x0(cls);
                if (dh8VarX1 != null) {
                    return dh8VarX1;
                }
            }
        }
        dh8 dh8Var2 = this.o0;
        if (dh8Var2 == null || (dh8VarX0 = dh8Var2.x0(cls)) == null) {
            return null;
        }
        return dh8VarX0;
    }

    public gh8 y0() {
        return this.q0;
    }

    public dh8 z0() {
        return null;
    }
}
