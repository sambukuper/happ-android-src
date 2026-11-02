package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v12 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ g22 Z;
    public final /* synthetic */ h62 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v12(g22 g22Var, h62 h62Var, byte b) {
        super(1);
        this.Y = b;
        this.Z = g22Var;
        this.f0 = h62Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ta2 ta2Var;
        ta2 ta2Var2;
        ta2 ta2Var3;
        ta2 ta2Var4;
        byte b = this.Y;
        h62 h62Var = this.f0;
        r12 r12Var = r12.Z;
        g22 g22Var = this.Z;
        r12 r12Var2 = r12.Y;
        r12 r12Var3 = r12.X;
        switch (b) {
            case 0:
                wd8 wd8Var = (wd8) obj;
                if (wd8Var.b(r12Var3, r12Var2)) {
                    u72 u72Var = g22Var.a.a;
                    return (u72Var == null || (ta2Var2 = u72Var.b) == null) ? b22.b : ta2Var2;
                }
                if (!wd8Var.b(r12Var2, r12Var)) {
                    return b22.b;
                }
                u72 u72Var2 = h62Var.a.a;
                return (u72Var2 == null || (ta2Var = u72Var2.b) == null) ? b22.b : ta2Var;
            default:
                wd8 wd8Var2 = (wd8) obj;
                if (wd8Var2.b(r12Var3, r12Var2)) {
                    qw6 qw6Var = g22Var.a.d;
                    return (qw6Var == null || (ta2Var4 = qw6Var.c) == null) ? b22.b : ta2Var4;
                }
                if (!wd8Var2.b(r12Var2, r12Var)) {
                    return b22.b;
                }
                qw6 qw6Var2 = h62Var.a.d;
                return (qw6Var2 == null || (ta2Var3 = qw6Var2.c) == null) ? b22.b : ta2Var3;
        }
    }
}
