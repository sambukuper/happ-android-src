package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au extends e41 implements p51 {
    public final d50 Z;
    public final Boolean f0;

    public au(au auVar, d50 d50Var, Boolean bool) {
        super(0, auVar.X);
        this.Z = d50Var;
        this.f0 = bool;
    }

    @Override // defpackage.p51
    public ar3 a(t37 t37Var, d50 d50Var) {
        no3 no3VarK;
        if (d50Var == null || (no3VarK = lj7.k(t37Var, d50Var, this.X)) == null) {
            return this;
        }
        Boolean boolA = no3VarK.a(ko3.X);
        return !Objects.equals(boolA, this.f0) ? q(d50Var, boolA) : this;
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.START_ARRAY));
        ro3Var.m(obj);
        r(obj, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarE);
    }

    public final boolean p(t37 t37Var) {
        Boolean bool = this.f0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return t37Var.X.j(n37.v0);
    }

    public ar3 q(d50 d50Var, Boolean bool) {
        return new wi7(this, d50Var, bool);
    }

    public void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (boolean z : (boolean[]) obj) {
            ro3Var.C(z);
        }
    }

    public au(Class cls) {
        super(cls);
        this.Z = null;
        this.f0 = null;
    }
}
