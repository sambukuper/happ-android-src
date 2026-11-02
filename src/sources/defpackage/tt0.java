package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h12 b;

    public /* synthetic */ tt0(h12 h12Var, byte b) {
        this.a = b;
        this.b = h12Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        h12 h12Var = this.b;
        switch (b) {
            case 0:
                wt0 wt0Var = (wt0) h12Var;
                wt0Var.s(wt0Var.t());
                break;
            default:
                yw1 yw1Var = (yw1) h12Var;
                yw1Var.l = z;
                yw1Var.p();
                if (!z) {
                    yw1Var.s(false);
                    yw1Var.m = false;
                }
                break;
        }
    }
}
