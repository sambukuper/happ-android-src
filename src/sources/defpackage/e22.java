package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e22 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ f22 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e22(f22 f22Var, byte b) {
        super(1);
        this.Y = b;
        this.Z = f22Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ta2 ta2Var;
        ta2 ta2Var2;
        byte b = this.Y;
        r12 r12Var = r12.Z;
        r12 r12Var2 = r12.Y;
        r12 r12Var3 = r12.X;
        f22 f22Var = this.Z;
        switch (b) {
            case 0:
                wd8 wd8Var = (wd8) obj;
                boolean zB = wd8Var.b(r12Var3, r12Var2);
                Object obj2 = null;
                if (zB) {
                    fp0 fp0Var = f22Var.v0.a.c;
                    if (fp0Var != null) {
                        obj2 = fp0Var.c;
                    }
                } else if (wd8Var.b(r12Var2, r12Var)) {
                    fp0 fp0Var2 = f22Var.w0.a.c;
                    if (fp0Var2 != null) {
                        obj2 = fp0Var2.c;
                    }
                } else {
                    obj2 = b22.e;
                }
                return obj2 == null ? b22.e : obj2;
            default:
                wd8 wd8Var2 = (wd8) obj;
                if (wd8Var2.b(r12Var3, r12Var2)) {
                    eb7 eb7Var = f22Var.v0.a.b;
                    return (eb7Var == null || (ta2Var2 = eb7Var.b) == null) ? b22.d : ta2Var2;
                }
                if (!wd8Var2.b(r12Var2, r12Var)) {
                    return b22.d;
                }
                eb7 eb7Var2 = f22Var.w0.a.b;
                return (eb7Var2 == null || (ta2Var = eb7Var2.b) == null) ? b22.d : ta2Var;
        }
    }
}
