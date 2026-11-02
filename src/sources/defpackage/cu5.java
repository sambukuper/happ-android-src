package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu5 implements dn2 {
    public final /* synthetic */ byte X;
    public final du5 Y;

    public /* synthetic */ cu5(du5 du5Var, byte b) {
        this.X = b;
        this.Y = du5Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        du5 du5Var = this.Y;
        switch (b) {
            case 0:
                return ug7.k.a(du5Var.X);
            default:
                return ug7.k.a(du5Var.Y);
        }
    }
}
