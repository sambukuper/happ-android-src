package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bm1 implements dn2 {
    public final /* synthetic */ byte X;
    public final dn2 Y;

    public /* synthetic */ bm1(dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = dn2Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn2 dn2Var = this.Y;
        switch (b) {
            case 0:
                return wv0.c1((Iterable) dn2Var.invoke());
            default:
                et4 et4Var = (et4) dn2Var.invoke();
                return et4Var instanceof p74 ? ((p74) et4Var).h() : et4Var;
        }
    }
}
