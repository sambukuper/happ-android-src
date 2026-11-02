package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jj7 extends lj7 {
    public transient g33 Z;

    public jj7() {
        super(0, String.class);
        this.Z = px5.f;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        Class<?> cls = obj.getClass();
        g33 g33Var = this.Z;
        ar3 ar3VarR = g33Var.R(cls);
        if (ar3VarR == null) {
            if (cls == Object.class) {
                ar3VarR = new ij7(8, cls);
                this.Z = g33Var.J(cls, ar3VarR);
            } else {
                ar3VarR = t37Var.k(t37Var.X.c(cls), null);
                g33 g33VarJ = g33Var.J(cls, ar3VarR);
                if (g33Var != g33VarJ) {
                    this.Z = g33VarJ;
                }
            }
        }
        ar3VarR.e(obj, ro3Var, t37Var);
    }
}
