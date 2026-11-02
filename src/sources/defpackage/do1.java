package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ g44 Y;

    public /* synthetic */ do1(g44 g44Var, byte b) {
        this.X = b;
        this.Y = g44Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        iz2 iz2Var;
        byte b = this.X;
        g44 g44Var = this.Y;
        switch (b) {
            case 0:
                return ((fx8) g44Var.getValue()).e();
            case 1:
                fx8 fx8Var = (fx8) g44Var.getValue();
                iz2Var = fx8Var instanceof iz2 ? (iz2) fx8Var : null;
                return iz2Var != null ? iz2Var.d() : n71.b;
            case 2:
                return ((fx8) g44Var.getValue()).e();
            case 3:
                fx8 fx8Var2 = (fx8) g44Var.getValue();
                iz2Var = fx8Var2 instanceof iz2 ? (iz2) fx8Var2 : null;
                return iz2Var != null ? iz2Var.d() : n71.b;
            case 4:
                return ((fx8) g44Var.getValue()).e();
            default:
                fx8 fx8Var3 = (fx8) g44Var.getValue();
                iz2Var = fx8Var3 instanceof iz2 ? (iz2) fx8Var3 : null;
                return iz2Var != null ? iz2Var.d() : n71.b;
        }
    }
}
