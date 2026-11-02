package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {
    public static final de1 a = new de1();

    public final void a(lr lrVar, lp2 lp2Var, int i) {
        lp2Var.X(1565826668);
        int i2 = (lp2Var.f(lrVar) ? 4 : 2) | i;
        byte b = 1;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            jm4.c((dn2) lrVar.Y, (vn1) lrVar.Z, jm4.U(1163527043, new sb(lrVar, b), lp2Var), lp2Var, 384);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 5, i, this, lrVar);
        }
    }
}
