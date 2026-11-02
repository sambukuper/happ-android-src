package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class f50 implements d50, Serializable {
    public final ix5 X;
    public final r37 Y;
    public final jx5 Z;
    public final dh8 f0;
    public final dh8 g0;
    public dh8 h0;
    public final gl i0;
    public final transient Method j0;
    public final transient Field k0;
    public ar3 l0;
    public ar3 m0;
    public ri8 n0;
    public transient g33 o0;
    public final boolean p0;
    public final Object q0;
    public final Class[] r0;
    public final transient HashMap s0;

    public f50(e50 e50Var, gl glVar, tm tmVar, dh8 dh8Var, ar3 ar3Var, si8 si8Var, dh8 dh8Var2, boolean z, Object obj, Class[] clsArr) {
        ix5 ix5VarI = e50Var.i();
        this.X = ix5VarI == null ? ix5.j0 : ix5VarI;
        this.i0 = glVar;
        this.Y = new r37(e50Var.j());
        e50Var.n();
        this.Z = null;
        this.f0 = dh8Var;
        this.l0 = ar3Var;
        this.o0 = ar3Var == null ? px5.f : null;
        this.n0 = si8Var;
        this.g0 = dh8Var2;
        if (glVar instanceof el) {
            this.j0 = null;
            this.k0 = ((el) glVar).D0;
        } else if (glVar instanceof hl) {
            this.j0 = ((hl) glVar).E0;
            this.k0 = null;
        } else {
            this.j0 = null;
            this.k0 = null;
        }
        this.p0 = z;
        this.q0 = obj;
        this.m0 = null;
        this.r0 = clsArr;
    }

    public ar3 a(g33 g33Var, Class cls, t37 t37Var) {
        zz2 zz2Var;
        dh8 dh8Var = this.h0;
        byte b = 25;
        if (dh8Var != null) {
            dh8 dh8VarE = t37Var.e(dh8Var, cls);
            g33Var.getClass();
            ar3 ar3VarM = t37Var.m(dh8VarE, this);
            zz2Var = new zz2(ar3VarM, g33Var.J(dh8VarE.j0, ar3VarM), b);
        } else {
            g33Var.getClass();
            ar3 ar3VarN = t37Var.n(cls, this);
            zz2Var = new zz2(ar3VarN, g33Var.J(cls, ar3VarN), b);
        }
        g33 g33Var2 = (g33) zz2Var.Z;
        if (g33Var != g33Var2) {
            this.o0 = g33Var2;
        }
        return (ar3) zz2Var.Y;
    }

    @Override // defpackage.d50
    public final gl b() {
        return this.i0;
    }

    @Override // defpackage.d50
    public final no3 c(vp4 vp4Var, Class cls) {
        ((wp4) vp4Var).getClass();
        no3 no3Var = no3.k0;
        m85 m85VarD = vp4Var.d();
        gl glVarB = b();
        no3 no3VarH = glVarB != null ? m85VarD.h(glVarB) : null;
        if (no3Var == null) {
            return no3VarH == null ? d50.a : no3VarH;
        }
        return no3VarH == null ? no3Var : no3Var.c(no3VarH);
    }

    public final boolean d(Object obj, ro3 ro3Var, t37 t37Var, ar3 ar3Var) throws nh3 {
        boolean zJ;
        if (!ar3Var.h()) {
            boolean zJ2 = t37Var.X.j(n37.h0);
            r37 r37Var = this.Y;
            if (!zJ2) {
                zJ = t37Var.X.j(n37.k0);
            } else if (!(ar3Var instanceof h50)) {
                zJ = false;
            } else {
                if (!(obj instanceof Throwable) || !(this.i0 instanceof el) || !"cause".equals(r37Var.X)) {
                    t37Var.A("Direct self-reference leading to cycle");
                    throw null;
                }
                zJ = true;
            }
            if (zJ) {
                if (this.m0 != null) {
                    if (((eq2) ro3Var).h0.a != 1) {
                        ro3Var.R(r37Var);
                    }
                    this.m0.e(null, ro3Var, t37Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d50
    public final ep3 e(vp4 vp4Var, Class cls) {
        m85 m85VarD = vp4Var.d();
        gl glVarB = b();
        if (glVarB == null) {
            return ep3.g0;
        }
        glVarB.N();
        return ep3.g0.a(m85VarD.x(glVarB));
    }

    public void f(ar3 ar3Var) {
        ar3 ar3Var2 = this.m0;
        if (ar3Var2 == null || ar3Var2 == ar3Var) {
            this.m0 = ar3Var;
        } else {
            bt.i(oi0.m("Cannot override _nullSerializer: had a ", it0.e(ar3Var2), ", trying to set to ", it0.e(ar3Var)));
        }
    }

    public void g(ar3 ar3Var) {
        ar3 ar3Var2 = this.l0;
        if (ar3Var2 == null || ar3Var2 == ar3Var) {
            this.l0 = ar3Var;
        } else {
            bt.i(oi0.m("Cannot override _serializer: had a ", it0.e(ar3Var2), ", trying to set to ", it0.e(ar3Var)));
        }
    }

    public void h(l37 l37Var) {
        boolean zF = l37Var.f(xp4.r0);
        Member memberB0 = this.i0.B0();
        if (memberB0 != null) {
            it0.d(memberB0, zF);
        }
    }

    public f50 i(c25 c25Var) {
        r37 r37Var = this.Y;
        String strA = c25Var.a(r37Var.X);
        return strA.equals(r37Var.X) ? this : new f50(this, jx5.a(strA));
    }

    public void j(Object obj, ro3 ro3Var, t37 t37Var) {
        Method method = this.j0;
        Object objInvoke = method == null ? this.k0.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            ar3 ar3Var = this.m0;
            if (ar3Var != null) {
                ar3Var.e(null, ro3Var, t37Var);
                return;
            } else {
                ro3Var.X();
                return;
            }
        }
        ar3 ar3VarA = this.l0;
        if (ar3VarA == null) {
            Class<?> cls = objInvoke.getClass();
            g33 g33Var = this.o0;
            ar3 ar3VarR = g33Var.R(cls);
            ar3VarA = ar3VarR == null ? a(g33Var, cls, t37Var) : ar3VarR;
        }
        Object obj2 = this.q0;
        if (obj2 != null) {
            if (dp3.Z == obj2) {
                if (ar3VarA.c(t37Var, objInvoke)) {
                    l(ro3Var, t37Var);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                l(ro3Var, t37Var);
                return;
            }
        }
        if (objInvoke == obj && d(obj, ro3Var, t37Var, ar3VarA)) {
            return;
        }
        ri8 ri8Var = this.n0;
        if (ri8Var == null) {
            ar3VarA.e(objInvoke, ro3Var, t37Var);
        } else {
            ar3VarA.f(objInvoke, ro3Var, t37Var, ri8Var);
        }
    }

    public void k(Object obj, ro3 ro3Var, t37 t37Var) {
        Method method = this.j0;
        Object objInvoke = method == null ? this.k0.get(obj) : method.invoke(obj, null);
        r37 r37Var = this.Y;
        Object obj2 = this.q0;
        if (objInvoke == null) {
            if ((obj2 == null || !t37Var.x(obj2)) && this.m0 != null) {
                ro3Var.R(r37Var);
                this.m0.e(null, ro3Var, t37Var);
                return;
            }
            return;
        }
        ar3 ar3VarA = this.l0;
        if (ar3VarA == null) {
            Class<?> cls = objInvoke.getClass();
            g33 g33Var = this.o0;
            ar3 ar3VarR = g33Var.R(cls);
            ar3VarA = ar3VarR == null ? a(g33Var, cls, t37Var) : ar3VarR;
        }
        if (obj2 != null) {
            if (dp3.Z == obj2) {
                if (ar3VarA.c(t37Var, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && d(obj, ro3Var, t37Var, ar3VarA)) {
            return;
        }
        ro3Var.R(r37Var);
        ri8 ri8Var = this.n0;
        if (ri8Var == null) {
            ar3VarA.e(objInvoke, ro3Var, t37Var);
        } else {
            ar3VarA.f(objInvoke, ro3Var, t37Var, ri8Var);
        }
    }

    public final void l(ro3 ro3Var, t37 t37Var) {
        ar3 ar3Var = this.m0;
        if (ar3Var != null) {
            ar3Var.e(null, ro3Var, t37Var);
        } else {
            ro3Var.X();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(this.Y.X);
        sb.append("' (");
        Method method = this.j0;
        if (method != null) {
            sb.append("via method ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            sb.append(method.getName());
        } else {
            Field field = this.k0;
            if (field != null) {
                sb.append("field \"");
                sb.append(field.getDeclaringClass().getName());
                sb.append("#");
                sb.append(field.getName());
            } else {
                sb.append("virtual");
            }
        }
        if (this.l0 == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type ".concat(this.l0.getClass().getName()));
        }
        sb.append(')');
        return sb.toString();
    }

    public f50(f50 f50Var, jx5 jx5Var) {
        this(f50Var, false);
        this.Y = new r37(jx5Var.X);
        this.Z = f50Var.Z;
        this.f0 = f50Var.f0;
        this.i0 = f50Var.i0;
        this.j0 = f50Var.j0;
        this.k0 = f50Var.k0;
        this.l0 = f50Var.l0;
        this.m0 = f50Var.m0;
        if (f50Var.s0 != null) {
            this.s0 = new HashMap(f50Var.s0);
        }
        this.g0 = f50Var.g0;
        this.o0 = px5.f;
        this.p0 = f50Var.p0;
        this.q0 = f50Var.q0;
        this.r0 = f50Var.r0;
        this.n0 = f50Var.n0;
        this.h0 = f50Var.h0;
    }

    public f50(f50 f50Var, r37 r37Var) {
        this(f50Var, false);
        this.Y = r37Var;
        this.Z = f50Var.Z;
        this.i0 = f50Var.i0;
        this.f0 = f50Var.f0;
        this.j0 = f50Var.j0;
        this.k0 = f50Var.k0;
        this.l0 = f50Var.l0;
        this.m0 = f50Var.m0;
        if (f50Var.s0 != null) {
            this.s0 = new HashMap(f50Var.s0);
        }
        this.g0 = f50Var.g0;
        this.o0 = px5.f;
        this.p0 = f50Var.p0;
        this.q0 = f50Var.q0;
        this.r0 = f50Var.r0;
        this.n0 = f50Var.n0;
        this.h0 = f50Var.h0;
    }

    public f50(f50 f50Var, boolean z) {
        this.X = f50Var.X;
    }

    public f50(f50 f50Var) {
        this(f50Var, f50Var.Y);
    }
}
