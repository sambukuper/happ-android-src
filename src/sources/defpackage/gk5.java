package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class gk5 implements f91 {
    public final fu6 X;
    public final /* synthetic */ ik5 Y;
    public final /* synthetic */ hk5 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gk5(ik5 ik5Var, hk5 hk5Var, fu6 fu6Var) {
        this.Y = ik5Var;
        this.Z = hk5Var;
        fu6Var.getClass();
        this.X = fu6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        ((ConstraintLayout) this.X.f0).setFocusableInTouchMode(ue3.y(hi5.a0(this)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.X.f0;
        constraintLayout.getClass();
        x97.U(constraintLayout, new i81(this, (byte) 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
