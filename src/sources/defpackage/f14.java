package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f14 implements dn2 {
    public final /* synthetic */ byte X;
    public final h14 Y;

    public /* synthetic */ f14(h14 h14Var, byte b) {
        this.X = b;
        this.Y = h14Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        h14 h14Var = this.Y;
        switch (b) {
            case 0:
                return new g14(h14Var);
            default:
                return z51.A(h14Var, h14Var.T());
        }
    }
}
