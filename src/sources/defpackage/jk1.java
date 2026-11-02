package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements dn2 {
    public final /* synthetic */ byte X;
    public final kk1 Y;

    public /* synthetic */ jk1(kk1 kk1Var, byte b) {
        this.X = b;
        this.Y = kk1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        kk1 kk1Var = this.Y;
        switch (b) {
            case 0:
                return kk1Var.U(kk1Var.Y);
            case 1:
                return ms8.d(kk1Var.Y);
            default:
                return kk1Var;
        }
    }
}
