package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ef0 Y;

    public /* synthetic */ ze0(ef0 ef0Var, byte b) {
        this.X = b;
        this.Y = ef0Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean z;
        byte b = this.X;
        ef0 ef0Var = this.Y;
        switch (b) {
            case 0:
                synchronized (ef0Var.q) {
                    ef0Var.s = sh0.j0;
                    ef0Var.toString();
                }
                re0 re0Var = ef0Var.o;
                ef0Var.toString();
                synchronized (re0Var.f) {
                    re0Var.g.remove(ef0Var);
                }
                ux0 ux0Var = ef0Var.x;
                dn8 dn8Var = dn8.a;
                ux0Var.V(dn8Var);
                gv3.i(ef0Var.a, null);
                return dn8Var;
            default:
                ((dn8) obj).getClass();
                synchronized (ef0Var.q) {
                    z = ef0Var.r;
                }
                return Boolean.valueOf(z);
        }
    }
}
