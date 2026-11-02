package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oo8 extends h50 {
    public final c25 m0;

    public oo8(h50 h50Var, c25 c25Var) {
        super(h50Var, h50.s(h50Var.f0, c25Var), h50.s(h50Var.g0, c25Var));
        this.m0 = c25Var;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        ro3Var.m(obj);
        if (this.j0 != null) {
            p(obj, ro3Var, t37Var, false);
        } else if (this.h0 == null) {
            u(obj, ro3Var, t37Var);
        } else {
            v(obj, ro3Var, t37Var);
            throw null;
        }
    }

    @Override // defpackage.h50, defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        if (t37Var.X.j(n37.j0)) {
            t37Var.z(this.X, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
            throw null;
        }
        ro3Var.m(obj);
        if (this.j0 != null) {
            o(obj, ro3Var, t37Var, ri8Var);
        } else if (this.h0 == null) {
            u(obj, ro3Var, t37Var);
        } else {
            v(obj, ro3Var, t37Var);
            throw null;
        }
    }

    @Override // defpackage.ar3
    public final ar3 g(c25 c25Var) {
        return new oo8(this, c25Var);
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for ".concat(this.X.getName());
    }

    @Override // defpackage.h50
    public final h50 w(Set set, Set set2) {
        return new oo8(this, set, set2);
    }

    @Override // defpackage.h50
    public final h50 x(Object obj) {
        return new oo8(this, this.j0, obj);
    }

    @Override // defpackage.h50
    public final h50 y(wg wgVar) {
        return new oo8(this, wgVar);
    }

    @Override // defpackage.h50
    public final h50 z(f50[] f50VarArr, f50[] f50VarArr2) {
        return new oo8(this, f50VarArr, f50VarArr2);
    }

    public oo8(oo8 oo8Var, Set set, Set set2) {
        super(oo8Var, set, set2);
        this.m0 = oo8Var.m0;
    }

    @Override // defpackage.h50
    public final h50 r() {
        return this;
    }

    public oo8(oo8 oo8Var, f50[] f50VarArr, f50[] f50VarArr2) {
        super(oo8Var, f50VarArr, f50VarArr2);
        this.m0 = oo8Var.m0;
    }

    public oo8(oo8 oo8Var, wg wgVar) {
        super(oo8Var, wgVar, oo8Var.h0);
        this.m0 = oo8Var.m0;
    }

    public oo8(oo8 oo8Var, wg wgVar, Object obj) {
        super(oo8Var, wgVar, obj);
        this.m0 = oo8Var.m0;
    }
}
