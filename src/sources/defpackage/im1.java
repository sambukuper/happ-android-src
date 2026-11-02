package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 extends gx5 implements ml1 {
    public final cz5 E0;
    public final w15 F0;
    public final ux4 G0;
    public final dv8 H0;
    public final xl1 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im1(ed1 ed1Var, fx5 fx5Var, sm smVar, fx4 fx4Var, fl1 fl1Var, boolean z, v15 v15Var, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, cz5 cz5Var, w15 w15Var, ux4 ux4Var, dv8 dv8Var, xl1 xl1Var) {
        super(ed1Var, fx5Var, smVar, fx4Var, fl1Var, z, v15Var, i, ke7.G, z2, z3, z6, z4, z5);
        ed1Var.getClass();
        smVar.getClass();
        fx4Var.getClass();
        fl1Var.getClass();
        v15Var.getClass();
        if (i == 0) {
            throw null;
        }
        w15Var.getClass();
        dv8Var.getClass();
        this.E0 = cz5Var;
        this.F0 = w15Var;
        this.G0 = ux4Var;
        this.H0 = dv8Var;
        this.I0 = xl1Var;
    }

    @Override // defpackage.am1
    public final ux4 G() {
        return this.G0;
    }

    @Override // defpackage.gx5
    public final gx5 J0(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var, fx5 fx5Var, int i, v15 v15Var) {
        ed1Var.getClass();
        fx4Var.getClass();
        fl1Var.getClass();
        if (i == 0) {
            throw null;
        }
        v15Var.getClass();
        return new im1(ed1Var, fx5Var, getAnnotations(), fx4Var, fl1Var, this.j0, v15Var, i, this.r0, this.s0, k(), this.v0, this.t0, this.E0, this.F0, this.G0, this.H0, this.I0);
    }

    @Override // defpackage.am1
    public final w15 M() {
        return this.F0;
    }

    @Override // defpackage.am1
    public final xl1 N() {
        return this.I0;
    }

    @Override // defpackage.gx5, defpackage.ts4
    public final boolean k() {
        return md2.H.e(this.E0.f0).booleanValue();
    }

    @Override // defpackage.am1
    public final d2 x() {
        return this.E0;
    }
}
