package defpackage;

import android.view.View;
import android.widget.ScrollView;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qz8 implements f91 {
    public final w6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qz8(w6 w6Var) {
        w6Var.getClass();
        this.X = w6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        ScrollView scrollView = this.X.v0;
        scrollView.getClass();
        return pu.s(scrollView, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        w6 w6Var = this.X;
        w6Var.z0.setFocusableInTouchMode(zY);
        w6Var.q0.setFocusableInTouchMode(zY);
        w6Var.y0.setFocusableInTouchMode(zY);
        w6Var.B0.setFocusableInTouchMode(zY);
        w6Var.x0.setFocusableInTouchMode(zY);
        w6Var.s0.setFocusableInTouchMode(zY);
        w6Var.r0.setFocusableInTouchMode(zY);
        w6Var.p0.setFocusableInTouchMode(zY);
        w6Var.t0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        w6 w6Var = this.X;
        HappToggleField happToggleField = w6Var.z0;
        happToggleField.getClass();
        x97.U(happToggleField, new pz8(this, (byte) 0));
        HappInputField happInputField = w6Var.q0;
        happInputField.getClass();
        x97.U(happInputField, new pz8(this, (byte) 1));
        HappToggleField happToggleField2 = w6Var.y0;
        happToggleField2.getClass();
        x97.U(happToggleField2, new pz8(this, (byte) 2));
        HappToggleField happToggleField3 = w6Var.B0;
        happToggleField3.getClass();
        x97.U(happToggleField3, new pz8(this, (byte) 3));
        HappToggleField happToggleField4 = w6Var.A0;
        happToggleField4.getClass();
        x97.U(happToggleField4, new pz8(this, (byte) 4));
        HappInputField happInputField2 = w6Var.s0;
        happInputField2.getClass();
        x97.U(happInputField2, new pz8(this, (byte) 5));
        HappInputField happInputField3 = w6Var.r0;
        happInputField3.getClass();
        x97.U(happInputField3, new pz8(this, (byte) 6));
        HappForwardField happForwardField = w6Var.p0;
        happForwardField.getClass();
        x97.U(happForwardField, new pz8(this, (byte) 7));
        HappForwardField happForwardField2 = w6Var.o0;
        happForwardField2.getClass();
        x97.U(happForwardField2, new pz8(this, (byte) 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
