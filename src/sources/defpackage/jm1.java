package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 extends q97 implements ml1 {
    public final vy5 H0;
    public final w15 I0;
    public final ux4 J0;
    public final dv8 K0;
    public final xl1 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(ed1 ed1Var, q97 q97Var, sm smVar, v15 v15Var, int i, vy5 vy5Var, w15 w15Var, ux4 ux4Var, dv8 dv8Var, xl1 xl1Var, ke7 ke7Var) {
        super(ed1Var, q97Var, smVar, v15Var, i, ke7Var == null ? ke7.G : ke7Var);
        ed1Var.getClass();
        smVar.getClass();
        if (i == 0) {
            throw null;
        }
        w15Var.getClass();
        dv8Var.getClass();
        this.H0 = vy5Var;
        this.I0 = w15Var;
        this.J0 = ux4Var;
        this.K0 = dv8Var;
        this.L0 = xl1Var;
    }

    @Override // defpackage.am1
    public final ux4 G() {
        return this.J0;
    }

    @Override // defpackage.q97, defpackage.jo2
    public final jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        v15 v15Var2;
        ed1Var.getClass();
        if (i == 0) {
            throw null;
        }
        smVar.getClass();
        q97 q97Var = (q97) ho2Var;
        if (v15Var == null) {
            v15 name = getName();
            name.getClass();
            v15Var2 = name;
        } else {
            v15Var2 = v15Var;
        }
        jm1 jm1Var = new jm1(ed1Var, q97Var, smVar, v15Var2, i, this.H0, this.I0, this.J0, this.K0, this.L0, ke7Var);
        jm1Var.z0 = this.z0;
        return jm1Var;
    }

    @Override // defpackage.am1
    public final w15 M() {
        return this.I0;
    }

    @Override // defpackage.am1
    public final xl1 N() {
        return this.L0;
    }

    @Override // defpackage.am1
    public final d2 x() {
        return this.H0;
    }
}
