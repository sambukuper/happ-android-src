package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o22 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ p22 Y;

    public /* synthetic */ o22(p22 p22Var, byte b) {
        this.X = b;
        this.Y = p22Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        x45 x45Var = x45.h0;
        p22 p22Var = this.Y;
        switch (b) {
            case 0:
                v15 v15Var = (v15) obj;
                if (v15Var != null) {
                    return p22Var.j(v15Var, p22Var.i().b(v15Var, x45Var));
                }
                p22.h(8);
                throw null;
            default:
                v15 v15Var2 = (v15) obj;
                if (v15Var2 != null) {
                    return p22Var.j(v15Var2, p22Var.i().f(v15Var2, x45Var));
                }
                p22.h(4);
                throw null;
        }
    }
}
