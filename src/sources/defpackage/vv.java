package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vv extends f50 {
    public final String t0;

    /* JADX WARN: Illegal instructions before constructor call */
    public vv(String str, m97 m97Var, tm tmVar, dh8 dh8Var) {
        dp3 dp3Var;
        Object obj;
        ep3 ep3Var = m97Var.g0;
        gl glVar = m97Var.Y;
        dp3 dp3Var2 = dp3.g0;
        dp3 dp3Var3 = dp3.X;
        boolean z = false;
        if (ep3Var != null && (dp3Var = ep3Var.X) != dp3Var3 && dp3Var != dp3Var2) {
            z = true;
        }
        boolean z2 = z;
        if (ep3Var == null) {
            obj = Boolean.FALSE;
        } else {
            dp3 dp3Var4 = ep3Var.X;
            obj = (dp3Var4 == dp3Var3 || dp3Var4 == dp3.Y || dp3Var4 == dp3Var2) ? null : dp3.Z;
        }
        super(m97Var, glVar, tmVar, dh8Var, null, null, null, z2, obj, null);
        this.t0 = str;
    }

    @Override // defpackage.f50
    public final void j(Object obj, ro3 ro3Var, t37 t37Var) {
        Object objR = t37Var.r(this.t0);
        if (objR == null) {
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
            Class<?> cls = objR.getClass();
            g33 g33Var = this.o0;
            ar3 ar3VarR = g33Var.R(cls);
            ar3VarA = ar3VarR == null ? a(g33Var, cls, t37Var) : ar3VarR;
        }
        Object obj2 = this.q0;
        if (obj2 != null) {
            if (dp3.Z == obj2) {
                if (ar3VarA.c(t37Var, objR)) {
                    l(ro3Var, t37Var);
                    return;
                }
            } else if (obj2.equals(objR)) {
                l(ro3Var, t37Var);
                return;
            }
        }
        if (objR == obj && d(obj, ro3Var, t37Var, ar3VarA)) {
            return;
        }
        ri8 ri8Var = this.n0;
        if (ri8Var == null) {
            ar3VarA.e(objR, ro3Var, t37Var);
        } else {
            ar3VarA.f(objR, ro3Var, t37Var, ri8Var);
        }
    }

    @Override // defpackage.f50
    public final void k(Object obj, ro3 ro3Var, t37 t37Var) {
        Object objR = t37Var.r(this.t0);
        r37 r37Var = this.Y;
        if (objR == null) {
            if (this.m0 != null) {
                ro3Var.R(r37Var);
                this.m0.e(null, ro3Var, t37Var);
                return;
            }
            return;
        }
        ar3 ar3VarA = this.l0;
        if (ar3VarA == null) {
            Class<?> cls = objR.getClass();
            g33 g33Var = this.o0;
            ar3 ar3VarR = g33Var.R(cls);
            ar3VarA = ar3VarR == null ? a(g33Var, cls, t37Var) : ar3VarR;
        }
        Object obj2 = this.q0;
        if (obj2 != null) {
            if (dp3.Z == obj2) {
                if (ar3VarA.c(t37Var, objR)) {
                    return;
                }
            } else if (obj2.equals(objR)) {
                return;
            }
        }
        if (objR == obj && d(obj, ro3Var, t37Var, ar3VarA)) {
            return;
        }
        ro3Var.R(r37Var);
        ri8 ri8Var = this.n0;
        if (ri8Var == null) {
            ar3VarA.e(objR, ro3Var, t37Var);
        } else {
            ar3VarA.f(objR, ro3Var, t37Var, ri8Var);
        }
    }
}
