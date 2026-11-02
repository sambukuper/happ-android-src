package defpackage;

import android.view.View;
import android.widget.ScrollView;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class s implements f91 {
    public final t5 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(t5 t5Var) {
        t5Var.getClass();
        this.X = t5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(View view) {
        view.getClass();
        return pu.s((ScrollView) this.X.n0, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        t5 t5Var = this.X;
        ((HappInfoField) t5Var.m0).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.h0).setFocusableInTouchMode(zY);
        ((HappForwardField) t5Var.f0).setFocusableInTouchMode(zY);
        ((HappForwardField) t5Var.Z).setFocusableInTouchMode(zY);
        ((HappForwardField) t5Var.Y).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.i0).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.l0).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.g0).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.k0).setFocusableInTouchMode(zY);
        ((HappInfoField) t5Var.j0).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        t5 t5Var = this.X;
        x97.U((HappInfoField) t5Var.m0, new r(this, (byte) 1));
        x97.U((HappInfoField) t5Var.h0, new r(this, (byte) 2));
        x97.U((HappForwardField) t5Var.f0, new r(this, (byte) 3));
        x97.U((HappForwardField) t5Var.Z, new r(this, (byte) 4));
        x97.U((HappForwardField) t5Var.Y, new r(this, (byte) 5));
        x97.U((HappInfoField) t5Var.i0, new r(this, (byte) 6));
        x97.U((HappInfoField) t5Var.l0, new r(this, (byte) 7));
        x97.U((HappInfoField) t5Var.g0, new r(this, (byte) 8));
        x97.U((HappInfoField) t5Var.k0, new r(this, (byte) 9));
        x97.U((HappInfoField) t5Var.j0, new r(this, (byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
