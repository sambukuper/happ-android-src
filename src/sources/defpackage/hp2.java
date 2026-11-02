package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ lp2 Y;

    public /* synthetic */ hp2(lp2 lp2Var, wy4 wy4Var) {
        this.X = (byte) 0;
        this.Y = lp2Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        lp2 lp2Var = this.Y;
        switch (b) {
            case 0:
                lp2Var.B(null, null);
                return dn8.a;
            case 1:
                return lp2Var.m();
            default:
                return lp2Var.m();
        }
    }

    public /* synthetic */ hp2(lp2 lp2Var, byte b) {
        this.X = b;
        this.Y = lp2Var;
    }
}
