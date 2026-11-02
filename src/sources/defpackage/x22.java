package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 extends s21 {
    public final qs0 b;
    public final v15 c;

    public x22(qs0 qs0Var, v15 v15Var) {
        super(new qg5(qs0Var, v15Var));
        this.b = qs0Var;
        this.c = v15Var;
    }

    @Override // defpackage.s21
    public final t14 a(vx4 vx4Var) {
        aa7 aa7VarX;
        vx4Var.getClass();
        qs0 qs0Var = this.b;
        sx4 sx4VarM = oc.m(vx4Var, qs0Var);
        if (sx4VarM != null) {
            int i = bl1.a;
            if (!bl1.l(sx4VarM, us0.Z)) {
                sx4VarM = null;
            }
            if (sx4VarM != null && (aa7VarX = sx4VarM.X()) != null) {
                return aa7VarX;
            }
        }
        String string = qs0Var.toString();
        String str = this.c.X;
        str.getClass();
        return u32.c(s32.ERROR_ENUM_TYPE, string, str);
    }

    @Override // defpackage.s21
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
