package defpackage;

import java.io.IOException;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op4 extends e41 implements p51 {
    public final d50 Z;
    public final boolean f0;
    public final dh8 g0;
    public final dh8 h0;
    public final ar3 i0;
    public final ar3 j0;
    public final ri8 k0;
    public g33 l0;
    public final Object m0;
    public final boolean n0;

    public op4(op4 op4Var, ar3 ar3Var, ar3 ar3Var2, Object obj, boolean z) {
        super(0, Map.class);
        this.g0 = op4Var.g0;
        this.h0 = op4Var.h0;
        this.f0 = op4Var.f0;
        this.k0 = op4Var.k0;
        this.i0 = ar3Var;
        this.j0 = ar3Var2;
        this.l0 = px5.f;
        this.Z = op4Var.Z;
        this.m0 = obj;
        this.n0 = z;
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarD;
        ar3 ar3VarD2;
        boolean zX;
        boolean z;
        Object obj;
        ep3 ep3VarE;
        dp3 dp3Var;
        l37 l37Var = t37Var.X;
        m85 m85VarD = l37Var.d();
        Object objR = null;
        gl glVarB = d50Var == null ? null : d50Var.b();
        if (glVarB != null) {
            Object objK = m85VarD.k(glVarB);
            ar3VarD2 = objK != null ? t37Var.D(glVarB, objK) : null;
            Object objC = m85VarD.c(glVarB);
            ar3VarD = objC != null ? t37Var.D(glVarB, objC) : null;
        } else {
            ar3VarD = null;
            ar3VarD2 = null;
        }
        if (ar3VarD == null) {
            ar3VarD = this.j0;
        }
        ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD);
        dh8 dh8Var = this.h0;
        if (ar3VarJ == null && this.f0 && !dh8Var.K0()) {
            ar3VarJ = t37Var.i(dh8Var, d50Var);
        }
        ar3 ar3Var = ar3VarJ;
        if (ar3VarD2 == null) {
            ar3VarD2 = this.i0;
        }
        ar3 ar3VarK = ar3VarD2 == null ? t37Var.k(this.g0, d50Var) : t37Var.v(ar3VarD2, d50Var);
        if (d50Var != null && (ep3VarE = d50Var.e(l37Var, null)) != null && (dp3Var = ep3VarE.Y) != dp3.g0) {
            int iOrdinal = dp3Var.ordinal();
            zX = true;
            if (iOrdinal != 1) {
                dp3 dp3Var2 = dp3.Z;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        z = true;
                        obj = dp3Var2;
                    } else if (iOrdinal == 4) {
                        objR = ci8.r(dh8Var);
                        if (objR != null && objR.getClass().isArray()) {
                            objR = z51.y(objR);
                        }
                    } else if (iOrdinal != 5) {
                        zX = false;
                    } else {
                        objR = t37Var.w(ep3VarE.f0);
                        if (objR != null) {
                            zX = t37Var.x(objR);
                        }
                    }
                } else if (dh8Var.M()) {
                    objR = dp3Var2;
                }
            }
            return new op4(this, ar3VarK, ar3Var, obj, z);
        }
        objR = this.m0;
        zX = this.n0;
        z = zX;
        obj = objR;
        return new op4(this, ar3VarK, ar3Var, obj, z);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.n0;
        }
        Object obj2 = this.m0;
        if (obj2 == null) {
            return false;
        }
        ar3 ar3Var = this.j0;
        if (ar3Var == null) {
            Class<?> cls = value.getClass();
            ar3 ar3VarR = this.l0.R(cls);
            if (ar3VarR == null) {
                try {
                    g33 g33Var = this.l0;
                    d50 d50Var = this.Z;
                    g33Var.getClass();
                    ar3 ar3VarJ = t37Var.j(cls, d50Var);
                    g33 g33VarJ = g33Var.J(cls, ar3VarJ);
                    if (g33Var != g33VarJ) {
                        this.l0 = g33VarJ;
                    }
                    ar3Var = ar3VarJ;
                } catch (pp3 unused) {
                    return false;
                }
            } else {
                ar3Var = ar3VarR;
            }
        }
        return obj2 == dp3.Z ? ar3Var.c(t37Var, value) : obj2.equals(value);
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        ro3Var.a1(entry);
        p(entry, ro3Var, t37Var);
        ro3Var.J();
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        ro3Var.m(entry);
        z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(entry, gr3.START_OBJECT));
        p(entry, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarE);
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return new op4(this, this.i0, this.j0, this.m0, this.n0);
    }

    public final void p(Map.Entry entry, ro3 ro3Var, t37 t37Var) throws IOException {
        ar3 ar3Var;
        Object key = entry.getKey();
        ar3 ar3Var2 = key == null ? t37Var.i0 : this.i0;
        Object value = entry.getValue();
        if (value != null) {
            ar3Var = this.j0;
            if (ar3Var == null) {
                Class<?> cls = value.getClass();
                ar3 ar3VarR = this.l0.R(cls);
                if (ar3VarR == null) {
                    dh8 dh8Var = this.h0;
                    boolean zF0 = dh8Var.F0();
                    g33 g33Var = this.l0;
                    d50 d50Var = this.Z;
                    if (zF0) {
                        zz2 zz2VarR = g33Var.r(t37Var.e(dh8Var, cls), t37Var, d50Var);
                        g33 g33Var2 = (g33) zz2VarR.Z;
                        if (g33Var != g33Var2) {
                            this.l0 = g33Var2;
                        }
                        ar3Var = (ar3) zz2VarR.Y;
                    } else {
                        g33Var.getClass();
                        ar3VarR = t37Var.j(cls, d50Var);
                        g33 g33VarJ = g33Var.J(cls, ar3VarR);
                        if (g33Var != g33VarJ) {
                            this.l0 = g33VarJ;
                        }
                        ar3Var = ar3VarR;
                    }
                } else {
                    ar3Var = ar3VarR;
                }
            }
            Object obj = this.m0;
            if (obj != null) {
                if (obj == dp3.Z) {
                    if (ar3Var.c(t37Var, value)) {
                        return;
                    }
                } else if (obj.equals(value)) {
                    return;
                }
            }
        } else if (this.n0) {
            return;
        } else {
            ar3Var = t37Var.h0;
        }
        ar3Var2.e(key, ro3Var, t37Var);
        ri8 ri8Var = this.k0;
        try {
            if (ri8Var == null) {
                ar3Var.e(value, ro3Var, t37Var);
            } else {
                ar3Var.f(value, ro3Var, t37Var, ri8Var);
            }
        } catch (Exception e) {
            lj7.n(t37Var, e, entry, _UrlKt.FRAGMENT_ENCODE_SET + key);
            throw null;
        }
    }

    public op4(dh8 dh8Var, dh8 dh8Var2, dh8 dh8Var3, boolean z, si8 si8Var, d50 d50Var) {
        super(dh8Var);
        this.g0 = dh8Var2;
        this.h0 = dh8Var3;
        this.f0 = z;
        this.k0 = si8Var;
        this.Z = d50Var;
        this.l0 = px5.f;
        this.m0 = null;
        this.n0 = false;
    }
}
