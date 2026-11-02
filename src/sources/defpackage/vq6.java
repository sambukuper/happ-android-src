package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq6 {
    public static final wq6 a = new wq6(ht.a, pz2.n0);

    public static final wq6 a(et etVar, o50 o50Var, lp2 lp2Var, int i) {
        if (etVar.equals(ht.a) && dh3.f(o50Var, pz2.n0)) {
            lp2Var.W(-1073830487);
            lp2Var.p(false);
            return a;
        }
        lp2Var.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && lp2Var.f(etVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !lp2Var.f(o50Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = lp2Var.K();
        if (z3 || objK == zz0.a) {
            objK = new wq6(etVar, o50Var);
            lp2Var.g0(objK);
        }
        wq6 wq6Var = (wq6) objK;
        lp2Var.p(false);
        return wq6Var;
    }
}
