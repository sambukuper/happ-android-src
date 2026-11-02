package defpackage;

import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oc4 extends pc4 implements a94 {
    public final BaseActivity g0;
    public final /* synthetic */ qc4 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc4(qc4 qc4Var, BaseActivity baseActivity, v85 v85Var) {
        super(qc4Var, v85Var);
        this.h0 = qc4Var;
        this.g0 = baseActivity;
    }

    @Override // defpackage.pc4
    public final void b() {
        this.g0.X.f(this);
    }

    @Override // defpackage.pc4
    public final boolean c(BaseActivity baseActivity) {
        return this.g0 == baseActivity;
    }

    @Override // defpackage.pc4
    public final boolean d() {
        return this.g0.X.i.compareTo(o84.f0) >= 0;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        g94 g94Var = this.g0.X;
        o84 o84Var = g94Var.i;
        if (o84Var == o84.X) {
            this.h0.i(this.X);
            return;
        }
        o84 o84Var2 = null;
        while (o84Var2 != o84Var) {
            a(d());
            o84Var2 = o84Var;
            o84Var = g94Var.i;
        }
    }
}
