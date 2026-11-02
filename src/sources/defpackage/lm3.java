package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm3 extends gm3 {
    public final tz6 g0;
    public final /* synthetic */ rm3 h0;

    public lm3(rm3 rm3Var, tz6 tz6Var) {
        this.h0 = rm3Var;
        this.g0 = tz6Var;
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return false;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        rm3 rm3Var = this.h0;
        Object objM = rm3Var.M();
        if (!(objM instanceof xx0)) {
            objM = sm3.a(objM);
        }
        this.g0.i(rm3Var, objM);
    }
}
