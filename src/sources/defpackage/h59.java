package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h59 implements l01, a94 {
    public final AndroidComposeView X;
    public final r01 Y;
    public boolean Z;
    public g94 f0;
    public zy0 g0 = nr4.d;

    public h59(AndroidComposeView androidComposeView, r01 r01Var) {
        this.X = androidComposeView;
        this.Y = r01Var;
    }

    public final void a() {
        if (!this.Z) {
            this.Z = true;
            AndroidComposeView androidComposeView = this.X;
            androidComposeView.getView().setTag(g46.wrapped_composition_tag, null);
            g94 g94Var = this.f0;
            if (g94Var != null) {
                g94Var.f(this);
            }
            this.f0 = null;
            hq1 hq1Var = androidComposeView.l0;
            if (hq1Var != null) {
                hq1Var.Y.invoke();
            }
            androidComposeView.l0 = null;
        }
        this.Y.m();
    }

    public final void b(rn2 rn2Var) {
        this.X.setOnReadyForComposition(new f59(this, (zy0) rn2Var, (byte) 0));
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        if (n84Var == n84.ON_DESTROY) {
            a();
        } else {
            if (n84Var != n84.ON_CREATE || this.Z) {
                return;
            }
            b(this.g0);
        }
    }
}
