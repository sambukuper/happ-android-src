package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n74 extends fd1 {
    public static final /* synthetic */ nw3[] l0 = {new lx5(n74.class, "fragments", "getFragments()Ljava/util/List;", 0), new lx5(n74.class, "empty", "getEmpty()Z", 0)};
    public final wx4 g0;
    public final fk2 h0;
    public final te4 i0;
    public final te4 j0;
    public final p74 k0;

    /* JADX WARN: Illegal instructions before constructor call */
    public n74(wx4 wx4Var, fk2 fk2Var, ve4 ve4Var) {
        ve4Var.getClass();
        rm rmVar = oy1.f0;
        gk2 gk2Var = fk2Var.a;
        super(rmVar, gk2Var.c() ? gk2.e : gk2Var.g());
        this.g0 = wx4Var;
        this.h0 = fk2Var;
        this.i0 = new te4(ve4Var, new m74(this, (byte) 0));
        this.j0 = new te4(ve4Var, new m74(this, (byte) 1));
        this.k0 = new p74(ve4Var, new m74(this, (byte) 2));
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.j(this, obj);
    }

    public final boolean equals(Object obj) {
        n74 n74Var = obj instanceof n74 ? (n74) obj : null;
        return n74Var != null && dh3.f(this.h0, n74Var.h0) && dh3.f(this.g0, n74Var.g0);
    }

    public final int hashCode() {
        return this.h0.hashCode() + (this.g0.hashCode() * 31);
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        fk2 fk2Var = this.h0;
        if (fk2Var.a.c()) {
            return null;
        }
        return this.g0.b0(fk2Var.b());
    }
}
