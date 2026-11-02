package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ly6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ my6 Y;

    public /* synthetic */ ly6(my6 my6Var, byte b) {
        this.X = b;
        this.Y = my6Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        my6 my6Var = this.Y;
        switch (b) {
            case 0:
                return Boolean.valueOf(my6Var.p0);
            default:
                ai2 ai2Var = my6Var.V0;
                if (!ai2Var.X.p0) {
                    return null;
                }
                yh2 yh2VarD1 = ai2Var.d1();
                if (!yh2VarD1.a()) {
                    return null;
                }
                if (yh2VarD1.b()) {
                    return ai2Var.b1(null);
                }
                ai2 ai2VarF = ((gh2) yn0.a0(ai2Var).getFocusOwner()).f();
                if (ai2VarF != null) {
                    return ai2VarF.b1(yn0.Y(ai2Var));
                }
                return null;
        }
    }
}
