package defpackage;

import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jr2 implements f91 {
    public final f63 X;
    public final /* synthetic */ lr2 Y;
    public final /* synthetic */ kr2 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jr2(lr2 lr2Var, kr2 kr2Var, f63 f63Var) {
        this.Y = lr2Var;
        this.Z = kr2Var;
        f63Var.getClass();
        this.X = f63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        ((RelativeLayout) this.X.f0).setFocusableInTouchMode(ue3.y(hi5.a0(this)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        RelativeLayout relativeLayout = (RelativeLayout) this.X.f0;
        relativeLayout.getClass();
        x97.U(relativeLayout, new i81(this, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
