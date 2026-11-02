package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ym6 implements f91 {
    public final fu6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ym6(fu6 fu6Var) {
        fu6Var.getClass();
        this.X = fu6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        fu6 fu6Var = this.X;
        ((AppCompatEditText) fu6Var.Z).setFocusableInTouchMode(true);
        ((HappForwardField) fu6Var.g0).setFocusableInTouchMode(zY);
        ((HappForwardField) fu6Var.f0).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        fu6 fu6Var = this.X;
        x97.U((AppCompatEditText) fu6Var.Z, new xm6(this, (byte) 0));
        x97.U((HappForwardField) fu6Var.g0, new xm6(this, (byte) 1));
        x97.U((HappForwardField) fu6Var.f0, new xm6(this, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
