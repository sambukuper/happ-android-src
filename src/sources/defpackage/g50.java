package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g50 extends h50 {
    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        if (this.j0 != null) {
            ro3Var.m(obj);
            p(obj, ro3Var, t37Var, true);
            return;
        }
        ro3Var.a1(obj);
        if (this.h0 != null) {
            v(obj, ro3Var, t37Var);
            throw null;
        }
        u(obj, ro3Var, t37Var);
        ro3Var.J();
    }

    @Override // defpackage.ar3
    public final ar3 g(c25 c25Var) {
        return new oo8(this, c25Var);
    }

    @Override // defpackage.ar3
    public final ar3 i(Set set) {
        return new g50(this, set, null);
    }

    @Override // defpackage.h50
    public final h50 r() {
        return (this.j0 == null && this.h0 == null) ? new c50(this) : this;
    }

    public final String toString() {
        return "BeanSerializer for ".concat(this.X.getName());
    }

    @Override // defpackage.h50
    public final h50 z(f50[] f50VarArr, f50[] f50VarArr2) {
        return new g50(this, f50VarArr, f50VarArr2);
    }
}
