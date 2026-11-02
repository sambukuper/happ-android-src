package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements gn2 {
    public final /* synthetic */ byte X;
    public final wk1 Y;

    public /* synthetic */ uk1(wk1 wk1Var, byte b) {
        this.X = b;
        this.Y = wk1Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        wk1 wk1Var = this.Y;
        switch (b) {
            case 0:
                ni8 ni8Var = (ni8) obj;
                ni8Var.getClass();
                if (ni8Var.c()) {
                    return "*";
                }
                t14 t14VarB = ni8Var.b();
                t14VarB.getClass();
                String strP = wk1Var.P(t14VarB);
                if (ni8Var.a() == rt8.INVARIANT) {
                    return strP;
                }
                return ni8Var.a() + ' ' + strP;
            default:
                t14 t14Var = (t14) obj;
                t14Var.getClass();
                return wk1Var.P(t14Var);
        }
    }
}
