package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bw3 implements dn2 {
    public final /* synthetic */ byte X;
    public final ew3 Y;

    public /* synthetic */ bw3(ew3 ew3Var, byte b) {
        this.X = b;
        this.Y = ew3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ew3 ew3Var = this.Y;
        switch (b) {
            case 0:
                return new dw3(ew3Var);
            default:
                return z91.o(ew3Var.Y);
        }
    }
}
