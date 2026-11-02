package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ak6 extends gm3 {
    public final im3 g0;

    public ak6(im3 im3Var) {
        this.g0 = im3Var;
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return false;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        Object objM = j().M();
        boolean z = objM instanceof xx0;
        im3 im3Var = this.g0;
        if (z) {
            im3Var.f(w39.t(((xx0) objM).a));
        } else {
            im3Var.f(sm3.a(objM));
        }
    }
}
