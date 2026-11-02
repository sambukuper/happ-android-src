package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cy4 implements ow3 {
    public static final cy4 a = new cy4();
    public static final g44 b = x97.P(w74.X, new dw4((byte) 8));

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        lc1 lc1Var = (lc1) obj;
        lc1Var.getClass();
        e37 e37VarD = d();
        ol7 ol7VarA = ol7Var.a(e37VarD);
        ol7VarA.l(0, lc1Var.b, a.d());
        ol7VarA.v(e37VarD);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37VarD = d();
        f01 f01VarT = rd1Var.t(e37VarD);
        boolean z = false;
        int iR = 0;
        while (true) {
            cy4 cy4Var = a;
            int iE = f01VarT.e(cy4Var.d());
            if (iE == -1) {
                f01VarT.n(e37VarD);
                if (z) {
                    return new lc1(iR);
                }
                throw new cw4("months", d().a());
            }
            if (iE != 0) {
                ci8.O(iE);
                throw null;
            }
            iR = f01VarT.r(cy4Var.d(), 0);
            z = true;
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return (e37) b.getValue();
    }
}
