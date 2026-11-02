package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y75 extends au {
    public final boolean g0;
    public final dh8 h0;
    public final ri8 i0;
    public final ar3 j0;
    public g33 k0;

    public y75(y75 y75Var, d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool) {
        super(y75Var, d50Var, bool);
        this.h0 = y75Var.h0;
        this.i0 = ri8Var;
        this.g0 = y75Var.g0;
        this.k0 = px5.f;
        this.j0 = ar3Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // defpackage.au, defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarD;
        dh8 dh8Var;
        Object objC;
        ri8 ri8Var = this.i0;
        ri8 ri8VarG = ri8Var != null ? ri8Var.g(d50Var) : ri8Var;
        if (d50Var != null) {
            gl glVarB = d50Var.b();
            m85 m85VarD = t37Var.X.d();
            if (glVarB == null || (objC = m85VarD.c(glVarB)) == null) {
                ar3VarD = null;
            } else {
                ar3VarD = t37Var.D(glVarB, objC);
            }
        } else {
            ar3VarD = null;
        }
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        Boolean boolA = no3VarK != null ? no3VarK.a(ko3.X) : null;
        ar3 ar3Var = this.j0;
        if (ar3VarD == null) {
            ar3VarD = ar3Var;
        }
        ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD);
        if (ar3VarJ == null && (dh8Var = this.h0) != null && this.g0 && !dh8Var.K0()) {
            ar3VarJ = t37Var.i(dh8Var, d50Var);
        }
        ar3 ar3Var2 = ar3VarJ;
        return (this.Z == d50Var && ar3Var2 == ar3Var && ri8Var == ri8VarG && Objects.equals(this.f0, boolA)) ? this : new y75(this, d50Var, ri8VarG, ar3Var2, boolA);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // defpackage.ar3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r4, defpackage.ro3 r5, defpackage.t37 r6) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.f0
            if (r0 != 0) goto L14
            n37 r1 = defpackage.n37.v0
            l37 r2 = r6.X
            boolean r1 = r2.j(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.r(r4, r5, r6)
            return
        L1c:
            r5.V0(r4)
            r3.r(r4, r5, r6)
            r5.D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y75.e(java.lang.Object, ro3, t37):void");
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return new y75(this.h0, this.g0, ri8Var, this.j0);
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new y75(this, d50Var, this.i0, this.j0, bool);
    }

    @Override // defpackage.au
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(Object[] objArr, ro3 ro3Var, t37 t37Var) throws IOException {
        Object obj;
        Object obj2;
        g33 g33VarJ;
        dh8 dh8Var = this.h0;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        int i = 0;
        ar3 ar3Var = this.j0;
        ri8 ri8Var = this.i0;
        if (ar3Var != null) {
            int length2 = objArr.length;
            Object obj3 = null;
            while (i < length2) {
                try {
                    obj3 = objArr[i];
                    if (obj3 == null) {
                        t37Var.h(ro3Var);
                    } else if (ri8Var == null) {
                        ar3Var.e(obj3, ro3Var, t37Var);
                    } else {
                        ar3Var.f(obj3, ro3Var, t37Var, ri8Var);
                    }
                    i++;
                } catch (Exception e) {
                    lj7.m(t37Var, e, obj3, i);
                    throw null;
                }
            }
            return;
        }
        d50 d50Var = this.Z;
        if (ri8Var != null) {
            int length3 = objArr.length;
            try {
                g33 g33Var = this.k0;
                obj2 = null;
                while (i < length3) {
                    try {
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            t37Var.h(ro3Var);
                        } else {
                            Class<?> cls = obj2.getClass();
                            ar3 ar3VarR = g33Var.R(cls);
                            if (ar3VarR == null && g33Var != (g33VarJ = g33Var.J(cls, (ar3VarR = t37Var.j(cls, d50Var))))) {
                                this.k0 = g33VarJ;
                            }
                            ar3VarR.f(obj2, ro3Var, t37Var, ri8Var);
                        }
                        i++;
                    } catch (Exception e2) {
                        e = e2;
                        lj7.m(t37Var, e, obj2, i);
                        throw null;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                obj2 = null;
            }
        } else {
            try {
                g33 g33Var2 = this.k0;
                obj = null;
                while (i < length) {
                    try {
                        obj = objArr[i];
                        if (obj == null) {
                            t37Var.h(ro3Var);
                        } else {
                            Class<?> cls2 = obj.getClass();
                            ar3 ar3VarR2 = g33Var2.R(cls2);
                            if (ar3VarR2 == null) {
                                if (dh8Var.F0()) {
                                    zz2 zz2VarR = g33Var2.r(t37Var.e(dh8Var, cls2), t37Var, d50Var);
                                    g33 g33Var3 = (g33) zz2VarR.Z;
                                    if (g33Var2 != g33Var3) {
                                        this.k0 = g33Var3;
                                    }
                                    ar3VarR2 = (ar3) zz2VarR.Y;
                                } else {
                                    ar3VarR2 = t37Var.j(cls2, d50Var);
                                    g33 g33VarJ2 = g33Var2.J(cls2, ar3VarR2);
                                    if (g33Var2 != g33VarJ2) {
                                        this.k0 = g33VarJ2;
                                    }
                                }
                            }
                            ar3VarR2.e(obj, ro3Var, t37Var);
                        }
                        i++;
                    } catch (Exception e4) {
                        e = e4;
                        lj7.m(t37Var, e, obj, i);
                        throw null;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                obj = null;
            }
        }
    }

    public y75(dh8 dh8Var, boolean z, ri8 ri8Var, ar3 ar3Var) {
        super(Object[].class);
        this.h0 = dh8Var;
        this.g0 = z;
        this.i0 = ri8Var;
        this.k0 = px5.f;
        this.j0 = ar3Var;
    }
}
