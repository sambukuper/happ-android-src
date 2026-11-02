package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jm3 extends gm3 {
    public final rm3 g0;
    public final km3 h0;
    public final jr0 i0;
    public final Object j0;

    public jm3(rm3 rm3Var, km3 km3Var, jr0 jr0Var, Object obj) {
        this.g0 = rm3Var;
        this.h0 = km3Var;
        this.i0 = jr0Var;
        this.j0 = obj;
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return false;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        jr0 jr0Var = this.i0;
        jr0 jr0VarZ = rm3.Z(jr0Var);
        rm3 rm3Var = this.g0;
        km3 km3Var = this.h0;
        Object obj = this.j0;
        if (jr0VarZ == null || !rm3Var.k0(km3Var, jr0VarZ, obj)) {
            km3Var.X.c(new hb4(2), 2);
            jr0 jr0VarZ2 = rm3.Z(jr0Var);
            if (jr0VarZ2 == null || !rm3Var.k0(km3Var, jr0VarZ2, obj)) {
                rm3Var.d(rm3Var.F(km3Var, obj));
            }
        }
    }
}
