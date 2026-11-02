package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rb5 extends ld2 {
    public static final rb5 d = new rb5(0, 2, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        int i;
        mf3 mf3Var = (mf3) xr0Var.i(0);
        int iC = bc7Var.c((gp2) xr0Var.i(1));
        if (bc7Var.t >= iC) {
            d01.a("Check failed");
        }
        u15.K(bc7Var, rsVar, iC);
        int i2 = bc7Var.t;
        int iD = bc7Var.v;
        while (iD >= 0 && !bc7Var.x(iD)) {
            iD = bc7Var.D(bc7Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (bc7Var.u(i2, iT)) {
                if (bc7Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += bc7Var.x(iT) ? 1 : bc7Var.b[(bc7Var.q(iT) * 5) + 1] & 67108863;
                iT += bc7Var.t(iT);
            }
        }
        while (true) {
            i = bc7Var.t;
            if (i >= iC) {
                break;
            }
            if (bc7Var.u(iC, i)) {
                int i3 = bc7Var.t;
                if (i3 < bc7Var.u && (bc7Var.b[(bc7Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    rsVar.h(bc7Var.C(bc7Var.t));
                    iK = 0;
                }
                bc7Var.O();
            } else {
                iK += bc7Var.K();
            }
        }
        if (i != iC) {
            d01.a("Check failed");
        }
        mf3Var.a = iK;
    }
}
