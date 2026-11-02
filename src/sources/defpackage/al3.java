package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al3 implements dn2 {
    public final /* synthetic */ byte X;
    public final rk3 Y;

    public /* synthetic */ al3(rk3 rk3Var, byte b) {
        this.X = b;
        this.Y = rk3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        rk3 rk3Var = this.Y;
        switch (b) {
            case 0:
                return new rf1(rk3Var.f0);
            default:
                return w79.k(rk3Var, false);
        }
    }
}
