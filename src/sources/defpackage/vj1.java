package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final wj1 Y;

    public /* synthetic */ vj1(wj1 wj1Var, byte b) {
        this.X = b;
        this.Y = wj1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        wj1 wj1Var = this.Y;
        switch (b) {
            case 0:
                tx5 tx5VarD = wj1Var.X().V().d();
                return tx5VarD == null ? z91.t(wj1Var.X().V(), oy1.f0) : tx5VarD;
            default:
                return g33.l(wj1Var, false);
        }
    }
}
