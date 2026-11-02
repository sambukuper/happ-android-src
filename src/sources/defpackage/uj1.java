package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uj1 extends sj1 implements hw3 {
    public static final /* synthetic */ nw3[] k0 = {new lx5(uj1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
    public final tb6 i0 = zc1.X(null, new tj1(this, 0));
    public final g44 j0 = x97.P(w74.X, new tj1(this, 1));

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.ej1
    public final kk1 U() {
        return (kk1) X().j();
    }

    @Override // defpackage.ej1
    public final ld0 V() {
        nw3 nw3Var = k0[0];
        Object objInvoke = this.i0.invoke();
        objInvoke.getClass();
        return (hx5) objInvoke;
    }

    @Override // defpackage.sj1
    public final cx5 W() {
        nw3 nw3Var = k0[0];
        Object objInvoke = this.i0.invoke();
        objInvoke.getClass();
        return (hx5) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uj1) && dh3.f(X(), ((uj1) obj).X());
    }

    @Override // defpackage.xu3
    public final String getName() {
        return oi0.o(new StringBuilder("<get-"), X().j0, '>');
    }

    public final int hashCode() {
        return X().hashCode();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.j0.getValue();
    }

    public final String toString() {
        return "getter of " + X();
    }
}
