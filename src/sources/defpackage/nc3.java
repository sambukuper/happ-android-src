package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nc3 {
    public final c15 a = new c15(0, new lc3[16]);
    public final rh5 b = z51.H(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final rh5 d = z51.H(Boolean.TRUE);

    public final void a(int i, lp2 lp2Var) {
        lp2Var.X(-318043801);
        int i2 = (lp2Var.h(this) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = lp2Var.K();
            q51 q51Var = null;
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = z51.H(null);
                lp2Var.g0(objK);
            }
            y05 y05Var = (y05) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                lp2Var.W(-144841960);
                boolean zH = lp2Var.h(this);
                Object objK2 = lp2Var.K();
                if (zH || objK2 == beVar) {
                    objK2 = new wu1(y05Var, this, q51Var, (byte) 3);
                    lp2Var.g0(objK2);
                }
                u70.h((rn2) objK2, lp2Var, this);
                lp2Var.p(false);
            } else {
                lp2Var.W(-143455237);
                lp2Var.p(false);
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new b1(this, i, (byte) 10);
        }
    }
}
