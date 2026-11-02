package defpackage;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uv extends lj7 implements p51 {
    public final /* synthetic */ byte Z = 0;
    public final ri8 f0;
    public final ar3 g0;
    public final d50 h0;
    public final dh8 i0;
    public final boolean j0;
    public transient g33 k0;
    public final Object l0;
    public final Object m0;

    /* JADX WARN: Illegal instructions before constructor call */
    public uv(uv uvVar, d50 d50Var, ri8 ri8Var, ar3 ar3Var, boolean z) {
        Class cls = uvVar.X;
        super(cls == null ? Object.class : cls);
        this.l0 = (gl) uvVar.l0;
        this.i0 = uvVar.i0;
        this.f0 = ri8Var;
        this.g0 = ar3Var;
        this.h0 = d50Var;
        this.j0 = z;
        this.m0 = (Set) uvVar.m0;
        this.k0 = px5.f;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarU;
        ep3 ep3VarE;
        dp3 dp3Var;
        Object obj;
        boolean z;
        boolean zF;
        Object objC;
        byte b = this.Z;
        boolean zX = false;
        Object obj2 = this.m0;
        d50 d50Var2 = this.h0;
        ar3 ar3Var = this.g0;
        ri8 ri8VarG = this.f0;
        dh8 dh8Var = this.i0;
        boolean z2 = this.j0;
        switch (b) {
            case 0:
                l37 l37Var = t37Var.X;
                ri8 ri8VarG2 = ri8VarG != null ? ri8VarG.g(d50Var) : ri8VarG;
                Object objR = null;
                if (d50Var != null) {
                    gl glVarB = d50Var.b();
                    m85 m85VarD = l37Var.d();
                    if (glVarB == null || (objC = m85VarD.c(glVarB)) == null) {
                        ar3VarU = null;
                    } else {
                        ar3VarU = t37Var.D(glVarB, objC);
                    }
                } else {
                    ar3VarU = null;
                }
                if (ar3VarU == null) {
                    if (ar3Var != null) {
                        ar3VarU = t37Var.u(ar3Var, d50Var);
                    } else if (ri8VarG2 != null) {
                        ar3VarU = ar3Var;
                    } else {
                        if (dh8Var.K0()) {
                            zF = false;
                        } else if (Modifier.isFinal(dh8Var.j0.getModifiers()) || dh8Var.n0) {
                            zF = true;
                        } else {
                            m85 m85VarD2 = l37Var.d();
                            if (d50Var != null && d50Var.b() != null) {
                                wq3 wq3VarH = m85VarD2.H(d50Var.b());
                                if (wq3VarH == wq3.Y) {
                                    zF = true;
                                } else if (wq3VarH == wq3.X) {
                                    zF = false;
                                }
                            }
                            zF = l37Var.f(xp4.t0);
                        }
                        if (zF) {
                            ar3VarU = t37Var.m(dh8Var, d50Var);
                        } else {
                            ar3VarU = ar3Var;
                        }
                    }
                }
                ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarU);
                uv uvVar = (d50Var2 == d50Var && ri8VarG == ri8VarG2 && ar3Var == ar3VarJ) ? this : new uv(this, d50Var, ri8VarG2, ar3VarJ, (c25) this.l0, this.m0, this.j0);
                if (d50Var != null && (ep3VarE = d50Var.e(l37Var, this.X)) != null && (dp3Var = ep3VarE.Y) != dp3.g0) {
                    int iOrdinal = dp3Var.ordinal();
                    if (iOrdinal != 1) {
                        dp3 dp3Var2 = dp3.Z;
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                obj = dp3Var2;
                                z = true;
                            } else if (iOrdinal != 4) {
                                if (iOrdinal == 5) {
                                    objR = t37Var.w(ep3VarE.f0);
                                    zX = objR != null ? t37Var.x(objR) : false;
                                }
                                z = zX;
                                obj = objR;
                            } else {
                                objR = ci8.r(dh8Var);
                                if (objR != null && objR.getClass().isArray()) {
                                    objR = z51.y(objR);
                                }
                            }
                        } else if (dh8Var.M()) {
                            objR = dp3Var2;
                        }
                        obj = objR;
                        z = true;
                    } else {
                        obj = objR;
                        z = true;
                    }
                    if (obj2 != obj || z2 != z) {
                        return new uv(uvVar, uvVar.h0, uvVar.f0, uvVar.g0, (c25) uvVar.l0, obj, z);
                    }
                }
                return uvVar;
            default:
                if (ri8VarG != null) {
                    ri8VarG = ri8VarG.g(d50Var);
                }
                if (ar3Var != null) {
                    return q(d50Var, ri8VarG, t37Var.u(ar3Var, d50Var), z2);
                }
                if (!t37Var.X.f(xp4.t0) && !Modifier.isFinal(dh8Var.j0.getModifiers())) {
                    return d50Var != d50Var2 ? q(d50Var, ri8VarG, ar3Var, z2) : this;
                }
                ar3 ar3VarM = t37Var.m(dh8Var, d50Var);
                Set set = (Set) obj2;
                if (ar3VarM != null && !set.isEmpty()) {
                    ar3VarM = ar3VarM.i(set);
                }
                Class cls = dh8Var.j0;
                if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
                    zX = it0.r(ar3VarM);
                }
                return q(d50Var, ri8VarG, ar3VarM, zX);
        }
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        byte b = this.Z;
        ar3 ar3VarO = this.g0;
        switch (b) {
            case 0:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference.get() == null) {
                    return true;
                }
                Object obj2 = atomicReference.get();
                if (obj2 == null) {
                    return this.j0;
                }
                Object obj3 = this.m0;
                if (obj3 == null) {
                    return false;
                }
                if (ar3VarO == null) {
                    try {
                        ar3VarO = o(t37Var, obj2.getClass());
                    } catch (pp3 e) {
                        throw new fr6(e);
                    }
                    break;
                }
                return obj3 == dp3.Z ? ar3VarO.c(t37Var, obj2) : obj3.equals(obj2);
            default:
                Object objC0 = ((gl) this.l0).C0(obj);
                if (objC0 == null) {
                    return true;
                }
                if (ar3VarO == null) {
                    try {
                        ar3VarO = p(t37Var, objC0.getClass());
                    } catch (pp3 e2) {
                        throw new fr6(e2);
                    }
                    break;
                }
                return ar3VarO.c(t37Var, objC0);
        }
    }

    @Override // defpackage.ar3
    public boolean d() {
        switch (this.Z) {
            case 0:
                return ((c25) this.l0) != null;
            default:
                return super.d();
        }
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        byte b = this.Z;
        ri8 ri8Var = this.f0;
        ar3 ar3VarO = this.g0;
        Object obj2 = this.l0;
        switch (b) {
            case 0:
                Object obj3 = ((AtomicReference) obj).get();
                if (obj3 == null) {
                    if (((c25) obj2) == null) {
                        t37Var.h(ro3Var);
                        return;
                    }
                    return;
                } else {
                    if (ar3VarO == null) {
                        ar3VarO = o(t37Var, obj3.getClass());
                    }
                    if (ri8Var != null) {
                        ar3VarO.f(obj3, ro3Var, t37Var, ri8Var);
                        return;
                    } else {
                        ar3VarO.e(obj3, ro3Var, t37Var);
                        return;
                    }
                }
            default:
                gl glVar = (gl) obj2;
                try {
                    Object objC0 = glVar.C0(obj);
                    if (objC0 == null) {
                        t37Var.h(ro3Var);
                        return;
                    }
                    if (ar3VarO == null) {
                        ar3VarO = p(t37Var, objC0.getClass());
                    }
                    if (ri8Var != null) {
                        ar3VarO.f(objC0, ro3Var, t37Var, ri8Var);
                        return;
                    } else {
                        ar3VarO.e(objC0, ro3Var, t37Var);
                        return;
                    }
                } catch (Exception e) {
                    lj7.n(t37Var, e, obj, glVar.L() + "()");
                    throw null;
                }
        }
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        byte b = this.Z;
        ar3 ar3VarO = this.g0;
        Object obj2 = this.l0;
        switch (b) {
            case 0:
                Object obj3 = ((AtomicReference) obj).get();
                if (obj3 == null) {
                    if (((c25) obj2) == null) {
                        t37Var.h(ro3Var);
                        return;
                    }
                    return;
                } else {
                    if (ar3VarO == null) {
                        ar3VarO = o(t37Var, obj3.getClass());
                    }
                    ar3VarO.f(obj3, ro3Var, t37Var, ri8Var);
                    return;
                }
            default:
                gl glVar = (gl) obj2;
                try {
                    Object objC0 = glVar.C0(obj);
                    if (objC0 == null) {
                        t37Var.h(ro3Var);
                        return;
                    }
                    if (ar3VarO == null) {
                        ar3VarO = p(t37Var, objC0.getClass());
                    } else if (this.j0) {
                        z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.VALUE_STRING));
                        ar3VarO.e(objC0, ro3Var, t37Var);
                        ri8Var.f(ro3Var, z76VarE);
                        return;
                    }
                    ar3VarO.f(objC0, ro3Var, t37Var, new ds3(ri8Var, obj));
                    return;
                } catch (Exception e) {
                    lj7.n(t37Var, e, obj, glVar.L() + "()");
                    throw null;
                }
        }
    }

    @Override // defpackage.ar3
    public ar3 g(c25 c25Var) {
        ar3 ar3Var;
        switch (this.Z) {
            case 0:
                ar3 ar3Var2 = this.g0;
                if (ar3Var2 != null) {
                    ar3 ar3VarG = ar3Var2.g(c25Var);
                    if (ar3VarG == ar3Var2) {
                        return this;
                    }
                    ar3Var = ar3VarG;
                } else {
                    ar3Var = ar3Var2;
                }
                c25 c25Var2 = (c25) this.l0;
                c25 a25Var = c25Var2 == null ? c25Var : new a25(c25Var, c25Var2);
                if (ar3Var2 == ar3Var && c25Var2 == a25Var) {
                    return this;
                }
                return new uv(this, this.h0, this.f0, ar3Var, a25Var, this.m0, this.j0);
            default:
                return this;
        }
    }

    public ar3 o(t37 t37Var, Class cls) {
        ar3 ar3VarR = this.k0.R(cls);
        if (ar3VarR != null) {
            return ar3VarR;
        }
        dh8 dh8Var = this.i0;
        boolean zF0 = dh8Var.F0();
        d50 d50Var = this.h0;
        ar3 ar3VarM = zF0 ? t37Var.m(t37Var.e(dh8Var, cls), d50Var) : t37Var.n(cls, d50Var);
        c25 c25Var = (c25) this.l0;
        if (c25Var != null) {
            ar3VarM = ar3VarM.g(c25Var);
        }
        this.k0 = this.k0.J(cls, ar3VarM);
        return ar3VarM;
    }

    public ar3 p(t37 t37Var, Class cls) {
        Set set = (Set) this.m0;
        ar3 ar3VarR = this.k0.R(cls);
        if (ar3VarR != null) {
            return ar3VarR;
        }
        dh8 dh8Var = this.i0;
        boolean zF0 = dh8Var.F0();
        d50 d50Var = this.h0;
        if (!zF0) {
            ar3 ar3VarN = t37Var.n(cls, d50Var);
            if (ar3VarN != null && !set.isEmpty()) {
                ar3VarN = ar3VarN.i(set);
            }
            this.k0 = this.k0.J(cls, ar3VarN);
            return ar3VarN;
        }
        dh8 dh8VarE = t37Var.e(dh8Var, cls);
        ar3 ar3VarM = t37Var.m(dh8VarE, d50Var);
        if (ar3VarM != null && !set.isEmpty()) {
            ar3VarM = ar3VarM.i(set);
        }
        g33 g33Var = this.k0;
        g33Var.getClass();
        this.k0 = g33Var.J(dh8VarE.j0, ar3VarM);
        return ar3VarM;
    }

    public uv q(d50 d50Var, ri8 ri8Var, ar3 ar3Var, boolean z) {
        return (this.h0 == d50Var && this.f0 == ri8Var && this.g0 == ar3Var && z == this.j0) ? this : new uv(this, d50Var, ri8Var, ar3Var, z);
    }

    public String toString() {
        switch (this.Z) {
            case 1:
                StringBuilder sb = new StringBuilder("(@JsonValue serializer for method ");
                gl glVar = (gl) this.l0;
                sb.append(glVar.z0());
                sb.append("#");
                sb.append(glVar.L());
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public uv(fa6 fa6Var, ri8 ri8Var, ar3 ar3Var) {
        super(fa6Var);
        this.i0 = fa6Var.s0;
        this.h0 = null;
        this.f0 = ri8Var;
        this.g0 = ar3Var;
        this.l0 = null;
        this.m0 = null;
        this.j0 = false;
        this.k0 = px5.f;
    }

    public uv(gl glVar, ri8 ri8Var, ar3 ar3Var, Set set) {
        super(glVar.Q());
        this.l0 = glVar;
        this.i0 = glVar.Q();
        this.f0 = ri8Var;
        this.g0 = ar3Var;
        this.h0 = null;
        this.j0 = true;
        this.m0 = set;
        this.k0 = px5.f;
    }

    public uv(uv uvVar, d50 d50Var, ri8 ri8Var, ar3 ar3Var, c25 c25Var, Object obj, boolean z) {
        super(uvVar);
        this.i0 = uvVar.i0;
        this.k0 = px5.f;
        this.h0 = d50Var;
        this.f0 = ri8Var;
        this.g0 = ar3Var;
        this.l0 = c25Var;
        this.m0 = obj;
        this.j0 = z;
    }
}
