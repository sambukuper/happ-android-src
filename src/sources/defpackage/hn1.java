package defpackage;

import su.happ.proxyutility.feature.main.ui.ActionView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hn1 implements f91 {
    public final jl1 X;
    public final /* synthetic */ in1 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hn1(in1 in1Var, jl1 jl1Var) {
        this.Y = in1Var;
        jl1Var.getClass();
        this.X = jl1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.Y.Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        jl1 jl1Var = this.X;
        ((ActionView) jl1Var.i0).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.h0).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.j0).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.g0).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.Z).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.f0).setFocusableInTouchMode(zY);
        ((ActionView) jl1Var.Y).setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        jl1 jl1Var = this.X;
        x97.U((ActionView) jl1Var.i0, new n11(this, (byte) 0));
        x97.U((ActionView) jl1Var.h0, new n11(this, (byte) 1));
        x97.U((ActionView) jl1Var.j0, new n11(this, (byte) 2));
        x97.U((ActionView) jl1Var.g0, new n11(this, (byte) 3));
        x97.U((ActionView) jl1Var.Z, new n11(this, (byte) 4));
        x97.U((ActionView) jl1Var.f0, new n11(this, (byte) 5));
        x97.U((ActionView) jl1Var.Y, new n11(this, (byte) 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
