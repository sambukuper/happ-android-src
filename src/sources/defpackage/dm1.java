package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements dn2 {
    public final /* synthetic */ byte X;
    public final fm1 Y;
    public final gm1 Z;

    public /* synthetic */ dm1(fm1 fm1Var, gm1 gm1Var, byte b) {
        this.X = b;
        this.Y = fm1Var;
        this.Z = gm1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        gm1 gm1Var = this.Z;
        fm1 fm1Var = this.Y;
        switch (b) {
            case 0:
                return q57.Z(fm1Var.a.keySet(), gm1Var.o());
            default:
                return q57.Z(fm1Var.b.keySet(), gm1Var.p());
        }
    }
}
