package defpackage;

import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pl8 implements f91 {
    public final y5 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pl8(y5 y5Var) {
        y5Var.getClass();
        this.X = y5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        y5 y5Var = this.X;
        ((HappToggleField) y5Var.g0).setFocusableInTouchMode(zY);
        ((HappSpinnerField) y5Var.Z).setFocusableInTouchMode(zY);
        ((HappToggleField) y5Var.h0).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        y5 y5Var = this.X;
        x97.U((HappToggleField) y5Var.g0, new ol8(this, (byte) 0));
        x97.U((HappSpinnerField) y5Var.Z, new ol8(this, (byte) 1));
        x97.U((HappToggleField) y5Var.h0, new ol8(this, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
