package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw0 {
    public static final tw0 a = new tw0(ht.c, pz2.q0);

    public static final tw0 a(gt gtVar, n50 n50Var, lp2 lp2Var, int i) {
        if (gtVar.equals(ht.c) && n50Var.equals(pz2.q0)) {
            lp2Var.W(-1446604504);
            lp2Var.p(false);
            return a;
        }
        lp2Var.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && lp2Var.f(gtVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !lp2Var.f(n50Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = lp2Var.K();
        if (z3 || objK == zz0.a) {
            objK = new tw0(gtVar, n50Var);
            lp2Var.g0(objK);
        }
        tw0 tw0Var = (tw0) objK;
        lp2Var.p(false);
        return tw0Var;
    }
}
