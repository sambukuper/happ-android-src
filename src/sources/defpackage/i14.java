package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i14 implements dn2 {
    public final /* synthetic */ byte X;
    public final k14 Y;

    public /* synthetic */ i14(k14 k14Var, byte b) {
        this.X = b;
        this.Y = k14Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        k14 k14Var = this.Y;
        switch (b) {
            case 0:
                return new j14(k14Var);
            default:
                return k14Var.T();
        }
    }
}
