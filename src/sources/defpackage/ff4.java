package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ff4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ lf4 Z;

    public /* synthetic */ ff4(gn2 gn2Var, lf4 lf4Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = lf4Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        lf4 lf4Var = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                lf4Var.getClass();
                gn2Var.B(new dg4(lf4Var));
                break;
            default:
                String str = lf4Var.b;
                str.getClass();
                gn2Var.B(new yf4(str));
                break;
        }
        return dn8Var;
    }
}
