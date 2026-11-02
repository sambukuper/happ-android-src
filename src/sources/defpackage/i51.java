package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i51 {
    public final vd7 a = new vd7();

    public static void b(i51 i51Var, rn2 rn2Var, zy0 zy0Var, dn2 dn2Var, int i) {
        if ((i & 8) != 0) {
            zy0Var = null;
        }
        i51Var.a.add(new zy0(-1789283891, true, new h64(rn2Var, i51Var, zy0Var, dn2Var)));
    }

    public final void a(h51 h51Var, lp2 lp2Var, int i) {
        lp2Var.X(-798501095);
        byte b = 4;
        int i2 = (lp2Var.f(h51Var) ? 4 : 2) | i | (lp2Var.f(this) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            vd7 vd7Var = this.a;
            int size = vd7Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((sn2) vd7Var.get(i3)).x(h51Var, lp2Var, Integer.valueOf(i2 & 14));
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9(b, i, this, h51Var);
        }
    }
}
