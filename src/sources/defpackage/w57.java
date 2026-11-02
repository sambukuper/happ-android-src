package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import su.happ.proxyutility.feature.settings.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w57 implements f91 {
    public final t6 X;
    public final uk2 Y;
    public final /* synthetic */ SettingsActivity Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w57(SettingsActivity settingsActivity, t6 t6Var, uk2 uk2Var) {
        this.Z = settingsActivity;
        t6Var.getClass();
        uk2Var.getClass();
        this.X = t6Var;
        this.Y = uk2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        return pu.r(view, (NestedScrollView) this.X.k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        uk2 uk2Var = this.Y;
        uk2Var.g0.setFocusableInTouchMode(zY);
        uk2Var.f0.setFocusableInTouchMode(zY);
        uk2Var.Z.setFocusableInTouchMode(zY);
        uk2Var.m0.setFocusableInTouchMode(zY);
        uk2Var.h0.setFocusableInTouchMode(zY);
        uk2Var.j0.setFocusableInTouchMode(zY);
        uk2Var.i0.setFocusableInTouchMode(zY);
        uk2Var.n0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        uk2 uk2Var = this.Y;
        x97.U(uk2Var.g0, new l7(this, (byte) 0));
        x97.U(uk2Var.f0, new l7(this, (byte) 1));
        x97.U(uk2Var.Z, new l7(this, (byte) 2));
        x97.U(uk2Var.m0, new l7(this, (byte) 3));
        x97.U(uk2Var.h0, new l7(this, (byte) 4));
        x97.U(uk2Var.j0, new l7(this, (byte) 5));
        x97.U(uk2Var.i0, new l7(this, (byte) 6));
        x97.U(uk2Var.n0, new l7(this, (byte) 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.Y;
    }
}
