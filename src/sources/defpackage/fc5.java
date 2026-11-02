package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fc5 extends ld2 {
    public static final fc5 d = new fc5(0, 1, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        j86 j86Var = (j86) xr0Var.i(0);
        Set set = (Set) p91Var.a;
        if (set == null) {
            return;
        }
        nj5 nj5Var = new nj5(set);
        s05 s05Var = (s05) p91Var.i;
        if (s05Var == null) {
            long[] jArr = uw6.a;
            s05Var = new s05();
            p91Var.i = s05Var;
        }
        s05Var.l(j86Var, nj5Var);
        ((c15) p91Var.e).b(new pp2(nj5Var, -1));
    }
}
