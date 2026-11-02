package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ws4 implements dn2 {
    public final ys4 X;
    public final boolean Y;
    public final cz5 Z;

    public ws4(ys4 ys4Var, boolean z, cz5 cz5Var) {
        this.X = ys4Var;
        this.Y = z;
        this.Z = cz5Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        List listY0;
        ys4 ys4Var = this.X;
        jl1 jl1Var = ys4Var.a;
        wb4 wb4VarA = ys4Var.a((ed1) jl1Var.Z);
        if (wb4VarA != null) {
            hl1 hl1Var = (hl1) jl1Var.X;
            boolean z = this.Y;
            cz5 cz5Var = this.Z;
            listY0 = z ? wv0.Y0(hl1Var.e.r(wb4VarA, cz5Var)) : wv0.Y0(hl1Var.e.l(wb4VarA, cz5Var));
        } else {
            listY0 = null;
        }
        return listY0 == null ? d02.X : listY0;
    }
}
