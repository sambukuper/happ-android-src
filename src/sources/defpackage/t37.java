package defpackage;

import io.sentry.c2;
import java.text.DateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t37 {
    public static final c75 m0 = new c75((byte) 3);
    public static final jn8 n0 = new jn8(Object.class, 0, 8);
    public final l37 X;
    public final os4 Y;
    public final xd6 Z;
    public transient w39 f0;
    public final jn8 g0;
    public final ar3 h0;
    public final c75 i0;
    public final y66 j0;
    public DateFormat k0;
    public final boolean l0;

    public t37(t37 t37Var, l37 l37Var, os4 os4Var) {
        this.g0 = n0;
        this.h0 = c75.f0;
        c75 c75Var = m0;
        this.i0 = c75Var;
        this.Y = os4Var;
        this.X = l37Var;
        xd6 xd6Var = t37Var.Z;
        this.Z = xd6Var;
        this.g0 = t37Var.g0;
        ar3 ar3Var = t37Var.h0;
        this.h0 = ar3Var;
        this.i0 = t37Var.i0;
        this.l0 = ar3Var == c75Var;
        l37Var.getClass();
        this.f0 = l37Var.g0;
        y66 y66Var = (y66) ((AtomicReference) xd6Var.Z).get();
        if (y66Var == null) {
            synchronized (xd6Var) {
                y66Var = (y66) ((AtomicReference) xd6Var.Z).get();
                if (y66Var == null) {
                    y66 y66Var2 = new y66((c24) xd6Var.Y);
                    ((AtomicReference) xd6Var.Z).set(y66Var2);
                    y66Var = y66Var2;
                }
            }
        }
        this.j0 = y66Var;
    }

    public final Object A(String str) throws nh3 {
        throw new nh3(((qf1) this).q0, str);
    }

    public final void B(z20 z20Var, e50 e50Var, String str, Object... objArr) throws nh3 {
        String strP;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String strJ = e50Var.j();
        if (strJ != null) {
            if (strJ.length() > 500) {
                strJ = strJ.substring(0, 500) + "]...[" + strJ.substring(strJ.length() - 500);
            }
            strP = pc6.p("\"", strJ, "\"");
        } else {
            strP = "[N/A]";
        }
        StringBuilder sbT = oi0.t("Invalid definition for property ", strP, " (of type ", it0.u(z20Var.a.j0), "): ");
        sbT.append(str);
        throw new nh3(((qf1) this).q0, sbT.toString());
    }

    public final void C(z20 z20Var, String str, Object... objArr) throws nh3 {
        String strU = it0.u(z20Var.a.j0);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new nh3(((qf1) this).q0, oi0.m("Invalid type definition for type ", strU, ": ", str));
    }

    public abstract ar3 D(vj8 vj8Var, Object obj);

    public final ar3 a(dh8 dh8Var) throws pp3 {
        try {
            ar3 ar3VarC = c(dh8Var);
            if (ar3VarC == null) {
                return ar3VarC;
            }
            xd6 xd6Var = this.Z;
            synchronized (xd6Var) {
                try {
                    c24 c24Var = (c24) xd6Var.Y;
                    if (((wu5) c24Var.X).g(new di8(dh8Var), ar3VarC, false) == null) {
                        ((AtomicReference) xd6Var.Z).set(null);
                    }
                    if (ar3VarC instanceof h50) {
                        ((h50) ar3VarC).t(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ar3VarC;
        } catch (IllegalArgumentException e) {
            throw new pp3(((qf1) this).q0, it0.h(e), e);
        }
    }

    public final ar3 b(Class cls) throws nh3 {
        dh8 dh8VarC = this.X.c(cls);
        try {
            ar3 ar3VarC = c(dh8VarC);
            if (ar3VarC == null) {
                return ar3VarC;
            }
            xd6 xd6Var = this.Z;
            synchronized (xd6Var) {
                try {
                    c24 c24Var = (c24) xd6Var.Y;
                    Object objG = ((wu5) c24Var.X).g(new di8(cls, false), ar3VarC, false);
                    c24 c24Var2 = (c24) xd6Var.Y;
                    Object objG2 = ((wu5) c24Var2.X).g(new di8(dh8VarC), ar3VarC, false);
                    if (objG == null || objG2 == null) {
                        ((AtomicReference) xd6Var.Z).set(null);
                    }
                    if (ar3VarC instanceof h50) {
                        ((h50) ar3VarC).t(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ar3VarC;
        } catch (IllegalArgumentException e) {
            A(it0.h(e));
            throw null;
        }
    }

    public final ar3 c(dh8 dh8Var) throws nh3 {
        Class cls;
        j50 j50Var = (j50) this.Y;
        j50Var.getClass();
        l37 l37Var = this.X;
        z20 z20VarI = l37Var.i(dh8Var);
        al alVar = z20VarI.e;
        ar3 ar3VarZ = f30.Z(this, alVar);
        if (ar3VarZ != null) {
            return ar3VarZ;
        }
        boolean z = false;
        try {
            dh8 dh8VarA0 = l37Var.d().a0(l37Var, alVar, dh8Var);
            if (dh8VarA0 != dh8Var) {
                z = true;
                if (!dh8VarA0.H0(dh8Var.j0)) {
                    z20VarI = l37Var.i(dh8VarA0);
                }
            }
            m85 m85Var = z20VarI.d;
            if (m85Var != null) {
                Object objE = m85Var.E(z20VarI.e);
                vp4 vp4Var = z20VarI.c;
                if (objE != null && (cls = (Class) objE) != z51.class && !it0.p(cls)) {
                    if (!a61.class.isAssignableFrom(cls)) {
                        om0.g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
                        return null;
                    }
                    vp4Var.getClass();
                    if (it0.g(cls, vp4Var.f(xp4.q0)) != null) {
                        c2.m();
                        return null;
                    }
                }
            }
            return j50Var.b0(this, dh8VarA0, z20VarI, z);
        } catch (pp3 e) {
            C(z20VarI, e.c(), new Object[0]);
            throw null;
        }
    }

    public final DateFormat d() {
        DateFormat dateFormat = this.k0;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.X.Y.g0.clone();
        this.k0 = dateFormat2;
        return dateFormat2;
    }

    public final dh8 e(dh8 dh8Var, Class cls) {
        return dh8Var.H0(cls) ? dh8Var : this.X.Y.X.g(dh8Var, cls, true);
    }

    public final void f(Object obj) {
        if (!(obj instanceof Class)) {
            om0.g("AnnotationIntrospector returned Converter definition of type ", obj.getClass().getName(), "; expected type Converter or Class<Converter> instead");
            return;
        }
        Class cls = (Class) obj;
        if (cls == z51.class || it0.p(cls)) {
            return;
        }
        if (!a61.class.isAssignableFrom(cls)) {
            om0.g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
            return;
        }
        l37 l37Var = this.X;
        l37Var.getClass();
        if (it0.g(cls, l37Var.f(xp4.q0)) == null) {
            return;
        }
        c2.m();
    }

    public final void g(String str, Object obj, ro3 ro3Var) {
        ro3Var.U(str);
        if (obj != null) {
            o(obj.getClass()).e(obj, ro3Var, this);
        } else if (this.l0) {
            ro3Var.X();
        } else {
            this.h0.e(null, ro3Var, this);
        }
    }

    public final void h(ro3 ro3Var) {
        if (this.l0) {
            ro3Var.X();
        } else {
            this.h0.e(null, ro3Var, this);
        }
    }

    public final ar3 i(dh8 dh8Var, d50 d50Var) {
        ar3 ar3VarA = this.j0.a(dh8Var);
        return (ar3VarA == null && (ar3VarA = this.Z.M(dh8Var)) == null && (ar3VarA = a(dh8Var)) == null) ? t(dh8Var.j0) : v(ar3VarA, d50Var);
    }

    public final ar3 j(Class cls, d50 d50Var) {
        ar3 ar3VarB = this.j0.b(cls);
        if (ar3VarB == null) {
            xd6 xd6Var = this.Z;
            ar3 ar3VarN = xd6Var.N(cls);
            if (ar3VarN == null) {
                ar3VarB = xd6Var.M(this.X.c(cls));
                if (ar3VarB == null && (ar3VarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                ar3VarB = ar3VarN;
            }
        }
        return v(ar3VarB, d50Var);
    }

    public final ar3 k(dh8 dh8Var, d50 d50Var) {
        ar3 ar3VarL = this.Y.l(this, dh8Var);
        if (ar3VarL instanceof h50) {
            ((h50) ar3VarL).t(this);
        }
        return v(ar3VarL, d50Var);
    }

    public abstract p59 l(Object obj, ex5 ex5Var);

    public final ar3 m(dh8 dh8Var, d50 d50Var) {
        ar3 ar3VarA = this.j0.a(dh8Var);
        return (ar3VarA == null && (ar3VarA = this.Z.M(dh8Var)) == null && (ar3VarA = a(dh8Var)) == null) ? t(dh8Var.j0) : u(ar3VarA, d50Var);
    }

    public final ar3 n(Class cls, d50 d50Var) {
        ar3 ar3VarB = this.j0.b(cls);
        if (ar3VarB == null) {
            xd6 xd6Var = this.Z;
            ar3 ar3VarN = xd6Var.N(cls);
            if (ar3VarN == null) {
                ar3VarB = xd6Var.M(this.X.c(cls));
                if (ar3VarB == null && (ar3VarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                ar3VarB = ar3VarN;
            }
        }
        return u(ar3VarB, d50Var);
    }

    public final ar3 o(Class cls) {
        ar3 ar3Var;
        ar3 ar3Var2;
        y66 y66Var = this.j0;
        wg wgVar = y66Var.a[y66Var.b & (cls.getName().hashCode() + 1)];
        if (wgVar == null) {
            ar3Var = null;
            break;
        }
        if (((Class) wgVar.d) != cls || !wgVar.a) {
            while (true) {
                wgVar = (wg) wgVar.c;
                if (wgVar == null) {
                    ar3Var = null;
                    break;
                }
                if (((Class) wgVar.d) == cls && wgVar.a) {
                    ar3Var = (ar3) wgVar.b;
                    break;
                }
            }
        } else {
            ar3Var = (ar3) wgVar.b;
        }
        if (ar3Var != null) {
            return ar3Var;
        }
        xd6 xd6Var = this.Z;
        synchronized (xd6Var) {
            ar3Var2 = (ar3) ((wu5) ((c24) xd6Var.Y).X).get(new di8(cls, true));
        }
        if (ar3Var2 != null) {
            return ar3Var2;
        }
        ar3 ar3VarQ = q(cls, null);
        os4 os4Var = this.Y;
        l37 l37Var = this.X;
        si8 si8VarM = os4Var.m(l37Var, l37Var.c(cls));
        if (si8VarM != null) {
            ar3VarQ = new fj8(si8VarM.g(null), ar3VarQ);
        }
        xd6 xd6Var2 = this.Z;
        synchronized (xd6Var2) {
            try {
                if (((wu5) ((c24) xd6Var2.Y).X).g(new di8(cls, true), ar3VarQ, false) == null) {
                    ((AtomicReference) xd6Var2.Z).set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ar3VarQ;
    }

    public final ar3 p(dh8 dh8Var, d50 d50Var) throws pp3 {
        if (dh8Var == null) {
            throw new pp3(((qf1) this).q0, "Null passed for `valueType` of `findValueSerializer()`", null);
        }
        ar3 ar3VarA = this.j0.a(dh8Var);
        return (ar3VarA == null && (ar3VarA = this.Z.M(dh8Var)) == null && (ar3VarA = a(dh8Var)) == null) ? t(dh8Var.j0) : v(ar3VarA, d50Var);
    }

    public final ar3 q(Class cls, d50 d50Var) {
        ar3 ar3VarB = this.j0.b(cls);
        if (ar3VarB == null) {
            xd6 xd6Var = this.Z;
            ar3 ar3VarN = xd6Var.N(cls);
            if (ar3VarN == null) {
                ar3VarB = xd6Var.M(this.X.c(cls));
                if (ar3VarB == null && (ar3VarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                ar3VarB = ar3VarN;
            }
        }
        return v(ar3VarB, d50Var);
    }

    public final Object r(Object obj) {
        Object obj2;
        HashMap map = ((e51) this.f0).i0;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return Collections.EMPTY_MAP.get(obj);
        }
        if (obj2 == e51.k0) {
            return null;
        }
        return obj2;
    }

    public final uh8 s() {
        return this.X.Y.X;
    }

    public final ar3 t(Class cls) {
        return cls == Object.class ? this.g0 : new jn8(cls, 0, (byte) 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ar3 u(ar3 ar3Var, d50 d50Var) {
        return (ar3Var == 0 || !(ar3Var instanceof p51)) ? ar3Var : ((p51) ar3Var).a(this, d50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ar3 v(ar3 ar3Var, d50 d50Var) {
        return (ar3Var == 0 || !(ar3Var instanceof p51)) ? ar3Var : ((p51) ar3Var).a(this, d50Var);
    }

    public Object w(Class cls) {
        if (cls == null) {
            return null;
        }
        l37 l37Var = this.X;
        l37Var.getClass();
        return it0.g(cls, l37Var.f(xp4.q0));
    }

    public abstract boolean x(Object obj);

    public final ex5 y(f85 f85Var) {
        Class cls = f85Var.b;
        l37 l37Var = this.X;
        l37Var.getClass();
        d85 d85Var = (d85) it0.g(cls, l37Var.f(xp4.q0));
        Class cls2 = f85Var.d;
        ex5 ex5Var = (ex5) d85Var;
        return cls2 == ex5Var.X ? ex5Var : new ex5(cls2, ex5Var.Y);
    }

    public final Object z(Class cls, String str) {
        if (cls != null) {
            s().b(null, cls, uh8.f0);
        }
        A(str);
        throw null;
    }

    public t37() {
        this.g0 = n0;
        this.h0 = c75.f0;
        this.i0 = m0;
        this.X = null;
        this.Y = null;
        this.Z = new xd6((byte) 7);
        this.j0 = null;
        this.f0 = null;
        this.l0 = true;
    }
}
