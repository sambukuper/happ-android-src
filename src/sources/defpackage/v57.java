package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import su.happ.proxyutility.feature.settings.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class v57 implements f91 {
    public final t6 X;
    public final rk2 Y;
    public final /* synthetic */ SettingsActivity Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v57(SettingsActivity settingsActivity, t6 t6Var, rk2 rk2Var) {
        this.Z = settingsActivity;
        t6Var.getClass();
        rk2Var.getClass();
        this.X = t6Var;
        this.Y = rk2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        return pu.r(view, (NestedScrollView) this.X.k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        rk2 rk2Var = this.Y;
        rk2Var.Z.setFocusableInTouchMode(zY);
        rk2Var.f0.setFocusableInTouchMode(zY);
        rk2Var.Y.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        rk2 rk2Var = this.Y;
        x97.U(rk2Var.Z, new t(this, (byte) 0));
        x97.U(rk2Var.f0, new t(this, (byte) 1));
        x97.U(rk2Var.Y, new t(this, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.Y;
    }
}
