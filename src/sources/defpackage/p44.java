package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p44 extends ks0 {
    public final z47 i0;
    public final ta6 j0;
    public final sx4 k0;
    public final z47 l0;
    public final vz7 m0;
    public final us0 n0;
    public final fx4 o0;
    public final l5 p0;
    public final boolean q0;
    public final ul1 r0;
    public final t44 s0;
    public final gx6 t0;
    public final dd3 u0;
    public final h54 v0;
    public final n44 w0;
    public final te4 x0;

    static {
        eu.L0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p44(z47 z47Var, ed1 ed1Var, ta6 ta6Var, sx4 sx4Var) throws IllegalAccessException, InvocationTargetException {
        super((ve4) ((c6) z47Var.Y).f0, ed1Var, ta6Var.e(), lh4.Z0(ta6Var));
        z47Var.getClass();
        ed1Var.getClass();
        ta6Var.getClass();
        this.i0 = z47Var;
        this.j0 = ta6Var;
        this.k0 = sx4Var;
        z47 z47VarK = pu.k(z47Var, this, ta6Var, 4);
        this.l0 = z47VarK;
        ve4 ve4Var = (ve4) ((c6) z47VarK.Y).f0;
        this.m0 = new vz7(new o44(this, (byte) 0));
        Class cls = ta6Var.a;
        this.n0 = cls.isAnnotation() ? us0.g0 : cls.isInterface() ? us0.Y : cls.isEnum() ? us0.Z : us0.X;
        boolean zIsAnnotation = cls.isAnnotation();
        fx4 fx4Var = fx4.Y;
        byte b = 1;
        if (!zIsAnnotation && !cls.isEnum()) {
            Boolean boolR0 = z68.r0(cls);
            boolean zBooleanValue = boolR0 != null ? boolR0.booleanValue() : false;
            Boolean boolR1 = z68.r0(cls);
            boolean z = (boolR1 != null ? boolR1.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            fx4.X.getClass();
            if (zBooleanValue) {
                fx4Var = fx4.Z;
            } else if (z) {
                fx4Var = fx4.g0;
            } else if (!zIsFinal) {
                fx4Var = fx4.f0;
            }
        }
        this.o0 = fx4Var;
        int modifiers = cls.getModifiers();
        this.p0 = Modifier.isPublic(modifiers) ? az8.f0 : Modifier.isPrivate(modifiers) ? xy8.f0 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? xl3.f0 : wl3.f0 : vl3.f0;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.q0 = ((declaringClass != null ? new ta6(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.r0 = new ul1(this);
        t44 t44Var = new t44(z47VarK, this, ta6Var, sx4Var != null, null);
        this.s0 = t44Var;
        we5 we5Var = gx6.d;
        f0 f0Var = new f0(this, (byte) 20);
        we5Var.getClass();
        this.t0 = new gx6(this, ve4Var, f0Var);
        this.u0 = new dd3(t44Var);
        this.v0 = new h54(z47VarK, ta6Var, this);
        this.w0 = hi5.w0(z47VarK, ta6Var);
        this.x0 = new te4(ve4Var, new o44(this, b));
    }

    @Override // defpackage.sx4
    public final Collection B() {
        return (List) this.s0.q.invoke();
    }

    public final t44 B0() {
        return (t44) super.r0();
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.a;
        l5 l5Var = this.p0;
        if (dh3.f(l5Var, fl1Var)) {
            Class<?> declaringClass = this.j0.a.getDeclaringClass();
            if ((declaringClass != null ? new ta6(declaringClass) : null) == null) {
                fl1 fl1Var2 = ek3.a;
                fl1Var2.getClass();
                return fl1Var2;
            }
        }
        return s08.k(l5Var);
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        return this.n0;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return this.w0;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        return (List) this.x0.invoke();
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        return this.r0;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        return this.o0;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return this.q0;
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        return this.v0;
    }

    @Override // defpackage.m0, defpackage.sx4
    public final et4 q0() {
        return this.u0;
    }

    @Override // defpackage.sx4
    public final et4 r0() {
        return (t44) super.r0();
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        gx6 gx6Var = this.t0;
        m0 m0Var = gx6Var.a;
        int i = el1.a;
        bl1.c(m0Var).getClass();
        return (t44) ((et4) hi5.e0(gx6Var.c, gx6.e[0]));
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = el1.a;
        gk2 gk2VarF = bl1.f(this);
        gk2VarF.getClass();
        sb.append(gk2VarF);
        return sb.toString();
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        return null;
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return false;
    }
}
