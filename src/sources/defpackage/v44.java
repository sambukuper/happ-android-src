package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v44 extends uf5 {
    public static final /* synthetic */ nw3[] q0 = {new lx5(v44.class, "binaryClasses", "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;", 0)};
    public final db6 k0;
    public final z47 l0;
    public final te4 m0;
    public final tt3 n0;
    public final ne4 o0;
    public final sm p0;

    /* JADX WARN: Illegal instructions before constructor call */
    public v44(z47 z47Var, db6 db6Var) {
        c6 c6Var = (c6) z47Var.Y;
        super((wx4) c6Var.n0, db6Var.a);
        this.k0 = db6Var;
        z47 z47VarK = pu.k(z47Var, this, null, 6);
        this.l0 = z47VarK;
        ((zl1) c6Var.j0).c().c.getClass();
        hv4 hv4Var = hv4.g;
        c6 c6Var2 = (c6) z47VarK.Y;
        ve4 ve4Var = (ve4) c6Var2.f0;
        this.m0 = new te4(ve4Var, new u44(this, (byte) 0));
        this.n0 = new tt3(z47VarK, db6Var, this);
        this.o0 = new ne4(ve4Var, new u44(this, (byte) 1));
        this.p0 = ((o8) c6Var2.g0).Y ? oy1.f0 : hi5.w0(z47VarK, db6Var);
    }

    @Override // defpackage.tf5
    public final et4 K() {
        return this.n0;
    }

    @Override // defpackage.cw0, defpackage.zk
    public final sm getAnnotations() {
        return this.p0;
    }

    @Override // defpackage.uf5, defpackage.hd1, defpackage.gd1
    public final ke7 getSource() {
        return new vk1((Object) this, (byte) 21);
    }

    @Override // defpackage.uf5, defpackage.fd1
    public final String toString() {
        return "Lazy Java package fragment: " + this.i0 + " of module " + ((wx4) ((c6) this.l0.Y).n0);
    }
}
