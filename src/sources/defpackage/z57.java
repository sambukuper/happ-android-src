package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import su.happ.proxyutility.feature.settings.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class z57 implements f91 {
    public final t6 X;
    public final rl2 Y;
    public final /* synthetic */ SettingsActivity Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z57(SettingsActivity settingsActivity, t6 t6Var, rl2 rl2Var) {
        this.Z = settingsActivity;
        t6Var.getClass();
        rl2Var.getClass();
        this.X = t6Var;
        this.Y = rl2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        return pu.r(view, (NestedScrollView) this.X.k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        rl2 rl2Var = this.Y;
        rl2Var.k0.setFocusableInTouchMode(zY);
        rl2Var.j0.setFocusableInTouchMode(zY);
        rl2Var.i0.setFocusableInTouchMode(zY);
        rl2Var.g0.setFocusableInTouchMode(zY);
        rl2Var.h0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        rl2 rl2Var = this.Y;
        x97.U(rl2Var.k0, new ud5(this, (byte) 0));
        x97.U(rl2Var.j0, new ud5(this, (byte) 1));
        x97.U(rl2Var.i0, new ud5(this, (byte) 2));
        x97.U(rl2Var.g0, new ud5(this, (byte) 3));
        x97.U(rl2Var.h0, new ud5(this, (byte) 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.Y;
    }
}
