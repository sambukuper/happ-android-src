package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xs4 implements dn2 {
    public final /* synthetic */ byte X;
    public final ys4 Y;
    public final wb4 Z;
    public final d2 f0;
    public final int g0;
    public final int h0;
    public final vz5 i0;

    public /* synthetic */ xs4(ys4 ys4Var, wb4 wb4Var, d2 d2Var, int i, int i2, vz5 vz5Var, byte b) {
        this.X = b;
        this.Y = ys4Var;
        this.Z = wb4Var;
        this.f0 = d2Var;
        this.g0 = i;
        this.h0 = i2;
        this.i0 = vz5Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ys4 ys4Var = this.Y;
        switch (b) {
            case 0:
                return wv0.Y0(((hl1) ys4Var.a.X).e.k(this.Z, this.f0, this.g0, this.h0, this.i0));
            default:
                return wv0.Y0(((hl1) ys4Var.a.X).e.g(this.Z, this.f0, this.g0, this.h0, this.i0));
        }
    }
}
