package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb5 extends ld2 {
    public static final mb5 d = new mb5(0, 2, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        gp2 gp2Var = (gp2) xr0Var.i(0);
        Object objI = xr0Var.i(1);
        if (objI instanceof pp2) {
            pp2 pp2Var = (pp2) objI;
            ((c15) p91Var.e).b(pp2Var);
            ((t05) p91Var.d).a(pp2Var);
        }
        if (bc7Var.n != 0) {
            d01.a("Can only append a slot if not current inserting");
        }
        int i = bc7Var.i;
        int i2 = bc7Var.j;
        int iC = bc7Var.c(gp2Var);
        int iF = bc7Var.f(bc7Var.b, bc7Var.q(iC + 1));
        bc7Var.i = iF;
        bc7Var.j = iF;
        bc7Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        bc7Var.c[iF] = objI;
        bc7Var.i = i;
        bc7Var.j = i2;
    }
}
