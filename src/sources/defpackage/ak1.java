package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak1 implements dn2 {
    public final /* synthetic */ byte X;
    public final ck1 Y;

    public /* synthetic */ ak1(ck1 ck1Var, byte b) {
        this.X = b;
        this.Y = ck1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ck1 ck1Var = this.Y;
        switch (b) {
            case 0:
                return new bk1(ck1Var);
            default:
                return ck1Var.W();
        }
    }
}
