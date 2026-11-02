package defpackage;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt4 implements ActionProvider.VisibilityListener {
    public q02 a;
    public final ActionProvider b;

    public tt4(wt4 wt4Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        q02 q02Var = this.a;
        if (q02Var != null) {
            nt4 nt4Var = ((st4) q02Var.Y).n;
            nt4Var.h = true;
            nt4Var.p(true);
        }
    }
}
