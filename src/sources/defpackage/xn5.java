package defpackage;

import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xn5 implements f91 {
    public final d6 X;
    public final /* synthetic */ PingSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xn5(PingSettingsActivity pingSettingsActivity, d6 d6Var) {
        this.Y = pingSettingsActivity;
        d6Var.getClass();
        this.X = d6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        d6 d6Var = this.X;
        ((HappSpinnerField) d6Var.Z).setFocusableInTouchMode(true);
        ((HappSliderField) d6Var.j0).setFocusableInTouchMode(true);
        ((HappEditText) d6Var.g0).setFocusableInTouchMode(true);
        ((HappSpinnerField) d6Var.k0).setFocusableInTouchMode(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        d6 d6Var = this.X;
        x97.U((HappSpinnerField) d6Var.Z, new yn5(this, (byte) 0));
        x97.U((HappSliderField) d6Var.j0, new yn5(this, (byte) 1));
        x97.U((HappEditText) d6Var.g0, new yn5(this, (byte) 2));
        x97.U((HappSpinnerField) d6Var.k0, new yn5(this, (byte) 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
