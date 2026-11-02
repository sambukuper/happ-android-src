package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final zj1 Y;

    public /* synthetic */ xj1(zj1 zj1Var, byte b) {
        this.X = b;
        this.Y = zj1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        zj1 zj1Var = this.Y;
        switch (b) {
            case 0:
                return new yj1(zj1Var);
            default:
                return z51.A(zj1Var, zj1Var.W());
        }
    }
}
