package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class uj5 implements f91 {
    public final c6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uj5(c6 c6Var) {
        c6Var.getClass();
        this.X = c6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        l lVarI = ((View) this.X.k0).I(0);
        hk5 hk5Var = lVarI instanceof hk5 ? (hk5) lVarI : null;
        if (hk5Var == null) {
            return false;
        }
        return ((ConstraintLayout) hk5Var.r().X.f0).requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        c6 c6Var = this.X;
        ((LinearLayout) c6Var.m0).setFocusableInTouchMode(zY);
        ((LinearLayout) c6Var.n0).setFocusableInTouchMode(zY);
        ((LinearLayout) c6Var.l0).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        c6 c6Var = this.X;
        x97.U((LinearLayout) c6Var.m0, new ek5(this, (byte) 0));
        x97.U((LinearLayout) c6Var.n0, new ek5(this, (byte) 1));
        x97.U((LinearLayout) c6Var.l0, new ek5(this, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
