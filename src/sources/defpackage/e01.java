package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e01 implements gn2 {
    public final /* synthetic */ byte X;
    public final fk2 Y;

    public /* synthetic */ e01(fk2 fk2Var, byte b) {
        this.X = b;
        this.Y = fk2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        fk2 fk2Var = this.Y;
        switch (b) {
            case 0:
                sm smVar = (sm) obj;
                smVar.getClass();
                return smVar.p(fk2Var);
            default:
                fk2 fk2Var2 = (fk2) obj;
                fk2Var2.getClass();
                return Boolean.valueOf(!fk2Var2.a.c() && fk2Var2.b().equals(fk2Var));
        }
    }
}
