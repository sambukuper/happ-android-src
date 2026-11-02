package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mk2 extends vj8 {
    public final /* synthetic */ qk2 B0;

    public mk2(qk2 qk2Var) {
        this.B0 = qk2Var;
    }

    @Override // defpackage.vj8
    public final View W(int i) {
        qk2 qk2Var = this.B0;
        View view = qk2Var.J0;
        if (view != null) {
            return view.findViewById(i);
        }
        bt.i(ie2.i("Fragment ", qk2Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.vj8
    public final boolean X() {
        return this.B0.J0 != null;
    }
}
