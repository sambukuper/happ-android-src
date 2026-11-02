package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux7 implements vu {
    public final /* synthetic */ xx7 X;
    public final /* synthetic */ wx7 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ jz f0;
    public final /* synthetic */ jz g0;

    public /* synthetic */ ux7(xx7 xx7Var, wx7 wx7Var, int i, jz jzVar, jz jzVar2) {
        this.X = xx7Var;
        this.Y = wx7Var;
        this.Z = i;
        this.f0 = jzVar;
        this.g0 = jzVar2;
    }

    @Override // defpackage.vu, defpackage.zn2
    public final xb4 apply(Object obj) {
        wx7 wx7Var = this.Y;
        Surface surface = (Surface) obj;
        xx7 xx7Var = this.X;
        xx7Var.getClass();
        surface.getClass();
        try {
            wx7Var.d();
            by7 by7Var = new by7(surface, this.Z, xx7Var.g.a, this.f0, this.g0);
            by7Var.m0.Y.a(new tx7(wx7Var, (byte) 1), dp1.a());
            mb6.s("Consumer can only be linked once.", wx7Var.q == null);
            wx7Var.q = by7Var;
            return vr3.H(by7Var);
        } catch (ug1 e) {
            return new u73(e, (byte) 1);
        }
    }
}
