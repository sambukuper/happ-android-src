package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class im3 extends mm0 {
    public final rm3 k0;

    public im3(q51 q51Var, rm3 rm3Var) {
        super(1, q51Var);
        this.k0 = rm3Var;
    }

    @Override // defpackage.mm0
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // defpackage.mm0
    public final Throwable p(rm3 rm3Var) {
        Throwable thB;
        Object objM = this.k0.M();
        if (!(objM instanceof km3) || (thB = ((km3) objM).b()) == null) {
            return objM instanceof xx0 ? ((xx0) objM).a : rm3Var.R();
        }
        return thB;
    }
}
