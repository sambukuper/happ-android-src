package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us4 implements dn2 {
    public final /* synthetic */ byte X;
    public final ys4 Y;
    public final cz5 Z;
    public final im1 f0;

    public /* synthetic */ us4(ys4 ys4Var, cz5 cz5Var, im1 im1Var, byte b) {
        this.X = b;
        this.Y = ys4Var;
        this.Z = cz5Var;
        this.f0 = im1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        im1 im1Var = this.f0;
        cz5 cz5Var = this.Z;
        ys4 ys4Var = this.Y;
        switch (b) {
            case 0:
                ve4 ve4Var = ((hl1) ys4Var.a.X).a;
                us4 us4Var = new us4(ys4Var, cz5Var, im1Var, (byte) 2);
                ve4Var.getClass();
                return new se4(ve4Var, us4Var);
            case 1:
                ve4 ve4Var2 = ((hl1) ys4Var.a.X).a;
                us4 us4Var2 = new us4(ys4Var, cz5Var, im1Var, (byte) 3);
                ve4Var2.getClass();
                return new se4(ve4Var2, us4Var2);
            case 2:
                jl1 jl1Var = ys4Var.a;
                wb4 wb4VarA = ys4Var.a((ed1) jl1Var.Z);
                wb4VarA.getClass();
                vl vlVar = ((hl1) jl1Var.X).e;
                t14 t14VarJ = im1Var.j();
                t14VarJ.getClass();
                return (s21) vlVar.d(wb4VarA, cz5Var, t14VarJ);
            default:
                jl1 jl1Var2 = ys4Var.a;
                wb4 wb4VarA2 = ys4Var.a((ed1) jl1Var2.Z);
                wb4VarA2.getClass();
                vl vlVar2 = ((hl1) jl1Var2.X).e;
                t14 t14VarJ2 = im1Var.j();
                t14VarJ2.getClass();
                return (s21) vlVar2.c(wb4VarA2, cz5Var, t14VarJ2);
        }
    }
}
