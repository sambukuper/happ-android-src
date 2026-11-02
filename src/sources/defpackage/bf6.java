package defpackage;

import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bf6 implements f91 {
    public final h6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bf6(h6 h6Var) {
        h6Var.getClass();
        this.X = h6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        h6 h6Var = this.X;
        h6Var.n0.setFocusableInTouchMode(zY);
        h6Var.m0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        h6 h6Var = this.X;
        RelativeLayout relativeLayout = h6Var.n0;
        relativeLayout.getClass();
        x97.U(relativeLayout, new af6(this, (byte) 0));
        RelativeLayout relativeLayout2 = h6Var.m0;
        relativeLayout2.getClass();
        x97.U(relativeLayout2, new af6(this, (byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
