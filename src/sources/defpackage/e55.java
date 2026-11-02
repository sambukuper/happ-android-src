package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e55 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ i55 Y;

    public /* synthetic */ e55(i55 i55Var, byte b) {
        this.X = b;
        this.Y = i55Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        i55 i55Var = this.Y;
        switch (b) {
            case 0:
                sm0 sm0Var = i55Var.R0;
                sm0Var.getClass();
                i55Var.P0(sm0Var, i55Var.Q0);
                break;
            default:
                i55 i55Var2 = i55Var.y0;
                if (i55Var2 != null) {
                    i55Var2.d1();
                }
                break;
        }
        return dn8Var;
    }
}
