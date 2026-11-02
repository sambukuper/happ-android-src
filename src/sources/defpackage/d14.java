package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d14 implements dn2 {
    public final /* synthetic */ byte X;
    public final e14 Y;

    public /* synthetic */ d14(e14 e14Var, byte b) {
        this.X = b;
        this.Y = e14Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.X) {
            case 0:
                e14 e14Var = this.Y;
                qz3 qz3Var = e14Var.U().g0.i;
                if (qz3Var == null) {
                    return new rf1(e14Var.U());
                }
                return new z04(e14Var, qz3Var, e14Var.U().l().size(), fw3.f0, (li8) e14Var.U().l0.getValue());
            default:
                return ch3.p(this.Y, false);
        }
    }
}
