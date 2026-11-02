package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class de5 implements o48 {
    public final /* synthetic */ y68 X;
    public final /* synthetic */ w58 Y;
    public final /* synthetic */ q58 Z;
    public final /* synthetic */ sn2 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ boolean h0;
    public final /* synthetic */ xz4 i0;
    public final /* synthetic */ gg5 j0;
    public final /* synthetic */ i48 k0;
    public final /* synthetic */ zy0 l0;

    public de5(y68 y68Var, w58 w58Var, q58 q58Var, sn2 sn2Var, boolean z, boolean z2, xz4 xz4Var, gg5 gg5Var, i48 i48Var, zy0 zy0Var) {
        this.X = y68Var;
        this.Y = w58Var;
        this.Z = q58Var;
        this.f0 = sn2Var;
        this.g0 = z;
        this.h0 = z2;
        this.i0 = xz4Var;
        this.j0 = gg5Var;
        this.k0 = i48Var;
        this.l0 = zy0Var;
    }

    @Override // defpackage.o48
    public final void j(zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(794272399);
        int i2 = i | (lp2Var.f(this) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            pn7.a(d78.Y, this.X.c().Z, zy0Var, this.Z, this.f0, null, null, null, dh3.f(this.Y, qe4.x0), this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, lp2Var, 390);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 24, i, this, zy0Var);
        }
    }
}
