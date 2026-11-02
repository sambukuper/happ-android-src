package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class no8 extends f50 {
    public final c25 t0;

    public no8(f50 f50Var, c25 c25Var) {
        super(f50Var, f50Var.Y);
        this.t0 = c25Var;
    }

    @Override // defpackage.f50
    public final ar3 a(g33 g33Var, Class cls, t37 t37Var) {
        dh8 dh8Var = this.h0;
        ar3 ar3VarP = dh8Var != null ? t37Var.p(t37Var.e(dh8Var, cls), this) : t37Var.q(cls, this);
        boolean zD = ar3VarP.d();
        c25 a25Var = this.t0;
        if (zD && (ar3VarP instanceof oo8)) {
            a25Var = new a25(a25Var, ((oo8) ar3VarP).m0);
        }
        ar3 ar3VarG = ar3VarP.g(a25Var);
        this.o0 = this.o0.J(cls, ar3VarG);
        return ar3VarG;
    }

    @Override // defpackage.f50
    public final void g(ar3 ar3Var) {
        if (ar3Var != null) {
            boolean zD = ar3Var.d();
            c25 a25Var = this.t0;
            if (zD && (ar3Var instanceof oo8)) {
                a25Var = new a25(a25Var, ((oo8) ar3Var).m0);
            }
            ar3Var = ar3Var.g(a25Var);
        }
        super.g(ar3Var);
    }

    @Override // defpackage.f50
    public final f50 i(c25 c25Var) {
        return new no8(this, new a25(c25Var, this.t0), new r37(c25Var.a(this.Y.X)));
    }

    @Override // defpackage.f50
    public final void k(Object obj, ro3 ro3Var, t37 t37Var) {
        Method method = this.j0;
        Object objInvoke = method == null ? this.k0.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            return;
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
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && d(obj, ro3Var, t37Var, ar3VarA)) {
            return;
        }
        if (!ar3VarA.d()) {
            ro3Var.R(this.Y);
        }
        ri8 ri8Var = this.n0;
        if (ri8Var == null) {
            ar3VarA.e(objInvoke, ro3Var, t37Var);
        } else {
            ar3VarA.f(objInvoke, ro3Var, t37Var, ri8Var);
        }
    }

    public no8(no8 no8Var, a25 a25Var, r37 r37Var) {
        super(no8Var, r37Var);
        this.t0 = a25Var;
    }
}
