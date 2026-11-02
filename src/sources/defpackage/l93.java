package defpackage;

import android.view.View;
import android.widget.ScrollView;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class l93 implements f91 {
    public final z5 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l93(z5 z5Var) {
        z5Var.getClass();
        this.X = z5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        ScrollView scrollView = this.X.u0;
        scrollView.getClass();
        return pu.s(scrollView, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        z5 z5Var = this.X;
        z5Var.r0.setFocusableInTouchMode(zY);
        z5Var.y0.setFocusableInTouchMode(zY);
        z5Var.s0.setFocusableInTouchMode(zY);
        z5Var.q0.setFocusableInTouchMode(zY);
        z5Var.z0.setFocusableInTouchMode(zY);
        z5Var.o0.setFocusableInTouchMode(zY);
        z5Var.x0.setFocusableInTouchMode(zY);
        z5Var.p0.setFocusableInTouchMode(zY);
        z5Var.n0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        z5 z5Var = this.X;
        HappInputField happInputField = z5Var.r0;
        happInputField.getClass();
        x97.U(happInputField, new k93(this, (byte) 0));
        HappSpinnerField happSpinnerField = z5Var.y0;
        happSpinnerField.getClass();
        x97.U(happSpinnerField, new k93(this, (byte) 1));
        HappInputField happInputField2 = z5Var.s0;
        happInputField2.getClass();
        x97.U(happInputField2, new k93(this, (byte) 2));
        HappInputField happInputField3 = z5Var.q0;
        happInputField3.getClass();
        x97.U(happInputField3, new k93(this, (byte) 3));
        HappToggleField happToggleField = z5Var.z0;
        happToggleField.getClass();
        x97.U(happToggleField, new k93(this, (byte) 4));
        HappInputField happInputField4 = z5Var.o0;
        happInputField4.getClass();
        x97.U(happInputField4, new k93(this, (byte) 5));
        HappSpinnerField happSpinnerField2 = z5Var.x0;
        happSpinnerField2.getClass();
        x97.U(happSpinnerField2, new k93(this, (byte) 6));
        HappInputField happInputField5 = z5Var.p0;
        happInputField5.getClass();
        x97.U(happInputField5, new k93(this, (byte) 7));
        HappInputField happInputField6 = z5Var.n0;
        happInputField6.getClass();
        x97.U(happInputField6, new k93(this, (byte) 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
