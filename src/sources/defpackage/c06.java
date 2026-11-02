package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c06 extends wb4 {
    public final fy5 e;
    public final c06 f;
    public final qs0 g;
    public final ey5 h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(fy5 fy5Var, w15 w15Var, ux4 ux4Var, ke7 ke7Var, c06 c06Var) {
        super(w15Var, ux4Var, ke7Var, (byte) 1);
        fy5Var.getClass();
        w15Var.getClass();
        this.e = fy5Var;
        this.f = c06Var;
        this.g = u70.L(w15Var, fy5Var.g0);
        ey5 ey5Var = (ey5) md2.f.e(fy5Var.f0);
        this.h = ey5Var == null ? ey5.CLASS : ey5Var;
        this.i = md2.g.e(fy5Var.f0).booleanValue();
        md2.h.getClass();
    }

    @Override // defpackage.wb4
    public final fk2 c() {
        return this.g.a();
    }
}
