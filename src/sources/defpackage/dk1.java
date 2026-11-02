package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dk1 implements dn2 {
    public final /* synthetic */ byte X;
    public final fk1 Y;

    public /* synthetic */ dk1(fk1 fk1Var, byte b) {
        this.X = b;
        this.Y = fk1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        fk1 fk1Var = this.Y;
        switch (b) {
            case 0:
                return new ek1(fk1Var);
            default:
                return fk1Var.W();
        }
    }
}
