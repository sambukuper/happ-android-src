package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji7 implements dn2 {
    public final /* synthetic */ byte X;
    public final ki7 Y;

    public /* synthetic */ ji7(ki7 ki7Var, byte b) {
        this.X = b;
        this.Y = ki7Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ki7 ki7Var = this.Y;
        switch (b) {
            case 0:
                vl1 vl1Var = ki7Var.b;
                return i21.L(z91.v(vl1Var), z91.w(vl1Var));
            default:
                return ki7Var.c ? i21.M(z91.u(ki7Var.b)) : d02.X;
        }
    }
}
