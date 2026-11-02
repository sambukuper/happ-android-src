package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bc5 extends ld2 {
    public static final bc5 d = new bc5(0, 3, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        zz2 zz2Var;
        yb7 yb7Var = (yb7) xr0Var.i(1);
        gp2 gp2Var = (gp2) xr0Var.i(0);
        ad2 ad2Var = (ad2) xr0Var.i(2);
        bc7 bc7VarE = yb7Var.e();
        if (vc5Var != null) {
            try {
                zz2Var = new zz2(vc5Var, bc7Var, (byte) 19);
            } catch (Throwable th) {
                bc7VarE.e(false);
                throw th;
            }
        } else {
            zz2Var = null;
        }
        if (!ad2Var.m0.a0()) {
            d01.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        ad2Var.l0.Z(rsVar, bc7VarE, p91Var, zz2Var);
        bc7VarE.e(true);
        bc7Var.d();
        gp2Var.getClass();
        bc7Var.z(yb7Var, yb7Var.a(gp2Var));
        bc7Var.j();
    }
}
