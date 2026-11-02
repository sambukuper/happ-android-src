package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fj8 extends ar3 implements p51 {
    public final ri8 X;
    public final ar3 Y;

    public fj8(ri8 ri8Var, ar3 ar3Var) {
        this.X = ri8Var;
        this.Y = ar3Var;
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3Var = this.Y;
        ar3 ar3VarV = ar3Var instanceof p51 ? t37Var.v(ar3Var, d50Var) : ar3Var;
        return ar3VarV == ar3Var ? this : new fj8(this.X, ar3VarV);
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        this.Y.f(obj, ro3Var, t37Var, this.X);
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        this.Y.f(obj, ro3Var, t37Var, ri8Var);
    }
}
