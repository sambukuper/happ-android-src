package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y74 implements t09 {
    public dn2 a;
    public rh5 b;
    public final rh5 c = z51.H(Boolean.FALSE);

    public final long a() {
        xi1 xi1Var;
        rh5 rh5VarH = this.b;
        if (rh5VarH == null) {
            dn2 dn2Var = this.a;
            if (dn2Var == null || (xi1Var = (xi1) dn2Var.invoke()) == null) {
                xi1Var = xi1.c;
            }
            rh5VarH = z51.H(xi1Var);
            this.b = rh5VarH;
            this.a = null;
        }
        return ((xi1) rh5VarH.getValue()).a;
    }
}
