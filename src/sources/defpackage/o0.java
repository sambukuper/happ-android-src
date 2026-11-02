package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ x0 Y;

    public /* synthetic */ o0(x0 x0Var, byte b) {
        this.X = b;
        this.Y = x0Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        nh1 nh1Var;
        byte b = this.X;
        x0 x0Var = this.Y;
        switch (b) {
            case 0:
                tb3 tb3Var = (tb3) hi5.W(x0Var, qb3.a);
                if (tb3Var == null) {
                    zc3.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + tb3Var);
                }
                tb3 tb3Var2 = x0Var.A0;
                x0Var.A0 = tb3Var;
                if (tb3Var2 != null && !dh3.f(tb3Var, tb3Var2) && ((nh1Var = x0Var.D0) != null || !x0Var.K0)) {
                    if (nh1Var != null) {
                        x0Var.Z0(nh1Var);
                    }
                    x0Var.D0 = null;
                    x0Var.j1();
                }
                return dn8.a;
            default:
                x0Var.n1();
                return Boolean.TRUE;
        }
    }
}
