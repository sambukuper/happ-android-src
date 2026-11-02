package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class om implements gn2 {
    public final /* synthetic */ byte X;
    public final zz3 Y;

    public /* synthetic */ om(zz3 zz3Var, byte b) {
        this.X = b;
        this.Y = zz3Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        zz3 zz3Var = this.Y;
        switch (b) {
            case 0:
                vx4 vx4Var = (vx4) obj;
                vx4Var.getClass();
                return vx4Var.f().h(zz3Var.v());
            default:
                v15 v15Var = (v15) obj;
                wx4 wx4VarL = zz3Var.l();
                fk2 fk2Var = ug7.k;
                p74 p74Var = wx4VarL.b0(fk2Var).k0;
                if (p74Var == null) {
                    zz3.a(11);
                    throw null;
                }
                ot0 ot0VarE = p74Var.e(v15Var, x45.X);
                if (ot0VarE == null) {
                    xw3.l("Built-in class ", fk2Var.a(v15Var), " is not found");
                    return null;
                }
                if (ot0VarE instanceof sx4) {
                    return (sx4) ot0VarE;
                }
                throw new AssertionError("Must be a class descriptor " + v15Var + ", but was " + ot0VarE);
        }
    }
}
