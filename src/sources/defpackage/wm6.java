package defpackage;

import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class wm6 implements f91 {
    public final d6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wm6(d6 d6Var) {
        d6Var.getClass();
        this.X = d6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        d6 d6Var = this.X;
        ((HappToggleField) d6Var.k0).setFocusableInTouchMode(zY);
        ((HappForwardField) d6Var.i0).setFocusableInTouchMode(zY);
        ((HappForwardField) d6Var.h0).setFocusableInTouchMode(zY);
        ((HappForwardField) d6Var.g0).setFocusableInTouchMode(zY);
        ((HappSpinnerField) d6Var.Z).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        d6 d6Var = this.X;
        x97.U((HappToggleField) d6Var.k0, new vm6(this, (byte) 0));
        x97.U((HappForwardField) d6Var.i0, new vm6(this, (byte) 1));
        x97.U((HappForwardField) d6Var.h0, new vm6(this, (byte) 2));
        x97.U((HappForwardField) d6Var.g0, new vm6(this, (byte) 3));
        x97.U((HappSpinnerField) d6Var.Z, new vm6(this, (byte) 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
