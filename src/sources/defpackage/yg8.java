package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yg8 extends jo2 implements a41 {
    public static final s18 K0 = new s18((byte) 5);
    public final ve4 H0;
    public final km1 I0;
    public gs0 J0;

    public yg8(ve4 ve4Var, km1 km1Var, gs0 gs0Var, yg8 yg8Var, sm smVar, int i, ke7 ke7Var) {
        super(i, smVar, km1Var, yg8Var, hf7.e, ke7Var);
        this.H0 = ve4Var;
        this.I0 = km1Var;
        xg8 xg8Var = new xg8(this, gs0Var, (byte) 0);
        ve4Var.getClass();
        new se4(ve4Var, xg8Var);
        this.J0 = gs0Var;
    }

    @Override // defpackage.hd1
    /* JADX INFO: renamed from: G0 */
    public final gd1 a() {
        ho2 ho2VarA = super.a();
        ho2VarA.getClass();
        return (yg8) ho2VarA;
    }

    @Override // defpackage.ld0
    public final ld0 I(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        fl1Var.getClass();
        io2 io2VarM0 = M0(wi8.b);
        io2VarM0.Y = ed1Var;
        io2VarM0.Z = fx4Var;
        io2VarM0.f0 = fl1Var;
        io2VarM0.h0 = 2;
        io2VarM0.o0 = false;
        jo2 jo2VarJ0 = io2VarM0.z0.J0(io2VarM0);
        jo2VarJ0.getClass();
        return (yg8) jo2VarJ0;
    }

    @Override // defpackage.jo2
    public final jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        ed1Var.getClass();
        if (i == 0) {
            throw null;
        }
        smVar.getClass();
        if (i != 1) {
        }
        return new yg8(this.H0, this.I0, this.J0, this, smVar, 1, ke7Var);
    }

    @Override // defpackage.jo2, defpackage.ho2, defpackage.ew7
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final yg8 g(wi8 wi8Var) {
        wi8Var.getClass();
        ho2 ho2VarG = super.g(wi8Var);
        ho2VarG.getClass();
        yg8 yg8Var = (yg8) ho2VarG;
        t14 t14Var = yg8Var.k0;
        t14Var.getClass();
        gs0 gs0VarG = this.J0.a().g(wi8.d(t14Var));
        if (gs0VarG == null) {
            return null;
        }
        yg8Var.J0 = gs0VarG;
        return yg8Var;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final jd0 a() {
        ho2 ho2VarA = super.a();
        ho2VarA.getClass();
        return (yg8) ho2VarA;
    }

    @Override // defpackage.jo2, defpackage.jd0
    public final t14 j() {
        t14 t14Var = this.k0;
        t14Var.getClass();
        return t14Var;
    }

    @Override // defpackage.hd1, defpackage.ed1
    public final pt0 p() {
        return this.I0;
    }

    @Override // defpackage.hd1, defpackage.ed1
    public final ed1 p() {
        return this.I0;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ld0 a() {
        ho2 ho2VarA = super.a();
        ho2VarA.getClass();
        return (yg8) ho2VarA;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ed1 a() {
        ho2 ho2VarA = super.a();
        ho2VarA.getClass();
        return (yg8) ho2VarA;
    }

    @Override // defpackage.jo2, defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ho2 a() {
        ho2 ho2VarA = super.a();
        ho2VarA.getClass();
        return (yg8) ho2VarA;
    }
}
