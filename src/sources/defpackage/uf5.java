package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uf5 extends hd1 implements tf5 {
    public final fk2 i0;
    public final String j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public uf5(vx4 vx4Var, fk2 fk2Var) {
        vx4Var.getClass();
        fk2Var.getClass();
        rm rmVar = oy1.f0;
        gk2 gk2Var = fk2Var.a;
        super(vx4Var, rmVar, gk2Var.c() ? gk2.e : gk2Var.g(), ke7.G);
        this.i0 = fk2Var;
        this.j0 = "package " + fk2Var + " of " + vx4Var;
    }

    @Override // defpackage.hd1, defpackage.ed1
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final vx4 p() {
        ed1 ed1VarP = super.p();
        ed1VarP.getClass();
        return (vx4) ed1VarP;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.s(this, obj);
    }

    @Override // defpackage.hd1, defpackage.gd1
    public ke7 getSource() {
        return ke7.G;
    }

    @Override // defpackage.fd1
    public String toString() {
        return this.j0;
    }
}
