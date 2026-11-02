package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final ej1 Y;

    public /* synthetic */ cj1(ej1 ej1Var, byte b) {
        this.X = b;
        this.Y = ej1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ej1 ej1Var = this.Y;
        switch (b) {
            case 0:
                return ms8.d(ej1Var.V());
            case 1:
                return ej1Var.T(true);
            case 2:
                return mb6.K(ej1Var) ? ej1Var.T(false) : ej1Var.l();
            default:
                return mb6.c0(ej1Var, ej1Var.U());
        }
    }
}
