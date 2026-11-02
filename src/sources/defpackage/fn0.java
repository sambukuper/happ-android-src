package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ qj0 Y;

    public /* synthetic */ fn0(qj0 qj0Var, byte b) {
        this.X = b;
        this.Y = qj0Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        boolean zY;
        byte b = this.X;
        qj0 qj0Var = this.Y;
        switch (b) {
            case 0:
                zY = u70.Y(qj0Var);
                break;
            default:
                ij0 ij0Var = jj0.h;
                jj0 jj0Var = qj0Var.b;
                ij0Var.getClass();
                zY = ij0.c(jj0Var);
                break;
        }
        return Boolean.valueOf(zY);
    }
}
