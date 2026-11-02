package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pc5 extends ld2 {
    public static final pc5 d = new pc5(1, 0, 2);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        int iH = xr0Var.h(0);
        int i = bc7Var.v;
        int iM = bc7Var.M(bc7Var.b, bc7Var.q(i));
        int iF = bc7Var.f(bc7Var.b, bc7Var.q(i + 1));
        for (int iMax = Math.max(iM, iF - iH); iMax < iF; iMax++) {
            Object obj = bc7Var.c[bc7Var.g(iMax)];
            if (obj instanceof pp2) {
                p91Var.f((pp2) obj);
            } else if (obj instanceof j86) {
                ((j86) obj).c();
            }
        }
        if (iH <= 0) {
            d01.a("Check failed");
        }
        int i2 = bc7Var.v;
        int iM2 = bc7Var.M(bc7Var.b, bc7Var.q(i2));
        int iF2 = bc7Var.f(bc7Var.b, bc7Var.q(i2 + 1)) - iH;
        if (iF2 < iM2) {
            d01.a("Check failed");
        }
        bc7Var.I(iF2, iH, i2);
        int i3 = bc7Var.i;
        if (i3 >= iM2) {
            bc7Var.i = i3 - iH;
        }
    }
}
