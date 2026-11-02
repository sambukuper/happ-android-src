package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final uj1 Y;

    public /* synthetic */ tj1(uj1 uj1Var, byte b) {
        this.X = b;
        this.Y = uj1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        uj1 uj1Var = this.Y;
        switch (b) {
            case 0:
                hx5 hx5VarB = uj1Var.X().V().b();
                if (hx5VarB != null) {
                    return hx5VarB;
                }
                hx5 hx5VarS = z91.s(uj1Var.X().V(), oy1.f0);
                hx5VarS.J0(uj1Var.X().V().c());
                return hx5VarS;
            default:
                return g33.l(uj1Var, true);
        }
    }
}
