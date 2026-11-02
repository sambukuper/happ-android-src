package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ok3 implements dn2 {
    public final /* synthetic */ byte X;
    public final ov3 Y;

    public /* synthetic */ ok3(ov3 ov3Var, byte b) {
        this.X = b;
        this.Y = ov3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ov3 ov3Var = this.Y;
        switch (b) {
            case 0:
                ov3Var.getClass();
                return u15.j((ev3) ov3Var);
            case 1:
                return tx4.a(ov3Var.t());
            default:
                ov3Var.getClass();
                return u15.j((ev3) ov3Var);
        }
    }
}
