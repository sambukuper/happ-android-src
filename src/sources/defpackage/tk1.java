package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 implements dn2 {
    public final /* synthetic */ byte X;
    public final wk1 Y;
    public final zz3 Z;

    public /* synthetic */ tk1(wk1 wk1Var, zz3 zz3Var, byte b) {
        this.X = b;
        this.Y = wk1Var;
        this.Z = zz3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        zz3 zz3Var = this.Z;
        wk1 wk1Var = this.Y;
        switch (b) {
            case 0:
                return fm7.N0(wk1Var.a.o().b(zz3Var.j(tg7.C), wk1Var), "Collection");
            default:
                return fm7.N0(wk1Var.a.o().b(zz3Var.k("Array"), wk1Var), "Array");
        }
    }
}
